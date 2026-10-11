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
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue12 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest9.FuzzTest_toArray(intQueue12, intQueue16, intArray20);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue29 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest22.FuzzTest_toArray(intQueue25, intQueue29, intArray33);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue7, intQueue16, intArray33);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 1, 1, 1, 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue12 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest9.FuzzTest_toArray(intQueue12, intQueue16, intArray20);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue29 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest22.FuzzTest_toArray(intQueue25, intQueue29, intArray33);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue7, intQueue16, intArray33);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest0.FuzzTest_toArray(intQueue3, intQueue7, intArray11);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest13.FuzzTest_toArray(intQueue16, intQueue20, intArray24);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue26 = null;
        java.lang.Integer[] intArray27 = null;
        fuzzTest0.FuzzTest_toArray(intQueue20, intQueue26, intArray27);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest29.FuzzTest_toArray(intQueue32, intQueue36, intArray40);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue49 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest42.FuzzTest_toArray(intQueue45, intQueue49, intArray53);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = null;
        java.lang.Integer[] intArray56 = null;
        fuzzTest29.FuzzTest_toArray(intQueue49, intQueue55, intArray56);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = null;
        java.lang.Integer[] intArray59 = null;
        fuzzTest0.FuzzTest_toArray(intQueue49, intQueue58, intArray59);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue64 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue68 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest61.FuzzTest_toArray(intQueue64, intQueue68, intArray72);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1), (-1), 1, 100, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue80 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue85 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue89 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue89, intArray88);
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest82.FuzzTest_toArray(intQueue85, intQueue89, intArray93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue68, intQueue80, intArray93);
    }
}

