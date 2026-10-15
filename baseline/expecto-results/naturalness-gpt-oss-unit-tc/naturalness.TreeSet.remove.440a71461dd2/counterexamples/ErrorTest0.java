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
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet6 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_remove(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet18 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest12.FuzzTest_remove(intSet18, intSet20, (java.lang.Integer) (-1), false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet24 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet18, intSet24, (java.lang.Integer) 1, false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet6 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_remove(intSet6, intSet8, (java.lang.Integer) (-1), false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet13 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet12, intSet13, (java.lang.Integer) 10, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet6 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_remove(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet21 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest15.FuzzTest_remove(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet35 = null;
        fuzzTest27.FuzzTest_remove(intSet33, intSet35, (java.lang.Integer) (-1), false);
        fuzzTest14.FuzzTest_remove(intSet21, intSet35, (java.lang.Integer) 0, true);
        fuzzTest12.FuzzTest_remove(intSet13, intSet35, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet55 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet57 = null;
        fuzzTest49.FuzzTest_remove(intSet55, intSet57, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet67 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet69 = null;
        fuzzTest61.FuzzTest_remove(intSet67, intSet69, (java.lang.Integer) (-1), false);
        fuzzTest48.FuzzTest_remove(intSet55, intSet69, (java.lang.Integer) 0, true);
        fuzzTest46.FuzzTest_remove(intSet47, intSet69, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_remove(intSet69, intSet79, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet13, intSet79, (java.lang.Integer) 1, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet7 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_remove(intSet7, intSet9, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet19 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_remove(intSet19, intSet21, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_remove(intSet7, intSet21, (java.lang.Integer) 0, true);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet29 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet28, intSet29, (java.lang.Integer) 10, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet10 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet12 = null;
        fuzzTest4.FuzzTest_remove(intSet10, intSet12, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet22 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest16.FuzzTest_remove(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzzTest3.FuzzTest_remove(intSet10, intSet24, (java.lang.Integer) 0, true);
        fuzzTest1.FuzzTest_remove(intSet2, intSet24, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet24, intSet34, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet44 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet46 = null;
        fuzzTest38.FuzzTest_remove(intSet44, intSet46, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet60 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet62 = null;
        fuzzTest54.FuzzTest_remove(intSet60, intSet62, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet72 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet74 = null;
        fuzzTest66.FuzzTest_remove(intSet72, intSet74, (java.lang.Integer) (-1), false);
        fuzzTest53.FuzzTest_remove(intSet60, intSet74, (java.lang.Integer) 0, true);
        fuzzTest51.FuzzTest_remove(intSet52, intSet74, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_remove(intSet74, intSet84, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet44, intSet84, (java.lang.Integer) 0, false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet10 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet12 = null;
        fuzzTest4.FuzzTest_remove(intSet10, intSet12, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet22 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest16.FuzzTest_remove(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzzTest3.FuzzTest_remove(intSet10, intSet24, (java.lang.Integer) 0, true);
        fuzzTest1.FuzzTest_remove(intSet2, intSet24, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet24, intSet34, (java.lang.Integer) 100, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet45 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet47 = null;
        fuzzTest39.FuzzTest_remove(intSet45, intSet47, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet58 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet60 = null;
        fuzzTest52.FuzzTest_remove(intSet58, intSet60, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet70 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest64.FuzzTest_remove(intSet70, intSet72, (java.lang.Integer) (-1), false);
        fuzzTest51.FuzzTest_remove(intSet58, intSet72, (java.lang.Integer) 0, true);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_remove(intSet72, intSet79, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet38, intSet79, (java.lang.Integer) 0, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet7 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_remove(intSet7, intSet9, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet19 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_remove(intSet19, intSet21, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_remove(intSet7, intSet21, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet35 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest29.FuzzTest_remove(intSet35, intSet37, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet47 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest41.FuzzTest_remove(intSet47, intSet49, (java.lang.Integer) (-1), false);
        fuzzTest28.FuzzTest_remove(intSet35, intSet49, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet65 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet67 = null;
        fuzzTest59.FuzzTest_remove(intSet65, intSet67, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet77 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet79 = null;
        fuzzTest71.FuzzTest_remove(intSet77, intSet79, (java.lang.Integer) (-1), false);
        fuzzTest58.FuzzTest_remove(intSet65, intSet79, (java.lang.Integer) 0, true);
        fuzzTest56.FuzzTest_remove(intSet57, intSet79, (java.lang.Integer) 0, false);
        fuzzTest0.FuzzTest_remove(intSet35, intSet57, (java.lang.Integer) (-1), true);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet92 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet93 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet92, intSet93, (java.lang.Integer) 0, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet6 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_remove(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet22 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest16.FuzzTest_remove(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest28.FuzzTest_remove(intSet34, intSet36, (java.lang.Integer) (-1), false);
        fuzzTest15.FuzzTest_remove(intSet22, intSet36, (java.lang.Integer) 0, true);
        fuzzTest13.FuzzTest_remove(intSet14, intSet36, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(intSet36, intSet46, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet62 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest56.FuzzTest_remove(intSet62, intSet64, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet74 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet76 = null;
        fuzzTest68.FuzzTest_remove(intSet74, intSet76, (java.lang.Integer) (-1), false);
        fuzzTest55.FuzzTest_remove(intSet62, intSet76, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet85 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        fuzzTest54.FuzzTest_remove(intSet62, intSet85, (java.lang.Integer) 0, false);
        fuzzTest12.FuzzTest_remove(intSet52, intSet85, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet93 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet52, intSet93, (java.lang.Integer) 0, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, (-1), (-1), 10 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet6 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet16 = null;
        fuzzTest8.FuzzTest_remove(intSet14, intSet16, (java.lang.Integer) (-1), false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet31 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest25.FuzzTest_remove(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet43 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet45 = null;
        fuzzTest37.FuzzTest_remove(intSet43, intSet45, (java.lang.Integer) (-1), false);
        fuzzTest24.FuzzTest_remove(intSet31, intSet45, (java.lang.Integer) 0, true);
        fuzzTest22.FuzzTest_remove(intSet23, intSet45, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_remove(intSet45, intSet55, (java.lang.Integer) 100, false);
        fuzzTest8.FuzzTest_remove(intSet20, intSet45, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0, 10, 100, 10, 10, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet69 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet77 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet79 = null;
        fuzzTest71.FuzzTest_remove(intSet77, intSet79, (java.lang.Integer) (-1), false);
        fuzzTest8.FuzzTest_remove(intSet69, intSet79, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet6, intSet69, (java.lang.Integer) 0, false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet6 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_remove(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet19 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_remove(intSet19, intSet21, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet31 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest25.FuzzTest_remove(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzzTest12.FuzzTest_remove(intSet19, intSet33, (java.lang.Integer) 0, true);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet33, intSet40, (java.lang.Integer) 1, true);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet45 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet44, intSet45, (java.lang.Integer) 1, false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet7 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_remove(intSet7, intSet9, (java.lang.Integer) (-1), false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet24 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet26 = null;
        fuzzTest18.FuzzTest_remove(intSet24, intSet26, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet36 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet38 = null;
        fuzzTest30.FuzzTest_remove(intSet36, intSet38, (java.lang.Integer) (-1), false);
        fuzzTest17.FuzzTest_remove(intSet24, intSet38, (java.lang.Integer) 0, true);
        fuzzTest15.FuzzTest_remove(intSet16, intSet38, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_remove(intSet38, intSet48, (java.lang.Integer) 100, false);
        fuzzTest1.FuzzTest_remove(intSet13, intSet38, (java.lang.Integer) 100, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest0.FuzzTest_remove(intSet13, intSet55, (java.lang.Integer) 100, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet60 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet59, intSet60, (java.lang.Integer) 100, false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet7 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_remove(intSet7, intSet9, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet19 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_remove(intSet19, intSet21, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_remove(intSet7, intSet21, (java.lang.Integer) 0, true);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet37 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet39 = null;
        fuzzTest31.FuzzTest_remove(intSet37, intSet39, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet49 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet51 = null;
        fuzzTest43.FuzzTest_remove(intSet49, intSet51, (java.lang.Integer) (-1), false);
        fuzzTest30.FuzzTest_remove(intSet37, intSet51, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet60 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest29.FuzzTest_remove(intSet37, intSet60, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet28, intSet37, (java.lang.Integer) 0, false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet6 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_remove(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet18 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest12.FuzzTest_remove(intSet18, intSet20, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet30 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest24.FuzzTest_remove(intSet30, intSet32, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 10, 10, 0 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet41 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzzTest12.FuzzTest_remove(intSet32, intSet41, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet47 = null;
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest46.FuzzTest_remove(intSet47, intSet52, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet66 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet68 = null;
        fuzzTest60.FuzzTest_remove(intSet66, intSet68, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet78 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet80 = null;
        fuzzTest72.FuzzTest_remove(intSet78, intSet80, (java.lang.Integer) (-1), false);
        fuzzTest59.FuzzTest_remove(intSet66, intSet80, (java.lang.Integer) 0, true);
        fuzzTest57.FuzzTest_remove(intSet58, intSet80, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet90 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_remove(intSet58, intSet90, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet41, intSet58, (java.lang.Integer) 0, false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet6 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_remove(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet19 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_remove(intSet19, intSet21, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet31 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest25.FuzzTest_remove(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzzTest12.FuzzTest_remove(intSet19, intSet33, (java.lang.Integer) 0, true);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet33, intSet40, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest46.FuzzTest_remove(intSet52, intSet54, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet64 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet66 = null;
        fuzzTest58.FuzzTest_remove(intSet64, intSet66, (java.lang.Integer) (-1), false);
        fuzzTest45.FuzzTest_remove(intSet52, intSet66, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet75 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzzTest44.FuzzTest_remove(intSet52, intSet75, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet80 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet75, intSet80, (java.lang.Integer) 0, false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet7 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_remove(intSet7, intSet9, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet19 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_remove(intSet19, intSet21, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_remove(intSet7, intSet21, (java.lang.Integer) 0, true);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet30 = null;
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet35 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        fuzzTest29.FuzzTest_remove(intSet30, intSet35, (java.lang.Integer) (-1), true);
        fuzzTest0.FuzzTest_remove(intSet28, intSet30, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet44 = null;
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet49 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzzTest43.FuzzTest_remove(intSet44, intSet49, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet65 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet67 = null;
        fuzzTest59.FuzzTest_remove(intSet65, intSet67, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet77 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet79 = null;
        fuzzTest71.FuzzTest_remove(intSet77, intSet79, (java.lang.Integer) (-1), false);
        fuzzTest58.FuzzTest_remove(intSet65, intSet79, (java.lang.Integer) 0, true);
        fuzzTest56.FuzzTest_remove(intSet57, intSet79, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_remove(intSet79, intSet89, (java.lang.Integer) 100, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet93 = null;
        fuzzTest54.FuzzTest_remove(intSet89, intSet93, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet49, intSet89, (java.lang.Integer) 10, false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet11 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest5.FuzzTest_remove(intSet11, intSet13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet23 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest17.FuzzTest_remove(intSet23, intSet25, (java.lang.Integer) (-1), false);
        fuzzTest4.FuzzTest_remove(intSet11, intSet25, (java.lang.Integer) 0, true);
        fuzzTest2.FuzzTest_remove(intSet3, intSet25, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(intSet25, intSet35, (java.lang.Integer) 100, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet39 = null;
        fuzzTest0.FuzzTest_remove(intSet35, intSet39, (java.lang.Integer) 1, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest46.FuzzTest_remove(intSet52, intSet54, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet64 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet66 = null;
        fuzzTest58.FuzzTest_remove(intSet64, intSet66, (java.lang.Integer) (-1), false);
        fuzzTest45.FuzzTest_remove(intSet52, intSet66, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet75 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzzTest44.FuzzTest_remove(intSet52, intSet75, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet43, intSet52, (java.lang.Integer) 0, false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet11 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest5.FuzzTest_remove(intSet11, intSet13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet23 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest17.FuzzTest_remove(intSet23, intSet25, (java.lang.Integer) (-1), false);
        fuzzTest4.FuzzTest_remove(intSet11, intSet25, (java.lang.Integer) 0, true);
        fuzzTest2.FuzzTest_remove(intSet3, intSet25, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(intSet25, intSet35, (java.lang.Integer) 100, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet39 = null;
        fuzzTest0.FuzzTest_remove(intSet35, intSet39, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest46.FuzzTest_remove(intSet52, intSet54, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet64 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet66 = null;
        fuzzTest58.FuzzTest_remove(intSet64, intSet66, (java.lang.Integer) (-1), false);
        fuzzTest45.FuzzTest_remove(intSet52, intSet66, (java.lang.Integer) 0, true);
        fuzzTest43.FuzzTest_remove(intSet44, intSet66, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 2, (-1), 1, (-1), 0 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet83 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet44, intSet83, (java.lang.Integer) 0, false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet6 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_remove(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet18 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest12.FuzzTest_remove(intSet18, intSet20, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 2, 10, 10, 0 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet29 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        fuzzTest0.FuzzTest_remove(intSet20, intSet29, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet40 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet42 = null;
        fuzzTest34.FuzzTest_remove(intSet40, intSet42, (java.lang.Integer) (-1), false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet42, intSet46, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet51 = null;
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        fuzzTest50.FuzzTest_remove(intSet51, intSet56, (java.lang.Integer) (-1), true);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet68 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet70 = null;
        fuzzTest62.FuzzTest_remove(intSet68, intSet70, (java.lang.Integer) (-1), false);
        fuzzTest50.FuzzTest_remove(intSet61, intSet68, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet83 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet85 = null;
        fuzzTest77.FuzzTest_remove(intSet83, intSet85, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet61, intSet83, (java.lang.Integer) 0, false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet6 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_remove(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet13 = null;
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet18 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        fuzzTest12.FuzzTest_remove(intSet13, intSet18, (java.lang.Integer) (-1), true);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet30 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest24.FuzzTest_remove(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzzTest12.FuzzTest_remove(intSet23, intSet30, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet47 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest41.FuzzTest_remove(intSet47, intSet49, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet59 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest53.FuzzTest_remove(intSet59, intSet61, (java.lang.Integer) (-1), false);
        fuzzTest40.FuzzTest_remove(intSet47, intSet61, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet74 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet76 = null;
        fuzzTest68.FuzzTest_remove(intSet74, intSet76, (java.lang.Integer) (-1), false);
        fuzzTest39.FuzzTest_remove(intSet61, intSet74, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet30, intSet74, (java.lang.Integer) 1, false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet9 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet11 = null;
        fuzzTest3.FuzzTest_remove(intSet9, intSet11, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet21 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest15.FuzzTest_remove(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest2.FuzzTest_remove(intSet9, intSet23, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_remove(intSet1, intSet23, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet35 = null;
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet40 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest34.FuzzTest_remove(intSet35, intSet40, (java.lang.Integer) (-1), true);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest46.FuzzTest_remove(intSet52, intSet54, (java.lang.Integer) (-1), false);
        fuzzTest34.FuzzTest_remove(intSet45, intSet52, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet33, intSet52, (java.lang.Integer) 0, false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet7 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_remove(intSet7, intSet9, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet19 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_remove(intSet19, intSet21, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_remove(intSet7, intSet21, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet29 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest28.FuzzTest_remove(intSet29, intSet34, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet45 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet47 = null;
        fuzzTest39.FuzzTest_remove(intSet45, intSet47, (java.lang.Integer) (-1), false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet62 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest56.FuzzTest_remove(intSet62, intSet64, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet74 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet76 = null;
        fuzzTest68.FuzzTest_remove(intSet74, intSet76, (java.lang.Integer) (-1), false);
        fuzzTest55.FuzzTest_remove(intSet62, intSet76, (java.lang.Integer) 0, true);
        fuzzTest53.FuzzTest_remove(intSet54, intSet76, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(intSet76, intSet86, (java.lang.Integer) 100, false);
        fuzzTest39.FuzzTest_remove(intSet51, intSet76, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet34, intSet51, (java.lang.Integer) 100, false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest2.FuzzTest_remove(intSet8, intSet10, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet20 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest14.FuzzTest_remove(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzzTest1.FuzzTest_remove(intSet8, intSet22, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet35 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest29.FuzzTest_remove(intSet35, intSet37, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_remove(intSet22, intSet35, (java.lang.Integer) 10, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet44 = null;
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet45 = null;
        fuzzTest0.FuzzTest_remove(intSet44, intSet45, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet57 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest51.FuzzTest_remove(intSet57, intSet59, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet69 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet71 = null;
        fuzzTest63.FuzzTest_remove(intSet69, intSet71, (java.lang.Integer) (-1), false);
        fuzzTest50.FuzzTest_remove(intSet57, intSet71, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet80 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        fuzzTest49.FuzzTest_remove(intSet57, intSet80, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet85 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet57, intSet85, (java.lang.Integer) 10, false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet6 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_remove(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet18 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest12.FuzzTest_remove(intSet18, intSet20, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 2, 10, 10, 0 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet29 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        fuzzTest0.FuzzTest_remove(intSet20, intSet29, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet40 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet42 = null;
        fuzzTest34.FuzzTest_remove(intSet40, intSet42, (java.lang.Integer) (-1), false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet42, intSet46, (java.lang.Integer) (-1), false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet62 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest56.FuzzTest_remove(intSet62, intSet64, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet74 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet76 = null;
        fuzzTest68.FuzzTest_remove(intSet74, intSet76, (java.lang.Integer) (-1), false);
        fuzzTest55.FuzzTest_remove(intSet62, intSet76, (java.lang.Integer) 0, true);
        fuzzTest53.FuzzTest_remove(intSet54, intSet76, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(intSet76, intSet86, (java.lang.Integer) 100, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet90 = null;
        fuzzTest51.FuzzTest_remove(intSet86, intSet90, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet50, intSet86, (java.lang.Integer) 100, false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet6 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_remove(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet18 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest12.FuzzTest_remove(intSet18, intSet20, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 2, 10, 10, 0 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet29 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        fuzzTest0.FuzzTest_remove(intSet20, intSet29, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet40 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet42 = null;
        fuzzTest34.FuzzTest_remove(intSet40, intSet42, (java.lang.Integer) (-1), false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet42, intSet46, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet52 = null;
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet57 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest51.FuzzTest_remove(intSet52, intSet57, (java.lang.Integer) (-1), true);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet69 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet71 = null;
        fuzzTest63.FuzzTest_remove(intSet69, intSet71, (java.lang.Integer) (-1), false);
        fuzzTest51.FuzzTest_remove(intSet62, intSet69, (java.lang.Integer) 100, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet78 = null;
        fuzzTest50.FuzzTest_remove(intSet62, intSet78, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-1), 0, 1, 10, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet88 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet62, intSet88, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet3 = null;
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 2, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest2.FuzzTest_remove(intSet3, intSet8, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet22 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest16.FuzzTest_remove(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest28.FuzzTest_remove(intSet34, intSet36, (java.lang.Integer) (-1), false);
        fuzzTest15.FuzzTest_remove(intSet22, intSet36, (java.lang.Integer) 0, true);
        fuzzTest13.FuzzTest_remove(intSet14, intSet36, (java.lang.Integer) 0, false);
        fuzzTest1.FuzzTest_remove(intSet8, intSet36, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet50 = null;
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet55 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        fuzzTest49.FuzzTest_remove(intSet50, intSet55, (java.lang.Integer) (-1), true);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet67 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet69 = null;
        fuzzTest61.FuzzTest_remove(intSet67, intSet69, (java.lang.Integer) (-1), false);
        fuzzTest49.FuzzTest_remove(intSet60, intSet67, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet8, intSet67, (java.lang.Integer) 1, false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet9 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet11 = null;
        fuzzTest3.FuzzTest_remove(intSet9, intSet11, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet21 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest15.FuzzTest_remove(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest2.FuzzTest_remove(intSet9, intSet23, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_remove(intSet1, intSet23, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet34 = null;
        fuzzTest0.FuzzTest_remove(intSet33, intSet34, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet38 = null;
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet39 = null;
        fuzzTest0.FuzzTest_remove(intSet38, intSet39, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet44 = null;
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet49 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzzTest43.FuzzTest_remove(intSet44, intSet49, (java.lang.Integer) (-1), true);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet61 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet63 = null;
        fuzzTest55.FuzzTest_remove(intSet61, intSet63, (java.lang.Integer) (-1), false);
        fuzzTest43.FuzzTest_remove(intSet54, intSet61, (java.lang.Integer) 100, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet70 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet61, intSet70, (java.lang.Integer) 0, false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet2 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 2, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet7 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest1.FuzzTest_remove(intSet2, intSet7, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet21 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest15.FuzzTest_remove(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet35 = null;
        fuzzTest27.FuzzTest_remove(intSet33, intSet35, (java.lang.Integer) (-1), false);
        fuzzTest14.FuzzTest_remove(intSet21, intSet35, (java.lang.Integer) 0, true);
        fuzzTest12.FuzzTest_remove(intSet13, intSet35, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(intSet13, intSet45, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet58 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet60 = null;
        fuzzTest52.FuzzTest_remove(intSet58, intSet60, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet70 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest64.FuzzTest_remove(intSet70, intSet72, (java.lang.Integer) (-1), false);
        fuzzTest51.FuzzTest_remove(intSet58, intSet72, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet81 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        fuzzTest50.FuzzTest_remove(intSet58, intSet81, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet86 = null;
        fuzzTest49.FuzzTest_remove(intSet58, intSet86, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet90 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet91 = null;
        fuzzTest49.FuzzTest_remove(intSet90, intSet91, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet45, intSet90, (java.lang.Integer) 0, false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet9 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet11 = null;
        fuzzTest3.FuzzTest_remove(intSet9, intSet11, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet21 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest15.FuzzTest_remove(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest2.FuzzTest_remove(intSet9, intSet23, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_remove(intSet1, intSet23, (java.lang.Integer) 0, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = null;
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet34 = null;
        fuzzTest0.FuzzTest_remove(intSet33, intSet34, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet39 = null;
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet44 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzzTest38.FuzzTest_remove(intSet39, intSet44, (java.lang.Integer) (-1), true);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet58 = null;
        fuzzTest50.FuzzTest_remove(intSet56, intSet58, (java.lang.Integer) (-1), false);
        fuzzTest38.FuzzTest_remove(intSet49, intSet56, (java.lang.Integer) 100, false);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet65 = null;
        fuzzTest0.FuzzTest_remove(intSet49, intSet65, (java.lang.Integer) 100, true);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet69 = null;
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet70 = null;
        fuzzTest0.FuzzTest_remove(intSet69, intSet70, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet75 = null;
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 2, 1 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet80 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        fuzzTest74.FuzzTest_remove(intSet75, intSet80, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 0, 2, 0, 2, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet91 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet91, intArray90);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet80, intSet91, (java.lang.Integer) 2, false);
    }
}

