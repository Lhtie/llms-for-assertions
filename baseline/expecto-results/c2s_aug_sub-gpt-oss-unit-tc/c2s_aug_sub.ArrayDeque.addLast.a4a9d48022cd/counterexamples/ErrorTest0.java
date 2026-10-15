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
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue8 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue14 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue8, intQueue14, (java.lang.Integer) 2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue6 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue8 = null;
        fuzzTest0.FuzzTest_addLast(intQueue6, intQueue8, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue18 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue20 = null;
        fuzzTest12.FuzzTest_addLast(intQueue18, intQueue20, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue27 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue35 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue37 = null;
        fuzzTest29.FuzzTest_addLast(intQueue35, intQueue37, (java.lang.Integer) (-1));
        fuzzTest12.FuzzTest_addLast(intQueue27, intQueue35, (java.lang.Integer) 10);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addLast(intQueue35, intQueue42, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue52 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue54 = null;
        fuzzTest46.FuzzTest_addLast(intQueue52, intQueue54, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue61 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue69 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue71 = null;
        fuzzTest63.FuzzTest_addLast(intQueue69, intQueue71, (java.lang.Integer) (-1));
        fuzzTest46.FuzzTest_addLast(intQueue61, intQueue69, (java.lang.Integer) 10);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_addLast(intQueue69, intQueue76, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue42, intQueue69, (java.lang.Integer) 2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue1 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addLast(intQueue1, intQueue2, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue8 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue16 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue18 = null;
        fuzzTest10.FuzzTest_addLast(intQueue16, intQueue18, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue25 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue33 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue35 = null;
        fuzzTest27.FuzzTest_addLast(intQueue33, intQueue35, (java.lang.Integer) (-1));
        fuzzTest10.FuzzTest_addLast(intQueue25, intQueue33, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue8, intQueue25, (java.lang.Integer) (-1));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue6 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue8 = null;
        fuzzTest0.FuzzTest_addLast(intQueue6, intQueue8, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue18 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue20 = null;
        fuzzTest12.FuzzTest_addLast(intQueue18, intQueue20, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue27 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue35 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue37 = null;
        fuzzTest29.FuzzTest_addLast(intQueue35, intQueue37, (java.lang.Integer) (-1));
        fuzzTest12.FuzzTest_addLast(intQueue27, intQueue35, (java.lang.Integer) 10);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addLast(intQueue35, intQueue42, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue47 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addLast(intQueue47, intQueue48, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue57 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue59 = null;
        fuzzTest51.FuzzTest_addLast(intQueue57, intQueue59, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue66 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue74 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue76 = null;
        fuzzTest68.FuzzTest_addLast(intQueue74, intQueue76, (java.lang.Integer) (-1));
        fuzzTest51.FuzzTest_addLast(intQueue66, intQueue74, (java.lang.Integer) 10);
        fuzzTest45.FuzzTest_addLast(intQueue47, intQueue74, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue42, intQueue74, (java.lang.Integer) 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue6 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue8 = null;
        fuzzTest0.FuzzTest_addLast(intQueue6, intQueue8, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue15 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue23 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue25 = null;
        fuzzTest17.FuzzTest_addLast(intQueue23, intQueue25, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_addLast(intQueue15, intQueue23, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue36 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue38 = null;
        fuzzTest30.FuzzTest_addLast(intQueue36, intQueue38, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue45 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue53 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue55 = null;
        fuzzTest47.FuzzTest_addLast(intQueue53, intQueue55, (java.lang.Integer) (-1));
        fuzzTest30.FuzzTest_addLast(intQueue45, intQueue53, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue62 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_addLast(intQueue62, intQueue63, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_addLast(intQueue63, intQueue66, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue71 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_addLast(intQueue71, intQueue72, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_addLast(intQueue72, intQueue75, (java.lang.Integer) 2);
        fuzzTest30.FuzzTest_addLast(intQueue66, intQueue75, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue86 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue88 = null;
        fuzzTest80.FuzzTest_addLast(intQueue86, intQueue88, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue66, intQueue86, (java.lang.Integer) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue2 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addLast(intQueue2, intQueue3, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addLast(intQueue3, intQueue6, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue11 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addLast(intQueue11, intQueue12, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addLast(intQueue12, intQueue15, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue24 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue26 = null;
        fuzzTest18.FuzzTest_addLast(intQueue24, intQueue26, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue12, intQueue24, (java.lang.Integer) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue2 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addLast(intQueue2, intQueue3, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addLast(intQueue3, intQueue6, (java.lang.Integer) 2);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue9 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addLast(intQueue9, intQueue10, (java.lang.Integer) 2);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue16 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addLast(intQueue16, intQueue17, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addLast(intQueue17, intQueue20, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addLast(intQueue13, intQueue20, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue31 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue33 = null;
        fuzzTest25.FuzzTest_addLast(intQueue31, intQueue33, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue40 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue48 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue50 = null;
        fuzzTest42.FuzzTest_addLast(intQueue48, intQueue50, (java.lang.Integer) (-1));
        fuzzTest25.FuzzTest_addLast(intQueue40, intQueue48, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue62 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue64 = null;
        fuzzTest56.FuzzTest_addLast(intQueue62, intQueue64, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue71 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue79 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue81 = null;
        fuzzTest73.FuzzTest_addLast(intQueue79, intQueue81, (java.lang.Integer) (-1));
        fuzzTest56.FuzzTest_addLast(intQueue71, intQueue79, (java.lang.Integer) 10);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_addLast(intQueue79, intQueue86, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue48, intQueue79, (java.lang.Integer) 2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue2 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addLast(intQueue2, intQueue3, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addLast(intQueue3, intQueue6, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue11 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addLast(intQueue11, intQueue12, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addLast(intQueue12, intQueue15, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue24 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue26 = null;
        fuzzTest18.FuzzTest_addLast(intQueue24, intQueue26, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue33 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue41 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue43 = null;
        fuzzTest35.FuzzTest_addLast(intQueue41, intQueue43, (java.lang.Integer) (-1));
        fuzzTest18.FuzzTest_addLast(intQueue33, intQueue41, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_addLast(intQueue15, intQueue33, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue51 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_addLast(intQueue51, intQueue52, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue58 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue52, intQueue58, (java.lang.Integer) 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue6 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue8 = null;
        fuzzTest0.FuzzTest_addLast(intQueue6, intQueue8, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue17 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue19 = null;
        fuzzTest11.FuzzTest_addLast(intQueue17, intQueue19, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue29 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue31 = null;
        fuzzTest23.FuzzTest_addLast(intQueue29, intQueue31, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue38 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue46 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue48 = null;
        fuzzTest40.FuzzTest_addLast(intQueue46, intQueue48, (java.lang.Integer) (-1));
        fuzzTest23.FuzzTest_addLast(intQueue38, intQueue46, (java.lang.Integer) 10);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_addLast(intQueue46, intQueue53, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_addLast(intQueue17, intQueue53, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue65 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue67 = null;
        fuzzTest59.FuzzTest_addLast(intQueue65, intQueue67, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue74 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue82 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue84 = null;
        fuzzTest76.FuzzTest_addLast(intQueue82, intQueue84, (java.lang.Integer) (-1));
        fuzzTest59.FuzzTest_addLast(intQueue74, intQueue82, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue58, intQueue82, (java.lang.Integer) 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue6 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue8 = null;
        fuzzTest0.FuzzTest_addLast(intQueue6, intQueue8, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue17 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue19 = null;
        fuzzTest11.FuzzTest_addLast(intQueue17, intQueue19, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue29 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue31 = null;
        fuzzTest23.FuzzTest_addLast(intQueue29, intQueue31, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue38 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue46 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue48 = null;
        fuzzTest40.FuzzTest_addLast(intQueue46, intQueue48, (java.lang.Integer) (-1));
        fuzzTest23.FuzzTest_addLast(intQueue38, intQueue46, (java.lang.Integer) 10);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_addLast(intQueue46, intQueue53, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_addLast(intQueue17, intQueue53, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue58 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addLast(intQueue58, intQueue59, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue68 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue70 = null;
        fuzzTest62.FuzzTest_addLast(intQueue68, intQueue70, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 1, (-1), 2 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue78 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue68, intQueue78, (java.lang.Integer) 1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue6 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue8 = null;
        fuzzTest0.FuzzTest_addLast(intQueue6, intQueue8, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue13 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_addLast(intQueue13, intQueue14, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addLast(intQueue14, intQueue17, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue22 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_addLast(intQueue22, intQueue23, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_addLast(intQueue23, intQueue26, (java.lang.Integer) 2);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue29 = null;
        fuzzTest11.FuzzTest_addLast(intQueue23, intQueue29, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 0, 2, 0, 0, 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue38 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue42 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_addLast(intQueue42, intQueue43, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_addLast(intQueue43, intQueue46, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue51 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_addLast(intQueue51, intQueue52, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_addLast(intQueue52, intQueue55, (java.lang.Integer) 2);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue58 = null;
        fuzzTest40.FuzzTest_addLast(intQueue52, intQueue58, (java.lang.Integer) (-1));
        fuzzTest11.FuzzTest_addLast(intQueue38, intQueue58, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue69 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue71 = null;
        fuzzTest63.FuzzTest_addLast(intQueue69, intQueue71, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue38, intQueue69, (java.lang.Integer) 2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue1 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addLast(intQueue1, intQueue2, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue6 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addLast(intQueue6, intQueue7, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 100, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue14 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue22 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue24 = null;
        fuzzTest16.FuzzTest_addLast(intQueue22, intQueue24, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue31 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue39 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue41 = null;
        fuzzTest33.FuzzTest_addLast(intQueue39, intQueue41, (java.lang.Integer) (-1));
        fuzzTest16.FuzzTest_addLast(intQueue31, intQueue39, (java.lang.Integer) 10);
        fuzzTest5.FuzzTest_addLast(intQueue14, intQueue39, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue50 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_addLast(intQueue50, intQueue51, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_addLast(intQueue51, intQueue54, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue59 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addLast(intQueue59, intQueue60, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_addLast(intQueue60, intQueue63, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue68 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addLast(intQueue68, intQueue69, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_addLast(intQueue69, intQueue72, (java.lang.Integer) 2);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue75 = null;
        fuzzTest57.FuzzTest_addLast(intQueue69, intQueue75, (java.lang.Integer) (-1));
        fuzzTest5.FuzzTest_addLast(intQueue51, intQueue69, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue86 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue88 = null;
        fuzzTest80.FuzzTest_addLast(intQueue86, intQueue88, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue69, intQueue86, (java.lang.Integer) 1);
    }
}

