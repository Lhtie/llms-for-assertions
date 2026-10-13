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
        naturalness.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet11 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet17 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        fuzzTest3.FuzzTest_remove(intSet11, intSet17, (java.lang.Integer) 2, false);
        naturalness.TreeSet<java.lang.Integer> intSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet31 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet37 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzzTest23.FuzzTest_remove(intSet31, intSet37, (java.lang.Integer) 2, false);
        fuzzTest3.FuzzTest_remove(intSet22, intSet37, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 0, 0 };
        naturalness.TreeSet<java.lang.Integer> intSet48 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        fuzzTest2.FuzzTest_remove(intSet37, intSet48, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet1, intSet48, (java.lang.Integer) 2, false);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_remove(intSet3, intSet5, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10 };
        naturalness.TreeSet<java.lang.Integer> intSet13 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet23 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet29 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        fuzzTest15.FuzzTest_remove(intSet23, intSet29, (java.lang.Integer) 2, false);
        naturalness.TreeSet<java.lang.Integer> intSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet43 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet49 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzzTest35.FuzzTest_remove(intSet43, intSet49, (java.lang.Integer) 2, false);
        fuzzTest15.FuzzTest_remove(intSet34, intSet49, (java.lang.Integer) 10, true);
        fuzzTest9.FuzzTest_remove(intSet13, intSet34, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet63 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet34, intSet63, (java.lang.Integer) 100, false);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet14 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 10 };
        naturalness.TreeSet<java.lang.Integer> intSet23 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet33 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet39 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest25.FuzzTest_remove(intSet33, intSet39, (java.lang.Integer) 2, false);
        naturalness.TreeSet<java.lang.Integer> intSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet53 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet59 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest45.FuzzTest_remove(intSet53, intSet59, (java.lang.Integer) 2, false);
        fuzzTest25.FuzzTest_remove(intSet44, intSet59, (java.lang.Integer) 10, true);
        fuzzTest19.FuzzTest_remove(intSet23, intSet44, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet70 = null;
        fuzzTest0.FuzzTest_remove(intSet44, intSet70, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet74 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2 };
        naturalness.TreeSet<java.lang.Integer> intSet77 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet74, intSet77, (java.lang.Integer) 2, false);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet14 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_remove(intSet8, intSet14, (java.lang.Integer) 2, false);
        naturalness.TreeSet<java.lang.Integer> intSet19 = null;
        naturalness.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest0.FuzzTest_remove(intSet19, intSet20, (java.lang.Integer) 0, true);
        naturalness.TreeSet<java.lang.Integer> intSet24 = null;
        naturalness.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest0.FuzzTest_remove(intSet24, intSet25, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet37 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet43 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        fuzzTest29.FuzzTest_remove(intSet37, intSet43, (java.lang.Integer) 2, false);
        naturalness.TreeSet<java.lang.Integer> intSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet57 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet63 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzzTest49.FuzzTest_remove(intSet57, intSet63, (java.lang.Integer) 2, false);
        fuzzTest29.FuzzTest_remove(intSet48, intSet63, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 0, 10 };
        naturalness.TreeSet<java.lang.Integer> intSet74 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        naturalness.TreeSet<java.lang.Integer> intSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_remove(intSet74, intSet76, (java.lang.Integer) 2, true);
        naturalness.TreeSet<java.lang.Integer> intSet80 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet76, intSet80, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_remove(intSet3, intSet5, (java.lang.Integer) (-1), true);
        naturalness.TreeSet<java.lang.Integer> intSet9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest0.FuzzTest_remove(intSet9, intSet10, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet22 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet28 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        fuzzTest14.FuzzTest_remove(intSet22, intSet28, (java.lang.Integer) 2, false);
        naturalness.TreeSet<java.lang.Integer> intSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet42 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet48 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        fuzzTest34.FuzzTest_remove(intSet42, intSet48, (java.lang.Integer) 2, false);
        fuzzTest14.FuzzTest_remove(intSet33, intSet48, (java.lang.Integer) 10, true);
        naturalness.TreeSet<java.lang.Integer> intSet56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_remove(intSet56, intSet57, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet69 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet75 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzzTest61.FuzzTest_remove(intSet69, intSet75, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet57, intSet69, (java.lang.Integer) 0, false);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1 };
        naturalness.TreeSet<java.lang.Integer> intSet4 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        naturalness.TreeSet<java.lang.Integer> intSet6 = null;
        fuzzTest1.FuzzTest_remove(intSet4, intSet6, (java.lang.Integer) (-1), true);
        naturalness.TreeSet<java.lang.Integer> intSet10 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.TreeSet<java.lang.Integer> intSet11 = null;
        fuzzTest1.FuzzTest_remove(intSet10, intSet11, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 10 };
        naturalness.TreeSet<java.lang.Integer> intSet19 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet29 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet35 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        fuzzTest21.FuzzTest_remove(intSet29, intSet35, (java.lang.Integer) 2, false);
        naturalness.TreeSet<java.lang.Integer> intSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet49 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet55 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        fuzzTest41.FuzzTest_remove(intSet49, intSet55, (java.lang.Integer) 2, false);
        fuzzTest21.FuzzTest_remove(intSet40, intSet55, (java.lang.Integer) 10, true);
        fuzzTest15.FuzzTest_remove(intSet19, intSet40, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1 };
        naturalness.TreeSet<java.lang.Integer> intSet70 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        naturalness.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest67.FuzzTest_remove(intSet70, intSet72, (java.lang.Integer) (-1), true);
        fuzzTest15.FuzzTest_remove(intSet66, intSet70, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet10, intSet70, (java.lang.Integer) 1, false);
    }
}

