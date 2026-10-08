package fuzztests;
import java.util.*;
import buggyasrts.PriorityQueue;
public class FuzzTest {

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

 static Integer element(int x) {
  Integer[] values={null,-1,0,1,2,10,Integer.MIN_VALUE,Integer.MAX_VALUE};
  return values[Math.floorMod(x,values.length)];
 }
 static int number(int x,int size) {
  int[] values={-1,0,1,size-1,size,size+1,Integer.MIN_VALUE,Integer.MAX_VALUE};
  return values[Math.floorMod(x,values.length)];
 }
 static PriorityQueue<Integer> make(int selector) {
  java.util.ArrayList<Integer> values=new java.util.ArrayList<>();
  int length=Math.floorMod(selector,6);
  for(int i=0;i<length;i++) {
   Integer e=element(selector%2==0?selector:selector+i);
   if(e==null && true) e=0;
   values.add(e);
  }
  return new PriorityQueue<>(values);
 }
 public static void probe(int o,int n,int p,int r) {
  try {
   PriorityQueue<Integer> oldState=make(o),newState=make(n);
   new FuzzTest().check(oldState,newState,element(r));
  } catch(Exception problem) { failure(problem); errors++; }
 }

 static long valid=0,errors=0;
 static { Runtime.getRuntime().addShutdownHook(new Thread(() -> {
  try { java.nio.file.Files.writeString(java.nio.file.Path.of(System.getProperty("expecto.counts")),
    "{\"valid\":"+valid+",\"errors\":"+errors+"}"); } catch(Exception e) {}
 })); }
 public void check(PriorityQueue<Integer> fuzzobj_old,PriorityQueue<Integer> fuzzobj_new,Integer New_Ret) {
 if(fuzzobj_old==null || fuzzobj_new==null) return;
 try {
 boolean a=New_Ret==(fuzzobj_old.get(1));
emit(a,project(fuzzobj_old,false),project(fuzzobj_new,false),New_Ret,new Object[]{});
 valid++;
 } catch(Exception problem) { failure(problem); errors++; }
 }
}
