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
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = null;
        fuzzTest15.FuzzTest_add(intList21, intList23, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = null;
        fuzzTest27.FuzzTest_add(intList33, intList35, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest14.FuzzTest_add(intList21, intList35, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest12.FuzzTest_add(intList13, intList35, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = null;
        fuzzTest49.FuzzTest_add(intList55, intList57, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList67 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList69 = null;
        fuzzTest61.FuzzTest_add(intList67, intList69, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest48.FuzzTest_add(intList55, intList69, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest46.FuzzTest_add(intList47, intList69, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(intList69, intList79, (int) (byte) 100, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList13, intList79, (int) (byte) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_add(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest25.FuzzTest_add(intList31, intList33, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_add(intList19, intList33, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList33, intList40, (int) (byte) 100, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList54 = null;
        fuzzTest46.FuzzTest_add(intList52, intList54, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList66 = null;
        fuzzTest58.FuzzTest_add(intList64, intList66, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest45.FuzzTest_add(intList52, intList66, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList79 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList81 = null;
        fuzzTest73.FuzzTest_add(intList79, intList81, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest44.FuzzTest_add(intList66, intList79, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList90 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList79, intList90, (int) (byte) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = null;
        fuzzTest4.FuzzTest_add(intList10, intList12, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = null;
        fuzzTest16.FuzzTest_add(intList22, intList24, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest3.FuzzTest_add(intList10, intList24, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_add(intList2, intList24, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList24, intList34, (int) (byte) 100, (java.lang.Integer) 1);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 2, 1, 0, 0, 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, (-1) };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList45, intList50, 10, (java.lang.Integer) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, (-1), 1, 0, 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest21.FuzzTest_add(intList27, intList29, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList41 = null;
        fuzzTest33.FuzzTest_add(intList39, intList41, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest20.FuzzTest_add(intList27, intList41, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = null;
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest49.FuzzTest_add(intList50, intList55, (int) (short) 10, (java.lang.Integer) 10);
        fuzzTest20.FuzzTest_add(intList48, intList55, (-1), (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList18, intList55, (int) ' ', (java.lang.Integer) 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_add(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = null;
        fuzzTest11.FuzzTest_add(intList17, intList19, (int) (byte) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, 2 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList17, intList26, (int) 'a', (java.lang.Integer) 2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = null;
        fuzzTest6.FuzzTest_add(intList12, intList14, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = null;
        fuzzTest18.FuzzTest_add(intList24, intList26, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest5.FuzzTest_add(intList12, intList26, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest3.FuzzTest_add(intList4, intList26, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(intList26, intList36, (int) (byte) 100, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList49 = null;
        fuzzTest41.FuzzTest_add(intList47, intList49, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest2.FuzzTest_add(intList40, intList49, 2, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList1, intList40, (int) (byte) 10, (java.lang.Integer) 2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = null;
        fuzzTest4.FuzzTest_add(intList10, intList12, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = null;
        fuzzTest16.FuzzTest_add(intList22, intList24, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest3.FuzzTest_add(intList10, intList24, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_add(intList2, intList24, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList24, intList34, (int) (byte) 100, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = null;
        fuzzTest39.FuzzTest_add(intList45, intList47, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList38, intList47, 2, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList54 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList54, intList55, (int) ' ', (java.lang.Integer) 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_add(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest25.FuzzTest_add(intList31, intList33, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest38.FuzzTest_add(intList44, intList46, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList58 = null;
        fuzzTest50.FuzzTest_add(intList56, intList58, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest37.FuzzTest_add(intList44, intList58, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_add(intList58, intList65, (int) (byte) 100, (java.lang.Integer) 0);
        fuzzTest12.FuzzTest_add(intList19, intList58, (int) (byte) 100, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = null;
        fuzzTest0.FuzzTest_add(intList19, intList72, (int) (byte) 0, (java.lang.Integer) 2);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList79 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList81 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList79, intList81, 100, (java.lang.Integer) 2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_add(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest12.FuzzTest_add(intList18, intList20, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList11, intList18, (int) 'a', (java.lang.Integer) (-1));
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = null;
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest33.FuzzTest_add(intList34, intList39, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList53 = null;
        fuzzTest45.FuzzTest_add(intList51, intList53, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest33.FuzzTest_add(intList44, intList51, (int) 'a', (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList31, intList51, (int) '#', (java.lang.Integer) 100);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_add(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest25.FuzzTest_add(intList31, intList33, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_add(intList19, intList33, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList33, intList40, (int) (byte) 100, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = null;
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 100, (-1) };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest0.FuzzTest_add(intList44, intList50, (int) '4', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList63 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest57.FuzzTest_add(intList63, intList65, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList75 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList77 = null;
        fuzzTest69.FuzzTest_add(intList75, intList77, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest56.FuzzTest_add(intList63, intList77, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList84 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList85 = null;
        fuzzTest56.FuzzTest_add(intList84, intList85, (int) '4', (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList55, intList84, (int) (byte) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = null;
        fuzzTest15.FuzzTest_add(intList21, intList23, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = null;
        fuzzTest27.FuzzTest_add(intList33, intList35, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest14.FuzzTest_add(intList21, intList35, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest12.FuzzTest_add(intList13, intList35, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList53 = null;
        fuzzTest45.FuzzTest_add(intList51, intList53, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList35, intList51, (int) (byte) 1, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList60 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList61 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList60, intList61, (int) (byte) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = null;
        fuzzTest6.FuzzTest_add(intList12, intList14, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = null;
        fuzzTest18.FuzzTest_add(intList24, intList26, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest5.FuzzTest_add(intList12, intList26, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest3.FuzzTest_add(intList4, intList26, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(intList26, intList36, (int) (byte) 100, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList1, intList36, (int) ' ', (java.lang.Integer) 1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_add(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest25.FuzzTest_add(intList31, intList33, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_add(intList19, intList33, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList33, intList40, (int) (byte) 100, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = null;
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 100, (-1) };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest0.FuzzTest_add(intList44, intList50, (int) '4', (java.lang.Integer) (-1));
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10, 2, 1, 0, (-1), 2 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList62 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, (-1), 2, 0, 2 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList70 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList62, intList70, (int) (byte) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_add(intList7, intList9, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_add(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList7, intList21, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest0.FuzzTest_add(intList28, intList29, (int) ' ', (java.lang.Integer) 10);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList36, intList38, (int) '4', (java.lang.Integer) (-1));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList25 = null;
        fuzzTest17.FuzzTest_add(intList23, intList25, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList37 = null;
        fuzzTest29.FuzzTest_add(intList35, intList37, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest16.FuzzTest_add(intList23, intList37, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest14.FuzzTest_add(intList15, intList37, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(intList37, intList47, (int) (byte) 100, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList12, intList37, (int) (byte) 1, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = null;
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList61 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest55.FuzzTest_add(intList56, intList61, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList73 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList75 = null;
        fuzzTest67.FuzzTest_add(intList73, intList75, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest55.FuzzTest_add(intList66, intList73, (int) 'a', (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList54, intList73, (int) (short) 10, (java.lang.Integer) 1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList11 = null;
        fuzzTest3.FuzzTest_add(intList9, intList11, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = null;
        fuzzTest15.FuzzTest_add(intList21, intList23, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest2.FuzzTest_add(intList9, intList23, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_add(intList1, intList23, 0, (java.lang.Integer) 0);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10, 100, (-1) };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList37 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList37, intList39, (int) (short) 100, (java.lang.Integer) 10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_add(intList7, intList9, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_add(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList7, intList21, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = null;
        fuzzTest30.FuzzTest_add(intList36, intList38, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = null;
        fuzzTest42.FuzzTest_add(intList48, intList50, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest29.FuzzTest_add(intList36, intList50, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_add(intList28, intList50, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList60 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList61 = null;
        fuzzTest0.FuzzTest_add(intList60, intList61, 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList66 = null;
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList71 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest65.FuzzTest_add(intList66, intList71, (int) (short) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList82 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList84 = null;
        fuzzTest76.FuzzTest_add(intList82, intList84, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList71, intList84, (int) (short) 0, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList91 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList95 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList95, intArray94);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList91, intList95, 100, (java.lang.Integer) 100);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_add(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = null;
        fuzzTest14.FuzzTest_add(intList20, intList22, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest26.FuzzTest_add(intList32, intList34, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest13.FuzzTest_add(intList20, intList34, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest11.FuzzTest_add(intList12, intList34, 0, (java.lang.Integer) 0);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList12, intList46, 10, (java.lang.Integer) 1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_add(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest25.FuzzTest_add(intList31, intList33, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_add(intList19, intList33, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = null;
        fuzzTest44.FuzzTest_add(intList50, intList52, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList62 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = null;
        fuzzTest56.FuzzTest_add(intList62, intList64, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest43.FuzzTest_add(intList50, intList64, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest41.FuzzTest_add(intList42, intList64, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_add(intList64, intList74, (int) (byte) 100, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList33, intList64, (int) (short) 0, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList88 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList90 = null;
        fuzzTest82.FuzzTest_add(intList88, intList90, (int) (byte) 1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList81, intList88, (int) (short) 100, (java.lang.Integer) 100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList25 = null;
        fuzzTest17.FuzzTest_add(intList23, intList25, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList37 = null;
        fuzzTest29.FuzzTest_add(intList35, intList37, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest16.FuzzTest_add(intList23, intList37, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest14.FuzzTest_add(intList15, intList37, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(intList37, intList47, (int) (byte) 100, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList12, intList37, (int) '4', (java.lang.Integer) 2);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList54 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList54, intList55, (int) (byte) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList11 = null;
        fuzzTest3.FuzzTest_add(intList9, intList11, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = null;
        fuzzTest15.FuzzTest_add(intList21, intList23, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest2.FuzzTest_add(intList9, intList23, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_add(intList1, intList23, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList42 = null;
        fuzzTest34.FuzzTest_add(intList40, intList42, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList54 = null;
        fuzzTest46.FuzzTest_add(intList52, intList54, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest33.FuzzTest_add(intList40, intList54, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList67 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList69 = null;
        fuzzTest61.FuzzTest_add(intList67, intList69, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList54, intList69, 100, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList77 = null;
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList82 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest76.FuzzTest_add(intList77, intList82, (int) (short) 10, (java.lang.Integer) 10);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 100, 1, 2, (-1), 2 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList93 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList82, intList93, (int) (byte) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_add(intList7, intList9, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_add(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList7, intList21, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest0.FuzzTest_add(intList28, intList29, (int) '4', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest0.FuzzTest_add(intList33, intList34, (int) (short) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest0.FuzzTest_add(intList38, intList39, 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = null;
        fuzzTest44.FuzzTest_add(intList50, intList52, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList62 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = null;
        fuzzTest56.FuzzTest_add(intList62, intList64, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest43.FuzzTest_add(intList50, intList64, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList71 = null;
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList73 = null;
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList78 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest72.FuzzTest_add(intList73, intList78, (int) (short) 10, (java.lang.Integer) 10);
        fuzzTest43.FuzzTest_add(intList71, intList78, (-1), (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList78, intList86, (int) ' ', (java.lang.Integer) 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_add(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest12.FuzzTest_add(intList18, intList20, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList11, intList18, (int) 'a', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList37 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest31.FuzzTest_add(intList37, intList39, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList49 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = null;
        fuzzTest43.FuzzTest_add(intList49, intList51, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest30.FuzzTest_add(intList37, intList51, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest28.FuzzTest_add(intList29, intList51, 0, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList27, intList29, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest0.FuzzTest_add(intList64, intList65, (int) '4', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList71 = null;
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList76 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest70.FuzzTest_add(intList71, intList76, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList81 = null;
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList88 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList90 = null;
        fuzzTest82.FuzzTest_add(intList88, intList90, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest70.FuzzTest_add(intList81, intList88, (int) 'a', (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList69, intList88, (int) (short) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = null;
        fuzzTest4.FuzzTest_add(intList10, intList12, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = null;
        fuzzTest16.FuzzTest_add(intList22, intList24, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest3.FuzzTest_add(intList10, intList24, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_add(intList2, intList24, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList24, intList34, (int) (byte) 100, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = null;
        fuzzTest39.FuzzTest_add(intList45, intList47, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList38, intList47, 2, (java.lang.Integer) 0);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList58 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList60 = null;
        fuzzTest0.FuzzTest_add(intList58, intList60, (int) (short) 100, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest0.FuzzTest_add(intList64, intList65, (int) (byte) 0, (java.lang.Integer) 2);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList69 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList70 = null;
        fuzzTest0.FuzzTest_add(intList69, intList70, (int) '4', (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList74 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 2, 2 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList79 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList74, intList79, (int) (byte) 10, (java.lang.Integer) 2);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList12, intList13, 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList17 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = null;
        fuzzTest0.FuzzTest_add(intList17, intList18, 2, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = null;
        fuzzTest0.FuzzTest_add(intList22, intList23, 2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = null;
        fuzzTest28.FuzzTest_add(intList34, intList36, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = null;
        fuzzTest40.FuzzTest_add(intList46, intList48, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest27.FuzzTest_add(intList34, intList48, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = null;
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = null;
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList62 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest56.FuzzTest_add(intList57, intList62, (int) (short) 10, (java.lang.Integer) 10);
        fuzzTest27.FuzzTest_add(intList55, intList62, (-1), (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList62, intList70, (int) (short) 100, (java.lang.Integer) 2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_add(intList7, intList9, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_add(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList7, intList21, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest0.FuzzTest_add(intList28, intList29, (int) '4', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest0.FuzzTest_add(intList33, intList34, (int) (byte) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = null;
        fuzzTest39.FuzzTest_add(intList45, intList47, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = null;
        fuzzTest39.FuzzTest_add(intList51, intList52, 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, 100, 2, 0, 2 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList62 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = null;
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList70 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest64.FuzzTest_add(intList65, intList70, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList75 = null;
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList82 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList84 = null;
        fuzzTest76.FuzzTest_add(intList82, intList84, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest64.FuzzTest_add(intList75, intList82, (int) 'a', (java.lang.Integer) (-1));
        fuzzTest39.FuzzTest_add(intList62, intList75, (int) (short) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList38, intList62, (int) (short) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_add(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest12.FuzzTest_add(intList18, intList20, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList25 = null;
        fuzzTest12.FuzzTest_add(intList24, intList25, (int) ' ', (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = null;
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest30.FuzzTest_add(intList31, intList36, (int) (short) 10, (java.lang.Integer) 10);
        fuzzTest12.FuzzTest_add(intList29, intList36, (int) (byte) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_add(intList11, intList36, (int) (byte) 1, (java.lang.Integer) 2);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = null;
        fuzzTest0.FuzzTest_add(intList47, intList48, (int) (short) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList59 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList61 = null;
        fuzzTest53.FuzzTest_add(intList59, intList61, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList71 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList73 = null;
        fuzzTest65.FuzzTest_add(intList71, intList73, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest52.FuzzTest_add(intList59, intList73, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList80 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList81 = null;
        fuzzTest52.FuzzTest_add(intList80, intList81, (int) '4', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList85 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList86 = null;
        fuzzTest52.FuzzTest_add(intList85, intList86, (int) (short) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList90 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList85, intList90, (int) '4', (java.lang.Integer) 2);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_add(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest12.FuzzTest_add(intList18, intList20, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList11, intList18, (int) 'a', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = null;
        fuzzTest0.FuzzTest_add(intList27, intList28, (int) (byte) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = null;
        fuzzTest32.FuzzTest_add(intList38, intList40, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = null;
        fuzzTest32.FuzzTest_add(intList44, intList45, (int) ' ', (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = null;
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest50.FuzzTest_add(intList51, intList56, (int) (short) 10, (java.lang.Integer) 10);
        fuzzTest32.FuzzTest_add(intList49, intList56, (int) (byte) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = null;
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList70 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest64.FuzzTest_add(intList65, intList70, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList75 = null;
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList82 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList84 = null;
        fuzzTest76.FuzzTest_add(intList82, intList84, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest64.FuzzTest_add(intList75, intList82, (int) 'a', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList91 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList92 = null;
        fuzzTest64.FuzzTest_add(intList91, intList92, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList56, intList91, (int) (short) 100, (java.lang.Integer) 100);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 10, 0, 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList17 = null;
        fuzzTest9.FuzzTest_add(intList15, intList17, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest21.FuzzTest_add(intList27, intList29, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest8.FuzzTest_add(intList15, intList29, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest38.FuzzTest_add(intList44, intList46, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList58 = null;
        fuzzTest50.FuzzTest_add(intList56, intList58, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest37.FuzzTest_add(intList44, intList58, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList71 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList73 = null;
        fuzzTest65.FuzzTest_add(intList71, intList73, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest36.FuzzTest_add(intList58, intList71, (int) (short) -1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList80 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_add(intList80, intList81, 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList85 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_add(intList85, intList86, (int) (byte) -1, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList90 = null;
        fuzzTest8.FuzzTest_add(intList86, intList90, 0, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList6, intList86, (int) 'a', (java.lang.Integer) 2);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_add(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest12.FuzzTest_add(intList18, intList20, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList11, intList18, (int) 'a', (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = null;
        fuzzTest28.FuzzTest_add(intList34, intList36, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = null;
        fuzzTest40.FuzzTest_add(intList46, intList48, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest27.FuzzTest_add(intList34, intList48, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = null;
        fuzzTest27.FuzzTest_add(intList55, intList56, (int) '4', (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList61 = null;
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList66 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest60.FuzzTest_add(intList61, intList66, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList71 = null;
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList78 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList80 = null;
        fuzzTest72.FuzzTest_add(intList78, intList80, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest60.FuzzTest_add(intList71, intList78, (int) 'a', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList87 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList88 = null;
        fuzzTest60.FuzzTest_add(intList87, intList88, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList55, intList87, (int) (short) 100, (java.lang.Integer) 10);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest1.FuzzTest_add(intList2, intList7, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_add(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_add(intList12, intList19, (int) 'a', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList37 = null;
        fuzzTest29.FuzzTest_add(intList35, intList37, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList41 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList42 = null;
        fuzzTest29.FuzzTest_add(intList41, intList42, 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, 100, 2, 0, 2 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = null;
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList60 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest54.FuzzTest_add(intList55, intList60, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = null;
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList74 = null;
        fuzzTest66.FuzzTest_add(intList72, intList74, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest54.FuzzTest_add(intList65, intList72, (int) 'a', (java.lang.Integer) (-1));
        fuzzTest29.FuzzTest_add(intList52, intList65, (int) (short) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList28, intList52, (int) (short) 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList52, intList87, (int) '#', (java.lang.Integer) 1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_add(intList7, intList9, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_add(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList7, intList21, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest0.FuzzTest_add(intList28, intList29, (int) '4', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest0.FuzzTest_add(intList33, intList34, (int) (short) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest0.FuzzTest_add(intList38, intList39, (int) '4', (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = null;
        fuzzTest44.FuzzTest_add(intList50, intList52, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = null;
        fuzzTest44.FuzzTest_add(intList56, intList57, 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList61 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList62 = null;
        fuzzTest44.FuzzTest_add(intList61, intList62, 2, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList66 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList67 = null;
        fuzzTest44.FuzzTest_add(intList66, intList67, (int) ' ', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList71 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = null;
        fuzzTest44.FuzzTest_add(intList71, intList72, (int) (byte) 10, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList43, intList71, 10, (java.lang.Integer) 1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_add(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest12.FuzzTest_add(intList18, intList20, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList11, intList18, (int) 'a', (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = null;
        fuzzTest28.FuzzTest_add(intList34, intList36, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = null;
        fuzzTest40.FuzzTest_add(intList46, intList48, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest27.FuzzTest_add(intList34, intList48, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = null;
        fuzzTest27.FuzzTest_add(intList55, intList56, (int) '4', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList60 = null;
        fuzzTest0.FuzzTest_add(intList56, intList60, (int) (byte) 1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0, 10, 10, (-1) };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList69 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = null;
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList77 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest71.FuzzTest_add(intList72, intList77, (int) (short) 10, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList69, intList77, (int) (short) 10, (java.lang.Integer) 0);
    }
}

