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
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 0, 0 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet16 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet23 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzzTest20.FuzzTest_add(intSet23, intSet27, (java.lang.Integer) 1, true);
        fuzzTest18.FuzzTest_add(intSet19, intSet23, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet42 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest35.FuzzTest_add(intSet38, intSet42, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet52 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet56 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        fuzzTest49.FuzzTest_add(intSet52, intSet56, (java.lang.Integer) 1, true);
        fuzzTest47.FuzzTest_add(intSet48, intSet52, (java.lang.Integer) 10, true);
        fuzzTest18.FuzzTest_add(intSet38, intSet48, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 100, 1 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet71 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet76 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet80 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        fuzzTest73.FuzzTest_add(intSet76, intSet80, (java.lang.Integer) 1, true);
        fuzzTest18.FuzzTest_add(intSet71, intSet80, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet16, intSet71, (java.lang.Integer) 1, false);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet17 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet21 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        fuzzTest14.FuzzTest_add(intSet17, intSet21, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_add(intSet13, intSet17, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet32 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet36 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        fuzzTest29.FuzzTest_add(intSet32, intSet36, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet46 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet50 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest43.FuzzTest_add(intSet46, intSet50, (java.lang.Integer) 1, true);
        fuzzTest41.FuzzTest_add(intSet42, intSet46, (java.lang.Integer) 10, true);
        fuzzTest12.FuzzTest_add(intSet32, intSet42, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 100, 1 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet65 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet70 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet74 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        fuzzTest67.FuzzTest_add(intSet70, intSet74, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_add(intSet65, intSet74, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet85 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet89 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        fuzzTest82.FuzzTest_add(intSet85, intSet89, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet65, intSet89, (java.lang.Integer) 1, false);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet19 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_add(intSet15, intSet19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzzTest0.FuzzTest_add(intSet19, intSet27, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet37 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet41 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzzTest34.FuzzTest_add(intSet37, intSet41, (java.lang.Integer) 1, true);
        fuzzTest32.FuzzTest_add(intSet33, intSet37, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet53 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet57 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest50.FuzzTest_add(intSet53, intSet57, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet65 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet69 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzzTest62.FuzzTest_add(intSet65, intSet69, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet77 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        fuzzTest50.FuzzTest_add(intSet69, intSet77, (java.lang.Integer) 1, true);
        fuzzTest32.FuzzTest_add(intSet49, intSet69, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest85 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet88 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet92 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet92, intArray91);
        fuzzTest85.FuzzTest_add(intSet88, intSet92, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet69, intSet92, (java.lang.Integer) 10, false);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet4 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest1.FuzzTest_add(intSet4, intSet8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet16 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_add(intSet16, intSet20, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet28 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet32 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest25.FuzzTest_add(intSet28, intSet32, (java.lang.Integer) 1, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet41 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet45 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest38.FuzzTest_add(intSet41, intSet45, (java.lang.Integer) 1, true);
        fuzzTest25.FuzzTest_add(intSet37, intSet45, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet56 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet60 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest53.FuzzTest_add(intSet56, intSet60, (java.lang.Integer) 1, true);
        fuzzTest13.FuzzTest_add(intSet45, intSet56, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet4, intSet56, (java.lang.Integer) 100, false);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (java.lang.Integer) 1, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet12 = null;
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest0.FuzzTest_add(intSet12, intSet13, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet18 = null;
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet22 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet26 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        fuzzTest19.FuzzTest_add(intSet22, intSet26, (java.lang.Integer) 1, true);
        fuzzTest17.FuzzTest_add(intSet18, intSet22, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet42 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest35.FuzzTest_add(intSet38, intSet42, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet50 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet54 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzzTest47.FuzzTest_add(intSet50, intSet54, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet62 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest35.FuzzTest_add(intSet54, intSet62, (java.lang.Integer) 1, true);
        fuzzTest17.FuzzTest_add(intSet34, intSet62, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet73 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet77 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        fuzzTest70.FuzzTest_add(intSet73, intSet77, (java.lang.Integer) 1, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet82 = null;
        fuzzTest17.FuzzTest_add(intSet73, intSet82, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 0, 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet89 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet73, intSet89, (java.lang.Integer) 100, false);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (java.lang.Integer) 1, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet18 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet22 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        fuzzTest15.FuzzTest_add(intSet18, intSet22, (java.lang.Integer) 1, true);
        fuzzTest13.FuzzTest_add(intSet14, intSet18, (java.lang.Integer) 10, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet34 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzzTest31.FuzzTest_add(intSet34, intSet38, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet46 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet50 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest43.FuzzTest_add(intSet46, intSet50, (java.lang.Integer) 1, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest31.FuzzTest_add(intSet46, intSet55, (java.lang.Integer) 0, true);
        fuzzTest13.FuzzTest_add(intSet30, intSet46, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_add(intSet12, intSet30, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet68 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet72 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest65.FuzzTest_add(intSet68, intSet72, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet80 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet84 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        fuzzTest77.FuzzTest_add(intSet80, intSet84, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet68, intSet84, (java.lang.Integer) 100, false);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet4 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet13 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        fuzzTest6.FuzzTest_add(intSet9, intSet13, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet21 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet25 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest18.FuzzTest_add(intSet21, intSet25, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet33 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet37 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzzTest30.FuzzTest_add(intSet33, intSet37, (java.lang.Integer) 1, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet46 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet50 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest43.FuzzTest_add(intSet46, intSet50, (java.lang.Integer) 1, true);
        fuzzTest30.FuzzTest_add(intSet42, intSet50, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet61 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet65 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        fuzzTest58.FuzzTest_add(intSet61, intSet65, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet73 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet77 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        fuzzTest70.FuzzTest_add(intSet73, intSet77, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet85 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        fuzzTest58.FuzzTest_add(intSet77, intSet85, (java.lang.Integer) 1, true);
        fuzzTest18.FuzzTest_add(intSet50, intSet77, (java.lang.Integer) (-1), false);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet93 = null;
        fuzzTest6.FuzzTest_add(intSet77, intSet93, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet4, intSet77, (java.lang.Integer) 1, false);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet4 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest1.FuzzTest_add(intSet4, intSet8, (java.lang.Integer) 1, true);
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet17 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet21 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        fuzzTest14.FuzzTest_add(intSet17, intSet21, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intSet13, intSet21, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10, 10, (-1) };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet33 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet37 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzzTest1.FuzzTest_add(intSet33, intSet37, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet46 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet50 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest43.FuzzTest_add(intSet46, intSet50, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet58 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet62 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest55.FuzzTest_add(intSet58, intSet62, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet70 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet74 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        fuzzTest67.FuzzTest_add(intSet70, intSet74, (java.lang.Integer) 1, true);
        fuzzTest43.FuzzTest_add(intSet62, intSet74, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, (-1) };
        buggyasrts.mut_042.TreeSet<java.lang.Integer> intSet85 = new buggyasrts.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        fuzzTest42.FuzzTest_add(intSet62, intSet85, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet33, intSet85, (java.lang.Integer) (-1), false);
    }
}

