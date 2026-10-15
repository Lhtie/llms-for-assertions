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
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue8, intQueue14, intArray22);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 10, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue10 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 10, 0 };
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue5, intQueue10, intArray15);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, (-1), 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue11 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10, 0, 10, (-1), 0, 0 };
        fuzzTest0.FuzzTest_toArray(intQueue5, intQueue11, intArray19);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 0, 1, 10, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue29 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1), 0 };
        fuzzTest0.FuzzTest_toArray(intQueue27, intQueue29, intArray32);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue36 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 10, (-1), 10, 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue45 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, (-1), 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue52 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue58 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10, 0, 10, (-1), 0, 0 };
        fuzzTest47.FuzzTest_toArray(intQueue52, intQueue58, intArray66);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue36, intQueue45, intArray66);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, (-1), 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue6 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue12 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10, 0, 10, (-1), 0, 0 };
        fuzzTest1.FuzzTest_toArray(intQueue6, intQueue12, intArray20);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10, 0, 1, 10, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue28 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue30 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-1), 0 };
        fuzzTest1.FuzzTest_toArray(intQueue28, intQueue30, intArray33);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, (-1), 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue46 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10, 0, 10, (-1), 0, 0 };
        fuzzTest35.FuzzTest_toArray(intQueue40, intQueue46, intArray54);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10, 0, 1, 10, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue62 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue64 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { (-1), 0 };
        fuzzTest35.FuzzTest_toArray(intQueue62, intQueue64, intArray67);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue70 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 100, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue75 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 100, 0, 100, 100 };
        fuzzTest69.FuzzTest_toArray(intQueue70, intQueue75, intArray82);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue30, intQueue62, intArray82);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, (-1), 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue10 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue16 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10, 0, 10, (-1), 0, 0 };
        fuzzTest5.FuzzTest_toArray(intQueue10, intQueue16, intArray24);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue28 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, (-1), 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue36 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10, 0, 10, (-1), 0, 0 };
        fuzzTest31.FuzzTest_toArray(intQueue36, intQueue42, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue55 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 0, 2, 2, 1, (-1), 100 };
        fuzzTest30.FuzzTest_toArray(intQueue36, intQueue55, intArray63);
        fuzzTest27.FuzzTest_toArray(intQueue28, intQueue29, intArray63);
        java.lang.Integer[] intArray66 = null;
        fuzzTest5.FuzzTest_toArray(intQueue26, intQueue28, intArray66);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0 };
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue3, intQueue28, intArray69);
    }
}

