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
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet14, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_pollFirst(intSet27, intSet33, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet18, intSet33, (java.lang.Integer) 10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet10 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet16 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzzTest2.FuzzTest_pollFirst(intSet10, intSet16, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet1, intSet16, (java.lang.Integer) 10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet14, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_pollFirst(intSet27, intSet33, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_pollFirst(intSet33, intSet37, (java.lang.Integer) 10);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet33, intSet40, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet51 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet57 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest43.FuzzTest_pollFirst(intSet51, intSet57, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 100, 0, 100, (-1), 10 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet70 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet80 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet86 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        fuzzTest72.FuzzTest_pollFirst(intSet80, intSet86, (java.lang.Integer) 2);
        fuzzTest62.FuzzTest_pollFirst(intSet70, intSet80, (java.lang.Integer) 1);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet92 = null;
        fuzzTest61.FuzzTest_pollFirst(intSet80, intSet92, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet57, intSet80, (java.lang.Integer) (-1));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 100, 0, 100, (-1), 10 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet9 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet19 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet25 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest11.FuzzTest_pollFirst(intSet19, intSet25, (java.lang.Integer) 2);
        fuzzTest1.FuzzTest_pollFirst(intSet9, intSet19, (java.lang.Integer) 1);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet41 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet47 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest33.FuzzTest_pollFirst(intSet41, intSet47, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_pollFirst(intSet47, intSet51, (java.lang.Integer) 10);
        fuzzTest1.FuzzTest_pollFirst(intSet31, intSet51, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet65 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet71 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        fuzzTest57.FuzzTest_pollFirst(intSet65, intSet71, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_pollFirst(intSet71, intSet75, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet51, intSet71, (java.lang.Integer) (-1));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet14, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_pollFirst(intSet27, intSet33, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet18, intSet27, (java.lang.Integer) (-1));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 100, 0, 100, (-1), 10 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet18 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet24 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest10.FuzzTest_pollFirst(intSet18, intSet24, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet18, (java.lang.Integer) 1);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet30 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, (-1) };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet30, intSet34, (java.lang.Integer) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet14, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet18 = null;
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_pollFirst(intSet27, intSet33, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet46 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest38.FuzzTest_pollFirst(intSet46, intSet52, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_pollFirst(intSet52, intSet56, (java.lang.Integer) 10);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest19.FuzzTest_pollFirst(intSet52, intSet59, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_pollFirst(intSet18, intSet59, (java.lang.Integer) 100);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet73 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet79 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        fuzzTest65.FuzzTest_pollFirst(intSet73, intSet79, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet64, intSet73, (java.lang.Integer) (-1));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet14, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet26 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet32 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest18.FuzzTest_pollFirst(intSet26, intSet32, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet26, intSet36, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet48 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet54 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzzTest40.FuzzTest_pollFirst(intSet48, intSet54, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_pollFirst(intSet54, intSet58, (java.lang.Integer) 10);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet58, intSet61, (java.lang.Integer) 100);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, 1, 100, 1, 0 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet70 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet81 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet87 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        fuzzTest73.FuzzTest_pollFirst(intSet81, intSet87, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet91 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_pollFirst(intSet87, intSet91, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet70, intSet87, (java.lang.Integer) (-1));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet9 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet15 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_pollFirst(intSet9, intSet15, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_pollFirst(intSet27, intSet33, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet46 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest38.FuzzTest_pollFirst(intSet46, intSet52, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_pollFirst(intSet52, intSet56, (java.lang.Integer) 10);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest19.FuzzTest_pollFirst(intSet52, intSet59, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet70 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet76 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        fuzzTest62.FuzzTest_pollFirst(intSet70, intSet76, (java.lang.Integer) 2);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 1, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet84 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        fuzzTest19.FuzzTest_pollFirst(intSet76, intSet84, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet9, intSet76, (java.lang.Integer) (-1));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet1, intSet2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet13 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet19 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest5.FuzzTest_pollFirst(intSet13, intSet19, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet32 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet38 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzzTest24.FuzzTest_pollFirst(intSet32, intSet38, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_pollFirst(intSet38, intSet42, (java.lang.Integer) 10);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet45 = null;
        fuzzTest5.FuzzTest_pollFirst(intSet38, intSet45, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet62 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest48.FuzzTest_pollFirst(intSet56, intSet62, (java.lang.Integer) 2);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1), 1, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet70 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        fuzzTest5.FuzzTest_pollFirst(intSet62, intSet70, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet83 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet89 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        fuzzTest75.FuzzTest_pollFirst(intSet83, intSet89, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet93 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_pollFirst(intSet89, intSet93, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet70, intSet89, (java.lang.Integer) (-1));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet9 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet15 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_pollFirst(intSet9, intSet15, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_pollFirst(intSet27, intSet33, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet46 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest38.FuzzTest_pollFirst(intSet46, intSet52, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_pollFirst(intSet52, intSet56, (java.lang.Integer) 10);
        fuzzTest1.FuzzTest_pollFirst(intSet27, intSet56, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet69 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet75 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzzTest61.FuzzTest_pollFirst(intSet69, intSet75, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet56, intSet69, (java.lang.Integer) 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet9 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet15 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_pollFirst(intSet9, intSet15, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_pollFirst(intSet27, intSet33, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest1.FuzzTest_pollFirst(intSet27, intSet37, (java.lang.Integer) 0);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet40 = null;
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet49 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet55 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        fuzzTest41.FuzzTest_pollFirst(intSet49, intSet55, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet60 = null;
        fuzzTest41.FuzzTest_pollFirst(intSet59, intSet60, (java.lang.Integer) 2);
        fuzzTest1.FuzzTest_pollFirst(intSet40, intSet59, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet73 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet79 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        fuzzTest65.FuzzTest_pollFirst(intSet73, intSet79, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet59, intSet79, (java.lang.Integer) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 100, 0, 100, (-1), 10 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet9 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet19 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet25 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest11.FuzzTest_pollFirst(intSet19, intSet25, (java.lang.Integer) 2);
        fuzzTest1.FuzzTest_pollFirst(intSet9, intSet19, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet39 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet45 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest31.FuzzTest_pollFirst(intSet39, intSet45, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_pollFirst(intSet19, intSet39, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet59 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet65 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        fuzzTest51.FuzzTest_pollFirst(intSet59, intSet65, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet70 = null;
        fuzzTest51.FuzzTest_pollFirst(intSet69, intSet70, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet73 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet69, intSet73, (java.lang.Integer) 100);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet85 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet91 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet91, intArray90);
        fuzzTest77.FuzzTest_pollFirst(intSet85, intSet91, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet76, intSet91, (java.lang.Integer) 10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet14, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_pollFirst(intSet27, intSet33, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_pollFirst(intSet33, intSet37, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet50 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        fuzzTest42.FuzzTest_pollFirst(intSet50, intSet56, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_pollFirst(intSet56, intSet60, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 100, 0, 100, (-1), 10 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet71 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet81 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet87 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        fuzzTest73.FuzzTest_pollFirst(intSet81, intSet87, (java.lang.Integer) 2);
        fuzzTest63.FuzzTest_pollFirst(intSet71, intSet81, (java.lang.Integer) 1);
        fuzzTest40.FuzzTest_pollFirst(intSet56, intSet81, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet33, intSet56, (java.lang.Integer) 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet10 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet16 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzzTest2.FuzzTest_pollFirst(intSet10, intSet16, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet28 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest20.FuzzTest_pollFirst(intSet28, intSet34, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet38 = null;
        fuzzTest2.FuzzTest_pollFirst(intSet28, intSet38, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_pollFirst(intSet1, intSet28, (java.lang.Integer) 10);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet43 = null;
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet44 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet43, intSet44, (java.lang.Integer) 0);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 100, 0, 100, (-1), 10 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet66 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet72 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest58.FuzzTest_pollFirst(intSet66, intSet72, (java.lang.Integer) 2);
        fuzzTest48.FuzzTest_pollFirst(intSet56, intSet66, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet47, intSet56, (java.lang.Integer) 2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet14, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_pollFirst(intSet27, intSet33, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_pollFirst(intSet18, intSet33, (java.lang.Integer) 100);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet48 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet54 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzzTest40.FuzzTest_pollFirst(intSet48, intSet54, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet67 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet73 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest59.FuzzTest_pollFirst(intSet67, intSet73, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_pollFirst(intSet73, intSet77, (java.lang.Integer) 10);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet80 = null;
        fuzzTest40.FuzzTest_pollFirst(intSet73, intSet80, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet39, intSet73, (java.lang.Integer) 10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet9 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet15 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_pollFirst(intSet9, intSet15, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest1.FuzzTest_pollFirst(intSet19, intSet20, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet31 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet37 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzzTest23.FuzzTest_pollFirst(intSet31, intSet37, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet50 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        fuzzTest42.FuzzTest_pollFirst(intSet50, intSet56, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_pollFirst(intSet56, intSet60, (java.lang.Integer) 10);
        fuzzTest1.FuzzTest_pollFirst(intSet31, intSet56, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet66 = null;
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet67 = null;
        fuzzTest65.FuzzTest_pollFirst(intSet66, intSet67, (java.lang.Integer) 1);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet70 = null;
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet71 = null;
        fuzzTest65.FuzzTest_pollFirst(intSet70, intSet71, (java.lang.Integer) 10);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet74 = null;
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet78 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        fuzzTest65.FuzzTest_pollFirst(intSet74, intSet78, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet31, intSet78, (java.lang.Integer) 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet2 = null;
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet3 = null;
        fuzzTest1.FuzzTest_pollFirst(intSet2, intSet3, (java.lang.Integer) 1);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet6 = null;
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet7 = null;
        fuzzTest1.FuzzTest_pollFirst(intSet6, intSet7, (java.lang.Integer) 10);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet10 = null;
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest1.FuzzTest_pollFirst(intSet10, intSet14, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet26 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet32 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest18.FuzzTest_pollFirst(intSet26, intSet32, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet45 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet51 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzzTest37.FuzzTest_pollFirst(intSet45, intSet51, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_pollFirst(intSet51, intSet55, (java.lang.Integer) 10);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet58 = null;
        fuzzTest18.FuzzTest_pollFirst(intSet51, intSet58, (java.lang.Integer) 1);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10, 0, 100, 10 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet66 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet68 = null;
        fuzzTest18.FuzzTest_pollFirst(intSet66, intSet68, (java.lang.Integer) 1);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet71 = null;
        fuzzTest1.FuzzTest_pollFirst(intSet66, intSet71, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet83 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet89 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        fuzzTest75.FuzzTest_pollFirst(intSet83, intSet89, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet93 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_pollFirst(intSet89, intSet93, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet66, intSet89, (java.lang.Integer) 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet14, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet26 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet32 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest18.FuzzTest_pollFirst(intSet26, intSet32, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet26, intSet36, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet47 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet53 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        fuzzTest39.FuzzTest_pollFirst(intSet47, intSet53, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet58 = null;
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest57.FuzzTest_pollFirst(intSet58, intSet59, (java.lang.Integer) 1);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet62 = null;
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet63 = null;
        fuzzTest57.FuzzTest_pollFirst(intSet62, intSet63, (java.lang.Integer) 10);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet66 = null;
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet70 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        fuzzTest57.FuzzTest_pollFirst(intSet66, intSet70, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet47, intSet70, (java.lang.Integer) 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 100, 0, 100, (-1), 10 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet18 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet24 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest10.FuzzTest_pollFirst(intSet18, intSet24, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet18, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet39 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet45 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest31.FuzzTest_pollFirst(intSet39, intSet45, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_pollFirst(intSet45, intSet49, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet61 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet67 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzzTest53.FuzzTest_pollFirst(intSet61, intSet67, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_pollFirst(intSet67, intSet71, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet45, intSet67, (java.lang.Integer) 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet10 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet16 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzzTest2.FuzzTest_pollFirst(intSet10, intSet16, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet28 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest20.FuzzTest_pollFirst(intSet28, intSet34, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet38 = null;
        fuzzTest2.FuzzTest_pollFirst(intSet28, intSet38, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_pollFirst(intSet1, intSet28, (java.lang.Integer) 10);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet43 = null;
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet44 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet43, intSet44, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet48 = null;
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest47.FuzzTest_pollFirst(intSet48, intSet49, (java.lang.Integer) 1);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet52 = null;
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet53 = null;
        fuzzTest47.FuzzTest_pollFirst(intSet52, intSet53, (java.lang.Integer) 10);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet56 = null;
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet60 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest47.FuzzTest_pollFirst(intSet56, intSet60, (java.lang.Integer) 0);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet66 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet60, intSet66, (java.lang.Integer) 1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 100, 0, 100, (-1), 10 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet18 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet24 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest10.FuzzTest_pollFirst(intSet18, intSet24, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet18, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet39 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet45 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest31.FuzzTest_pollFirst(intSet39, intSet45, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_pollFirst(intSet45, intSet49, (java.lang.Integer) 10);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet61 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet67 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzzTest53.FuzzTest_pollFirst(intSet61, intSet67, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet71 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest53.FuzzTest_pollFirst(intSet71, intSet72, (java.lang.Integer) 2);
        fuzzTest30.FuzzTest_pollFirst(intSet52, intSet71, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet85 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet91 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet91, intArray90);
        fuzzTest77.FuzzTest_pollFirst(intSet85, intSet91, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet71, intSet85, (java.lang.Integer) (-1));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 100, 0, 100, (-1), 10 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet9 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet19 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet25 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest11.FuzzTest_pollFirst(intSet19, intSet25, (java.lang.Integer) 2);
        fuzzTest1.FuzzTest_pollFirst(intSet9, intSet19, (java.lang.Integer) 1);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet19, intSet31, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet42 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet48 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        fuzzTest34.FuzzTest_pollFirst(intSet42, intSet48, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_pollFirst(intSet42, intSet52, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet64 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet70 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        fuzzTest56.FuzzTest_pollFirst(intSet64, intSet70, (java.lang.Integer) 2);
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_pollFirst(intSet70, intSet74, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet85 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_000.TreeSet<java.lang.Integer> intSet91 = new naturalness.mut_000.TreeSet<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet91, intArray90);
        fuzzTest77.FuzzTest_pollFirst(intSet85, intSet91, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet74, intSet85, (java.lang.Integer) 0);
    }
}

