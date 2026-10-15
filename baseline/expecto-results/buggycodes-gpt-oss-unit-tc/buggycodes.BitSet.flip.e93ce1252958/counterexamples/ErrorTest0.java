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
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet6, bitSet7, 10, (int) (byte) -1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet6, bitSet7, (int) (short) 1, 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, (int) ' ', 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, (-1), (int) (byte) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet7 = null;
        buggycodes.mut_035.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet8, bitSet12, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet7 = null;
        buggycodes.mut_035.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet8, bitSet12, 0, (int) (byte) 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet3 = null;
        buggycodes.mut_035.BitSet bitSet4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_flip(bitSet3, bitSet4, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzzTest1.FuzzTest_flip(bitSet4, bitSet9, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet19 = null;
        buggycodes.mut_035.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_flip(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet25 = null;
        buggycodes.mut_035.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_flip(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        fuzzTest17.FuzzTest_flip(bitSet20, bitSet25, (int) (byte) 10, (int) '#');
        fuzzTest0.FuzzTest_flip(bitSet9, bitSet25, (int) 'a', (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet39 = null;
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet45 = null;
        buggycodes.mut_035.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzzTest37.FuzzTest_flip(bitSet40, bitSet45, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet55 = null;
        buggycodes.mut_035.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_flip(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet61 = null;
        buggycodes.mut_035.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_flip(bitSet61, bitSet62, (int) (byte) 1, (int) (short) 10);
        fuzzTest53.FuzzTest_flip(bitSet56, bitSet61, (int) (byte) 10, (int) '#');
        fuzzTest36.FuzzTest_flip(bitSet45, bitSet61, (int) 'a', (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet75 = null;
        buggycodes.mut_035.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_flip(bitSet75, bitSet76, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet81 = null;
        buggycodes.mut_035.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest80.FuzzTest_flip(bitSet81, bitSet82, (int) (byte) 1, (int) (short) 10);
        fuzzTest73.FuzzTest_flip(bitSet76, bitSet81, (int) (byte) 10, (int) '#');
        fuzzTest36.FuzzTest_flip(bitSet72, bitSet81, (int) (byte) 1, (int) (byte) 1);
        buggycodes.mut_035.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet72, bitSet92, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet19 = null;
        buggycodes.mut_035.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_flip(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet25 = null;
        buggycodes.mut_035.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_flip(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        fuzzTest17.FuzzTest_flip(bitSet20, bitSet25, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet35 = null;
        buggycodes.mut_035.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_flip(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet41 = null;
        buggycodes.mut_035.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_flip(bitSet41, bitSet42, (int) (byte) 1, (int) (short) 10);
        fuzzTest33.FuzzTest_flip(bitSet36, bitSet41, (int) (byte) 10, (int) '#');
        fuzzTest16.FuzzTest_flip(bitSet25, bitSet41, (int) 'a', (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet55 = null;
        buggycodes.mut_035.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_flip(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet61 = null;
        buggycodes.mut_035.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_flip(bitSet61, bitSet62, (int) (byte) 1, (int) (short) 10);
        fuzzTest53.FuzzTest_flip(bitSet56, bitSet61, (int) (byte) 10, (int) '#');
        fuzzTest16.FuzzTest_flip(bitSet52, bitSet61, (int) (byte) 1, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet74 = null;
        buggycodes.mut_035.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_flip(bitSet74, bitSet75, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet80 = null;
        buggycodes.mut_035.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_flip(bitSet80, bitSet81, (int) (byte) 1, (int) (short) 10);
        fuzzTest72.FuzzTest_flip(bitSet75, bitSet80, (int) (byte) 10, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet52, bitSet75, 2, (int) (short) 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet16, bitSet17, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest22.FuzzTest_flip(bitSet25, bitSet30, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet46 = null;
        buggycodes.mut_035.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_flip(bitSet46, bitSet47, (int) (byte) 1, (int) (short) 10);
        fuzzTest38.FuzzTest_flip(bitSet41, bitSet46, (int) (byte) 10, (int) '#');
        fuzzTest21.FuzzTest_flip(bitSet30, bitSet46, (int) 'a', (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet60 = null;
        buggycodes.mut_035.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_flip(bitSet60, bitSet61, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet66 = null;
        buggycodes.mut_035.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_flip(bitSet66, bitSet67, (int) (byte) 1, (int) (short) 10);
        fuzzTest58.FuzzTest_flip(bitSet61, bitSet66, (int) (byte) 10, (int) '#');
        fuzzTest21.FuzzTest_flip(bitSet57, bitSet66, (int) (byte) 1, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet79 = null;
        buggycodes.mut_035.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_flip(bitSet79, bitSet80, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_flip(bitSet79, bitSet84, (int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet57, bitSet84, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet14 = null;
        buggycodes.mut_035.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_flip(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_flip(bitSet9, bitSet14, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet22, bitSet23, (int) (short) 0, (int) '#');
        buggycodes.mut_035.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet22, bitSet27, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet9, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet18 = null;
        buggycodes.mut_035.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_flip(bitSet18, bitSet19, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_flip(bitSet18, bitSet23, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet28 = null;
        buggycodes.mut_035.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_flip(bitSet28, bitSet29, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet35 = null;
        buggycodes.mut_035.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_flip(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet41 = null;
        buggycodes.mut_035.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_flip(bitSet41, bitSet42, (int) (byte) 1, (int) (short) 10);
        fuzzTest33.FuzzTest_flip(bitSet36, bitSet41, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_flip(bitSet49, bitSet50, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet56 = null;
        buggycodes.mut_035.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_flip(bitSet56, bitSet57, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet62 = null;
        buggycodes.mut_035.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_flip(bitSet62, bitSet63, (int) (byte) 1, (int) (short) 10);
        fuzzTest54.FuzzTest_flip(bitSet57, bitSet63, (int) (short) 0, 100);
        fuzzTest27.FuzzTest_flip(bitSet50, bitSet57, (int) (short) 10, 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet23, bitSet57, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet14 = null;
        buggycodes.mut_035.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_flip(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_flip(bitSet9, bitSet14, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet22, bitSet23, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet29 = null;
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_flip(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet35 = null;
        buggycodes.mut_035.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_flip(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        fuzzTest27.FuzzTest_flip(bitSet30, bitSet36, (int) (short) 0, 100);
        fuzzTest0.FuzzTest_flip(bitSet23, bitSet30, (int) (short) 10, 100);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet48 = null;
        buggycodes.mut_035.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_flip(bitSet48, bitSet49, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet54 = null;
        buggycodes.mut_035.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet54, bitSet55, (int) (byte) 1, (int) (short) 10);
        fuzzTest46.FuzzTest_flip(bitSet49, bitSet54, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_flip(bitSet62, bitSet63, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet69 = null;
        buggycodes.mut_035.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_flip(bitSet69, bitSet70, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet75 = null;
        buggycodes.mut_035.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_flip(bitSet75, bitSet76, (int) (byte) 1, (int) (short) 10);
        fuzzTest67.FuzzTest_flip(bitSet70, bitSet75, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_flip(bitSet83, bitSet84, (int) (short) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet63, bitSet84, 1, (-1));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet18 = null;
        buggycodes.mut_035.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_flip(bitSet18, bitSet19, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_flip(bitSet18, bitSet23, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet29 = null;
        buggycodes.mut_035.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_flip(bitSet29, bitSet30, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet35 = null;
        buggycodes.mut_035.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_flip(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet42 = null;
        buggycodes.mut_035.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_flip(bitSet42, bitSet43, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet48 = null;
        buggycodes.mut_035.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_flip(bitSet48, bitSet49, (int) (byte) 1, (int) (short) 10);
        fuzzTest40.FuzzTest_flip(bitSet43, bitSet48, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_flip(bitSet56, bitSet57, (int) (short) 0, (int) '#');
        fuzzTest28.FuzzTest_flip(bitSet35, bitSet56, (int) (short) 100, (int) 'a');
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet66 = null;
        buggycodes.mut_035.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_flip(bitSet66, bitSet67, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet72 = null;
        buggycodes.mut_035.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_flip(bitSet72, bitSet73, (int) (byte) 1, (int) (short) 10);
        fuzzTest64.FuzzTest_flip(bitSet67, bitSet72, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_flip(bitSet80, bitSet81, (int) (short) 0, (int) '#');
        fuzzTest27.FuzzTest_flip(bitSet56, bitSet81, (int) (short) 0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet23, bitSet81, (int) (byte) 10, 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet9, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet18 = null;
        buggycodes.mut_035.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_flip(bitSet18, bitSet19, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet31 = null;
        buggycodes.mut_035.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_flip(bitSet31, bitSet32, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet37 = null;
        buggycodes.mut_035.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_flip(bitSet37, bitSet38, (int) (byte) 1, (int) (short) 10);
        fuzzTest29.FuzzTest_flip(bitSet32, bitSet37, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet45, bitSet46, (int) (short) 0, (int) '#');
        fuzzTest17.FuzzTest_flip(bitSet24, bitSet45, (int) (short) 100, (int) 'a');
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet55 = null;
        buggycodes.mut_035.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_flip(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet61 = null;
        buggycodes.mut_035.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_flip(bitSet61, bitSet62, (int) (byte) 1, (int) (short) 10);
        fuzzTest53.FuzzTest_flip(bitSet56, bitSet61, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet69, bitSet70, (int) (short) 0, (int) '#');
        fuzzTest16.FuzzTest_flip(bitSet45, bitSet70, (int) (short) 0, (int) ' ');
        buggycodes.mut_035.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet45, bitSet77, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet16, bitSet17, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet23 = null;
        buggycodes.mut_035.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_flip(bitSet23, bitSet24, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet29 = null;
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_flip(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzzTest21.FuzzTest_flip(bitSet24, bitSet29, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_flip(bitSet37, bitSet38, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet43 = null;
        buggycodes.mut_035.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_flip(bitSet43, bitSet44, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet51 = null;
        buggycodes.mut_035.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_flip(bitSet51, bitSet52, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet57 = null;
        buggycodes.mut_035.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_flip(bitSet57, bitSet58, (int) (byte) 1, (int) (short) 10);
        fuzzTest49.FuzzTest_flip(bitSet52, bitSet57, (int) (byte) 10, (int) '#');
        fuzzTest42.FuzzTest_flip(bitSet48, bitSet57, 10, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet37, bitSet48, (int) (short) -1, 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet3 = null;
        buggycodes.mut_035.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_flip(bitSet3, bitSet4, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet16 = null;
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_flip(bitSet16, bitSet17, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet22 = null;
        buggycodes.mut_035.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_flip(bitSet22, bitSet23, (int) (byte) 1, (int) (short) 10);
        fuzzTest14.FuzzTest_flip(bitSet17, bitSet22, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_flip(bitSet30, bitSet31, (int) (short) 0, (int) '#');
        fuzzTest2.FuzzTest_flip(bitSet9, bitSet30, (int) (short) 100, (int) 'a');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet46 = null;
        buggycodes.mut_035.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_flip(bitSet46, bitSet47, (int) (byte) 1, (int) (short) 10);
        fuzzTest38.FuzzTest_flip(bitSet41, bitSet46, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet54, bitSet55, (int) (short) 0, (int) '#');
        fuzzTest1.FuzzTest_flip(bitSet30, bitSet55, (int) (short) 0, (int) ' ');
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet64 = null;
        buggycodes.mut_035.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_flip(bitSet64, bitSet65, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet70 = null;
        buggycodes.mut_035.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_flip(bitSet70, bitSet71, (int) (byte) 1, (int) (short) 10);
        fuzzTest62.FuzzTest_flip(bitSet65, bitSet71, (int) (short) 0, 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet55, bitSet65, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet9, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet17 = null;
        buggycodes.mut_035.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_flip(bitSet17, bitSet18, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest22.FuzzTest_flip(bitSet25, bitSet30, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_flip(bitSet38, bitSet39, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet45 = null;
        buggycodes.mut_035.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet51 = null;
        buggycodes.mut_035.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_flip(bitSet51, bitSet52, (int) (byte) 1, (int) (short) 10);
        fuzzTest43.FuzzTest_flip(bitSet46, bitSet52, (int) (short) 0, 100);
        fuzzTest16.FuzzTest_flip(bitSet39, bitSet46, (int) (short) 10, 100);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet64 = null;
        buggycodes.mut_035.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_flip(bitSet64, bitSet65, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet70 = null;
        buggycodes.mut_035.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_flip(bitSet70, bitSet71, (int) (byte) 1, (int) (short) 10);
        fuzzTest62.FuzzTest_flip(bitSet65, bitSet71, (int) (short) 0, 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet46, bitSet65, 10, 2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet17 = null;
        buggycodes.mut_035.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_flip(bitSet17, bitSet18, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest22.FuzzTest_flip(bitSet25, bitSet30, (int) (byte) 10, (int) '#');
        fuzzTest0.FuzzTest_flip(bitSet17, bitSet30, (int) (byte) 1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet42 = null;
        buggycodes.mut_035.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_flip(bitSet42, bitSet43, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet49 = null;
        buggycodes.mut_035.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_flip(bitSet49, bitSet50, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet55 = null;
        buggycodes.mut_035.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_flip(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzzTest47.FuzzTest_flip(bitSet50, bitSet56, (int) (short) 0, 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet43, bitSet56, (int) '4', 2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet14 = null;
        buggycodes.mut_035.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_flip(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_flip(bitSet9, bitSet15, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet23 = null;
        buggycodes.mut_035.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_flip(bitSet23, bitSet24, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet36 = null;
        buggycodes.mut_035.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_flip(bitSet36, bitSet37, (int) (byte) 1, (int) (short) 10);
        fuzzTest28.FuzzTest_flip(bitSet31, bitSet36, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_flip(bitSet44, bitSet45, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet51 = null;
        buggycodes.mut_035.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_flip(bitSet51, bitSet52, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet57 = null;
        buggycodes.mut_035.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_flip(bitSet57, bitSet58, (int) (byte) 1, (int) (short) 10);
        fuzzTest49.FuzzTest_flip(bitSet52, bitSet58, (int) (short) 0, 100);
        fuzzTest22.FuzzTest_flip(bitSet45, bitSet52, (int) (short) 10, 100);
        buggycodes.mut_035.BitSet bitSet68 = null;
        fuzzTest6.FuzzTest_flip(bitSet45, bitSet68, (int) (byte) 100, (int) ' ');
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet74 = null;
        buggycodes.mut_035.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_flip(bitSet74, bitSet75, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet80 = null;
        buggycodes.mut_035.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_flip(bitSet80, bitSet81, (int) (byte) 1, (int) (short) 10);
        fuzzTest72.FuzzTest_flip(bitSet75, bitSet81, (int) (short) 0, 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet45, bitSet81, (int) '4', 2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet9, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet18 = null;
        buggycodes.mut_035.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_flip(bitSet18, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzzTest16.FuzzTest_flip(bitSet19, bitSet24, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet33 = null;
        buggycodes.mut_035.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_flip(bitSet33, bitSet34, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet46 = null;
        buggycodes.mut_035.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_flip(bitSet46, bitSet47, (int) (byte) 1, (int) (short) 10);
        fuzzTest38.FuzzTest_flip(bitSet41, bitSet47, (int) (short) 0, 100);
        fuzzTest16.FuzzTest_flip(bitSet33, bitSet47, (int) (byte) 100, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet59 = null;
        buggycodes.mut_035.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_flip(bitSet59, bitSet60, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet65 = null;
        buggycodes.mut_035.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_flip(bitSet65, bitSet66, (int) (byte) 1, (int) (short) 10);
        fuzzTest57.FuzzTest_flip(bitSet60, bitSet65, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_flip(bitSet73, bitSet74, (int) (short) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet47, bitSet73, (int) '4', 2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet14 = null;
        buggycodes.mut_035.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_flip(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_flip(bitSet9, bitSet14, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet22, bitSet23, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet29 = null;
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_flip(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet35 = null;
        buggycodes.mut_035.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_flip(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        fuzzTest27.FuzzTest_flip(bitSet30, bitSet35, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_flip(bitSet43, bitSet44, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet50 = null;
        buggycodes.mut_035.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_flip(bitSet50, bitSet51, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet56 = null;
        buggycodes.mut_035.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_flip(bitSet56, bitSet57, (int) (byte) 1, (int) (short) 10);
        fuzzTest48.FuzzTest_flip(bitSet51, bitSet56, (int) (byte) 10, (int) '#');
        fuzzTest6.FuzzTest_flip(bitSet44, bitSet56, (int) '#', (-1));
        buggycodes.mut_035.BitSet bitSet67 = null;
        fuzzTest0.FuzzTest_flip(bitSet56, bitSet67, 0, (int) '#');
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet73 = null;
        buggycodes.mut_035.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_flip(bitSet73, bitSet74, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet79 = null;
        buggycodes.mut_035.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_flip(bitSet79, bitSet80, (int) (byte) 1, (int) (short) 10);
        fuzzTest71.FuzzTest_flip(bitSet74, bitSet79, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_flip(bitSet87, bitSet88, (int) (short) 0, (int) '#');
        buggycodes.mut_035.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet87, bitSet92, (-1), (int) (byte) 10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet15 = null;
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_flip(bitSet15, bitSet16, (int) (byte) 1, (int) (short) 10);
        fuzzTest7.FuzzTest_flip(bitSet10, bitSet15, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet23, bitSet24, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet36 = null;
        buggycodes.mut_035.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_flip(bitSet36, bitSet37, (int) (byte) 1, (int) (short) 10);
        fuzzTest28.FuzzTest_flip(bitSet31, bitSet37, (int) (short) 0, 100);
        fuzzTest1.FuzzTest_flip(bitSet24, bitSet31, (int) (short) 10, 100);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet49 = null;
        buggycodes.mut_035.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_flip(bitSet49, bitSet50, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_flip(bitSet49, bitSet54, (int) (short) -1, (int) (byte) 10);
        fuzzTest0.FuzzTest_flip(bitSet24, bitSet49, (int) (short) 1, (int) (byte) 1);
        buggycodes.mut_035.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet64 = null;
        buggycodes.mut_035.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_flip(bitSet64, bitSet65, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet70 = null;
        buggycodes.mut_035.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_flip(bitSet70, bitSet71, (int) (byte) 1, (int) (short) 10);
        fuzzTest62.FuzzTest_flip(bitSet65, bitSet71, (int) (short) 0, 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet61, bitSet71, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet17 = null;
        buggycodes.mut_035.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_flip(bitSet17, bitSet18, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest22.FuzzTest_flip(bitSet25, bitSet31, (int) (short) 0, 100);
        fuzzTest0.FuzzTest_flip(bitSet17, bitSet31, (int) (byte) 100, (int) (byte) 100);
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet43 = null;
        buggycodes.mut_035.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_flip(bitSet43, bitSet44, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet50 = null;
        buggycodes.mut_035.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_flip(bitSet50, bitSet51, (int) (byte) 1, (int) (short) 10);
        fuzzTest42.FuzzTest_flip(bitSet48, bitSet51, 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet60 = null;
        buggycodes.mut_035.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_flip(bitSet60, bitSet61, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet66 = null;
        buggycodes.mut_035.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_flip(bitSet66, bitSet67, (int) (byte) 1, (int) (short) 10);
        fuzzTest58.FuzzTest_flip(bitSet61, bitSet66, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet75 = null;
        buggycodes.mut_035.BitSet bitSet76 = null;
        fuzzTest74.FuzzTest_flip(bitSet75, bitSet76, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet80 = null;
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet82 = null;
        buggycodes.mut_035.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_flip(bitSet82, bitSet83, (int) (byte) 1, (int) (short) 10);
        fuzzTest74.FuzzTest_flip(bitSet80, bitSet83, 0, (int) (byte) 10);
        fuzzTest42.FuzzTest_flip(bitSet66, bitSet83, (int) (short) 100, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet41, bitSet83, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet3 = null;
        buggycodes.mut_035.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_flip(bitSet3, bitSet4, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet16 = null;
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_flip(bitSet16, bitSet17, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet22 = null;
        buggycodes.mut_035.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_flip(bitSet22, bitSet23, (int) (byte) 1, (int) (short) 10);
        fuzzTest14.FuzzTest_flip(bitSet17, bitSet22, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_flip(bitSet30, bitSet31, (int) (short) 0, (int) '#');
        fuzzTest2.FuzzTest_flip(bitSet9, bitSet30, (int) (short) 100, (int) 'a');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet46 = null;
        buggycodes.mut_035.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_flip(bitSet46, bitSet47, (int) (byte) 1, (int) (short) 10);
        fuzzTest38.FuzzTest_flip(bitSet41, bitSet46, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet54, bitSet55, (int) (short) 0, (int) '#');
        fuzzTest1.FuzzTest_flip(bitSet30, bitSet55, (int) (short) 0, (int) ' ');
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet63 = null;
        buggycodes.mut_035.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_flip(bitSet63, bitSet64, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet68 = null;
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet71 = null;
        buggycodes.mut_035.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_flip(bitSet71, bitSet72, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet77 = null;
        buggycodes.mut_035.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_flip(bitSet77, bitSet78, (int) (byte) 1, (int) (short) 10);
        fuzzTest69.FuzzTest_flip(bitSet72, bitSet77, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_flip(bitSet85, bitSet86, (int) (short) 0, (int) '#');
        fuzzTest62.FuzzTest_flip(bitSet68, bitSet85, (int) (byte) 10, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet30, bitSet85, (-1), 100);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet9, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet18 = null;
        buggycodes.mut_035.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_flip(bitSet18, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzzTest16.FuzzTest_flip(bitSet19, bitSet24, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet33 = null;
        buggycodes.mut_035.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_flip(bitSet33, bitSet34, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet46 = null;
        buggycodes.mut_035.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_flip(bitSet46, bitSet47, (int) (byte) 1, (int) (short) 10);
        fuzzTest38.FuzzTest_flip(bitSet41, bitSet47, (int) (short) 0, 100);
        fuzzTest16.FuzzTest_flip(bitSet33, bitSet47, (int) (byte) 100, (int) (byte) 100);
        buggycodes.mut_035.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet47, bitSet57, (int) (short) 0, 2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet17 = null;
        buggycodes.mut_035.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_flip(bitSet17, bitSet18, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_flip(bitSet24, bitSet29, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet35 = null;
        buggycodes.mut_035.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_flip(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_flip(bitSet35, bitSet40, (int) (short) -1, (int) (byte) 10);
        fuzzTest16.FuzzTest_flip(bitSet29, bitSet40, (int) (short) 1, 10);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet49 = null;
        buggycodes.mut_035.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_flip(bitSet49, bitSet50, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet55 = null;
        buggycodes.mut_035.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_flip(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzzTest47.FuzzTest_flip(bitSet50, bitSet55, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_flip(bitSet63, bitSet64, (int) (short) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet40, bitSet64, 100, (int) (byte) 1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet3 = null;
        buggycodes.mut_035.BitSet bitSet4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_flip(bitSet3, bitSet4, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzzTest1.FuzzTest_flip(bitSet4, bitSet9, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet19 = null;
        buggycodes.mut_035.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_flip(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_flip(bitSet19, bitSet24, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet36 = null;
        buggycodes.mut_035.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_flip(bitSet36, bitSet37, (int) (byte) 1, (int) (short) 10);
        fuzzTest28.FuzzTest_flip(bitSet31, bitSet36, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet45 = null;
        buggycodes.mut_035.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet52 = null;
        buggycodes.mut_035.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_flip(bitSet52, bitSet53, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet58 = null;
        buggycodes.mut_035.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_flip(bitSet58, bitSet59, (int) (byte) 1, (int) (short) 10);
        fuzzTest50.FuzzTest_flip(bitSet53, bitSet58, (int) (byte) 10, (int) '#');
        fuzzTest28.FuzzTest_flip(bitSet45, bitSet58, (int) (byte) 1, (int) (short) -1);
        buggycodes.mut_035.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet72 = null;
        buggycodes.mut_035.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_flip(bitSet72, bitSet73, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet78 = null;
        buggycodes.mut_035.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_flip(bitSet78, bitSet79, (int) (byte) 1, (int) (short) 10);
        fuzzTest70.FuzzTest_flip(bitSet73, bitSet79, (int) (short) 0, 100);
        fuzzTest28.FuzzTest_flip(bitSet69, bitSet79, 1, (int) (byte) 1);
        buggycodes.mut_035.BitSet bitSet89 = null;
        fuzzTest17.FuzzTest_flip(bitSet69, bitSet89, (int) (short) 1, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet4, bitSet69, (int) (short) -1, 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet3 = null;
        buggycodes.mut_035.BitSet bitSet4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_flip(bitSet3, bitSet4, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzzTest1.FuzzTest_flip(bitSet4, bitSet9, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet19 = null;
        buggycodes.mut_035.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_flip(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet25 = null;
        buggycodes.mut_035.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_flip(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        fuzzTest17.FuzzTest_flip(bitSet20, bitSet25, (int) (byte) 10, (int) '#');
        fuzzTest0.FuzzTest_flip(bitSet9, bitSet25, (int) 'a', (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet38 = null;
        buggycodes.mut_035.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_flip(bitSet38, bitSet39, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet44 = null;
        buggycodes.mut_035.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_flip(bitSet44, bitSet45, (int) (byte) 1, (int) (short) 10);
        fuzzTest36.FuzzTest_flip(bitSet39, bitSet44, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_flip(bitSet52, bitSet53, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet58 = null;
        buggycodes.mut_035.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_flip(bitSet58, bitSet59, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet65 = null;
        buggycodes.mut_035.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_flip(bitSet65, bitSet66, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_flip(bitSet65, bitSet70, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet76 = null;
        buggycodes.mut_035.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_flip(bitSet76, bitSet77, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_flip(bitSet76, bitSet81, (int) (short) -1, (int) (byte) 10);
        fuzzTest57.FuzzTest_flip(bitSet70, bitSet81, (int) (short) 1, 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet53, bitSet81, (int) (byte) 10, 1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet17 = null;
        buggycodes.mut_035.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_flip(bitSet17, bitSet18, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_flip(bitSet24, bitSet29, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet35 = null;
        buggycodes.mut_035.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_flip(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_flip(bitSet35, bitSet40, (int) (short) -1, (int) (byte) 10);
        fuzzTest16.FuzzTest_flip(bitSet29, bitSet40, (int) (short) 1, 10);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet48 = null;
        buggycodes.mut_035.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_flip(bitSet48, bitSet49, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet55 = null;
        buggycodes.mut_035.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_flip(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet55, bitSet60, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet66 = null;
        buggycodes.mut_035.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_flip(bitSet66, bitSet67, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_flip(bitSet66, bitSet71, (int) (short) -1, (int) (byte) 10);
        fuzzTest47.FuzzTest_flip(bitSet60, bitSet71, (int) (short) 1, 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet29, bitSet71, (int) '4', (int) (short) 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet14 = null;
        buggycodes.mut_035.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_flip(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_flip(bitSet9, bitSet15, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet23 = null;
        buggycodes.mut_035.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_flip(bitSet23, bitSet24, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet31 = null;
        buggycodes.mut_035.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_flip(bitSet31, bitSet32, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet37 = null;
        buggycodes.mut_035.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_flip(bitSet37, bitSet38, (int) (byte) 1, (int) (short) 10);
        fuzzTest29.FuzzTest_flip(bitSet32, bitSet37, (int) (byte) 10, (int) '#');
        fuzzTest22.FuzzTest_flip(bitSet28, bitSet37, 10, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet15, bitSet28, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet14 = null;
        buggycodes.mut_035.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_flip(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_flip(bitSet9, bitSet14, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet23 = null;
        buggycodes.mut_035.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_flip(bitSet23, bitSet24, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet14, bitSet23, (int) (short) 100, (int) 'a');
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet33 = null;
        buggycodes.mut_035.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_flip(bitSet33, bitSet34, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet39 = null;
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzzTest31.FuzzTest_flip(bitSet34, bitSet40, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet49 = null;
        buggycodes.mut_035.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_flip(bitSet49, bitSet50, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet55 = null;
        buggycodes.mut_035.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_flip(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzzTest47.FuzzTest_flip(bitSet50, bitSet56, (int) (short) 0, 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet34, bitSet56, (int) (byte) 10, 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet15 = null;
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_flip(bitSet15, bitSet16, (int) (byte) 1, (int) (short) 10);
        fuzzTest7.FuzzTest_flip(bitSet10, bitSet15, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet23, bitSet24, (int) (short) 0, (int) '#');
        fuzzTest0.FuzzTest_flip(bitSet6, bitSet23, (int) (byte) 10, 1);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet33 = null;
        buggycodes.mut_035.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_flip(bitSet33, bitSet34, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet39 = null;
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzzTest31.FuzzTest_flip(bitSet34, bitSet40, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet50 = null;
        buggycodes.mut_035.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_flip(bitSet50, bitSet51, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet56 = null;
        buggycodes.mut_035.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_flip(bitSet56, bitSet57, (int) (byte) 1, (int) (short) 10);
        fuzzTest48.FuzzTest_flip(bitSet51, bitSet56, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet65 = null;
        buggycodes.mut_035.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_flip(bitSet65, bitSet66, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet70 = null;
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet72 = null;
        buggycodes.mut_035.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_flip(bitSet72, bitSet73, (int) (byte) 1, (int) (short) 10);
        fuzzTest64.FuzzTest_flip(bitSet70, bitSet73, 0, (int) (byte) 10);
        fuzzTest47.FuzzTest_flip(bitSet56, bitSet73, (int) (short) 0, 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet40, bitSet73, 0, 2);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet16, bitSet17, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet23 = null;
        buggycodes.mut_035.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_flip(bitSet23, bitSet24, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet29 = null;
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_flip(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzzTest21.FuzzTest_flip(bitSet24, bitSet29, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet38 = null;
        buggycodes.mut_035.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_flip(bitSet38, bitSet39, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet45 = null;
        buggycodes.mut_035.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet51 = null;
        buggycodes.mut_035.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_flip(bitSet51, bitSet52, (int) (byte) 1, (int) (short) 10);
        fuzzTest43.FuzzTest_flip(bitSet46, bitSet51, (int) (byte) 10, (int) '#');
        fuzzTest21.FuzzTest_flip(bitSet38, bitSet51, (int) (byte) 1, (int) (short) -1);
        buggycodes.mut_035.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet65 = null;
        buggycodes.mut_035.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_flip(bitSet65, bitSet66, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet71 = null;
        buggycodes.mut_035.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_flip(bitSet71, bitSet72, (int) (byte) 1, (int) (short) 10);
        fuzzTest63.FuzzTest_flip(bitSet66, bitSet72, (int) (short) 0, 100);
        fuzzTest21.FuzzTest_flip(bitSet62, bitSet72, 1, (int) (byte) 1);
        buggycodes.mut_035.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet72, bitSet82, 100, (int) (byte) 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet6, bitSet9, 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet18 = null;
        buggycodes.mut_035.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_flip(bitSet18, bitSet19, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet26 = null;
        buggycodes.mut_035.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_flip(bitSet26, bitSet27, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet32 = null;
        buggycodes.mut_035.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_flip(bitSet32, bitSet33, (int) (byte) 1, (int) (short) 10);
        fuzzTest24.FuzzTest_flip(bitSet27, bitSet32, (int) (byte) 10, (int) '#');
        fuzzTest17.FuzzTest_flip(bitSet23, bitSet32, 10, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet45 = null;
        buggycodes.mut_035.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet51 = null;
        buggycodes.mut_035.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_flip(bitSet51, bitSet52, (int) (byte) 1, (int) (short) 10);
        fuzzTest43.FuzzTest_flip(bitSet46, bitSet52, (int) (short) 0, 100);
        fuzzTest16.FuzzTest_flip(bitSet23, bitSet46, (int) (byte) 0, (int) ' ');
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet64 = null;
        buggycodes.mut_035.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_flip(bitSet64, bitSet65, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet70 = null;
        buggycodes.mut_035.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_flip(bitSet70, bitSet71, (int) (byte) 1, (int) (short) 10);
        fuzzTest62.FuzzTest_flip(bitSet65, bitSet70, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_flip(bitSet78, bitSet79, (int) (short) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet23, bitSet79, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet3 = null;
        buggycodes.mut_035.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_flip(bitSet3, bitSet4, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet11 = null;
        buggycodes.mut_035.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_flip(bitSet11, bitSet12, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet17 = null;
        buggycodes.mut_035.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_flip(bitSet17, bitSet18, (int) (byte) 1, (int) (short) 10);
        fuzzTest9.FuzzTest_flip(bitSet12, bitSet17, (int) (byte) 10, (int) '#');
        fuzzTest2.FuzzTest_flip(bitSet8, bitSet17, 10, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet36 = null;
        buggycodes.mut_035.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_flip(bitSet36, bitSet37, (int) (byte) 1, (int) (short) 10);
        fuzzTest28.FuzzTest_flip(bitSet31, bitSet37, (int) (short) 0, 100);
        fuzzTest1.FuzzTest_flip(bitSet8, bitSet31, (int) (byte) 0, (int) ' ');
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet49 = null;
        buggycodes.mut_035.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_flip(bitSet49, bitSet50, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet55 = null;
        buggycodes.mut_035.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_flip(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzzTest47.FuzzTest_flip(bitSet50, bitSet55, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_flip(bitSet63, bitSet64, (int) (short) 0, (int) '#');
        buggycodes.mut_035.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet71 = null;
        buggycodes.mut_035.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_flip(bitSet71, bitSet72, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet77 = null;
        buggycodes.mut_035.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_flip(bitSet77, bitSet78, (int) (byte) 1, (int) (short) 10);
        fuzzTest69.FuzzTest_flip(bitSet72, bitSet77, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_flip(bitSet85, bitSet86, (int) (short) 0, (int) '#');
        fuzzTest47.FuzzTest_flip(bitSet68, bitSet85, 2, (int) '4');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet31, bitSet85, 0, (int) (byte) 1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet6, bitSet9, 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet18 = null;
        buggycodes.mut_035.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_flip(bitSet18, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzzTest16.FuzzTest_flip(bitSet19, bitSet24, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_flip(bitSet32, bitSet33, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet39 = null;
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet45 = null;
        buggycodes.mut_035.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzzTest37.FuzzTest_flip(bitSet40, bitSet45, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet55 = null;
        buggycodes.mut_035.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_flip(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet61 = null;
        buggycodes.mut_035.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_flip(bitSet61, bitSet62, (int) (byte) 1, (int) (short) 10);
        fuzzTest53.FuzzTest_flip(bitSet56, bitSet61, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet69, bitSet70, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet76 = null;
        buggycodes.mut_035.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_flip(bitSet76, bitSet77, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet82 = null;
        buggycodes.mut_035.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_flip(bitSet82, bitSet83, (int) (byte) 1, (int) (short) 10);
        fuzzTest74.FuzzTest_flip(bitSet77, bitSet83, (int) (short) 0, 100);
        fuzzTest37.FuzzTest_flip(bitSet70, bitSet83, 0, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet32, bitSet83, 100, 1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet3 = null;
        buggycodes.mut_035.BitSet bitSet4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_flip(bitSet3, bitSet4, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet10 = null;
        buggycodes.mut_035.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_flip(bitSet10, bitSet11, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet16 = null;
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_flip(bitSet16, bitSet17, (int) (byte) 1, (int) (short) 10);
        fuzzTest8.FuzzTest_flip(bitSet11, bitSet16, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet24, bitSet25, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet31 = null;
        buggycodes.mut_035.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_flip(bitSet31, bitSet32, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet37 = null;
        buggycodes.mut_035.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_flip(bitSet37, bitSet38, (int) (byte) 1, (int) (short) 10);
        fuzzTest29.FuzzTest_flip(bitSet32, bitSet38, (int) (short) 0, 100);
        fuzzTest2.FuzzTest_flip(bitSet25, bitSet32, (int) (short) 10, 100);
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet25, (int) (short) 10, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet51 = null;
        buggycodes.mut_035.BitSet bitSet52 = null;
        fuzzTest0.FuzzTest_flip(bitSet51, bitSet52, (int) '#', 0);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet57 = null;
        buggycodes.mut_035.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_flip(bitSet57, bitSet58, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet65 = null;
        buggycodes.mut_035.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_flip(bitSet65, bitSet66, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet71 = null;
        buggycodes.mut_035.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_flip(bitSet71, bitSet72, (int) (byte) 1, (int) (short) 10);
        fuzzTest63.FuzzTest_flip(bitSet66, bitSet71, (int) (byte) 10, (int) '#');
        fuzzTest56.FuzzTest_flip(bitSet62, bitSet71, 10, (int) (short) 1);
        buggycodes.mut_035.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet62, bitSet82, (int) '4', 2);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet14 = null;
        buggycodes.mut_035.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_flip(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_flip(bitSet9, bitSet15, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest22.FuzzTest_flip(bitSet25, bitSet30, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_flip(bitSet38, bitSet39, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet45 = null;
        buggycodes.mut_035.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet51 = null;
        buggycodes.mut_035.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_flip(bitSet51, bitSet52, (int) (byte) 1, (int) (short) 10);
        fuzzTest43.FuzzTest_flip(bitSet46, bitSet51, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_flip(bitSet59, bitSet60, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet66 = null;
        buggycodes.mut_035.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_flip(bitSet66, bitSet67, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet72 = null;
        buggycodes.mut_035.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_flip(bitSet72, bitSet73, (int) (byte) 1, (int) (short) 10);
        fuzzTest64.FuzzTest_flip(bitSet67, bitSet72, (int) (byte) 10, (int) '#');
        fuzzTest22.FuzzTest_flip(bitSet60, bitSet72, (int) '#', (-1));
        buggycodes.mut_035.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet84 = null;
        fuzzTest22.FuzzTest_flip(bitSet83, bitSet84, 1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet15, bitSet83, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet2, bitSet7, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet13 = null;
        buggycodes.mut_035.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_flip(bitSet13, bitSet14, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet19 = null;
        buggycodes.mut_035.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_flip(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        fuzzTest11.FuzzTest_flip(bitSet14, bitSet19, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_flip(bitSet27, bitSet28, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet34 = null;
        buggycodes.mut_035.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_flip(bitSet34, bitSet35, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet47 = null;
        buggycodes.mut_035.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_flip(bitSet47, bitSet48, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet53 = null;
        buggycodes.mut_035.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_flip(bitSet53, bitSet54, (int) (byte) 1, (int) (short) 10);
        fuzzTest45.FuzzTest_flip(bitSet48, bitSet53, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_flip(bitSet61, bitSet62, (int) (short) 0, (int) '#');
        fuzzTest33.FuzzTest_flip(bitSet40, bitSet61, (int) (short) 100, (int) 'a');
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet71 = null;
        buggycodes.mut_035.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_flip(bitSet71, bitSet72, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet77 = null;
        buggycodes.mut_035.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_flip(bitSet77, bitSet78, (int) (byte) 1, (int) (short) 10);
        fuzzTest69.FuzzTest_flip(bitSet72, bitSet77, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_flip(bitSet85, bitSet86, (int) (short) 0, (int) '#');
        fuzzTest32.FuzzTest_flip(bitSet61, bitSet86, (int) (short) 0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet28, bitSet86, (int) 'a', 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet6, bitSet9, 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet18 = null;
        buggycodes.mut_035.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_flip(bitSet18, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzzTest16.FuzzTest_flip(bitSet19, bitSet24, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet33 = null;
        buggycodes.mut_035.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_flip(bitSet33, bitSet34, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        fuzzTest32.FuzzTest_flip(bitSet38, bitSet41, 0, (int) (byte) 10);
        fuzzTest0.FuzzTest_flip(bitSet24, bitSet41, (int) (short) 100, (int) (byte) 100);
        buggycodes.mut_035.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet54 = null;
        buggycodes.mut_035.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet54, bitSet55, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_flip(bitSet54, bitSet59, (int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet51, bitSet59, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet9, bitSet14, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet20 = null;
        buggycodes.mut_035.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_flip(bitSet20, bitSet21, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_flip(bitSet20, bitSet25, (int) (short) -1, (int) (byte) 10);
        fuzzTest1.FuzzTest_flip(bitSet14, bitSet25, (int) (short) 1, 10);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet34 = null;
        buggycodes.mut_035.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_flip(bitSet34, bitSet35, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        fuzzTest32.FuzzTest_flip(bitSet35, bitSet40, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet49 = null;
        buggycodes.mut_035.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_flip(bitSet49, bitSet50, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet56 = null;
        buggycodes.mut_035.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_flip(bitSet56, bitSet57, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet62 = null;
        buggycodes.mut_035.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_flip(bitSet62, bitSet63, (int) (byte) 1, (int) (short) 10);
        fuzzTest54.FuzzTest_flip(bitSet57, bitSet62, (int) (byte) 10, (int) '#');
        fuzzTest32.FuzzTest_flip(bitSet49, bitSet62, (int) (byte) 1, (int) (short) -1);
        buggycodes.mut_035.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet76 = null;
        buggycodes.mut_035.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_flip(bitSet76, bitSet77, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet82 = null;
        buggycodes.mut_035.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_flip(bitSet82, bitSet83, (int) (byte) 1, (int) (short) 10);
        fuzzTest74.FuzzTest_flip(bitSet77, bitSet83, (int) (short) 0, 100);
        fuzzTest32.FuzzTest_flip(bitSet73, bitSet83, 1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet25, bitSet83, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet18 = null;
        buggycodes.mut_035.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_flip(bitSet18, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzzTest16.FuzzTest_flip(bitSet19, bitSet24, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet33 = null;
        buggycodes.mut_035.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_flip(bitSet33, bitSet34, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet46 = null;
        buggycodes.mut_035.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_flip(bitSet46, bitSet47, (int) (byte) 1, (int) (short) 10);
        fuzzTest38.FuzzTest_flip(bitSet41, bitSet47, (int) (short) 0, 100);
        fuzzTest16.FuzzTest_flip(bitSet33, bitSet47, (int) (byte) 100, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet58 = null;
        buggycodes.mut_035.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_flip(bitSet58, bitSet59, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet47, bitSet58, (int) (short) 10, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet68 = null;
        buggycodes.mut_035.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_flip(bitSet68, bitSet69, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet74 = null;
        buggycodes.mut_035.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_flip(bitSet74, bitSet75, (int) (byte) 1, (int) (short) 10);
        fuzzTest66.FuzzTest_flip(bitSet69, bitSet74, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_flip(bitSet82, bitSet83, (int) (short) 0, (int) '#');
        buggycodes.mut_035.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet83, bitSet87, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet10 = null;
        buggycodes.mut_035.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_flip(bitSet10, bitSet11, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet16 = null;
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_flip(bitSet16, bitSet17, (int) (byte) 1, (int) (short) 10);
        fuzzTest8.FuzzTest_flip(bitSet11, bitSet17, (int) (short) 0, 100);
        fuzzTest1.FuzzTest_flip(bitSet7, bitSet11, 1, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_flip(bitSet11, bitSet27, (int) (byte) 100, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet34 = null;
        buggycodes.mut_035.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_flip(bitSet34, bitSet35, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        fuzzTest32.FuzzTest_flip(bitSet35, bitSet41, (int) (short) 0, 100);
        fuzzTest0.FuzzTest_flip(bitSet31, bitSet41, (int) (short) 100, 0);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet53 = null;
        buggycodes.mut_035.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_flip(bitSet53, bitSet54, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet59 = null;
        buggycodes.mut_035.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_flip(bitSet59, bitSet60, (int) (byte) 1, (int) (short) 10);
        fuzzTest51.FuzzTest_flip(bitSet54, bitSet59, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_flip(bitSet67, bitSet68, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet74 = null;
        buggycodes.mut_035.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_flip(bitSet74, bitSet75, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_flip(bitSet74, bitSet79, (int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet67, bitSet79, (int) (byte) 100, 1);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet18 = null;
        buggycodes.mut_035.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_flip(bitSet18, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzzTest16.FuzzTest_flip(bitSet19, bitSet24, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_flip(bitSet32, bitSet33, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet39 = null;
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet45 = null;
        buggycodes.mut_035.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzzTest37.FuzzTest_flip(bitSet40, bitSet46, (int) (short) 0, 100);
        fuzzTest0.FuzzTest_flip(bitSet33, bitSet46, 0, 0);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet58 = null;
        buggycodes.mut_035.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_flip(bitSet58, bitSet59, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet64 = null;
        buggycodes.mut_035.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_flip(bitSet64, bitSet65, (int) (byte) 1, (int) (short) 10);
        fuzzTest56.FuzzTest_flip(bitSet59, bitSet65, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet73 = null;
        buggycodes.mut_035.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_flip(bitSet73, bitSet74, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet80 = null;
        buggycodes.mut_035.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_flip(bitSet80, bitSet81, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_flip(bitSet80, bitSet85, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet89 = null;
        fuzzTest72.FuzzTest_flip(bitSet85, bitSet89, 1, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet65, bitSet85, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet6, bitSet9, 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet17 = null;
        buggycodes.mut_035.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_flip(bitSet17, bitSet18, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_flip(bitSet24, bitSet29, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet35 = null;
        buggycodes.mut_035.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_flip(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_flip(bitSet35, bitSet40, (int) (short) -1, (int) (byte) 10);
        fuzzTest16.FuzzTest_flip(bitSet29, bitSet40, (int) (short) 1, 10);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet48 = null;
        buggycodes.mut_035.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_flip(bitSet48, bitSet49, (int) (byte) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet29, bitSet49, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet3 = null;
        buggycodes.mut_035.BitSet bitSet4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_flip(bitSet3, bitSet4, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzzTest1.FuzzTest_flip(bitSet4, bitSet9, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet18 = null;
        buggycodes.mut_035.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_flip(bitSet18, bitSet19, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet25 = null;
        buggycodes.mut_035.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_flip(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        fuzzTest17.FuzzTest_flip(bitSet23, bitSet26, 0, (int) (byte) 10);
        fuzzTest0.FuzzTest_flip(bitSet9, bitSet26, (int) (short) 0, 2);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet37 = null;
        buggycodes.mut_035.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_flip(bitSet37, bitSet38, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet44 = null;
        buggycodes.mut_035.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_flip(bitSet44, bitSet45, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet50 = null;
        buggycodes.mut_035.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_flip(bitSet50, bitSet51, (int) (byte) 1, (int) (short) 10);
        fuzzTest42.FuzzTest_flip(bitSet45, bitSet51, (int) (short) 0, 100);
        buggycodes.mut_035.BitSet bitSet58 = null;
        fuzzTest36.FuzzTest_flip(bitSet51, bitSet58, (-1), 0);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet64 = null;
        buggycodes.mut_035.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_flip(bitSet64, bitSet65, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet70 = null;
        buggycodes.mut_035.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_flip(bitSet70, bitSet71, (int) (byte) 1, (int) (short) 10);
        fuzzTest62.FuzzTest_flip(bitSet65, bitSet70, (int) (byte) 10, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet51, bitSet65, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet3 = null;
        buggycodes.mut_035.BitSet bitSet4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_flip(bitSet3, bitSet4, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzzTest1.FuzzTest_flip(bitSet4, bitSet9, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet19 = null;
        buggycodes.mut_035.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_flip(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet25 = null;
        buggycodes.mut_035.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_flip(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        fuzzTest17.FuzzTest_flip(bitSet20, bitSet25, (int) (byte) 10, (int) '#');
        fuzzTest0.FuzzTest_flip(bitSet9, bitSet25, (int) 'a', (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet39 = null;
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet45 = null;
        buggycodes.mut_035.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzzTest37.FuzzTest_flip(bitSet40, bitSet45, (int) (byte) 10, (int) '#');
        fuzzTest0.FuzzTest_flip(bitSet36, bitSet45, (int) (byte) 1, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet58 = null;
        buggycodes.mut_035.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_flip(bitSet58, bitSet59, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet64 = null;
        buggycodes.mut_035.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_flip(bitSet64, bitSet65, (int) (byte) 1, (int) (short) 10);
        fuzzTest56.FuzzTest_flip(bitSet59, bitSet64, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_flip(bitSet72, bitSet73, (int) (short) 0, (int) '#');
        buggycodes.mut_035.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet72, bitSet77, (int) (byte) 100, 1);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet7 = null;
        buggycodes.mut_035.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet14 = null;
        buggycodes.mut_035.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_flip(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet20 = null;
        buggycodes.mut_035.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_flip(bitSet20, bitSet21, (int) (byte) 1, (int) (short) 10);
        fuzzTest12.FuzzTest_flip(bitSet15, bitSet20, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_flip(bitSet28, bitSet29, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet35 = null;
        buggycodes.mut_035.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_flip(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet41 = null;
        buggycodes.mut_035.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_flip(bitSet41, bitSet42, (int) (byte) 1, (int) (short) 10);
        fuzzTest33.FuzzTest_flip(bitSet36, bitSet42, (int) (short) 0, 100);
        fuzzTest6.FuzzTest_flip(bitSet29, bitSet36, (int) (short) 10, 100);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet54 = null;
        buggycodes.mut_035.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet54, bitSet55, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet61 = null;
        buggycodes.mut_035.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_flip(bitSet61, bitSet62, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_flip(bitSet61, bitSet66, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet72 = null;
        buggycodes.mut_035.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_flip(bitSet72, bitSet73, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_flip(bitSet72, bitSet77, (int) (short) -1, (int) (byte) 10);
        fuzzTest53.FuzzTest_flip(bitSet66, bitSet77, (int) (short) 1, 10);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet85 = null;
        buggycodes.mut_035.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest84.FuzzTest_flip(bitSet85, bitSet86, (int) (byte) 1, (int) (short) 10);
        fuzzTest52.FuzzTest_flip(bitSet77, bitSet85, (int) (byte) 100, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet36, bitSet77, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet14 = null;
        buggycodes.mut_035.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_flip(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_flip(bitSet9, bitSet14, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet23 = null;
        buggycodes.mut_035.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_flip(bitSet23, bitSet24, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet14, bitSet23, (int) (short) 100, (int) 'a');
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet34 = null;
        buggycodes.mut_035.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_flip(bitSet34, bitSet35, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        fuzzTest32.FuzzTest_flip(bitSet35, bitSet40, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet49 = null;
        buggycodes.mut_035.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_flip(bitSet49, bitSet50, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet56 = null;
        buggycodes.mut_035.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_flip(bitSet56, bitSet57, (int) (byte) 1, (int) (short) 10);
        fuzzTest48.FuzzTest_flip(bitSet54, bitSet57, 0, (int) (byte) 10);
        fuzzTest31.FuzzTest_flip(bitSet40, bitSet57, (int) (short) 0, 2);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet69 = null;
        buggycodes.mut_035.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_flip(bitSet69, bitSet70, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet75 = null;
        buggycodes.mut_035.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_flip(bitSet75, bitSet76, (int) (byte) 1, (int) (short) 10);
        fuzzTest67.FuzzTest_flip(bitSet70, bitSet75, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_flip(bitSet83, bitSet84, (int) (short) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet57, bitSet84, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet3 = null;
        buggycodes.mut_035.BitSet bitSet4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_flip(bitSet3, bitSet4, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzzTest1.FuzzTest_flip(bitSet4, bitSet9, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet18 = null;
        buggycodes.mut_035.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_flip(bitSet18, bitSet19, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet25 = null;
        buggycodes.mut_035.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_flip(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet31 = null;
        buggycodes.mut_035.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_flip(bitSet31, bitSet32, (int) (byte) 1, (int) (short) 10);
        fuzzTest23.FuzzTest_flip(bitSet26, bitSet31, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        fuzzTest17.FuzzTest_flip(bitSet31, bitSet40, (int) (short) 100, (int) 'a');
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet49 = null;
        buggycodes.mut_035.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_flip(bitSet49, bitSet50, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet57 = null;
        buggycodes.mut_035.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_flip(bitSet57, bitSet58, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet63 = null;
        buggycodes.mut_035.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_flip(bitSet63, bitSet64, (int) (byte) 1, (int) (short) 10);
        fuzzTest55.FuzzTest_flip(bitSet58, bitSet63, (int) (byte) 10, (int) '#');
        fuzzTest48.FuzzTest_flip(bitSet54, bitSet63, 10, (int) (short) 1);
        buggycodes.mut_035.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_flip(bitSet54, bitSet74, 1, (int) ' ');
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet79 = null;
        buggycodes.mut_035.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_flip(bitSet79, bitSet80, (int) (byte) 1, (int) (short) 10);
        fuzzTest1.FuzzTest_flip(bitSet54, bitSet80, 0, 10);
        fuzztests.FuzzTest fuzzTest87 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet88 = null;
        buggycodes.mut_035.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest87.FuzzTest_flip(bitSet88, bitSet89, (int) (byte) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet80, bitSet89, (int) (short) 100, 0);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet9, bitSet14, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet20 = null;
        buggycodes.mut_035.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_flip(bitSet20, bitSet21, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_flip(bitSet20, bitSet25, (int) (short) -1, (int) (byte) 10);
        fuzzTest1.FuzzTest_flip(bitSet14, bitSet25, (int) (short) 1, 10);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet34 = null;
        buggycodes.mut_035.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_flip(bitSet34, bitSet35, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        fuzzTest32.FuzzTest_flip(bitSet35, bitSet40, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_flip(bitSet48, bitSet49, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet55 = null;
        buggycodes.mut_035.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_flip(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet61 = null;
        buggycodes.mut_035.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_flip(bitSet61, bitSet62, (int) (byte) 1, (int) (short) 10);
        fuzzTest53.FuzzTest_flip(bitSet56, bitSet61, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet69, bitSet70, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet76 = null;
        buggycodes.mut_035.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_flip(bitSet76, bitSet77, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet82 = null;
        buggycodes.mut_035.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_flip(bitSet82, bitSet83, (int) (byte) 1, (int) (short) 10);
        fuzzTest74.FuzzTest_flip(bitSet77, bitSet82, (int) (byte) 10, (int) '#');
        fuzzTest32.FuzzTest_flip(bitSet70, bitSet82, (int) '#', (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet14, bitSet70, (-1), (int) 'a');
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet2, bitSet7, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet12 = null;
        buggycodes.mut_035.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_flip(bitSet12, bitSet13, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet19 = null;
        buggycodes.mut_035.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_flip(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet25 = null;
        buggycodes.mut_035.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_flip(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        fuzzTest17.FuzzTest_flip(bitSet20, bitSet26, (int) (short) 0, 100);
        buggycodes.mut_035.BitSet bitSet33 = null;
        fuzzTest11.FuzzTest_flip(bitSet26, bitSet33, (-1), 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet39 = null;
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet46 = null;
        buggycodes.mut_035.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_flip(bitSet46, bitSet47, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet46, bitSet51, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet57 = null;
        buggycodes.mut_035.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_flip(bitSet57, bitSet58, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_flip(bitSet57, bitSet62, (int) (short) -1, (int) (byte) 10);
        fuzzTest38.FuzzTest_flip(bitSet51, bitSet62, (int) (short) 1, 10);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet70 = null;
        buggycodes.mut_035.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_flip(bitSet70, bitSet71, (int) (byte) 1, (int) (short) 10);
        fuzzTest37.FuzzTest_flip(bitSet62, bitSet70, (int) (byte) 100, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet26, bitSet62, (int) '4', (int) (short) 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet2, bitSet7, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet13 = null;
        buggycodes.mut_035.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_flip(bitSet13, bitSet14, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet18 = null;
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet21 = null;
        buggycodes.mut_035.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_flip(bitSet21, bitSet22, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet27 = null;
        buggycodes.mut_035.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_flip(bitSet27, bitSet28, (int) (byte) 1, (int) (short) 10);
        fuzzTest19.FuzzTest_flip(bitSet22, bitSet28, (int) (short) 0, 100);
        fuzzTest12.FuzzTest_flip(bitSet18, bitSet22, 1, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet38 = null;
        fuzzTest11.FuzzTest_flip(bitSet22, bitSet38, (int) (byte) 100, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet44 = null;
        buggycodes.mut_035.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_flip(bitSet44, bitSet45, (int) (byte) 1, (int) (short) 10);
        fuzzTest11.FuzzTest_flip(bitSet42, bitSet45, (int) (short) 10, 2);
        buggycodes.mut_035.BitSet bitSet52 = null;
        fuzzTest0.FuzzTest_flip(bitSet45, bitSet52, 0, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet58 = null;
        buggycodes.mut_035.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_flip(bitSet58, bitSet59, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet64 = null;
        buggycodes.mut_035.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_flip(bitSet64, bitSet65, (int) (byte) 1, (int) (short) 10);
        fuzzTest56.FuzzTest_flip(bitSet59, bitSet65, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet73 = null;
        buggycodes.mut_035.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_flip(bitSet73, bitSet74, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet78 = null;
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet80 = null;
        buggycodes.mut_035.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_flip(bitSet80, bitSet81, (int) (byte) 1, (int) (short) 10);
        fuzzTest72.FuzzTest_flip(bitSet78, bitSet81, 0, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet65, bitSet81, (int) (short) 0, (-1));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet17 = null;
        buggycodes.mut_035.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_flip(bitSet17, bitSet18, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest22.FuzzTest_flip(bitSet25, bitSet31, (int) (short) 0, 100);
        buggycodes.mut_035.BitSet bitSet38 = null;
        fuzzTest16.FuzzTest_flip(bitSet31, bitSet38, (-1), 0);
        buggycodes.mut_035.BitSet bitSet42 = null;
        fuzzTest0.FuzzTest_flip(bitSet31, bitSet42, 10, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet48 = null;
        buggycodes.mut_035.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_flip(bitSet48, bitSet49, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet54 = null;
        buggycodes.mut_035.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet54, bitSet55, (int) (byte) 1, (int) (short) 10);
        fuzzTest46.FuzzTest_flip(bitSet49, bitSet55, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet63 = null;
        buggycodes.mut_035.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_flip(bitSet63, bitSet64, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet70 = null;
        buggycodes.mut_035.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_flip(bitSet70, bitSet71, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_flip(bitSet70, bitSet75, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet81 = null;
        buggycodes.mut_035.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest80.FuzzTest_flip(bitSet81, bitSet82, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_flip(bitSet81, bitSet86, (int) (short) -1, (int) (byte) 10);
        fuzzTest62.FuzzTest_flip(bitSet75, bitSet86, (int) (short) 1, 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet49, bitSet86, 10, (-1));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet16, bitSet17, (int) (short) 0, (int) '#');
        buggycodes.mut_035.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet32 = null;
        buggycodes.mut_035.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_flip(bitSet32, bitSet33, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet38 = null;
        buggycodes.mut_035.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_flip(bitSet38, bitSet39, (int) (byte) 1, (int) (short) 10);
        fuzzTest30.FuzzTest_flip(bitSet33, bitSet39, (int) (short) 0, 100);
        fuzzTest23.FuzzTest_flip(bitSet29, bitSet33, 1, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet49 = null;
        fuzzTest22.FuzzTest_flip(bitSet33, bitSet49, (int) (byte) 100, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet53 = null;
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet55 = null;
        buggycodes.mut_035.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_flip(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzzTest22.FuzzTest_flip(bitSet53, bitSet56, (int) (short) 10, 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet21, bitSet56, (int) 'a', (int) '4');
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet6, bitSet9, 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet17 = null;
        buggycodes.mut_035.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_flip(bitSet17, bitSet18, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest22.FuzzTest_flip(bitSet25, bitSet31, (int) (short) 0, 100);
        buggycodes.mut_035.BitSet bitSet38 = null;
        fuzzTest16.FuzzTest_flip(bitSet31, bitSet38, (-1), 0);
        buggycodes.mut_035.BitSet bitSet42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet45 = null;
        buggycodes.mut_035.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet51 = null;
        buggycodes.mut_035.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_flip(bitSet51, bitSet52, (int) (byte) 1, (int) (short) 10);
        fuzzTest43.FuzzTest_flip(bitSet46, bitSet52, (int) (short) 0, 100);
        fuzzTest16.FuzzTest_flip(bitSet42, bitSet52, (int) (short) -1, (int) ' ');
        buggycodes.mut_035.BitSet bitSet62 = null;
        fuzzTest0.FuzzTest_flip(bitSet42, bitSet62, 10, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet69 = null;
        buggycodes.mut_035.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_flip(bitSet69, bitSet70, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet75 = null;
        buggycodes.mut_035.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_flip(bitSet75, bitSet76, (int) (byte) 1, (int) (short) 10);
        fuzzTest67.FuzzTest_flip(bitSet70, bitSet75, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_flip(bitSet83, bitSet84, (int) (short) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet66, bitSet84, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet9, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet17 = null;
        buggycodes.mut_035.BitSet bitSet18 = null;
        fuzzTest16.FuzzTest_flip(bitSet17, bitSet18, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_flip(bitSet24, bitSet29, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet33 = null;
        fuzzTest16.FuzzTest_flip(bitSet29, bitSet33, 1, (int) '#');
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet39 = null;
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_flip(bitSet39, bitSet44, (int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet29, bitSet44, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet16, bitSet17, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet22 = null;
        buggycodes.mut_035.BitSet bitSet23 = null;
        fuzzTest21.FuzzTest_flip(bitSet22, bitSet23, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet36 = null;
        buggycodes.mut_035.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_flip(bitSet36, bitSet37, (int) (byte) 1, (int) (short) 10);
        fuzzTest28.FuzzTest_flip(bitSet31, bitSet36, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_flip(bitSet44, bitSet45, (int) (short) 0, (int) '#');
        fuzzTest21.FuzzTest_flip(bitSet27, bitSet44, (int) (byte) 10, 1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet53 = null;
        buggycodes.mut_035.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_flip(bitSet53, bitSet54, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet59 = null;
        buggycodes.mut_035.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_flip(bitSet59, bitSet60, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet66 = null;
        buggycodes.mut_035.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_flip(bitSet66, bitSet67, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet72 = null;
        buggycodes.mut_035.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_flip(bitSet72, bitSet73, (int) (byte) 1, (int) (short) 10);
        fuzzTest64.FuzzTest_flip(bitSet67, bitSet72, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_flip(bitSet80, bitSet81, (int) (short) 0, (int) '#');
        fuzzTest52.FuzzTest_flip(bitSet59, bitSet80, (int) (short) 100, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet44, bitSet80, 10, 10);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet16, bitSet17, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet22 = null;
        buggycodes.mut_035.BitSet bitSet23 = null;
        fuzzTest21.FuzzTest_flip(bitSet22, bitSet23, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet29 = null;
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_flip(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_flip(bitSet29, bitSet34, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet38 = null;
        fuzzTest21.FuzzTest_flip(bitSet34, bitSet38, 1, (int) '#');
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet43 = null;
        buggycodes.mut_035.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_flip(bitSet43, bitSet44, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet49 = null;
        buggycodes.mut_035.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_flip(bitSet49, bitSet50, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet56 = null;
        buggycodes.mut_035.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_flip(bitSet56, bitSet57, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet62 = null;
        buggycodes.mut_035.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_flip(bitSet62, bitSet63, (int) (byte) 1, (int) (short) 10);
        fuzzTest54.FuzzTest_flip(bitSet57, bitSet62, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_flip(bitSet70, bitSet71, (int) (short) 0, (int) '#');
        fuzzTest42.FuzzTest_flip(bitSet49, bitSet70, (int) (short) 100, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet34, bitSet70, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet8, bitSet13, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_flip(bitSet13, bitSet17, 1, (int) '#');
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet23 = null;
        buggycodes.mut_035.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_flip(bitSet23, bitSet24, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet29 = null;
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_flip(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzzTest21.FuzzTest_flip(bitSet24, bitSet29, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_flip(bitSet37, bitSet38, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet45 = null;
        buggycodes.mut_035.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet52 = null;
        buggycodes.mut_035.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_flip(bitSet52, bitSet53, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet58 = null;
        buggycodes.mut_035.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_flip(bitSet58, bitSet59, (int) (byte) 1, (int) (short) 10);
        fuzzTest50.FuzzTest_flip(bitSet53, bitSet58, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_flip(bitSet66, bitSet67, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet73 = null;
        buggycodes.mut_035.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_flip(bitSet73, bitSet74, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet79 = null;
        buggycodes.mut_035.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_flip(bitSet79, bitSet80, (int) (byte) 1, (int) (short) 10);
        fuzzTest71.FuzzTest_flip(bitSet74, bitSet80, (int) (short) 0, 100);
        fuzzTest44.FuzzTest_flip(bitSet67, bitSet74, (int) (short) 10, 100);
        fuzzTest42.FuzzTest_flip(bitSet43, bitSet67, (int) (short) 10, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet38, bitSet67, (int) '4', 0);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet10 = null;
        buggycodes.mut_035.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_flip(bitSet10, bitSet11, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet16 = null;
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_flip(bitSet16, bitSet17, (int) (byte) 1, (int) (short) 10);
        fuzzTest8.FuzzTest_flip(bitSet11, bitSet16, (int) (byte) 10, (int) '#');
        fuzzTest1.FuzzTest_flip(bitSet7, bitSet16, 10, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet29 = null;
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_flip(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet35 = null;
        buggycodes.mut_035.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_flip(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        fuzzTest27.FuzzTest_flip(bitSet30, bitSet36, (int) (short) 0, 100);
        fuzzTest0.FuzzTest_flip(bitSet7, bitSet30, (int) (byte) 0, (int) ' ');
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet48 = null;
        buggycodes.mut_035.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_flip(bitSet48, bitSet49, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet54 = null;
        buggycodes.mut_035.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet54, bitSet55, (int) (byte) 1, (int) (short) 10);
        fuzzTest46.FuzzTest_flip(bitSet49, bitSet55, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet64 = null;
        buggycodes.mut_035.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_flip(bitSet64, bitSet65, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet69 = null;
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet72 = null;
        buggycodes.mut_035.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_flip(bitSet72, bitSet73, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet78 = null;
        buggycodes.mut_035.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_flip(bitSet78, bitSet79, (int) (byte) 1, (int) (short) 10);
        fuzzTest70.FuzzTest_flip(bitSet73, bitSet79, (int) (short) 0, 100);
        fuzzTest63.FuzzTest_flip(bitSet69, bitSet73, 1, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet89 = null;
        fuzzTest62.FuzzTest_flip(bitSet73, bitSet89, (int) (byte) 100, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet55, bitSet73, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet7 = null;
        buggycodes.mut_035.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet14 = null;
        buggycodes.mut_035.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_flip(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet20 = null;
        buggycodes.mut_035.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_flip(bitSet20, bitSet21, (int) (byte) 1, (int) (short) 10);
        fuzzTest12.FuzzTest_flip(bitSet15, bitSet20, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_flip(bitSet28, bitSet29, (int) (short) 0, (int) '#');
        fuzzTest0.FuzzTest_flip(bitSet7, bitSet28, (int) (short) 100, (int) 'a');
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet37 = null;
        buggycodes.mut_035.BitSet bitSet38 = null;
        fuzzTest36.FuzzTest_flip(bitSet37, bitSet38, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet44 = null;
        buggycodes.mut_035.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_flip(bitSet44, bitSet45, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_flip(bitSet44, bitSet49, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet53 = null;
        fuzzTest36.FuzzTest_flip(bitSet49, bitSet53, 1, (int) '#');
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet58 = null;
        buggycodes.mut_035.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_flip(bitSet58, bitSet59, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet65 = null;
        buggycodes.mut_035.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_flip(bitSet65, bitSet66, (int) (byte) 1, (int) (short) 10);
        fuzzTest57.FuzzTest_flip(bitSet63, bitSet66, 0, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet49, bitSet66, (int) '4', 0);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet15 = null;
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_flip(bitSet15, bitSet16, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet21 = null;
        buggycodes.mut_035.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_flip(bitSet21, bitSet22, (int) (byte) 1, (int) (short) 10);
        fuzzTest13.FuzzTest_flip(bitSet16, bitSet21, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_flip(bitSet29, bitSet30, (int) (short) 0, (int) '#');
        fuzzTest1.FuzzTest_flip(bitSet8, bitSet29, (int) (short) 100, (int) 'a');
        buggycodes.mut_035.BitSet bitSet37 = null;
        fuzzTest0.FuzzTest_flip(bitSet8, bitSet37, (int) '4', (-1));
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet43 = null;
        buggycodes.mut_035.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_flip(bitSet43, bitSet44, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet49 = null;
        buggycodes.mut_035.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_flip(bitSet49, bitSet50, (int) (byte) 1, (int) (short) 10);
        fuzzTest41.FuzzTest_flip(bitSet44, bitSet50, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet59 = null;
        buggycodes.mut_035.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_flip(bitSet59, bitSet60, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet64 = null;
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet67 = null;
        buggycodes.mut_035.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_flip(bitSet67, bitSet68, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet73 = null;
        buggycodes.mut_035.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_flip(bitSet73, bitSet74, (int) (byte) 1, (int) (short) 10);
        fuzzTest65.FuzzTest_flip(bitSet68, bitSet74, (int) (short) 0, 100);
        fuzzTest58.FuzzTest_flip(bitSet64, bitSet68, 1, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet84 = null;
        fuzzTest57.FuzzTest_flip(bitSet68, bitSet84, (int) (byte) 100, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet50, bitSet68, (int) '4', (int) ' ');
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet14 = null;
        buggycodes.mut_035.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_flip(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_flip(bitSet9, bitSet14, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet22, bitSet23, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet29 = null;
        buggycodes.mut_035.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_flip(bitSet29, bitSet30, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet37 = null;
        buggycodes.mut_035.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_flip(bitSet37, bitSet38, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet43 = null;
        buggycodes.mut_035.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_flip(bitSet43, bitSet44, (int) (byte) 1, (int) (short) 10);
        fuzzTest35.FuzzTest_flip(bitSet38, bitSet44, (int) (short) 0, 100);
        fuzzTest28.FuzzTest_flip(bitSet34, bitSet38, 1, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet54 = null;
        fuzzTest27.FuzzTest_flip(bitSet38, bitSet54, (int) (byte) 100, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet60 = null;
        buggycodes.mut_035.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_flip(bitSet60, bitSet61, (int) (byte) 1, (int) (short) 10);
        fuzzTest27.FuzzTest_flip(bitSet58, bitSet61, (int) (short) 10, 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet22, bitSet61, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet14 = null;
        buggycodes.mut_035.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_flip(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        fuzzTest6.FuzzTest_flip(bitSet9, bitSet14, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet23 = null;
        buggycodes.mut_035.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_flip(bitSet23, bitSet24, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet31 = null;
        buggycodes.mut_035.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_flip(bitSet31, bitSet32, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet37 = null;
        buggycodes.mut_035.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_flip(bitSet37, bitSet38, (int) (byte) 1, (int) (short) 10);
        fuzzTest29.FuzzTest_flip(bitSet32, bitSet37, (int) (byte) 10, (int) '#');
        fuzzTest22.FuzzTest_flip(bitSet28, bitSet37, 10, (int) (short) 1);
        fuzzTest0.FuzzTest_flip(bitSet14, bitSet37, 10, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet52 = null;
        buggycodes.mut_035.BitSet bitSet53 = null;
        fuzzTest51.FuzzTest_flip(bitSet52, bitSet53, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet60 = null;
        buggycodes.mut_035.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_flip(bitSet60, bitSet61, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet66 = null;
        buggycodes.mut_035.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_flip(bitSet66, bitSet67, (int) (byte) 1, (int) (short) 10);
        fuzzTest58.FuzzTest_flip(bitSet61, bitSet67, (int) (short) 0, 100);
        fuzzTest51.FuzzTest_flip(bitSet57, bitSet61, 1, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet79 = null;
        buggycodes.mut_035.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_flip(bitSet79, bitSet80, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet85 = null;
        buggycodes.mut_035.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest84.FuzzTest_flip(bitSet85, bitSet86, (int) (byte) 1, (int) (short) 10);
        fuzzTest77.FuzzTest_flip(bitSet80, bitSet86, (int) (short) 0, 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet61, bitSet80, (int) '#', (int) ' ');
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet16, bitSet17, (int) (short) 0, (int) '#');
        buggycodes.mut_035.BitSet bitSet21 = null;
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest22.FuzzTest_flip(bitSet25, bitSet30, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_flip(bitSet38, bitSet39, (int) (short) 0, (int) '#');
        fuzzTest0.FuzzTest_flip(bitSet21, bitSet38, (int) ' ', 1);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet47 = null;
        buggycodes.mut_035.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_flip(bitSet47, bitSet48, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet54 = null;
        buggycodes.mut_035.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet54, bitSet55, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet60 = null;
        buggycodes.mut_035.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_flip(bitSet60, bitSet61, (int) (byte) 1, (int) (short) 10);
        fuzzTest52.FuzzTest_flip(bitSet55, bitSet60, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_flip(bitSet68, bitSet69, (int) (short) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet48, bitSet69, (int) 'a', (int) '#');
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet7 = null;
        buggycodes.mut_035.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet13 = null;
        buggycodes.mut_035.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_flip(bitSet13, bitSet14, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet19 = null;
        buggycodes.mut_035.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_flip(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet26 = null;
        buggycodes.mut_035.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_flip(bitSet26, bitSet27, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet32 = null;
        buggycodes.mut_035.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_flip(bitSet32, bitSet33, (int) (byte) 1, (int) (short) 10);
        fuzzTest24.FuzzTest_flip(bitSet27, bitSet32, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_flip(bitSet40, bitSet41, (int) (short) 0, (int) '#');
        fuzzTest12.FuzzTest_flip(bitSet19, bitSet40, (int) (short) 100, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet8, bitSet40, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet8, bitSet13, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_flip(bitSet13, bitSet17, 1, (int) '#');
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet22 = null;
        buggycodes.mut_035.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_flip(bitSet22, bitSet23, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet29 = null;
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_flip(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_flip(bitSet29, bitSet34, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet40, bitSet45, (int) (short) -1, (int) (byte) 10);
        fuzzTest21.FuzzTest_flip(bitSet34, bitSet45, (int) (short) 1, 10);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet54 = null;
        buggycodes.mut_035.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet54, bitSet55, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_flip(bitSet54, bitSet59, (int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet45, bitSet59, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet15 = null;
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_flip(bitSet15, bitSet16, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet21 = null;
        buggycodes.mut_035.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_flip(bitSet21, bitSet22, (int) (byte) 1, (int) (short) 10);
        fuzzTest13.FuzzTest_flip(bitSet16, bitSet21, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_flip(bitSet29, bitSet30, (int) (short) 0, (int) '#');
        fuzzTest1.FuzzTest_flip(bitSet8, bitSet29, (int) (short) 100, (int) 'a');
        buggycodes.mut_035.BitSet bitSet37 = null;
        fuzzTest0.FuzzTest_flip(bitSet8, bitSet37, (int) '4', (-1));
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet44 = null;
        buggycodes.mut_035.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_flip(bitSet44, bitSet45, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet52 = null;
        buggycodes.mut_035.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_flip(bitSet52, bitSet53, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet58 = null;
        buggycodes.mut_035.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_flip(bitSet58, bitSet59, (int) (byte) 1, (int) (short) 10);
        fuzzTest50.FuzzTest_flip(bitSet53, bitSet59, (int) (short) 0, 100);
        fuzzTest43.FuzzTest_flip(bitSet49, bitSet53, 1, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet69 = null;
        fuzzTest42.FuzzTest_flip(bitSet53, bitSet69, (int) (byte) 100, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet73 = null;
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet75 = null;
        buggycodes.mut_035.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_flip(bitSet75, bitSet76, (int) (byte) 1, (int) (short) 10);
        fuzzTest42.FuzzTest_flip(bitSet73, bitSet76, (int) (short) 10, 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet41, bitSet76, 2, (int) (short) -1);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet9, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet17 = null;
        buggycodes.mut_035.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_flip(bitSet17, bitSet18, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest22.FuzzTest_flip(bitSet25, bitSet31, (int) (short) 0, 100);
        buggycodes.mut_035.BitSet bitSet38 = null;
        fuzzTest16.FuzzTest_flip(bitSet31, bitSet38, (-1), 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet43 = null;
        buggycodes.mut_035.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_flip(bitSet43, bitSet44, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet50 = null;
        buggycodes.mut_035.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_flip(bitSet50, bitSet51, (int) (byte) 1, (int) (short) 10);
        fuzzTest42.FuzzTest_flip(bitSet48, bitSet51, 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet59 = null;
        buggycodes.mut_035.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_flip(bitSet59, bitSet60, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet64 = null;
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet66 = null;
        buggycodes.mut_035.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_flip(bitSet66, bitSet67, (int) (byte) 1, (int) (short) 10);
        fuzzTest58.FuzzTest_flip(bitSet64, bitSet67, 0, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet74 = null;
        fuzzTest42.FuzzTest_flip(bitSet64, bitSet74, (int) (short) -1, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet79 = null;
        buggycodes.mut_035.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_flip(bitSet79, bitSet80, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet85 = null;
        buggycodes.mut_035.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest84.FuzzTest_flip(bitSet85, bitSet86, (int) (byte) 1, (int) (short) 10);
        fuzzTest42.FuzzTest_flip(bitSet79, bitSet86, (int) (short) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet31, bitSet86, (int) 'a', (-1));
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet8, bitSet13, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_flip(bitSet13, bitSet17, 1, (int) '#');
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet23 = null;
        buggycodes.mut_035.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_flip(bitSet23, bitSet24, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet29 = null;
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_flip(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzzTest21.FuzzTest_flip(bitSet24, bitSet29, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet39 = null;
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet45 = null;
        buggycodes.mut_035.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzzTest37.FuzzTest_flip(bitSet40, bitSet46, (int) (short) 0, 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet24, bitSet46, (int) 'a', (int) '#');
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet8, bitSet13, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet18 = null;
        buggycodes.mut_035.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_flip(bitSet18, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet25 = null;
        buggycodes.mut_035.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_flip(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet31 = null;
        buggycodes.mut_035.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_flip(bitSet31, bitSet32, (int) (byte) 1, (int) (short) 10);
        fuzzTest23.FuzzTest_flip(bitSet26, bitSet31, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet39, bitSet40, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet46 = null;
        buggycodes.mut_035.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_flip(bitSet46, bitSet47, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet52 = null;
        buggycodes.mut_035.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_flip(bitSet52, bitSet53, (int) (byte) 1, (int) (short) 10);
        fuzzTest44.FuzzTest_flip(bitSet47, bitSet53, (int) (short) 0, 100);
        fuzzTest17.FuzzTest_flip(bitSet40, bitSet47, (int) (short) 10, 100);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet65 = null;
        buggycodes.mut_035.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_flip(bitSet65, bitSet66, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet71 = null;
        buggycodes.mut_035.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_flip(bitSet71, bitSet72, (int) (byte) 1, (int) (short) 10);
        fuzzTest63.FuzzTest_flip(bitSet66, bitSet71, (int) (byte) 10, (int) '#');
        fuzzTest6.FuzzTest_flip(bitSet47, bitSet71, (int) ' ', (int) 'a');
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet84 = null;
        buggycodes.mut_035.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest83.FuzzTest_flip(bitSet84, bitSet85, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_flip(bitSet84, bitSet89, (int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet47, bitSet89, (int) (short) -1, 2);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet10 = null;
        buggycodes.mut_035.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_flip(bitSet10, bitSet11, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet16 = null;
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_flip(bitSet16, bitSet17, (int) (byte) 1, (int) (short) 10);
        fuzzTest8.FuzzTest_flip(bitSet11, bitSet17, (int) (short) 0, 100);
        fuzzTest1.FuzzTest_flip(bitSet7, bitSet11, 1, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_flip(bitSet11, bitSet27, (int) (byte) 100, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet33 = null;
        buggycodes.mut_035.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_flip(bitSet33, bitSet34, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet31, bitSet34, (int) (short) 10, 2);
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet43 = null;
        buggycodes.mut_035.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_flip(bitSet43, bitSet44, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet50 = null;
        buggycodes.mut_035.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_flip(bitSet50, bitSet51, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_flip(bitSet50, bitSet55, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet59 = null;
        fuzzTest42.FuzzTest_flip(bitSet55, bitSet59, 1, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet41, bitSet55, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet8, bitSet13, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_flip(bitSet13, bitSet17, 1, (int) '#');
        buggycodes.mut_035.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet23 = null;
        buggycodes.mut_035.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_flip(bitSet23, bitSet24, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet28 = null;
        buggycodes.mut_035.BitSet bitSet29 = null;
        fuzzTest22.FuzzTest_flip(bitSet28, bitSet29, (int) '4', (int) (short) 1);
        buggycodes.mut_035.BitSet bitSet33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet36 = null;
        buggycodes.mut_035.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_flip(bitSet36, bitSet37, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet43 = null;
        buggycodes.mut_035.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_flip(bitSet43, bitSet44, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet49 = null;
        buggycodes.mut_035.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_flip(bitSet49, bitSet50, (int) (byte) 1, (int) (short) 10);
        fuzzTest41.FuzzTest_flip(bitSet44, bitSet50, (int) (short) 0, 100);
        buggycodes.mut_035.BitSet bitSet57 = null;
        fuzzTest35.FuzzTest_flip(bitSet50, bitSet57, (-1), 0);
        buggycodes.mut_035.BitSet bitSet61 = null;
        fuzzTest34.FuzzTest_flip(bitSet50, bitSet61, (int) (short) 10, (int) (byte) 10);
        fuzzTest22.FuzzTest_flip(bitSet33, bitSet50, (int) ' ', (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet21, bitSet50, (-1), (int) (short) -1);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet17 = null;
        buggycodes.mut_035.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_flip(bitSet17, bitSet18, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest22.FuzzTest_flip(bitSet25, bitSet31, (int) (short) 0, 100);
        fuzzTest0.FuzzTest_flip(bitSet17, bitSet31, (int) (byte) 100, (int) (byte) 100);
        buggycodes.mut_035.BitSet bitSet41 = null;
        buggycodes.mut_035.BitSet bitSet42 = null;
        fuzzTest0.FuzzTest_flip(bitSet41, bitSet42, (int) (byte) 10, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet48 = null;
        buggycodes.mut_035.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_flip(bitSet48, bitSet49, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet54 = null;
        buggycodes.mut_035.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet54, bitSet55, (int) (byte) 1, (int) (short) 10);
        fuzzTest46.FuzzTest_flip(bitSet49, bitSet54, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet63 = null;
        buggycodes.mut_035.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_flip(bitSet63, bitSet64, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet70 = null;
        buggycodes.mut_035.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_flip(bitSet70, bitSet71, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_flip(bitSet70, bitSet75, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet79 = null;
        fuzzTest62.FuzzTest_flip(bitSet75, bitSet79, 1, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet49, bitSet75, (int) (byte) 100, 100);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet7 = null;
        buggycodes.mut_035.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet14 = null;
        buggycodes.mut_035.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_flip(bitSet14, bitSet15, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_flip(bitSet14, bitSet19, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet25 = null;
        buggycodes.mut_035.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_flip(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet25, bitSet30, (int) (short) -1, (int) (byte) 10);
        fuzzTest6.FuzzTest_flip(bitSet19, bitSet30, (int) (short) 1, 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet38 = null;
        buggycodes.mut_035.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_flip(bitSet38, bitSet39, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet45 = null;
        buggycodes.mut_035.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet52 = null;
        buggycodes.mut_035.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_flip(bitSet52, bitSet53, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_flip(bitSet52, bitSet57, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet63 = null;
        buggycodes.mut_035.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_flip(bitSet63, bitSet64, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_flip(bitSet63, bitSet68, (int) (short) -1, (int) (byte) 10);
        fuzzTest44.FuzzTest_flip(bitSet57, bitSet68, (int) (short) 1, 10);
        fuzzTest37.FuzzTest_flip(bitSet43, bitSet57, (int) 'a', (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet19, bitSet57, (-1), 1);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet15 = null;
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_flip(bitSet15, bitSet16, (int) (byte) 1, (int) (short) 10);
        fuzzTest7.FuzzTest_flip(bitSet10, bitSet15, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet23, bitSet24, (int) (short) 0, (int) '#');
        fuzzTest0.FuzzTest_flip(bitSet6, bitSet23, (int) (byte) 10, 1);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet33 = null;
        buggycodes.mut_035.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_flip(bitSet33, bitSet34, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet39 = null;
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzzTest31.FuzzTest_flip(bitSet34, bitSet40, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet48 = null;
        buggycodes.mut_035.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_flip(bitSet48, bitSet49, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet55 = null;
        buggycodes.mut_035.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_flip(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet55, bitSet60, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet66 = null;
        buggycodes.mut_035.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_flip(bitSet66, bitSet67, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_flip(bitSet66, bitSet71, (int) (short) -1, (int) (byte) 10);
        fuzzTest47.FuzzTest_flip(bitSet60, bitSet71, (int) (short) 1, 10);
        buggycodes.mut_035.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet79 = null;
        fuzzTest47.FuzzTest_flip(bitSet78, bitSet79, 2, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet40, bitSet78, (int) (byte) -1, 2);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet10 = null;
        buggycodes.mut_035.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_flip(bitSet10, bitSet11, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet16 = null;
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_flip(bitSet16, bitSet17, (int) (byte) 1, (int) (short) 10);
        fuzzTest8.FuzzTest_flip(bitSet11, bitSet17, (int) (short) 0, 100);
        fuzzTest1.FuzzTest_flip(bitSet7, bitSet11, 1, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_flip(bitSet11, bitSet27, (int) (byte) 100, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet34 = null;
        buggycodes.mut_035.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_flip(bitSet34, bitSet35, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        fuzzTest32.FuzzTest_flip(bitSet35, bitSet41, (int) (short) 0, 100);
        fuzzTest0.FuzzTest_flip(bitSet31, bitSet41, (int) (short) 100, 0);
        buggycodes.mut_035.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet54 = null;
        buggycodes.mut_035.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet54, bitSet55, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet61 = null;
        buggycodes.mut_035.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_flip(bitSet61, bitSet62, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet67 = null;
        buggycodes.mut_035.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_flip(bitSet67, bitSet68, (int) (byte) 1, (int) (short) 10);
        fuzzTest59.FuzzTest_flip(bitSet62, bitSet68, (int) (short) 0, 100);
        buggycodes.mut_035.BitSet bitSet75 = null;
        fuzzTest53.FuzzTest_flip(bitSet68, bitSet75, (-1), 0);
        buggycodes.mut_035.BitSet bitSet79 = null;
        fuzzTest52.FuzzTest_flip(bitSet68, bitSet79, (int) (short) 10, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet51, bitSet68, 1, 2);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet10 = null;
        buggycodes.mut_035.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_flip(bitSet10, bitSet11, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet16 = null;
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_flip(bitSet16, bitSet17, (int) (byte) 1, (int) (short) 10);
        fuzzTest8.FuzzTest_flip(bitSet11, bitSet16, (int) (byte) 10, (int) '#');
        fuzzTest1.FuzzTest_flip(bitSet7, bitSet16, 10, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet29 = null;
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_flip(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet35 = null;
        buggycodes.mut_035.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_flip(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        fuzzTest27.FuzzTest_flip(bitSet30, bitSet36, (int) (short) 0, 100);
        fuzzTest0.FuzzTest_flip(bitSet7, bitSet30, (int) (byte) 0, (int) ' ');
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet47 = null;
        buggycodes.mut_035.BitSet bitSet48 = null;
        fuzzTest46.FuzzTest_flip(bitSet47, bitSet48, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet54 = null;
        buggycodes.mut_035.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet54, bitSet55, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_flip(bitSet54, bitSet59, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet63 = null;
        fuzzTest46.FuzzTest_flip(bitSet59, bitSet63, 1, (int) '#');
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet68 = null;
        buggycodes.mut_035.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_flip(bitSet68, bitSet69, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet75 = null;
        buggycodes.mut_035.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_flip(bitSet75, bitSet76, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_flip(bitSet75, bitSet80, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet84 = null;
        fuzzTest67.FuzzTest_flip(bitSet80, bitSet84, 1, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet59, bitSet80, (int) '#', 1);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet15 = null;
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_flip(bitSet15, bitSet16, (int) (byte) 1, (int) (short) 10);
        fuzzTest7.FuzzTest_flip(bitSet10, bitSet16, (int) (short) 0, 100);
        fuzzTest0.FuzzTest_flip(bitSet6, bitSet10, 1, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet27 = null;
        buggycodes.mut_035.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_flip(bitSet27, bitSet28, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet34 = null;
        buggycodes.mut_035.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_flip(bitSet34, bitSet35, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_flip(bitSet34, bitSet39, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet45 = null;
        buggycodes.mut_035.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_flip(bitSet45, bitSet50, (int) (short) -1, (int) (byte) 10);
        fuzzTest26.FuzzTest_flip(bitSet39, bitSet50, (int) (short) 1, 10);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet58 = null;
        buggycodes.mut_035.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_flip(bitSet58, bitSet59, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet65 = null;
        buggycodes.mut_035.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_flip(bitSet65, bitSet66, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_flip(bitSet65, bitSet70, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet76 = null;
        buggycodes.mut_035.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_flip(bitSet76, bitSet77, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_flip(bitSet76, bitSet81, (int) (short) -1, (int) (byte) 10);
        fuzzTest57.FuzzTest_flip(bitSet70, bitSet81, (int) (short) 1, 10);
        buggycodes.mut_035.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet89 = null;
        fuzzTest57.FuzzTest_flip(bitSet88, bitSet89, 2, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet39, bitSet88, (int) (short) 100, (-1));
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet15 = null;
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_flip(bitSet15, bitSet16, (int) (byte) 1, (int) (short) 10);
        fuzzTest7.FuzzTest_flip(bitSet10, bitSet16, (int) (short) 0, 100);
        buggycodes.mut_035.BitSet bitSet23 = null;
        fuzzTest1.FuzzTest_flip(bitSet16, bitSet23, (-1), 0);
        buggycodes.mut_035.BitSet bitSet27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet36 = null;
        buggycodes.mut_035.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_flip(bitSet36, bitSet37, (int) (byte) 1, (int) (short) 10);
        fuzzTest28.FuzzTest_flip(bitSet31, bitSet37, (int) (short) 0, 100);
        fuzzTest1.FuzzTest_flip(bitSet27, bitSet37, (int) (short) -1, (int) ' ');
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet49 = null;
        buggycodes.mut_035.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_flip(bitSet49, bitSet50, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet55 = null;
        buggycodes.mut_035.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_flip(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzzTest47.FuzzTest_flip(bitSet50, bitSet55, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_flip(bitSet63, bitSet64, (int) (short) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet37, bitSet64, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet6 = null;
        buggycodes.mut_035.BitSet bitSet7 = null;
        fuzzTest0.FuzzTest_flip(bitSet6, bitSet7, (int) '4', (int) (short) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet13 = null;
        buggycodes.mut_035.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_flip(bitSet13, bitSet14, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet19 = null;
        buggycodes.mut_035.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_flip(bitSet19, bitSet20, (int) (byte) 1, (int) (short) 10);
        fuzzTest11.FuzzTest_flip(bitSet14, bitSet19, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet28 = null;
        buggycodes.mut_035.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_flip(bitSet28, bitSet29, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet35 = null;
        buggycodes.mut_035.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_flip(bitSet35, bitSet36, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet41 = null;
        buggycodes.mut_035.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_flip(bitSet41, bitSet42, (int) (byte) 1, (int) (short) 10);
        fuzzTest33.FuzzTest_flip(bitSet36, bitSet41, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet50 = null;
        buggycodes.mut_035.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_flip(bitSet50, bitSet51, (int) (byte) 1, (int) (short) 10);
        fuzzTest27.FuzzTest_flip(bitSet41, bitSet50, (int) (short) 100, (int) 'a');
        buggycodes.mut_035.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet60 = null;
        buggycodes.mut_035.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_flip(bitSet60, bitSet61, (int) (byte) 1, (int) (short) 10);
        fuzzTest27.FuzzTest_flip(bitSet58, bitSet60, (-1), (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet14, bitSet58, (int) (short) 1, (-1));
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet3 = null;
        buggycodes.mut_035.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_flip(bitSet3, bitSet4, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet16 = null;
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_flip(bitSet16, bitSet17, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet22 = null;
        buggycodes.mut_035.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_flip(bitSet22, bitSet23, (int) (byte) 1, (int) (short) 10);
        fuzzTest14.FuzzTest_flip(bitSet17, bitSet22, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_flip(bitSet30, bitSet31, (int) (short) 0, (int) '#');
        fuzzTest2.FuzzTest_flip(bitSet9, bitSet30, (int) (short) 100, (int) 'a');
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet9, (int) ' ', (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet42 = null;
        buggycodes.mut_035.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_flip(bitSet42, bitSet43, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet47 = null;
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet50 = null;
        buggycodes.mut_035.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_flip(bitSet50, bitSet51, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet56 = null;
        buggycodes.mut_035.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_flip(bitSet56, bitSet57, (int) (byte) 1, (int) (short) 10);
        fuzzTest48.FuzzTest_flip(bitSet51, bitSet56, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_flip(bitSet64, bitSet65, (int) (short) 0, (int) '#');
        fuzzTest41.FuzzTest_flip(bitSet47, bitSet64, (int) (byte) 10, 1);
        buggycodes.mut_035.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet64, bitSet72, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet10 = null;
        buggycodes.mut_035.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_flip(bitSet10, bitSet11, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet16 = null;
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_flip(bitSet16, bitSet17, (int) (byte) 1, (int) (short) 10);
        fuzzTest8.FuzzTest_flip(bitSet11, bitSet17, (int) (short) 0, 100);
        fuzzTest1.FuzzTest_flip(bitSet7, bitSet11, 1, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_flip(bitSet11, bitSet27, (int) (byte) 100, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet31 = null;
        buggycodes.mut_035.BitSet bitSet32 = null;
        fuzzTest0.FuzzTest_flip(bitSet31, bitSet32, (int) (short) -1, 0);
        buggycodes.mut_035.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet39 = null;
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet45 = null;
        buggycodes.mut_035.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet45, bitSet46, (int) (byte) 1, (int) (short) 10);
        fuzzTest37.FuzzTest_flip(bitSet40, bitSet45, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_flip(bitSet53, bitSet54, (int) (short) 0, (int) '#');
        buggycodes.mut_035.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet61 = null;
        buggycodes.mut_035.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_flip(bitSet61, bitSet62, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet67 = null;
        buggycodes.mut_035.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_flip(bitSet67, bitSet68, (int) (byte) 1, (int) (short) 10);
        fuzzTest59.FuzzTest_flip(bitSet62, bitSet67, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_flip(bitSet75, bitSet76, (int) (short) 0, (int) '#');
        fuzzTest37.FuzzTest_flip(bitSet58, bitSet75, 2, (int) '4');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet36, bitSet58, (-1), 0);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_flip(bitSet2, bitSet7, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet12 = null;
        buggycodes.mut_035.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_flip(bitSet12, bitSet13, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet18 = null;
        buggycodes.mut_035.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_flip(bitSet18, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet25 = null;
        buggycodes.mut_035.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_flip(bitSet25, bitSet26, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet31 = null;
        buggycodes.mut_035.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_flip(bitSet31, bitSet32, (int) (byte) 1, (int) (short) 10);
        fuzzTest23.FuzzTest_flip(bitSet26, bitSet31, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet47 = null;
        buggycodes.mut_035.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_flip(bitSet47, bitSet48, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet53 = null;
        buggycodes.mut_035.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_flip(bitSet53, bitSet54, (int) (byte) 1, (int) (short) 10);
        fuzzTest45.FuzzTest_flip(bitSet48, bitSet54, (int) (short) 0, 100);
        fuzzTest23.FuzzTest_flip(bitSet40, bitSet54, (int) (byte) 100, (int) (byte) 100);
        fuzzTest11.FuzzTest_flip(bitSet18, bitSet54, (int) (byte) 1, (int) 'a');
        buggycodes.mut_035.BitSet bitSet67 = null;
        fuzzTest0.FuzzTest_flip(bitSet54, bitSet67, (int) (byte) 10, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet72 = null;
        buggycodes.mut_035.BitSet bitSet73 = null;
        fuzzTest71.FuzzTest_flip(bitSet72, bitSet73, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet79 = null;
        buggycodes.mut_035.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_flip(bitSet79, bitSet80, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_flip(bitSet79, bitSet84, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet88 = null;
        fuzzTest71.FuzzTest_flip(bitSet84, bitSet88, 1, (int) '#');
        buggycodes.mut_035.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet84, bitSet92, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet15 = null;
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_flip(bitSet15, bitSet16, (int) (byte) 1, (int) (short) 10);
        fuzzTest7.FuzzTest_flip(bitSet10, bitSet15, (int) (byte) 10, (int) '#');
        fuzzTest0.FuzzTest_flip(bitSet6, bitSet15, 10, (int) (short) 1);
        buggycodes.mut_035.BitSet bitSet26 = null;
        buggycodes.mut_035.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_flip(bitSet26, bitSet27, 0, 2);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet32 = null;
        buggycodes.mut_035.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_flip(bitSet32, bitSet33, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet38 = null;
        buggycodes.mut_035.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_flip(bitSet38, bitSet39, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet46 = null;
        buggycodes.mut_035.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_flip(bitSet46, bitSet47, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet52 = null;
        buggycodes.mut_035.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_flip(bitSet52, bitSet53, (int) (byte) 1, (int) (short) 10);
        fuzzTest44.FuzzTest_flip(bitSet47, bitSet52, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet60, bitSet61, (int) (short) 0, (int) '#');
        fuzzTest37.FuzzTest_flip(bitSet43, bitSet60, (int) (byte) 10, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet33, bitSet60, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet3 = null;
        buggycodes.mut_035.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_flip(bitSet3, bitSet4, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet16 = null;
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_flip(bitSet16, bitSet17, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet22 = null;
        buggycodes.mut_035.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_flip(bitSet22, bitSet23, (int) (byte) 1, (int) (short) 10);
        fuzzTest14.FuzzTest_flip(bitSet17, bitSet22, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_flip(bitSet30, bitSet31, (int) (short) 0, (int) '#');
        fuzzTest2.FuzzTest_flip(bitSet9, bitSet30, (int) (short) 100, (int) 'a');
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet9, (int) ' ', (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet41 = null;
        buggycodes.mut_035.BitSet bitSet42 = null;
        fuzzTest0.FuzzTest_flip(bitSet41, bitSet42, 2, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet47 = null;
        buggycodes.mut_035.BitSet bitSet48 = null;
        fuzzTest46.FuzzTest_flip(bitSet47, bitSet48, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet55 = null;
        buggycodes.mut_035.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_flip(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet61 = null;
        buggycodes.mut_035.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_flip(bitSet61, bitSet62, (int) (byte) 1, (int) (short) 10);
        fuzzTest53.FuzzTest_flip(bitSet56, bitSet62, (int) (short) 0, 100);
        fuzzTest46.FuzzTest_flip(bitSet52, bitSet56, 1, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet74 = null;
        buggycodes.mut_035.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_flip(bitSet74, bitSet75, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet80 = null;
        buggycodes.mut_035.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_flip(bitSet80, bitSet81, (int) (byte) 1, (int) (short) 10);
        fuzzTest72.FuzzTest_flip(bitSet75, bitSet80, (int) (byte) 10, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet56, bitSet75, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet15 = null;
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_flip(bitSet15, bitSet16, (int) (byte) 1, (int) (short) 10);
        fuzzTest7.FuzzTest_flip(bitSet10, bitSet16, (int) (short) 0, 100);
        fuzzTest0.FuzzTest_flip(bitSet6, bitSet10, 1, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet28 = null;
        buggycodes.mut_035.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_flip(bitSet28, bitSet29, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet34 = null;
        buggycodes.mut_035.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_flip(bitSet34, bitSet35, (int) (byte) 1, (int) (short) 10);
        fuzzTest26.FuzzTest_flip(bitSet29, bitSet35, (int) (short) 0, 100);
        buggycodes.mut_035.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet35, bitSet42, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet10 = null;
        buggycodes.mut_035.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_flip(bitSet10, bitSet11, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet16 = null;
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_flip(bitSet16, bitSet17, (int) (byte) 1, (int) (short) 10);
        fuzzTest8.FuzzTest_flip(bitSet11, bitSet17, (int) (short) 0, 100);
        fuzzTest1.FuzzTest_flip(bitSet7, bitSet11, 1, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_flip(bitSet11, bitSet27, (int) (byte) 100, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet31 = null;
        buggycodes.mut_035.BitSet bitSet32 = null;
        fuzzTest0.FuzzTest_flip(bitSet31, bitSet32, (int) (byte) 10, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet38 = null;
        buggycodes.mut_035.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_flip(bitSet38, bitSet39, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet44 = null;
        buggycodes.mut_035.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_flip(bitSet44, bitSet45, (int) (byte) 1, (int) (short) 10);
        fuzzTest36.FuzzTest_flip(bitSet39, bitSet45, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet53 = null;
        buggycodes.mut_035.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_flip(bitSet53, bitSet54, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet61 = null;
        buggycodes.mut_035.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_flip(bitSet61, bitSet62, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet67 = null;
        buggycodes.mut_035.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_flip(bitSet67, bitSet68, (int) (byte) 1, (int) (short) 10);
        fuzzTest59.FuzzTest_flip(bitSet62, bitSet68, (int) (short) 0, 100);
        fuzzTest52.FuzzTest_flip(bitSet58, bitSet62, 1, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet45, bitSet62, 10, 1);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test91");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet9, bitSet14, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet18 = null;
        fuzzTest1.FuzzTest_flip(bitSet14, bitSet18, 1, (int) '#');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet30 = null;
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_flip(bitSet30, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest22.FuzzTest_flip(bitSet25, bitSet31, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet39 = null;
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet46 = null;
        buggycodes.mut_035.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_flip(bitSet46, bitSet47, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet52 = null;
        buggycodes.mut_035.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_flip(bitSet52, bitSet53, (int) (byte) 1, (int) (short) 10);
        fuzzTest44.FuzzTest_flip(bitSet47, bitSet52, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_flip(bitSet60, bitSet61, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet67 = null;
        buggycodes.mut_035.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_flip(bitSet67, bitSet68, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet73 = null;
        buggycodes.mut_035.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_flip(bitSet73, bitSet74, (int) (byte) 1, (int) (short) 10);
        fuzzTest65.FuzzTest_flip(bitSet68, bitSet74, (int) (short) 0, 100);
        fuzzTest38.FuzzTest_flip(bitSet61, bitSet68, (int) (short) 10, 100);
        buggycodes.mut_035.BitSet bitSet84 = null;
        fuzzTest22.FuzzTest_flip(bitSet61, bitSet84, (int) (byte) 100, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet14, bitSet61, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test92");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet10 = null;
        buggycodes.mut_035.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_flip(bitSet10, bitSet11, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet16 = null;
        buggycodes.mut_035.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_flip(bitSet16, bitSet17, (int) (byte) 1, (int) (short) 10);
        fuzzTest8.FuzzTest_flip(bitSet11, bitSet17, (int) (short) 0, 100);
        fuzzTest1.FuzzTest_flip(bitSet7, bitSet11, 1, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_flip(bitSet11, bitSet27, (int) (byte) 100, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet33 = null;
        buggycodes.mut_035.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_flip(bitSet33, bitSet34, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet39 = null;
        buggycodes.mut_035.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet39, bitSet40, (int) (byte) 1, (int) (short) 10);
        fuzzTest31.FuzzTest_flip(bitSet34, bitSet40, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet48 = null;
        buggycodes.mut_035.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_flip(bitSet48, bitSet49, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet55 = null;
        buggycodes.mut_035.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_flip(bitSet55, bitSet56, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet55, bitSet60, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet66 = null;
        buggycodes.mut_035.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_flip(bitSet66, bitSet67, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_flip(bitSet66, bitSet71, (int) (short) -1, (int) (byte) 10);
        fuzzTest47.FuzzTest_flip(bitSet60, bitSet71, (int) (short) 1, 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet34, bitSet71, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test93");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet8, bitSet13, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_flip(bitSet13, bitSet17, 1, (int) '#');
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet22 = null;
        buggycodes.mut_035.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_flip(bitSet22, bitSet23, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet29 = null;
        buggycodes.mut_035.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_flip(bitSet29, bitSet30, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_flip(bitSet29, bitSet34, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet40 = null;
        buggycodes.mut_035.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_flip(bitSet40, bitSet41, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_flip(bitSet40, bitSet45, (int) (short) -1, (int) (byte) 10);
        fuzzTest21.FuzzTest_flip(bitSet34, bitSet45, (int) (short) 1, 10);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet54 = null;
        buggycodes.mut_035.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_flip(bitSet54, bitSet55, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet60 = null;
        buggycodes.mut_035.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_flip(bitSet60, bitSet61, (int) (byte) 1, (int) (short) 10);
        fuzzTest52.FuzzTest_flip(bitSet55, bitSet60, (int) (byte) 10, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet34, bitSet55, (int) '4', 1);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test94");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet9 = null;
        buggycodes.mut_035.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_flip(bitSet9, bitSet10, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet15 = null;
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_flip(bitSet15, bitSet16, (int) (byte) 1, (int) (short) 10);
        fuzzTest7.FuzzTest_flip(bitSet10, bitSet16, (int) (short) 0, 100);
        fuzzTest0.FuzzTest_flip(bitSet6, bitSet10, 1, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet27 = null;
        buggycodes.mut_035.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_flip(bitSet27, bitSet28, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet32 = null;
        buggycodes.mut_035.BitSet bitSet33 = null;
        fuzzTest26.FuzzTest_flip(bitSet32, bitSet33, (int) '4', (int) (short) 1);
        buggycodes.mut_035.BitSet bitSet37 = null;
        buggycodes.mut_035.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_flip(bitSet37, bitSet38, (int) 'a', 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet44 = null;
        buggycodes.mut_035.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_flip(bitSet44, bitSet45, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet52 = null;
        buggycodes.mut_035.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_flip(bitSet52, bitSet53, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet58 = null;
        buggycodes.mut_035.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_flip(bitSet58, bitSet59, (int) (byte) 1, (int) (short) 10);
        fuzzTest50.FuzzTest_flip(bitSet53, bitSet59, (int) (short) 0, 100);
        fuzzTest43.FuzzTest_flip(bitSet49, bitSet53, 1, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet69 = null;
        fuzzTest42.FuzzTest_flip(bitSet53, bitSet69, (int) (byte) 100, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet73 = null;
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet75 = null;
        buggycodes.mut_035.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_flip(bitSet75, bitSet76, (int) (byte) 1, (int) (short) 10);
        fuzzTest42.FuzzTest_flip(bitSet73, bitSet76, (int) (short) 10, 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet38, bitSet76, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test95");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet18 = null;
        buggycodes.mut_035.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_flip(bitSet18, bitSet19, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet26 = null;
        buggycodes.mut_035.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_flip(bitSet26, bitSet27, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet32 = null;
        buggycodes.mut_035.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_flip(bitSet32, bitSet33, (int) (byte) 1, (int) (short) 10);
        fuzzTest24.FuzzTest_flip(bitSet27, bitSet33, (int) (short) 0, 100);
        fuzzTest17.FuzzTest_flip(bitSet23, bitSet27, 1, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet43 = null;
        fuzzTest16.FuzzTest_flip(bitSet27, bitSet43, (int) (byte) 100, (int) (byte) -1);
        buggycodes.mut_035.BitSet bitSet47 = null;
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet50 = null;
        buggycodes.mut_035.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_flip(bitSet50, bitSet51, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_flip(bitSet50, bitSet55, (int) (short) -1, (int) (byte) 10);
        fuzzTest16.FuzzTest_flip(bitSet47, bitSet55, (int) '#', 100);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet64 = null;
        buggycodes.mut_035.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_flip(bitSet64, bitSet65, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_flip(bitSet64, bitSet69, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet73 = null;
        fuzzTest16.FuzzTest_flip(bitSet69, bitSet73, (int) (short) 100, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet78 = null;
        buggycodes.mut_035.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_flip(bitSet78, bitSet79, (int) (byte) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet69, bitSet79, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test96");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet15 = null;
        buggycodes.mut_035.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_flip(bitSet15, bitSet16, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_flip(bitSet15, bitSet20, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet26 = null;
        buggycodes.mut_035.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_flip(bitSet26, bitSet27, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_flip(bitSet26, bitSet31, (int) (short) -1, (int) (byte) 10);
        fuzzTest7.FuzzTest_flip(bitSet20, bitSet31, (int) (short) 1, 10);
        fuzzTest0.FuzzTest_flip(bitSet6, bitSet20, (int) 'a', (-1));
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet43 = null;
        buggycodes.mut_035.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_flip(bitSet43, bitSet44, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet49 = null;
        buggycodes.mut_035.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_flip(bitSet49, bitSet50, (int) (byte) 1, (int) (short) 10);
        fuzzTest41.FuzzTest_flip(bitSet44, bitSet50, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet59 = null;
        buggycodes.mut_035.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_flip(bitSet59, bitSet60, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_flip(bitSet59, bitSet64, (int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet50, bitSet64, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test97");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet2 = null;
        buggycodes.mut_035.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_flip(bitSet2, bitSet3, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet8 = null;
        buggycodes.mut_035.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_flip(bitSet8, bitSet9, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_flip(bitSet3, bitSet8, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet17 = null;
        buggycodes.mut_035.BitSet bitSet18 = null;
        fuzzTest16.FuzzTest_flip(bitSet17, bitSet18, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet24 = null;
        buggycodes.mut_035.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_flip(bitSet24, bitSet25, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_flip(bitSet24, bitSet29, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_035.BitSet bitSet33 = null;
        fuzzTest16.FuzzTest_flip(bitSet29, bitSet33, 1, (int) '#');
        buggycodes.mut_035.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet38 = null;
        fuzzTest16.FuzzTest_flip(bitSet37, bitSet38, (int) '#', (int) '4');
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet43 = null;
        buggycodes.mut_035.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_flip(bitSet43, bitSet44, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet51 = null;
        buggycodes.mut_035.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_flip(bitSet51, bitSet52, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet57 = null;
        buggycodes.mut_035.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_flip(bitSet57, bitSet58, (int) (byte) 1, (int) (short) 10);
        fuzzTest49.FuzzTest_flip(bitSet52, bitSet57, (int) (byte) 10, (int) '#');
        fuzzTest42.FuzzTest_flip(bitSet48, bitSet57, 10, (int) (short) 1);
        buggycodes.mut_035.BitSet bitSet68 = null;
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet71 = null;
        buggycodes.mut_035.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_flip(bitSet71, bitSet72, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet77 = null;
        buggycodes.mut_035.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_flip(bitSet77, bitSet78, (int) (byte) 1, (int) (short) 10);
        fuzzTest69.FuzzTest_flip(bitSet72, bitSet77, (int) (byte) 10, (int) '#');
        buggycodes.mut_035.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_035.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_flip(bitSet85, bitSet86, (int) (short) 0, (int) '#');
        fuzzTest42.FuzzTest_flip(bitSet68, bitSet86, (int) (byte) 100, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet37, bitSet86, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test98");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet1 = null;
        buggycodes.mut_035.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_flip(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet7 = null;
        buggycodes.mut_035.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_flip(bitSet7, bitSet8, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet12 = null;
        buggycodes.mut_035.BitSet bitSet13 = null;
        fuzzTest6.FuzzTest_flip(bitSet12, bitSet13, (int) '4', (int) (short) 1);
        buggycodes.mut_035.BitSet bitSet17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet20 = null;
        buggycodes.mut_035.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_flip(bitSet20, bitSet21, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet27 = null;
        buggycodes.mut_035.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_flip(bitSet27, bitSet28, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet33 = null;
        buggycodes.mut_035.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_flip(bitSet33, bitSet34, (int) (byte) 1, (int) (short) 10);
        fuzzTest25.FuzzTest_flip(bitSet28, bitSet34, (int) (short) 0, 100);
        buggycodes.mut_035.BitSet bitSet41 = null;
        fuzzTest19.FuzzTest_flip(bitSet34, bitSet41, (-1), 0);
        buggycodes.mut_035.BitSet bitSet45 = null;
        fuzzTest18.FuzzTest_flip(bitSet34, bitSet45, (int) (short) 10, (int) (byte) 10);
        fuzzTest6.FuzzTest_flip(bitSet17, bitSet34, (int) ' ', (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet53 = null;
        buggycodes.mut_035.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_flip(bitSet53, bitSet54, 0, (int) (byte) 0);
        buggycodes.mut_035.BitSet bitSet58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet60 = null;
        buggycodes.mut_035.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_flip(bitSet60, bitSet61, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet67 = null;
        buggycodes.mut_035.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_flip(bitSet67, bitSet68, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_flip(bitSet67, bitSet72, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggycodes.mut_035.BitSet bitSet78 = null;
        buggycodes.mut_035.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_flip(bitSet78, bitSet79, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_035.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_flip(bitSet78, bitSet83, (int) (short) -1, (int) (byte) 10);
        fuzzTest59.FuzzTest_flip(bitSet72, bitSet83, (int) (short) 1, 10);
        fuzzTest52.FuzzTest_flip(bitSet58, bitSet72, (int) 'a', (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_flip(bitSet34, bitSet72, (int) (byte) 10, 1);
    }
}

