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
        fuzzTest0.FuzzTest_pollLast(intSet8, intSet14, (java.lang.Integer) 2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_pollLast(intSet1, intSet2, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet11 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        naturalness.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest5.FuzzTest_pollLast(intSet11, intSet13, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet20 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet28 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        naturalness.TreeSet<java.lang.Integer> intSet30 = null;
        fuzzTest22.FuzzTest_pollLast(intSet28, intSet30, (java.lang.Integer) (-1));
        fuzzTest5.FuzzTest_pollLast(intSet20, intSet28, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet41 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        naturalness.TreeSet<java.lang.Integer> intSet43 = null;
        fuzzTest35.FuzzTest_pollLast(intSet41, intSet43, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet54 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        naturalness.TreeSet<java.lang.Integer> intSet56 = null;
        fuzzTest48.FuzzTest_pollLast(intSet54, intSet56, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet63 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet71 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        naturalness.TreeSet<java.lang.Integer> intSet73 = null;
        fuzzTest65.FuzzTest_pollLast(intSet71, intSet73, (java.lang.Integer) (-1));
        fuzzTest48.FuzzTest_pollLast(intSet63, intSet71, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_pollLast(intSet71, intSet78, (java.lang.Integer) 100);
        fuzzTest35.FuzzTest_pollLast(intSet46, intSet78, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet28, intSet46, (java.lang.Integer) 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet7 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        naturalness.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_pollLast(intSet7, intSet9, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet16 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet24 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        naturalness.TreeSet<java.lang.Integer> intSet26 = null;
        fuzzTest18.FuzzTest_pollLast(intSet24, intSet26, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_pollLast(intSet16, intSet24, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet38 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        naturalness.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest32.FuzzTest_pollLast(intSet38, intSet40, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet47 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet55 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        naturalness.TreeSet<java.lang.Integer> intSet57 = null;
        fuzzTest49.FuzzTest_pollLast(intSet55, intSet57, (java.lang.Integer) (-1));
        fuzzTest32.FuzzTest_pollLast(intSet47, intSet55, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_pollLast(intSet55, intSet62, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet24, intSet62, (java.lang.Integer) 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_pollLast(intSet1, intSet2, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet12 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        naturalness.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest6.FuzzTest_pollLast(intSet12, intSet14, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet21 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet29 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        naturalness.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest23.FuzzTest_pollLast(intSet29, intSet31, (java.lang.Integer) (-1));
        fuzzTest6.FuzzTest_pollLast(intSet21, intSet29, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_pollLast(intSet29, intSet36, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet45 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        naturalness.TreeSet<java.lang.Integer> intSet47 = null;
        fuzzTest39.FuzzTest_pollLast(intSet45, intSet47, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_pollLast(intSet29, intSet45, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0, 1, (-1), 1, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet59 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        naturalness.TreeSet<java.lang.Integer> intSet61 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet59, intSet61, (java.lang.Integer) (-1));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_pollLast(intSet6, intSet8, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet19 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        naturalness.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_pollLast(intSet19, intSet21, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet28 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet36 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        naturalness.TreeSet<java.lang.Integer> intSet38 = null;
        fuzzTest30.FuzzTest_pollLast(intSet36, intSet38, (java.lang.Integer) (-1));
        fuzzTest13.FuzzTest_pollLast(intSet28, intSet36, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_pollLast(intSet36, intSet43, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_pollLast(intSet11, intSet43, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet54 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        naturalness.TreeSet<java.lang.Integer> intSet56 = null;
        fuzzTest48.FuzzTest_pollLast(intSet54, intSet56, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_pollLast(intSet54, intSet59, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_pollLast(intSet62, intSet63, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet67 = null;
        naturalness.TreeSet<java.lang.Integer> intSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_pollLast(intSet67, intSet68, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet71 = null;
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet78 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        fuzzTest66.FuzzTest_pollLast(intSet71, intSet78, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet83 = null;
        naturalness.TreeSet<java.lang.Integer> intSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_pollLast(intSet83, intSet84, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet87 = null;
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet94 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet94, intArray93);
        fuzzTest82.FuzzTest_pollLast(intSet87, intSet94, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet78, intSet94, (java.lang.Integer) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_pollLast(intSet6, intSet8, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet12 = null;
        naturalness.TreeSet<java.lang.Integer> intSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_pollLast(intSet12, intSet13, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet23 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        naturalness.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest17.FuzzTest_pollLast(intSet23, intSet25, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet32 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet40 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        naturalness.TreeSet<java.lang.Integer> intSet42 = null;
        fuzzTest34.FuzzTest_pollLast(intSet40, intSet42, (java.lang.Integer) (-1));
        fuzzTest17.FuzzTest_pollLast(intSet32, intSet40, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_pollLast(intSet40, intSet47, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet56 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        naturalness.TreeSet<java.lang.Integer> intSet58 = null;
        fuzzTest50.FuzzTest_pollLast(intSet56, intSet58, (java.lang.Integer) (-1));
        fuzzTest11.FuzzTest_pollLast(intSet40, intSet56, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet69 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        naturalness.TreeSet<java.lang.Integer> intSet71 = null;
        fuzzTest63.FuzzTest_pollLast(intSet69, intSet71, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet78 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet86 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        naturalness.TreeSet<java.lang.Integer> intSet88 = null;
        fuzzTest80.FuzzTest_pollLast(intSet86, intSet88, (java.lang.Integer) (-1));
        fuzzTest63.FuzzTest_pollLast(intSet78, intSet86, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet40, intSet86, (java.lang.Integer) 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_pollLast(intSet6, intSet8, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet15 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet23 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        naturalness.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest17.FuzzTest_pollLast(intSet23, intSet25, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_pollLast(intSet15, intSet23, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet37 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        naturalness.TreeSet<java.lang.Integer> intSet39 = null;
        fuzzTest31.FuzzTest_pollLast(intSet37, intSet39, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet46 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet54 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        naturalness.TreeSet<java.lang.Integer> intSet56 = null;
        fuzzTest48.FuzzTest_pollLast(intSet54, intSet56, (java.lang.Integer) (-1));
        fuzzTest31.FuzzTest_pollLast(intSet46, intSet54, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_pollLast(intSet54, intSet61, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet70 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        naturalness.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest64.FuzzTest_pollLast(intSet70, intSet72, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet79 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet87 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        naturalness.TreeSet<java.lang.Integer> intSet89 = null;
        fuzzTest81.FuzzTest_pollLast(intSet87, intSet89, (java.lang.Integer) (-1));
        fuzzTest64.FuzzTest_pollLast(intSet79, intSet87, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet54, intSet79, (java.lang.Integer) 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        naturalness.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_pollLast(intSet2, intSet3, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        naturalness.TreeSet<java.lang.Integer> intSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_pollLast(intSet8, intSet9, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet12 = null;
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet19 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest7.FuzzTest_pollLast(intSet12, intSet19, (java.lang.Integer) 100);
        fuzzTest1.FuzzTest_pollLast(intSet6, intSet19, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet31 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        naturalness.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest25.FuzzTest_pollLast(intSet31, intSet33, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet42 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        naturalness.TreeSet<java.lang.Integer> intSet44 = null;
        fuzzTest36.FuzzTest_pollLast(intSet42, intSet44, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet51 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet59 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        naturalness.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest53.FuzzTest_pollLast(intSet59, intSet61, (java.lang.Integer) (-1));
        fuzzTest36.FuzzTest_pollLast(intSet51, intSet59, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet67 = null;
        naturalness.TreeSet<java.lang.Integer> intSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_pollLast(intSet67, intSet68, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet71 = null;
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet78 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        fuzzTest66.FuzzTest_pollLast(intSet71, intSet78, (java.lang.Integer) 100);
        fuzzTest25.FuzzTest_pollLast(intSet59, intSet71, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet19, intSet59, (java.lang.Integer) 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet7 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        naturalness.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_pollLast(intSet7, intSet9, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet16 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet24 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        naturalness.TreeSet<java.lang.Integer> intSet26 = null;
        fuzzTest18.FuzzTest_pollLast(intSet24, intSet26, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_pollLast(intSet16, intSet24, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet38 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        naturalness.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest32.FuzzTest_pollLast(intSet38, intSet40, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet47 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet55 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        naturalness.TreeSet<java.lang.Integer> intSet57 = null;
        fuzzTest49.FuzzTest_pollLast(intSet55, intSet57, (java.lang.Integer) (-1));
        fuzzTest32.FuzzTest_pollLast(intSet47, intSet55, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_pollLast(intSet55, intSet62, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet24, intSet62, (java.lang.Integer) 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0 };
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_pollLast(intSet3, intSet5, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet9 = null;
        naturalness.TreeSet<java.lang.Integer> intSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_pollLast(intSet9, intSet10, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet15 = null;
        naturalness.TreeSet<java.lang.Integer> intSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_pollLast(intSet15, intSet16, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet19 = null;
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet26 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        fuzzTest14.FuzzTest_pollLast(intSet19, intSet26, (java.lang.Integer) 100);
        fuzzTest8.FuzzTest_pollLast(intSet13, intSet26, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet40 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        naturalness.TreeSet<java.lang.Integer> intSet42 = null;
        fuzzTest34.FuzzTest_pollLast(intSet40, intSet42, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet49 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet57 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        naturalness.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest51.FuzzTest_pollLast(intSet57, intSet59, (java.lang.Integer) (-1));
        fuzzTest34.FuzzTest_pollLast(intSet49, intSet57, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_pollLast(intSet57, intSet64, (java.lang.Integer) 100);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 0, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet71 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        fuzzTest32.FuzzTest_pollLast(intSet64, intSet71, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet26, intSet71, (java.lang.Integer) 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_pollLast(intSet1, intSet2, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet7 = null;
        naturalness.TreeSet<java.lang.Integer> intSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_pollLast(intSet7, intSet8, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet13 = null;
        naturalness.TreeSet<java.lang.Integer> intSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_pollLast(intSet13, intSet14, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet17 = null;
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet24 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest12.FuzzTest_pollLast(intSet17, intSet24, (java.lang.Integer) 100);
        fuzzTest6.FuzzTest_pollLast(intSet11, intSet24, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_pollLast(intSet5, intSet11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet38 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        naturalness.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest32.FuzzTest_pollLast(intSet38, intSet40, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet47 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet55 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        naturalness.TreeSet<java.lang.Integer> intSet57 = null;
        fuzzTest49.FuzzTest_pollLast(intSet55, intSet57, (java.lang.Integer) (-1));
        fuzzTest32.FuzzTest_pollLast(intSet47, intSet55, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet68 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        naturalness.TreeSet<java.lang.Integer> intSet70 = null;
        fuzzTest62.FuzzTest_pollLast(intSet68, intSet70, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet77 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet85 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        naturalness.TreeSet<java.lang.Integer> intSet87 = null;
        fuzzTest79.FuzzTest_pollLast(intSet85, intSet87, (java.lang.Integer) (-1));
        fuzzTest62.FuzzTest_pollLast(intSet77, intSet85, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet55, intSet85, (java.lang.Integer) 1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0 };
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_pollLast(intSet3, intSet5, (java.lang.Integer) 2);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        naturalness.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest0.FuzzTest_pollLast(intSet8, intSet9, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet13 = null;
        naturalness.TreeSet<java.lang.Integer> intSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_pollLast(intSet13, intSet14, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet17 = null;
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet24 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest12.FuzzTest_pollLast(intSet17, intSet24, (java.lang.Integer) 100);
        naturalness.TreeSet<java.lang.Integer> intSet28 = null;
        fuzzTest0.FuzzTest_pollLast(intSet24, intSet28, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet37 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        naturalness.TreeSet<java.lang.Integer> intSet39 = null;
        fuzzTest31.FuzzTest_pollLast(intSet37, intSet39, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet46 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet54 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        naturalness.TreeSet<java.lang.Integer> intSet56 = null;
        fuzzTest48.FuzzTest_pollLast(intSet54, intSet56, (java.lang.Integer) (-1));
        fuzzTest31.FuzzTest_pollLast(intSet46, intSet54, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet67 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        naturalness.TreeSet<java.lang.Integer> intSet69 = null;
        fuzzTest61.FuzzTest_pollLast(intSet67, intSet69, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet76 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet84 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        naturalness.TreeSet<java.lang.Integer> intSet86 = null;
        fuzzTest78.FuzzTest_pollLast(intSet84, intSet86, (java.lang.Integer) (-1));
        fuzzTest61.FuzzTest_pollLast(intSet76, intSet84, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet46, intSet84, (java.lang.Integer) (-1));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0 };
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_pollLast(intSet3, intSet5, (java.lang.Integer) 2);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        naturalness.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest0.FuzzTest_pollLast(intSet8, intSet9, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet13 = null;
        naturalness.TreeSet<java.lang.Integer> intSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_pollLast(intSet13, intSet14, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet23 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        naturalness.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest17.FuzzTest_pollLast(intSet23, intSet25, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet32 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet40 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        naturalness.TreeSet<java.lang.Integer> intSet42 = null;
        fuzzTest34.FuzzTest_pollLast(intSet40, intSet42, (java.lang.Integer) (-1));
        fuzzTest17.FuzzTest_pollLast(intSet32, intSet40, (java.lang.Integer) 10);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet49 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzzTest12.FuzzTest_pollLast(intSet32, intSet49, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet54 = null;
        naturalness.TreeSet<java.lang.Integer> intSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_pollLast(intSet54, intSet55, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet60 = null;
        naturalness.TreeSet<java.lang.Integer> intSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_pollLast(intSet60, intSet61, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet64 = null;
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet71 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        fuzzTest59.FuzzTest_pollLast(intSet64, intSet71, (java.lang.Integer) 100);
        fuzzTest53.FuzzTest_pollLast(intSet58, intSet71, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet32, intSet71, (java.lang.Integer) (-1));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0 };
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_pollLast(intSet3, intSet5, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet15 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        naturalness.TreeSet<java.lang.Integer> intSet17 = null;
        fuzzTest9.FuzzTest_pollLast(intSet15, intSet17, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet24 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet32 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        naturalness.TreeSet<java.lang.Integer> intSet34 = null;
        fuzzTest26.FuzzTest_pollLast(intSet32, intSet34, (java.lang.Integer) (-1));
        fuzzTest9.FuzzTest_pollLast(intSet24, intSet32, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_pollLast(intSet32, intSet39, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet43 = null;
        naturalness.TreeSet<java.lang.Integer> intSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_pollLast(intSet43, intSet44, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet53 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        naturalness.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest47.FuzzTest_pollLast(intSet53, intSet55, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet62 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet70 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        naturalness.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest64.FuzzTest_pollLast(intSet70, intSet72, (java.lang.Integer) (-1));
        fuzzTest47.FuzzTest_pollLast(intSet62, intSet70, (java.lang.Integer) 10);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet79 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        fuzzTest42.FuzzTest_pollLast(intSet62, intSet79, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet32, intSet62, (java.lang.Integer) 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0 };
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_pollLast(intSet3, intSet5, (java.lang.Integer) 2);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        naturalness.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest0.FuzzTest_pollLast(intSet8, intSet9, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet18 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        naturalness.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest12.FuzzTest_pollLast(intSet18, intSet20, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet29 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        naturalness.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest23.FuzzTest_pollLast(intSet29, intSet31, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet38 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet46 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        naturalness.TreeSet<java.lang.Integer> intSet48 = null;
        fuzzTest40.FuzzTest_pollLast(intSet46, intSet48, (java.lang.Integer) (-1));
        fuzzTest23.FuzzTest_pollLast(intSet38, intSet46, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet59 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        naturalness.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest53.FuzzTest_pollLast(intSet59, intSet61, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet68 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet76 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        naturalness.TreeSet<java.lang.Integer> intSet78 = null;
        fuzzTest70.FuzzTest_pollLast(intSet76, intSet78, (java.lang.Integer) (-1));
        fuzzTest53.FuzzTest_pollLast(intSet68, intSet76, (java.lang.Integer) 10);
        fuzzTest12.FuzzTest_pollLast(intSet38, intSet76, (java.lang.Integer) 1);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 0, 100, 10 };
        naturalness.TreeSet<java.lang.Integer> intSet89 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet76, intSet89, (java.lang.Integer) 1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_pollLast(intSet1, intSet2, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet7 = null;
        naturalness.TreeSet<java.lang.Integer> intSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_pollLast(intSet7, intSet8, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet11 = null;
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet18 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        fuzzTest6.FuzzTest_pollLast(intSet11, intSet18, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_pollLast(intSet5, intSet18, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet26 = null;
        naturalness.TreeSet<java.lang.Integer> intSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_pollLast(intSet26, intSet27, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_pollLast(intSet24, intSet27, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0 };
        naturalness.TreeSet<java.lang.Integer> intSet35 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        naturalness.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest32.FuzzTest_pollLast(intSet35, intSet37, (java.lang.Integer) 2);
        naturalness.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest0.FuzzTest_pollLast(intSet35, intSet40, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet44 = null;
        naturalness.TreeSet<java.lang.Integer> intSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_pollLast(intSet44, intSet45, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet48 = null;
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet55 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        fuzzTest43.FuzzTest_pollLast(intSet48, intSet55, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet60 = null;
        naturalness.TreeSet<java.lang.Integer> intSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_pollLast(intSet60, intSet61, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet64 = null;
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet71 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        fuzzTest59.FuzzTest_pollLast(intSet64, intSet71, (java.lang.Integer) 100);
        naturalness.TreeSet<java.lang.Integer> intSet75 = null;
        fuzzTest43.FuzzTest_pollLast(intSet71, intSet75, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet78 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet71, intSet78, (java.lang.Integer) 1);
    }
}

