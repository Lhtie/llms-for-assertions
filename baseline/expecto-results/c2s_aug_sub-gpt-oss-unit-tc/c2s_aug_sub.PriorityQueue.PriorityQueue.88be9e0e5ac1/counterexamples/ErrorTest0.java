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
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue1, intQueue2, (java.util.Collection<java.lang.Integer>) intList7);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest11.FuzzTest_PriorityQueue(intQueue19, intQueue25, (java.util.Collection<java.lang.Integer>) intList34);
        java.util.Collection<java.lang.Integer> intCollection37 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue10, intQueue19, intCollection37);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue39 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 0, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_PriorityQueue(intQueue42, intQueue43, (java.util.Collection<java.lang.Integer>) intList48);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue59 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList74 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest51.FuzzTest_PriorityQueue(intQueue59, intQueue65, (java.util.Collection<java.lang.Integer>) intList74);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue78 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_PriorityQueue(intQueue77, intQueue78, (java.util.Collection<java.lang.Integer>) intQueue79);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue81 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection82 = null;
        fuzzTest41.FuzzTest_PriorityQueue(intQueue78, intQueue81, intCollection82);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue39, intQueue40, (java.util.Collection<java.lang.Integer>) intQueue81);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue8, intQueue14, (java.util.Collection<java.lang.Integer>) intList23);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue28 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_PriorityQueue(intQueue27, intQueue28, (java.util.Collection<java.lang.Integer>) intList33);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue45 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList60 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest37.FuzzTest_PriorityQueue(intQueue45, intQueue51, (java.util.Collection<java.lang.Integer>) intList60);
        java.util.Collection<java.lang.Integer> intCollection63 = null;
        fuzzTest26.FuzzTest_PriorityQueue(intQueue36, intQueue45, intCollection63);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue74 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue80 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList89 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        fuzzTest66.FuzzTest_PriorityQueue(intQueue74, intQueue80, (java.util.Collection<java.lang.Integer>) intList89);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue92 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue93 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue94 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_PriorityQueue(intQueue92, intQueue93, (java.util.Collection<java.lang.Integer>) intQueue94);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue36, intQueue65, (java.util.Collection<java.lang.Integer>) intQueue93);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 0, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_PriorityQueue(intQueue3, intQueue4, (java.util.Collection<java.lang.Integer>) intList9);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue21 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList36 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest13.FuzzTest_PriorityQueue(intQueue21, intQueue27, (java.util.Collection<java.lang.Integer>) intList36);
        java.util.Collection<java.lang.Integer> intCollection39 = null;
        fuzzTest2.FuzzTest_PriorityQueue(intQueue12, intQueue21, intCollection39);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue46 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_PriorityQueue(intQueue46, intQueue47, (java.util.Collection<java.lang.Integer>) intList52);
        java.util.Collection<java.lang.Integer> intCollection55 = null;
        fuzzTest2.FuzzTest_PriorityQueue(intQueue43, intQueue46, intCollection55);
        java.util.Collection<java.lang.Integer> intCollection57 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue1, intQueue43, intCollection57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-1), 0, 100, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue64 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue75 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue81 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList90 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        fuzzTest67.FuzzTest_PriorityQueue(intQueue75, intQueue81, (java.util.Collection<java.lang.Integer>) intList90);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue93 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue94 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue95 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_PriorityQueue(intQueue93, intQueue94, (java.util.Collection<java.lang.Integer>) intQueue95);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue64, intQueue66, (java.util.Collection<java.lang.Integer>) intQueue94);
    }
}

