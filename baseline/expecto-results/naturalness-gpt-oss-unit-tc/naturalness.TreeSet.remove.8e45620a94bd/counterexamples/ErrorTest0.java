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
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet28 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest20.FuzzTest_remove(intSet28, intSet34, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet19, intSet34, (java.lang.Integer) 10, true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet18 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet24 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest10.FuzzTest_remove(intSet18, intSet24, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet8, intSet18, (java.lang.Integer) 10, true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet21 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet23 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet21, intSet23, (java.lang.Integer) 0, true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_remove(intSet27, intSet33, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet46 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest38.FuzzTest_remove(intSet46, intSet52, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intSet33, intSet46, (java.lang.Integer) 0, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet61 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet60, intSet61, (java.lang.Integer) 1, true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_remove(intSet27, intSet33, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet46 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest38.FuzzTest_remove(intSet46, intSet52, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intSet33, intSet46, (java.lang.Integer) 0, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet69 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet75 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzzTest61.FuzzTest_remove(intSet69, intSet75, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet60, intSet75, (java.lang.Integer) 10, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_remove(intSet27, intSet33, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet46 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest38.FuzzTest_remove(intSet46, intSet52, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet33, intSet52, (java.lang.Integer) 10, true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest6.FuzzTest_remove(intSet14, intSet20, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet39 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest25.FuzzTest_remove(intSet33, intSet39, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet58 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        fuzzTest44.FuzzTest_remove(intSet52, intSet58, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_remove(intSet52, intSet63, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet20, intSet63, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_remove(intSet27, intSet33, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet27, intSet38, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet42 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 2, 100, 10, (-1), 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet50 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet42, intSet50, (java.lang.Integer) 10, true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_remove(intSet27, intSet33, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet27, intSet38, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet42 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet42, intSet43, (java.lang.Integer) 1, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet62 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest48.FuzzTest_remove(intSet56, intSet62, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet47, intSet56, (java.lang.Integer) 2, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_remove(intSet27, intSet33, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet27, intSet38, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet51 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet57 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest43.FuzzTest_remove(intSet51, intSet57, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet70 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet76 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        fuzzTest62.FuzzTest_remove(intSet70, intSet76, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(intSet70, intSet81, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet42, intSet81, (java.lang.Integer) 100, false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, (-1), 2, (-1), 100, 1 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet37 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet43 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        fuzzTest29.FuzzTest_remove(intSet37, intSet43, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet62 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest48.FuzzTest_remove(intSet56, intSet62, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet75 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet81 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        fuzzTest67.FuzzTest_remove(intSet75, intSet81, (java.lang.Integer) 2, false);
        fuzzTest29.FuzzTest_remove(intSet62, intSet75, (java.lang.Integer) 0, false);
        fuzzTest19.FuzzTest_remove(intSet27, intSet75, (java.lang.Integer) 2, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet27, intSet92, (java.lang.Integer) 0, true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet10 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet16 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzzTest2.FuzzTest_remove(intSet10, intSet16, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intSet1, intSet16, (java.lang.Integer) 1, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet39 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest25.FuzzTest_remove(intSet33, intSet39, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10, 1, 2, (-1), 10 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet50 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet60 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet66 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        fuzzTest52.FuzzTest_remove(intSet60, intSet66, (java.lang.Integer) 2, false);
        fuzzTest25.FuzzTest_remove(intSet50, intSet60, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet24, intSet50, (java.lang.Integer) 1, false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10, (-1), 2, (-1), 100, 1 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet18 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet24 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest10.FuzzTest_remove(intSet18, intSet24, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet37 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet43 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        fuzzTest29.FuzzTest_remove(intSet37, intSet43, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet62 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest48.FuzzTest_remove(intSet56, intSet62, (java.lang.Integer) 2, false);
        fuzzTest10.FuzzTest_remove(intSet43, intSet56, (java.lang.Integer) 0, false);
        fuzzTest0.FuzzTest_remove(intSet8, intSet56, (java.lang.Integer) 2, true);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1, (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet76 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet86 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet92 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet92, intArray91);
        fuzzTest78.FuzzTest_remove(intSet86, intSet92, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet76, intSet92, (java.lang.Integer) 2, true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_remove(intSet27, intSet33, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet27, intSet38, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet50 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        fuzzTest42.FuzzTest_remove(intSet50, intSet56, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet69 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet75 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzzTest61.FuzzTest_remove(intSet69, intSet75, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet56, intSet69, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet9 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet15 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_remove(intSet9, intSet15, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet28 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest20.FuzzTest_remove(intSet28, intSet34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intSet15, intSet34, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, (-1), (-1), 10, (-1), 10 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet49 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet59 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet65 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        fuzzTest51.FuzzTest_remove(intSet59, intSet65, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet49, intSet65, (java.lang.Integer) 100, true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 100, 0, (-1), (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet12 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest0.FuzzTest_remove(intSet12, intSet14, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet26 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet32 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest18.FuzzTest_remove(intSet26, intSet32, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet45 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet51 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzzTest37.FuzzTest_remove(intSet45, intSet51, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet64 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet70 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        fuzzTest56.FuzzTest_remove(intSet64, intSet70, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet83 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet89 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        fuzzTest75.FuzzTest_remove(intSet83, intSet89, (java.lang.Integer) 2, false);
        fuzzTest37.FuzzTest_remove(intSet70, intSet83, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet32, intSet83, (java.lang.Integer) 0, true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet9 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet15 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_remove(intSet9, intSet15, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = null;
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet29 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet35 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        fuzzTest21.FuzzTest_remove(intSet29, intSet35, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10, 1, 2, (-1), 10 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet46 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet62 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest48.FuzzTest_remove(intSet56, intSet62, (java.lang.Integer) 2, false);
        fuzzTest21.FuzzTest_remove(intSet46, intSet56, (java.lang.Integer) 10, false);
        fuzzTest1.FuzzTest_remove(intSet20, intSet46, (java.lang.Integer) 0, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet20, intSet73, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet79 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet81 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet79, intSet81, (java.lang.Integer) 10, true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet9 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet15 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_remove(intSet9, intSet15, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet28 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest20.FuzzTest_remove(intSet28, intSet34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intSet15, intSet34, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, (-1), 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet48 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet58 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet64 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        fuzzTest50.FuzzTest_remove(intSet58, intSet64, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet77 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet83 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        fuzzTest69.FuzzTest_remove(intSet77, intSet83, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_remove(intSet77, intSet88, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet48, intSet88, (java.lang.Integer) 0, true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 1, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet6 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet7 = null;
        fuzzTest0.FuzzTest_remove(intSet6, intSet7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet12 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest11.FuzzTest_remove(intSet12, intSet13, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 100, 0, (-1), (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet23 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest11.FuzzTest_remove(intSet23, intSet25, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet39 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet45 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest31.FuzzTest_remove(intSet39, intSet45, (java.lang.Integer) 2, false);
        fuzzTest29.FuzzTest_remove(intSet30, intSet45, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_remove(intSet25, intSet45, (java.lang.Integer) 0, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet57 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet56, intSet57, (java.lang.Integer) 100, true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet28 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest20.FuzzTest_remove(intSet28, intSet34, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet47 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet53 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        fuzzTest39.FuzzTest_remove(intSet47, intSet53, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_remove(intSet47, intSet58, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet19, intSet47, (java.lang.Integer) 100, true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet11 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet17 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        fuzzTest3.FuzzTest_remove(intSet11, intSet17, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet30 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet36 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        fuzzTest22.FuzzTest_remove(intSet30, intSet36, (java.lang.Integer) 2, false);
        fuzzTest2.FuzzTest_remove(intSet17, intSet36, (java.lang.Integer) 100, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet45 = null;
        fuzzTest2.FuzzTest_remove(intSet44, intSet45, (java.lang.Integer) (-1), true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet58 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet64 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        fuzzTest50.FuzzTest_remove(intSet58, intSet64, (java.lang.Integer) 2, false);
        fuzzTest2.FuzzTest_remove(intSet49, intSet58, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet1, intSet58, (java.lang.Integer) 0, true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet11 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet17 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        fuzzTest3.FuzzTest_remove(intSet11, intSet17, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_remove(intSet2, intSet17, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet39 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest25.FuzzTest_remove(intSet33, intSet39, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet58 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        fuzzTest44.FuzzTest_remove(intSet52, intSet58, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_remove(intSet52, intSet63, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 100, (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet71 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet73 = null;
        fuzzTest25.FuzzTest_remove(intSet71, intSet73, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_remove(intSet2, intSet73, (java.lang.Integer) 100, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet81 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet80, intSet81, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest6.FuzzTest_remove(intSet14, intSet20, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet39 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest25.FuzzTest_remove(intSet33, intSet39, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(intSet33, intSet44, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet57 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet63 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzzTest49.FuzzTest_remove(intSet57, intSet63, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet76 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet82 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        fuzzTest68.FuzzTest_remove(intSet76, intSet82, (java.lang.Integer) 2, false);
        fuzzTest48.FuzzTest_remove(intSet63, intSet82, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet33, intSet63, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10, 1, 2, (-1), 10 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet25 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet35 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet41 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzzTest27.FuzzTest_remove(intSet35, intSet41, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intSet25, intSet35, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet57 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet63 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzzTest49.FuzzTest_remove(intSet57, intSet63, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet68 = null;
        fuzzTest0.FuzzTest_remove(intSet63, intSet68, (java.lang.Integer) 0, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet72 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet73 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet72, intSet73, (java.lang.Integer) 0, false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet11 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet17 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        fuzzTest3.FuzzTest_remove(intSet11, intSet17, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_remove(intSet2, intSet17, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet40 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest26.FuzzTest_remove(intSet34, intSet40, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet53 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet59 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest45.FuzzTest_remove(intSet53, intSet59, (java.lang.Integer) 2, false);
        fuzzTest25.FuzzTest_remove(intSet40, intSet59, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet69 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzzTest1.FuzzTest_remove(intSet59, intSet69, (java.lang.Integer) 10, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet74 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet69, intSet74, (java.lang.Integer) 100, true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10, 1, 2, (-1), 10 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet25 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet35 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet41 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzzTest27.FuzzTest_remove(intSet35, intSet41, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intSet25, intSet35, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet53 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet55 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet53, intSet55, (java.lang.Integer) 0, true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest6.FuzzTest_remove(intSet14, intSet20, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet39 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest25.FuzzTest_remove(intSet33, intSet39, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(intSet33, intSet44, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet57 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet63 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzzTest49.FuzzTest_remove(intSet57, intSet63, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet76 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet82 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        fuzzTest68.FuzzTest_remove(intSet76, intSet82, (java.lang.Integer) 2, false);
        fuzzTest48.FuzzTest_remove(intSet63, intSet82, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet44, intSet82, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet11 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet17 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        fuzzTest3.FuzzTest_remove(intSet11, intSet17, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_remove(intSet2, intSet17, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet39 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest25.FuzzTest_remove(intSet33, intSet39, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet58 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        fuzzTest44.FuzzTest_remove(intSet52, intSet58, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_remove(intSet39, intSet52, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet74 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet80 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        fuzzTest66.FuzzTest_remove(intSet74, intSet80, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet52, intSet80, (java.lang.Integer) 0, true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 100, 0, (-1), (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet12 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest0.FuzzTest_remove(intSet12, intSet14, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_remove(intSet27, intSet33, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10, 1, 2, (-1), 10 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet44 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet54 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet60 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest46.FuzzTest_remove(intSet54, intSet60, (java.lang.Integer) 2, false);
        fuzzTest19.FuzzTest_remove(intSet44, intSet54, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet18, intSet54, (java.lang.Integer) 1, false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet3 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet4 = null;
        fuzzTest2.FuzzTest_remove(intSet3, intSet4, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, 1, (-1), 10 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet13 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet16 = null;
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet25 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet31 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        fuzzTest17.FuzzTest_remove(intSet25, intSet31, (java.lang.Integer) 2, false);
        fuzzTest15.FuzzTest_remove(intSet16, intSet31, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet48 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet54 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzzTest40.FuzzTest_remove(intSet48, intSet54, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet67 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet73 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest59.FuzzTest_remove(intSet67, intSet73, (java.lang.Integer) 2, false);
        fuzzTest39.FuzzTest_remove(intSet54, intSet73, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet83 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        fuzzTest15.FuzzTest_remove(intSet73, intSet83, (java.lang.Integer) 10, false);
        fuzzTest2.FuzzTest_remove(intSet13, intSet83, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet1, intSet83, (java.lang.Integer) 2, false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet19 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest0.FuzzTest_remove(intSet19, intSet20, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet32 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet38 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzzTest24.FuzzTest_remove(intSet32, intSet38, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet51 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet57 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest43.FuzzTest_remove(intSet51, intSet57, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_remove(intSet51, intSet62, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet66 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_remove(intSet66, intSet67, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { (-1), 1, 10 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet75 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet67, intSet75, (java.lang.Integer) 1, true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet7 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest6.FuzzTest_remove(intSet7, intSet8, (java.lang.Integer) 1, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet12 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest6.FuzzTest_remove(intSet12, intSet13, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet26 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet32 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest18.FuzzTest_remove(intSet26, intSet32, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet45 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet51 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzzTest37.FuzzTest_remove(intSet45, intSet51, (java.lang.Integer) 2, false);
        fuzzTest17.FuzzTest_remove(intSet32, intSet51, (java.lang.Integer) 100, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(intSet32, intSet59, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet63 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet59, intSet63, (java.lang.Integer) 1, false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 10, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet16 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet22 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        fuzzTest8.FuzzTest_remove(intSet16, intSet22, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet35 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet41 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzzTest27.FuzzTest_remove(intSet35, intSet41, (java.lang.Integer) 2, false);
        fuzzTest7.FuzzTest_remove(intSet22, intSet41, (java.lang.Integer) 100, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet50 = null;
        fuzzTest7.FuzzTest_remove(intSet49, intSet50, (java.lang.Integer) (-1), true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet63 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet69 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzzTest55.FuzzTest_remove(intSet63, intSet69, (java.lang.Integer) 2, false);
        fuzzTest7.FuzzTest_remove(intSet54, intSet63, (java.lang.Integer) 100, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet77 = null;
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10, 0, 1, (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet83 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        fuzzTest7.FuzzTest_remove(intSet77, intSet83, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet6, intSet83, (java.lang.Integer) 0, false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 100, 0, (-1), (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet12 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest0.FuzzTest_remove(intSet12, intSet14, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest19.FuzzTest_remove(intSet20, intSet21, (java.lang.Integer) 1, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet25 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet26 = null;
        fuzzTest19.FuzzTest_remove(intSet25, intSet26, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet31 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest30.FuzzTest_remove(intSet31, intSet32, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 100, 0, (-1), (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet42 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet44 = null;
        fuzzTest30.FuzzTest_remove(intSet42, intSet44, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet62 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest48.FuzzTest_remove(intSet56, intSet62, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet75 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet81 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        fuzzTest67.FuzzTest_remove(intSet75, intSet81, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(intSet75, intSet86, (java.lang.Integer) 10, true);
        fuzzTest19.FuzzTest_remove(intSet44, intSet75, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet18, intSet75, (java.lang.Integer) 0, false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest6.FuzzTest_remove(intSet14, intSet20, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet39 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest25.FuzzTest_remove(intSet33, intSet39, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(intSet33, intSet44, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet49 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet50 = null;
        fuzzTest48.FuzzTest_remove(intSet49, intSet50, (java.lang.Integer) 0, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet65 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet71 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        fuzzTest57.FuzzTest_remove(intSet65, intSet71, (java.lang.Integer) 2, false);
        fuzzTest55.FuzzTest_remove(intSet56, intSet71, (java.lang.Integer) 1, false);
        fuzzTest48.FuzzTest_remove(intSet54, intSet71, (java.lang.Integer) 2, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet44, intSet71, (java.lang.Integer) 2, false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet19 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest0.FuzzTest_remove(intSet19, intSet20, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet32 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet38 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzzTest24.FuzzTest_remove(intSet32, intSet38, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet53 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet59 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest45.FuzzTest_remove(intSet53, intSet59, (java.lang.Integer) 2, false);
        fuzzTest43.FuzzTest_remove(intSet44, intSet59, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet75 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet81 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        fuzzTest67.FuzzTest_remove(intSet75, intSet81, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet86 = null;
        fuzzTest43.FuzzTest_remove(intSet75, intSet86, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet38, intSet75, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet15 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet21 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        fuzzTest7.FuzzTest_remove(intSet15, intSet21, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet40 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest26.FuzzTest_remove(intSet34, intSet40, (java.lang.Integer) 2, false);
        fuzzTest6.FuzzTest_remove(intSet21, intSet40, (java.lang.Integer) 100, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest6.FuzzTest_remove(intSet48, intSet49, (java.lang.Integer) (-1), true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet53 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet48, intSet53, (java.lang.Integer) 1, false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_remove(intSet27, intSet33, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet27, intSet38, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet42 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet42, intSet43, (java.lang.Integer) 1, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet48 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet47, intSet48, (java.lang.Integer) 1, true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet19 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest0.FuzzTest_remove(intSet19, intSet20, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet25 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet26 = null;
        fuzzTest24.FuzzTest_remove(intSet25, intSet26, (java.lang.Integer) 1, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet30 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest24.FuzzTest_remove(intSet30, intSet31, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet44 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet50 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest36.FuzzTest_remove(intSet44, intSet50, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet63 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet69 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzzTest55.FuzzTest_remove(intSet63, intSet69, (java.lang.Integer) 2, false);
        fuzzTest35.FuzzTest_remove(intSet50, intSet69, (java.lang.Integer) 100, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_remove(intSet50, intSet77, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100, 1 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet84 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet77, intSet84, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest19.FuzzTest_remove(intSet20, intSet21, (java.lang.Integer) 0, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet40 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest26.FuzzTest_remove(intSet34, intSet40, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet53 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet59 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest45.FuzzTest_remove(intSet53, intSet59, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(intSet53, intSet64, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet68 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(intSet68, intSet69, (java.lang.Integer) 1, true);
        fuzzTest19.FuzzTest_remove(intSet25, intSet69, (java.lang.Integer) 0, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet76 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet69, intSet76, (java.lang.Integer) 0, true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 1, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet6 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet7 = null;
        fuzzTest0.FuzzTest_remove(intSet6, intSet7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet12 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest11.FuzzTest_remove(intSet12, intSet13, (java.lang.Integer) 100, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet26 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet32 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest18.FuzzTest_remove(intSet26, intSet32, (java.lang.Integer) 2, false);
        fuzzTest11.FuzzTest_remove(intSet17, intSet32, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet48 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet54 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzzTest40.FuzzTest_remove(intSet48, intSet54, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10, 1, 2, (-1), 10 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet65 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet75 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet81 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        fuzzTest67.FuzzTest_remove(intSet75, intSet81, (java.lang.Integer) 2, false);
        fuzzTest40.FuzzTest_remove(intSet65, intSet75, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet32, intSet65, (java.lang.Integer) 0, true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_remove(intSet27, intSet33, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet27, intSet38, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 100, (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet46 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet48 = null;
        fuzzTest0.FuzzTest_remove(intSet46, intSet48, (java.lang.Integer) 1, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet62 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet68 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        fuzzTest54.FuzzTest_remove(intSet62, intSet68, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet81 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet87 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        fuzzTest73.FuzzTest_remove(intSet81, intSet87, (java.lang.Integer) 2, false);
        fuzzTest53.FuzzTest_remove(intSet68, intSet87, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet52, intSet68, (java.lang.Integer) 100, false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet11 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet12 = null;
        fuzzTest10.FuzzTest_remove(intSet11, intSet12, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet24 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet30 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        fuzzTest16.FuzzTest_remove(intSet24, intSet30, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10, 1, 2, (-1), 10 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet41 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet51 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet57 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest43.FuzzTest_remove(intSet51, intSet57, (java.lang.Integer) 2, false);
        fuzzTest16.FuzzTest_remove(intSet41, intSet51, (java.lang.Integer) 10, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_remove(intSet41, intSet65, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet8, intSet41, (java.lang.Integer) 0, true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 0, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet6 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet7 = null;
        fuzzTest0.FuzzTest_remove(intSet6, intSet7, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet26 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        fuzzTest12.FuzzTest_remove(intSet20, intSet26, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet40 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet46 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzzTest32.FuzzTest_remove(intSet40, intSet46, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10, 1, 2, (-1), 10 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet57 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet67 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet73 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest59.FuzzTest_remove(intSet67, intSet73, (java.lang.Integer) 2, false);
        fuzzTest32.FuzzTest_remove(intSet57, intSet67, (java.lang.Integer) 10, false);
        fuzzTest12.FuzzTest_remove(intSet31, intSet57, (java.lang.Integer) 0, false);
        fuzzTest0.FuzzTest_remove(intSet11, intSet31, (java.lang.Integer) (-1), false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet87 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 100, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet91 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet91, intArray90);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet87, intSet91, (java.lang.Integer) 1, true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet19 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest0.FuzzTest_remove(intSet19, intSet20, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet28 = null;
        fuzzTest26.FuzzTest_remove(intSet27, intSet28, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet41 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet47 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest33.FuzzTest_remove(intSet41, intSet47, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet60 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet66 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        fuzzTest52.FuzzTest_remove(intSet60, intSet66, (java.lang.Integer) 2, false);
        fuzzTest32.FuzzTest_remove(intSet47, intSet66, (java.lang.Integer) 100, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet75 = null;
        fuzzTest32.FuzzTest_remove(intSet74, intSet75, (java.lang.Integer) (-1), true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(intSet75, intSet79, (java.lang.Integer) 1, true);
        fuzzTest24.FuzzTest_remove(intSet25, intSet79, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { (-1), (-1), 10, 100, 2, 10 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet93 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet93, intArray92);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet79, intSet93, (java.lang.Integer) 0, true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet12 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet18 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        fuzzTest4.FuzzTest_remove(intSet12, intSet18, (java.lang.Integer) 2, false);
        fuzzTest2.FuzzTest_remove(intSet3, intSet18, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet40 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest26.FuzzTest_remove(intSet34, intSet40, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet53 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet59 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest45.FuzzTest_remove(intSet53, intSet59, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet72 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet78 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        fuzzTest64.FuzzTest_remove(intSet72, intSet78, (java.lang.Integer) 2, false);
        fuzzTest26.FuzzTest_remove(intSet59, intSet72, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet88 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        fuzzTest2.FuzzTest_remove(intSet59, intSet88, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet1, intSet88, (java.lang.Integer) 2, true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet7 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest6.FuzzTest_remove(intSet7, intSet8, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet26 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        fuzzTest12.FuzzTest_remove(intSet20, intSet26, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10, 1, 2, (-1), 10 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet37 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet47 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet53 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        fuzzTest39.FuzzTest_remove(intSet47, intSet53, (java.lang.Integer) 2, false);
        fuzzTest12.FuzzTest_remove(intSet37, intSet47, (java.lang.Integer) 10, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(intSet37, intSet61, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet67 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet61, intSet67, (java.lang.Integer) 0, true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_remove(intSet27, intSet33, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet27, intSet38, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet58 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        fuzzTest44.FuzzTest_remove(intSet52, intSet58, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet71 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet77 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        fuzzTest63.FuzzTest_remove(intSet71, intSet77, (java.lang.Integer) 2, false);
        fuzzTest43.FuzzTest_remove(intSet58, intSet77, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet42, intSet77, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet7 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest6.FuzzTest_remove(intSet7, intSet8, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet26 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        fuzzTest12.FuzzTest_remove(intSet20, intSet26, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet39 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet45 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest31.FuzzTest_remove(intSet39, intSet45, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(intSet39, intSet50, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 100, (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet58 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet60 = null;
        fuzzTest12.FuzzTest_remove(intSet58, intSet60, (java.lang.Integer) 1, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest6.FuzzTest_remove(intSet58, intSet64, (java.lang.Integer) 100, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet68 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet69 = null;
        fuzzTest6.FuzzTest_remove(intSet68, intSet69, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet74 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet75 = null;
        fuzzTest73.FuzzTest_remove(intSet74, intSet75, (java.lang.Integer) 0, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet79 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet80 = null;
        fuzzTest73.FuzzTest_remove(intSet79, intSet80, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet86 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_remove(intSet86, intSet88, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet68, intSet88, (java.lang.Integer) 10, true);
    }
}

