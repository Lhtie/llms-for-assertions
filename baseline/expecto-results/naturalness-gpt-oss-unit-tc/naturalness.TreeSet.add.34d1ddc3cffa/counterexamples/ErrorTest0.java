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
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_add(intSet27, intSet33, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet46 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest38.FuzzTest_add(intSet46, intSet52, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet33, intSet52, (java.lang.Integer) 0, true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_add(intSet27, intSet33, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet46 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest38.FuzzTest_add(intSet46, intSet52, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet27, intSet52, (java.lang.Integer) 100, true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), 1, 1, 10 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet24 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet40 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest26.FuzzTest_add(intSet34, intSet40, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet54 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet60 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest46.FuzzTest_add(intSet54, intSet60, (java.lang.Integer) 2, false);
        fuzzTest26.FuzzTest_add(intSet45, intSet60, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet24, intSet45, (java.lang.Integer) 1, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet28 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest20.FuzzTest_add(intSet28, intSet34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet19, intSet34, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet58 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        fuzzTest44.FuzzTest_add(intSet52, intSet58, (java.lang.Integer) 2, false);
        fuzzTest42.FuzzTest_add(intSet43, intSet58, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 0, 100, (-1), 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet72 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet58, intSet72, (java.lang.Integer) 1, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet28 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest20.FuzzTest_add(intSet28, intSet34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet19, intSet34, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet50 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        fuzzTest42.FuzzTest_add(intSet50, intSet56, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet64 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet56, intSet64, (java.lang.Integer) 1, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_add(intSet27, intSet33, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet46 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest38.FuzzTest_add(intSet46, intSet52, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet66 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet72 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest58.FuzzTest_add(intSet66, intSet72, (java.lang.Integer) 2, false);
        fuzzTest38.FuzzTest_add(intSet57, intSet72, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet27, intSet72, (java.lang.Integer) 2, true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet28 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest20.FuzzTest_add(intSet28, intSet34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet19, intSet34, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet58 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        fuzzTest44.FuzzTest_add(intSet52, intSet58, (java.lang.Integer) 2, false);
        fuzzTest42.FuzzTest_add(intSet43, intSet58, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet74 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet80 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        fuzzTest66.FuzzTest_add(intSet74, intSet80, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet58, intSet80, (java.lang.Integer) 0, true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet11 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet17 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        fuzzTest3.FuzzTest_add(intSet11, intSet17, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_add(intSet2, intSet17, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet40 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest26.FuzzTest_add(intSet34, intSet40, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet54 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet60 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest46.FuzzTest_add(intSet54, intSet60, (java.lang.Integer) 2, false);
        fuzzTest26.FuzzTest_add(intSet45, intSet60, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, 0 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet71 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        fuzzTest25.FuzzTest_add(intSet60, intSet71, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet17, intSet71, (java.lang.Integer) 0, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet10 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet16 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzzTest2.FuzzTest_add(intSet10, intSet16, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet1, intSet16, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet40 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest26.FuzzTest_add(intSet34, intSet40, (java.lang.Integer) 2, false);
        fuzzTest24.FuzzTest_add(intSet25, intSet40, (java.lang.Integer) (-1), true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet25, intSet48, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet53 = null;
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet62 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet68 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        fuzzTest54.FuzzTest_add(intSet62, intSet68, (java.lang.Integer) 2, false);
        fuzzTest52.FuzzTest_add(intSet53, intSet68, (java.lang.Integer) (-1), true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet76 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet68, intSet76, (java.lang.Integer) 2, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet28 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest20.FuzzTest_add(intSet28, intSet34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet19, intSet34, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, (-1), 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet46 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet62 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest48.FuzzTest_add(intSet56, intSet62, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet76 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet82 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        fuzzTest68.FuzzTest_add(intSet76, intSet82, (java.lang.Integer) 2, false);
        fuzzTest48.FuzzTest_add(intSet67, intSet82, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet46, intSet82, (java.lang.Integer) 2, false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 0, 1 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet23 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet39 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest25.FuzzTest_add(intSet33, intSet39, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet53 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet59 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest45.FuzzTest_add(intSet53, intSet59, (java.lang.Integer) 2, false);
        fuzzTest25.FuzzTest_add(intSet44, intSet59, (java.lang.Integer) 10, true);
        fuzzTest19.FuzzTest_add(intSet23, intSet59, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet78 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet84 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        fuzzTest70.FuzzTest_add(intSet78, intSet84, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet59, intSet78, (java.lang.Integer) 10, false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet10 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet16 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzzTest2.FuzzTest_add(intSet10, intSet16, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet1, intSet16, (java.lang.Integer) (-1), true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet35 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet41 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzzTest27.FuzzTest_add(intSet35, intSet41, (java.lang.Integer) 2, false);
        fuzzTest25.FuzzTest_add(intSet26, intSet41, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet24, intSet41, (java.lang.Integer) 1, false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet9 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet15 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_add(intSet9, intSet15, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet9, intSet20, (java.lang.Integer) 100, false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet28 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest20.FuzzTest_add(intSet28, intSet34, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet48 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet54 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzzTest40.FuzzTest_add(intSet48, intSet54, (java.lang.Integer) 2, false);
        fuzzTest20.FuzzTest_add(intSet39, intSet54, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0, 0 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet65 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        fuzzTest19.FuzzTest_add(intSet54, intSet65, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet78 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet84 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        fuzzTest70.FuzzTest_add(intSet78, intSet84, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet54, intSet78, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_add(intSet27, intSet33, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet38 = null;
        fuzzTest0.FuzzTest_add(intSet27, intSet38, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet51 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet57 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest43.FuzzTest_add(intSet51, intSet57, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet71 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet77 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        fuzzTest63.FuzzTest_add(intSet71, intSet77, (java.lang.Integer) 2, false);
        fuzzTest43.FuzzTest_add(intSet62, intSet77, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0, 0 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet88 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        fuzzTest42.FuzzTest_add(intSet77, intSet88, (java.lang.Integer) 10, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet93 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet77, intSet93, (java.lang.Integer) 0, true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest19.FuzzTest_add(intSet27, intSet33, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet38 = null;
        fuzzTest0.FuzzTest_add(intSet27, intSet38, (java.lang.Integer) 2, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet51 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet57 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest43.FuzzTest_add(intSet51, intSet57, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet62 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(intSet62, intSet63, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet42, intSet62, (java.lang.Integer) 100, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet72 = null;
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet81 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet87 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        fuzzTest73.FuzzTest_add(intSet81, intSet87, (java.lang.Integer) 2, false);
        fuzzTest71.FuzzTest_add(intSet72, intSet87, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet70, intSet87, (java.lang.Integer) 100, true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 0, 1 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet23 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet39 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest25.FuzzTest_add(intSet33, intSet39, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet53 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet59 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest45.FuzzTest_add(intSet53, intSet59, (java.lang.Integer) 2, false);
        fuzzTest25.FuzzTest_add(intSet44, intSet59, (java.lang.Integer) 10, true);
        fuzzTest19.FuzzTest_add(intSet23, intSet59, (java.lang.Integer) 1, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet70 = null;
        fuzzTest0.FuzzTest_add(intSet23, intSet70, (java.lang.Integer) 0, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet75 = null;
        fuzzTest0.FuzzTest_add(intSet74, intSet75, (java.lang.Integer) 1, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet79 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), (-1), 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet84 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet79, intSet84, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet10 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, 1 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet16 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet26 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet32 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest18.FuzzTest_add(intSet26, intSet32, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet46 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest38.FuzzTest_add(intSet46, intSet52, (java.lang.Integer) 2, false);
        fuzzTest18.FuzzTest_add(intSet37, intSet52, (java.lang.Integer) 10, true);
        fuzzTest12.FuzzTest_add(intSet16, intSet52, (java.lang.Integer) 1, false);
        fuzzTest6.FuzzTest_add(intSet10, intSet52, (java.lang.Integer) 1, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet66 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet52, intSet66, (java.lang.Integer) 100, false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest0.FuzzTest_add(intSet8, intSet10, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet15 = null;
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet24 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet30 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        fuzzTest16.FuzzTest_add(intSet24, intSet30, (java.lang.Integer) 2, false);
        fuzzTest14.FuzzTest_add(intSet15, intSet30, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet48 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet54 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzzTest40.FuzzTest_add(intSet48, intSet54, (java.lang.Integer) 2, false);
        fuzzTest38.FuzzTest_add(intSet39, intSet54, (java.lang.Integer) (-1), true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(intSet39, intSet62, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet67 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet68 = null;
        fuzzTest66.FuzzTest_add(intSet67, intSet68, (java.lang.Integer) 1, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest14.FuzzTest_add(intSet67, intSet72, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet84 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet90 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet90, intArray89);
        fuzzTest76.FuzzTest_add(intSet84, intSet90, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet67, intSet84, (java.lang.Integer) 100, true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest6.FuzzTest_add(intSet14, intSet20, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet40 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest26.FuzzTest_add(intSet34, intSet40, (java.lang.Integer) 2, false);
        fuzzTest6.FuzzTest_add(intSet25, intSet40, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet62 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest48.FuzzTest_add(intSet56, intSet62, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet76 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet82 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        fuzzTest68.FuzzTest_add(intSet76, intSet82, (java.lang.Integer) 2, false);
        fuzzTest48.FuzzTest_add(intSet67, intSet76, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet25, intSet76, (java.lang.Integer) 1, true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest0.FuzzTest_add(intSet8, intSet10, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet22 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet28 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        fuzzTest14.FuzzTest_add(intSet22, intSet28, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet42 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet48 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        fuzzTest34.FuzzTest_add(intSet42, intSet48, (java.lang.Integer) 2, false);
        fuzzTest14.FuzzTest_add(intSet33, intSet48, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet64 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet70 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        fuzzTest56.FuzzTest_add(intSet64, intSet70, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet48, intSet70, (java.lang.Integer) 0, true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet16 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet22 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        fuzzTest8.FuzzTest_add(intSet16, intSet22, (java.lang.Integer) 2, false);
        fuzzTest6.FuzzTest_add(intSet7, intSet22, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet38 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet44 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzzTest30.FuzzTest_add(intSet38, intSet44, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet58 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet64 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        fuzzTest50.FuzzTest_add(intSet58, intSet64, (java.lang.Integer) 2, false);
        fuzzTest30.FuzzTest_add(intSet49, intSet58, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet22, intSet58, (java.lang.Integer) 0, true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest6.FuzzTest_add(intSet14, intSet20, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest0.FuzzTest_add(intSet20, intSet25, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet37 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet43 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        fuzzTest29.FuzzTest_add(intSet37, intSet43, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet58 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet64 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        fuzzTest50.FuzzTest_add(intSet58, intSet64, (java.lang.Integer) 2, false);
        fuzzTest48.FuzzTest_add(intSet49, intSet64, (java.lang.Integer) (-1), true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest29.FuzzTest_add(intSet64, intSet72, (java.lang.Integer) 1, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet76 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet64, intSet76, (java.lang.Integer) 0, true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet12 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet18 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        fuzzTest4.FuzzTest_add(intSet12, intSet18, (java.lang.Integer) 2, false);
        fuzzTest2.FuzzTest_add(intSet3, intSet18, (java.lang.Integer) (-1), true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet35 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet41 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzzTest27.FuzzTest_add(intSet35, intSet41, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet54 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet60 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest46.FuzzTest_add(intSet54, intSet60, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet65 = null;
        fuzzTest27.FuzzTest_add(intSet54, intSet65, (java.lang.Integer) 2, true);
        fuzzTest2.FuzzTest_add(intSet26, intSet54, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet1, intSet54, (java.lang.Integer) 100, true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = null;
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet17 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet23 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        fuzzTest9.FuzzTest_add(intSet17, intSet23, (java.lang.Integer) 2, false);
        fuzzTest7.FuzzTest_add(intSet8, intSet23, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet41 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet47 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest33.FuzzTest_add(intSet41, intSet47, (java.lang.Integer) 2, false);
        fuzzTest31.FuzzTest_add(intSet32, intSet47, (java.lang.Integer) (-1), true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(intSet32, intSet55, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet67 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet73 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest59.FuzzTest_add(intSet67, intSet73, (java.lang.Integer) 2, false);
        fuzzTest6.FuzzTest_add(intSet32, intSet67, (java.lang.Integer) 0, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet81 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet67, intSet81, (java.lang.Integer) 0, true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest0.FuzzTest_add(intSet8, intSet10, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 0, 1 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet30 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet36 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        fuzzTest22.FuzzTest_add(intSet30, intSet36, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet50 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet56 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        fuzzTest42.FuzzTest_add(intSet50, intSet56, (java.lang.Integer) 2, false);
        fuzzTest22.FuzzTest_add(intSet41, intSet56, (java.lang.Integer) 10, true);
        fuzzTest16.FuzzTest_add(intSet20, intSet56, (java.lang.Integer) 1, false);
        fuzzTest14.FuzzTest_add(intSet15, intSet20, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1, (-1), 2, (-1), 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet77 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet20, intSet77, (java.lang.Integer) 0, false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet15 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet21 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        fuzzTest7.FuzzTest_add(intSet15, intSet21, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet35 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet41 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzzTest27.FuzzTest_add(intSet35, intSet41, (java.lang.Integer) 2, false);
        fuzzTest7.FuzzTest_add(intSet26, intSet41, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, 0 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet52 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest6.FuzzTest_add(intSet41, intSet52, (java.lang.Integer) 10, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet57 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet41, intSet57, (java.lang.Integer) 0, true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 1, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet6 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet7 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet7, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet19 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet25 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest11.FuzzTest_add(intSet19, intSet25, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet31 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_add(intSet31, intSet32, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet19, intSet32, (java.lang.Integer) 2, false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 1 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet7 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet17 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet23 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        fuzzTest9.FuzzTest_add(intSet17, intSet23, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet37 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet43 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        fuzzTest29.FuzzTest_add(intSet37, intSet43, (java.lang.Integer) 2, false);
        fuzzTest9.FuzzTest_add(intSet28, intSet43, (java.lang.Integer) 10, true);
        fuzzTest3.FuzzTest_add(intSet7, intSet43, (java.lang.Integer) 1, false);
        fuzzTest1.FuzzTest_add(intSet2, intSet7, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet67 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet73 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest59.FuzzTest_add(intSet67, intSet73, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet78 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_add(intSet78, intSet79, (java.lang.Integer) 2, false);
        fuzzTest57.FuzzTest_add(intSet58, intSet79, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet7, intSet79, (java.lang.Integer) 100, true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 1, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet6 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet7 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet7, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet19 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet25 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest11.FuzzTest_add(intSet19, intSet25, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet30 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet25, intSet30, (java.lang.Integer) 100, false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 0, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet15 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet21 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        fuzzTest7.FuzzTest_add(intSet15, intSet21, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet35 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet41 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzzTest27.FuzzTest_add(intSet35, intSet41, (java.lang.Integer) 2, false);
        fuzzTest7.FuzzTest_add(intSet26, intSet41, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_add(intSet6, intSet41, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet60 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet66 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        fuzzTest52.FuzzTest_add(intSet60, intSet66, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet79 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet85 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        fuzzTest71.FuzzTest_add(intSet79, intSet85, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet66, intSet79, (java.lang.Integer) 100, true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest0.FuzzTest_add(intSet8, intSet10, (java.lang.Integer) 0, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest0.FuzzTest_add(intSet14, intSet15, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(intSet20, intSet21, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet29 = null;
        fuzzTest19.FuzzTest_add(intSet27, intSet29, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, (-1), 0, 10 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet38 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet41 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_add(intSet41, intSet42, (java.lang.Integer) 0, false);
        fuzzTest19.FuzzTest_add(intSet38, intSet42, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet57 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet63 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzzTest49.FuzzTest_add(intSet57, intSet63, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet77 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet83 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        fuzzTest69.FuzzTest_add(intSet77, intSet83, (java.lang.Integer) 2, false);
        fuzzTest49.FuzzTest_add(intSet68, intSet83, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet38, intSet83, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet3 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(intSet3, intSet4, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet10 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet12 = null;
        fuzzTest2.FuzzTest_add(intSet10, intSet12, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, (-1), 0, 10 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet21 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet24 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(intSet24, intSet25, (java.lang.Integer) 0, false);
        fuzzTest2.FuzzTest_add(intSet21, intSet25, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet1, intSet25, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet36 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest35.FuzzTest_add(intSet36, intSet37, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet51 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet57 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest43.FuzzTest_add(intSet51, intSet57, (java.lang.Integer) 2, false);
        fuzzTest41.FuzzTest_add(intSet42, intSet57, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet36, intSet57, (java.lang.Integer) 2, true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet28 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet34 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest20.FuzzTest_add(intSet28, intSet34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet19, intSet34, (java.lang.Integer) 10, true);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet51 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet57 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest43.FuzzTest_add(intSet51, intSet57, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_add(intSet42, intSet51, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet73 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet79 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        fuzzTest65.FuzzTest_add(intSet73, intSet79, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet84 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet73, intSet84, (java.lang.Integer) 100, false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest6.FuzzTest_add(intSet7, intSet8, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet26 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        fuzzTest12.FuzzTest_add(intSet20, intSet26, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest6.FuzzTest_add(intSet26, intSet31, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet36 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest35.FuzzTest_add(intSet36, intSet37, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet26, intSet36, (java.lang.Integer) 0, true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet16 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet22 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        fuzzTest8.FuzzTest_add(intSet16, intSet22, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet36 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet42 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest28.FuzzTest_add(intSet36, intSet42, (java.lang.Integer) 2, false);
        fuzzTest8.FuzzTest_add(intSet27, intSet42, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 0, 0 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet53 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        fuzzTest7.FuzzTest_add(intSet42, intSet53, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 0, (-1), 10, (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet63 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzzTest6.FuzzTest_add(intSet53, intSet63, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet69 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(intSet69, intSet70, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-1) };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet76 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet78 = null;
        fuzzTest68.FuzzTest_add(intSet76, intSet78, (java.lang.Integer) 0, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet82 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet83 = null;
        fuzzTest68.FuzzTest_add(intSet82, intSet83, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet63, intSet82, (java.lang.Integer) 0, false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet9 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet15 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest1.FuzzTest_add(intSet9, intSet15, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet29 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet35 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        fuzzTest21.FuzzTest_add(intSet29, intSet35, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_add(intSet20, intSet35, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0, 0 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet46 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzzTest0.FuzzTest_add(intSet35, intSet46, (java.lang.Integer) 10, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet51 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest0.FuzzTest_add(intSet51, intSet52, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet57 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet58 = null;
        fuzzTest56.FuzzTest_add(intSet57, intSet58, (java.lang.Integer) 1, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet62 = null;
        fuzzTest0.FuzzTest_add(intSet58, intSet62, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet74 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet80 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        fuzzTest66.FuzzTest_add(intSet74, intSet80, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest85 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet86 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet87 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest85.FuzzTest_add(intSet86, intSet87, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet74, intSet87, (java.lang.Integer) 100, false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet8 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet14 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet20 = null;
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(intSet20, intSet21, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet33 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet39 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest25.FuzzTest_add(intSet33, intSet39, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet53 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet59 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest45.FuzzTest_add(intSet53, intSet59, (java.lang.Integer) 2, false);
        fuzzTest25.FuzzTest_add(intSet44, intSet53, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet75 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet81 = new naturalness.mut_001.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        fuzzTest67.FuzzTest_add(intSet75, intSet81, (java.lang.Integer) 2, false);
        naturalness.mut_001.TreeSet<java.lang.Integer> intSet86 = null;
        fuzzTest25.FuzzTest_add(intSet75, intSet86, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet21, intSet75, (java.lang.Integer) 1, true);
    }
}

