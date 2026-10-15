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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue11 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue17 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        fuzzTest3.FuzzTest_remove(intQueue11, intQueue17, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue31 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest23.FuzzTest_remove(intQueue31, intQueue37, (java.lang.Integer) 2, false);
        fuzzTest3.FuzzTest_remove(intQueue22, intQueue37, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 0, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue48 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        fuzzTest2.FuzzTest_remove(intQueue37, intQueue48, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue48, (java.lang.Integer) 2, false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest0.FuzzTest_remove(intQueue3, intQueue5, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue13 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue29 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        fuzzTest15.FuzzTest_remove(intQueue23, intQueue29, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue49 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        fuzzTest35.FuzzTest_remove(intQueue43, intQueue49, (java.lang.Integer) 2, false);
        fuzzTest15.FuzzTest_remove(intQueue34, intQueue49, (java.lang.Integer) 10, true);
        fuzzTest9.FuzzTest_remove(intQueue13, intQueue34, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue34, intQueue63, (java.lang.Integer) 100, false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue39 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        fuzzTest25.FuzzTest_remove(intQueue33, intQueue39, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue53 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue59 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        fuzzTest45.FuzzTest_remove(intQueue53, intQueue59, (java.lang.Integer) 2, false);
        fuzzTest25.FuzzTest_remove(intQueue44, intQueue59, (java.lang.Integer) 10, true);
        fuzzTest19.FuzzTest_remove(intQueue23, intQueue44, (java.lang.Integer) (-1), false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue70 = null;
        fuzzTest0.FuzzTest_remove(intQueue44, intQueue70, (java.lang.Integer) (-1), false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue74 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue74, intQueue77, (java.lang.Integer) 2, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue20 = null;
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue20, (java.lang.Integer) 0, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = null;
        fuzzTest0.FuzzTest_remove(intQueue24, intQueue25, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzzTest29.FuzzTest_remove(intQueue37, intQueue43, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzzTest49.FuzzTest_remove(intQueue57, intQueue63, (java.lang.Integer) 2, false);
        fuzzTest29.FuzzTest_remove(intQueue48, intQueue63, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 0, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue74 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_remove(intQueue74, intQueue76, (java.lang.Integer) 2, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue80 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue76, intQueue80, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest0.FuzzTest_remove(intQueue3, intQueue5, (java.lang.Integer) (-1), true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue10 = null;
        fuzzTest0.FuzzTest_remove(intQueue9, intQueue10, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue28 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        fuzzTest14.FuzzTest_remove(intQueue22, intQueue28, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue48 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        fuzzTest34.FuzzTest_remove(intQueue42, intQueue48, (java.lang.Integer) 2, false);
        fuzzTest14.FuzzTest_remove(intQueue33, intQueue48, (java.lang.Integer) 10, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_remove(intQueue56, intQueue57, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue69 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue75 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        fuzzTest61.FuzzTest_remove(intQueue69, intQueue75, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue57, intQueue69, (java.lang.Integer) 0, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue6 = null;
        fuzzTest1.FuzzTest_remove(intQueue4, intQueue6, (java.lang.Integer) (-1), true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue10 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue11 = null;
        fuzzTest1.FuzzTest_remove(intQueue10, intQueue11, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue29 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzzTest21.FuzzTest_remove(intQueue29, intQueue35, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue49 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue55 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        fuzzTest41.FuzzTest_remove(intQueue49, intQueue55, (java.lang.Integer) 2, false);
        fuzzTest21.FuzzTest_remove(intQueue40, intQueue55, (java.lang.Integer) 10, true);
        fuzzTest15.FuzzTest_remove(intQueue19, intQueue40, (java.lang.Integer) (-1), false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue70 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue72 = null;
        fuzzTest67.FuzzTest_remove(intQueue70, intQueue72, (java.lang.Integer) (-1), true);
        fuzzTest15.FuzzTest_remove(intQueue66, intQueue70, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue10, intQueue70, (java.lang.Integer) 1, false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = null;
        fuzzTest1.FuzzTest_remove(intQueue2, intQueue3, (java.lang.Integer) 100, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue16 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        fuzzTest8.FuzzTest_remove(intQueue16, intQueue22, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue36 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        fuzzTest28.FuzzTest_remove(intQueue36, intQueue42, (java.lang.Integer) 2, false);
        fuzzTest8.FuzzTest_remove(intQueue27, intQueue42, (java.lang.Integer) 10, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue50 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_remove(intQueue50, intQueue51, (java.lang.Integer) 0, true);
        fuzzTest1.FuzzTest_remove(intQueue7, intQueue51, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue61 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = null;
        fuzzTest58.FuzzTest_remove(intQueue61, intQueue63, (java.lang.Integer) (-1), true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue67 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue68 = null;
        fuzzTest58.FuzzTest_remove(intQueue67, intQueue68, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue51, intQueue67, (java.lang.Integer) 100, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue20 = null;
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue20, (java.lang.Integer) 0, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue39 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        fuzzTest25.FuzzTest_remove(intQueue33, intQueue39, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue53 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue59 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        fuzzTest45.FuzzTest_remove(intQueue53, intQueue59, (java.lang.Integer) 2, false);
        fuzzTest25.FuzzTest_remove(intQueue44, intQueue59, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_remove(intQueue24, intQueue59, (java.lang.Integer) (-1), true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue70 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue71 = null;
        fuzzTest0.FuzzTest_remove(intQueue70, intQueue71, (java.lang.Integer) 10, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue75 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue76 = null;
        fuzzTest0.FuzzTest_remove(intQueue75, intQueue76, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, 100, 2, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue85 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue87 = null;
        fuzzTest0.FuzzTest_remove(intQueue85, intQueue87, (java.lang.Integer) 2, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue91 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue91, intQueue92, (java.lang.Integer) 1, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest0.FuzzTest_remove(intQueue3, intQueue5, (java.lang.Integer) (-1), true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = null;
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 0, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue9, intQueue14, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        fuzzTest27.FuzzTest_remove(intQueue35, intQueue41, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue55 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue61 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        fuzzTest47.FuzzTest_remove(intQueue55, intQueue61, (java.lang.Integer) 2, false);
        fuzzTest27.FuzzTest_remove(intQueue46, intQueue61, (java.lang.Integer) 10, true);
        fuzzTest21.FuzzTest_remove(intQueue25, intQueue46, (java.lang.Integer) (-1), false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_remove(intQueue46, intQueue72, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue72, (java.lang.Integer) 1, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue6 = null;
        fuzzTest1.FuzzTest_remove(intQueue4, intQueue6, (java.lang.Integer) (-1), true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue10 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue11 = null;
        fuzzTest1.FuzzTest_remove(intQueue10, intQueue11, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue29 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        fuzzTest15.FuzzTest_remove(intQueue23, intQueue29, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = null;
        fuzzTest15.FuzzTest_remove(intQueue34, intQueue35, (java.lang.Integer) 0, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue39 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = null;
        fuzzTest15.FuzzTest_remove(intQueue39, intQueue40, (java.lang.Integer) 100, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue45 = null;
        fuzzTest15.FuzzTest_remove(intQueue44, intQueue45, (java.lang.Integer) 10, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue49 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue50 = null;
        fuzzTest15.FuzzTest_remove(intQueue49, intQueue50, (java.lang.Integer) 0, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = null;
        fuzzTest55.FuzzTest_remove(intQueue56, intQueue57, (java.lang.Integer) 100, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue61 = null;
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue64 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        fuzzTest55.FuzzTest_remove(intQueue61, intQueue64, (java.lang.Integer) 0, true);
        fuzzTest15.FuzzTest_remove(intQueue54, intQueue64, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue10, intQueue64, (java.lang.Integer) 10, false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest0.FuzzTest_remove(intQueue3, intQueue5, (java.lang.Integer) (-1), true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue10 = null;
        fuzzTest0.FuzzTest_remove(intQueue9, intQueue10, (java.lang.Integer) 1, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue15 = null;
        fuzzTest0.FuzzTest_remove(intQueue14, intQueue15, (java.lang.Integer) 1, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = null;
        fuzzTest20.FuzzTest_remove(intQueue23, intQueue25, (java.lang.Integer) (-1), true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue29 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_remove(intQueue29, intQueue34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue34, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue50 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzzTest42.FuzzTest_remove(intQueue50, intQueue56, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue70 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue76 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        fuzzTest62.FuzzTest_remove(intQueue70, intQueue76, (java.lang.Integer) 2, false);
        fuzzTest42.FuzzTest_remove(intQueue61, intQueue76, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 0, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue87 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue87, intArray86);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_remove(intQueue87, intQueue89, (java.lang.Integer) 2, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue93 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue89, intQueue93, (java.lang.Integer) 100, false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue20 = null;
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue20, (java.lang.Integer) 0, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = null;
        fuzzTest0.FuzzTest_remove(intQueue24, intQueue25, (java.lang.Integer) 100, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest33.FuzzTest_remove(intQueue41, intQueue47, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue61 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue67 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        fuzzTest53.FuzzTest_remove(intQueue61, intQueue67, (java.lang.Integer) 2, false);
        fuzzTest33.FuzzTest_remove(intQueue52, intQueue67, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue78 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        fuzzTest32.FuzzTest_remove(intQueue67, intQueue78, (java.lang.Integer) 10, false);
        fuzzTest30.FuzzTest_remove(intQueue31, intQueue78, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue29, intQueue78, (java.lang.Integer) (-1), false);
    }
}

