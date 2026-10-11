import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_offer(intQueue15, intQueue19, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue24 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = null;
        fuzzTest12.FuzzTest_offer(intQueue24, intQueue25, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        fuzzTest29.FuzzTest_offer(intQueue32, intQueue36, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = null;
        fuzzTest12.FuzzTest_offer(intQueue32, intQueue41, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        fuzzTest45.FuzzTest_offer(intQueue48, intQueue52, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue57 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = null;
        fuzzTest45.FuzzTest_offer(intQueue57, intQueue58, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue65 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue69 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        fuzzTest62.FuzzTest_offer(intQueue65, intQueue69, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue74 = null;
        fuzzTest45.FuzzTest_offer(intQueue65, intQueue74, (java.lang.Integer) (-1), true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue78 = null;
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue81 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        fuzzTest45.FuzzTest_offer(intQueue78, intQueue81, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 100, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue90 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue90, intArray89);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue92 = null;
        fuzzTest45.FuzzTest_offer(intQueue90, intQueue92, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue32, intQueue90, (java.lang.Integer) 0, false);
    }
}

