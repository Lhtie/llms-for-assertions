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
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet9 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet15 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_pollFirst(intSet9, intSet15, (java.lang.Integer) 2);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet28 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet34 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest20.FuzzTest_pollFirst(intSet28, intSet34, (java.lang.Integer) 2);
        fuzzTest1.FuzzTest_pollFirst(intSet19, intSet34, (java.lang.Integer) 10);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 2, 1 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet44 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10, 10, 10 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest1.FuzzTest_pollFirst(intSet44, intSet50, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet62 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet68 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        fuzzTest54.FuzzTest_pollFirst(intSet62, intSet68, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet50, intSet68, (java.lang.Integer) 10);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet14 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet14, (java.lang.Integer) 2);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet27 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet33 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_pollFirst(intSet27, intSet33, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_pollFirst(intSet18, intSet27, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet47 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet53 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        fuzzTest39.FuzzTest_pollFirst(intSet47, intSet53, (java.lang.Integer) 2);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet66 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet72 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest58.FuzzTest_pollFirst(intSet66, intSet72, (java.lang.Integer) 2);
        fuzzTest39.FuzzTest_pollFirst(intSet57, intSet72, (java.lang.Integer) 100);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, 10, 1, (-1), 1, 0 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet85 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet72, intSet85, (java.lang.Integer) 1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet14 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet14, (java.lang.Integer) 2);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet27 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet33 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_pollFirst(intSet27, intSet33, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_pollFirst(intSet18, intSet33, (java.lang.Integer) 10);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet39 = null;
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet42 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest0.FuzzTest_pollFirst(intSet39, intSet42, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet54 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet60 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest46.FuzzTest_pollFirst(intSet54, intSet60, (java.lang.Integer) 2);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet64 = null;
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 2, 0, 1 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet69 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzzTest46.FuzzTest_pollFirst(intSet64, intSet69, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet81 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet87 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        fuzzTest73.FuzzTest_pollFirst(intSet81, intSet87, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet69, intSet87, (java.lang.Integer) 0);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet14 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet14, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet26 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet32 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest18.FuzzTest_pollFirst(intSet26, intSet32, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet44 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest36.FuzzTest_pollFirst(intSet44, intSet50, (java.lang.Integer) 2);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet63 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet69 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzzTest55.FuzzTest_pollFirst(intSet63, intSet69, (java.lang.Integer) 2);
        fuzzTest36.FuzzTest_pollFirst(intSet54, intSet63, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet26, intSet63, (java.lang.Integer) 1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet9 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet15 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_pollFirst(intSet9, intSet15, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet27 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet33 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_pollFirst(intSet27, intSet33, (java.lang.Integer) 2);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet46 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet52 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest38.FuzzTest_pollFirst(intSet46, intSet52, (java.lang.Integer) 2);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet65 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet71 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        fuzzTest57.FuzzTest_pollFirst(intSet65, intSet71, (java.lang.Integer) 2);
        fuzzTest38.FuzzTest_pollFirst(intSet56, intSet71, (java.lang.Integer) 10);
        fuzzTest19.FuzzTest_pollFirst(intSet37, intSet71, (java.lang.Integer) 10);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet79 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet80 = null;
        fuzzTest19.FuzzTest_pollFirst(intSet79, intSet80, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_pollFirst(intSet15, intSet79, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 10, 1 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet88 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet90 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet88, intSet90, (java.lang.Integer) 1);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet14 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet14, (java.lang.Integer) 2);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet27 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet33 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_pollFirst(intSet27, intSet33, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_pollFirst(intSet18, intSet33, (java.lang.Integer) 10);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet39 = null;
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet42 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest0.FuzzTest_pollFirst(intSet39, intSet42, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet47 = null;
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet56 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet62 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest48.FuzzTest_pollFirst(intSet56, intSet62, (java.lang.Integer) 2);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet75 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet81 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        fuzzTest67.FuzzTest_pollFirst(intSet75, intSet81, (java.lang.Integer) 2);
        fuzzTest48.FuzzTest_pollFirst(intSet66, intSet81, (java.lang.Integer) 10);
        fuzzTest46.FuzzTest_pollFirst(intSet47, intSet66, (java.lang.Integer) 1);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet89 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet47, intSet89, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 0 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet94 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet94, intArray93);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet96 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet94, intSet96, (java.lang.Integer) 0);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet14 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet14, (java.lang.Integer) 2);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet18 = null;
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 0, 1 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet23 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        fuzzTest0.FuzzTest_pollFirst(intSet18, intSet23, (java.lang.Integer) (-1));
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet27 = null;
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet28 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet27, intSet28, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet39 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet45 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest31.FuzzTest_pollFirst(intSet39, intSet45, (java.lang.Integer) 2);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet58 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet64 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        fuzzTest50.FuzzTest_pollFirst(intSet58, intSet64, (java.lang.Integer) 2);
        fuzzTest31.FuzzTest_pollFirst(intSet49, intSet64, (java.lang.Integer) 10);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet70 = null;
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet73 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest31.FuzzTest_pollFirst(intSet70, intSet73, (java.lang.Integer) 100);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet73, intSet77, (java.lang.Integer) 0);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet14 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet14, (java.lang.Integer) 2);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet27 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet33 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_pollFirst(intSet27, intSet33, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_pollFirst(intSet18, intSet33, (java.lang.Integer) 100);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet39 = null;
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, 0, (-1), 10 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet45 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest0.FuzzTest_pollFirst(intSet39, intSet45, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet57 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet63 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzzTest49.FuzzTest_pollFirst(intSet57, intSet63, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet75 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet81 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        fuzzTest67.FuzzTest_pollFirst(intSet75, intSet81, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet57, intSet75, (java.lang.Integer) 1);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet14 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet14, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet26 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet32 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest18.FuzzTest_pollFirst(intSet26, intSet32, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet44 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest36.FuzzTest_pollFirst(intSet44, intSet50, (java.lang.Integer) 2);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet63 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet69 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzzTest55.FuzzTest_pollFirst(intSet63, intSet69, (java.lang.Integer) 2);
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet82 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_044.TreeSet<java.lang.Integer> intSet88 = new buggycodes.mut_044.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        fuzzTest74.FuzzTest_pollFirst(intSet82, intSet88, (java.lang.Integer) 2);
        fuzzTest55.FuzzTest_pollFirst(intSet73, intSet88, (java.lang.Integer) 10);
        fuzzTest36.FuzzTest_pollFirst(intSet54, intSet88, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet26, intSet88, (java.lang.Integer) 1);
    }
}

