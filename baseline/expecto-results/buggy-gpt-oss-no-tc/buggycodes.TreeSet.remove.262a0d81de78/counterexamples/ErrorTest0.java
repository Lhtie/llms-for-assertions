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
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet7 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (java.lang.Integer) 1, true);
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet12 = null;
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest0.FuzzTest_remove(intSet12, intSet13, (java.lang.Integer) 1, false);
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet17 = null;
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet18 = null;
        fuzzTest0.FuzzTest_remove(intSet17, intSet18, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet25 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        fuzzTest22.FuzzTest_remove(intSet25, intSet29, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet37 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet41 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzzTest34.FuzzTest_remove(intSet37, intSet41, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet49 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzzTest22.FuzzTest_remove(intSet41, intSet49, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet55 = null;
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet56 = null;
        fuzzTest54.FuzzTest_remove(intSet55, intSet56, (java.lang.Integer) 10, false);
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet60 = null;
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest54.FuzzTest_remove(intSet60, intSet61, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet68 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet72 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest65.FuzzTest_remove(intSet68, intSet72, (java.lang.Integer) 1, true);
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet77 = null;
        fuzzTest54.FuzzTest_remove(intSet72, intSet77, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet49, intSet72, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet1 = null;
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0, 100, 1, (-1), (-1) };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest0.FuzzTest_remove(intSet12, intSet14, (java.lang.Integer) 100, true);
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet18 = null;
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet19 = null;
        fuzzTest0.FuzzTest_remove(intSet18, intSet19, (java.lang.Integer) 100, false);
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet23 = null;
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest0.FuzzTest_remove(intSet23, intSet24, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet31 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet35 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        fuzzTest28.FuzzTest_remove(intSet31, intSet35, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet43 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet47 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest40.FuzzTest_remove(intSet43, intSet47, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet55 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet59 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest52.FuzzTest_remove(intSet55, intSet59, (java.lang.Integer) 1, true);
        fuzzTest28.FuzzTest_remove(intSet47, intSet59, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet70 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet74 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        fuzzTest67.FuzzTest_remove(intSet70, intSet74, (java.lang.Integer) 1, true);
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet79 = null;
        fuzzTest28.FuzzTest_remove(intSet74, intSet79, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { (-1), 1 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet86 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet88 = null;
        fuzzTest28.FuzzTest_remove(intSet86, intSet88, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 0, 0 };
        buggycodes.mut_043.TreeSet<java.lang.Integer> intSet95 = new buggycodes.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet95, intArray94);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet86, intSet95, (java.lang.Integer) 1, false);
    }
}

