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
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue15 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue21 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList30 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest7.FuzzTest_PriorityQueue(intQueue15, intQueue21, (java.util.Collection<java.lang.Integer>) intList30);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue6, (java.util.Collection<java.lang.Integer>) intList30);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue48 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest34.FuzzTest_PriorityQueue(intQueue42, intQueue48, (java.util.Collection<java.lang.Integer>) intList57);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue60 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection61 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue48, intQueue60, intCollection61);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue15 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue21 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList30 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest7.FuzzTest_PriorityQueue(intQueue15, intQueue21, (java.util.Collection<java.lang.Integer>) intList30);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue6, (java.util.Collection<java.lang.Integer>) intList30);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = fuzztests.FuzzTest.makeFuzzInput();
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
        fuzzTest35.FuzzTest_PriorityQueue(intQueue43, intQueue49, (java.util.Collection<java.lang.Integer>) intList58);
        java.util.Collection<java.lang.Integer> intCollection61 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue34, intQueue43, intCollection61);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue7 = null;
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
        fuzzTest8.FuzzTest_PriorityQueue(intQueue16, intQueue22, (java.util.Collection<java.lang.Integer>) intList31);
        fuzzTest1.FuzzTest_PriorityQueue(intQueue5, intQueue7, (java.util.Collection<java.lang.Integer>) intList31);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection36 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue5, intQueue35, intCollection36);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.util.Collection<java.lang.Integer> intCollection6 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue1, intQueue4, intCollection6);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        fuzzTest27.FuzzTest_PriorityQueue(intQueue35, intQueue41, (java.util.Collection<java.lang.Integer>) intList50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue61 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue67 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList76 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest53.FuzzTest_PriorityQueue(intQueue61, intQueue67, (java.util.Collection<java.lang.Integer>) intList76);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_PriorityQueue(intQueue35, intQueue67, (java.util.Collection<java.lang.Integer>) intQueue79);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue81 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection82 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue79, intQueue81, intCollection82);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        fuzzTest1.FuzzTest_PriorityQueue(intQueue9, intQueue15, (java.util.Collection<java.lang.Integer>) intList24);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = null;
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
        fuzzTest28.FuzzTest_PriorityQueue(intQueue36, intQueue42, (java.util.Collection<java.lang.Integer>) intList51);
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
        fuzzTest54.FuzzTest_PriorityQueue(intQueue62, intQueue68, (java.util.Collection<java.lang.Integer>) intList77);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue80 = null;
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList85 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest28.FuzzTest_PriorityQueue(intQueue62, intQueue80, (java.util.Collection<java.lang.Integer>) intList85);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue15, intQueue27, (java.util.Collection<java.lang.Integer>) intQueue62);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue89 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue90 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection91 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue89, intQueue90, intCollection91);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue12 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest4.FuzzTest_PriorityQueue(intQueue12, intQueue18, (java.util.Collection<java.lang.Integer>) intList27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue36 = null;
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
        fuzzTest30.FuzzTest_PriorityQueue(intQueue34, intQueue36, (java.util.Collection<java.lang.Integer>) intList60);
        fuzzTest2.FuzzTest_PriorityQueue(intQueue3, intQueue12, (java.util.Collection<java.lang.Integer>) intQueue34);
        java.util.Collection<java.lang.Integer> intCollection65 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue1, intQueue34, intCollection65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue70 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue80 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue86 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList95 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList95, intArray94);
        fuzzTest72.FuzzTest_PriorityQueue(intQueue80, intQueue86, (java.util.Collection<java.lang.Integer>) intList95);
        java.util.Collection<java.lang.Integer> intCollection98 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue70, intQueue86, intCollection98);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
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
        fuzzTest3.FuzzTest_PriorityQueue(intQueue11, intQueue17, (java.util.Collection<java.lang.Integer>) intList26);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, (-1), (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest1.FuzzTest_PriorityQueue(intQueue2, intQueue11, (java.util.Collection<java.lang.Integer>) intList34);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue53 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue59 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList68 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest45.FuzzTest_PriorityQueue(intQueue53, intQueue59, (java.util.Collection<java.lang.Integer>) intList68);
        fuzzTest38.FuzzTest_PriorityQueue(intQueue42, intQueue44, (java.util.Collection<java.lang.Integer>) intList68);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue11, intQueue37, (java.util.Collection<java.lang.Integer>) intQueue44);
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
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue8, intQueue14, (java.util.Collection<java.lang.Integer>) intList23);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList49 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest26.FuzzTest_PriorityQueue(intQueue34, intQueue40, (java.util.Collection<java.lang.Integer>) intList49);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue52 = null;
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue34, intQueue52, (java.util.Collection<java.lang.Integer>) intList57);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue69 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue75 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList84 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest61.FuzzTest_PriorityQueue(intQueue69, intQueue75, (java.util.Collection<java.lang.Integer>) intList84);
        java.util.Collection<java.lang.Integer> intCollection87 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue60, intQueue75, intCollection87);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        fuzzTest3.FuzzTest_PriorityQueue(intQueue11, intQueue17, (java.util.Collection<java.lang.Integer>) intList26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest29.FuzzTest_PriorityQueue(intQueue37, intQueue43, (java.util.Collection<java.lang.Integer>) intList52);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue55 = null;
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList60 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest3.FuzzTest_PriorityQueue(intQueue37, intQueue55, (java.util.Collection<java.lang.Integer>) intList60);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue1, intQueue2, (java.util.Collection<java.lang.Integer>) intList60);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue64 = null;
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
        fuzzTest65.FuzzTest_PriorityQueue(intQueue73, intQueue79, (java.util.Collection<java.lang.Integer>) intList88);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue91 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_PriorityQueue(intQueue64, intQueue79, (java.util.Collection<java.lang.Integer>) intQueue91);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue93 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue94 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Collection<java.lang.Integer> intCollection95 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue93, intQueue94, intCollection95);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue6 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = null;
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
        fuzzTest9.FuzzTest_PriorityQueue(intQueue17, intQueue23, (java.util.Collection<java.lang.Integer>) intList32);
        fuzzTest2.FuzzTest_PriorityQueue(intQueue6, intQueue8, (java.util.Collection<java.lang.Integer>) intList32);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue46 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue52 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList61 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest38.FuzzTest_PriorityQueue(intQueue46, intQueue52, (java.util.Collection<java.lang.Integer>) intList61);
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
        fuzzTest64.FuzzTest_PriorityQueue(intQueue72, intQueue78, (java.util.Collection<java.lang.Integer>) intList87);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue90 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_PriorityQueue(intQueue46, intQueue78, (java.util.Collection<java.lang.Integer>) intQueue90);
        java.util.Collection<java.lang.Integer> intCollection92 = null;
        fuzzTest2.FuzzTest_PriorityQueue(intQueue36, intQueue46, intCollection92);
        java.util.Collection<java.lang.Integer> intCollection94 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue1, intQueue46, intCollection94);
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
        fuzzTest0.FuzzTest_PriorityQueue(intQueue8, intQueue14, (java.util.Collection<java.lang.Integer>) intList23);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100, (-1), 0, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue32 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue48 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest34.FuzzTest_PriorityQueue(intQueue42, intQueue48, (java.util.Collection<java.lang.Integer>) intList57);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue68 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue74 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList83 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest60.FuzzTest_PriorityQueue(intQueue68, intQueue74, (java.util.Collection<java.lang.Integer>) intList83);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue32, intQueue48, (java.util.Collection<java.lang.Integer>) intQueue74);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue87 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 100, 2, 2, 100, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue94 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue94, intArray93);
        java.util.Collection<java.lang.Integer> intCollection96 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue87, intQueue94, intCollection96);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        fuzzTest1.FuzzTest_PriorityQueue(intQueue9, intQueue15, (java.util.Collection<java.lang.Integer>) intList24);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest29.FuzzTest_PriorityQueue(intQueue37, intQueue43, (java.util.Collection<java.lang.Integer>) intList52);
        fuzzTest1.FuzzTest_PriorityQueue(intQueue27, intQueue28, (java.util.Collection<java.lang.Integer>) intList52);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = null;
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
        fuzzTest58.FuzzTest_PriorityQueue(intQueue66, intQueue72, (java.util.Collection<java.lang.Integer>) intList81);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 0, (-1), (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList89 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        fuzzTest56.FuzzTest_PriorityQueue(intQueue57, intQueue66, (java.util.Collection<java.lang.Integer>) intList89);
        java.util.Collection<java.lang.Integer> intCollection92 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue27, intQueue66, intCollection92);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest3.FuzzTest_PriorityQueue(intQueue11, intQueue17, (java.util.Collection<java.lang.Integer>) intList26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest29.FuzzTest_PriorityQueue(intQueue37, intQueue43, (java.util.Collection<java.lang.Integer>) intList52);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_PriorityQueue(intQueue11, intQueue43, (java.util.Collection<java.lang.Integer>) intQueue55);
        java.util.Collection<java.lang.Integer> intCollection57 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue1, intQueue55, intCollection57);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        fuzzTest1.FuzzTest_PriorityQueue(intQueue9, intQueue15, (java.util.Collection<java.lang.Integer>) intList24);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest29.FuzzTest_PriorityQueue(intQueue37, intQueue43, (java.util.Collection<java.lang.Integer>) intList52);
        fuzzTest1.FuzzTest_PriorityQueue(intQueue27, intQueue28, (java.util.Collection<java.lang.Integer>) intList52);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue62 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue64 = null;
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
        fuzzTest65.FuzzTest_PriorityQueue(intQueue73, intQueue79, (java.util.Collection<java.lang.Integer>) intList88);
        fuzzTest58.FuzzTest_PriorityQueue(intQueue62, intQueue64, (java.util.Collection<java.lang.Integer>) intList88);
        fuzzTest1.FuzzTest_PriorityQueue(intQueue56, intQueue57, (java.util.Collection<java.lang.Integer>) intQueue62);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue95 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue95, intArray94);
        java.util.Collection<java.lang.Integer> intCollection97 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue56, intQueue95, intCollection97);
    }
}

