"""Assertion lowering and state factories used by TC collection.

This module is used only for labelled TC collection, not equivalence scoring.
The bounded factories below are retained only for labelled TC collection.
"""
import re


def expression(assertion):
    from codehelper.javahelper import closing_paren, find_bounds

    text = re.sub(r'^\s*assert\b\s*', '', assertion).strip().rstrip(';')
    text = re.sub(r'<\s*([EKVT](?:\s*,\s*[EKVT])*)\s*>',
                  lambda m: '<' + ','.join('Integer' for _ in m[1].split(',')) + '>', text)
    while r'\old(' in text:
        start = text.index(r'\old(')
        opening = start + len(r'\old')
        end = closing_paren(text, opening)
        body = re.sub(r'\bthis\b', 'fuzzobj_old', text[opening + 1:end - 1])
        text = text[:start] + '(' + body + ')' + text[end:]
    text = text.replace(r'\result', 'New_Ret')
    text = re.sub(r'\bthis\b', 'fuzzobj_new', text)

    def lower(s):
        s = s.strip()
        depth = 0
        for i, ch in enumerate(s):
            if ch == '(':
                depth += 1
            elif ch == ')':
                depth -= 1
            if depth == 0 and s[i:i+2] == '=>':
                return f'(!({lower(s[:i])}) || ({lower(s[i+2:])}))'
        if s.startswith(r'\forall'):
            decl, guard, body = s.split(';', 2)
            m = re.fullmatch(r'\\forall\s+int\s+(\w+)', decl.strip())
            if not m:
                raise ValueError('Unsupported quantifier declaration')
            var = m[1]
            lo, hi = find_bounds(guard, var)
            if lo == '-65536' or hi == '65536':
                raise ValueError('Quantifier lacks explicit finite bounds')
            return f'java.util.stream.IntStream.rangeClosed({lo},{hi}).allMatch({var} -> (!({guard}) || ({lower(body)})))'
        # A quantified expression can follow a conjunction, e.g. nonnull && forall.
        depth = 0
        for i, ch in enumerate(s):
            if ch == '(':
                depth += 1
            elif ch == ')':
                depth -= 1
            if depth == 0 and s[i:i+2] in {'&&', '||'} and '\\' in s[i+2:]:
                return f'({lower(s[:i])} {s[i:i+2]} {lower(s[i+2:])})'
        # Recurse into parentheses only when they contain remaining JML syntax.
        offset = 0
        while offset < len(s):
            opening = s.find('(', offset)
            if opening < 0:
                break
            end = closing_paren(s, opening)
            body = s[opening+1:end-1]
            if '\\' in body or '=>' in body:
                body = lower(body)
                s = s[:opening+1] + body + s[end-1:]
                offset = opening + len(body) + 2
            else:
                offset = end
        if '\\' in s or ';' in s or '=>' in s:
            raise ValueError('Unsupported assertion syntax: ' + s)
        return s
    return lower(text)


COMMON = r'''
 static Integer atom(int s) { return Math.floorMod(s,7)==0 ? null : Math.floorMod(s,7)-3; }
 static java.util.ArrayList<Integer> values(int s) {
  java.util.ArrayList<Integer> a=new java.util.ArrayList<>();
  for(int i=0;i<Math.floorMod(s,6);i++) a.add(atom(s+i)); return a;
 }
 static String word(int s) { return new String[]{null,"","a","ab","abc","b","é","😀"}[Math.floorMod(s,8)]; }
 static java.util.ArrayList<String> words(int s) {
  java.util.ArrayList<String> a=new java.util.ArrayList<>();
  for(int i=0;i<Math.floorMod(s,6);i++) {String w=word(s+i);if(w!=null)a.add(w);} return a;
 }
 static java.util.Map<Integer,Integer> map(int s) {
  java.util.Map<Integer,Integer> m=new java.util.LinkedHashMap<>();
  for(int i=0;i<Math.floorMod(s,6);i++)m.put(atom(s+i),atom(s+i+1));return m;
 }
 static long[] longs(int s) { long[] a=new long[Math.floorMod(s,4)];
  for(int i=0;i<a.length;i++)a[i]=((long)(s+i)<<32)^((s*2654435761L+i)&0xffffffffL);return a; }
 static byte[] bytes(int s) {byte[] a=new byte[Math.floorMod(s,8)];
  for(int i=0;i<a.length;i++)a[i]=(byte)(s+i);return a;}
'''


