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
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 100, 10, 2, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue8 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue19 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue25 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue34 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest11.FuzzTest_clone(intQueue19, intQueue25, intQueue34);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue37 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_clone(intQueue19, intQueue37, intQueue38);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue48 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue54 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue63 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzzTest40.FuzzTest_clone(intQueue48, intQueue54, intQueue63);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intQueue8, intQueue37, intQueue48);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue8 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue14 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue23 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        fuzzTest0.FuzzTest_clone(intQueue8, intQueue14, intQueue23);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue35 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue41 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue50 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        fuzzTest27.FuzzTest_clone(intQueue35, intQueue41, intQueue50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 0, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue57 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue59 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_clone(intQueue57, intQueue59, intQueue60);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue64 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue66 = null;
        fuzzTest26.FuzzTest_clone(intQueue57, intQueue64, intQueue66);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue78 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue84 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue84, intArray83);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue93 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue93, intArray92);
        fuzzTest70.FuzzTest_clone(intQueue78, intQueue84, intQueue93);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue96 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue97 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_clone(intQueue78, intQueue96, intQueue97);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intQueue57, intQueue68, intQueue96);
    }
}

