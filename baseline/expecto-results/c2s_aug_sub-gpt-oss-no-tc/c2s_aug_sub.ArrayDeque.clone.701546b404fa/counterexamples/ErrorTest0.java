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
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue3 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue7 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue13 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        fuzzTest0.FuzzTest_clone(intQueue3, intQueue7, intQueue13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue19 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue23 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue29 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        fuzzTest16.FuzzTest_clone(intQueue19, intQueue23, intQueue29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue35 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue39 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue45 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        fuzzTest32.FuzzTest_clone(intQueue35, intQueue39, intQueue45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue51 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue55 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue61 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        fuzzTest48.FuzzTest_clone(intQueue51, intQueue55, intQueue61);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue64 = null;
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue67 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        fuzzTest32.FuzzTest_clone(intQueue55, intQueue64, intQueue67);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue73 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue77 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue83 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        fuzzTest70.FuzzTest_clone(intQueue73, intQueue77, intQueue83);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intQueue29, intQueue55, intQueue77);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue3 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue7 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue13 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        fuzzTest0.FuzzTest_clone(intQueue3, intQueue7, intQueue13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue19 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue23 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue29 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        fuzzTest16.FuzzTest_clone(intQueue19, intQueue23, intQueue29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue35 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue39 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue45 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        fuzzTest32.FuzzTest_clone(intQueue35, intQueue39, intQueue45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue51 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue55 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue61 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        fuzzTest48.FuzzTest_clone(intQueue51, intQueue55, intQueue61);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intQueue29, intQueue39, intQueue55);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 0, (-1), 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue6 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue12 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue16 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue22 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        fuzzTest9.FuzzTest_clone(intQueue12, intQueue16, intQueue22);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue28 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue32 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue38 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        fuzzTest25.FuzzTest_clone(intQueue28, intQueue32, intQueue38);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue41 = null;
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue44 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        fuzzTest9.FuzzTest_clone(intQueue32, intQueue41, intQueue44);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue50 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue54 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue60 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        fuzzTest47.FuzzTest_clone(intQueue50, intQueue54, intQueue60);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue66 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue70 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue76 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        fuzzTest63.FuzzTest_clone(intQueue66, intQueue70, intQueue76);
        fuzzTest8.FuzzTest_clone(intQueue32, intQueue54, intQueue76);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue83 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue87 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue87, intArray86);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue93 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue93, intArray92);
        fuzzTest80.FuzzTest_clone(intQueue83, intQueue87, intQueue93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intQueue6, intQueue76, intQueue93);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue5 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue9 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue15 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        fuzzTest2.FuzzTest_clone(intQueue5, intQueue9, intQueue15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue21 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue25 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue31 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        fuzzTest18.FuzzTest_clone(intQueue21, intQueue25, intQueue31);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, (-1), 10, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue39 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        fuzzTest1.FuzzTest_clone(intQueue5, intQueue21, intQueue39);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue45 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue49 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue55 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        fuzzTest42.FuzzTest_clone(intQueue45, intQueue49, intQueue55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue61 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue65 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue71 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        fuzzTest58.FuzzTest_clone(intQueue61, intQueue65, intQueue71);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue77 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue81 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue87 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue87, intArray86);
        fuzzTest74.FuzzTest_clone(intQueue77, intQueue81, intQueue87);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue90 = null;
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue93 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue93, intArray92);
        fuzzTest58.FuzzTest_clone(intQueue81, intQueue90, intQueue93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intQueue39, intQueue45, intQueue81);
    }
}

