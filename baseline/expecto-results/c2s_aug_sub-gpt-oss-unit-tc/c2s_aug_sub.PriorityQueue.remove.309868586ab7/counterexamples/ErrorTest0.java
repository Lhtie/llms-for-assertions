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
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue28 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_remove(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue34, (java.lang.Integer) 10, true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        fuzzTest10.FuzzTest_remove(intQueue18, intQueue24, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue18, (java.lang.Integer) 10, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest33.FuzzTest_remove(intQueue41, intQueue47, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue32, intQueue47, (java.lang.Integer) 10, true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        fuzzTest10.FuzzTest_remove(intQueue18, intQueue24, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue18, (java.lang.Integer) 10, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzzTest43.FuzzTest_remove(intQueue51, intQueue57, (java.lang.Integer) 2, false);
        fuzzTest33.FuzzTest_remove(intQueue41, intQueue51, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue73 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue79 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        fuzzTest65.FuzzTest_remove(intQueue73, intQueue79, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_remove(intQueue79, intQueue84, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue32, intQueue79, (java.lang.Integer) 0, true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzzTest11.FuzzTest_remove(intQueue19, intQueue25, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_remove(intQueue9, intQueue19, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest33.FuzzTest_remove(intQueue41, intQueue47, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(intQueue47, intQueue52, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue59 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue52, intQueue59, (java.lang.Integer) 0, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        fuzzTest10.FuzzTest_remove(intQueue18, intQueue24, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue18, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue50 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzzTest42.FuzzTest_remove(intQueue50, intQueue56, (java.lang.Integer) 2, false);
        fuzzTest32.FuzzTest_remove(intQueue40, intQueue50, (java.lang.Integer) 10, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue64 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_remove(intQueue64, intQueue65, (java.lang.Integer) (-1), false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue69 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue65, intQueue69, (java.lang.Integer) 2, true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzzTest29.FuzzTest_remove(intQueue37, intQueue43, (java.lang.Integer) 2, false);
        fuzzTest19.FuzzTest_remove(intQueue27, intQueue37, (java.lang.Integer) 10, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = null;
        fuzzTest0.FuzzTest_remove(intQueue37, intQueue51, (java.lang.Integer) 0, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue64 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue74 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue80 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        fuzzTest66.FuzzTest_remove(intQueue74, intQueue80, (java.lang.Integer) 2, false);
        fuzzTest56.FuzzTest_remove(intQueue64, intQueue74, (java.lang.Integer) 10, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue88 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_remove(intQueue88, intQueue89, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue55, intQueue89, (java.lang.Integer) 1, false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        fuzzTest10.FuzzTest_remove(intQueue18, intQueue24, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue18, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue46 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        fuzzTest32.FuzzTest_remove(intQueue40, intQueue46, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intQueue46, intQueue51, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 100, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue59 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue61 = null;
        fuzzTest0.FuzzTest_remove(intQueue59, intQueue61, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue67 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intQueue67, intQueue69, (java.lang.Integer) 1, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue73 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue73, intQueue77, (java.lang.Integer) 0, true);
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
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue20, (java.lang.Integer) (-1), false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue39 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        fuzzTest25.FuzzTest_remove(intQueue33, intQueue39, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue53 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue69 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        fuzzTest55.FuzzTest_remove(intQueue63, intQueue69, (java.lang.Integer) 2, false);
        fuzzTest45.FuzzTest_remove(intQueue53, intQueue63, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue79 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        fuzzTest44.FuzzTest_remove(intQueue53, intQueue79, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue88 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue88, intArray87);
        fuzzTest25.FuzzTest_remove(intQueue79, intQueue88, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue24, intQueue88, (java.lang.Integer) 10, true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue20, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue32 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue38 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        fuzzTest24.FuzzTest_remove(intQueue32, intQueue38, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_remove(intQueue43, intQueue44, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue66 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue72 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzzTest58.FuzzTest_remove(intQueue66, intQueue72, (java.lang.Integer) 2, false);
        fuzzTest48.FuzzTest_remove(intQueue56, intQueue66, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue44, intQueue66, (java.lang.Integer) 2, true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue20, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue49 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        fuzzTest35.FuzzTest_remove(intQueue43, intQueue49, (java.lang.Integer) 2, false);
        fuzzTest25.FuzzTest_remove(intQueue33, intQueue43, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue59 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        fuzzTest24.FuzzTest_remove(intQueue33, intQueue59, (java.lang.Integer) 100, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue64 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_remove(intQueue64, intQueue65, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue83 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        fuzzTest69.FuzzTest_remove(intQueue77, intQueue83, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue65, intQueue77, (java.lang.Integer) 10, false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzzTest11.FuzzTest_remove(intQueue19, intQueue25, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_remove(intQueue9, intQueue19, (java.lang.Integer) 10, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = null;
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue33, (java.lang.Integer) 0, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzzTest49.FuzzTest_remove(intQueue57, intQueue63, (java.lang.Integer) 2, false);
        fuzzTest39.FuzzTest_remove(intQueue47, intQueue57, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue73 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzzTest38.FuzzTest_remove(intQueue47, intQueue73, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue37, intQueue47, (java.lang.Integer) 10, true);
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
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue28 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_remove(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzzTest49.FuzzTest_remove(intQueue57, intQueue63, (java.lang.Integer) 2, false);
        fuzzTest39.FuzzTest_remove(intQueue47, intQueue57, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 10, 1, 1, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue78 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        fuzzTest20.FuzzTest_remove(intQueue47, intQueue78, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue78, (java.lang.Integer) (-1), true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue86 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue87 = null;
        fuzzTest0.FuzzTest_remove(intQueue86, intQueue87, (java.lang.Integer) 1, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue91 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue94 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue94, intArray93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue91, intQueue94, (java.lang.Integer) 2, false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue20, (java.lang.Integer) 0, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue50 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        fuzzTest36.FuzzTest_remove(intQueue44, intQueue50, (java.lang.Integer) 2, false);
        fuzzTest26.FuzzTest_remove(intQueue34, intQueue44, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue66 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue72 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzzTest58.FuzzTest_remove(intQueue66, intQueue72, (java.lang.Integer) 2, false);
        fuzzTest25.FuzzTest_remove(intQueue34, intQueue72, (java.lang.Integer) 0, false);
        fuzzTest0.FuzzTest_remove(intQueue24, intQueue34, (java.lang.Integer) 10, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue83 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue86 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue83, intQueue86, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzzTest11.FuzzTest_remove(intQueue19, intQueue25, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_remove(intQueue9, intQueue19, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzzTest0.FuzzTest_remove(intQueue9, intQueue35, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = null;
        fuzzTest0.FuzzTest_remove(intQueue42, intQueue44, (java.lang.Integer) (-1), false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue67 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue73 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzzTest59.FuzzTest_remove(intQueue67, intQueue73, (java.lang.Integer) 2, false);
        fuzzTest49.FuzzTest_remove(intQueue57, intQueue67, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue48, intQueue67, (java.lang.Integer) 100, false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 100, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue15 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue31 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        fuzzTest17.FuzzTest_remove(intQueue25, intQueue31, (java.lang.Integer) 2, false);
        fuzzTest7.FuzzTest_remove(intQueue15, intQueue25, (java.lang.Integer) 10, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue39 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = null;
        fuzzTest7.FuzzTest_remove(intQueue39, intQueue40, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue52 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue58 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzzTest44.FuzzTest_remove(intQueue52, intQueue58, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = null;
        fuzzTest7.FuzzTest_remove(intQueue52, intQueue63, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue6, intQueue52, (java.lang.Integer) 100, true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 100, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue16 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue26 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue32 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        fuzzTest18.FuzzTest_remove(intQueue26, intQueue32, (java.lang.Integer) 2, false);
        fuzzTest8.FuzzTest_remove(intQueue16, intQueue26, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        fuzzTest7.FuzzTest_remove(intQueue16, intQueue42, (java.lang.Integer) 100, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = null;
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue66 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue72 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzzTest58.FuzzTest_remove(intQueue66, intQueue72, (java.lang.Integer) 2, false);
        fuzzTest48.FuzzTest_remove(intQueue56, intQueue66, (java.lang.Integer) 10, true);
        fuzzTest7.FuzzTest_remove(intQueue47, intQueue56, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue6, intQueue56, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzzTest29.FuzzTest_remove(intQueue37, intQueue43, (java.lang.Integer) 2, false);
        fuzzTest19.FuzzTest_remove(intQueue27, intQueue37, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 10, 1, 1, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue58 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzzTest0.FuzzTest_remove(intQueue27, intQueue58, (java.lang.Integer) (-1), false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue64 = null;
        fuzzTest0.FuzzTest_remove(intQueue63, intQueue64, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue83 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        fuzzTest69.FuzzTest_remove(intQueue77, intQueue83, (java.lang.Integer) 2, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue88 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_remove(intQueue88, intQueue89, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue68, intQueue89, (java.lang.Integer) 100, true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue20, (java.lang.Integer) (-1), false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue45 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        fuzzTest37.FuzzTest_remove(intQueue45, intQueue51, (java.lang.Integer) 2, false);
        fuzzTest27.FuzzTest_remove(intQueue35, intQueue45, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue67 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue73 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzzTest59.FuzzTest_remove(intQueue67, intQueue73, (java.lang.Integer) 2, false);
        fuzzTest26.FuzzTest_remove(intQueue35, intQueue73, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-1), 0, (-1), 100, 2, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue88 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue88, intArray87);
        fuzzTest25.FuzzTest_remove(intQueue35, intQueue88, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue24, intQueue35, (java.lang.Integer) 100, false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzzTest29.FuzzTest_remove(intQueue37, intQueue43, (java.lang.Integer) 2, false);
        fuzzTest19.FuzzTest_remove(intQueue27, intQueue37, (java.lang.Integer) 10, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = null;
        fuzzTest0.FuzzTest_remove(intQueue37, intQueue51, (java.lang.Integer) 0, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue55 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = null;
        fuzzTest0.FuzzTest_remove(intQueue55, intQueue56, (java.lang.Integer) 10, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue60 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue61 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue60, intQueue61, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzzTest11.FuzzTest_remove(intQueue19, intQueue25, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_remove(intQueue9, intQueue19, (java.lang.Integer) 10, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = null;
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue33, (java.lang.Integer) 0, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intQueue37, intQueue38, (java.lang.Integer) 2, true);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 0, (-1), 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue49 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = null;
        fuzzTest0.FuzzTest_remove(intQueue49, intQueue51, (java.lang.Integer) 100, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue75 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue81 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        fuzzTest67.FuzzTest_remove(intQueue75, intQueue81, (java.lang.Integer) 2, false);
        fuzzTest57.FuzzTest_remove(intQueue65, intQueue75, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue91 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue91, intArray90);
        fuzzTest56.FuzzTest_remove(intQueue65, intQueue91, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue55, intQueue91, (java.lang.Integer) 100, false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzzTest11.FuzzTest_remove(intQueue19, intQueue25, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_remove(intQueue9, intQueue19, (java.lang.Integer) 10, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = null;
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue33, (java.lang.Integer) 0, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzzTest49.FuzzTest_remove(intQueue57, intQueue63, (java.lang.Integer) 2, false);
        fuzzTest39.FuzzTest_remove(intQueue47, intQueue57, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue73 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzzTest38.FuzzTest_remove(intQueue47, intQueue73, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue80 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue82 = null;
        fuzzTest38.FuzzTest_remove(intQueue80, intQueue82, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_remove(intQueue37, intQueue80, (java.lang.Integer) (-1), true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue89 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue92 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue92, intArray91);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue89, intQueue92, (java.lang.Integer) 0, false);
    }
}

