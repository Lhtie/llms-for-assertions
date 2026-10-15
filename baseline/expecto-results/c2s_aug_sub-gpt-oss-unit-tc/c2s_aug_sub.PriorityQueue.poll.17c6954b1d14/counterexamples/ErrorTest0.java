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
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue8, intQueue14, (java.lang.Integer) 2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue6 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = null;
        fuzzTest0.FuzzTest_poll(intQueue6, intQueue8, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 2, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue15 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = null;
        fuzzTest17.FuzzTest_poll(intQueue23, intQueue25, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue15, intQueue23, (java.lang.Integer) 10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_poll(intQueue2, intQueue3, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzzTest0.FuzzTest_poll(intQueue3, intQueue8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue20 = null;
        fuzzTest12.FuzzTest_poll(intQueue18, intQueue20, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_poll(intQueue25, intQueue26, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue30 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_poll(intQueue30, intQueue31, (java.lang.Integer) (-1));
        fuzzTest23.FuzzTest_poll(intQueue26, intQueue31, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue38 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_poll(intQueue38, intQueue39, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        fuzzTest36.FuzzTest_poll(intQueue39, intQueue44, (java.lang.Integer) 0);
        fuzzTest12.FuzzTest_poll(intQueue31, intQueue39, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue52 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_poll(intQueue52, intQueue53, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_poll(intQueue57, intQueue58, (java.lang.Integer) (-1));
        fuzzTest50.FuzzTest_poll(intQueue53, intQueue58, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_poll(intQueue31, intQueue53, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue67 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_poll(intQueue67, intQueue68, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue73 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzzTest65.FuzzTest_poll(intQueue68, intQueue73, (java.lang.Integer) 0);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 1, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue80 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue73, intQueue80, (java.lang.Integer) 100);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_poll(intQueue3, intQueue4, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_poll(intQueue8, intQueue9, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_poll(intQueue4, intQueue9, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue20 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue22 = null;
        fuzzTest14.FuzzTest_poll(intQueue20, intQueue22, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_poll(intQueue27, intQueue28, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue32 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_poll(intQueue32, intQueue33, (java.lang.Integer) (-1));
        fuzzTest25.FuzzTest_poll(intQueue28, intQueue33, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_poll(intQueue40, intQueue41, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue46 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        fuzzTest38.FuzzTest_poll(intQueue41, intQueue46, (java.lang.Integer) 0);
        fuzzTest14.FuzzTest_poll(intQueue33, intQueue41, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_poll(intQueue4, intQueue33, (java.lang.Integer) 0);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_poll(intQueue57, intQueue58, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzzTest55.FuzzTest_poll(intQueue58, intQueue63, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_poll(intQueue54, intQueue63, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue71 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_poll(intQueue71, intQueue72, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue76 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_poll(intQueue76, intQueue77, (java.lang.Integer) (-1));
        fuzzTest69.FuzzTest_poll(intQueue72, intQueue77, (java.lang.Integer) 0);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 100, 1, 0, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue87 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue87, intArray86);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue72, intQueue87, (java.lang.Integer) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue10 = null;
        fuzzTest2.FuzzTest_poll(intQueue8, intQueue10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue15 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_poll(intQueue15, intQueue16, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue22 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_poll(intQueue22, intQueue23, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_poll(intQueue27, intQueue28, (java.lang.Integer) (-1));
        fuzzTest20.FuzzTest_poll(intQueue23, intQueue28, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue39 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = null;
        fuzzTest33.FuzzTest_poll(intQueue39, intQueue41, (java.lang.Integer) (-1));
        fuzzTest19.FuzzTest_poll(intQueue23, intQueue41, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue52 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue54 = null;
        fuzzTest46.FuzzTest_poll(intQueue52, intQueue54, (java.lang.Integer) (-1));
        fuzzTest14.FuzzTest_poll(intQueue23, intQueue52, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue61 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_poll(intQueue61, intQueue62, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue67 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        fuzzTest59.FuzzTest_poll(intQueue62, intQueue67, (java.lang.Integer) 0);
        fuzzTest13.FuzzTest_poll(intQueue52, intQueue62, (java.lang.Integer) (-1));
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_poll(intQueue52, intQueue73, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue1, intQueue52, (java.lang.Integer) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_poll(intQueue2, intQueue3, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue7 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_poll(intQueue7, intQueue8, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_poll(intQueue3, intQueue8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue21 = null;
        fuzzTest13.FuzzTest_poll(intQueue19, intQueue21, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue26 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_poll(intQueue26, intQueue27, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue31 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_poll(intQueue31, intQueue32, (java.lang.Integer) (-1));
        fuzzTest24.FuzzTest_poll(intQueue27, intQueue32, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue39 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_poll(intQueue39, intQueue40, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue45 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        fuzzTest37.FuzzTest_poll(intQueue40, intQueue45, (java.lang.Integer) 0);
        fuzzTest13.FuzzTest_poll(intQueue32, intQueue40, (java.lang.Integer) 10);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = null;
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue54 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_poll(intQueue54, intQueue55, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue59 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_poll(intQueue59, intQueue60, (java.lang.Integer) (-1));
        fuzzTest52.FuzzTest_poll(intQueue55, intQueue60, (java.lang.Integer) 0);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 10, (-1), 2, 1, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue73 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzzTest52.FuzzTest_poll(intQueue65, intQueue73, (java.lang.Integer) 1);
        fuzzTest13.FuzzTest_poll(intQueue51, intQueue65, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue85 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue87 = null;
        fuzzTest79.FuzzTest_poll(intQueue85, intQueue87, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue65, intQueue85, (java.lang.Integer) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_poll(intQueue2, intQueue3, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue7 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_poll(intQueue7, intQueue8, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_poll(intQueue3, intQueue8, (java.lang.Integer) 0);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue13 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 10, (-1), 2, 1, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue21 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzzTest0.FuzzTest_poll(intQueue13, intQueue21, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_poll(intQueue27, intQueue28, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue32 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_poll(intQueue32, intQueue33, (java.lang.Integer) (-1));
        fuzzTest25.FuzzTest_poll(intQueue28, intQueue33, (java.lang.Integer) 0);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue38 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 10, (-1), 2, 1, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue46 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        fuzzTest25.FuzzTest_poll(intQueue38, intQueue46, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_poll(intQueue51, intQueue52, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue58 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_poll(intQueue58, intQueue59, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_poll(intQueue63, intQueue64, (java.lang.Integer) (-1));
        fuzzTest56.FuzzTest_poll(intQueue59, intQueue64, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue75 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = null;
        fuzzTest69.FuzzTest_poll(intQueue75, intQueue77, (java.lang.Integer) (-1));
        fuzzTest55.FuzzTest_poll(intQueue59, intQueue77, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue88 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue88, intArray87);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue90 = null;
        fuzzTest82.FuzzTest_poll(intQueue88, intQueue90, (java.lang.Integer) (-1));
        fuzzTest50.FuzzTest_poll(intQueue59, intQueue88, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue46, intQueue88, (java.lang.Integer) 2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_poll(intQueue2, intQueue3, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzzTest0.FuzzTest_poll(intQueue3, intQueue8, (java.lang.Integer) 0);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue12 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue13 = null;
        fuzzTest0.FuzzTest_poll(intQueue12, intQueue13, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue17 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_poll(intQueue17, intQueue18, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue23 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_poll(intQueue23, intQueue24, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue28 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_poll(intQueue28, intQueue29, (java.lang.Integer) (-1));
        fuzzTest21.FuzzTest_poll(intQueue24, intQueue29, (java.lang.Integer) 0);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 10, (-1), 2, 1, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        fuzzTest21.FuzzTest_poll(intQueue34, intQueue42, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_poll(intQueue17, intQueue42, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue50 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_poll(intQueue50, intQueue51, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue55 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_poll(intQueue55, intQueue56, (java.lang.Integer) (-1));
        fuzzTest48.FuzzTest_poll(intQueue51, intQueue56, (java.lang.Integer) 0);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue61 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 2, 10, (-1), 2, 1, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue69 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        fuzzTest48.FuzzTest_poll(intQueue61, intQueue69, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue75 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_poll(intQueue75, intQueue76, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue80 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_poll(intQueue80, intQueue81, (java.lang.Integer) (-1));
        fuzzTest73.FuzzTest_poll(intQueue76, intQueue81, (java.lang.Integer) 0);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue86 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 2, 10, (-1), 2, 1, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue94 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue94, intArray93);
        fuzzTest73.FuzzTest_poll(intQueue86, intQueue94, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue69, intQueue94, (java.lang.Integer) 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_poll(intQueue2, intQueue3, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzzTest0.FuzzTest_poll(intQueue3, intQueue8, (java.lang.Integer) 0);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1), 2, (-1), 100, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue29 = null;
        fuzzTest21.FuzzTest_poll(intQueue27, intQueue29, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_poll(intQueue34, intQueue35, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzzTest32.FuzzTest_poll(intQueue35, intQueue40, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue46 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_poll(intQueue46, intQueue47, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_poll(intQueue51, intQueue52, (java.lang.Integer) (-1));
        fuzzTest44.FuzzTest_poll(intQueue47, intQueue52, (java.lang.Integer) 0);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 2, 10, (-1), 2, 1, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        fuzzTest44.FuzzTest_poll(intQueue57, intQueue65, (java.lang.Integer) 1);
        fuzzTest21.FuzzTest_poll(intQueue40, intQueue65, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue19, intQueue65, (java.lang.Integer) 10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_poll(intQueue2, intQueue3, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzzTest0.FuzzTest_poll(intQueue3, intQueue8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue13 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_poll(intQueue13, intQueue14, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_poll(intQueue19, intQueue20, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_poll(intQueue24, intQueue25, (java.lang.Integer) (-1));
        fuzzTest17.FuzzTest_poll(intQueue20, intQueue25, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue31 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_poll(intQueue31, intQueue32, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue38 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_poll(intQueue38, intQueue39, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_poll(intQueue43, intQueue44, (java.lang.Integer) (-1));
        fuzzTest36.FuzzTest_poll(intQueue39, intQueue44, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue55 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = null;
        fuzzTest49.FuzzTest_poll(intQueue55, intQueue57, (java.lang.Integer) (-1));
        fuzzTest35.FuzzTest_poll(intQueue39, intQueue57, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue68 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue70 = null;
        fuzzTest62.FuzzTest_poll(intQueue68, intQueue70, (java.lang.Integer) (-1));
        fuzzTest30.FuzzTest_poll(intQueue39, intQueue68, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_poll(intQueue25, intQueue68, (java.lang.Integer) 1);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = null;
        fuzzTest0.FuzzTest_poll(intQueue68, intQueue77, (java.lang.Integer) (-1));
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue87 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue87, intArray86);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue89 = null;
        fuzzTest81.FuzzTest_poll(intQueue87, intQueue89, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue80, intQueue87, (java.lang.Integer) 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_poll(intQueue2, intQueue3, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue7 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_poll(intQueue7, intQueue8, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_poll(intQueue3, intQueue8, (java.lang.Integer) 0);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 2, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue17 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue21 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_poll(intQueue21, intQueue22, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue26 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_poll(intQueue26, intQueue27, (java.lang.Integer) (-1));
        fuzzTest19.FuzzTest_poll(intQueue22, intQueue27, (java.lang.Integer) 0);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue32 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 10, (-1), 2, 1, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzzTest19.FuzzTest_poll(intQueue32, intQueue40, (java.lang.Integer) 1);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_poll(intQueue47, intQueue48, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue53 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        fuzzTest45.FuzzTest_poll(intQueue48, intQueue53, (java.lang.Integer) 0);
        fuzzTest19.FuzzTest_poll(intQueue44, intQueue53, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue17, intQueue53, (java.lang.Integer) (-1));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_poll(intQueue1, intQueue2, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue6 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_poll(intQueue6, intQueue7, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue13 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_poll(intQueue13, intQueue14, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue18 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_poll(intQueue18, intQueue19, (java.lang.Integer) (-1));
        fuzzTest11.FuzzTest_poll(intQueue14, intQueue19, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue30 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue32 = null;
        fuzzTest24.FuzzTest_poll(intQueue30, intQueue32, (java.lang.Integer) (-1));
        fuzzTest10.FuzzTest_poll(intQueue14, intQueue32, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue45 = null;
        fuzzTest37.FuzzTest_poll(intQueue43, intQueue45, (java.lang.Integer) (-1));
        fuzzTest5.FuzzTest_poll(intQueue14, intQueue43, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_poll(intQueue51, intQueue52, (java.lang.Integer) (-1));
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue55 = null;
        fuzzTest5.FuzzTest_poll(intQueue52, intQueue55, (java.lang.Integer) 0);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue61 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_poll(intQueue61, intQueue62, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue66 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_poll(intQueue66, intQueue67, (java.lang.Integer) (-1));
        fuzzTest59.FuzzTest_poll(intQueue62, intQueue67, (java.lang.Integer) 0);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue72 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 10, (-1), 2, 1, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue80 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        fuzzTest59.FuzzTest_poll(intQueue72, intQueue80, (java.lang.Integer) 1);
        fuzzTest5.FuzzTest_poll(intQueue58, intQueue72, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest86 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue92 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue92, intArray91);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue94 = null;
        fuzzTest86.FuzzTest_poll(intQueue92, intQueue94, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue72, intQueue92, (java.lang.Integer) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue6 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = null;
        fuzzTest0.FuzzTest_poll(intQueue6, intQueue8, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue13 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_poll(intQueue13, intQueue14, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue18 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_poll(intQueue18, intQueue19, (java.lang.Integer) (-1));
        fuzzTest11.FuzzTest_poll(intQueue14, intQueue19, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue26 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_poll(intQueue26, intQueue27, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue32 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        fuzzTest24.FuzzTest_poll(intQueue27, intQueue32, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_poll(intQueue19, intQueue27, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_poll(intQueue40, intQueue41, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue46 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        fuzzTest38.FuzzTest_poll(intQueue41, intQueue46, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue52 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_poll(intQueue52, intQueue53, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue58 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzzTest50.FuzzTest_poll(intQueue53, intQueue58, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_poll(intQueue63, intQueue64, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-1), 1, 2, 10, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue73 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzzTest50.FuzzTest_poll(intQueue63, intQueue73, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue46, intQueue73, (java.lang.Integer) 100);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_poll(intQueue4, intQueue5, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_poll(intQueue9, intQueue10, (java.lang.Integer) (-1));
        fuzzTest2.FuzzTest_poll(intQueue5, intQueue10, (java.lang.Integer) 0);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue15 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 10, (-1), 2, 1, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        fuzzTest2.FuzzTest_poll(intQueue15, intQueue23, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_poll(intQueue1, intQueue15, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = null;
        fuzzTest29.FuzzTest_poll(intQueue35, intQueue37, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_poll(intQueue42, intQueue43, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_poll(intQueue47, intQueue48, (java.lang.Integer) (-1));
        fuzzTest40.FuzzTest_poll(intQueue43, intQueue48, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue55 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_poll(intQueue55, intQueue56, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue61 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        fuzzTest53.FuzzTest_poll(intQueue56, intQueue61, (java.lang.Integer) 0);
        fuzzTest29.FuzzTest_poll(intQueue48, intQueue56, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue69 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_poll(intQueue69, intQueue70, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue75 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        fuzzTest67.FuzzTest_poll(intQueue70, intQueue75, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue80 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_poll(intQueue80, intQueue81, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { (-1), 1, 2, 10, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue90 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue90, intArray89);
        fuzzTest67.FuzzTest_poll(intQueue80, intQueue90, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue56, intQueue90, (java.lang.Integer) (-1));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue2 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_poll(intQueue2, intQueue3, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue7 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_poll(intQueue7, intQueue8, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_poll(intQueue3, intQueue8, (java.lang.Integer) 0);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue13 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 10, (-1), 2, 1, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue21 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzzTest0.FuzzTest_poll(intQueue13, intQueue21, (java.lang.Integer) 1);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue30 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_poll(intQueue30, intQueue31, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_poll(intQueue35, intQueue36, (java.lang.Integer) (-1));
        fuzzTest28.FuzzTest_poll(intQueue31, intQueue36, (java.lang.Integer) 0);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 10, (-1), 2, 1, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue49 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        fuzzTest28.FuzzTest_poll(intQueue41, intQueue49, (java.lang.Integer) 1);
        fuzzTest26.FuzzTest_poll(intQueue27, intQueue41, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_poll(intQueue25, intQueue27, (java.lang.Integer) 10);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue58 = null;
        fuzzTest0.FuzzTest_poll(intQueue57, intQueue58, (java.lang.Integer) 2);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue61 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue62 = null;
        fuzzTest0.FuzzTest_poll(intQueue61, intQueue62, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue66 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_poll(intQueue66, intQueue67, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 10, (-1), 0, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue76 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue67, intQueue76, (java.lang.Integer) (-1));
    }
}

