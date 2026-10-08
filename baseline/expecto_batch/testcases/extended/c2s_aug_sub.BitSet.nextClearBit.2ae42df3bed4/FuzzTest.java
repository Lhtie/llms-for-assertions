package fuzztests;
import java.util.*;
import java.util.function.Supplier;
import c2s_aug_sub.BitSet;
public class FuzzTest {

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

 static BitSet make(int s) { BitSet x=new BitSet();for(int i=0;i<16;i++)if(((s>>>i)&1)!=0)x.set(i);return x; }

 static long valid=0,errors=0,mismatches=0;
 static {Runtime.getRuntime().addShutdownHook(new Thread(() -> {try {
 java.nio.file.Files.writeString(java.nio.file.Path.of(System.getProperty("expecto.counts")),
 "{\"valid\":"+valid+",\"errors\":"+errors+",\"mismatches\":"+mismatches+"}");
 }catch(Exception e){}}));}
 public void check(BitSet fuzzobj_old,BitSet fuzzobj_new,int fromIndex,int New_Ret) {
  try {
   boolean a=(!(fromIndex>=0) || (java.util.stream.IntStream.rangeClosed(fromIndex,New_Ret - 1).allMatch(i -> (!( i>=fromIndex && i<New_Ret) || (fuzzobj_new.get(i)==true)))));
   emit(a,record("length",fuzzobj_old.length(),"cardinality",fuzzobj_old.cardinality(),"empty",fuzzobj_old.isEmpty(),"bits",sequence(fuzzobj_old.length(),__trace_index -> (fuzzobj_old.get(__trace_index))),"words_low",sequence(fuzzobj_old.toLongArray().length,__trace_index -> (((int)fuzzobj_old.toLongArray()[__trace_index]))),"words_high",sequence(fuzzobj_old.toLongArray().length,__trace_index -> (((int)(fuzzobj_old.toLongArray()[__trace_index] >> 32)))),"bytes",sequence(fuzzobj_old.toByteArray().length,__trace_index -> (((int)fuzzobj_old.toByteArray()[__trace_index]))),"bit_at_fromIndex",(fromIndex >= 0 && fuzzobj_old.get(fromIndex)),"bit_at_result",(New_Ret >= 0 && fuzzobj_old.get(New_Ret))),record("length",fuzzobj_new.length(),"cardinality",fuzzobj_new.cardinality(),"empty",fuzzobj_new.isEmpty(),"bits",sequence(fuzzobj_new.length(),__trace_index -> (fuzzobj_new.get(__trace_index))),"words_low",sequence(fuzzobj_new.toLongArray().length,__trace_index -> (((int)fuzzobj_new.toLongArray()[__trace_index]))),"words_high",sequence(fuzzobj_new.toLongArray().length,__trace_index -> (((int)(fuzzobj_new.toLongArray()[__trace_index] >> 32)))),"bytes",sequence(fuzzobj_new.toByteArray().length,__trace_index -> (((int)fuzzobj_new.toByteArray()[__trace_index]))),"bit_at_fromIndex",(fromIndex >= 0 && fuzzobj_new.get(fromIndex)),"bit_at_result",(New_Ret >= 0 && fuzzobj_new.get(New_Ret))),New_Ret,new Object[]{"fromIndex",fromIndex});
   valid++;
  } catch(Exception problem) { failure(problem); errors++; }
 }

