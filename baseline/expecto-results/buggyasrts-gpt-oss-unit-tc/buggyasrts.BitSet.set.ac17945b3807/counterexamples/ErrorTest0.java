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
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_029.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, 10, (int) (byte) -1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_029.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, (int) (short) 1, 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) ' ', 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (-1), (int) (byte) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet8, bitSet12, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet13 = null;
        buggyasrts.mut_029.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet14, bitSet18, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet23 = null;
        buggyasrts.mut_029.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet29 = null;
        buggyasrts.mut_029.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet30, bitSet34, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet18, bitSet30, (int) 'a', (int) ' ');
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet8, bitSet12, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet17 = null;
        buggyasrts.mut_029.BitSet bitSet18 = null;
        fuzzTest16.FuzzTest_set(bitSet17, bitSet18, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet23 = null;
        buggyasrts.mut_029.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet29 = null;
        buggyasrts.mut_029.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet30, bitSet34, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet39 = null;
        buggyasrts.mut_029.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzzTest16.FuzzTest_set(bitSet34, bitSet39, 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet48 = null;
        buggyasrts.mut_029.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_set(bitSet48, bitSet49, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet54 = null;
        buggyasrts.mut_029.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_set(bitSet54, bitSet55, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_set(bitSet55, bitSet59, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet34, bitSet59, (int) (byte) 100, 10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet13 = null;
        buggyasrts.mut_029.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet14, bitSet18, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet23 = null;
        buggyasrts.mut_029.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet18, bitSet23, 0, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet33 = null;
        buggyasrts.mut_029.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_set(bitSet33, bitSet34, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet39 = null;
        buggyasrts.mut_029.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_set(bitSet40, bitSet44, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet31, bitSet40, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet13 = null;
        buggyasrts.mut_029.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet14, bitSet18, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet18, bitSet22, (int) ' ', (int) ' ');
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet13 = null;
        buggyasrts.mut_029.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet14, bitSet18, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet23 = null;
        buggyasrts.mut_029.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet18, bitSet23, 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet32 = null;
        buggyasrts.mut_029.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_set(bitSet32, bitSet33, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet38 = null;
        buggyasrts.mut_029.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_set(bitSet39, bitSet43, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet48 = null;
        buggyasrts.mut_029.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_set(bitSet48, bitSet49, (int) (byte) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet43, bitSet49, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet3 = null;
        buggyasrts.mut_029.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_set(bitSet3, bitSet4, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet9 = null;
        buggyasrts.mut_029.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_set(bitSet10, bitSet14, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet1, bitSet14, (int) (byte) 100, 1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet2 = null;
        buggyasrts.mut_029.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        buggyasrts.mut_029.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet18 = null;
        buggyasrts.mut_029.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_set(bitSet18, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet25 = null;
        buggyasrts.mut_029.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_set(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet31 = null;
        buggyasrts.mut_029.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_set(bitSet31, bitSet32, (int) (byte) 1, (int) (short) 10);
        fuzzTest23.FuzzTest_set(bitSet26, bitSet31, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet40 = null;
        buggyasrts.mut_029.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_set(bitSet40, bitSet41, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet46 = null;
        buggyasrts.mut_029.BitSet bitSet47 = null;
        fuzzTest45.FuzzTest_set(bitSet46, bitSet47, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet52 = null;
        buggyasrts.mut_029.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_set(bitSet52, bitSet53, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_set(bitSet53, bitSet57, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet62 = null;
        buggyasrts.mut_029.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_set(bitSet62, bitSet63, (int) (byte) 1, (int) (short) 10);
        fuzzTest39.FuzzTest_set(bitSet57, bitSet62, 0, (int) (short) 10);
        fuzzTest17.FuzzTest_set(bitSet26, bitSet62, (int) (byte) 1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet74 = null;
        buggyasrts.mut_029.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_set(bitSet74, bitSet75, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_set(bitSet74, bitSet79, (int) (byte) 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet16, bitSet79, (int) (byte) 100, 1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet8, bitSet12, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet17 = null;
        buggyasrts.mut_029.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_set(bitSet17, bitSet18, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet24 = null;
        buggyasrts.mut_029.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_set(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet30 = null;
        buggyasrts.mut_029.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_set(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest22.FuzzTest_set(bitSet25, bitSet30, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet39 = null;
        buggyasrts.mut_029.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_set(bitSet39, bitSet40, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet45 = null;
        buggyasrts.mut_029.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_set(bitSet45, bitSet46, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet51 = null;
        buggyasrts.mut_029.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_set(bitSet51, bitSet52, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_set(bitSet52, bitSet56, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet61 = null;
        buggyasrts.mut_029.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_set(bitSet61, bitSet62, (int) (byte) 1, (int) (short) 10);
        fuzzTest38.FuzzTest_set(bitSet56, bitSet61, 0, (int) (short) 10);
        fuzzTest16.FuzzTest_set(bitSet25, bitSet61, (int) (byte) 1, (int) (short) -1);
        buggyasrts.mut_029.BitSet bitSet72 = null;
        fuzzTest0.FuzzTest_set(bitSet61, bitSet72, (int) (byte) 0, (int) ' ');
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet77 = null;
        buggyasrts.mut_029.BitSet bitSet78 = null;
        fuzzTest76.FuzzTest_set(bitSet77, bitSet78, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet83 = null;
        buggyasrts.mut_029.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_set(bitSet83, bitSet84, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_set(bitSet84, bitSet88, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet88, bitSet92, (int) '4', (-1));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet13 = null;
        buggyasrts.mut_029.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet20 = null;
        buggyasrts.mut_029.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_set(bitSet20, bitSet21, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet26 = null;
        buggyasrts.mut_029.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_set(bitSet26, bitSet27, (int) (byte) 1, (int) (short) 10);
        fuzzTest18.FuzzTest_set(bitSet21, bitSet26, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet35 = null;
        buggyasrts.mut_029.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_set(bitSet35, bitSet36, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet41 = null;
        buggyasrts.mut_029.BitSet bitSet42 = null;
        fuzzTest40.FuzzTest_set(bitSet41, bitSet42, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet47 = null;
        buggyasrts.mut_029.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_set(bitSet47, bitSet48, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_set(bitSet48, bitSet52, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet57 = null;
        buggyasrts.mut_029.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_set(bitSet57, bitSet58, (int) (byte) 1, (int) (short) 10);
        fuzzTest34.FuzzTest_set(bitSet52, bitSet57, 0, (int) (short) 10);
        fuzzTest12.FuzzTest_set(bitSet21, bitSet57, (int) (byte) 1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet8, bitSet21, (int) '4', 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet15 = null;
        buggyasrts.mut_029.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet21 = null;
        buggyasrts.mut_029.BitSet bitSet22 = null;
        fuzzTest20.FuzzTest_set(bitSet21, bitSet22, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet27 = null;
        buggyasrts.mut_029.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_set(bitSet27, bitSet28, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_set(bitSet28, bitSet32, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet37 = null;
        buggyasrts.mut_029.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_set(bitSet37, bitSet38, (int) (byte) 1, (int) (short) 10);
        fuzzTest14.FuzzTest_set(bitSet32, bitSet37, 0, (int) (short) 10);
        fuzzTest7.FuzzTest_set(bitSet13, bitSet37, 2, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet49 = null;
        buggyasrts.mut_029.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_set(bitSet49, bitSet50, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet49, bitSet54, 0, (int) (short) 0);
        fuzzTest0.FuzzTest_set(bitSet6, bitSet49, (int) (byte) 0, 2);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet62 = null;
        buggyasrts.mut_029.BitSet bitSet63 = null;
        fuzzTest61.FuzzTest_set(bitSet62, bitSet63, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet68 = null;
        buggyasrts.mut_029.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_set(bitSet68, bitSet69, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_set(bitSet69, bitSet73, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet73, bitSet77, (-1), 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet13 = null;
        buggyasrts.mut_029.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet19 = null;
        buggyasrts.mut_029.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_set(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet20, bitSet24, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet29 = null;
        buggyasrts.mut_029.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_set(bitSet24, bitSet29, 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet38 = null;
        buggyasrts.mut_029.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet29, bitSet39, (int) '#', 2);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet47 = null;
        buggyasrts.mut_029.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_set(bitSet47, bitSet48, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet53 = null;
        buggyasrts.mut_029.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet59 = null;
        buggyasrts.mut_029.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_set(bitSet59, bitSet60, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet65 = null;
        buggyasrts.mut_029.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet65, bitSet66, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(bitSet66, bitSet70, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet75 = null;
        buggyasrts.mut_029.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_set(bitSet75, bitSet76, (int) (byte) 1, (int) (short) 10);
        fuzzTest52.FuzzTest_set(bitSet70, bitSet75, 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet84 = null;
        buggyasrts.mut_029.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest83.FuzzTest_set(bitSet84, bitSet85, (int) (byte) 1, (int) (short) 10);
        fuzzTest46.FuzzTest_set(bitSet75, bitSet85, (int) '#', 2);
        buggyasrts.mut_029.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet85, bitSet92, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet4 = null;
        buggyasrts.mut_029.BitSet bitSet5 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_set(bitSet4, bitSet5, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet10 = null;
        buggyasrts.mut_029.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_set(bitSet10, bitSet11, (int) (byte) 1, (int) (short) 10);
        fuzzTest2.FuzzTest_set(bitSet5, bitSet10, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet19 = null;
        buggyasrts.mut_029.BitSet bitSet20 = null;
        fuzzTest18.FuzzTest_set(bitSet19, bitSet20, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet25 = null;
        buggyasrts.mut_029.BitSet bitSet26 = null;
        fuzzTest24.FuzzTest_set(bitSet25, bitSet26, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet31 = null;
        buggyasrts.mut_029.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_set(bitSet31, bitSet32, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_set(bitSet32, bitSet36, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet41 = null;
        buggyasrts.mut_029.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_set(bitSet41, bitSet42, (int) (byte) 1, (int) (short) 10);
        fuzzTest18.FuzzTest_set(bitSet36, bitSet41, 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet51 = null;
        buggyasrts.mut_029.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_set(bitSet51, bitSet52, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet57 = null;
        buggyasrts.mut_029.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_set(bitSet57, bitSet58, (int) (byte) 1, (int) (short) 10);
        fuzzTest49.FuzzTest_set(bitSet52, bitSet57, (int) (byte) 10, (int) '#');
        fuzzTest2.FuzzTest_set(bitSet36, bitSet52, (int) (byte) 0, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet1, bitSet52, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet13 = null;
        buggyasrts.mut_029.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet19 = null;
        buggyasrts.mut_029.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_set(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet20, bitSet24, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet29 = null;
        buggyasrts.mut_029.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_set(bitSet24, bitSet29, 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet38 = null;
        buggyasrts.mut_029.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet29, bitSet39, (int) '#', 2);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet47 = null;
        buggyasrts.mut_029.BitSet bitSet48 = null;
        fuzzTest46.FuzzTest_set(bitSet47, bitSet48, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet53 = null;
        buggyasrts.mut_029.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_set(bitSet54, bitSet58, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet63 = null;
        buggyasrts.mut_029.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_set(bitSet63, bitSet64, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet69 = null;
        buggyasrts.mut_029.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_set(bitSet69, bitSet70, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_set(bitSet70, bitSet74, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet58, bitSet70, (int) (short) -1, 10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet2 = null;
        buggyasrts.mut_029.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet17 = null;
        buggyasrts.mut_029.BitSet bitSet18 = null;
        fuzzTest16.FuzzTest_set(bitSet17, bitSet18, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet23 = null;
        buggyasrts.mut_029.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet29 = null;
        buggyasrts.mut_029.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet30, bitSet34, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet39 = null;
        buggyasrts.mut_029.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzzTest16.FuzzTest_set(bitSet34, bitSet39, 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet49 = null;
        buggyasrts.mut_029.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_set(bitSet49, bitSet50, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet55 = null;
        buggyasrts.mut_029.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_set(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzzTest47.FuzzTest_set(bitSet50, bitSet55, (int) (byte) 10, (int) '#');
        fuzzTest0.FuzzTest_set(bitSet34, bitSet50, (int) (byte) 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet67 = null;
        buggyasrts.mut_029.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_set(bitSet67, bitSet68, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet73 = null;
        buggyasrts.mut_029.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_set(bitSet73, bitSet74, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet79 = null;
        buggyasrts.mut_029.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_set(bitSet79, bitSet80, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_set(bitSet80, bitSet84, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet68, bitSet80, (int) (byte) 1, 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet13 = null;
        buggyasrts.mut_029.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet19 = null;
        buggyasrts.mut_029.BitSet bitSet20 = null;
        fuzzTest18.FuzzTest_set(bitSet19, bitSet20, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet25 = null;
        buggyasrts.mut_029.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_set(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_set(bitSet26, bitSet30, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet35 = null;
        buggyasrts.mut_029.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_set(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        fuzzTest12.FuzzTest_set(bitSet30, bitSet35, 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet44 = null;
        buggyasrts.mut_029.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_set(bitSet44, bitSet45, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_set(bitSet35, bitSet45, (int) '#', 2);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet53 = null;
        buggyasrts.mut_029.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, (int) (byte) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet45, bitSet54, (int) 'a', 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet13 = null;
        buggyasrts.mut_029.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet20 = null;
        buggyasrts.mut_029.BitSet bitSet21 = null;
        fuzzTest19.FuzzTest_set(bitSet20, bitSet21, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet26 = null;
        buggyasrts.mut_029.BitSet bitSet27 = null;
        fuzzTest25.FuzzTest_set(bitSet26, bitSet27, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet32 = null;
        buggyasrts.mut_029.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_set(bitSet32, bitSet33, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_set(bitSet33, bitSet37, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet42 = null;
        buggyasrts.mut_029.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, (int) (byte) 1, (int) (short) 10);
        fuzzTest19.FuzzTest_set(bitSet37, bitSet42, 0, (int) (short) 10);
        fuzzTest12.FuzzTest_set(bitSet18, bitSet42, 2, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet54 = null;
        buggyasrts.mut_029.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_set(bitSet54, bitSet55, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet60 = null;
        buggyasrts.mut_029.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_set(bitSet60, bitSet61, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_set(bitSet61, bitSet65, 0, (int) (byte) 1);
        fuzzTest6.FuzzTest_set(bitSet42, bitSet65, (int) ' ', (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet73 = null;
        buggyasrts.mut_029.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_set(bitSet73, bitSet74, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet79 = null;
        buggyasrts.mut_029.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_set(bitSet79, bitSet80, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_set(bitSet80, bitSet84, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet65, bitSet84, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet14 = null;
        buggyasrts.mut_029.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet20 = null;
        buggyasrts.mut_029.BitSet bitSet21 = null;
        fuzzTest19.FuzzTest_set(bitSet20, bitSet21, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet26 = null;
        buggyasrts.mut_029.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_set(bitSet26, bitSet27, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_set(bitSet27, bitSet31, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet36 = null;
        buggyasrts.mut_029.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_set(bitSet36, bitSet37, (int) (byte) 1, (int) (short) 10);
        fuzzTest13.FuzzTest_set(bitSet31, bitSet36, 0, (int) (short) 10);
        fuzzTest6.FuzzTest_set(bitSet12, bitSet36, 2, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet48 = null;
        buggyasrts.mut_029.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_set(bitSet48, bitSet49, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet48, bitSet53, 0, (int) (short) 0);
        buggyasrts.mut_029.BitSet bitSet57 = null;
        fuzzTest0.FuzzTest_set(bitSet48, bitSet57, (int) (short) 10, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet63 = null;
        buggyasrts.mut_029.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_set(bitSet63, bitSet64, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet69 = null;
        buggyasrts.mut_029.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_set(bitSet69, bitSet70, (int) (byte) 1, (int) (short) 10);
        fuzzTest61.FuzzTest_set(bitSet64, bitSet69, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet78 = null;
        buggyasrts.mut_029.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_set(bitSet78, bitSet79, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet84 = null;
        buggyasrts.mut_029.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest83.FuzzTest_set(bitSet84, bitSet85, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_set(bitSet85, bitSet89, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet64, bitSet85, 10, 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet2 = null;
        buggyasrts.mut_029.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet9, bitSet13, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_set(bitSet9, bitSet17, (-1), (int) (short) -1);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet22 = null;
        buggyasrts.mut_029.BitSet bitSet23 = null;
        fuzzTest21.FuzzTest_set(bitSet22, bitSet23, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet28 = null;
        buggyasrts.mut_029.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet29, bitSet33, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet38 = null;
        buggyasrts.mut_029.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet44 = null;
        buggyasrts.mut_029.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_set(bitSet44, bitSet45, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet50 = null;
        buggyasrts.mut_029.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_set(bitSet50, bitSet51, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet56 = null;
        buggyasrts.mut_029.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_set(bitSet56, bitSet57, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_set(bitSet57, bitSet61, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet66 = null;
        buggyasrts.mut_029.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_set(bitSet66, bitSet67, (int) (byte) 1, (int) (short) 10);
        fuzzTest43.FuzzTest_set(bitSet61, bitSet66, 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet75 = null;
        buggyasrts.mut_029.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_set(bitSet75, bitSet76, (int) (byte) 1, (int) (short) 10);
        fuzzTest37.FuzzTest_set(bitSet66, bitSet76, (int) '#', 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet29, bitSet76, (int) (short) 10, (int) '4');
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet9 = null;
        buggyasrts.mut_029.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet15 = null;
        buggyasrts.mut_029.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet16, bitSet20, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet24 = null;
        fuzzTest7.FuzzTest_set(bitSet16, bitSet24, (-1), (int) (short) -1);
        fuzzTest0.FuzzTest_set(bitSet6, bitSet24, (int) (byte) 0, (-1));
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet32 = null;
        buggyasrts.mut_029.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_set(bitSet32, bitSet33, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet38 = null;
        buggyasrts.mut_029.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_set(bitSet39, bitSet43, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet48 = null;
        buggyasrts.mut_029.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_set(bitSet48, bitSet49, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet54 = null;
        buggyasrts.mut_029.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_set(bitSet54, bitSet55, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_set(bitSet55, bitSet59, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet39, bitSet59, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet14 = null;
        buggyasrts.mut_029.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet20 = null;
        buggyasrts.mut_029.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_set(bitSet20, bitSet21, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet21, bitSet25, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet30 = null;
        buggyasrts.mut_029.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_set(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest7.FuzzTest_set(bitSet25, bitSet30, 0, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet6, bitSet30, 2, (int) (byte) 10);
        buggyasrts.mut_029.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet43 = null;
        buggyasrts.mut_029.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_set(bitSet43, bitSet44, (int) (byte) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet41, bitSet44, (int) '#', (int) (short) 1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet13 = null;
        buggyasrts.mut_029.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet14, bitSet18, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet23 = null;
        buggyasrts.mut_029.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet18, bitSet23, 0, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet33 = null;
        buggyasrts.mut_029.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_set(bitSet33, bitSet34, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet39 = null;
        buggyasrts.mut_029.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_set(bitSet39, bitSet40, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet45 = null;
        buggyasrts.mut_029.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_set(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet46, bitSet50, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet55 = null;
        buggyasrts.mut_029.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_set(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzzTest32.FuzzTest_set(bitSet50, bitSet55, 0, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet31, bitSet50, (int) (short) 100, 2);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet13 = null;
        buggyasrts.mut_029.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet19 = null;
        buggyasrts.mut_029.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_set(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet20, bitSet24, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet29 = null;
        buggyasrts.mut_029.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_set(bitSet24, bitSet29, 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet38 = null;
        buggyasrts.mut_029.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet29, bitSet39, (int) '#', 2);
        buggyasrts.mut_029.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet49 = null;
        buggyasrts.mut_029.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_set(bitSet49, bitSet50, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet55 = null;
        buggyasrts.mut_029.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_set(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_set(bitSet56, bitSet60, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet64 = null;
        fuzzTest47.FuzzTest_set(bitSet56, bitSet64, (-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet46, bitSet56, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet13 = null;
        buggyasrts.mut_029.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet14, bitSet18, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet23 = null;
        buggyasrts.mut_029.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet18, bitSet23, 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet32 = null;
        buggyasrts.mut_029.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_set(bitSet32, bitSet33, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet39 = null;
        buggyasrts.mut_029.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_set(bitSet39, bitSet40, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet45 = null;
        buggyasrts.mut_029.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_set(bitSet45, bitSet46, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet51 = null;
        buggyasrts.mut_029.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_set(bitSet51, bitSet52, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_set(bitSet52, bitSet56, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet61 = null;
        buggyasrts.mut_029.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_set(bitSet61, bitSet62, (int) (byte) 1, (int) (short) 10);
        fuzzTest38.FuzzTest_set(bitSet56, bitSet61, 0, (int) (short) 10);
        fuzzTest31.FuzzTest_set(bitSet37, bitSet61, 2, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet73 = null;
        buggyasrts.mut_029.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_set(bitSet73, bitSet74, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet79 = null;
        buggyasrts.mut_029.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_set(bitSet79, bitSet80, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_set(bitSet80, bitSet84, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet37, bitSet80, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet14 = null;
        buggyasrts.mut_029.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet20 = null;
        buggyasrts.mut_029.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_set(bitSet20, bitSet21, (int) (byte) 1, (int) (short) 10);
        fuzzTest12.FuzzTest_set(bitSet15, bitSet20, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet29 = null;
        buggyasrts.mut_029.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet36 = null;
        buggyasrts.mut_029.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_set(bitSet36, bitSet37, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet42 = null;
        buggyasrts.mut_029.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, (int) (byte) 1, (int) (short) 10);
        fuzzTest34.FuzzTest_set(bitSet37, bitSet42, (int) (byte) 10, (int) '#');
        fuzzTest12.FuzzTest_set(bitSet29, bitSet42, 100, (int) (short) 0);
        buggyasrts.mut_029.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet55 = null;
        buggyasrts.mut_029.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_set(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzzTest12.FuzzTest_set(bitSet53, bitSet56, 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet8, bitSet53, (-1), 100);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet8, bitSet12, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet17 = null;
        buggyasrts.mut_029.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_set(bitSet17, bitSet18, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet23 = null;
        buggyasrts.mut_029.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet29 = null;
        buggyasrts.mut_029.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet35 = null;
        buggyasrts.mut_029.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_set(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet36, bitSet40, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet45 = null;
        buggyasrts.mut_029.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_set(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzzTest22.FuzzTest_set(bitSet40, bitSet45, 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet54 = null;
        buggyasrts.mut_029.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_set(bitSet54, bitSet55, (int) (byte) 1, (int) (short) 10);
        fuzzTest16.FuzzTest_set(bitSet45, bitSet55, (int) '#', 2);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet63 = null;
        buggyasrts.mut_029.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_set(bitSet63, bitSet64, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_set(bitSet63, bitSet68, 1, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet68, bitSet72, (int) 'a', (int) '#');
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet6 = null;
        buggyasrts.mut_029.BitSet bitSet7 = null;
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, (int) (byte) 1, (int) '#');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet12 = null;
        buggyasrts.mut_029.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_set(bitSet12, bitSet13, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet19 = null;
        buggyasrts.mut_029.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_set(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet26 = null;
        buggyasrts.mut_029.BitSet bitSet27 = null;
        fuzzTest25.FuzzTest_set(bitSet26, bitSet27, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet32 = null;
        buggyasrts.mut_029.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_set(bitSet32, bitSet33, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet38 = null;
        buggyasrts.mut_029.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_set(bitSet39, bitSet43, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet48 = null;
        buggyasrts.mut_029.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_set(bitSet48, bitSet49, (int) (byte) 1, (int) (short) 10);
        fuzzTest25.FuzzTest_set(bitSet43, bitSet48, 0, (int) (short) 10);
        fuzzTest18.FuzzTest_set(bitSet24, bitSet48, 2, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet60 = null;
        buggyasrts.mut_029.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_set(bitSet60, bitSet61, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_set(bitSet60, bitSet65, 0, (int) (short) 0);
        fuzzTest11.FuzzTest_set(bitSet17, bitSet60, (int) (byte) 0, 2);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet73 = null;
        buggyasrts.mut_029.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_set(bitSet73, bitSet74, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet79 = null;
        buggyasrts.mut_029.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_set(bitSet79, bitSet80, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_set(bitSet80, bitSet84, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet17, bitSet84, (int) ' ', 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet14 = null;
        buggyasrts.mut_029.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet20 = null;
        buggyasrts.mut_029.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_set(bitSet20, bitSet21, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet21, bitSet25, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet30 = null;
        buggyasrts.mut_029.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_set(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest7.FuzzTest_set(bitSet25, bitSet30, 0, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet6, bitSet30, 2, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet42 = null;
        buggyasrts.mut_029.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet48 = null;
        buggyasrts.mut_029.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_set(bitSet48, bitSet49, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet49, bitSet53, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet59 = null;
        buggyasrts.mut_029.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(bitSet59, bitSet60, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet65 = null;
        buggyasrts.mut_029.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet65, bitSet66, (int) (byte) 1, (int) (short) 10);
        fuzzTest57.FuzzTest_set(bitSet60, bitSet65, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet74 = null;
        buggyasrts.mut_029.BitSet bitSet75 = null;
        fuzzTest73.FuzzTest_set(bitSet74, bitSet75, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet80 = null;
        buggyasrts.mut_029.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_set(bitSet80, bitSet81, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_set(bitSet81, bitSet85, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet89 = null;
        fuzzTest57.FuzzTest_set(bitSet85, bitSet89, (int) (byte) -1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet49, bitSet85, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet9 = null;
        buggyasrts.mut_029.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet15 = null;
        buggyasrts.mut_029.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet16, bitSet20, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet24 = null;
        fuzzTest7.FuzzTest_set(bitSet16, bitSet24, (-1), (int) (short) -1);
        fuzzTest0.FuzzTest_set(bitSet6, bitSet24, (int) (byte) 0, (-1));
        buggyasrts.mut_029.BitSet bitSet31 = null;
        buggyasrts.mut_029.BitSet bitSet32 = null;
        fuzzTest0.FuzzTest_set(bitSet31, bitSet32, (int) '#', (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet38 = null;
        buggyasrts.mut_029.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet36, bitSet38, (int) (byte) -1, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet47 = null;
        buggyasrts.mut_029.BitSet bitSet48 = null;
        fuzzTest46.FuzzTest_set(bitSet47, bitSet48, 0, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet55 = null;
        buggyasrts.mut_029.BitSet bitSet56 = null;
        fuzzTest54.FuzzTest_set(bitSet55, bitSet56, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet61 = null;
        buggyasrts.mut_029.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_set(bitSet61, bitSet62, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_set(bitSet62, bitSet66, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet70 = null;
        fuzzTest53.FuzzTest_set(bitSet62, bitSet70, (-1), (int) (short) -1);
        fuzzTest46.FuzzTest_set(bitSet52, bitSet70, (int) (byte) 0, (-1));
        buggyasrts.mut_029.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet52, bitSet77, (int) '#', (int) (short) -1);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet6 = null;
        buggyasrts.mut_029.BitSet bitSet7 = null;
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, (int) (byte) 1, (int) '#');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet13 = null;
        buggyasrts.mut_029.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet19 = null;
        buggyasrts.mut_029.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_set(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        fuzzTest11.FuzzTest_set(bitSet14, bitSet19, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet28 = null;
        buggyasrts.mut_029.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet35 = null;
        buggyasrts.mut_029.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_set(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet41 = null;
        buggyasrts.mut_029.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_set(bitSet41, bitSet42, (int) (byte) 1, (int) (short) 10);
        fuzzTest33.FuzzTest_set(bitSet36, bitSet41, (int) (byte) 10, (int) '#');
        fuzzTest11.FuzzTest_set(bitSet28, bitSet41, 100, (int) (short) 0);
        buggyasrts.mut_029.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet54 = null;
        buggyasrts.mut_029.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_set(bitSet54, bitSet55, (int) (byte) 1, (int) (short) 10);
        fuzzTest11.FuzzTest_set(bitSet52, bitSet55, 0, (int) '#');
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet63 = null;
        buggyasrts.mut_029.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_set(bitSet63, bitSet64, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet69 = null;
        buggyasrts.mut_029.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_set(bitSet69, bitSet70, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_set(bitSet70, bitSet74, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet55, bitSet70, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet10 = null;
        buggyasrts.mut_029.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_set(bitSet10, bitSet11, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet16 = null;
        buggyasrts.mut_029.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_set(bitSet16, bitSet17, (int) (byte) 1, (int) (short) 10);
        fuzzTest8.FuzzTest_set(bitSet11, bitSet16, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet26 = null;
        buggyasrts.mut_029.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_set(bitSet26, bitSet27, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet32 = null;
        buggyasrts.mut_029.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_set(bitSet32, bitSet33, (int) (byte) 1, (int) (short) 10);
        fuzzTest24.FuzzTest_set(bitSet27, bitSet32, (int) (byte) 10, (int) '#');
        fuzzTest7.FuzzTest_set(bitSet16, bitSet32, (int) 'a', (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet46 = null;
        buggyasrts.mut_029.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_set(bitSet46, bitSet47, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet52 = null;
        buggyasrts.mut_029.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_set(bitSet52, bitSet53, (int) (byte) 1, (int) (short) 10);
        fuzzTest44.FuzzTest_set(bitSet47, bitSet52, (int) (byte) 10, (int) '#');
        fuzzTest7.FuzzTest_set(bitSet43, bitSet47, (int) (byte) 100, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet6, bitSet47, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet2 = null;
        buggyasrts.mut_029.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet17 = null;
        buggyasrts.mut_029.BitSet bitSet18 = null;
        fuzzTest16.FuzzTest_set(bitSet17, bitSet18, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet23 = null;
        buggyasrts.mut_029.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_set(bitSet24, bitSet28, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet34 = null;
        buggyasrts.mut_029.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_set(bitSet34, bitSet35, (int) (byte) 1, (int) (short) 10);
        fuzzTest16.FuzzTest_set(bitSet32, bitSet35, (int) '#', (int) (short) 100);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet43 = null;
        buggyasrts.mut_029.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_set(bitSet43, bitSet44, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet49 = null;
        buggyasrts.mut_029.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_set(bitSet49, bitSet50, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet55 = null;
        buggyasrts.mut_029.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_set(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_set(bitSet56, bitSet60, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet65 = null;
        buggyasrts.mut_029.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet65, bitSet66, (int) (byte) 1, (int) (short) 10);
        fuzzTest42.FuzzTest_set(bitSet60, bitSet65, 0, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet73 = null;
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet75 = null;
        buggyasrts.mut_029.BitSet bitSet76 = null;
        fuzzTest74.FuzzTest_set(bitSet75, bitSet76, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet81 = null;
        buggyasrts.mut_029.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest80.FuzzTest_set(bitSet81, bitSet82, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_set(bitSet82, bitSet86, 0, (int) (byte) 1);
        fuzzTest42.FuzzTest_set(bitSet73, bitSet86, (int) (byte) 100, 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet35, bitSet86, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet14 = null;
        buggyasrts.mut_029.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet20 = null;
        buggyasrts.mut_029.BitSet bitSet21 = null;
        fuzzTest19.FuzzTest_set(bitSet20, bitSet21, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet26 = null;
        buggyasrts.mut_029.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_set(bitSet26, bitSet27, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_set(bitSet27, bitSet31, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet36 = null;
        buggyasrts.mut_029.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_set(bitSet36, bitSet37, (int) (byte) 1, (int) (short) 10);
        fuzzTest13.FuzzTest_set(bitSet31, bitSet36, 0, (int) (short) 10);
        fuzzTest6.FuzzTest_set(bitSet12, bitSet36, 2, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet48 = null;
        buggyasrts.mut_029.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_set(bitSet48, bitSet49, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet48, bitSet53, 0, (int) (short) 0);
        buggyasrts.mut_029.BitSet bitSet57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet59 = null;
        buggyasrts.mut_029.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_set(bitSet59, bitSet60, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet65 = null;
        buggyasrts.mut_029.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet65, bitSet66, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(bitSet66, bitSet70, 0, (int) (byte) 1);
        fuzzTest6.FuzzTest_set(bitSet57, bitSet66, 0, (int) 'a');
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet78 = null;
        buggyasrts.mut_029.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_set(bitSet78, bitSet79, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet84 = null;
        buggyasrts.mut_029.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest83.FuzzTest_set(bitSet84, bitSet85, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_set(bitSet85, bitSet89, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet66, bitSet85, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet14 = null;
        buggyasrts.mut_029.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_set(bitSet9, bitSet14, (int) (byte) 10, (int) '#');
        buggyasrts.mut_029.BitSet bitSet22 = null;
        buggyasrts.mut_029.BitSet bitSet23 = null;
        fuzzTest6.FuzzTest_set(bitSet22, bitSet23, (-1), (int) '4');
        buggyasrts.mut_029.BitSet bitSet27 = null;
        buggyasrts.mut_029.BitSet bitSet28 = null;
        fuzzTest6.FuzzTest_set(bitSet27, bitSet28, (int) (short) 10, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet33 = null;
        buggyasrts.mut_029.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_set(bitSet33, bitSet34, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet39 = null;
        buggyasrts.mut_029.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_set(bitSet40, bitSet44, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet49 = null;
        buggyasrts.mut_029.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_set(bitSet49, bitSet50, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet55 = null;
        buggyasrts.mut_029.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_set(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_set(bitSet56, bitSet60, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet64 = null;
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet66 = null;
        buggyasrts.mut_029.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_set(bitSet66, bitSet67, (int) (byte) 1, (int) (short) 10);
        fuzzTest48.FuzzTest_set(bitSet64, bitSet67, (int) '#', (int) (short) 100);
        fuzzTest6.FuzzTest_set(bitSet40, bitSet64, (int) (byte) 100, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet78 = null;
        buggyasrts.mut_029.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_set(bitSet78, bitSet79, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet84 = null;
        buggyasrts.mut_029.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest83.FuzzTest_set(bitSet84, bitSet85, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_set(bitSet85, bitSet89, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet40, bitSet85, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet2 = null;
        buggyasrts.mut_029.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = null;
        fuzzTest1.FuzzTest_set(bitSet7, bitSet8, (int) (byte) 1, (int) '#');
        buggyasrts.mut_029.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet15 = null;
        buggyasrts.mut_029.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet21 = null;
        buggyasrts.mut_029.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_set(bitSet21, bitSet22, (int) (byte) 1, (int) (short) 10);
        fuzzTest13.FuzzTest_set(bitSet16, bitSet21, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet30 = null;
        buggyasrts.mut_029.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_set(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet37 = null;
        buggyasrts.mut_029.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_set(bitSet37, bitSet38, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet43 = null;
        buggyasrts.mut_029.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_set(bitSet43, bitSet44, (int) (byte) 1, (int) (short) 10);
        fuzzTest35.FuzzTest_set(bitSet38, bitSet43, (int) (byte) 10, (int) '#');
        fuzzTest13.FuzzTest_set(bitSet30, bitSet43, 100, (int) (short) 0);
        buggyasrts.mut_029.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_029.BitSet bitSet55 = null;
        fuzzTest13.FuzzTest_set(bitSet54, bitSet55, (int) (byte) 1, (-1));
        fuzzTest1.FuzzTest_set(bitSet12, bitSet54, (int) (short) 1, (int) '#');
        buggyasrts.mut_029.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet54, bitSet62, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet4 = null;
        buggyasrts.mut_029.BitSet bitSet5 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_set(bitSet4, bitSet5, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet10 = null;
        buggyasrts.mut_029.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_set(bitSet10, bitSet11, (int) (byte) 1, (int) (short) 10);
        fuzzTest2.FuzzTest_set(bitSet5, bitSet10, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet20 = null;
        buggyasrts.mut_029.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_set(bitSet20, bitSet21, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet26 = null;
        buggyasrts.mut_029.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_set(bitSet26, bitSet27, (int) (byte) 1, (int) (short) 10);
        fuzzTest18.FuzzTest_set(bitSet21, bitSet26, (int) (byte) 10, (int) '#');
        fuzzTest1.FuzzTest_set(bitSet10, bitSet26, (int) 'a', (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet40 = null;
        buggyasrts.mut_029.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_set(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet46 = null;
        buggyasrts.mut_029.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_set(bitSet46, bitSet47, (int) (byte) 1, (int) (short) 10);
        fuzzTest38.FuzzTest_set(bitSet41, bitSet46, (int) (byte) 10, (int) '#');
        fuzzTest1.FuzzTest_set(bitSet37, bitSet41, (int) (byte) 100, 0);
        buggyasrts.mut_029.BitSet bitSet57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet59 = null;
        buggyasrts.mut_029.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_set(bitSet59, bitSet60, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet65 = null;
        buggyasrts.mut_029.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet65, bitSet66, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(bitSet66, bitSet70, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet74 = null;
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet76 = null;
        buggyasrts.mut_029.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_set(bitSet76, bitSet77, (int) (byte) 1, (int) (short) 10);
        fuzzTest58.FuzzTest_set(bitSet74, bitSet77, (int) '#', (int) (short) 100);
        fuzzTest1.FuzzTest_set(bitSet57, bitSet77, (-1), 1);
        buggyasrts.mut_029.BitSet bitSet87 = null;
        fuzzTest0.FuzzTest_set(bitSet77, bitSet87, 0, (-1));
        buggyasrts.mut_029.BitSet bitSet91 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_029.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet91, bitSet92, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet3 = null;
        buggyasrts.mut_029.BitSet bitSet4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_set(bitSet3, bitSet4, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet9 = null;
        buggyasrts.mut_029.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzzTest1.FuzzTest_set(bitSet4, bitSet9, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet18 = null;
        buggyasrts.mut_029.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_set(bitSet18, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet25 = null;
        buggyasrts.mut_029.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_set(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet31 = null;
        buggyasrts.mut_029.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_set(bitSet31, bitSet32, (int) (byte) 1, (int) (short) 10);
        fuzzTest23.FuzzTest_set(bitSet26, bitSet31, (int) (byte) 10, (int) '#');
        fuzzTest1.FuzzTest_set(bitSet18, bitSet31, 100, (int) (short) 0);
        buggyasrts.mut_029.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_029.BitSet bitSet43 = null;
        fuzzTest1.FuzzTest_set(bitSet42, bitSet43, (int) (byte) 1, (-1));
        buggyasrts.mut_029.BitSet bitSet47 = null;
        fuzzTest0.FuzzTest_set(bitSet42, bitSet47, (int) (byte) 1, 100);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet53 = null;
        buggyasrts.mut_029.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet59 = null;
        buggyasrts.mut_029.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(bitSet59, bitSet60, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet60, bitSet64, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet68 = null;
        fuzzTest51.FuzzTest_set(bitSet64, bitSet68, (int) (short) -1, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet73 = null;
        buggyasrts.mut_029.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_set(bitSet73, bitSet74, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet79 = null;
        buggyasrts.mut_029.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_set(bitSet79, bitSet80, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_set(bitSet80, bitSet84, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet64, bitSet84, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet14 = null;
        buggyasrts.mut_029.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_set(bitSet9, bitSet14, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet23 = null;
        buggyasrts.mut_029.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet30 = null;
        buggyasrts.mut_029.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_set(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet36 = null;
        buggyasrts.mut_029.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_set(bitSet36, bitSet37, (int) (byte) 1, (int) (short) 10);
        fuzzTest28.FuzzTest_set(bitSet31, bitSet36, (int) (byte) 10, (int) '#');
        fuzzTest6.FuzzTest_set(bitSet23, bitSet36, 100, (int) (short) 0);
        buggyasrts.mut_029.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet49 = null;
        buggyasrts.mut_029.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_set(bitSet49, bitSet50, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_set(bitSet47, bitSet50, 0, (int) '#');
        buggyasrts.mut_029.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet47, bitSet57, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet9 = null;
        buggyasrts.mut_029.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet15 = null;
        buggyasrts.mut_029.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet16, bitSet20, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet24 = null;
        fuzzTest7.FuzzTest_set(bitSet16, bitSet24, (-1), (int) (short) -1);
        fuzzTest0.FuzzTest_set(bitSet6, bitSet24, (int) (byte) 0, (-1));
        buggyasrts.mut_029.BitSet bitSet31 = null;
        buggyasrts.mut_029.BitSet bitSet32 = null;
        fuzzTest0.FuzzTest_set(bitSet31, bitSet32, (int) '#', (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet38 = null;
        buggyasrts.mut_029.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet44 = null;
        buggyasrts.mut_029.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_set(bitSet44, bitSet45, (int) (byte) 1, (int) (short) 10);
        fuzzTest36.FuzzTest_set(bitSet39, bitSet44, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet53 = null;
        buggyasrts.mut_029.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet59 = null;
        buggyasrts.mut_029.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(bitSet59, bitSet60, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet60, bitSet64, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet68 = null;
        fuzzTest36.FuzzTest_set(bitSet64, bitSet68, (int) (byte) -1, 0);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet73 = null;
        buggyasrts.mut_029.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_set(bitSet73, bitSet74, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet79 = null;
        buggyasrts.mut_029.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_set(bitSet79, bitSet80, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_set(bitSet80, bitSet84, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet64, bitSet80, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet2 = null;
        buggyasrts.mut_029.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        buggyasrts.mut_029.BitSet bitSet16 = null;
        buggyasrts.mut_029.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_set(bitSet16, bitSet17, (-1), (int) '4');
        buggyasrts.mut_029.BitSet bitSet21 = null;
        buggyasrts.mut_029.BitSet bitSet22 = null;
        fuzzTest0.FuzzTest_set(bitSet21, bitSet22, (int) (short) 10, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet27 = null;
        buggyasrts.mut_029.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_set(bitSet27, bitSet28, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet33 = null;
        buggyasrts.mut_029.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_set(bitSet33, bitSet34, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet40 = null;
        buggyasrts.mut_029.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_set(bitSet40, bitSet41, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet46 = null;
        buggyasrts.mut_029.BitSet bitSet47 = null;
        fuzzTest45.FuzzTest_set(bitSet46, bitSet47, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet52 = null;
        buggyasrts.mut_029.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_set(bitSet52, bitSet53, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_set(bitSet53, bitSet57, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet62 = null;
        buggyasrts.mut_029.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_set(bitSet62, bitSet63, (int) (byte) 1, (int) (short) 10);
        fuzzTest39.FuzzTest_set(bitSet57, bitSet62, 0, (int) (short) 10);
        fuzzTest32.FuzzTest_set(bitSet38, bitSet62, 2, (int) (byte) 10);
        buggyasrts.mut_029.BitSet bitSet73 = null;
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet76 = null;
        buggyasrts.mut_029.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_set(bitSet76, bitSet77, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet82 = null;
        buggyasrts.mut_029.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_set(bitSet82, bitSet83, (int) (byte) 1, (int) (short) 10);
        fuzzTest74.FuzzTest_set(bitSet77, bitSet82, (int) (byte) 10, (int) '#');
        fuzzTest32.FuzzTest_set(bitSet73, bitSet77, (-1), (int) '4');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet28, bitSet77, (-1), 0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet2 = null;
        buggyasrts.mut_029.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet9, bitSet13, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet19 = null;
        buggyasrts.mut_029.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_set(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet25 = null;
        buggyasrts.mut_029.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_set(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        fuzzTest17.FuzzTest_set(bitSet20, bitSet25, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet34 = null;
        buggyasrts.mut_029.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_set(bitSet34, bitSet35, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet41 = null;
        buggyasrts.mut_029.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_set(bitSet41, bitSet42, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet47 = null;
        buggyasrts.mut_029.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_set(bitSet47, bitSet48, (int) (byte) 1, (int) (short) 10);
        fuzzTest39.FuzzTest_set(bitSet42, bitSet47, (int) (byte) 10, (int) '#');
        fuzzTest17.FuzzTest_set(bitSet34, bitSet47, 100, (int) (short) 0);
        buggyasrts.mut_029.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet60 = null;
        buggyasrts.mut_029.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_set(bitSet60, bitSet61, (int) (byte) 1, (int) (short) 10);
        fuzzTest17.FuzzTest_set(bitSet58, bitSet61, 0, (int) '#');
        buggyasrts.mut_029.BitSet bitSet68 = null;
        fuzzTest1.FuzzTest_set(bitSet58, bitSet68, (int) '4', (int) (short) 100);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet74 = null;
        buggyasrts.mut_029.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_set(bitSet74, bitSet75, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet80 = null;
        buggyasrts.mut_029.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_set(bitSet80, bitSet81, (int) (byte) 1, (int) (short) 10);
        fuzzTest72.FuzzTest_set(bitSet75, bitSet80, (int) (byte) 10, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet58, bitSet75, (int) 'a', (int) '4');
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet15 = null;
        buggyasrts.mut_029.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, 0, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet23 = null;
        buggyasrts.mut_029.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet29 = null;
        buggyasrts.mut_029.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet30, bitSet34, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet38 = null;
        fuzzTest21.FuzzTest_set(bitSet30, bitSet38, (-1), (int) (short) -1);
        fuzzTest14.FuzzTest_set(bitSet20, bitSet38, (int) (byte) 0, (-1));
        fuzzTest7.FuzzTest_set(bitSet13, bitSet38, (int) (short) 1, (int) 'a');
        buggyasrts.mut_029.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet51 = null;
        buggyasrts.mut_029.BitSet bitSet52 = null;
        fuzzTest50.FuzzTest_set(bitSet51, bitSet52, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet57 = null;
        buggyasrts.mut_029.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_set(bitSet57, bitSet58, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_set(bitSet58, bitSet62, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet66 = null;
        fuzzTest49.FuzzTest_set(bitSet58, bitSet66, (-1), (int) (short) -1);
        fuzzTest7.FuzzTest_set(bitSet48, bitSet66, (int) '#', 2);
        buggyasrts.mut_029.BitSet bitSet73 = null;
        fuzzTest6.FuzzTest_set(bitSet48, bitSet73, (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet78 = null;
        buggyasrts.mut_029.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_set(bitSet78, bitSet79, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet84 = null;
        buggyasrts.mut_029.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest83.FuzzTest_set(bitSet84, bitSet85, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_set(bitSet85, bitSet89, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet48, bitSet85, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet2 = null;
        buggyasrts.mut_029.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet17 = null;
        buggyasrts.mut_029.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_set(bitSet17, bitSet18, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet24 = null;
        buggyasrts.mut_029.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_set(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet30 = null;
        buggyasrts.mut_029.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_set(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest22.FuzzTest_set(bitSet25, bitSet30, (int) (byte) 10, (int) '#');
        fuzzTest0.FuzzTest_set(bitSet17, bitSet30, 100, (int) (short) 0);
        buggyasrts.mut_029.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet43 = null;
        buggyasrts.mut_029.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_set(bitSet43, bitSet44, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet41, bitSet44, 0, (int) '#');
        buggyasrts.mut_029.BitSet bitSet51 = null;
        buggyasrts.mut_029.BitSet bitSet52 = null;
        fuzzTest0.FuzzTest_set(bitSet51, bitSet52, (int) 'a', (int) ' ');
        buggyasrts.mut_029.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet58 = null;
        buggyasrts.mut_029.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_set(bitSet58, bitSet59, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet64 = null;
        buggyasrts.mut_029.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_set(bitSet64, bitSet65, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet70 = null;
        buggyasrts.mut_029.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_set(bitSet70, bitSet71, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_set(bitSet71, bitSet75, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet80 = null;
        buggyasrts.mut_029.BitSet bitSet81 = null;
        fuzzTest79.FuzzTest_set(bitSet80, bitSet81, 0, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_029.BitSet bitSet86 = null;
        fuzzTest79.FuzzTest_set(bitSet85, bitSet86, (int) (short) 0, (int) (byte) 0);
        fuzzTest57.FuzzTest_set(bitSet71, bitSet86, 1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet56, bitSet71, 10, (int) (byte) 10);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet2 = null;
        buggyasrts.mut_029.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet14 = null;
        buggyasrts.mut_029.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet21 = null;
        buggyasrts.mut_029.BitSet bitSet22 = null;
        fuzzTest20.FuzzTest_set(bitSet21, bitSet22, 0, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet29 = null;
        buggyasrts.mut_029.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet35 = null;
        buggyasrts.mut_029.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_set(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet36, bitSet40, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet44 = null;
        fuzzTest27.FuzzTest_set(bitSet36, bitSet44, (-1), (int) (short) -1);
        fuzzTest20.FuzzTest_set(bitSet26, bitSet44, (int) (byte) 0, (-1));
        fuzzTest13.FuzzTest_set(bitSet19, bitSet44, (int) (short) 1, (int) 'a');
        buggyasrts.mut_029.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet57 = null;
        buggyasrts.mut_029.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_set(bitSet57, bitSet58, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet63 = null;
        buggyasrts.mut_029.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_set(bitSet63, bitSet64, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_set(bitSet64, bitSet68, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet72 = null;
        fuzzTest55.FuzzTest_set(bitSet64, bitSet72, (-1), (int) (short) -1);
        fuzzTest13.FuzzTest_set(bitSet54, bitSet72, (int) '#', 2);
        fuzzTest1.FuzzTest_set(bitSet9, bitSet54, 2, 10);
        buggyasrts.mut_029.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet54, bitSet82, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet4 = null;
        buggyasrts.mut_029.BitSet bitSet5 = null;
        fuzzTest3.FuzzTest_set(bitSet4, bitSet5, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet10 = null;
        buggyasrts.mut_029.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_set(bitSet10, bitSet11, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_set(bitSet11, bitSet15, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet19 = null;
        fuzzTest2.FuzzTest_set(bitSet11, bitSet19, (-1), (int) (short) -1);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet25 = null;
        buggyasrts.mut_029.BitSet bitSet26 = null;
        fuzzTest24.FuzzTest_set(bitSet25, bitSet26, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet31 = null;
        buggyasrts.mut_029.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_set(bitSet31, bitSet32, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_set(bitSet32, bitSet36, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet40 = null;
        fuzzTest23.FuzzTest_set(bitSet32, bitSet40, (-1), (int) (short) -1);
        buggyasrts.mut_029.BitSet bitSet44 = null;
        fuzzTest2.FuzzTest_set(bitSet32, bitSet44, (int) (short) -1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet1, bitSet32, (int) (short) 100, 0);
        buggyasrts.mut_029.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet53 = null;
        buggyasrts.mut_029.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet59 = null;
        buggyasrts.mut_029.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(bitSet59, bitSet60, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet60, bitSet64, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet68 = null;
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet70 = null;
        buggyasrts.mut_029.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_set(bitSet70, bitSet71, (int) (byte) 1, (int) (short) 10);
        fuzzTest52.FuzzTest_set(bitSet68, bitSet71, (int) '#', (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet51, bitSet71, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet3 = null;
        buggyasrts.mut_029.BitSet bitSet4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_set(bitSet3, bitSet4, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet9 = null;
        buggyasrts.mut_029.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzzTest1.FuzzTest_set(bitSet4, bitSet9, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet19 = null;
        buggyasrts.mut_029.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_set(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet25 = null;
        buggyasrts.mut_029.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_set(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        fuzzTest17.FuzzTest_set(bitSet20, bitSet25, (int) (byte) 10, (int) '#');
        fuzzTest0.FuzzTest_set(bitSet9, bitSet25, (int) 'a', (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet39 = null;
        buggyasrts.mut_029.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet45 = null;
        buggyasrts.mut_029.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_set(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzzTest37.FuzzTest_set(bitSet40, bitSet45, (int) (byte) 10, (int) '#');
        fuzzTest0.FuzzTest_set(bitSet36, bitSet40, (int) (byte) 100, 0);
        buggyasrts.mut_029.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet58 = null;
        buggyasrts.mut_029.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_set(bitSet58, bitSet59, 0, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet66 = null;
        buggyasrts.mut_029.BitSet bitSet67 = null;
        fuzzTest65.FuzzTest_set(bitSet66, bitSet67, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet72 = null;
        buggyasrts.mut_029.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_set(bitSet72, bitSet73, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_set(bitSet73, bitSet77, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet81 = null;
        fuzzTest64.FuzzTest_set(bitSet73, bitSet81, (-1), (int) (short) -1);
        fuzzTest57.FuzzTest_set(bitSet63, bitSet81, (int) (byte) 0, (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet56, bitSet63, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet8, bitSet12, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet16 = null;
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet18 = null;
        buggyasrts.mut_029.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_set(bitSet18, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet16, bitSet19, (int) '#', (int) (short) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet28 = null;
        buggyasrts.mut_029.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet34 = null;
        buggyasrts.mut_029.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_set(bitSet34, bitSet35, (int) (byte) 1, (int) (short) 10);
        fuzzTest26.FuzzTest_set(bitSet29, bitSet34, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet43 = null;
        buggyasrts.mut_029.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_set(bitSet43, bitSet44, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet49 = null;
        buggyasrts.mut_029.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_set(bitSet49, bitSet50, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet55 = null;
        buggyasrts.mut_029.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_set(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_set(bitSet56, bitSet60, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet65 = null;
        buggyasrts.mut_029.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet65, bitSet66, (int) (byte) 1, (int) (short) 10);
        fuzzTest42.FuzzTest_set(bitSet60, bitSet65, 0, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet73 = null;
        fuzzTest26.FuzzTest_set(bitSet60, bitSet73, 10, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet78 = null;
        buggyasrts.mut_029.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_set(bitSet78, bitSet79, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet84 = null;
        buggyasrts.mut_029.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest83.FuzzTest_set(bitSet84, bitSet85, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_set(bitSet85, bitSet89, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet60, bitSet89, 2, 0);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet2 = null;
        buggyasrts.mut_029.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet18 = null;
        buggyasrts.mut_029.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_set(bitSet18, bitSet19, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet24 = null;
        buggyasrts.mut_029.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_set(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_set(bitSet25, bitSet29, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet33 = null;
        fuzzTest16.FuzzTest_set(bitSet25, bitSet33, (-1), (int) (short) -1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet38 = null;
        buggyasrts.mut_029.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet44 = null;
        buggyasrts.mut_029.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_set(bitSet44, bitSet45, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet45, bitSet49, 0, (int) (byte) 1);
        fuzzTest0.FuzzTest_set(bitSet33, bitSet45, (int) '#', (int) (short) 1);
        buggyasrts.mut_029.BitSet bitSet56 = null;
        buggyasrts.mut_029.BitSet bitSet57 = null;
        fuzzTest0.FuzzTest_set(bitSet56, bitSet57, (int) (short) 100, 1);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet62 = null;
        buggyasrts.mut_029.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_set(bitSet62, bitSet63, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet68 = null;
        buggyasrts.mut_029.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_set(bitSet68, bitSet69, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet74 = null;
        buggyasrts.mut_029.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_set(bitSet74, bitSet75, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_set(bitSet75, bitSet79, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet63, bitSet75, (-1), (int) (short) -1);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet13 = null;
        buggyasrts.mut_029.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet14, bitSet18, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet23 = null;
        buggyasrts.mut_029.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, 0, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_029.BitSet bitSet29 = null;
        fuzzTest22.FuzzTest_set(bitSet28, bitSet29, (int) (short) 0, (int) (byte) 0);
        fuzzTest0.FuzzTest_set(bitSet14, bitSet29, 1, (int) (short) 0);
        buggyasrts.mut_029.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet39 = null;
        buggyasrts.mut_029.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet45 = null;
        buggyasrts.mut_029.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_set(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzzTest37.FuzzTest_set(bitSet40, bitSet45, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet54 = null;
        buggyasrts.mut_029.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_set(bitSet54, bitSet55, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet60 = null;
        buggyasrts.mut_029.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_set(bitSet60, bitSet61, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet66 = null;
        buggyasrts.mut_029.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_set(bitSet66, bitSet67, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_set(bitSet67, bitSet71, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet76 = null;
        buggyasrts.mut_029.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_set(bitSet76, bitSet77, (int) (byte) 1, (int) (short) 10);
        fuzzTest53.FuzzTest_set(bitSet71, bitSet76, 0, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet84 = null;
        fuzzTest37.FuzzTest_set(bitSet71, bitSet84, 10, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet88 = null;
        buggyasrts.mut_029.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet88, bitSet89, (int) '4', 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet36, bitSet89, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet14 = null;
        buggyasrts.mut_029.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_set(bitSet9, bitSet14, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet23 = null;
        buggyasrts.mut_029.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet29 = null;
        buggyasrts.mut_029.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet35 = null;
        buggyasrts.mut_029.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_set(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet36, bitSet40, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet45 = null;
        buggyasrts.mut_029.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_set(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzzTest22.FuzzTest_set(bitSet40, bitSet45, 0, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet9, bitSet45, (int) (byte) 1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet57 = null;
        buggyasrts.mut_029.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_set(bitSet57, bitSet58, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet57, bitSet62, (int) (byte) 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet66 = null;
        buggyasrts.mut_029.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet66, bitSet67, (int) (byte) -1, 10);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet72 = null;
        buggyasrts.mut_029.BitSet bitSet73 = null;
        fuzzTest71.FuzzTest_set(bitSet72, bitSet73, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet78 = null;
        buggyasrts.mut_029.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_set(bitSet78, bitSet79, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_set(bitSet79, bitSet83, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest87 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet88 = null;
        buggyasrts.mut_029.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest87.FuzzTest_set(bitSet88, bitSet89, (int) (byte) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet79, bitSet89, 100, 0);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet2 = null;
        buggyasrts.mut_029.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet17 = null;
        buggyasrts.mut_029.BitSet bitSet18 = null;
        fuzzTest16.FuzzTest_set(bitSet17, bitSet18, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet23 = null;
        buggyasrts.mut_029.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet29 = null;
        buggyasrts.mut_029.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet30, bitSet34, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet39 = null;
        buggyasrts.mut_029.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzzTest16.FuzzTest_set(bitSet34, bitSet39, 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet48 = null;
        buggyasrts.mut_029.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_set(bitSet48, bitSet49, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet54 = null;
        buggyasrts.mut_029.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_set(bitSet54, bitSet55, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_set(bitSet55, bitSet59, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet34, bitSet59, (int) (short) -1, (int) '4');
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 10, 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        buggyasrts.mut_029.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet13 = null;
        buggyasrts.mut_029.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet19 = null;
        buggyasrts.mut_029.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_set(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet20, bitSet24, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet29 = null;
        buggyasrts.mut_029.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet35 = null;
        buggyasrts.mut_029.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_set(bitSet35, bitSet36, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet41 = null;
        buggyasrts.mut_029.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_set(bitSet41, bitSet42, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_set(bitSet42, bitSet46, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet51 = null;
        buggyasrts.mut_029.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_set(bitSet51, bitSet52, (int) (byte) 1, (int) (short) 10);
        fuzzTest28.FuzzTest_set(bitSet46, bitSet51, 0, (int) (short) 10);
        fuzzTest6.FuzzTest_set(bitSet24, bitSet51, (int) '#', (int) (byte) 10);
        buggyasrts.mut_029.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_029.BitSet bitSet63 = null;
        fuzzTest6.FuzzTest_set(bitSet62, bitSet63, (int) (byte) -1, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet69 = null;
        buggyasrts.mut_029.BitSet bitSet70 = null;
        fuzzTest68.FuzzTest_set(bitSet69, bitSet70, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet75 = null;
        buggyasrts.mut_029.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_set(bitSet75, bitSet76, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_set(bitSet76, bitSet80, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet84 = null;
        fuzzTest67.FuzzTest_set(bitSet76, bitSet84, (-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet62, bitSet76, (int) (byte) 1, 0);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_029.BitSet bitSet7 = null;
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, (int) (short) 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet12 = null;
        buggyasrts.mut_029.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_set(bitSet12, bitSet13, 0, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_029.BitSet bitSet18 = null;
        fuzzTest11.FuzzTest_set(bitSet17, bitSet18, (int) (short) 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet25 = null;
        buggyasrts.mut_029.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_set(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet31 = null;
        buggyasrts.mut_029.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_set(bitSet31, bitSet32, (int) (byte) 1, (int) (short) 10);
        fuzzTest23.FuzzTest_set(bitSet26, bitSet31, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet41 = null;
        buggyasrts.mut_029.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_set(bitSet41, bitSet42, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet47 = null;
        buggyasrts.mut_029.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_set(bitSet47, bitSet48, (int) (byte) 1, (int) (short) 10);
        fuzzTest39.FuzzTest_set(bitSet42, bitSet47, (int) (byte) 10, (int) '#');
        fuzzTest22.FuzzTest_set(bitSet31, bitSet47, (int) 'a', (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet60 = null;
        buggyasrts.mut_029.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_set(bitSet60, bitSet61, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet66 = null;
        buggyasrts.mut_029.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_set(bitSet66, bitSet67, (int) (byte) 1, (int) (short) 10);
        fuzzTest58.FuzzTest_set(bitSet61, bitSet66, (int) (byte) 10, (int) '#');
        buggyasrts.mut_029.BitSet bitSet74 = null;
        fuzzTest22.FuzzTest_set(bitSet61, bitSet74, (int) (byte) 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet17, bitSet61, 1, (int) (short) 0);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet2 = null;
        buggyasrts.mut_029.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet17 = null;
        buggyasrts.mut_029.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_set(bitSet17, bitSet18, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet24 = null;
        buggyasrts.mut_029.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_set(bitSet24, bitSet25, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet30 = null;
        buggyasrts.mut_029.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_set(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_set(bitSet31, bitSet35, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet39 = null;
        fuzzTest22.FuzzTest_set(bitSet31, bitSet39, (-1), (int) (short) -1);
        fuzzTest0.FuzzTest_set(bitSet17, bitSet39, (int) (byte) 100, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet47 = null;
        buggyasrts.mut_029.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_set(bitSet47, bitSet48, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet53 = null;
        buggyasrts.mut_029.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet59 = null;
        buggyasrts.mut_029.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(bitSet59, bitSet60, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet60, bitSet64, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet48, bitSet60, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 10, 0);
        buggyasrts.mut_029.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet10 = null;
        buggyasrts.mut_029.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_set(bitSet10, bitSet11, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet16 = null;
        buggyasrts.mut_029.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_set(bitSet16, bitSet17, (int) (byte) 1, (int) (short) 10);
        fuzzTest8.FuzzTest_set(bitSet11, bitSet16, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet26 = null;
        buggyasrts.mut_029.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_set(bitSet26, bitSet27, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet32 = null;
        buggyasrts.mut_029.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_set(bitSet32, bitSet33, (int) (byte) 1, (int) (short) 10);
        fuzzTest24.FuzzTest_set(bitSet27, bitSet32, (int) (byte) 10, (int) '#');
        fuzzTest7.FuzzTest_set(bitSet16, bitSet32, (int) 'a', (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet45 = null;
        buggyasrts.mut_029.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_set(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet51 = null;
        buggyasrts.mut_029.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_set(bitSet51, bitSet52, (int) (byte) 1, (int) (short) 10);
        fuzzTest43.FuzzTest_set(bitSet46, bitSet51, (int) (byte) 10, (int) '#');
        buggyasrts.mut_029.BitSet bitSet59 = null;
        fuzzTest7.FuzzTest_set(bitSet46, bitSet59, (int) (byte) 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet6, bitSet46, 100, (-1));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet3 = null;
        buggyasrts.mut_029.BitSet bitSet4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_set(bitSet3, bitSet4, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet9 = null;
        buggyasrts.mut_029.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzzTest1.FuzzTest_set(bitSet4, bitSet9, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet19 = null;
        buggyasrts.mut_029.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_set(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet25 = null;
        buggyasrts.mut_029.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_set(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        fuzzTest17.FuzzTest_set(bitSet20, bitSet25, (int) (byte) 10, (int) '#');
        fuzzTest0.FuzzTest_set(bitSet9, bitSet25, (int) 'a', (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet38 = null;
        buggyasrts.mut_029.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet44 = null;
        buggyasrts.mut_029.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_set(bitSet44, bitSet45, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet45, bitSet49, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet53 = null;
        fuzzTest36.FuzzTest_set(bitSet49, bitSet53, (int) (short) -1, (int) (byte) 100);
        buggyasrts.mut_029.BitSet bitSet57 = null;
        fuzzTest0.FuzzTest_set(bitSet53, bitSet57, (int) (byte) 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet64 = null;
        buggyasrts.mut_029.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_set(bitSet64, bitSet65, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet70 = null;
        buggyasrts.mut_029.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_set(bitSet70, bitSet71, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_set(bitSet71, bitSet75, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet79 = null;
        fuzzTest62.FuzzTest_set(bitSet75, bitSet79, (int) (short) -1, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet61, bitSet75, (int) '#', (int) (short) 100);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet2 = null;
        buggyasrts.mut_029.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        buggyasrts.mut_029.BitSet bitSet16 = null;
        buggyasrts.mut_029.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_set(bitSet16, bitSet17, (-1), (int) '4');
        buggyasrts.mut_029.BitSet bitSet21 = null;
        buggyasrts.mut_029.BitSet bitSet22 = null;
        fuzzTest0.FuzzTest_set(bitSet21, bitSet22, (int) (short) 10, (int) (byte) 100);
        buggyasrts.mut_029.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet30 = null;
        buggyasrts.mut_029.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_set(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet36 = null;
        buggyasrts.mut_029.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_set(bitSet36, bitSet37, (int) (byte) 1, (int) (short) 10);
        fuzzTest28.FuzzTest_set(bitSet31, bitSet36, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet45 = null;
        buggyasrts.mut_029.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_set(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet52 = null;
        buggyasrts.mut_029.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_set(bitSet52, bitSet53, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet58 = null;
        buggyasrts.mut_029.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_set(bitSet58, bitSet59, (int) (byte) 1, (int) (short) 10);
        fuzzTest50.FuzzTest_set(bitSet53, bitSet58, (int) (byte) 10, (int) '#');
        fuzzTest28.FuzzTest_set(bitSet45, bitSet58, 100, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet70 = null;
        buggyasrts.mut_029.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_set(bitSet70, bitSet71, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet75 = null;
        fuzzTest28.FuzzTest_set(bitSet71, bitSet75, 2, 0);
        buggyasrts.mut_029.BitSet bitSet79 = null;
        buggyasrts.mut_029.BitSet bitSet80 = null;
        fuzzTest28.FuzzTest_set(bitSet79, bitSet80, 1, (int) (short) 100);
        buggyasrts.mut_029.BitSet bitSet84 = null;
        buggyasrts.mut_029.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet84, bitSet85, (-1), (int) '4');
        buggyasrts.mut_029.BitSet bitSet89 = null;
        fuzzTest27.FuzzTest_set(bitSet85, bitSet89, (int) (byte) 1, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet26, bitSet85, (int) (short) 10, 1);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        buggyasrts.mut_029.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, 0, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet16 = null;
        buggyasrts.mut_029.BitSet bitSet17 = null;
        fuzzTest15.FuzzTest_set(bitSet16, bitSet17, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet22 = null;
        buggyasrts.mut_029.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet22, bitSet23, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_set(bitSet23, bitSet27, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet31 = null;
        fuzzTest14.FuzzTest_set(bitSet23, bitSet31, (-1), (int) (short) -1);
        fuzzTest7.FuzzTest_set(bitSet13, bitSet31, (int) (byte) 0, (-1));
        fuzzTest0.FuzzTest_set(bitSet6, bitSet31, (int) (short) 1, (int) 'a');
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet42 = null;
        buggyasrts.mut_029.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet48 = null;
        buggyasrts.mut_029.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_set(bitSet48, bitSet49, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet49, bitSet53, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet59 = null;
        buggyasrts.mut_029.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(bitSet59, bitSet60, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet65 = null;
        buggyasrts.mut_029.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet65, bitSet66, (int) (byte) 1, (int) (short) 10);
        fuzzTest57.FuzzTest_set(bitSet60, bitSet65, (int) (byte) 10, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet53, bitSet60, (-1), (int) (short) 0);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet4 = null;
        buggyasrts.mut_029.BitSet bitSet5 = null;
        fuzzTest3.FuzzTest_set(bitSet4, bitSet5, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet10 = null;
        buggyasrts.mut_029.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_set(bitSet10, bitSet11, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_set(bitSet11, bitSet15, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet19 = null;
        fuzzTest2.FuzzTest_set(bitSet15, bitSet19, (int) (short) -1, (int) (byte) 100);
        fuzzTest0.FuzzTest_set(bitSet1, bitSet19, (int) '4', (int) ' ');
        buggyasrts.mut_029.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet29 = null;
        buggyasrts.mut_029.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet35 = null;
        buggyasrts.mut_029.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_set(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        fuzzTest27.FuzzTest_set(bitSet30, bitSet35, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet44 = null;
        buggyasrts.mut_029.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_set(bitSet44, bitSet45, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet51 = null;
        buggyasrts.mut_029.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_set(bitSet51, bitSet52, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet57 = null;
        buggyasrts.mut_029.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_set(bitSet57, bitSet58, (int) (byte) 1, (int) (short) 10);
        fuzzTest49.FuzzTest_set(bitSet52, bitSet57, (int) (byte) 10, (int) '#');
        fuzzTest27.FuzzTest_set(bitSet44, bitSet57, 100, (int) (short) 0);
        buggyasrts.mut_029.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet70 = null;
        buggyasrts.mut_029.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_set(bitSet70, bitSet71, (int) (byte) 1, (int) (short) 10);
        fuzzTest27.FuzzTest_set(bitSet68, bitSet71, 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet26, bitSet68, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet2 = null;
        buggyasrts.mut_029.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_set(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        buggyasrts.mut_029.BitSet bitSet16 = null;
        buggyasrts.mut_029.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_set(bitSet16, bitSet17, (-1), (int) '4');
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet22 = null;
        buggyasrts.mut_029.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet22, bitSet23, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet28 = null;
        buggyasrts.mut_029.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet34 = null;
        buggyasrts.mut_029.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_set(bitSet34, bitSet35, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet35, bitSet39, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet44 = null;
        buggyasrts.mut_029.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_set(bitSet44, bitSet45, 0, (int) (byte) 0);
        buggyasrts.mut_029.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_029.BitSet bitSet50 = null;
        fuzzTest43.FuzzTest_set(bitSet49, bitSet50, (int) (short) 0, (int) (byte) 0);
        fuzzTest21.FuzzTest_set(bitSet35, bitSet50, 1, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet59 = null;
        buggyasrts.mut_029.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(bitSet59, bitSet60, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet65 = null;
        buggyasrts.mut_029.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet65, bitSet66, (int) (byte) 1, (int) (short) 10);
        fuzzTest57.FuzzTest_set(bitSet60, bitSet65, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet74 = null;
        buggyasrts.mut_029.BitSet bitSet75 = null;
        fuzzTest73.FuzzTest_set(bitSet74, bitSet75, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet80 = null;
        buggyasrts.mut_029.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_set(bitSet80, bitSet81, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_set(bitSet81, bitSet85, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet89 = null;
        fuzzTest57.FuzzTest_set(bitSet85, bitSet89, (int) (byte) -1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet35, bitSet85, (-1), 2);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet2 = null;
        buggyasrts.mut_029.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet8 = null;
        buggyasrts.mut_029.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_029.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet9, bitSet13, 0, (int) (byte) 1);
        buggyasrts.mut_029.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_set(bitSet13, bitSet17, (int) (short) -1, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet22 = null;
        buggyasrts.mut_029.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet22, bitSet23, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_029.BitSet bitSet28 = null;
        buggyasrts.mut_029.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, (int) (byte) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet23, bitSet29, (int) 'a', (int) (short) 10);
    }
}

