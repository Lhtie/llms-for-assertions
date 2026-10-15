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
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet14 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet28 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet34 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest20.FuzzTest_add(intSet28, intSet34, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet19, intSet34, (java.lang.Integer) 10, true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet18 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet24 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest10.FuzzTest_add(intSet18, intSet24, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet8, intSet18, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet41 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet47 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest33.FuzzTest_add(intSet41, intSet47, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet32, intSet47, (java.lang.Integer) 10, true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet18 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet24 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest10.FuzzTest_add(intSet18, intSet24, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet8, intSet18, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet41 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet51 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet57 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest43.FuzzTest_add(intSet51, intSet57, (java.lang.Integer) 2, false);
        fuzzTest33.FuzzTest_add(intSet41, intSet51, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet73 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet79 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        fuzzTest65.FuzzTest_add(intSet73, intSet79, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(intSet79, intSet84, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet32, intSet79, (java.lang.Integer) 0, true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet14 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet37 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet43 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        fuzzTest29.FuzzTest_add(intSet37, intSet43, (java.lang.Integer) 2, false);
        fuzzTest19.FuzzTest_add(intSet27, intSet37, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet59 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet65 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        fuzzTest51.FuzzTest_add(intSet59, intSet65, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(intSet65, intSet70, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet82 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet88 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        fuzzTest74.FuzzTest_add(intSet82, intSet88, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet65, intSet82, (java.lang.Integer) 10, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_add(intSet9, intSet15, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet29 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet39 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet45 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest31.FuzzTest_add(intSet39, intSet45, (java.lang.Integer) 2, false);
        fuzzTest21.FuzzTest_add(intSet29, intSet39, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet61 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet67 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzzTest53.FuzzTest_add(intSet61, intSet67, (java.lang.Integer) 2, false);
        fuzzTest20.FuzzTest_add(intSet29, intSet67, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet9, intSet67, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet11 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet21 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzzTest13.FuzzTest_add(intSet21, intSet27, (java.lang.Integer) 2, false);
        fuzzTest3.FuzzTest_add(intSet11, intSet21, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet43 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet49 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzzTest35.FuzzTest_add(intSet43, intSet49, (java.lang.Integer) 2, false);
        fuzzTest2.FuzzTest_add(intSet11, intSet49, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet1, intSet11, (java.lang.Integer) 10, true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet19 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet25 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest11.FuzzTest_add(intSet19, intSet25, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_add(intSet9, intSet19, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet33 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intSet33, intSet34, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet46 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet52 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest38.FuzzTest_add(intSet46, intSet52, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet34, intSet46, (java.lang.Integer) 0, true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_add(intSet9, intSet15, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet28 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet44 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzzTest30.FuzzTest_add(intSet38, intSet44, (java.lang.Integer) 2, false);
        fuzzTest20.FuzzTest_add(intSet28, intSet38, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet9, intSet28, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet18 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet24 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest10.FuzzTest_add(intSet18, intSet24, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet8, intSet18, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet32 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet32, intSet33, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet45 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet55 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet61 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        fuzzTest47.FuzzTest_add(intSet55, intSet61, (java.lang.Integer) 2, false);
        fuzzTest37.FuzzTest_add(intSet45, intSet55, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet69 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(intSet69, intSet70, (java.lang.Integer) (-1), false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet74 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet70, intSet74, (java.lang.Integer) 2, true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet14 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet37 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet43 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        fuzzTest29.FuzzTest_add(intSet37, intSet43, (java.lang.Integer) 2, false);
        fuzzTest19.FuzzTest_add(intSet27, intSet37, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet51 = null;
        fuzzTest0.FuzzTest_add(intSet37, intSet51, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet64 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet70 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        fuzzTest56.FuzzTest_add(intSet64, intSet70, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet55, intSet64, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet10 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet16 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzzTest2.FuzzTest_add(intSet10, intSet16, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet1, intSet16, (java.lang.Integer) 10, false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet10 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet26 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        fuzzTest12.FuzzTest_add(intSet20, intSet26, (java.lang.Integer) 2, false);
        fuzzTest2.FuzzTest_add(intSet10, intSet20, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet42 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet48 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        fuzzTest34.FuzzTest_add(intSet42, intSet48, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_add(intSet10, intSet48, (java.lang.Integer) 0, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet56 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(intSet56, intSet57, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet70 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet76 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        fuzzTest62.FuzzTest_add(intSet70, intSet76, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet81 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet82 = null;
        fuzzTest62.FuzzTest_add(intSet81, intSet82, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet86 = null;
        fuzzTest61.FuzzTest_add(intSet81, intSet86, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet57, intSet81, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_add(intSet9, intSet15, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet28 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet44 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzzTest30.FuzzTest_add(intSet38, intSet44, (java.lang.Integer) 2, false);
        fuzzTest20.FuzzTest_add(intSet28, intSet38, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest1.FuzzTest_add(intSet38, intSet52, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet56 = null;
        fuzzTest0.FuzzTest_add(intSet52, intSet56, (java.lang.Integer) 10, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet69 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet75 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzzTest61.FuzzTest_add(intSet69, intSet75, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet60, intSet75, (java.lang.Integer) 2, false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet18 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet24 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest10.FuzzTest_add(intSet18, intSet24, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet8, intSet18, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet40 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet46 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzzTest32.FuzzTest_add(intSet40, intSet46, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet46, intSet51, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 100, (-1) };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet59 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest0.FuzzTest_add(intSet59, intSet61, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 2, (-1) };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet68 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet70 = null;
        fuzzTest0.FuzzTest_add(intSet68, intSet70, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet83 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet89 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        fuzzTest75.FuzzTest_add(intSet83, intSet89, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet74, intSet89, (java.lang.Integer) 2, false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet18 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet24 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest10.FuzzTest_add(intSet18, intSet24, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet8, intSet18, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, (-1), 100, 100, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet48 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet54 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzzTest40.FuzzTest_add(intSet48, intSet54, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet38, intSet54, (java.lang.Integer) 100, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet71 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet77 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        fuzzTest63.FuzzTest_add(intSet71, intSet77, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet62, intSet77, (java.lang.Integer) 1, false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet19 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet25 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest11.FuzzTest_add(intSet19, intSet25, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_add(intSet9, intSet19, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet41 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet47 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest33.FuzzTest_add(intSet41, intSet47, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet60 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet66 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        fuzzTest52.FuzzTest_add(intSet60, intSet66, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_add(intSet47, intSet66, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet82 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet88 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        fuzzTest74.FuzzTest_add(intSet82, intSet88, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet47, intSet82, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_add(intSet9, intSet15, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest1.FuzzTest_add(intSet20, intSet21, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet21, intSet25, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet40 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet46 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzzTest32.FuzzTest_add(intSet40, intSet46, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet51 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest32.FuzzTest_add(intSet51, intSet52, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_add(intSet52, intSet56, (java.lang.Integer) 100, true);
        fuzzTest29.FuzzTest_add(intSet30, intSet56, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1), 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet67 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet56, intSet67, (java.lang.Integer) 100, true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet14 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet33 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_add(intSet27, intSet33, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet38 = null;
        fuzzTest0.FuzzTest_add(intSet33, intSet38, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet51 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet57 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest43.FuzzTest_add(intSet51, intSet57, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet62 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet63 = null;
        fuzzTest43.FuzzTest_add(intSet62, intSet63, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(intSet63, intSet67, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-1), 0, 100, 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet76 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet67, intSet76, (java.lang.Integer) 2, false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_add(intSet9, intSet15, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest1.FuzzTest_add(intSet20, intSet21, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest0.FuzzTest_add(intSet20, intSet25, (java.lang.Integer) 0, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet29 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet30 = null;
        fuzzTest0.FuzzTest_add(intSet29, intSet30, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet35 = null;
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet45 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet51 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzzTest37.FuzzTest_add(intSet45, intSet51, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet56 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet57 = null;
        fuzzTest37.FuzzTest_add(intSet56, intSet57, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_add(intSet57, intSet61, (java.lang.Integer) 100, true);
        fuzzTest34.FuzzTest_add(intSet35, intSet61, (java.lang.Integer) 100, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet68 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet61, intSet68, (java.lang.Integer) 0, false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet19 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet25 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest11.FuzzTest_add(intSet19, intSet25, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_add(intSet9, intSet19, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet41 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet47 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest33.FuzzTest_add(intSet41, intSet47, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet9, intSet47, (java.lang.Integer) 0, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet55 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet55, intSet56, (java.lang.Integer) 0, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet69 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet79 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet85 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        fuzzTest71.FuzzTest_add(intSet79, intSet85, (java.lang.Integer) 2, false);
        fuzzTest61.FuzzTest_add(intSet69, intSet79, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet60, intSet79, (java.lang.Integer) 100, false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet14 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet33 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_add(intSet27, intSet33, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet38 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet39 = null;
        fuzzTest19.FuzzTest_add(intSet38, intSet39, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet43 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(intSet43, intSet44, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet57 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet63 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzzTest49.FuzzTest_add(intSet57, intSet63, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet68 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet69 = null;
        fuzzTest49.FuzzTest_add(intSet68, intSet69, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(intSet69, intSet73, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet44, intSet73, (java.lang.Integer) 1, false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet18 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet24 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest10.FuzzTest_add(intSet18, intSet24, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet8, intSet18, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet40 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet46 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzzTest32.FuzzTest_add(intSet40, intSet46, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet46, intSet51, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 100, (-1) };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet59 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest0.FuzzTest_add(intSet59, intSet61, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 2, (-1) };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet68 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet70 = null;
        fuzzTest0.FuzzTest_add(intSet68, intSet70, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet83 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet89 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        fuzzTest75.FuzzTest_add(intSet83, intSet89, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet74, intSet83, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet14 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet19 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest0.FuzzTest_add(intSet19, intSet20, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet32 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzzTest24.FuzzTest_add(intSet32, intSet38, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet43 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet44 = null;
        fuzzTest24.FuzzTest_add(intSet43, intSet44, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet48 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(intSet48, intSet49, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet57 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet49, intSet57, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet19 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet25 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest11.FuzzTest_add(intSet19, intSet25, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_add(intSet9, intSet19, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet41 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet47 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest33.FuzzTest_add(intSet41, intSet47, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet9, intSet47, (java.lang.Integer) 0, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet55 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet55, intSet56, (java.lang.Integer) 0, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet60 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest0.FuzzTest_add(intSet60, intSet61, (java.lang.Integer) 2, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet65 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet66 = null;
        fuzzTest0.FuzzTest_add(intSet65, intSet66, (java.lang.Integer) 1, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet70 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 100, 10, 10, (-1) };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet77 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet70, intSet77, (java.lang.Integer) 10, true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet18 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet24 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest10.FuzzTest_add(intSet18, intSet24, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet8, intSet18, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, (-1), 100, 100, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet48 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet54 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzzTest40.FuzzTest_add(intSet48, intSet54, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet38, intSet54, (java.lang.Integer) 100, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet62 = null;
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet71 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet77 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        fuzzTest63.FuzzTest_add(intSet71, intSet77, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet62, intSet77, (java.lang.Integer) 2, true);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 2, (-1) };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet88 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet90 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet88, intSet90, (java.lang.Integer) 1, false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet10 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet16 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzzTest2.FuzzTest_add(intSet10, intSet16, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet21 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest2.FuzzTest_add(intSet21, intSet22, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet26 = null;
        fuzzTest1.FuzzTest_add(intSet21, intSet26, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet48 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet54 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzzTest40.FuzzTest_add(intSet48, intSet54, (java.lang.Integer) 2, false);
        fuzzTest30.FuzzTest_add(intSet38, intSet48, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet21, intSet38, (java.lang.Integer) 0, false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet1 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet21 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        fuzzTest7.FuzzTest_add(intSet15, intSet21, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet27 = null;
        fuzzTest7.FuzzTest_add(intSet26, intSet27, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest6.FuzzTest_add(intSet26, intSet31, (java.lang.Integer) 0, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet35 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest6.FuzzTest_add(intSet35, intSet36, (java.lang.Integer) 2, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet40 = null;
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet42 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_add(intSet42, intSet43, (java.lang.Integer) 0, false);
        fuzzTest6.FuzzTest_add(intSet40, intSet43, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet58 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet64 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        fuzzTest50.FuzzTest_add(intSet58, intSet64, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet69 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet70 = null;
        fuzzTest50.FuzzTest_add(intSet69, intSet70, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet74 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_add(intSet74, intSet75, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet43, intSet75, (java.lang.Integer) 1, true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet1 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet14 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet24 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet30 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        fuzzTest16.FuzzTest_add(intSet24, intSet30, (java.lang.Integer) 2, false);
        fuzzTest6.FuzzTest_add(intSet14, intSet24, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet46 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet52 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest38.FuzzTest_add(intSet46, intSet52, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(intSet52, intSet57, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet70 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet76 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        fuzzTest62.FuzzTest_add(intSet70, intSet76, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet81 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet82 = null;
        fuzzTest62.FuzzTest_add(intSet81, intSet82, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_add(intSet82, intSet86, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet57, intSet86, (java.lang.Integer) 1, true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet14 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet19 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest0.FuzzTest_add(intSet19, intSet20, (java.lang.Integer) 2, true);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet26 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet36 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet46 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet52 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest38.FuzzTest_add(intSet46, intSet52, (java.lang.Integer) 2, false);
        fuzzTest28.FuzzTest_add(intSet36, intSet46, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet60 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_add(intSet60, intSet61, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet26, intSet61, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet1 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 0, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet6 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet7 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet7, (java.lang.Integer) 100, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet26 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        fuzzTest12.FuzzTest_add(intSet20, intSet26, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet39 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet45 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest31.FuzzTest_add(intSet39, intSet45, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet50 = null;
        fuzzTest12.FuzzTest_add(intSet45, intSet50, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet11, intSet45, (java.lang.Integer) 1, false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet14 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet19 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest0.FuzzTest_add(intSet19, intSet20, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet33 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet39 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest25.FuzzTest_add(intSet33, intSet39, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet44 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet45 = null;
        fuzzTest25.FuzzTest_add(intSet44, intSet45, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest24.FuzzTest_add(intSet44, intSet49, (java.lang.Integer) 0, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet49, intSet53, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet58 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(intSet58, intSet59, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet71 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet81 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet87 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        fuzzTest73.FuzzTest_add(intSet81, intSet87, (java.lang.Integer) 2, false);
        fuzzTest63.FuzzTest_add(intSet71, intSet81, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet59, intSet81, (java.lang.Integer) 2, false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_add(intSet9, intSet15, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest1.FuzzTest_add(intSet20, intSet21, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet21, intSet25, (java.lang.Integer) 100, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet29 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet30 = null;
        fuzzTest0.FuzzTest_add(intSet29, intSet30, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet34 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet35 = null;
        fuzzTest0.FuzzTest_add(intSet34, intSet35, (java.lang.Integer) 0, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet49 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet55 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        fuzzTest41.FuzzTest_add(intSet49, intSet55, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet60 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest41.FuzzTest_add(intSet60, intSet61, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_add(intSet61, intSet65, (java.lang.Integer) 100, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet69 = null;
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet78 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet84 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        fuzzTest70.FuzzTest_add(intSet78, intSet84, (java.lang.Integer) 2, false);
        fuzzTest40.FuzzTest_add(intSet69, intSet78, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet39, intSet78, (java.lang.Integer) 0, true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_add(intSet9, intSet15, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest1.FuzzTest_add(intSet20, intSet21, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest0.FuzzTest_add(intSet20, intSet25, (java.lang.Integer) 0, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet29 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet30 = null;
        fuzzTest0.FuzzTest_add(intSet29, intSet30, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet43 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet53 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet59 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest45.FuzzTest_add(intSet53, intSet59, (java.lang.Integer) 2, false);
        fuzzTest35.FuzzTest_add(intSet43, intSet53, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet75 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet81 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        fuzzTest67.FuzzTest_add(intSet75, intSet81, (java.lang.Integer) 2, false);
        fuzzTest34.FuzzTest_add(intSet43, intSet81, (java.lang.Integer) 0, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet89 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet90 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(intSet89, intSet90, (java.lang.Integer) 0, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet94 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet90, intSet94, (java.lang.Integer) 2, false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet11 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet21 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzzTest13.FuzzTest_add(intSet21, intSet27, (java.lang.Integer) 2, false);
        fuzzTest3.FuzzTest_add(intSet11, intSet21, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet43 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet49 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzzTest35.FuzzTest_add(intSet43, intSet49, (java.lang.Integer) 2, false);
        fuzzTest2.FuzzTest_add(intSet11, intSet49, (java.lang.Integer) 0, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet66 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet72 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest58.FuzzTest_add(intSet66, intSet72, (java.lang.Integer) 2, false);
        fuzzTest2.FuzzTest_add(intSet57, intSet66, (java.lang.Integer) 100, false);
        fuzzTest0.FuzzTest_add(intSet1, intSet66, (java.lang.Integer) 100, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet83 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet84 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet83, intSet84, (java.lang.Integer) 100, false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet18 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet24 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest10.FuzzTest_add(intSet18, intSet24, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet8, intSet18, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet43 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet49 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzzTest35.FuzzTest_add(intSet43, intSet49, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet54 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest35.FuzzTest_add(intSet54, intSet55, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(intSet55, intSet59, (java.lang.Integer) 100, true);
        fuzzTest32.FuzzTest_add(intSet33, intSet59, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet67 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet68 = null;
        fuzzTest66.FuzzTest_add(intSet67, intSet68, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet80 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet86 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        fuzzTest72.FuzzTest_add(intSet80, intSet86, (java.lang.Integer) 2, false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet91 = null;
        fuzzTest66.FuzzTest_add(intSet80, intSet91, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet59, intSet80, (java.lang.Integer) 2, true);
    }
}

