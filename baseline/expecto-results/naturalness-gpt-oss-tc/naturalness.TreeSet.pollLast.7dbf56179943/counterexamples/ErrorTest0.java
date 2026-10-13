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
        naturalness.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_pollLast(intSet1, intSet2, (java.lang.Integer) 1);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 2 };
        naturalness.TreeSet<java.lang.Integer> intSet7 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet17 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet23 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        fuzzTest9.FuzzTest_pollLast(intSet17, intSet23, (java.lang.Integer) 2);
        naturalness.TreeSet<java.lang.Integer> intSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet36 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet42 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest28.FuzzTest_pollLast(intSet36, intSet42, (java.lang.Integer) 2);
        fuzzTest9.FuzzTest_pollLast(intSet27, intSet42, (java.lang.Integer) 100);
        naturalness.TreeSet<java.lang.Integer> intSet48 = null;
        naturalness.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest9.FuzzTest_pollLast(intSet48, intSet49, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet54 = null;
        naturalness.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest53.FuzzTest_pollLast(intSet54, intSet55, (java.lang.Integer) 1);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet60 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        naturalness.TreeSet<java.lang.Integer> intSet62 = null;
        fuzzTest53.FuzzTest_pollLast(intSet60, intSet62, (java.lang.Integer) 10);
        fuzzTest9.FuzzTest_pollLast(intSet52, intSet60, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet7, intSet60, (java.lang.Integer) 10);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet14 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_pollLast(intSet8, intSet14, (java.lang.Integer) 2);
        naturalness.TreeSet<java.lang.Integer> intSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet27 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet33 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_pollLast(intSet27, intSet33, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_pollLast(intSet18, intSet33, (java.lang.Integer) 10);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet43 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10, 10, 10 };
        naturalness.TreeSet<java.lang.Integer> intSet49 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzzTest0.FuzzTest_pollLast(intSet43, intSet49, (java.lang.Integer) 0);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet55 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet58 = null;
        naturalness.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest57.FuzzTest_pollLast(intSet58, intSet59, (java.lang.Integer) 1);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet64 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        naturalness.TreeSet<java.lang.Integer> intSet66 = null;
        fuzzTest57.FuzzTest_pollLast(intSet64, intSet66, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet69 = null;
        naturalness.TreeSet<java.lang.Integer> intSet70 = null;
        fuzzTest57.FuzzTest_pollLast(intSet69, intSet70, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet81 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet87 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        fuzzTest73.FuzzTest_pollLast(intSet81, intSet87, (java.lang.Integer) 2);
        naturalness.TreeSet<java.lang.Integer> intSet91 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_pollLast(intSet81, intSet91, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet55, intSet91, (java.lang.Integer) 10);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet9 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet15 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_pollLast(intSet9, intSet15, (java.lang.Integer) 2);
        naturalness.TreeSet<java.lang.Integer> intSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet28 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet34 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest20.FuzzTest_pollLast(intSet28, intSet34, (java.lang.Integer) 2);
        fuzzTest1.FuzzTest_pollLast(intSet19, intSet34, (java.lang.Integer) 100);
        naturalness.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest0.FuzzTest_pollLast(intSet34, intSet40, (java.lang.Integer) 2);
        naturalness.TreeSet<java.lang.Integer> intSet43 = null;
        naturalness.TreeSet<java.lang.Integer> intSet44 = null;
        fuzzTest0.FuzzTest_pollLast(intSet43, intSet44, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet48 = null;
        naturalness.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest47.FuzzTest_pollLast(intSet48, intSet49, (java.lang.Integer) 1);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet54 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        naturalness.TreeSet<java.lang.Integer> intSet56 = null;
        fuzzTest47.FuzzTest_pollLast(intSet54, intSet56, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet59 = null;
        naturalness.TreeSet<java.lang.Integer> intSet60 = null;
        fuzzTest47.FuzzTest_pollLast(intSet59, intSet60, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet64 = null;
        naturalness.TreeSet<java.lang.Integer> intSet65 = null;
        fuzzTest63.FuzzTest_pollLast(intSet64, intSet65, (java.lang.Integer) 1);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet70 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        naturalness.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest63.FuzzTest_pollLast(intSet70, intSet72, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet76 = null;
        naturalness.TreeSet<java.lang.Integer> intSet77 = null;
        fuzzTest75.FuzzTest_pollLast(intSet76, intSet77, (java.lang.Integer) 1);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet82 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        naturalness.TreeSet<java.lang.Integer> intSet84 = null;
        fuzzTest75.FuzzTest_pollLast(intSet82, intSet84, (java.lang.Integer) 10);
        fuzzTest47.FuzzTest_pollLast(intSet70, intSet84, (java.lang.Integer) 100);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 10, 0 };
        naturalness.TreeSet<java.lang.Integer> intSet92 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet92, intArray91);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet70, intSet92, (java.lang.Integer) 100);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_pollLast(intSet1, intSet2, (java.lang.Integer) 1);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet7 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        naturalness.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest0.FuzzTest_pollLast(intSet7, intSet9, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet12 = null;
        naturalness.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest0.FuzzTest_pollLast(intSet12, intSet13, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet24 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet30 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        fuzzTest16.FuzzTest_pollLast(intSet24, intSet30, (java.lang.Integer) 2);
        naturalness.TreeSet<java.lang.Integer> intSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_pollLast(intSet24, intSet34, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet37 = null;
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet42 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest0.FuzzTest_pollLast(intSet37, intSet42, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet47 = null;
        naturalness.TreeSet<java.lang.Integer> intSet48 = null;
        fuzzTest46.FuzzTest_pollLast(intSet47, intSet48, (java.lang.Integer) 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet53 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        naturalness.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest46.FuzzTest_pollLast(intSet53, intSet55, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet66 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet72 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest58.FuzzTest_pollLast(intSet66, intSet72, (java.lang.Integer) 2);
        naturalness.TreeSet<java.lang.Integer> intSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet85 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet91 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet91, intArray90);
        fuzzTest77.FuzzTest_pollLast(intSet85, intSet91, (java.lang.Integer) 2);
        fuzzTest58.FuzzTest_pollLast(intSet76, intSet91, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet53, intSet76, (java.lang.Integer) 0);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet14 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_pollLast(intSet8, intSet14, (java.lang.Integer) 2);
        naturalness.TreeSet<java.lang.Integer> intSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet27 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet33 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_pollLast(intSet27, intSet33, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_pollLast(intSet18, intSet33, (java.lang.Integer) 10);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, 0, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet43 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet46 = null;
        naturalness.TreeSet<java.lang.Integer> intSet47 = null;
        fuzzTest45.FuzzTest_pollLast(intSet46, intSet47, (java.lang.Integer) 1);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet52 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        naturalness.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest45.FuzzTest_pollLast(intSet52, intSet54, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet57 = null;
        naturalness.TreeSet<java.lang.Integer> intSet58 = null;
        fuzzTest45.FuzzTest_pollLast(intSet57, intSet58, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.TreeSet<java.lang.Integer> intSet69 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet75 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzzTest61.FuzzTest_pollLast(intSet69, intSet75, (java.lang.Integer) 2);
        naturalness.TreeSet<java.lang.Integer> intSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_pollLast(intSet69, intSet79, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollLast(intSet43, intSet69, (java.lang.Integer) 10);
    }
}

