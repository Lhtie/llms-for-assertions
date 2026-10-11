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
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue7 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue3, intQueue7, (java.util.Collection<java.lang.Integer>) intList13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue21 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue25 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest18.FuzzTest_CircularFifoQueue(intQueue21, intQueue25, (java.util.Collection<java.lang.Integer>) intList31);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue37 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue41 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest34.FuzzTest_CircularFifoQueue(intQueue37, intQueue41, (java.util.Collection<java.lang.Integer>) intList47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 1, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue54 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue58 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList63 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest34.FuzzTest_CircularFifoQueue(intQueue54, intQueue58, (java.util.Collection<java.lang.Integer>) intList63);
        fuzzTest16.FuzzTest_CircularFifoQueue(intQueue17, intQueue21, (java.util.Collection<java.lang.Integer>) intQueue58);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10, 100, (-1), 0, 1 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue73 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue78 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue82 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList88 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest75.FuzzTest_CircularFifoQueue(intQueue78, intQueue82, (java.util.Collection<java.lang.Integer>) intList88);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue21, intQueue73, (java.util.Collection<java.lang.Integer>) intQueue82);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue7 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue3, intQueue7, (java.util.Collection<java.lang.Integer>) intList13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue20 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue24 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList30 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest17.FuzzTest_CircularFifoQueue(intQueue20, intQueue24, (java.util.Collection<java.lang.Integer>) intList30);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 1, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue37 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue41 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList46 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest17.FuzzTest_CircularFifoQueue(intQueue37, intQueue41, (java.util.Collection<java.lang.Integer>) intList46);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue49 = null;
        java.util.Collection<java.lang.Integer> intCollection50 = null;
        fuzzTest16.FuzzTest_CircularFifoQueue(intQueue37, intQueue49, intCollection50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 1, (-1), 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue57 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-1), (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue49, intQueue57, (java.util.Collection<java.lang.Integer>) intList64);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, 1, 0, 1, 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue73 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10, 100, 10, 100, 1 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue81 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue86 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue90 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue90, intArray89);
        java.lang.Integer[] intArray95 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList96 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean97 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList96, intArray95);
        fuzzTest83.FuzzTest_CircularFifoQueue(intQueue86, intQueue90, (java.util.Collection<java.lang.Integer>) intList96);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue73, intQueue81, (java.util.Collection<java.lang.Integer>) intQueue90);
    }
}

