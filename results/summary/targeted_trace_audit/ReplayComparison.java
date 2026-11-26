// Replays a deterministic counterexample against the saved comparison harness.
import fuzztests.FuzzTest;
import buggyasrts.mut_000.ArrayList;
public class ReplayComparison {
 public static void main(String[] args) throws Exception {
  java.lang.reflect.Method seed = FuzzTest.class.getDeclaredMethod("seedStructure", Object.class, String.class);
  seed.setAccessible(true);
  ArrayList<Integer> probe = new ArrayList<>();
  seed.invoke(null, probe, "seed");
  int n = probe.size();
  java.util.ArrayList<Integer> c = new java.util.ArrayList<>();
  for (int i = 0; i < n; i++) c.add(i);
  System.out.println("seeded post-state size=" + n + ", c.size=" + c.size());
  System.out.println("Candidate: size==c.size -> true; GT: size==c.size+1 -> false");
  try {
   new FuzzTest().FuzzTest_ArrayList(new ArrayList<Integer>(), new ArrayList<Integer>(), c);
  } catch (RuntimeException error) {
   System.out.println("CONFIRMED counterexample in existing comparison harness: " + error);
   return;
  }
  throw new AssertionError("Expected comparison harness to detect this counterexample");
 }
}
