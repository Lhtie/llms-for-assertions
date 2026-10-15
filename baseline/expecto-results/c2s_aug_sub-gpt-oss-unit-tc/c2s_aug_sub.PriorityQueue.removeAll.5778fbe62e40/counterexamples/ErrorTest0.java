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
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue15 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest1.FuzzTest_removeAll(intQueue9, intQueue15, (java.util.Collection<java.lang.Integer>) intList24, false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue36 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest28.FuzzTest_removeAll(intQueue36, intQueue42, (java.util.Collection<java.lang.Integer>) intList51, false);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue58 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue73 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue79 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList88 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest65.FuzzTest_removeAll(intQueue73, intQueue79, (java.util.Collection<java.lang.Integer>) intList88, false);
        fuzzTest28.FuzzTest_removeAll(intQueue58, intQueue63, (java.util.Collection<java.lang.Integer>) intQueue73, false);
        java.util.Collection<java.lang.Integer> intCollection94 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue9, intQueue63, intCollection94, true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        fuzzTest0.FuzzTest_removeAll(intQueue8, intQueue14, (java.util.Collection<java.lang.Integer>) intList23, false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest27.FuzzTest_removeAll(intQueue35, intQueue41, (java.util.Collection<java.lang.Integer>) intList50, false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue62 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue68 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList77 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest54.FuzzTest_removeAll(intQueue62, intQueue68, (java.util.Collection<java.lang.Integer>) intList77, false);
        java.util.Collection<java.lang.Integer> intCollection81 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue35, intQueue62, intCollection81, true);
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
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest0.FuzzTest_removeAll(intQueue8, intQueue14, (java.util.Collection<java.lang.Integer>) intList23, false);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 10, 10, 2, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue36 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue33, intQueue35, (java.util.Collection<java.lang.Integer>) intQueue36, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue11 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue17 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest3.FuzzTest_removeAll(intQueue11, intQueue17, (java.util.Collection<java.lang.Integer>) intList26, false);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 10, 2, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
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
        fuzzTest37.FuzzTest_removeAll(intQueue45, intQueue51, (java.util.Collection<java.lang.Integer>) intList60, false);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue72 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue78 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList87 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest64.FuzzTest_removeAll(intQueue72, intQueue78, (java.util.Collection<java.lang.Integer>) intList87, false);
        fuzzTest3.FuzzTest_removeAll(intQueue35, intQueue45, (java.util.Collection<java.lang.Integer>) intQueue72, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue1, intQueue2, (java.util.Collection<java.lang.Integer>) intQueue35, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue15 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest1.FuzzTest_removeAll(intQueue9, intQueue15, (java.util.Collection<java.lang.Integer>) intList24, false);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, (-1), 2, 0, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue50 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList59 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest36.FuzzTest_removeAll(intQueue44, intQueue50, (java.util.Collection<java.lang.Integer>) intList59, false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue71 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList86 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest63.FuzzTest_removeAll(intQueue71, intQueue77, (java.util.Collection<java.lang.Integer>) intList86, false);
        fuzzTest1.FuzzTest_removeAll(intQueue34, intQueue50, (java.util.Collection<java.lang.Integer>) intQueue77, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue92 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection93 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue77, intQueue92, intCollection93, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { (-1), 10, 100, 1, 100, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue10 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue20 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue26 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest12.FuzzTest_removeAll(intQueue20, intQueue26, (java.util.Collection<java.lang.Integer>) intList35, false);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList72 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest49.FuzzTest_removeAll(intQueue57, intQueue63, (java.util.Collection<java.lang.Integer>) intList72, false);
        fuzzTest12.FuzzTest_removeAll(intQueue42, intQueue47, (java.util.Collection<java.lang.Integer>) intQueue57, false);
        fuzzTest1.FuzzTest_removeAll(intQueue2, intQueue10, (java.util.Collection<java.lang.Integer>) intQueue57, false);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, (-1), 10, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue85 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        java.util.Collection<java.lang.Integer> intCollection87 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue10, intQueue85, intCollection87, true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue15 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest1.FuzzTest_removeAll(intQueue9, intQueue15, (java.util.Collection<java.lang.Integer>) intList24, false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue38 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList53 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest30.FuzzTest_removeAll(intQueue38, intQueue44, (java.util.Collection<java.lang.Integer>) intList53, false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue71 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList80 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest57.FuzzTest_removeAll(intQueue65, intQueue71, (java.util.Collection<java.lang.Integer>) intList80, false);
        fuzzTest28.FuzzTest_removeAll(intQueue29, intQueue44, (java.util.Collection<java.lang.Integer>) intQueue65, false);
        java.util.Collection<java.lang.Integer> intCollection86 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue9, intQueue65, intCollection86, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue15 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest1.FuzzTest_removeAll(intQueue9, intQueue15, (java.util.Collection<java.lang.Integer>) intList24, false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue36 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest28.FuzzTest_removeAll(intQueue36, intQueue42, (java.util.Collection<java.lang.Integer>) intList51, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue55 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection57 = null;
        fuzzTest28.FuzzTest_removeAll(intQueue55, intQueue56, intCollection57, true);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10, 10 };
        java.util.ArrayList<java.lang.Integer> intList63 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue15, intQueue56, (java.util.Collection<java.lang.Integer>) intList63, true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { (-1), 10, 100, 1, 100, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue10 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue20 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue26 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest12.FuzzTest_removeAll(intQueue20, intQueue26, (java.util.Collection<java.lang.Integer>) intList35, false);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList72 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest49.FuzzTest_removeAll(intQueue57, intQueue63, (java.util.Collection<java.lang.Integer>) intList72, false);
        fuzzTest12.FuzzTest_removeAll(intQueue42, intQueue47, (java.util.Collection<java.lang.Integer>) intQueue57, false);
        fuzzTest1.FuzzTest_removeAll(intQueue2, intQueue10, (java.util.Collection<java.lang.Integer>) intQueue57, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue80 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection81 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue10, intQueue80, intCollection81, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue15 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest1.FuzzTest_removeAll(intQueue9, intQueue15, (java.util.Collection<java.lang.Integer>) intList24, false);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 100, (-1), 0, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue50 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList59 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest36.FuzzTest_removeAll(intQueue44, intQueue50, (java.util.Collection<java.lang.Integer>) intList59, false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue71 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList86 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest63.FuzzTest_removeAll(intQueue71, intQueue77, (java.util.Collection<java.lang.Integer>) intList86, false);
        fuzzTest1.FuzzTest_removeAll(intQueue34, intQueue50, (java.util.Collection<java.lang.Integer>) intQueue77, true);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 0, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue95 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue95, intArray94);
        java.util.Collection<java.lang.Integer> intCollection97 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue77, intQueue95, intCollection97, true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = null;
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.util.Collection<java.lang.Integer> intCollection6 = null;
        fuzzTest0.FuzzTest_removeAll(intQueue1, intQueue4, intCollection6, false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue10 = null;
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
        fuzzTest11.FuzzTest_removeAll(intQueue19, intQueue25, (java.util.Collection<java.lang.Integer>) intList34, false);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue46 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue62 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList71 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest48.FuzzTest_removeAll(intQueue56, intQueue62, (java.util.Collection<java.lang.Integer>) intList71, false);
        fuzzTest11.FuzzTest_removeAll(intQueue41, intQueue46, (java.util.Collection<java.lang.Integer>) intQueue56, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_removeAll(intQueue10, intQueue46, (java.util.Collection<java.lang.Integer>) intQueue77, false);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 2, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue83 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        java.util.Collection<java.lang.Integer> intCollection85 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue77, intQueue83, intCollection85, true);
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
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest0.FuzzTest_removeAll(intQueue8, intQueue14, (java.util.Collection<java.lang.Integer>) intList23, false);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue30 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
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
        fuzzTest37.FuzzTest_removeAll(intQueue45, intQueue51, (java.util.Collection<java.lang.Integer>) intList60, false);
        fuzzTest0.FuzzTest_removeAll(intQueue30, intQueue35, (java.util.Collection<java.lang.Integer>) intQueue45, false);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1, 10, 10, 10, (-1), 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue73 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 1, 2, 2, 10, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue82 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        java.util.Collection<java.lang.Integer> intCollection84 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue73, intQueue82, intCollection84, true);
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
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest0.FuzzTest_removeAll(intQueue8, intQueue14, (java.util.Collection<java.lang.Integer>) intList23, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue39 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue45 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList54 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest31.FuzzTest_removeAll(intQueue39, intQueue45, (java.util.Collection<java.lang.Integer>) intList54, false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue66 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue72 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList81 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest58.FuzzTest_removeAll(intQueue66, intQueue72, (java.util.Collection<java.lang.Integer>) intList81, false);
        fuzzTest29.FuzzTest_removeAll(intQueue30, intQueue45, (java.util.Collection<java.lang.Integer>) intQueue66, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue27, intQueue28, (java.util.Collection<java.lang.Integer>) intQueue30, true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.util.Collection<java.lang.Integer> intCollection7 = null;
        fuzzTest1.FuzzTest_removeAll(intQueue2, intQueue5, intCollection7, false);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 100, 0, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue15 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue31 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList40 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest17.FuzzTest_removeAll(intQueue25, intQueue31, (java.util.Collection<java.lang.Integer>) intList40, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue45 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection46 = null;
        fuzzTest17.FuzzTest_removeAll(intQueue44, intQueue45, intCollection46, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue5, intQueue15, intCollection46, true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.util.Collection<java.lang.Integer> intCollection7 = null;
        fuzzTest1.FuzzTest_removeAll(intQueue2, intQueue5, intCollection7, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue10 = null;
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue12 = null;
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue15 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.util.Collection<java.lang.Integer> intCollection17 = null;
        fuzzTest11.FuzzTest_removeAll(intQueue12, intQueue15, intCollection17, false);
        fuzzTest0.FuzzTest_removeAll(intQueue2, intQueue10, (java.util.Collection<java.lang.Integer>) intQueue15, true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue32 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue38 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest24.FuzzTest_removeAll(intQueue32, intQueue38, (java.util.Collection<java.lang.Integer>) intList47, false);
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
        fuzzTest51.FuzzTest_removeAll(intQueue59, intQueue65, (java.util.Collection<java.lang.Integer>) intList74, false);
        fuzzTest22.FuzzTest_removeAll(intQueue23, intQueue38, (java.util.Collection<java.lang.Integer>) intQueue59, false);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue81 = null;
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue84 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue84, intArray83);
        java.util.Collection<java.lang.Integer> intCollection86 = null;
        fuzzTest80.FuzzTest_removeAll(intQueue81, intQueue84, intCollection86, false);
        java.util.Collection<java.lang.Integer> intCollection89 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue38, intQueue84, intCollection89, true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue11 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue17 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest3.FuzzTest_removeAll(intQueue11, intQueue17, (java.util.Collection<java.lang.Integer>) intList26, false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue38 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList53 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest30.FuzzTest_removeAll(intQueue38, intQueue44, (java.util.Collection<java.lang.Integer>) intList53, false);
        fuzzTest1.FuzzTest_removeAll(intQueue2, intQueue17, (java.util.Collection<java.lang.Integer>) intQueue38, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue59 = null;
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10, 2, (-1) };
        java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest0.FuzzTest_removeAll(intQueue17, intQueue59, (java.util.Collection<java.lang.Integer>) intList64, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue78 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue84 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue84, intArray83);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList93 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        fuzzTest70.FuzzTest_removeAll(intQueue78, intQueue84, (java.util.Collection<java.lang.Integer>) intList93, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue68, intQueue69, (java.util.Collection<java.lang.Integer>) intQueue84, false);
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
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest0.FuzzTest_removeAll(intQueue8, intQueue14, (java.util.Collection<java.lang.Integer>) intList23, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue28 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection29 = null;
        fuzzTest0.FuzzTest_removeAll(intQueue27, intQueue28, intCollection29, true);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = null;
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 2, 1, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest0.FuzzTest_removeAll(intQueue35, intQueue37, (java.util.Collection<java.lang.Integer>) intList44, true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue62 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList71 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest48.FuzzTest_removeAll(intQueue56, intQueue62, (java.util.Collection<java.lang.Integer>) intList71, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue75 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue76 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_removeAll(intQueue75, intQueue76, (java.util.Collection<java.lang.Integer>) intQueue77, false);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), 100, 0, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue85 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        java.util.Collection<java.lang.Integer> intCollection87 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue77, intQueue85, intCollection87, false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = null;
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.util.Collection<java.lang.Integer> intCollection6 = null;
        fuzzTest0.FuzzTest_removeAll(intQueue1, intQueue4, intCollection6, false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue20 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue26 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest12.FuzzTest_removeAll(intQueue20, intQueue26, (java.util.Collection<java.lang.Integer>) intList35, false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue53 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList62 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest39.FuzzTest_removeAll(intQueue47, intQueue53, (java.util.Collection<java.lang.Integer>) intList62, false);
        fuzzTest10.FuzzTest_removeAll(intQueue11, intQueue26, (java.util.Collection<java.lang.Integer>) intQueue47, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue68 = null;
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10, 2, (-1) };
        java.util.ArrayList<java.lang.Integer> intList73 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest9.FuzzTest_removeAll(intQueue26, intQueue68, (java.util.Collection<java.lang.Integer>) intList73, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection78 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue26, intQueue77, intCollection78, false);
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
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest0.FuzzTest_removeAll(intQueue8, intQueue14, (java.util.Collection<java.lang.Integer>) intList23, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue28 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection29 = null;
        fuzzTest0.FuzzTest_removeAll(intQueue27, intQueue28, intCollection29, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue46 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest32.FuzzTest_removeAll(intQueue40, intQueue46, (java.util.Collection<java.lang.Integer>) intList55, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue59 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue60 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection61 = null;
        fuzzTest32.FuzzTest_removeAll(intQueue59, intQueue60, intCollection61, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue64 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = null;
        java.util.Collection<java.lang.Integer> intCollection66 = null;
        fuzzTest32.FuzzTest_removeAll(intQueue64, intQueue65, intCollection66, true);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue83 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList92 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        fuzzTest69.FuzzTest_removeAll(intQueue77, intQueue83, (java.util.Collection<java.lang.Integer>) intList92, false);
        java.util.Collection<java.lang.Integer> intCollection96 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue64, intQueue77, intCollection96, true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue13 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest5.FuzzTest_removeAll(intQueue13, intQueue19, (java.util.Collection<java.lang.Integer>) intList28, false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue46 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest32.FuzzTest_removeAll(intQueue40, intQueue46, (java.util.Collection<java.lang.Integer>) intList55, false);
        fuzzTest3.FuzzTest_removeAll(intQueue4, intQueue19, (java.util.Collection<java.lang.Integer>) intQueue40, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue1, intQueue2, (java.util.Collection<java.lang.Integer>) intQueue4, true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 0, (-1), 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue6 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue16 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest8.FuzzTest_removeAll(intQueue16, intQueue22, (java.util.Collection<java.lang.Integer>) intList31, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue36 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection37 = null;
        fuzzTest8.FuzzTest_removeAll(intQueue35, intQueue36, intCollection37, true);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue45 = null;
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 2, 1, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest8.FuzzTest_removeAll(intQueue43, intQueue45, (java.util.Collection<java.lang.Integer>) intList52, true);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue60 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 10, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue66 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue76 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue82 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList91 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        fuzzTest68.FuzzTest_removeAll(intQueue76, intQueue82, (java.util.Collection<java.lang.Integer>) intList91, false);
        fuzzTest8.FuzzTest_removeAll(intQueue60, intQueue66, (java.util.Collection<java.lang.Integer>) intQueue82, false);
        java.util.Collection<java.lang.Integer> intCollection97 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue6, intQueue60, intCollection97, true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue17 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest9.FuzzTest_removeAll(intQueue17, intQueue23, (java.util.Collection<java.lang.Integer>) intList32, false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue50 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList59 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest36.FuzzTest_removeAll(intQueue44, intQueue50, (java.util.Collection<java.lang.Integer>) intList59, false);
        fuzzTest7.FuzzTest_removeAll(intQueue8, intQueue23, (java.util.Collection<java.lang.Integer>) intQueue44, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = null;
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
        fuzzTest66.FuzzTest_removeAll(intQueue74, intQueue80, (java.util.Collection<java.lang.Integer>) intList89, false);
        fuzzTest6.FuzzTest_removeAll(intQueue8, intQueue65, (java.util.Collection<java.lang.Integer>) intQueue74, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue3, intQueue5, (java.util.Collection<java.lang.Integer>) intQueue8, false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.util.Collection<java.lang.Integer> intCollection7 = null;
        fuzzTest1.FuzzTest_removeAll(intQueue2, intQueue5, intCollection7, false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest10.FuzzTest_removeAll(intQueue18, intQueue24, (java.util.Collection<java.lang.Integer>) intList33, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue38 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection39 = null;
        fuzzTest10.FuzzTest_removeAll(intQueue37, intQueue38, intCollection39, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList66 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest43.FuzzTest_removeAll(intQueue51, intQueue57, (java.util.Collection<java.lang.Integer>) intList66, false);
        java.util.Collection<java.lang.Integer> intCollection70 = null;
        fuzzTest10.FuzzTest_removeAll(intQueue42, intQueue51, intCollection70, false);
        java.util.Collection<java.lang.Integer> intCollection73 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue5, intQueue51, intCollection73, false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
        fuzzTest0.FuzzTest_removeAll(intQueue8, intQueue14, (java.util.Collection<java.lang.Integer>) intList23, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue28 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_removeAll(intQueue27, intQueue28, (java.util.Collection<java.lang.Integer>) intQueue29, false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = null;
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.util.Collection<java.lang.Integer> intCollection39 = null;
        fuzzTest33.FuzzTest_removeAll(intQueue34, intQueue37, intCollection39, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = null;
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.util.Collection<java.lang.Integer> intCollection49 = null;
        fuzzTest43.FuzzTest_removeAll(intQueue44, intQueue47, intCollection49, false);
        fuzzTest32.FuzzTest_removeAll(intQueue34, intQueue42, (java.util.Collection<java.lang.Integer>) intQueue47, true);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue58 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue62 = null;
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.util.Collection<java.lang.Integer> intCollection67 = null;
        fuzzTest61.FuzzTest_removeAll(intQueue62, intQueue65, intCollection67, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue70 = null;
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue72 = null;
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue75 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        java.util.Collection<java.lang.Integer> intCollection77 = null;
        fuzzTest71.FuzzTest_removeAll(intQueue72, intQueue75, intCollection77, false);
        fuzzTest60.FuzzTest_removeAll(intQueue62, intQueue70, (java.util.Collection<java.lang.Integer>) intQueue75, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_removeAll(intQueue58, intQueue75, (java.util.Collection<java.lang.Integer>) intQueue82, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue85 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection86 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue75, intQueue85, intCollection86, true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = null;
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.util.Collection<java.lang.Integer> intCollection6 = null;
        fuzzTest0.FuzzTest_removeAll(intQueue1, intQueue4, intCollection6, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue10 = null;
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 10, (-1), 2, 10, 100 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest0.FuzzTest_removeAll(intQueue9, intQueue10, (java.util.Collection<java.lang.Integer>) intList18, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue22 = null;
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1), 100, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_removeAll(intQueue22, intQueue27, (java.util.Collection<java.lang.Integer>) intQueue29, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = null;
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.util.Collection<java.lang.Integer> intCollection39 = null;
        fuzzTest33.FuzzTest_removeAll(intQueue34, intQueue37, intCollection39, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = null;
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.util.Collection<java.lang.Integer> intCollection49 = null;
        fuzzTest43.FuzzTest_removeAll(intQueue44, intQueue47, intCollection49, false);
        fuzzTest32.FuzzTest_removeAll(intQueue34, intQueue42, (java.util.Collection<java.lang.Integer>) intQueue47, true);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue58 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue62 = null;
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.util.Collection<java.lang.Integer> intCollection67 = null;
        fuzzTest61.FuzzTest_removeAll(intQueue62, intQueue65, intCollection67, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue70 = null;
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue72 = null;
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue75 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        java.util.Collection<java.lang.Integer> intCollection77 = null;
        fuzzTest71.FuzzTest_removeAll(intQueue72, intQueue75, intCollection77, false);
        fuzzTest60.FuzzTest_removeAll(intQueue62, intQueue70, (java.util.Collection<java.lang.Integer>) intQueue75, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_removeAll(intQueue58, intQueue75, (java.util.Collection<java.lang.Integer>) intQueue82, true);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue85 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 2, 2, (-1), 100 };
        java.util.ArrayList<java.lang.Integer> intList91 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue58, intQueue85, (java.util.Collection<java.lang.Integer>) intList91, false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue15 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest1.FuzzTest_removeAll(intQueue9, intQueue15, (java.util.Collection<java.lang.Integer>) intList24, false);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 10, 2, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue49 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList58 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest35.FuzzTest_removeAll(intQueue43, intQueue49, (java.util.Collection<java.lang.Integer>) intList58, false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue70 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue76 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList85 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest62.FuzzTest_removeAll(intQueue70, intQueue76, (java.util.Collection<java.lang.Integer>) intList85, false);
        fuzzTest1.FuzzTest_removeAll(intQueue33, intQueue43, (java.util.Collection<java.lang.Integer>) intQueue70, false);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue91 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection92 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeAll(intQueue70, intQueue91, intCollection92, false);
    }
}

