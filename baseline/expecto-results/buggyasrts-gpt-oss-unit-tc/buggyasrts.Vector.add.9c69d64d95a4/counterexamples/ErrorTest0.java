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
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest20.FuzzTest_add(intList28, intList34, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList19, intList34, (int) ' ', (java.lang.Integer) 100);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest10.FuzzTest_add(intList18, intList24, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList8, intList18, (int) (byte) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest19.FuzzTest_add(intList27, intList33, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest38.FuzzTest_add(intList46, intList52, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList33, intList46, 0, (java.lang.Integer) 100);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest19.FuzzTest_add(intList27, intList33, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest38.FuzzTest_add(intList46, intList52, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList33, intList46, (int) '4', (java.lang.Integer) 2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest19.FuzzTest_add(intList27, intList33, (int) (byte) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 2, 100, 2, 100, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList33, intList45, (int) (short) 1, (java.lang.Integer) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList10, (int) (short) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest24.FuzzTest_add(intList32, intList38, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList32, intList43, (int) 'a', (java.lang.Integer) 2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10, 100, 10, (-1), 100, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest28.FuzzTest_add(intList36, intList42, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList26, intList42, (int) '#', (java.lang.Integer) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList1, intList12, (int) (short) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = null;
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_add(intList29, intList35, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest19.FuzzTest_add(intList20, intList29, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(intList43, intList44, 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = null;
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest52.FuzzTest_add(intList60, intList66, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest50.FuzzTest_add(intList51, intList60, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = null;
        fuzzTest49.FuzzTest_add(intList60, intList74, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(intList74, intList78, (int) (byte) -1, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList44, intList78, 10, (java.lang.Integer) 10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 1, 10, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest8.FuzzTest_add(intList16, intList22, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList6, intList22, 100, (java.lang.Integer) 100);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest3.FuzzTest_add(intList11, intList17, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList2, intList11, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        fuzzTest0.FuzzTest_add(intList11, intList25, 100, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest33.FuzzTest_add(intList41, intList47, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest31.FuzzTest_add(intList32, intList41, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = null;
        fuzzTest30.FuzzTest_add(intList41, intList55, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(intList55, intList59, (int) (byte) -1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest67.FuzzTest_add(intList75, intList81, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest65.FuzzTest_add(intList66, intList75, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList89 = null;
        fuzzTest64.FuzzTest_add(intList75, intList89, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList93 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(intList89, intList93, (int) (byte) -1, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList59, intList93, (int) (byte) 1, (java.lang.Integer) 2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest1.FuzzTest_add(intList12, intList26, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList26, intList30, (int) (byte) -1, (java.lang.Integer) 2);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), (-1), (-1), 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList39, intList41, (int) (byte) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest3.FuzzTest_add(intList11, intList17, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList2, intList11, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        fuzzTest0.FuzzTest_add(intList11, intList25, 100, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest29.FuzzTest_add(intList37, intList43, (int) (byte) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList37, intList52, (int) (byte) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest1.FuzzTest_add(intList12, intList26, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest0.FuzzTest_add(intList26, intList30, (int) (short) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest34.FuzzTest_add(intList42, intList48, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest53.FuzzTest_add(intList61, intList67, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList42, intList61, (int) (byte) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest19.FuzzTest_add(intList27, intList33, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = null;
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest42.FuzzTest_add(intList50, intList56, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest40.FuzzTest_add(intList41, intList50, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = null;
        fuzzTest39.FuzzTest_add(intList50, intList64, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(intList64, intList68, (int) (byte) -1, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_add(intList27, intList64, (int) (byte) 0, (java.lang.Integer) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        fuzzTest76.FuzzTest_add(intList84, intList90, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList75, intList90, (int) ' ', (java.lang.Integer) 2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_add(intList9, intList15, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest20.FuzzTest_add(intList28, intList34, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest43.FuzzTest_add(intList51, intList57, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest41.FuzzTest_add(intList42, intList51, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = null;
        fuzzTest40.FuzzTest_add(intList51, intList65, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(intList65, intList69, (int) (byte) -1, (java.lang.Integer) 2);
        fuzzTest1.FuzzTest_add(intList28, intList65, (int) (byte) 0, (java.lang.Integer) 10);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList28, intList78, (int) (byte) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest1.FuzzTest_add(intList12, intList26, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList26, intList30, (int) (byte) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest37.FuzzTest_add(intList45, intList51, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest35.FuzzTest_add(intList36, intList45, (int) (short) 10, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList34, intList45, 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest22.FuzzTest_add(intList30, intList36, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest20.FuzzTest_add(intList21, intList30, (int) (short) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = null;
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest47.FuzzTest_add(intList55, intList61, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest45.FuzzTest_add(intList46, intList55, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = null;
        fuzzTest44.FuzzTest_add(intList55, intList69, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = null;
        fuzzTest20.FuzzTest_add(intList55, intList73, (int) (short) 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList19, intList55, (int) (byte) 1, (java.lang.Integer) 10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 2, (-1), 2, 1, 0, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest12.FuzzTest_add(intList20, intList26, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest10.FuzzTest_add(intList11, intList20, (int) (short) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest37.FuzzTest_add(intList45, intList51, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest35.FuzzTest_add(intList36, intList45, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = null;
        fuzzTest34.FuzzTest_add(intList45, intList59, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = null;
        fuzzTest10.FuzzTest_add(intList45, intList63, (int) (short) 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList8, intList45, (int) ' ', (java.lang.Integer) 2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest3.FuzzTest_add(intList11, intList17, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList2, intList11, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intList25, intList26, 2, (java.lang.Integer) 1);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 2, 0, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest0.FuzzTest_add(intList25, intList35, (int) (short) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest40.FuzzTest_add(intList48, intList54, (int) (byte) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, 1, 0, 10, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList54, intList65, (int) (byte) 100, (java.lang.Integer) 2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest3.FuzzTest_add(intList11, intList17, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList2, intList11, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        fuzzTest0.FuzzTest_add(intList11, intList25, 100, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest31.FuzzTest_add(intList39, intList45, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest29.FuzzTest_add(intList30, intList39, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(intList53, intList54, 2, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList54, intList58, (int) (short) 1, (java.lang.Integer) 2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest1.FuzzTest_add(intList12, intList26, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest0.FuzzTest_add(intList26, intList30, (int) (short) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest38.FuzzTest_add(intList46, intList52, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest36.FuzzTest_add(intList37, intList46, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzzTest35.FuzzTest_add(intList46, intList60, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(intList60, intList64, (int) (byte) -1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest68.FuzzTest_add(intList76, intList82, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList64, intList82, (int) (short) 100, (java.lang.Integer) 2);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList10, (int) (short) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest27.FuzzTest_add(intList35, intList41, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest25.FuzzTest_add(intList26, intList35, (int) (short) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest51.FuzzTest_add(intList59, intList65, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest49.FuzzTest_add(intList50, intList59, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(intList73, intList74, 2, (java.lang.Integer) 1);
        fuzzTest24.FuzzTest_add(intList26, intList74, (int) (short) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList74, intList85, (int) (byte) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest3.FuzzTest_add(intList11, intList17, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList2, intList11, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        fuzzTest0.FuzzTest_add(intList11, intList25, 100, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest29.FuzzTest_add(intList37, intList43, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest48.FuzzTest_add(intList56, intList62, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList37, intList56, (int) (short) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest23.FuzzTest_add(intList31, intList37, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest21.FuzzTest_add(intList22, intList31, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = null;
        fuzzTest20.FuzzTest_add(intList31, intList45, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(intList45, intList49, (int) (byte) -1, (java.lang.Integer) 2);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-1), 1, (-1), 100, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest0.FuzzTest_add(intList45, intList60, 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest65.FuzzTest_add(intList73, intList79, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList79, intList84, 2, (java.lang.Integer) 100);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = null;
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_add(intList29, intList35, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest19.FuzzTest_add(intList20, intList29, (int) (short) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = null;
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest47.FuzzTest_add(intList55, intList61, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest45.FuzzTest_add(intList46, intList55, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = null;
        fuzzTest44.FuzzTest_add(intList55, intList69, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(intList69, intList73, (int) (byte) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(intList69, intList77, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), 1, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList77, intList85, (int) (byte) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList10, (int) (short) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest28.FuzzTest_add(intList36, intList42, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest26.FuzzTest_add(intList27, intList36, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest25.FuzzTest_add(intList36, intList50, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(intList50, intList54, (int) (byte) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList50, intList58, (int) (short) -1, (java.lang.Integer) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest63.FuzzTest_add(intList71, intList77, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList62, intList71, (int) (short) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest1.FuzzTest_add(intList12, intList26, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest0.FuzzTest_add(intList26, intList30, (int) (short) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest37.FuzzTest_add(intList45, intList51, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest35.FuzzTest_add(intList36, intList45, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = null;
        fuzzTest34.FuzzTest_add(intList45, intList59, 100, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = null;
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest65.FuzzTest_add(intList73, intList79, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest63.FuzzTest_add(intList64, intList73, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(intList87, intList88, 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList45, intList88, (int) '#', (java.lang.Integer) (-1));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList10, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList24, intList25, 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest29.FuzzTest_add(intList37, intList43, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest48.FuzzTest_add(intList56, intList62, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList37, intList56, 0, (java.lang.Integer) 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList10, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList24, intList25, 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest32.FuzzTest_add(intList40, intList46, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest30.FuzzTest_add(intList31, intList40, (int) (short) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = null;
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest56.FuzzTest_add(intList64, intList70, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest54.FuzzTest_add(intList55, intList64, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(intList78, intList79, 2, (java.lang.Integer) 1);
        fuzzTest29.FuzzTest_add(intList31, intList79, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList79, intList86, (int) 'a', (java.lang.Integer) 10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 0, 0, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest10.FuzzTest_add(intList18, intList24, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest8.FuzzTest_add(intList9, intList18, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = null;
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest36.FuzzTest_add(intList44, intList50, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest34.FuzzTest_add(intList35, intList44, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = null;
        fuzzTest33.FuzzTest_add(intList44, intList58, 100, (java.lang.Integer) 2);
        fuzzTest8.FuzzTest_add(intList32, intList44, (int) (short) 0, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList6, intList32, 2, (java.lang.Integer) 1);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = null;
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList88 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest74.FuzzTest_add(intList82, intList88, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest72.FuzzTest_add(intList73, intList82, (int) (short) 10, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList70, intList82, (int) ' ', (java.lang.Integer) 10);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 2, 1, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest10.FuzzTest_add(intList18, intList24, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest8.FuzzTest_add(intList9, intList18, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(intList32, intList33, 2, (java.lang.Integer) 1);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 2, 0, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest7.FuzzTest_add(intList32, intList42, (int) (short) 0, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(intList47, intList48, (int) (short) -1, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList5, intList48, (int) (short) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList10, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList24, intList25, 2, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest30.FuzzTest_add(intList38, intList44, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList29, intList44, 0, (java.lang.Integer) 2);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_add(intList9, intList15, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest22.FuzzTest_add(intList30, intList36, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest20.FuzzTest_add(intList21, intList30, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = null;
        fuzzTest1.FuzzTest_add(intList30, intList44, (int) (byte) 0, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList44, intList48, (int) (short) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest52.FuzzTest_add(intList60, intList66, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList66, intList71, 1, (java.lang.Integer) 100);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest3.FuzzTest_add(intList11, intList17, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList2, intList11, (int) (short) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest27.FuzzTest_add(intList35, intList41, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest25.FuzzTest_add(intList26, intList35, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_add(intList49, intList50, 2, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList2, intList50, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest57.FuzzTest_add(intList65, intList71, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        fuzzTest76.FuzzTest_add(intList84, intList90, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList65, intList84, 1, (java.lang.Integer) 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest1.FuzzTest_add(intList12, intList26, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest0.FuzzTest_add(intList26, intList30, (int) (short) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest38.FuzzTest_add(intList46, intList52, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest36.FuzzTest_add(intList37, intList46, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzzTest35.FuzzTest_add(intList46, intList60, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(intList60, intList64, (int) (byte) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList64, intList68, 0, (java.lang.Integer) 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10, 10, 1, (-1), 0, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest14.FuzzTest_add(intList22, intList28, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest12.FuzzTest_add(intList13, intList22, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = null;
        fuzzTest11.FuzzTest_add(intList22, intList36, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_add(intList36, intList40, (int) (byte) -1, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList8, intList40, 10, (java.lang.Integer) 2);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest23.FuzzTest_add(intList31, intList37, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest21.FuzzTest_add(intList22, intList31, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = null;
        fuzzTest20.FuzzTest_add(intList31, intList45, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(intList45, intList49, (int) (byte) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(intList53, intList54, (int) (byte) -1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = null;
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest62.FuzzTest_add(intList70, intList76, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest60.FuzzTest_add(intList61, intList70, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = null;
        fuzzTest59.FuzzTest_add(intList70, intList84, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(intList84, intList88, (int) (byte) -1, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList53, intList88, (int) (short) 0, (java.lang.Integer) 2);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = null;
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_add(intList29, intList35, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest19.FuzzTest_add(intList20, intList29, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = null;
        fuzzTest0.FuzzTest_add(intList29, intList43, (int) (byte) 0, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = null;
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest52.FuzzTest_add(intList60, intList66, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest50.FuzzTest_add(intList51, intList60, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = null;
        fuzzTest49.FuzzTest_add(intList60, intList74, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(intList74, intList78, (int) (byte) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(intList82, intList83, (int) (byte) -1, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList47, intList83, 2, (java.lang.Integer) 2);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(intList26, intList27, 2, (java.lang.Integer) 1);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 2, 0, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest1.FuzzTest_add(intList26, intList36, (int) (short) 0, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = null;
        fuzzTest0.FuzzTest_add(intList36, intList41, 100, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest49.FuzzTest_add(intList57, intList63, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest47.FuzzTest_add(intList48, intList57, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        fuzzTest46.FuzzTest_add(intList57, intList71, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(intList71, intList75, (int) (byte) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(intList79, intList80, (int) (byte) -1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 1, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList79, intList87, 0, (java.lang.Integer) 10);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_add(intList9, intList15, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest24.FuzzTest_add(intList32, intList38, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest22.FuzzTest_add(intList23, intList32, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = null;
        fuzzTest21.FuzzTest_add(intList32, intList46, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_add(intList46, intList50, (int) (byte) -1, (java.lang.Integer) 2);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 1, (-1), 100, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest1.FuzzTest_add(intList46, intList61, 0, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList61, intList66, 1, (java.lang.Integer) 100);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = null;
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_add(intList29, intList35, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest19.FuzzTest_add(intList20, intList29, (int) (short) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest46.FuzzTest_add(intList54, intList60, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest44.FuzzTest_add(intList45, intList54, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = null;
        fuzzTest43.FuzzTest_add(intList54, intList68, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(intList68, intList72, (int) (byte) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        fuzzTest76.FuzzTest_add(intList84, intList90, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList72, intList84, (int) ' ', (java.lang.Integer) 2);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest23.FuzzTest_add(intList31, intList37, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest21.FuzzTest_add(intList22, intList31, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = null;
        fuzzTest2.FuzzTest_add(intList31, intList45, (int) (byte) 0, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intList45, intList49, (int) (short) 0, (java.lang.Integer) 0);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-1), 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList49, intList57, (int) (byte) 1, (java.lang.Integer) 2);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest3.FuzzTest_add(intList11, intList17, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList2, intList11, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intList25, intList26, 2, (java.lang.Integer) 1);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 2, 0, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest0.FuzzTest_add(intList25, intList35, (int) (short) 0, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList40, intList41, (int) (short) -1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest49.FuzzTest_add(intList57, intList63, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest47.FuzzTest_add(intList48, intList57, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        fuzzTest46.FuzzTest_add(intList57, intList71, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(intList71, intList75, (int) (byte) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(intList79, intList80, (int) (byte) -1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 10, 100, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList88 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList79, intList88, (int) (short) 100, (java.lang.Integer) 10);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest1.FuzzTest_add(intList12, intList26, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest0.FuzzTest_add(intList26, intList30, (int) (short) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest35.FuzzTest_add(intList43, intList49, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList34, intList43, (int) (byte) 100, (java.lang.Integer) 2);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = null;
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest66.FuzzTest_add(intList74, intList80, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest64.FuzzTest_add(intList65, intList74, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList88 = null;
        fuzzTest63.FuzzTest_add(intList74, intList88, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList92 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_add(intList88, intList92, (int) (byte) -1, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList60, intList92, 100, (java.lang.Integer) 10);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest1.FuzzTest_add(intList12, intList26, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest0.FuzzTest_add(intList26, intList30, (int) (short) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = null;
        fuzzTest0.FuzzTest_add(intList34, intList35, (int) (short) 100, (java.lang.Integer) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest0.FuzzTest_add(intList39, intList40, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest44.FuzzTest_add(intList52, intList58, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = null;
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest66.FuzzTest_add(intList74, intList80, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest64.FuzzTest_add(intList65, intList74, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList88 = null;
        fuzzTest63.FuzzTest_add(intList74, intList88, 100, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList52, intList74, (int) (short) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList10, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest28.FuzzTest_add(intList36, intList42, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest26.FuzzTest_add(intList27, intList36, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest25.FuzzTest_add(intList36, intList50, 100, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_add(intList24, intList36, (int) (short) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest61.FuzzTest_add(intList69, intList75, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest59.FuzzTest_add(intList60, intList69, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = null;
        fuzzTest58.FuzzTest_add(intList69, intList83, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(intList83, intList87, (int) (byte) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList91 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList92 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(intList91, intList92, (int) (byte) -1, (java.lang.Integer) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList96 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList91, intList96, (int) (short) 1, (java.lang.Integer) 2);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest1.FuzzTest_add(intList12, intList26, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList26, intList30, (int) (byte) -1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest37.FuzzTest_add(intList45, intList51, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest35.FuzzTest_add(intList36, intList45, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = null;
        fuzzTest34.FuzzTest_add(intList45, intList59, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList59, intList63, (int) (short) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-1), 0, 10, 2, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList73, intList75, 1, (java.lang.Integer) 10);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest23.FuzzTest_add(intList31, intList37, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest21.FuzzTest_add(intList22, intList31, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_add(intList45, intList46, 2, (java.lang.Integer) 1);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 2, 0, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest20.FuzzTest_add(intList45, intList55, (int) (short) 0, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList19, intList55, 100, (java.lang.Integer) 100);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest3.FuzzTest_add(intList11, intList17, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList2, intList11, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        fuzzTest0.FuzzTest_add(intList11, intList25, 100, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest29.FuzzTest_add(intList37, intList43, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList43, intList48, (int) (byte) 1, (java.lang.Integer) 0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest3.FuzzTest_add(intList11, intList17, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList2, intList11, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        fuzzTest0.FuzzTest_add(intList11, intList25, 100, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest31.FuzzTest_add(intList39, intList45, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest29.FuzzTest_add(intList30, intList39, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = null;
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest57.FuzzTest_add(intList65, intList71, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest55.FuzzTest_add(intList56, intList65, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = null;
        fuzzTest54.FuzzTest_add(intList65, intList79, 100, (java.lang.Integer) 2);
        fuzzTest29.FuzzTest_add(intList53, intList65, (int) (short) 0, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList65, intList86, (int) (byte) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest1.FuzzTest_add(intList12, intList26, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList26, intList30, (int) (byte) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList34, intList35, (int) (byte) -1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest45.FuzzTest_add(intList53, intList59, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = null;
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest66.FuzzTest_add(intList74, intList80, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest64.FuzzTest_add(intList65, intList74, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList88 = null;
        fuzzTest45.FuzzTest_add(intList74, intList88, (int) (byte) 0, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList92 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(intList88, intList92, (int) (short) 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList42, intList92, (int) (short) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList10, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest28.FuzzTest_add(intList36, intList42, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest26.FuzzTest_add(intList27, intList36, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest25.FuzzTest_add(intList36, intList50, 100, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_add(intList24, intList36, (int) (short) 0, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList57, intList58, (int) '#', (java.lang.Integer) (-1));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList10, (int) (short) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 0, 0, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest34.FuzzTest_add(intList42, intList48, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest32.FuzzTest_add(intList33, intList42, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = null;
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest60.FuzzTest_add(intList68, intList74, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest58.FuzzTest_add(intList59, intList68, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = null;
        fuzzTest57.FuzzTest_add(intList68, intList82, 100, (java.lang.Integer) 2);
        fuzzTest32.FuzzTest_add(intList56, intList68, (int) (short) 0, (java.lang.Integer) 1);
        fuzzTest24.FuzzTest_add(intList30, intList56, 2, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList30, intList92, (int) (short) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest1.FuzzTest_add(intList12, intList26, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList26, intList30, (int) (byte) -1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest34.FuzzTest_add(intList42, intList48, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = null;
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest34.FuzzTest_add(intList53, intList57, (int) (byte) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest62.FuzzTest_add(intList70, intList76, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList57, intList70, (int) ' ', (java.lang.Integer) 100);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(intList26, intList27, 2, (java.lang.Integer) 1);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 2, 0, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest1.FuzzTest_add(intList26, intList36, (int) (short) 0, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = null;
        fuzzTest0.FuzzTest_add(intList36, intList41, 100, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest46.FuzzTest_add(intList54, intList60, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList45, intList54, (int) (short) 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList68, intList69, (int) '4', (java.lang.Integer) 0);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest1.FuzzTest_add(intList12, intList26, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest0.FuzzTest_add(intList26, intList30, (int) (short) 10, (java.lang.Integer) 100);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest38.FuzzTest_add(intList46, intList52, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = null;
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest38.FuzzTest_add(intList57, intList61, (int) (byte) 10, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList36, intList61, (int) '#', (java.lang.Integer) 2);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest3.FuzzTest_add(intList11, intList17, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList2, intList11, (int) (short) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest27.FuzzTest_add(intList35, intList41, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest25.FuzzTest_add(intList26, intList35, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_add(intList49, intList50, 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList11, intList50, (int) (byte) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList10, (int) (short) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest28.FuzzTest_add(intList36, intList42, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest26.FuzzTest_add(intList27, intList36, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest25.FuzzTest_add(intList36, intList50, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = null;
        fuzzTest24.FuzzTest_add(intList50, intList54, (int) (short) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = null;
        fuzzTest24.FuzzTest_add(intList58, intList59, (int) (short) 100, (java.lang.Integer) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = null;
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest24.FuzzTest_add(intList63, intList66, 10, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest71.FuzzTest_add(intList79, intList85, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList66, intList85, 2, (java.lang.Integer) 0);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest1.FuzzTest_add(intList12, intList26, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest0.FuzzTest_add(intList26, intList30, (int) (short) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest35.FuzzTest_add(intList43, intList49, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList34, intList43, (int) (byte) 100, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest61.FuzzTest_add(intList69, intList75, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest59.FuzzTest_add(intList60, intList69, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = null;
        fuzzTest58.FuzzTest_add(intList69, intList83, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(intList83, intList87, (int) (byte) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList91 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList92 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(intList91, intList92, (int) (byte) -1, (java.lang.Integer) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList96 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList92, intList96, 100, (java.lang.Integer) 0);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = null;
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest5.FuzzTest_add(intList13, intList19, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest3.FuzzTest_add(intList4, intList13, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzzTest2.FuzzTest_add(intList13, intList27, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intList27, intList31, (int) (byte) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList31, intList35, 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = null;
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest5.FuzzTest_add(intList13, intList19, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest3.FuzzTest_add(intList4, intList13, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzzTest2.FuzzTest_add(intList13, intList27, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = null;
        fuzzTest1.FuzzTest_add(intList27, intList31, (int) (short) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest39.FuzzTest_add(intList47, intList53, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest37.FuzzTest_add(intList38, intList47, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = null;
        fuzzTest36.FuzzTest_add(intList47, intList61, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_add(intList61, intList65, (int) (byte) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intList61, intList69, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList69, intList73, 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest3.FuzzTest_add(intList11, intList17, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList2, intList11, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        fuzzTest0.FuzzTest_add(intList11, intList25, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest30.FuzzTest_add(intList38, intList44, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList29, intList44, 0, (java.lang.Integer) 0);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList10, (int) (short) 10, (java.lang.Integer) 1);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), 10, 1, 2, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = null;
        fuzzTest0.FuzzTest_add(intList30, intList32, (int) '4', (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest40.FuzzTest_add(intList48, intList54, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest38.FuzzTest_add(intList39, intList48, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = null;
        fuzzTest37.FuzzTest_add(intList48, intList62, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_add(intList62, intList66, (int) (byte) -1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest70.FuzzTest_add(intList78, intList84, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList66, intList78, (int) (byte) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList10, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 0, 10, 2, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest0.FuzzTest_add(intList24, intList32, (int) '#', (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = null;
        fuzzTest0.FuzzTest_add(intList37, intList38, (int) (byte) -1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 100, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, (-1), 10, 100, 100, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList46, intList55, (int) (short) 1, (java.lang.Integer) 10);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest1.FuzzTest_add(intList12, intList26, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList26, intList30, (int) (byte) -1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest38.FuzzTest_add(intList46, intList52, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest36.FuzzTest_add(intList37, intList46, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzzTest35.FuzzTest_add(intList46, intList60, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(intList60, intList64, (int) (byte) -1, (java.lang.Integer) 2);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList64, intList70, (int) '4', (java.lang.Integer) 100);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList10, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest28.FuzzTest_add(intList36, intList42, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest26.FuzzTest_add(intList27, intList36, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest25.FuzzTest_add(intList36, intList50, 100, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_add(intList24, intList36, (int) (short) 0, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = null;
        fuzzTest0.FuzzTest_add(intList57, intList58, 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = null;
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest65.FuzzTest_add(intList73, intList79, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest63.FuzzTest_add(intList64, intList73, (int) (short) 10, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList62, intList73, (int) (byte) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest3.FuzzTest_add(intList11, intList17, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList2, intList11, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intList25, intList26, 2, (java.lang.Integer) 1);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 2, 0, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest0.FuzzTest_add(intList25, intList35, (int) (short) 0, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList40, intList41, (int) (short) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = null;
        fuzzTest0.FuzzTest_add(intList45, intList46, 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest50.FuzzTest_add(intList58, intList64, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = null;
        fuzzTest50.FuzzTest_add(intList69, intList70, 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList69, intList74, (int) (byte) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest1.FuzzTest_add(intList12, intList26, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList26, intList30, (int) (byte) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList34, intList35, (int) (byte) -1, (java.lang.Integer) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = null;
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest42.FuzzTest_add(intList50, intList56, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest40.FuzzTest_add(intList41, intList50, (int) (short) 10, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList39, intList41, (int) (byte) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = null;
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest70.FuzzTest_add(intList78, intList84, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest68.FuzzTest_add(intList69, intList78, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList92 = null;
        fuzzTest67.FuzzTest_add(intList78, intList92, 100, (java.lang.Integer) 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList96 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList78, intList96, (int) (short) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_add(intList12, intList18, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList3, intList12, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(intList26, intList27, 2, (java.lang.Integer) 1);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 2, 0, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest1.FuzzTest_add(intList26, intList36, (int) (short) 0, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intList41, intList42, (int) (short) -1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest49.FuzzTest_add(intList57, intList63, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest47.FuzzTest_add(intList48, intList57, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        fuzzTest46.FuzzTest_add(intList57, intList71, 100, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList42, intList57, 2, (java.lang.Integer) 2);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = null;
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_add(intList29, intList35, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest19.FuzzTest_add(intList20, intList29, (int) (short) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest43.FuzzTest_add(intList51, intList57, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList20, intList57, (int) 'a', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest67.FuzzTest_add(intList75, intList81, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest65.FuzzTest_add(intList66, intList75, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList89 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_add(intList89, intList90, 2, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList94 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList90, intList94, 100, (java.lang.Integer) 2);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList10, (int) (short) 10, (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 0, 10, 2, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest0.FuzzTest_add(intList24, intList32, (int) '#', (java.lang.Integer) 0);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1), (-1), (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest45.FuzzTest_add(intList53, intList59, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = null;
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest45.FuzzTest_add(intList64, intList68, (int) (byte) 10, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList43, intList68, 0, (java.lang.Integer) 2);
    }
}

