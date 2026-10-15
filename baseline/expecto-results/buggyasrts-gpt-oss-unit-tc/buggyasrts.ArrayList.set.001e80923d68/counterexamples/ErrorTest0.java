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
        fuzzTest0.FuzzTest_set(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = null;
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList10, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = null;
        fuzzTest20.FuzzTest_set(intList21, intList22, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest27.FuzzTest_set(intList28, intList29, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest19.FuzzTest_set(intList21, intList29, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList41 = null;
        fuzzTest39.FuzzTest_set(intList40, intList41, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = null;
        fuzzTest46.FuzzTest_set(intList47, intList48, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest38.FuzzTest_set(intList40, intList48, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_set(intList29, intList40, 2, (java.lang.Integer) 2, (java.lang.Integer) 10);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, 10, 100, (-1) };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList66 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10, 0, 2, 100, 100, 2 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList75 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList66, intList75, (int) (byte) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_set(intList7, intList8, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList16 = null;
        fuzzTest14.FuzzTest_set(intList15, intList16, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = null;
        fuzzTest21.FuzzTest_set(intList22, intList23, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest13.FuzzTest_set(intList15, intList23, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList15, intList32, (int) '4', (java.lang.Integer) 2, (java.lang.Integer) 2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList4 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList5 = null;
        fuzzTest3.FuzzTest_set(intList4, intList5, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList11 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = null;
        fuzzTest10.FuzzTest_set(intList11, intList12, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest2.FuzzTest_set(intList4, intList12, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList1, intList4, (int) (short) 100, (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_set(intList7, intList8, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = null;
        fuzzTest0.FuzzTest_set(intList13, intList14, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 100, 0 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = null;
        fuzzTest26.FuzzTest_set(intList27, intList28, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = null;
        fuzzTest33.FuzzTest_set(intList34, intList35, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest25.FuzzTest_set(intList27, intList35, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList23, intList27, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = null;
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList2, intList9, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_set(intList7, intList8, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList16 = null;
        fuzzTest14.FuzzTest_set(intList15, intList16, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = null;
        fuzzTest21.FuzzTest_set(intList22, intList23, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest13.FuzzTest_set(intList15, intList23, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest32.FuzzTest_set(intList33, intList34, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = null;
        fuzzTest32.FuzzTest_set(intList39, intList40, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest32.FuzzTest_set(intList45, intList46, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList15, intList45, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = null;
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList10, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = null;
        fuzzTest20.FuzzTest_set(intList21, intList22, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest27.FuzzTest_set(intList28, intList29, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest19.FuzzTest_set(intList21, intList29, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList41 = null;
        fuzzTest39.FuzzTest_set(intList40, intList41, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = null;
        fuzzTest46.FuzzTest_set(intList47, intList48, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest38.FuzzTest_set(intList40, intList48, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_set(intList29, intList40, (-1), (java.lang.Integer) 100, (java.lang.Integer) 1);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 2, 0, 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList69 = null;
        fuzzTest67.FuzzTest_set(intList68, intList69, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList74 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList75 = null;
        fuzzTest67.FuzzTest_set(intList74, intList75, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList80 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList81 = null;
        fuzzTest67.FuzzTest_set(intList80, intList81, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList65, intList80, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_set(intList7, intList8, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = null;
        fuzzTest0.FuzzTest_set(intList13, intList14, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest19.FuzzTest_set(intList20, intList21, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = null;
        fuzzTest19.FuzzTest_set(intList26, intList27, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest32.FuzzTest_set(intList33, intList34, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList41 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList42 = null;
        fuzzTest40.FuzzTest_set(intList41, intList42, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList49 = null;
        fuzzTest47.FuzzTest_set(intList48, intList49, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest39.FuzzTest_set(intList41, intList49, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList60 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList61 = null;
        fuzzTest59.FuzzTest_set(intList60, intList61, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList67 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList68 = null;
        fuzzTest66.FuzzTest_set(intList67, intList68, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest58.FuzzTest_set(intList60, intList68, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzzTest32.FuzzTest_set(intList49, intList68, 100, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList84 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList86 = null;
        fuzzTest32.FuzzTest_set(intList84, intList86, (int) (short) 1, (java.lang.Integer) 100, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList26, intList84, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = null;
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList16 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList17 = null;
        fuzzTest15.FuzzTest_set(intList16, intList17, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = null;
        fuzzTest15.FuzzTest_set(intList22, intList23, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = null;
        fuzzTest29.FuzzTest_set(intList30, intList31, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest37.FuzzTest_set(intList38, intList39, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = null;
        fuzzTest37.FuzzTest_set(intList44, intList45, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest29.FuzzTest_set(intList36, intList45, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzzTest15.FuzzTest_set(intList28, intList36, 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_set(intList10, intList36, 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 0, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList66 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList36, intList66, (int) (byte) 100, (java.lang.Integer) 0, (java.lang.Integer) 2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 100, 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList16 = null;
        fuzzTest14.FuzzTest_set(intList15, intList16, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = null;
        fuzzTest14.FuzzTest_set(intList21, intList22, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest7.FuzzTest_set(intList12, intList22, (int) (byte) 100, (java.lang.Integer) 2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest31.FuzzTest_set(intList32, intList33, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest31.FuzzTest_set(intList38, intList39, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = null;
        fuzzTest31.FuzzTest_set(intList44, intList45, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = null;
        fuzzTest50.FuzzTest_set(intList51, intList52, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, (-1), 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList61 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest31.FuzzTest_set(intList52, intList61, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList12, intList61, (int) (byte) 10, (java.lang.Integer) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100, 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest7.FuzzTest_set(intList8, intList9, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = null;
        fuzzTest7.FuzzTest_set(intList14, intList15, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_set(intList5, intList15, (int) (byte) 100, (java.lang.Integer) 2, (java.lang.Integer) 0);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = null;
        fuzzTest29.FuzzTest_set(intList30, intList31, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest37.FuzzTest_set(intList38, intList39, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest44.FuzzTest_set(intList45, intList46, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest36.FuzzTest_set(intList38, intList46, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList58 = null;
        fuzzTest56.FuzzTest_set(intList57, intList58, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest63.FuzzTest_set(intList64, intList65, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest55.FuzzTest_set(intList57, intList65, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzzTest29.FuzzTest_set(intList46, intList65, 100, (java.lang.Integer) 0, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList78 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_set(intList78, intList79, (int) '4', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList27, intList79, 10, (java.lang.Integer) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList16 = null;
        fuzzTest8.FuzzTest_set(intList15, intList16, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_set(intList7, intList16, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = null;
        fuzzTest30.FuzzTest_set(intList31, intList32, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest37.FuzzTest_set(intList38, intList39, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest29.FuzzTest_set(intList31, intList39, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList27, intList31, (int) '#', (java.lang.Integer) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList16 = null;
        fuzzTest8.FuzzTest_set(intList15, intList16, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_set(intList7, intList16, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = null;
        fuzzTest26.FuzzTest_set(intList27, intList28, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = null;
        fuzzTest33.FuzzTest_set(intList34, intList35, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest25.FuzzTest_set(intList27, intList35, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest44.FuzzTest_set(intList45, intList46, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = null;
        fuzzTest44.FuzzTest_set(intList51, intList52, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList58 = null;
        fuzzTest44.FuzzTest_set(intList57, intList58, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest63.FuzzTest_set(intList64, intList65, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, (-1), 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList74 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest44.FuzzTest_set(intList65, intList74, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList27, intList74, (int) 'a', (java.lang.Integer) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList4 = null;
        fuzzTest2.FuzzTest_set(intList3, intList4, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList11 = null;
        fuzzTest9.FuzzTest_set(intList10, intList11, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList17 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = null;
        fuzzTest16.FuzzTest_set(intList17, intList18, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = null;
        fuzzTest16.FuzzTest_set(intList23, intList24, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = null;
        fuzzTest30.FuzzTest_set(intList31, intList32, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = null;
        fuzzTest38.FuzzTest_set(intList39, intList40, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest38.FuzzTest_set(intList45, intList46, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest30.FuzzTest_set(intList37, intList46, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzzTest16.FuzzTest_set(intList29, intList37, 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_set(intList11, intList37, 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList66 = null;
        fuzzTest64.FuzzTest_set(intList65, intList66, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList73 = null;
        fuzzTest71.FuzzTest_set(intList72, intList73, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest63.FuzzTest_set(intList65, intList73, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList82 = null;
        fuzzTest2.FuzzTest_set(intList65, intList82, 10, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList1, intList65, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList11 = null;
        fuzzTest9.FuzzTest_set(intList10, intList11, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList17 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = null;
        fuzzTest16.FuzzTest_set(intList17, intList18, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest8.FuzzTest_set(intList10, intList18, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList30 = null;
        fuzzTest28.FuzzTest_set(intList29, intList30, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList37 = null;
        fuzzTest35.FuzzTest_set(intList36, intList37, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest27.FuzzTest_set(intList29, intList37, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList49 = null;
        fuzzTest47.FuzzTest_set(intList48, intList49, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = null;
        fuzzTest54.FuzzTest_set(intList55, intList56, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest46.FuzzTest_set(intList48, intList56, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzzTest8.FuzzTest_set(intList37, intList48, 2, (java.lang.Integer) 2, (java.lang.Integer) 10);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10, 10, 100, (-1) };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList74 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList77 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList78 = null;
        fuzzTest76.FuzzTest_set(intList77, intList78, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest8.FuzzTest_set(intList74, intList78, 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList7, intList74, (int) (short) 10, (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = null;
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList10, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest19.FuzzTest_set(intList20, intList21, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = null;
        fuzzTest19.FuzzTest_set(intList26, intList27, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest19.FuzzTest_set(intList32, intList33, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = null;
        fuzzTest38.FuzzTest_set(intList39, intList40, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, (-1), 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList49 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest19.FuzzTest_set(intList40, intList49, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList49, intList55, (int) '4', (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_set(intList7, intList8, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = null;
        fuzzTest0.FuzzTest_set(intList13, intList14, (int) ' ', (java.lang.Integer) 0, (java.lang.Integer) 2);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList19, intList20, (int) '4', (java.lang.Integer) (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = null;
        fuzzTest25.FuzzTest_set(intList26, intList27, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = null;
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest25.FuzzTest_set(intList32, intList36, 10, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = null;
        fuzzTest42.FuzzTest_set(intList43, intList44, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList49 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = null;
        fuzzTest42.FuzzTest_set(intList49, intList50, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = null;
        fuzzTest42.FuzzTest_set(intList55, intList56, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList63 = null;
        fuzzTest61.FuzzTest_set(intList62, intList63, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList69 = null;
        fuzzTest61.FuzzTest_set(intList68, intList69, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList74 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList75 = null;
        fuzzTest61.FuzzTest_set(intList74, intList75, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList80 = null;
        fuzzTest42.FuzzTest_set(intList74, intList80, 0, (java.lang.Integer) 100, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList36, intList74, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) 1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_set(intList7, intList8, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = null;
        fuzzTest0.FuzzTest_set(intList13, intList14, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest19.FuzzTest_set(intList20, intList21, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 100, 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = null;
        fuzzTest33.FuzzTest_set(intList34, intList35, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList41 = null;
        fuzzTest33.FuzzTest_set(intList40, intList41, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest26.FuzzTest_set(intList31, intList41, (int) (byte) 100, (java.lang.Integer) 2, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList20, intList31, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList16 = null;
        fuzzTest8.FuzzTest_set(intList15, intList16, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_set(intList7, intList16, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = null;
        fuzzTest25.FuzzTest_set(intList26, intList27, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest25.FuzzTest_set(intList32, intList33, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest25.FuzzTest_set(intList38, intList39, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest44.FuzzTest_set(intList45, intList46, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, (-1), 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest25.FuzzTest_set(intList46, intList55, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList61 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList55, intList61, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = null;
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-1), 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList11 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzzTest0.FuzzTest_set(intList7, intList11, 10, (java.lang.Integer) 1, (java.lang.Integer) 2);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = null;
        fuzzTest22.FuzzTest_set(intList23, intList24, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList30 = null;
        fuzzTest22.FuzzTest_set(intList29, intList30, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = null;
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList37 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = null;
        fuzzTest36.FuzzTest_set(intList37, intList38, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest44.FuzzTest_set(intList45, intList46, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = null;
        fuzzTest44.FuzzTest_set(intList51, intList52, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest36.FuzzTest_set(intList43, intList52, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzzTest22.FuzzTest_set(intList35, intList43, 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList66 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList67 = null;
        fuzzTest65.FuzzTest_set(intList66, intList67, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(intList67, intList72, 0, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList20, intList72, 10, (java.lang.Integer) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_set(intList7, intList8, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = null;
        fuzzTest0.FuzzTest_set(intList13, intList14, (int) ' ', (java.lang.Integer) 0, (java.lang.Integer) 2);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList19, intList20, (int) '4', (java.lang.Integer) (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = null;
        fuzzTest25.FuzzTest_set(intList26, intList27, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest25.FuzzTest_set(intList32, intList33, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest25.FuzzTest_set(intList38, intList39, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest44.FuzzTest_set(intList45, intList46, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList53 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList54 = null;
        fuzzTest52.FuzzTest_set(intList53, intList54, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList59 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList60 = null;
        fuzzTest52.FuzzTest_set(intList59, intList60, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest44.FuzzTest_set(intList51, intList60, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList38, intList51, (int) '4', (java.lang.Integer) 2, (java.lang.Integer) 10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = null;
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList16 = null;
        fuzzTest8.FuzzTest_set(intList15, intList16, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = null;
        fuzzTest8.FuzzTest_set(intList21, intList22, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest27.FuzzTest_set(intList28, intList29, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = null;
        fuzzTest27.FuzzTest_set(intList34, intList35, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList41 = null;
        fuzzTest27.FuzzTest_set(intList40, intList41, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = null;
        fuzzTest46.FuzzTest_set(intList47, intList48, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList53 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList54 = null;
        fuzzTest46.FuzzTest_set(intList53, intList54, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest8.FuzzTest_set(intList41, intList53, (int) (short) 1, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(intList41, intList63, (int) (byte) 10, (java.lang.Integer) 100, (java.lang.Integer) 10);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { (-1), 100, 0 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList75 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList76 = null;
        fuzzTest74.FuzzTest_set(intList75, intList76, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_set(intList72, intList76, (int) 'a', (java.lang.Integer) 100, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList85 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList72, intList85, (int) (short) 10, (java.lang.Integer) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_set(intList7, intList8, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = null;
        fuzzTest0.FuzzTest_set(intList13, intList14, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest19.FuzzTest_set(intList20, intList21, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = null;
        fuzzTest19.FuzzTest_set(intList26, intList27, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest19.FuzzTest_set(intList32, intList33, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = null;
        fuzzTest38.FuzzTest_set(intList39, intList40, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest38.FuzzTest_set(intList45, intList46, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = null;
        fuzzTest38.FuzzTest_set(intList51, intList52, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = null;
        fuzzTest19.FuzzTest_set(intList51, intList57, 0, (java.lang.Integer) 100, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList63 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = null;
        fuzzTest62.FuzzTest_set(intList63, intList64, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList69 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList70 = null;
        fuzzTest62.FuzzTest_set(intList69, intList70, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList75 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList76 = null;
        fuzzTest62.FuzzTest_set(intList75, intList76, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_set(intList76, intList81, (int) '4', (java.lang.Integer) 2, (java.lang.Integer) 1);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 0, 100, 0, (-1), 1, 2 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList93 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList81, intList93, 100, (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_set(intList7, intList8, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = null;
        fuzzTest0.FuzzTest_set(intList13, intList14, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest0.FuzzTest_set(intList19, intList20, (int) (byte) 1, (java.lang.Integer) 100, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = null;
        fuzzTest25.FuzzTest_set(intList26, intList27, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest25.FuzzTest_set(intList32, intList33, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest25.FuzzTest_set(intList38, intList39, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest44.FuzzTest_set(intList45, intList46, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = null;
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest44.FuzzTest_set(intList51, intList55, 10, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_set(intList39, intList55, 0, (java.lang.Integer) 100, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList66 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList65, intList66, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_set(intList7, intList8, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = null;
        fuzzTest17.FuzzTest_set(intList18, intList19, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList25 = null;
        fuzzTest17.FuzzTest_set(intList24, intList25, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = null;
        fuzzTest17.FuzzTest_set(intList30, intList31, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest37.FuzzTest_set(intList38, intList39, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = null;
        fuzzTest45.FuzzTest_set(intList46, intList47, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList53 = null;
        fuzzTest45.FuzzTest_set(intList52, intList53, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest37.FuzzTest_set(intList44, intList53, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList63 = null;
        fuzzTest37.FuzzTest_set(intList62, intList63, 1, (java.lang.Integer) 2, (java.lang.Integer) 0);
        fuzzTest17.FuzzTest_set(intList36, intList63, (int) (short) 100, (java.lang.Integer) 100, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList15, intList36, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_set(intList7, intList8, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = null;
        fuzzTest0.FuzzTest_set(intList13, intList14, (int) ' ', (java.lang.Integer) 0, (java.lang.Integer) 2);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100, 100, 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList25 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest27.FuzzTest_set(intList28, intList29, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = null;
        fuzzTest27.FuzzTest_set(intList34, intList35, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest20.FuzzTest_set(intList25, intList35, (int) (byte) 100, (java.lang.Integer) 2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest44.FuzzTest_set(intList45, intList46, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList53 = null;
        fuzzTest51.FuzzTest_set(intList52, intList53, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList58 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList59 = null;
        fuzzTest51.FuzzTest_set(intList58, intList59, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest51.FuzzTest_set(intList64, intList65, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList71 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = null;
        fuzzTest70.FuzzTest_set(intList71, intList72, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, (-1), 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList81 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest51.FuzzTest_set(intList72, intList81, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest20.FuzzTest_set(intList45, intList72, 2, (java.lang.Integer) 10, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList19, intList45, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList16 = null;
        fuzzTest8.FuzzTest_set(intList15, intList16, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_set(intList7, intList16, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList25 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = null;
        fuzzTest0.FuzzTest_set(intList25, intList26, 1, (java.lang.Integer) 2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest31.FuzzTest_set(intList32, intList33, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList42 = null;
        fuzzTest31.FuzzTest_set(intList40, intList42, (int) (short) 1, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList49 = null;
        fuzzTest47.FuzzTest_set(intList48, intList49, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList54 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = null;
        fuzzTest47.FuzzTest_set(intList54, intList55, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList60 = null;
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { (-1), (-1), 1, 2, 100, 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList68 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest47.FuzzTest_set(intList60, intList68, (int) (short) 1, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList40, intList68, (int) ' ', (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = null;
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList11 = null;
        fuzzTest9.FuzzTest_set(intList10, intList11, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList16 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList17 = null;
        fuzzTest9.FuzzTest_set(intList16, intList17, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = null;
        fuzzTest22.FuzzTest_set(intList23, intList24, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = null;
        fuzzTest30.FuzzTest_set(intList31, intList32, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest37.FuzzTest_set(intList38, intList39, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest29.FuzzTest_set(intList31, intList39, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = null;
        fuzzTest49.FuzzTest_set(intList50, intList51, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList58 = null;
        fuzzTest56.FuzzTest_set(intList57, intList58, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest48.FuzzTest_set(intList50, intList58, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzzTest22.FuzzTest_set(intList39, intList58, 100, (java.lang.Integer) 0, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList71 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(intList71, intList72, (int) '4', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest8.FuzzTest_set(intList17, intList72, 10, (java.lang.Integer) 1, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList2, intList72, (int) (byte) 100, (java.lang.Integer) 10, (java.lang.Integer) 2);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = null;
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList10, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = null;
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 2, 0, 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList25 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest0.FuzzTest_set(intList19, intList25, (int) (short) 10, (java.lang.Integer) 100, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest31.FuzzTest_set(intList32, intList33, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest31.FuzzTest_set(intList38, intList39, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest44.FuzzTest_set(intList45, intList46, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = null;
        fuzzTest44.FuzzTest_set(intList51, intList52, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList58 = null;
        fuzzTest44.FuzzTest_set(intList57, intList58, (int) ' ', (java.lang.Integer) 0, (java.lang.Integer) 2);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList63 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_set(intList63, intList64, (int) '4', (java.lang.Integer) (-1), (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_set(intList63, intList69, (int) (byte) 1, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 100, 2, 1, 100, 0 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList81 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList69, intList81, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList16 = null;
        fuzzTest8.FuzzTest_set(intList15, intList16, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_set(intList7, intList16, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = null;
        fuzzTest25.FuzzTest_set(intList26, intList27, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest32.FuzzTest_set(intList33, intList34, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList41 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList42 = null;
        fuzzTest40.FuzzTest_set(intList41, intList42, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = null;
        fuzzTest40.FuzzTest_set(intList47, intList48, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest32.FuzzTest_set(intList39, intList48, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList58 = null;
        fuzzTest32.FuzzTest_set(intList57, intList58, 1, (java.lang.Integer) 2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest63.FuzzTest_set(intList64, intList65, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList74 = null;
        fuzzTest63.FuzzTest_set(intList72, intList74, (int) (short) 1, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList80 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList81 = null;
        fuzzTest79.FuzzTest_set(intList80, intList81, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest32.FuzzTest_set(intList74, intList80, (int) ' ', (java.lang.Integer) 2, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList26, intList80, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList16 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList17 = null;
        fuzzTest15.FuzzTest_set(intList16, intList17, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest7.FuzzTest_set(intList9, intList17, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = null;
        fuzzTest26.FuzzTest_set(intList27, intList28, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest26.FuzzTest_set(intList33, intList34, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = null;
        fuzzTest26.FuzzTest_set(intList39, intList40, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = null;
        fuzzTest45.FuzzTest_set(intList46, intList47, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList53 = null;
        fuzzTest45.FuzzTest_set(intList52, intList53, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList58 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList59 = null;
        fuzzTest45.FuzzTest_set(intList58, intList59, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList66 = null;
        fuzzTest64.FuzzTest_set(intList65, intList66, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList71 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = null;
        fuzzTest64.FuzzTest_set(intList71, intList72, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest26.FuzzTest_set(intList59, intList71, (int) (short) 1, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList9, intList71, (int) ' ', (java.lang.Integer) 2, (java.lang.Integer) 2);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_set(intList7, intList8, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = null;
        fuzzTest0.FuzzTest_set(intList13, intList14, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest19.FuzzTest_set(intList20, intList21, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = null;
        fuzzTest19.FuzzTest_set(intList26, intList27, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest19.FuzzTest_set(intList32, intList33, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = null;
        fuzzTest0.FuzzTest_set(intList32, intList38, 0, (java.lang.Integer) 100, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList43 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = null;
        fuzzTest0.FuzzTest_set(intList43, intList44, (int) '4', (java.lang.Integer) 2, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = null;
        fuzzTest50.FuzzTest_set(intList51, intList52, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList58 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList59 = null;
        fuzzTest57.FuzzTest_set(intList58, intList59, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest49.FuzzTest_set(intList51, intList59, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList71 = null;
        fuzzTest69.FuzzTest_set(intList70, intList71, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList77 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList78 = null;
        fuzzTest76.FuzzTest_set(intList77, intList78, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest68.FuzzTest_set(intList70, intList78, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList51, intList70, (int) ' ', (java.lang.Integer) 2, (java.lang.Integer) 1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_set(intList7, intList8, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = null;
        fuzzTest0.FuzzTest_set(intList13, intList14, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest19.FuzzTest_set(intList20, intList21, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = null;
        fuzzTest19.FuzzTest_set(intList26, intList27, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest19.FuzzTest_set(intList32, intList33, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = null;
        fuzzTest0.FuzzTest_set(intList32, intList38, 0, (java.lang.Integer) 100, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = null;
        fuzzTest43.FuzzTest_set(intList44, intList45, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = null;
        fuzzTest43.FuzzTest_set(intList50, intList51, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = null;
        fuzzTest43.FuzzTest_set(intList56, intList57, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList57, intList62, (int) '4', (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList69 = null;
        fuzzTest67.FuzzTest_set(intList68, intList69, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList74 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList75 = null;
        fuzzTest67.FuzzTest_set(intList74, intList75, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList80 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList81 = null;
        fuzzTest67.FuzzTest_set(intList80, intList81, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList80, intList86, (int) (short) 100, (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = null;
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList10, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest19.FuzzTest_set(intList20, intList21, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = null;
        fuzzTest19.FuzzTest_set(intList26, intList27, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest19.FuzzTest_set(intList32, intList33, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest19.FuzzTest_set(intList38, intList39, (int) (byte) 1, (java.lang.Integer) 100, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = null;
        fuzzTest19.FuzzTest_set(intList44, intList45, 0, (java.lang.Integer) 2, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList44, intList50, 10, (java.lang.Integer) (-1), (java.lang.Integer) 1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100, 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest7.FuzzTest_set(intList8, intList9, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = null;
        fuzzTest7.FuzzTest_set(intList14, intList15, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_set(intList5, intList15, (int) (byte) 100, (java.lang.Integer) 2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList25 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = null;
        fuzzTest24.FuzzTest_set(intList25, intList26, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest32.FuzzTest_set(intList33, intList34, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = null;
        fuzzTest32.FuzzTest_set(intList39, intList40, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest24.FuzzTest_set(intList31, intList40, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList49 = null;
        fuzzTest0.FuzzTest_set(intList31, intList49, (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = null;
        fuzzTest54.FuzzTest_set(intList55, intList56, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList63 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = null;
        fuzzTest62.FuzzTest_set(intList63, intList64, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList69 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList70 = null;
        fuzzTest62.FuzzTest_set(intList69, intList70, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest54.FuzzTest_set(intList61, intList70, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList80 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList81 = null;
        fuzzTest79.FuzzTest_set(intList80, intList81, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList88 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList90 = null;
        fuzzTest79.FuzzTest_set(intList88, intList90, (int) (short) 1, (java.lang.Integer) 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList61, intList88, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 2);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_set(intList7, intList8, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = null;
        fuzzTest0.FuzzTest_set(intList13, intList14, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest0.FuzzTest_set(intList19, intList20, (int) (byte) 1, (java.lang.Integer) 100, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = null;
        fuzzTest25.FuzzTest_set(intList26, intList27, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest25.FuzzTest_set(intList32, intList33, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest25.FuzzTest_set(intList38, intList39, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest44.FuzzTest_set(intList45, intList46, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = null;
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest44.FuzzTest_set(intList51, intList55, 10, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_set(intList39, intList55, 0, (java.lang.Integer) 100, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList66 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList67 = null;
        fuzzTest65.FuzzTest_set(intList66, intList67, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList73 = null;
        fuzzTest65.FuzzTest_set(intList72, intList73, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList78 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList79 = null;
        fuzzTest65.FuzzTest_set(intList78, intList79, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 10, 10, 0 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList88 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList78, intList88, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 2);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList17 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = null;
        fuzzTest16.FuzzTest_set(intList17, intList18, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = null;
        fuzzTest16.FuzzTest_set(intList23, intList24, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest8.FuzzTest_set(intList15, intList24, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_set(intList7, intList15, (int) (byte) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest37.FuzzTest_set(intList38, intList39, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = null;
        fuzzTest45.FuzzTest_set(intList46, intList47, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList53 = null;
        fuzzTest45.FuzzTest_set(intList52, intList53, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest37.FuzzTest_set(intList44, intList53, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList63 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = null;
        fuzzTest62.FuzzTest_set(intList63, intList64, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(intList64, intList69, (-1), (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { (-1), 10, 2, 100, 0, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList81 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList69, intList81, (int) '4', (java.lang.Integer) 1, (java.lang.Integer) 2);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = null;
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList10, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest0.FuzzTest_set(intList19, intList20, (int) (short) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList25 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = null;
        fuzzTest0.FuzzTest_set(intList25, intList26, (-1), (java.lang.Integer) (-1), (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = null;
        fuzzTest0.FuzzTest_set(intList31, intList32, (int) (byte) 10, (java.lang.Integer) 100, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList37 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = null;
        fuzzTest0.FuzzTest_set(intList37, intList38, (int) (byte) -1, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList49 = null;
        fuzzTest44.FuzzTest_set(intList47, intList49, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = null;
        fuzzTest55.FuzzTest_set(intList56, intList57, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList66 = null;
        fuzzTest55.FuzzTest_set(intList64, intList66, (int) (short) 1, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzzTest44.FuzzTest_set(intList54, intList64, 100, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList43, intList64, (int) (short) 100, (java.lang.Integer) 1, (java.lang.Integer) 2);
    }
}

