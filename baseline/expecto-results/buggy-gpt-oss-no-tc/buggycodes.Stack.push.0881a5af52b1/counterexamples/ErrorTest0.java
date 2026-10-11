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
        buggycodes.mut_000.Stack<java.lang.Integer> intList3 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList7 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_push(intList3, intList7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList15 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList19 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_push(intList15, intList19, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList27 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList31 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_push(intList27, intList31, (java.lang.Integer) 1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList19, intList31, (java.lang.Integer) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 0 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList4 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Stack<java.lang.Integer> intList7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList11 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList15 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest8.FuzzTest_push(intList11, intList15, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest6.FuzzTest_push(intList7, intList11, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList26 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList30 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest23.FuzzTest_push(intList26, intList30, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList38 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList42 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_push(intList38, intList42, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_000.Stack<java.lang.Integer> intList50 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest23.FuzzTest_push(intList42, intList50, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList58 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList62 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest55.FuzzTest_push(intList58, intList62, (java.lang.Integer) 1, (java.lang.Integer) 1);
        buggycodes.mut_000.Stack<java.lang.Integer> intList67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList71 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList75 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest68.FuzzTest_push(intList71, intList75, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest55.FuzzTest_push(intList67, intList75, (java.lang.Integer) 1, (java.lang.Integer) 0);
        fuzzTest6.FuzzTest_push(intList50, intList75, (java.lang.Integer) 100, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList4, intList75, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList3 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList7 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_push(intList3, intList7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        buggycodes.mut_000.Stack<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList16 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList20 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_push(intList16, intList20, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_push(intList12, intList20, (java.lang.Integer) 1, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList31 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList35 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest28.FuzzTest_push(intList31, intList35, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList43 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList47 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_push(intList43, intList47, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList55 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList59 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest52.FuzzTest_push(intList55, intList59, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_000.Stack<java.lang.Integer> intList67 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest40.FuzzTest_push(intList59, intList67, (java.lang.Integer) 1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10, 0, 0 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList76 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest28.FuzzTest_push(intList67, intList76, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList84 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList88 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest81.FuzzTest_push(intList84, intList88, (java.lang.Integer) 1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList76, intList88, (java.lang.Integer) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Stack<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList6 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList10 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzzTest3.FuzzTest_push(intList6, intList10, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_push(intList2, intList6, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Stack<java.lang.Integer> intList19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList23 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList27 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest20.FuzzTest_push(intList23, intList27, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest18.FuzzTest_push(intList19, intList23, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_push(intList6, intList19, (java.lang.Integer) 100, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Stack<java.lang.Integer> intList39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList43 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList47 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_push(intList43, intList47, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest38.FuzzTest_push(intList39, intList43, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggycodes.mut_000.Stack<java.lang.Integer> intList55 = null;
        buggycodes.mut_000.Stack<java.lang.Integer> intList56 = null;
        fuzzTest38.FuzzTest_push(intList55, intList56, (java.lang.Integer) 100, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList63 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList67 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest60.FuzzTest_push(intList63, intList67, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList75 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList79 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest72.FuzzTest_push(intList75, intList79, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest38.FuzzTest_push(intList67, intList75, (java.lang.Integer) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 1, 100, 0, 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList92 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList75, intList92, (java.lang.Integer) 10, (java.lang.Integer) 1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList3 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList7 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_push(intList3, intList7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList15 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList19 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_push(intList15, intList19, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_000.Stack<java.lang.Integer> intList27 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_push(intList19, intList27, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList35 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList39 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_push(intList35, intList39, (java.lang.Integer) 1, (java.lang.Integer) 1);
        buggycodes.mut_000.Stack<java.lang.Integer> intList44 = null;
        fuzzTest0.FuzzTest_push(intList35, intList44, (java.lang.Integer) 1, (java.lang.Integer) 1);
        buggycodes.mut_000.Stack<java.lang.Integer> intList48 = null;
        buggycodes.mut_000.Stack<java.lang.Integer> intList49 = null;
        fuzzTest0.FuzzTest_push(intList48, intList49, (java.lang.Integer) 100, (java.lang.Integer) 0);
        buggycodes.mut_000.Stack<java.lang.Integer> intList53 = null;
        buggycodes.mut_000.Stack<java.lang.Integer> intList54 = null;
        fuzzTest0.FuzzTest_push(intList53, intList54, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Stack<java.lang.Integer> intList58 = null;
        buggycodes.mut_000.Stack<java.lang.Integer> intList59 = null;
        fuzzTest0.FuzzTest_push(intList58, intList59, (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList66 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList70 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest63.FuzzTest_push(intList66, intList70, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 100, 10, 10, 1 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList81 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList66, intList81, (java.lang.Integer) 1, (java.lang.Integer) 10);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Stack<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList5 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList9 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_push(intList5, intList9, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_push(intList1, intList5, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList20 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList24 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_push(intList20, intList24, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList32 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList36 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_push(intList32, intList36, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList44 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList48 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_push(intList44, intList48, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList56 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList60 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_push(intList56, intList60, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_000.Stack<java.lang.Integer> intList68 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest41.FuzzTest_push(intList60, intList68, (java.lang.Integer) 1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10, 0, 0 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList77 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest29.FuzzTest_push(intList68, intList77, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList24, intList77, (java.lang.Integer) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Stack<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList5 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList9 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_push(intList5, intList9, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_push(intList1, intList5, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList20 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList24 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_push(intList20, intList24, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Stack<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList34 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList38 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_push(intList34, intList38, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest29.FuzzTest_push(intList30, intList34, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggycodes.mut_000.Stack<java.lang.Integer> intList46 = null;
        buggycodes.mut_000.Stack<java.lang.Integer> intList47 = null;
        fuzzTest29.FuzzTest_push(intList46, intList47, (java.lang.Integer) 100, (java.lang.Integer) 100);
        buggycodes.mut_000.Stack<java.lang.Integer> intList51 = null;
        buggycodes.mut_000.Stack<java.lang.Integer> intList52 = null;
        fuzzTest29.FuzzTest_push(intList51, intList52, (java.lang.Integer) 100, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList59 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList63 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_push(intList59, intList63, (java.lang.Integer) 1, (java.lang.Integer) 1);
        buggycodes.mut_000.Stack<java.lang.Integer> intList68 = null;
        fuzzTest29.FuzzTest_push(intList59, intList68, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList20, intList59, (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList3 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList7 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_push(intList3, intList7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        buggycodes.mut_000.Stack<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList16 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList20 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_push(intList16, intList20, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_push(intList12, intList20, (java.lang.Integer) 1, (java.lang.Integer) 0);
        buggycodes.mut_000.Stack<java.lang.Integer> intList28 = null;
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 1, 1 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList33 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest0.FuzzTest_push(intList28, intList33, (java.lang.Integer) 0, (java.lang.Integer) 100);
        buggycodes.mut_000.Stack<java.lang.Integer> intList38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList42 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList46 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest39.FuzzTest_push(intList42, intList46, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_push(intList38, intList46, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10, 100, 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList58 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList63 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList67 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest60.FuzzTest_push(intList63, intList67, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList75 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList79 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest72.FuzzTest_push(intList75, intList79, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_000.Stack<java.lang.Integer> intList87 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest60.FuzzTest_push(intList79, intList87, (java.lang.Integer) 1, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList58, intList87, (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Stack<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList5 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList9 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_push(intList5, intList9, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_push(intList1, intList5, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Stack<java.lang.Integer> intList18 = null;
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList22 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList26 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest19.FuzzTest_push(intList22, intList26, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_push(intList18, intList22, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggycodes.mut_000.Stack<java.lang.Integer> intList34 = null;
        fuzzTest0.FuzzTest_push(intList18, intList34, (java.lang.Integer) 100, (java.lang.Integer) 10);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 1, 100, 0 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList43 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        buggycodes.mut_000.Stack<java.lang.Integer> intList45 = null;
        fuzzTest0.FuzzTest_push(intList43, intList45, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        buggycodes.mut_000.Stack<java.lang.Integer> intList49 = null;
        buggycodes.mut_000.Stack<java.lang.Integer> intList50 = null;
        fuzzTest0.FuzzTest_push(intList49, intList50, (java.lang.Integer) 10, (java.lang.Integer) 0);
        buggycodes.mut_000.Stack<java.lang.Integer> intList54 = null;
        buggycodes.mut_000.Stack<java.lang.Integer> intList55 = null;
        fuzzTest0.FuzzTest_push(intList54, intList55, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList62 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList66 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest59.FuzzTest_push(intList62, intList66, (java.lang.Integer) 1, (java.lang.Integer) 1);
        buggycodes.mut_000.Stack<java.lang.Integer> intList71 = null;
        fuzzTest0.FuzzTest_push(intList62, intList71, (java.lang.Integer) 100, (java.lang.Integer) 0);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList77 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList82 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Stack<java.lang.Integer> intList86 = new buggycodes.mut_000.Stack<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest79.FuzzTest_push(intList82, intList86, (java.lang.Integer) 1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList77, intList82, (java.lang.Integer) 100, (java.lang.Integer) 1);
    }
}