def factory(row, adapter):
    cls = row['class_name']
    typ = adapter['java_receiver']
    if cls == 'Trie':
        body = 'Trie x=new Trie();for(String w:words(s))x.add(w);return x;'
    elif cls == 'UnionFind':
        body = ('java.util.Set<Integer> v=new java.util.LinkedHashSet<>(values(s));v.remove(null);'
                'UnionFind<Integer> x=new UnionFind<>(v);'
                'Integer[] a=v.toArray(new Integer[0]);'
                'if(a.length>1 && (s&1)==0)x.union(a[0],a[1]);return x;')
    elif cls == 'DefaultListenableGraph':
        body = ('org.jgrapht.graph.DefaultDirectedGraph<Integer,Integer> g='
                'new org.jgrapht.graph.DefaultDirectedGraph<>(null,null,false);'
                'for(Integer v:values(s))if(v!=null)g.addVertex(v);'
                'Integer[] a=g.vertexSet().toArray(new Integer[0]);'
                'if(a.length>1)g.addEdge(a[0],a[1],Math.floorMod(s,7)-3);'
                'return new DefaultListenableGraph<>(g);')
    elif cls == 'BitSet':
        body = 'BitSet x=new BitSet();for(int i=0;i<16;i++)if(((s>>>i)&1)!=0)x.set(i);return x;'
    elif cls == 'HashMap':
        body = 'HashMap<Integer,Integer> x=new HashMap<>();for(java.util.Map.Entry<Integer,Integer> e:map(s).entrySet())x.put(e.getKey(),e.getValue());return x;'
    elif cls == 'HashSet':
        # The dataset HashMap backing HashSet has null iterator stubs.
        # Expose the known inserted set through iterator; no checks mutate it.
        return COMMON + r'''
 static class SetFixture extends HashSet<Integer> {
  private final java.util.Set<Integer> inserted;
  SetFixture(java.util.Collection<Integer> v){super(v);inserted=new java.util.LinkedHashSet<>(v);}
  public java.util.Iterator<Integer> iterator(){return inserted.iterator();}
 }
 static HashSet<Integer> make(int s){return new SetFixture(values(s));}
'''
    elif cls == 'Stack':
        body = 'Stack<Integer> x=new Stack<>();x.addAll(values(s));return x;'
    else:
        body = f'java.util.ArrayList<Integer> v=values(s);'
        if cls in {'TreeSet', 'PriorityQueue', 'ArrayDeque'}:body += 'v.removeIf(java.util.Objects::isNull);'
        body += f'return new {cls}<Integer>(v);'
    return COMMON + f'\n static {typ} make(int s) {{ {body} }}\n'


def generated_value(ty, seed, receiver):
    if ty == 'int':return f'(Math.floorMod({seed},20)-2)'
    if ty == 'boolean':return f'(({seed}&1)!=0)'
    if ty == 'Integer':return f'atom({seed})'
    if ty == 'String':return f'word({seed})'
    if ty == receiver:return f'make({seed})'
    if ty == 'long[]':return f'longs({seed})'
    if ty == 'byte[]':return f'bytes({seed})'
    if ty == 'Integer[]':return f'values({seed}).toArray(new Integer[0])'
    if ty == 'java.util.Collection<Integer>':return f'values({seed})'
    if ty == 'java.util.Map<Integer,Integer>':return f'map({seed})'
    if ty == 'java.util.List<String>':return f'words({seed})'
    raise ValueError('No factory for ' + ty)


def harness(row, adapter, candidate):
    receiver=adapter['java_receiver']
    parameters=adapter['java_parameters']
    ret=adapter['java_return']
    args=[receiver+' fuzzobj_old',receiver+' fuzzobj_new']+[p['type']+' '+p['name'] for p in parameters]
    if ret:args.append(ret+' New_Ret')
    probe=['new FuzzTest().check(oldState,newState']
    for i,p in enumerate(parameters):probe.append(','+generated_value(p['type'],f'(c+{i})',receiver))
    if ret:
        value=generated_value(ret,'d',receiver)
        if ret==receiver:value=f'((d&7)==0 ? null : (d&7)==1 ? oldState : (d&7)==2 ? newState : {value})'
        probe.append(','+value)
    probe.append(');')
    return f'''package fuzztests;
import java.util.*;
import java.util.function.Supplier;
import {row['package']}.{row['class_name']};
public class FuzzTest {{
{factory(row,adapter)}
 static long valid=0,errors=0,mismatches=0;
 static {{Runtime.getRuntime().addShutdownHook(new Thread(() -> {{try {{
 java.nio.file.Files.writeString(java.nio.file.Path.of(System.getProperty("expecto.counts")),
 "{{\\"valid\\":"+valid+",\\"errors\\":"+errors+",\\"mismatches\\":"+mismatches+"}}");
 }}catch(Exception e){{}}}}));}}
 public void check({','.join(args)}) {{
  Boolean a=eval(() -> ({expression(candidate)}));
  Boolean b=eval(() -> ({expression(row['ground_truth'])}));
  if(a==null || b==null){{errors++;return;}}
  valid++;if(!a.equals(b)){{mismatches++;throw new IllegalStateException("EXPECTO_SPEC_MISMATCH");}}
 }}
 static Boolean eval(Supplier<Boolean> s){{try{{return s.get();}}catch(Exception e){{return null;}}}}
 public static void probe(int a,int b,int c,int d) {{
  {receiver} oldState=make(a), newState=((d&15)==0?oldState:make(b));
  {''.join(probe)}
 }}
 public static void main(String[] args) {{
  for(int i=0;i<128;i++){{try{{probe(i,127-i,i/3,i/5);}}catch(IllegalStateException e){{
   if(!"EXPECTO_SPEC_MISMATCH".equals(e.getMessage()))throw e;
  }}}}
 }}
}}
'''

