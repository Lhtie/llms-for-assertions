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
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList3 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, (-1), (-1), (-1) };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 0 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList11 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList6, intList11, (int) '#', (java.lang.Integer) 1, (java.lang.Integer) 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 1, 0, 10 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 0, 0 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList12 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList6, intList12, (int) (byte) -1, (java.lang.Integer) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1) };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList4 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, (-1), 0 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList11 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList4, intList11, (int) (short) 10, (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest12.FuzzTest_set(intList13, intList17, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList17, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList30 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList33 = null;
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList37 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest32.FuzzTest_set(intList33, intList37, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList30, intList37, (int) (byte) 10, (java.lang.Integer) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList3 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest2.FuzzTest_set(intList3, intList7, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest1.FuzzTest_set(intList3, intList18, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList26 = null;
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList30 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest25.FuzzTest_set(intList26, intList30, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList41 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest24.FuzzTest_set(intList26, intList41, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList18, intList41, 10, (java.lang.Integer) 100, (java.lang.Integer) 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest12.FuzzTest_set(intList13, intList17, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList17, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList32 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList36 = null;
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList40 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest35.FuzzTest_set(intList36, intList40, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList47 = null;
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList51 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest46.FuzzTest_set(intList47, intList51, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest34.FuzzTest_set(intList36, intList51, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList32, intList51, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzzTest0.FuzzTest_set(intList1, intList5, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest12.FuzzTest_set(intList13, intList17, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList24 = null;
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList28 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest23.FuzzTest_set(intList24, intList28, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest11.FuzzTest_set(intList13, intList28, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList39 = null;
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList43 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest38.FuzzTest_set(intList39, intList43, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList51 = null;
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList55 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest50.FuzzTest_set(intList51, intList55, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList62 = null;
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList66 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest61.FuzzTest_set(intList62, intList66, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest49.FuzzTest_set(intList51, intList66, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest11.FuzzTest_set(intList39, intList66, (int) '#', (java.lang.Integer) 100, (java.lang.Integer) 0);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10, (-1), 1, 1, 10 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList86 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList66, intList86, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_set(intList2, intList17, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList24 = null;
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList28 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest23.FuzzTest_set(intList24, intList28, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, (-1), 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList38 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList42 = null;
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList46 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest41.FuzzTest_set(intList42, intList46, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList53 = null;
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList57 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest52.FuzzTest_set(intList53, intList57, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest40.FuzzTest_set(intList42, intList57, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest23.FuzzTest_set(intList38, intList57, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList72 = null;
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList76 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest71.FuzzTest_set(intList72, intList76, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList38, intList76, (int) (byte) 100, (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList12 = null;
        fuzzTest0.FuzzTest_set(intList2, intList12, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, 100, 0, 10 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList22 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 0, 1, 10, 1, 10 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList30 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList22, intList30, (int) (short) -1, (java.lang.Integer) 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList4 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList8 = null;
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList12 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest7.FuzzTest_set(intList8, intList12, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList18 = null;
        fuzzTest6.FuzzTest_set(intList8, intList18, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList25 = null;
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList29 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest24.FuzzTest_set(intList25, intList29, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList36 = null;
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList40 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest35.FuzzTest_set(intList36, intList40, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest23.FuzzTest_set(intList25, intList40, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList52 = null;
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList56 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest51.FuzzTest_set(intList52, intList56, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList63 = null;
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList67 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest62.FuzzTest_set(intList63, intList67, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest50.FuzzTest_set(intList52, intList67, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest6.FuzzTest_set(intList25, intList67, (int) (short) -1, (java.lang.Integer) (-1), (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList4, intList67, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest12.FuzzTest_set(intList13, intList17, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList17, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList29 = null;
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList33 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest28.FuzzTest_set(intList29, intList33, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList44 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest27.FuzzTest_set(intList29, intList44, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList52 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList44, intList52, (int) 'a', (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList3 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest2.FuzzTest_set(intList3, intList7, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1), 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList21 = null;
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList25 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest20.FuzzTest_set(intList21, intList25, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList32 = null;
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList36 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest31.FuzzTest_set(intList32, intList36, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest19.FuzzTest_set(intList21, intList36, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest2.FuzzTest_set(intList17, intList36, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_set(intList1, intList17, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList57 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList61 = null;
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList65 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest60.FuzzTest_set(intList61, intList65, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList72 = null;
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList76 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest71.FuzzTest_set(intList72, intList76, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest59.FuzzTest_set(intList61, intList76, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList57, intList76, (int) (short) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_set(intList2, intList17, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList25 = null;
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList29 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest24.FuzzTest_set(intList25, intList29, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList40 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest23.FuzzTest_set(intList25, intList40, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList47 = null;
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList51 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest46.FuzzTest_set(intList47, intList51, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1, (-1), 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList61 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList65 = null;
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList69 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest64.FuzzTest_set(intList65, intList69, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList76 = null;
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList80 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest75.FuzzTest_set(intList76, intList80, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest63.FuzzTest_set(intList65, intList80, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest46.FuzzTest_set(intList61, intList80, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList40, intList61, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzzTest0.FuzzTest_set(intList1, intList5, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest12.FuzzTest_set(intList13, intList17, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList24 = null;
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList28 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest23.FuzzTest_set(intList24, intList28, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest11.FuzzTest_set(intList13, intList28, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList39 = null;
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList43 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest38.FuzzTest_set(intList39, intList43, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList28, intList43, (int) (short) -1, (java.lang.Integer) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = null;
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList9 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest4.FuzzTest_set(intList5, intList9, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1), 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList23 = null;
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList27 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest22.FuzzTest_set(intList23, intList27, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList34 = null;
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList38 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest33.FuzzTest_set(intList34, intList38, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest21.FuzzTest_set(intList23, intList38, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest4.FuzzTest_set(intList19, intList38, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        fuzzTest2.FuzzTest_set(intList3, intList19, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_set(intList1, intList19, (int) (short) -1, (java.lang.Integer) 1, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList61 = null;
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList65 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest60.FuzzTest_set(intList61, intList65, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList76 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList78 = null;
        fuzzTest71.FuzzTest_set(intList76, intList78, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList65, intList76, (int) (short) -1, (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzzTest0.FuzzTest_set(intList1, intList5, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest12.FuzzTest_set(intList13, intList17, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList28 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest11.FuzzTest_set(intList13, intList28, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, (-1) };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList37 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest0.FuzzTest_set(intList13, intList37, (int) (short) 0, (java.lang.Integer) 100, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList44 = null;
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList48 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest43.FuzzTest_set(intList44, intList48, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList56 = null;
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList60 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest55.FuzzTest_set(intList56, intList60, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList71 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest54.FuzzTest_set(intList56, intList71, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList79 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList81 = null;
        fuzzTest54.FuzzTest_set(intList79, intList81, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList48, intList79, 10, (java.lang.Integer) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList7 = null;
        fuzzTest0.FuzzTest_set(intList5, intList7, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList19 = null;
        fuzzTest12.FuzzTest_set(intList17, intList19, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList30 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList32 = null;
        fuzzTest25.FuzzTest_set(intList30, intList32, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest12.FuzzTest_set(intList24, intList30, 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList44 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest0.FuzzTest_set(intList24, intList44, (int) ' ', (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList52 = null;
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList56 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest51.FuzzTest_set(intList52, intList56, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList67 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest50.FuzzTest_set(intList52, intList67, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList75 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList77 = null;
        fuzzTest50.FuzzTest_set(intList75, intList77, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList83 = null;
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList87 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest82.FuzzTest_set(intList83, intList87, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList75, intList87, (int) (short) 100, (java.lang.Integer) 100, (java.lang.Integer) 100);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzzTest0.FuzzTest_set(intList1, intList5, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 1, 100, 10, (-1) };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList20 = null;
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList24 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest19.FuzzTest_set(intList20, intList24, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, (-1), 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList34 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList38 = null;
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList42 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest37.FuzzTest_set(intList38, intList42, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList49 = null;
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList53 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest48.FuzzTest_set(intList49, intList53, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest36.FuzzTest_set(intList38, intList53, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest19.FuzzTest_set(intList34, intList53, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList17, intList53, (-1), (java.lang.Integer) 100, (java.lang.Integer) 10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList12 = null;
        fuzzTest0.FuzzTest_set(intList2, intList12, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList22 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList24 = null;
        fuzzTest17.FuzzTest_set(intList22, intList24, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList35 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList37 = null;
        fuzzTest30.FuzzTest_set(intList35, intList37, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest17.FuzzTest_set(intList29, intList35, 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList47 = null;
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList51 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest46.FuzzTest_set(intList47, intList51, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1, (-1), 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList61 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList65 = null;
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList69 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest64.FuzzTest_set(intList65, intList69, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList76 = null;
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList80 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest75.FuzzTest_set(intList76, intList80, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest63.FuzzTest_set(intList65, intList80, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest46.FuzzTest_set(intList61, intList80, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList35, intList61, (-1), (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), 10, 10, 0, 0 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList11 = null;
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList15 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest10.FuzzTest_set(intList11, intList15, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest9.FuzzTest_set(intList11, intList21, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList28 = null;
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList32 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest27.FuzzTest_set(intList28, intList32, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList39 = null;
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList43 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest38.FuzzTest_set(intList39, intList43, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest26.FuzzTest_set(intList28, intList43, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList55 = null;
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList59 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest54.FuzzTest_set(intList55, intList59, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList66 = null;
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList70 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest65.FuzzTest_set(intList66, intList70, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest53.FuzzTest_set(intList55, intList70, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest9.FuzzTest_set(intList28, intList70, (int) (short) -1, (java.lang.Integer) (-1), (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList7, intList70, (-1), (java.lang.Integer) 1, (java.lang.Integer) 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList7 = null;
        fuzzTest0.FuzzTest_set(intList5, intList7, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList19 = null;
        fuzzTest12.FuzzTest_set(intList17, intList19, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList30 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList32 = null;
        fuzzTest25.FuzzTest_set(intList30, intList32, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest12.FuzzTest_set(intList24, intList30, 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList44 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest0.FuzzTest_set(intList24, intList44, (int) ' ', (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList55 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList57 = null;
        fuzzTest50.FuzzTest_set(intList55, intList57, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList62 = null;
        fuzzTest0.FuzzTest_set(intList57, intList62, (int) (short) 10, (java.lang.Integer) 100, (java.lang.Integer) 1);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList70 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList74 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList70, intList74, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzzTest0.FuzzTest_set(intList1, intList5, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1), 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList15 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList19 = null;
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList23 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest18.FuzzTest_set(intList19, intList23, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList30 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList34 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest29.FuzzTest_set(intList30, intList34, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest17.FuzzTest_set(intList19, intList34, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList15, intList34, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList50 = null;
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList54 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest49.FuzzTest_set(intList50, intList54, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList61 = null;
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList65 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest60.FuzzTest_set(intList61, intList65, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest48.FuzzTest_set(intList50, intList65, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList79 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList65, intList79, (int) (short) 100, (java.lang.Integer) 1, (java.lang.Integer) 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_set(intList2, intList17, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList24 = null;
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList28 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest23.FuzzTest_set(intList24, intList28, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList36 = null;
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList40 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest35.FuzzTest_set(intList36, intList40, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList51 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest34.FuzzTest_set(intList36, intList51, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, (-1) };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList60 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest23.FuzzTest_set(intList36, intList60, (int) (short) 0, (java.lang.Integer) 100, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10, 0, 1, 10, 10 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList72 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList60, intList72, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest12.FuzzTest_set(intList13, intList17, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList17, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList30 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList34 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest29.FuzzTest_set(intList30, intList34, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList45 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest28.FuzzTest_set(intList30, intList45, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList53 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList55 = null;
        fuzzTest28.FuzzTest_set(intList53, intList55, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList60 = null;
        fuzzTest27.FuzzTest_set(intList53, intList60, (int) (byte) 1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList67 = null;
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList71 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest66.FuzzTest_set(intList67, intList71, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList82 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest65.FuzzTest_set(intList67, intList82, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList53, intList82, (int) (byte) -1, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzzTest0.FuzzTest_set(intList1, intList5, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1), 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList15 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList19 = null;
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList23 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest18.FuzzTest_set(intList19, intList23, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList30 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList34 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest29.FuzzTest_set(intList30, intList34, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest17.FuzzTest_set(intList19, intList34, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList15, intList34, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList48 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList49 = null;
        fuzzTest0.FuzzTest_set(intList48, intList49, (int) (byte) 0, (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList59 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList61 = null;
        fuzzTest54.FuzzTest_set(intList59, intList61, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList72 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList74 = null;
        fuzzTest67.FuzzTest_set(intList72, intList74, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest54.FuzzTest_set(intList66, intList72, 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList84 = null;
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList88 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest83.FuzzTest_set(intList84, intList88, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList72, intList88, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest12.FuzzTest_set(intList13, intList17, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList17, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList27 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList28 = null;
        fuzzTest0.FuzzTest_set(intList27, intList28, (int) ' ', (java.lang.Integer) 0, (java.lang.Integer) 0);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 10, 100, (-1), 10 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList39 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList43 = null;
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList47 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest42.FuzzTest_set(intList43, intList47, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList58 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest41.FuzzTest_set(intList43, intList58, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList66 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList68 = null;
        fuzzTest41.FuzzTest_set(intList66, intList68, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList39, intList66, (int) 'a', (java.lang.Integer) (-1), (java.lang.Integer) 10);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, 1, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList9 = null;
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList13 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest8.FuzzTest_set(intList9, intList13, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList24 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest7.FuzzTest_set(intList9, intList24, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList32 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest7.FuzzTest_set(intList32, intList34, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList40 = null;
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList44 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest39.FuzzTest_set(intList40, intList44, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, (-1), 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList54 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList58 = null;
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList62 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest57.FuzzTest_set(intList58, intList62, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList69 = null;
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList73 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest68.FuzzTest_set(intList69, intList73, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest56.FuzzTest_set(intList58, intList73, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest39.FuzzTest_set(intList54, intList73, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList32, intList54, (int) (short) 100, (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzzTest0.FuzzTest_set(intList1, intList5, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1), 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList15 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList19 = null;
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList23 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest18.FuzzTest_set(intList19, intList23, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList30 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList34 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest29.FuzzTest_set(intList30, intList34, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest17.FuzzTest_set(intList19, intList34, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList15, intList34, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList50 = null;
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList54 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest49.FuzzTest_set(intList50, intList54, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList65 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest48.FuzzTest_set(intList50, intList65, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList73 = null;
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList77 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest72.FuzzTest_set(intList73, intList77, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList88 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest71.FuzzTest_set(intList73, intList88, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList65, intList88, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest12.FuzzTest_set(intList13, intList17, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList17, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList29 = null;
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList33 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest28.FuzzTest_set(intList29, intList33, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList40 = null;
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList44 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest39.FuzzTest_set(intList40, intList44, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest27.FuzzTest_set(intList29, intList44, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList54 = null;
        fuzzTest0.FuzzTest_set(intList44, intList54, (-1), (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList61 = null;
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList65 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest60.FuzzTest_set(intList61, intList65, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList72 = null;
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList76 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest71.FuzzTest_set(intList72, intList76, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest59.FuzzTest_set(intList61, intList76, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList88 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList76, intList88, (int) (short) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest1.FuzzTest_set(intList6, intList8, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest14.FuzzTest_set(intList19, intList21, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_set(intList13, intList19, 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList33 = null;
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList37 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest32.FuzzTest_set(intList33, intList37, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList48 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest31.FuzzTest_set(intList33, intList48, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList56 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList58 = null;
        fuzzTest31.FuzzTest_set(intList56, intList58, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_set(intList30, intList56, (int) (short) 1, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList67 = null;
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { (-1), 10, 0 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList72 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest1.FuzzTest_set(intList67, intList72, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList79 = null;
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList83 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest78.FuzzTest_set(intList79, intList83, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList72, intList83, (int) (short) 100, (java.lang.Integer) 100, (java.lang.Integer) 100);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_set(intList2, intList17, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList25 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList29 = null;
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList33 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest28.FuzzTest_set(intList29, intList33, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList44 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest27.FuzzTest_set(intList29, intList44, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList52 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList54 = null;
        fuzzTest27.FuzzTest_set(intList52, intList54, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList25, intList52, (int) (byte) 100, (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, 1, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList9 = null;
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList13 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest8.FuzzTest_set(intList9, intList13, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList24 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest7.FuzzTest_set(intList9, intList24, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList32 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest7.FuzzTest_set(intList32, intList34, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList44 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest39.FuzzTest_set(intList44, intList46, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList51 = null;
        fuzzTest7.FuzzTest_set(intList44, intList51, (int) '#', (java.lang.Integer) 100, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList59 = null;
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList63 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest58.FuzzTest_set(intList59, intList63, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList74 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest57.FuzzTest_set(intList59, intList74, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList82 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList84 = null;
        fuzzTest57.FuzzTest_set(intList82, intList84, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList89 = null;
        fuzzTest56.FuzzTest_set(intList82, intList89, (int) (byte) 1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList44, intList82, (-1), (java.lang.Integer) 100, (java.lang.Integer) 10);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList7 = null;
        fuzzTest0.FuzzTest_set(intList5, intList7, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest13.FuzzTest_set(intList18, intList20, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList12, intList18, 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList29 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList30 = null;
        fuzzTest0.FuzzTest_set(intList29, intList30, (int) '#', (java.lang.Integer) 100, (java.lang.Integer) 1);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10, 0, 0, 10, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList41 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList44 = null;
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList48 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest43.FuzzTest_set(intList44, intList48, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, (-1), 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList58 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList62 = null;
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList66 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest61.FuzzTest_set(intList62, intList66, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList73 = null;
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList77 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest72.FuzzTest_set(intList73, intList77, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest60.FuzzTest_set(intList62, intList77, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest43.FuzzTest_set(intList58, intList77, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList41, intList77, 100, (java.lang.Integer) 10, (java.lang.Integer) 1);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList7 = null;
        fuzzTest0.FuzzTest_set(intList5, intList7, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest13.FuzzTest_set(intList18, intList20, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList12, intList18, 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList30 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList34 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest29.FuzzTest_set(intList30, intList34, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, (-1), 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList44 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList48 = null;
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList52 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest47.FuzzTest_set(intList48, intList52, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList59 = null;
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList63 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest58.FuzzTest_set(intList59, intList63, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest46.FuzzTest_set(intList48, intList63, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest29.FuzzTest_set(intList44, intList63, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10, 10, 0 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList81 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList63, intList81, (int) (short) 1, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList7 = null;
        fuzzTest0.FuzzTest_set(intList5, intList7, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList19 = null;
        fuzzTest12.FuzzTest_set(intList17, intList19, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList30 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList32 = null;
        fuzzTest25.FuzzTest_set(intList30, intList32, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest12.FuzzTest_set(intList24, intList30, 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList44 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest0.FuzzTest_set(intList24, intList44, (int) ' ', (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList51 = null;
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList55 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest50.FuzzTest_set(intList51, intList55, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList61 = null;
        fuzzTest0.FuzzTest_set(intList55, intList61, (int) '#', (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList67 = null;
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList71 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest66.FuzzTest_set(intList67, intList71, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10, (-1), (-1) };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList81 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList71, intList81, (int) (byte) 10, (java.lang.Integer) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest12.FuzzTest_set(intList13, intList17, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList17, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList29 = null;
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList33 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest28.FuzzTest_set(intList29, intList33, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList44 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest27.FuzzTest_set(intList29, intList44, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList50 = null;
        fuzzTest0.FuzzTest_set(intList44, intList50, (int) '4', (java.lang.Integer) 1, (java.lang.Integer) 10);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList55 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList56 = null;
        fuzzTest0.FuzzTest_set(intList55, intList56, 0, (java.lang.Integer) 100, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList63 = null;
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList67 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest62.FuzzTest_set(intList63, intList67, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList78 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest61.FuzzTest_set(intList63, intList78, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList89 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList91 = null;
        fuzzTest84.FuzzTest_set(intList89, intList91, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList78, intList89, (int) (byte) -1, (java.lang.Integer) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_set(intList2, intList17, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList28 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList30 = null;
        fuzzTest23.FuzzTest_set(intList28, intList30, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList36 = null;
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList40 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest35.FuzzTest_set(intList36, intList40, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, (-1), 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList50 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList54 = null;
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList58 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest53.FuzzTest_set(intList54, intList58, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList65 = null;
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList69 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest64.FuzzTest_set(intList65, intList69, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest52.FuzzTest_set(intList54, intList69, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest35.FuzzTest_set(intList50, intList69, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList83 = null;
        fuzzTest23.FuzzTest_set(intList50, intList83, (int) (short) -1, (java.lang.Integer) 0, (java.lang.Integer) 10);
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 10, 0, 0, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList94 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList94, intArray93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList50, intList94, (int) (short) 10, (java.lang.Integer) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest12.FuzzTest_set(intList13, intList17, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList17, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList29 = null;
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList33 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest28.FuzzTest_set(intList29, intList33, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList40 = null;
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList44 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest39.FuzzTest_set(intList40, intList44, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest27.FuzzTest_set(intList29, intList44, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList54 = null;
        fuzzTest0.FuzzTest_set(intList44, intList54, (-1), (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1) };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList61 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList64 = null;
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList68 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest63.FuzzTest_set(intList64, intList68, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList61, intList68, (int) ' ', (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzzTest0.FuzzTest_set(intList1, intList5, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 1, 10 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList15 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList18 = null;
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList22 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest17.FuzzTest_set(intList18, intList22, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1, (-1), 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList32 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList36 = null;
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList40 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest35.FuzzTest_set(intList36, intList40, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList47 = null;
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList51 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest46.FuzzTest_set(intList47, intList51, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest34.FuzzTest_set(intList36, intList51, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest17.FuzzTest_set(intList32, intList51, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList15, intList32, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, 1, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList12 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList14 = null;
        fuzzTest7.FuzzTest_set(intList12, intList14, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList25 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList27 = null;
        fuzzTest20.FuzzTest_set(intList25, intList27, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest7.FuzzTest_set(intList19, intList25, 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList36 = null;
        fuzzTest0.FuzzTest_set(intList19, intList36, (int) (byte) 1, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList42 = null;
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList46 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest41.FuzzTest_set(intList42, intList46, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList57 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList59 = null;
        fuzzTest52.FuzzTest_set(intList57, intList59, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList64 = null;
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList70 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList72 = null;
        fuzzTest65.FuzzTest_set(intList70, intList72, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest52.FuzzTest_set(intList64, intList70, 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList46, intList70, 100, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_set(intList2, intList17, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList25 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList28 = null;
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList32 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest27.FuzzTest_set(intList28, intList32, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, (-1), 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList42 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList46 = null;
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList50 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest45.FuzzTest_set(intList46, intList50, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList57 = null;
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList61 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest56.FuzzTest_set(intList57, intList61, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest44.FuzzTest_set(intList46, intList61, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest27.FuzzTest_set(intList42, intList61, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList25, intList61, (int) (byte) 10, (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzzTest0.FuzzTest_set(intList1, intList5, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList16 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList18 = null;
        fuzzTest11.FuzzTest_set(intList16, intList18, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList25 = null;
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList29 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest24.FuzzTest_set(intList25, intList29, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList40 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest23.FuzzTest_set(intList25, intList40, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList48 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList50 = null;
        fuzzTest23.FuzzTest_set(intList48, intList50, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList59 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest11.FuzzTest_set(intList50, intList59, 10, (java.lang.Integer) 100, (java.lang.Integer) 1);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest0.FuzzTest_set(intList59, intList65, 1, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList75 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList77 = null;
        fuzzTest70.FuzzTest_set(intList75, intList77, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1, (-1), 1, 0, (-1) };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList88 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList75, intList88, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList3 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest2.FuzzTest_set(intList3, intList7, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest1.FuzzTest_set(intList3, intList18, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList26 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList28 = null;
        fuzzTest1.FuzzTest_set(intList26, intList28, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList34 = null;
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList38 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest33.FuzzTest_set(intList34, intList38, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 100, 1, 100, (-1) };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList50 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList52 = null;
        fuzzTest33.FuzzTest_set(intList50, intList52, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList26, intList50, (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList3 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest2.FuzzTest_set(intList3, intList7, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest1.FuzzTest_set(intList3, intList18, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList26 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList28 = null;
        fuzzTest1.FuzzTest_set(intList26, intList28, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList35 = null;
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList39 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest34.FuzzTest_set(intList35, intList39, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList50 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest33.FuzzTest_set(intList35, intList50, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList58 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList60 = null;
        fuzzTest33.FuzzTest_set(intList58, intList60, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList28, intList58, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList70 = null;
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList74 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest69.FuzzTest_set(intList70, intList74, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList81 = null;
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList85 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest80.FuzzTest_set(intList81, intList85, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList74, intList85, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, 1, (java.lang.Integer) 1, (java.lang.Integer) 10);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList10 = null;
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList14 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest9.FuzzTest_set(intList10, intList14, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList25 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest8.FuzzTest_set(intList10, intList25, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_set(intList7, intList10, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 1);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList35 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList36 = null;
        fuzzTest0.FuzzTest_set(intList35, intList36, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10, 100, 1, 0 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList46 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList49 = null;
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList53 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest48.FuzzTest_set(intList49, intList53, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, (-1), 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList63 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList67 = null;
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList71 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest66.FuzzTest_set(intList67, intList71, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList78 = null;
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList82 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest77.FuzzTest_set(intList78, intList82, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest65.FuzzTest_set(intList67, intList82, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest48.FuzzTest_set(intList63, intList82, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList46, intList82, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList7 = null;
        fuzzTest0.FuzzTest_set(intList5, intList7, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest13.FuzzTest_set(intList18, intList20, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList12, intList18, 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList29 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList30 = null;
        fuzzTest0.FuzzTest_set(intList29, intList30, (int) '#', (java.lang.Integer) 100, (java.lang.Integer) 1);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList38 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList40 = null;
        fuzzTest0.FuzzTest_set(intList38, intList40, (int) '4', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList46 = null;
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList50 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest45.FuzzTest_set(intList46, intList50, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList57 = null;
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList61 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest56.FuzzTest_set(intList57, intList61, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList73 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList75 = null;
        fuzzTest68.FuzzTest_set(intList73, intList75, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest56.FuzzTest_set(intList67, intList73, (int) 'a', (java.lang.Integer) (-1), (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList50, intList73, (int) '4', (java.lang.Integer) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest1.FuzzTest_set(intList6, intList8, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest14.FuzzTest_set(intList19, intList21, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_set(intList13, intList19, 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList32 = null;
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList36 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest31.FuzzTest_set(intList32, intList36, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList47 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest30.FuzzTest_set(intList32, intList47, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList56 = null;
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList60 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest55.FuzzTest_set(intList56, intList60, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList71 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest54.FuzzTest_set(intList56, intList71, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList79 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList81 = null;
        fuzzTest54.FuzzTest_set(intList79, intList81, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList86 = null;
        fuzzTest53.FuzzTest_set(intList79, intList86, (int) (byte) 1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList91 = null;
        fuzzTest30.FuzzTest_set(intList79, intList91, 0, (java.lang.Integer) 0, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList19, intList79, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_set(intList2, intList17, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList25 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList27 = null;
        fuzzTest0.FuzzTest_set(intList25, intList27, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList37 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest32.FuzzTest_set(intList37, intList39, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList44 = null;
        fuzzTest0.FuzzTest_set(intList37, intList44, (int) '#', (java.lang.Integer) 100, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList49 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList50 = null;
        fuzzTest0.FuzzTest_set(intList49, intList50, (int) (short) 1, (java.lang.Integer) 1, (java.lang.Integer) 10);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList55 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList56 = null;
        fuzzTest0.FuzzTest_set(intList55, intList56, (int) 'a', (java.lang.Integer) 100, (java.lang.Integer) 1);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList61 = null;
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList67 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList69 = null;
        fuzzTest62.FuzzTest_set(intList67, intList69, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList61, intList69, (int) (short) 10, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList79 = null;
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList83 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest78.FuzzTest_set(intList79, intList83, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList91 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList83, intList91, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest2.FuzzTest_set(intList7, intList9, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList1, intList9, (int) (byte) 10, (java.lang.Integer) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList23 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList25 = null;
        fuzzTest18.FuzzTest_set(intList23, intList25, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList31 = null;
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList35 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest30.FuzzTest_set(intList31, intList35, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 100, 1, 100, (-1) };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList47 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList49 = null;
        fuzzTest30.FuzzTest_set(intList47, intList49, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList59 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList61 = null;
        fuzzTest54.FuzzTest_set(intList59, intList61, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList66 = null;
        fuzzTest30.FuzzTest_set(intList59, intList66, (int) (byte) 100, (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList23, intList59, (int) '#', (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, 1, (java.lang.Integer) 1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, 1, 10, 10, (-1) };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList13 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList16 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = null;
        fuzzTest15.FuzzTest_set(intList16, intList17, 1, (java.lang.Integer) 1, (java.lang.Integer) 10);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList25 = null;
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList29 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest24.FuzzTest_set(intList25, intList29, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList40 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest23.FuzzTest_set(intList25, intList40, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzzTest15.FuzzTest_set(intList22, intList25, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 1);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList50 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList51 = null;
        fuzzTest15.FuzzTest_set(intList50, intList51, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList56 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList57 = null;
        fuzzTest15.FuzzTest_set(intList56, intList57, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList64 = null;
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList68 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest63.FuzzTest_set(intList64, intList68, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList79 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest62.FuzzTest_set(intList64, intList79, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList85 = null;
        fuzzTest15.FuzzTest_set(intList79, intList85, (-1), (java.lang.Integer) 1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList13, intList79, (int) (byte) -1, (java.lang.Integer) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList12 = null;
        fuzzTest0.FuzzTest_set(intList2, intList12, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList18 = null;
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList22 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest17.FuzzTest_set(intList18, intList22, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList28 = null;
        fuzzTest0.FuzzTest_set(intList18, intList28, (int) (byte) -1, (java.lang.Integer) 0, (java.lang.Integer) 10);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList33 = null;
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList36 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest0.FuzzTest_set(intList33, intList36, (int) (byte) 10, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList44 = null;
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList48 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest43.FuzzTest_set(intList44, intList48, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList59 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest42.FuzzTest_set(intList44, intList59, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 100, 1, 100, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList71 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList59, intList71, (int) (byte) 100, (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzzTest0.FuzzTest_set(intList1, intList5, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList17 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList19 = null;
        fuzzTest12.FuzzTest_set(intList17, intList19, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList11, intList17, (int) 'a', (java.lang.Integer) (-1), (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList33 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList35 = null;
        fuzzTest28.FuzzTest_set(intList33, intList35, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList46 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList48 = null;
        fuzzTest41.FuzzTest_set(intList46, intList48, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList53 = null;
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList59 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList61 = null;
        fuzzTest54.FuzzTest_set(intList59, intList61, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest41.FuzzTest_set(intList53, intList59, 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList71 = null;
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList75 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest70.FuzzTest_set(intList71, intList75, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest40.FuzzTest_set(intList53, intList75, (int) (short) 10, (java.lang.Integer) 0, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList33, intList75, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList1 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, 1, (java.lang.Integer) 1, (java.lang.Integer) 10);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList10 = null;
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList14 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest9.FuzzTest_set(intList10, intList14, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList25 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest8.FuzzTest_set(intList10, intList25, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_set(intList7, intList10, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList37 = null;
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList41 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest36.FuzzTest_set(intList37, intList41, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList47 = null;
        fuzzTest35.FuzzTest_set(intList37, intList47, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList54 = null;
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList58 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest53.FuzzTest_set(intList54, intList58, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList65 = null;
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList69 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest64.FuzzTest_set(intList65, intList69, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzzTest52.FuzzTest_set(intList54, intList69, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList79 = null;
        fuzzTest35.FuzzTest_set(intList69, intList79, (int) (byte) 1, (java.lang.Integer) 100, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 10, 10, 100, 0 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList89 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList69, intList89, (int) (short) 100, (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest1.FuzzTest_set(intList2, intList6, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList12 = null;
        fuzzTest0.FuzzTest_set(intList2, intList12, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList18 = null;
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList22 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest17.FuzzTest_set(intList18, intList22, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList28 = null;
        fuzzTest0.FuzzTest_set(intList18, intList28, (int) (byte) -1, (java.lang.Integer) 0, (java.lang.Integer) 10);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList33 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest0.FuzzTest_set(intList33, intList34, (int) (byte) 10, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList39 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList40 = null;
        fuzzTest0.FuzzTest_set(intList39, intList40, (int) (byte) 1, (java.lang.Integer) (-1), (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList47 = null;
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList51 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest46.FuzzTest_set(intList47, intList51, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList57 = null;
        fuzzTest45.FuzzTest_set(intList47, intList57, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList62 = null;
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList65 = null;
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList69 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest64.FuzzTest_set(intList65, intList69, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList80 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest63.FuzzTest_set(intList65, intList80, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzzTest45.FuzzTest_set(intList62, intList80, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) 1);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { (-1) };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList92 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList80, intList92, 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList3 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest2.FuzzTest_set(intList3, intList7, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest1.FuzzTest_set(intList3, intList18, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList26 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList28 = null;
        fuzzTest1.FuzzTest_set(intList26, intList28, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) (-1));
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest0.FuzzTest_set(intList26, intList33, (int) (byte) 1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList38 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest0.FuzzTest_set(intList38, intList39, 1, (java.lang.Integer) 1, (java.lang.Integer) 0);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList44 = null;
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList45 = null;
        fuzzTest0.FuzzTest_set(intList44, intList45, (int) (short) 10, (java.lang.Integer) 100, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList51 = null;
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList55 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest50.FuzzTest_set(intList51, intList55, 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 100, 1, 100, (-1) };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList67 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList69 = null;
        fuzzTest50.FuzzTest_set(intList67, intList69, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList79 = new buggyasrts.mut_004.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        buggyasrts.mut_004.ArrayList<java.lang.Integer> intList81 = null;
        fuzzTest74.FuzzTest_set(intList79, intList81, (int) (short) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList67, intList79, 10, (java.lang.Integer) 100, (java.lang.Integer) 100);
    }
}