 static java.util.Set<String> seen = new java.util.HashSet<>();
 static int positives=0, negatives=0, failureReports=0;
 static void failure(Exception e) { if(failureReports++<3) e.printStackTrace(); }
 static Object project(java.util.Collection<?> c, boolean nullable) {
  java.util.Map<String,Object> m = new java.util.LinkedHashMap<>();
  if(nullable) m.put("is_null", c==null);
  m.put("size", c==null?0:c.size());
  m.put("empty", c==null || c.isEmpty());
  m.put("elements", c==null?new Object[0]:c.toArray());
  return m;
 }
 static Object arrayProject(Object[] a) {
  java.util.Map<String,Object> m=new java.util.LinkedHashMap<>();
  m.put("is_null",a==null); m.put("elements",a==null?new Object[0]:a); return m;
 }
 @SuppressWarnings("unchecked")
 static Object cloneProject(java.util.Collection<?> r, Object receiver) {
  java.util.Map<String,Object> m=(java.util.Map<String,Object>)project(r,true);
  m.put("same_receiver",r==receiver); return m;
 }
 static String json(Object o) {
  if(o==null) return "null";
  if(o instanceof Boolean || o instanceof Integer) return o.toString();
  if(o instanceof String) return "\""+((String)o).replace("\\","\\\\").replace("\"","\\\"")+"\"";
  if(o instanceof java.util.Map) {
   java.util.List<String> parts=new java.util.ArrayList<>();
   for(Object x:((java.util.Map<?,?>)o).entrySet()) {
    java.util.Map.Entry<?,?> e=(java.util.Map.Entry<?,?>)x;
    parts.add(json(e.getKey())+":"+json(e.getValue()));
   }
   return "{"+String.join(",",parts)+"}";
  }
  if(o instanceof Object[]) {
   java.util.List<String> parts=new java.util.ArrayList<>();
   for(Object x:(Object[])o) parts.add(json(x));
   return "["+String.join(",",parts)+"]";
  }
  throw new IllegalArgumentException("Outside Integer domain");
 }
 static void emit(boolean label, Object entrySelf, Object exitSelf, Object ret, Object[] params) throws Exception {
  java.util.Map<String,Object> p=new java.util.LinkedHashMap<>();
  for(int i=0;i<params.length;i+=2) p.put((String)params[i],params[i+1]);
  java.util.Map<String,Object> entry=new java.util.LinkedHashMap<>(), exit=new java.util.LinkedHashMap<>();
  entry.put("params",p); entry.put("self",entrySelf);
  exit.put("self",exitSelf); exit.put("ret",ret);
  java.util.Map<String,Object> trace=new java.util.LinkedHashMap<>();
  trace.put("entry",entry); trace.put("exit",exit);
  String body=json(trace);
  if((label?positives:negatives)>=2000 || !seen.add(body)) return;
  if(label) positives++; else negatives++;
  String line="{\"label\":"+label+",\"trace\":"+body+"}\n";
  java.nio.file.Files.writeString(java.nio.file.Path.of(System.getProperty("expecto.cases")),line,
    java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.APPEND);
 }

 static int tcNumber(int selector,int size) {
  int[] values={-2,-1,0,1,size-1,size,size+1,16};
  return values[Math.floorMod(selector,values.length)];
 }

 static Object record(Object... fields) {
  java.util.Map<String,Object> result=new java.util.LinkedHashMap<>();
  for(int i=0;i<fields.length;i+=2)result.put((String)fields[i],fields[i+1]);
  return result;
 }
 static Object[] sequence(int length, java.util.function.IntFunction<Object> getter) {
  Object[] result=new Object[length];
  for(int i=0;i<length;i++)result[i]=getter.apply(i);
  return result;
 }
 static Boolean eval(Supplier<Boolean> s){try{return s.get();}catch(Exception e){return null;}}
 public static void probe(int a,int b,int c,int d) {
  BitSet oldState=make(a), newState=((d&15)==0?oldState:make(b));
  new FuzzTest().check(oldState,newState,tcNumber(c+0,oldState.length()),tcNumber(d,newState.length()));
 }
 public static void main(String[] args) {
  for(int i=0;i<128;i++){try{probe(i,127-i,i/3,i/5);}catch(IllegalStateException e){
   if(!"EXPECTO_SPEC_MISMATCH".equals(e.getMessage()))throw e;
  }}
 }
}
