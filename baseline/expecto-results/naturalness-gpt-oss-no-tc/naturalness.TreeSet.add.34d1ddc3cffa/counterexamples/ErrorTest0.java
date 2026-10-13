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
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet14 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet13 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        naturalness.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest7.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet25 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        naturalness.TreeSet<java.lang.Integer> intSet27 = null;
        fuzzTest19.FuzzTest_add(intSet25, intSet27, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet37 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        naturalness.TreeSet<java.lang.Integer> intSet39 = null;
        fuzzTest31.FuzzTest_add(intSet37, intSet39, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(intSet37, intSet43, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet53 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        naturalness.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest47.FuzzTest_add(intSet53, intSet55, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet65 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        naturalness.TreeSet<java.lang.Integer> intSet67 = null;
        fuzzTest59.FuzzTest_add(intSet65, intSet67, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(intSet65, intSet71, (java.lang.Integer) 1, false);
        fuzzTest7.FuzzTest_add(intSet43, intSet71, (java.lang.Integer) (-1), true);
        fuzzTest5.FuzzTest_add(intSet6, intSet71, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet3, intSet6, (java.lang.Integer) 10, false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet8, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 0 };
        naturalness.TreeSet<java.lang.Integer> intSet14 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet22 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        naturalness.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest16.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet14, intSet22, (java.lang.Integer) 0, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet18 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        naturalness.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest12.FuzzTest_add(intSet18, intSet20, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet18, intSet24, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet34 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        naturalness.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest28.FuzzTest_add(intSet34, intSet36, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet36, intSet40, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet50 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        naturalness.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest44.FuzzTest_add(intSet50, intSet52, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet62 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        naturalness.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest56.FuzzTest_add(intSet62, intSet64, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(intSet62, intSet68, (java.lang.Integer) 1, false);
        naturalness.TreeSet<java.lang.Integer> intSet72 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet62, intSet72, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet7 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        naturalness.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_add(intSet7, intSet9, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet19 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        naturalness.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_add(intSet19, intSet21, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intSet19, intSet25, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet35 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        naturalness.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest29.FuzzTest_add(intSet35, intSet37, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet47 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        naturalness.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest41.FuzzTest_add(intSet47, intSet49, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(intSet47, intSet53, (java.lang.Integer) 1, false);
        naturalness.TreeSet<java.lang.Integer> intSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intSet53, intSet57, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet67 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        naturalness.TreeSet<java.lang.Integer> intSet69 = null;
        fuzzTest61.FuzzTest_add(intSet67, intSet69, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet79 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        naturalness.TreeSet<java.lang.Integer> intSet81 = null;
        fuzzTest73.FuzzTest_add(intSet79, intSet81, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_add(intSet79, intSet85, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet53, intSet79, (java.lang.Integer) 1, true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet7 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        naturalness.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_add(intSet7, intSet9, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet19 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        naturalness.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_add(intSet19, intSet21, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intSet19, intSet25, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet35 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        naturalness.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest29.FuzzTest_add(intSet35, intSet37, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intSet37, intSet41, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1 };
        naturalness.TreeSet<java.lang.Integer> intSet47 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        naturalness.TreeSet<java.lang.Integer> intSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intSet47, intSet49, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10, 1, 2, 2, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet59 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet49, intSet59, (java.lang.Integer) 10, true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet7 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        naturalness.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_add(intSet7, intSet9, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet19 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        naturalness.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_add(intSet19, intSet21, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intSet19, intSet25, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet35 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        naturalness.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest29.FuzzTest_add(intSet35, intSet37, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intSet37, intSet41, (java.lang.Integer) 0, true);
        naturalness.TreeSet<java.lang.Integer> intSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet41, intSet45, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet55 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        naturalness.TreeSet<java.lang.Integer> intSet57 = null;
        fuzzTest49.FuzzTest_add(intSet55, intSet57, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet67 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        naturalness.TreeSet<java.lang.Integer> intSet69 = null;
        fuzzTest61.FuzzTest_add(intSet67, intSet69, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(intSet67, intSet73, (java.lang.Integer) 1, false);
        naturalness.TreeSet<java.lang.Integer> intSet77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet67, intSet77, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet18 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        naturalness.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest12.FuzzTest_add(intSet18, intSet20, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(intSet24, intSet25, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet35 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        naturalness.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest29.FuzzTest_add(intSet35, intSet37, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet47 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        naturalness.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest41.FuzzTest_add(intSet47, intSet49, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(intSet47, intSet53, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet24, intSet47, (java.lang.Integer) 0, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet8, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet12, intSet13, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100 };
        naturalness.TreeSet<java.lang.Integer> intSet19 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet27 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        naturalness.TreeSet<java.lang.Integer> intSet29 = null;
        fuzzTest21.FuzzTest_add(intSet27, intSet29, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet39 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        naturalness.TreeSet<java.lang.Integer> intSet41 = null;
        fuzzTest33.FuzzTest_add(intSet39, intSet41, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_add(intSet39, intSet45, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet55 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        naturalness.TreeSet<java.lang.Integer> intSet57 = null;
        fuzzTest49.FuzzTest_add(intSet55, intSet57, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_add(intSet57, intSet61, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1 };
        naturalness.TreeSet<java.lang.Integer> intSet67 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        naturalness.TreeSet<java.lang.Integer> intSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_add(intSet67, intSet69, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intSet19, intSet67, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet82 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        naturalness.TreeSet<java.lang.Integer> intSet84 = null;
        fuzzTest76.FuzzTest_add(intSet82, intSet84, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_add(intSet88, intSet89, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 100 };
        naturalness.TreeSet<java.lang.Integer> intSet95 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet95, intArray94);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet89, intSet95, (java.lang.Integer) 100, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        naturalness.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest2.FuzzTest_add(intSet8, intSet10, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(intSet14, intSet15, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intSet1, intSet14, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet29 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        naturalness.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest23.FuzzTest_add(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet41 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        naturalness.TreeSet<java.lang.Integer> intSet43 = null;
        fuzzTest35.FuzzTest_add(intSet41, intSet43, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(intSet41, intSet47, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet57 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        naturalness.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest51.FuzzTest_add(intSet57, intSet59, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(intSet59, intSet63, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1 };
        naturalness.TreeSet<java.lang.Integer> intSet69 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        naturalness.TreeSet<java.lang.Integer> intSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(intSet69, intSet71, (java.lang.Integer) 0, true);
        naturalness.TreeSet<java.lang.Integer> intSet75 = null;
        fuzzTest22.FuzzTest_add(intSet69, intSet75, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100, 10, 100, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet84 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet69, intSet84, (java.lang.Integer) 10, true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        naturalness.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest2.FuzzTest_add(intSet8, intSet10, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(intSet14, intSet15, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intSet1, intSet14, (java.lang.Integer) 100, true);
        naturalness.TreeSet<java.lang.Integer> intSet22 = null;
        naturalness.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest0.FuzzTest_add(intSet22, intSet23, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet30 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        naturalness.TreeSet<java.lang.Integer> intSet32 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet30, intSet32, (java.lang.Integer) 2, false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet8, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet12, intSet13, (java.lang.Integer) 0, true);
        naturalness.TreeSet<java.lang.Integer> intSet17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet24 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        naturalness.TreeSet<java.lang.Integer> intSet26 = null;
        fuzzTest18.FuzzTest_add(intSet24, intSet26, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(intSet30, intSet31, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intSet17, intSet30, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 2, (-1), (-1), 10 };
        naturalness.TreeSet<java.lang.Integer> intSet44 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet54 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        naturalness.TreeSet<java.lang.Integer> intSet56 = null;
        fuzzTest48.FuzzTest_add(intSet54, intSet56, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(intSet60, intSet61, (java.lang.Integer) 0, true);
        fuzzTest46.FuzzTest_add(intSet47, intSet60, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet44, intSet60, (java.lang.Integer) 100, false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet10 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        naturalness.TreeSet<java.lang.Integer> intSet12 = null;
        fuzzTest4.FuzzTest_add(intSet10, intSet12, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet22 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        naturalness.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest16.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet34 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        naturalness.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest28.FuzzTest_add(intSet34, intSet36, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_add(intSet34, intSet40, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet50 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        naturalness.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest44.FuzzTest_add(intSet50, intSet52, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet62 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        naturalness.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest56.FuzzTest_add(intSet62, intSet64, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(intSet62, intSet68, (java.lang.Integer) 1, false);
        fuzzTest4.FuzzTest_add(intSet40, intSet68, (java.lang.Integer) (-1), true);
        fuzzTest2.FuzzTest_add(intSet3, intSet68, (java.lang.Integer) 100, false);
        fuzzTest0.FuzzTest_add(intSet1, intSet68, (java.lang.Integer) (-1), true);
        naturalness.TreeSet<java.lang.Integer> intSet81 = null;
        naturalness.TreeSet<java.lang.Integer> intSet82 = null;
        fuzzTest0.FuzzTest_add(intSet81, intSet82, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100 };
        naturalness.TreeSet<java.lang.Integer> intSet88 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        naturalness.TreeSet<java.lang.Integer> intSet90 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet88, intSet90, (java.lang.Integer) 1, false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet7 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        naturalness.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_add(intSet7, intSet9, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet19 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        naturalness.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_add(intSet19, intSet21, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intSet19, intSet25, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet35 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        naturalness.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest29.FuzzTest_add(intSet35, intSet37, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet41 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(intSet41, intSet42, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet19, intSet41, (java.lang.Integer) 10, false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        naturalness.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest2.FuzzTest_add(intSet8, intSet10, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(intSet14, intSet15, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intSet1, intSet14, (java.lang.Integer) 100, true);
        naturalness.TreeSet<java.lang.Integer> intSet22 = null;
        naturalness.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest0.FuzzTest_add(intSet22, intSet23, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10, 0, (-1), 2 };
        naturalness.TreeSet<java.lang.Integer> intSet32 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet42 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        naturalness.TreeSet<java.lang.Integer> intSet44 = null;
        fuzzTest36.FuzzTest_add(intSet42, intSet44, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_add(intSet48, intSet49, (java.lang.Integer) 0, true);
        fuzzTest34.FuzzTest_add(intSet35, intSet48, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet64 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        naturalness.TreeSet<java.lang.Integer> intSet66 = null;
        fuzzTest58.FuzzTest_add(intSet64, intSet66, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(intSet70, intSet71, (java.lang.Integer) 0, true);
        fuzzTest56.FuzzTest_add(intSet57, intSet70, (java.lang.Integer) 100, true);
        naturalness.TreeSet<java.lang.Integer> intSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(intSet57, intSet78, (java.lang.Integer) 2, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet32, intSet57, (java.lang.Integer) 100, false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet18 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        naturalness.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest12.FuzzTest_add(intSet18, intSet20, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet30 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        naturalness.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest24.FuzzTest_add(intSet30, intSet32, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(intSet30, intSet36, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet49 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        naturalness.TreeSet<java.lang.Integer> intSet51 = null;
        fuzzTest43.FuzzTest_add(intSet49, intSet51, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(intSet55, intSet56, (java.lang.Integer) 0, true);
        fuzzTest41.FuzzTest_add(intSet42, intSet55, (java.lang.Integer) 100, true);
        naturalness.TreeSet<java.lang.Integer> intSet63 = null;
        fuzzTest40.FuzzTest_add(intSet55, intSet63, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet73 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        naturalness.TreeSet<java.lang.Integer> intSet75 = null;
        fuzzTest67.FuzzTest_add(intSet73, intSet75, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_add(intSet79, intSet80, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { (-1), 0 };
        naturalness.TreeSet<java.lang.Integer> intSet87 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        fuzzTest40.FuzzTest_add(intSet80, intSet87, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet36, intSet87, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        naturalness.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest2.FuzzTest_add(intSet8, intSet10, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(intSet14, intSet15, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intSet1, intSet14, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet28 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        naturalness.TreeSet<java.lang.Integer> intSet30 = null;
        fuzzTest22.FuzzTest_add(intSet28, intSet30, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet40 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        naturalness.TreeSet<java.lang.Integer> intSet42 = null;
        fuzzTest34.FuzzTest_add(intSet40, intSet42, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_add(intSet40, intSet46, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet56 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        naturalness.TreeSet<java.lang.Integer> intSet58 = null;
        fuzzTest50.FuzzTest_add(intSet56, intSet58, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_add(intSet62, intSet63, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet40, intSet62, (java.lang.Integer) 100, false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet9 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        naturalness.TreeSet<java.lang.Integer> intSet11 = null;
        fuzzTest3.FuzzTest_add(intSet9, intSet11, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_add(intSet15, intSet16, (java.lang.Integer) 0, true);
        fuzzTest1.FuzzTest_add(intSet2, intSet15, (java.lang.Integer) 100, true);
        naturalness.TreeSet<java.lang.Integer> intSet23 = null;
        naturalness.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest1.FuzzTest_add(intSet23, intSet24, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet34 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        naturalness.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest28.FuzzTest_add(intSet34, intSet36, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest1.FuzzTest_add(intSet34, intSet40, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet50 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        naturalness.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest44.FuzzTest_add(intSet50, intSet52, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet62 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        naturalness.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest56.FuzzTest_add(intSet62, intSet64, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(intSet62, intSet68, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet34, intSet68, (java.lang.Integer) 0, true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 2, true);
        naturalness.TreeSet<java.lang.Integer> intSet6 = null;
        naturalness.TreeSet<java.lang.Integer> intSet7 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet7, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet18 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        naturalness.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest12.FuzzTest_add(intSet18, intSet20, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet30 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        naturalness.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest24.FuzzTest_add(intSet30, intSet32, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(intSet30, intSet36, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet46 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        naturalness.TreeSet<java.lang.Integer> intSet48 = null;
        fuzzTest40.FuzzTest_add(intSet46, intSet48, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(intSet48, intSet52, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1 };
        naturalness.TreeSet<java.lang.Integer> intSet58 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        naturalness.TreeSet<java.lang.Integer> intSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(intSet58, intSet60, (java.lang.Integer) 0, true);
        naturalness.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest11.FuzzTest_add(intSet58, intSet64, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet74 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        naturalness.TreeSet<java.lang.Integer> intSet76 = null;
        fuzzTest68.FuzzTest_add(intSet74, intSet76, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(intSet80, intSet81, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet58, intSet80, (java.lang.Integer) 100, false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet9 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        naturalness.TreeSet<java.lang.Integer> intSet11 = null;
        fuzzTest3.FuzzTest_add(intSet9, intSet11, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_add(intSet15, intSet16, (java.lang.Integer) 0, true);
        fuzzTest1.FuzzTest_add(intSet2, intSet15, (java.lang.Integer) 100, true);
        naturalness.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest0.FuzzTest_add(intSet15, intSet23, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet33 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        naturalness.TreeSet<java.lang.Integer> intSet35 = null;
        fuzzTest27.FuzzTest_add(intSet33, intSet35, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_add(intSet39, intSet40, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-1), 0 };
        naturalness.TreeSet<java.lang.Integer> intSet47 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest0.FuzzTest_add(intSet40, intSet47, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet53 = null;
        naturalness.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest52.FuzzTest_add(intSet53, intSet54, (java.lang.Integer) 2, true);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        naturalness.TreeSet<java.lang.Integer> intSet60 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        naturalness.TreeSet<java.lang.Integer> intSet62 = null;
        fuzzTest52.FuzzTest_add(intSet60, intSet62, (java.lang.Integer) 10, true);
        naturalness.TreeSet<java.lang.Integer> intSet66 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet60, intSet66, (java.lang.Integer) 2, false);
    }
}

