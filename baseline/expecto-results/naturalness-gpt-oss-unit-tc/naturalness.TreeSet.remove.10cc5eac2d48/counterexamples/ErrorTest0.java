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
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
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
        fuzzTest0.FuzzTest_remove(intSet8, intSet18, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet41 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet47 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest33.FuzzTest_remove(intSet41, intSet47, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet32, intSet47, (java.lang.Integer) 10, true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
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
        fuzzTest0.FuzzTest_remove(intSet8, intSet18, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
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
        fuzzTest33.FuzzTest_remove(intSet41, intSet51, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet73 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet79 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        fuzzTest65.FuzzTest_remove(intSet73, intSet79, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_remove(intSet79, intSet84, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet32, intSet79, (java.lang.Integer) 0, true);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet9 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet19 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet25 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest11.FuzzTest_remove(intSet19, intSet25, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_remove(intSet9, intSet19, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, (-1), 100, 100, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet39 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet49 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet55 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        fuzzTest41.FuzzTest_remove(intSet49, intSet55, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_remove(intSet39, intSet55, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 2, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet67 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzzTest0.FuzzTest_remove(intSet55, intSet67, (java.lang.Integer) (-1), true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet81 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet87 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        fuzzTest73.FuzzTest_remove(intSet81, intSet87, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet72, intSet81, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
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
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet28 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet38 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet44 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzzTest30.FuzzTest_remove(intSet38, intSet44, (java.lang.Integer) 2, false);
        fuzzTest20.FuzzTest_remove(intSet28, intSet38, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet19, intSet38, (java.lang.Integer) 2, true);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
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
        fuzzTest0.FuzzTest_remove(intSet8, intSet18, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet32 = fuzztests.FuzzTest.makeFuzzInput();
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
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet79 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet85 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        fuzzTest71.FuzzTest_remove(intSet79, intSet85, (java.lang.Integer) 2, false);
        fuzzTest33.FuzzTest_remove(intSet66, intSet85, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet32, intSet85, (java.lang.Integer) 10, true);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
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
        fuzzTest0.FuzzTest_remove(intSet8, intSet18, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet32 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet32, intSet33, (java.lang.Integer) (-1), false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet37 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet37, intSet38, (java.lang.Integer) 100, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet42 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet43 = null;
        fuzzTest0.FuzzTest_remove(intSet42, intSet43, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet55 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet65 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet71 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        fuzzTest57.FuzzTest_remove(intSet65, intSet71, (java.lang.Integer) 2, false);
        fuzzTest47.FuzzTest_remove(intSet55, intSet65, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet79 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_remove(intSet79, intSet80, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100, 2, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet88 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet80, intSet88, (java.lang.Integer) 2, true);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
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
        fuzzTest0.FuzzTest_remove(intSet33, intSet52, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet68 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet74 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        fuzzTest60.FuzzTest_remove(intSet68, intSet74, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet79 = null;
        fuzzTest0.FuzzTest_remove(intSet68, intSet79, (java.lang.Integer) 2, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet83 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet84 = null;
        fuzzTest0.FuzzTest_remove(intSet83, intSet84, (java.lang.Integer) 0, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet89 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet88, intSet89, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
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
        fuzzTest0.FuzzTest_remove(intSet8, intSet18, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet32 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet32, intSet33, (java.lang.Integer) (-1), false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet37 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intSet37, intSet38, (java.lang.Integer) 100, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet42 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet43 = null;
        fuzzTest0.FuzzTest_remove(intSet42, intSet43, (java.lang.Integer) 0, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet62 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest48.FuzzTest_remove(intSet56, intSet62, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 100, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet71 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet81 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet87 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        fuzzTest73.FuzzTest_remove(intSet81, intSet87, (java.lang.Integer) 2, false);
        fuzzTest48.FuzzTest_remove(intSet71, intSet87, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet47, intSet71, (java.lang.Integer) (-1), true);
    }
}

