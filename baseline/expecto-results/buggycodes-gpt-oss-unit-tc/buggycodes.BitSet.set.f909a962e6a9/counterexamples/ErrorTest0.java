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
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet15 = null;
        buggycodes.mut_033.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet21, bitSet22, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet22, bitSet27, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet33 = null;
        buggycodes.mut_033.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_set(bitSet33, bitSet34, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_set(bitSet39, bitSet40, (int) ' ', (int) (short) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet22, bitSet39, (-1), 100, false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet2 = null;
        buggycodes.mut_033.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet8, bitSet9, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet9, bitSet14, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet21 = null;
        buggycodes.mut_033.BitSet bitSet22 = null;
        fuzzTest20.FuzzTest_set(bitSet21, bitSet22, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_set(bitSet27, bitSet28, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_set(bitSet28, bitSet33, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet40 = null;
        buggycodes.mut_033.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_set(bitSet40, bitSet41, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_set(bitSet46, bitSet47, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet47, bitSet52, (int) '4', 1, true);
        fuzzTest0.FuzzTest_set(bitSet28, bitSet52, (int) (byte) 1, 0, true);
        buggycodes.mut_033.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet61, bitSet62, (int) (byte) 0, (int) (short) 1, false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0, true);
        buggycodes.mut_033.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, 1, (int) (short) 100, true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet14 = null;
        buggycodes.mut_033.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet21 = null;
        buggycodes.mut_033.BitSet bitSet22 = null;
        fuzzTest20.FuzzTest_set(bitSet21, bitSet22, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_set(bitSet27, bitSet28, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet34 = null;
        buggycodes.mut_033.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_set(bitSet34, bitSet35, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_set(bitSet40, bitSet41, (int) ' ', (int) (short) 1, false);
        fuzzTest13.FuzzTest_set(bitSet27, bitSet41, 100, (int) ' ', false);
        buggycodes.mut_033.BitSet bitSet50 = null;
        fuzzTest0.FuzzTest_set(bitSet41, bitSet50, (int) ' ', (int) (byte) 10, false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet56 = null;
        buggycodes.mut_033.BitSet bitSet57 = null;
        fuzzTest55.FuzzTest_set(bitSet56, bitSet57, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_set(bitSet62, bitSet63, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet70 = null;
        buggycodes.mut_033.BitSet bitSet71 = null;
        fuzzTest69.FuzzTest_set(bitSet70, bitSet71, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_set(bitSet76, bitSet77, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_set(bitSet77, bitSet82, (int) '4', 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet63, bitSet82, (int) (short) 1, (int) (short) 10, true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet3 = null;
        buggycodes.mut_033.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_set(bitSet3, bitSet4, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_set(bitSet9, bitSet10, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet10, bitSet15, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet22 = null;
        buggycodes.mut_033.BitSet bitSet23 = null;
        fuzzTest21.FuzzTest_set(bitSet22, bitSet23, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet28, bitSet29, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_set(bitSet29, bitSet34, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet41 = null;
        buggycodes.mut_033.BitSet bitSet42 = null;
        fuzzTest40.FuzzTest_set(bitSet41, bitSet42, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_set(bitSet47, bitSet48, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_set(bitSet48, bitSet53, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet59 = null;
        buggycodes.mut_033.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_set(bitSet59, bitSet60, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(bitSet65, bitSet66, (int) ' ', (int) (short) 1, false);
        fuzzTest20.FuzzTest_set(bitSet53, bitSet66, 1, (int) '#', false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet10, bitSet66, (int) '#', (int) '4', true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0, true);
        buggycodes.mut_033.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet9 = null;
        buggycodes.mut_033.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, 0, (int) (byte) 0, true);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet16 = null;
        buggycodes.mut_033.BitSet bitSet17 = null;
        fuzzTest15.FuzzTest_set(bitSet16, bitSet17, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet23 = null;
        buggycodes.mut_033.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet29, bitSet30, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet36 = null;
        buggycodes.mut_033.BitSet bitSet37 = null;
        fuzzTest35.FuzzTest_set(bitSet36, bitSet37, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_set(bitSet42, bitSet43, (int) ' ', (int) (short) 1, false);
        fuzzTest15.FuzzTest_set(bitSet29, bitSet43, 100, (int) ' ', false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet53 = null;
        buggycodes.mut_033.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet60 = null;
        buggycodes.mut_033.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_set(bitSet60, bitSet61, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_set(bitSet66, bitSet67, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet73 = null;
        buggycodes.mut_033.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_set(bitSet73, bitSet74, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_set(bitSet79, bitSet80, (int) ' ', (int) (short) 1, false);
        fuzzTest52.FuzzTest_set(bitSet66, bitSet80, 100, (int) ' ', false);
        fuzzTest8.FuzzTest_set(bitSet29, bitSet66, 10, (int) (short) -1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet7, bitSet29, 10, 100, true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet15 = null;
        buggycodes.mut_033.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet21, bitSet22, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet22, bitSet27, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet33 = null;
        buggycodes.mut_033.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_set(bitSet33, bitSet34, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet40 = null;
        buggycodes.mut_033.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_set(bitSet40, bitSet41, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_set(bitSet46, bitSet47, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet53 = null;
        buggycodes.mut_033.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet59, bitSet60, (int) ' ', (int) (short) 1, false);
        fuzzTest32.FuzzTest_set(bitSet46, bitSet60, 100, (int) ' ', false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet27, bitSet46, (int) (byte) -1, (int) '4', false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet15 = null;
        buggycodes.mut_033.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet21, bitSet22, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet22, bitSet27, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet33 = null;
        buggycodes.mut_033.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_set(bitSet33, bitSet34, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_set(bitSet39, bitSet40, (int) ' ', (int) (short) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet27, bitSet39, (int) (byte) 1, (int) (short) 100, true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet3 = null;
        buggycodes.mut_033.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_set(bitSet3, bitSet4, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet10 = null;
        buggycodes.mut_033.BitSet bitSet11 = null;
        fuzzTest9.FuzzTest_set(bitSet10, bitSet11, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_set(bitSet16, bitSet17, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet23 = null;
        buggycodes.mut_033.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet29, bitSet30, (int) ' ', (int) (short) 1, false);
        fuzzTest2.FuzzTest_set(bitSet16, bitSet30, 100, (int) ' ', false);
        fuzzTest0.FuzzTest_set(bitSet1, bitSet30, 1, (int) (short) 10, true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet45 = null;
        buggycodes.mut_033.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_set(bitSet45, bitSet46, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_set(bitSet51, bitSet52, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_set(bitSet52, bitSet57, (int) '4', 1, true);
        buggycodes.mut_033.BitSet bitSet62 = null;
        fuzzTest0.FuzzTest_set(bitSet52, bitSet62, (int) '4', 10, true);
        buggycodes.mut_033.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet70 = null;
        buggycodes.mut_033.BitSet bitSet71 = null;
        fuzzTest69.FuzzTest_set(bitSet70, bitSet71, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_set(bitSet76, bitSet77, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_set(bitSet77, bitSet82, (int) '4', 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet67, bitSet82, (int) (byte) -1, 1, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet14 = null;
        buggycodes.mut_033.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet20, bitSet21, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet26 = null;
        fuzzTest0.FuzzTest_set(bitSet21, bitSet26, (int) (short) -1, (int) '4', true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet32 = null;
        buggycodes.mut_033.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_set(bitSet32, bitSet33, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_set(bitSet38, bitSet39, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet45 = null;
        buggycodes.mut_033.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_set(bitSet45, bitSet46, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_set(bitSet51, bitSet52, (int) ' ', (int) (short) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet38, bitSet52, (-1), 100, true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) -1, (int) (short) 10, true);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet8 = null;
        buggycodes.mut_033.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, 0, (int) (byte) 0, true);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet15 = null;
        buggycodes.mut_033.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet21, bitSet22, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet27 = null;
        fuzzTest7.FuzzTest_set(bitSet21, bitSet27, (int) (short) 100, (int) (byte) 1, false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet34 = null;
        buggycodes.mut_033.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_set(bitSet34, bitSet35, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet41 = null;
        buggycodes.mut_033.BitSet bitSet42 = null;
        fuzzTest40.FuzzTest_set(bitSet41, bitSet42, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_set(bitSet47, bitSet48, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet54 = null;
        buggycodes.mut_033.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_set(bitSet54, bitSet55, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_set(bitSet60, bitSet61, (int) ' ', (int) (short) 1, false);
        fuzzTest33.FuzzTest_set(bitSet47, bitSet61, 100, (int) ' ', false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet71 = null;
        buggycodes.mut_033.BitSet bitSet72 = null;
        fuzzTest70.FuzzTest_set(bitSet71, bitSet72, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_set(bitSet77, bitSet78, (int) ' ', (int) (short) 1, false);
        fuzzTest32.FuzzTest_set(bitSet47, bitSet77, 100, (int) (byte) 10, true);
        buggycodes.mut_033.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet88 = null;
        fuzzTest32.FuzzTest_set(bitSet87, bitSet88, (int) (byte) -1, (int) (byte) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet21, bitSet87, (-1), (int) 'a', false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet8 = null;
        buggycodes.mut_033.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet14, bitSet15, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet21 = null;
        buggycodes.mut_033.BitSet bitSet22 = null;
        fuzzTest20.FuzzTest_set(bitSet21, bitSet22, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_set(bitSet27, bitSet28, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet34 = null;
        buggycodes.mut_033.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_set(bitSet34, bitSet35, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_set(bitSet40, bitSet41, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet46 = null;
        fuzzTest20.FuzzTest_set(bitSet41, bitSet46, 2, 100, false);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet53 = null;
        buggycodes.mut_033.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet59, bitSet60, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_set(bitSet60, bitSet65, (int) '4', 1, true);
        buggycodes.mut_033.BitSet bitSet70 = null;
        fuzzTest20.FuzzTest_set(bitSet65, bitSet70, 10, (int) (short) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet15, bitSet65, 2, (int) (byte) 100, true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet2 = null;
        buggycodes.mut_033.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet8, bitSet9, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet9, bitSet14, (int) '4', 1, true);
        buggycodes.mut_033.BitSet bitSet19 = null;
        buggycodes.mut_033.BitSet bitSet20 = null;
        fuzzTest0.FuzzTest_set(bitSet19, bitSet20, 10, (-1), false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet26 = null;
        buggycodes.mut_033.BitSet bitSet27 = null;
        fuzzTest25.FuzzTest_set(bitSet26, bitSet27, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_set(bitSet32, bitSet33, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet40 = null;
        buggycodes.mut_033.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_set(bitSet40, bitSet41, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_set(bitSet46, bitSet47, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet47, bitSet52, (int) '4', 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet33, bitSet52, (int) (byte) 0, 0, true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet8 = null;
        buggycodes.mut_033.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet15 = null;
        buggycodes.mut_033.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet21, bitSet22, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet28 = null;
        buggycodes.mut_033.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet34, bitSet35, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet40 = null;
        fuzzTest14.FuzzTest_set(bitSet35, bitSet40, (int) (short) -1, (int) '4', true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet46 = null;
        buggycodes.mut_033.BitSet bitSet47 = null;
        fuzzTest45.FuzzTest_set(bitSet46, bitSet47, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_set(bitSet52, bitSet53, (int) ' ', (int) (short) 1, false);
        fuzzTest7.FuzzTest_set(bitSet40, bitSet53, (int) (short) 1, 100, true);
        buggycodes.mut_033.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet53, bitSet62, 2, (int) '4', true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet8 = null;
        buggycodes.mut_033.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet14, bitSet15, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet22 = null;
        buggycodes.mut_033.BitSet bitSet23 = null;
        fuzzTest21.FuzzTest_set(bitSet22, bitSet23, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet28, bitSet29, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_set(bitSet29, bitSet34, (int) '4', 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet15, bitSet29, (int) '4', (int) (short) 100, true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet7 = null;
        buggycodes.mut_033.BitSet bitSet8 = null;
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, (int) (short) 1, 100, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet15 = null;
        buggycodes.mut_033.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet21, bitSet22, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet22, bitSet27, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet33 = null;
        buggycodes.mut_033.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_set(bitSet33, bitSet34, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet40 = null;
        buggycodes.mut_033.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_set(bitSet40, bitSet41, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_set(bitSet46, bitSet47, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet53 = null;
        buggycodes.mut_033.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet59, bitSet60, (int) ' ', (int) (short) 1, false);
        fuzzTest32.FuzzTest_set(bitSet46, bitSet60, 100, (int) ' ', false);
        buggycodes.mut_033.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet46, bitSet69, (int) (short) 100, (int) (byte) 100, false);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet76 = null;
        buggycodes.mut_033.BitSet bitSet77 = null;
        fuzzTest75.FuzzTest_set(bitSet76, bitSet77, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_set(bitSet82, bitSet83, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_set(bitSet83, bitSet88, (int) '4', 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet69, bitSet88, (int) (short) -1, 10, false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0, true);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet9 = null;
        buggycodes.mut_033.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet15, bitSet16, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet16, bitSet21, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet28 = null;
        buggycodes.mut_033.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet34, bitSet35, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_set(bitSet35, bitSet40, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet46 = null;
        buggycodes.mut_033.BitSet bitSet47 = null;
        fuzzTest45.FuzzTest_set(bitSet46, bitSet47, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_set(bitSet52, bitSet53, (int) ' ', (int) (short) 1, false);
        fuzzTest7.FuzzTest_set(bitSet40, bitSet53, 1, (int) '#', false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet63 = null;
        buggycodes.mut_033.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_set(bitSet63, bitSet64, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_set(bitSet69, bitSet70, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet76 = null;
        buggycodes.mut_033.BitSet bitSet77 = null;
        fuzzTest75.FuzzTest_set(bitSet76, bitSet77, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_set(bitSet82, bitSet83, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet88 = null;
        fuzzTest62.FuzzTest_set(bitSet83, bitSet88, (int) (short) -1, (int) '4', true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet53, bitSet83, (-1), (int) (short) 100, true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet14 = null;
        buggycodes.mut_033.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet20, bitSet21, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet27 = null;
        buggycodes.mut_033.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_set(bitSet27, bitSet28, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_set(bitSet33, bitSet34, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet39 = null;
        fuzzTest13.FuzzTest_set(bitSet34, bitSet39, 2, 100, false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet45 = null;
        buggycodes.mut_033.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_set(bitSet45, bitSet46, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet52 = null;
        buggycodes.mut_033.BitSet bitSet53 = null;
        fuzzTest51.FuzzTest_set(bitSet52, bitSet53, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_set(bitSet58, bitSet59, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet65 = null;
        buggycodes.mut_033.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_set(bitSet65, bitSet66, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet71, bitSet72, (int) ' ', (int) (short) 1, false);
        fuzzTest44.FuzzTest_set(bitSet58, bitSet72, 100, (int) ' ', false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet34, bitSet72, 1, (int) '4', true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) -1, (int) (short) 10, true);
        buggycodes.mut_033.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet8 = null;
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, 0, (int) '#', false);
        buggycodes.mut_033.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet15 = null;
        buggycodes.mut_033.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet21, bitSet22, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet28 = null;
        buggycodes.mut_033.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet34, bitSet35, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet42 = null;
        buggycodes.mut_033.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet48, bitSet49, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_set(bitSet49, bitSet54, (int) '4', 1, true);
        buggycodes.mut_033.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet62 = null;
        buggycodes.mut_033.BitSet bitSet63 = null;
        fuzzTest61.FuzzTest_set(bitSet62, bitSet63, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_set(bitSet68, bitSet69, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_set(bitSet69, bitSet74, (int) '4', 1, true);
        fuzzTest40.FuzzTest_set(bitSet59, bitSet69, (int) '#', 2, true);
        fuzzTest14.FuzzTest_set(bitSet35, bitSet69, (int) (byte) 0, 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet13, bitSet35, (int) (short) -1, (int) '#', false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0, true);
        buggycodes.mut_033.BitSet bitSet7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet9 = null;
        buggycodes.mut_033.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet15, bitSet16, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet22 = null;
        buggycodes.mut_033.BitSet bitSet23 = null;
        fuzzTest21.FuzzTest_set(bitSet22, bitSet23, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet29 = null;
        buggycodes.mut_033.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet35, bitSet36, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet42 = null;
        buggycodes.mut_033.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet48, bitSet49, (int) ' ', (int) (short) 1, false);
        fuzzTest21.FuzzTest_set(bitSet35, bitSet49, 100, (int) ' ', false);
        buggycodes.mut_033.BitSet bitSet58 = null;
        fuzzTest8.FuzzTest_set(bitSet49, bitSet58, (int) ' ', (int) (byte) 10, false);
        fuzzTest0.FuzzTest_set(bitSet7, bitSet49, (int) (short) -1, 0, false);
        buggycodes.mut_033.BitSet bitSet67 = null;
        buggycodes.mut_033.BitSet bitSet68 = null;
        fuzzTest0.FuzzTest_set(bitSet67, bitSet68, (int) 'a', 0, true);
        buggycodes.mut_033.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet76 = null;
        buggycodes.mut_033.BitSet bitSet77 = null;
        fuzzTest75.FuzzTest_set(bitSet76, bitSet77, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_set(bitSet82, bitSet83, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_set(bitSet83, bitSet88, (int) '4', 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet73, bitSet88, (int) (byte) 1, (int) '4', true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet4 = null;
        buggycodes.mut_033.BitSet bitSet5 = null;
        fuzzTest3.FuzzTest_set(bitSet4, bitSet5, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_set(bitSet10, bitSet11, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_set(bitSet11, bitSet16, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet23 = null;
        buggycodes.mut_033.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet29, bitSet30, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet30, bitSet35, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet42 = null;
        buggycodes.mut_033.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet48, bitSet49, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_set(bitSet49, bitSet54, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet60 = null;
        buggycodes.mut_033.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_set(bitSet60, bitSet61, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_set(bitSet66, bitSet67, (int) ' ', (int) (short) 1, false);
        fuzzTest21.FuzzTest_set(bitSet54, bitSet67, 1, (int) '#', false);
        fuzzTest1.FuzzTest_set(bitSet11, bitSet67, (int) '#', (int) (short) -1, false);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet81 = null;
        buggycodes.mut_033.BitSet bitSet82 = null;
        fuzzTest80.FuzzTest_set(bitSet81, bitSet82, (int) (byte) -1, (int) (short) 10, true);
        buggycodes.mut_033.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet88 = null;
        fuzzTest80.FuzzTest_set(bitSet87, bitSet88, 0, (int) '#', false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet67, bitSet87, 2, 10, true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet2 = null;
        buggycodes.mut_033.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet8, bitSet9, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet9, bitSet14, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet21 = null;
        buggycodes.mut_033.BitSet bitSet22 = null;
        fuzzTest20.FuzzTest_set(bitSet21, bitSet22, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_set(bitSet27, bitSet28, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_set(bitSet28, bitSet33, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet41 = null;
        buggycodes.mut_033.BitSet bitSet42 = null;
        fuzzTest40.FuzzTest_set(bitSet41, bitSet42, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet48 = null;
        buggycodes.mut_033.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_set(bitSet48, bitSet49, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_set(bitSet54, bitSet55, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet61 = null;
        buggycodes.mut_033.BitSet bitSet62 = null;
        fuzzTest60.FuzzTest_set(bitSet61, bitSet62, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_set(bitSet67, bitSet68, (int) ' ', (int) (short) 1, false);
        fuzzTest40.FuzzTest_set(bitSet54, bitSet68, 100, (int) ' ', false);
        fuzzTest38.FuzzTest_set(bitSet39, bitSet68, 1, (int) (short) 10, true);
        fuzzTest0.FuzzTest_set(bitSet33, bitSet39, (int) (byte) 100, (int) (short) 100, true);
        buggycodes.mut_033.BitSet bitSet85 = null;
        buggycodes.mut_033.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet85, bitSet86, (-1), (-1), true);
        buggycodes.mut_033.BitSet bitSet91 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet91, bitSet92, (-1), (int) '#', false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet10 = null;
        buggycodes.mut_033.BitSet bitSet11 = null;
        fuzzTest9.FuzzTest_set(bitSet10, bitSet11, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_set(bitSet16, bitSet17, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet17, bitSet22, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet29 = null;
        buggycodes.mut_033.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet35, bitSet36, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet36, bitSet41, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet47 = null;
        buggycodes.mut_033.BitSet bitSet48 = null;
        fuzzTest46.FuzzTest_set(bitSet47, bitSet48, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_set(bitSet53, bitSet54, (int) ' ', (int) (short) 1, false);
        fuzzTest8.FuzzTest_set(bitSet41, bitSet54, 1, (int) '#', false);
        buggycodes.mut_033.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet66 = null;
        buggycodes.mut_033.BitSet bitSet67 = null;
        fuzzTest65.FuzzTest_set(bitSet66, bitSet67, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_set(bitSet72, bitSet73, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet73, bitSet78, (int) '4', 1, true);
        fuzzTest8.FuzzTest_set(bitSet63, bitSet73, (int) (short) 0, (int) (short) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet7, bitSet63, 2, (int) (short) 10, true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) -1, (int) (short) 10, true);
        buggycodes.mut_033.BitSet bitSet7 = null;
        buggycodes.mut_033.BitSet bitSet8 = null;
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, (int) (short) 10, (int) (short) 10, false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet15 = null;
        buggycodes.mut_033.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet21, bitSet22, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet22, bitSet27, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet34 = null;
        buggycodes.mut_033.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_set(bitSet34, bitSet35, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_set(bitSet40, bitSet41, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_set(bitSet41, bitSet46, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet52 = null;
        buggycodes.mut_033.BitSet bitSet53 = null;
        fuzzTest51.FuzzTest_set(bitSet52, bitSet53, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_set(bitSet58, bitSet59, (int) ' ', (int) (short) 1, false);
        fuzzTest13.FuzzTest_set(bitSet46, bitSet59, 1, (int) '#', false);
        buggycodes.mut_033.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet46, bitSet68, (-1), (int) (short) 100, false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0, true);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet9 = null;
        buggycodes.mut_033.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet15, bitSet16, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet16, bitSet21, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet28 = null;
        buggycodes.mut_033.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet34, bitSet35, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_set(bitSet35, bitSet40, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet46 = null;
        buggycodes.mut_033.BitSet bitSet47 = null;
        fuzzTest45.FuzzTest_set(bitSet46, bitSet47, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet53 = null;
        buggycodes.mut_033.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet59, bitSet60, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet66 = null;
        buggycodes.mut_033.BitSet bitSet67 = null;
        fuzzTest65.FuzzTest_set(bitSet66, bitSet67, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_set(bitSet72, bitSet73, (int) ' ', (int) (short) 1, false);
        fuzzTest45.FuzzTest_set(bitSet59, bitSet73, 100, (int) ' ', false);
        buggycodes.mut_033.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_set(bitSet59, bitSet82, (int) (short) 100, (int) (byte) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet16, bitSet59, 0, 0, true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet1 = null;
        buggycodes.mut_033.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (byte) -1, (int) (short) 10, true);
        buggycodes.mut_033.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet8 = null;
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, 0, (int) '#', false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet14 = null;
        buggycodes.mut_033.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet20, bitSet21, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet27 = null;
        buggycodes.mut_033.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_set(bitSet27, bitSet28, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_set(bitSet33, bitSet34, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_033.BitSet bitSet40 = null;
        buggycodes.mut_033.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_set(bitSet40, bitSet41, (int) (short) -1, (int) (byte) 1, true);
        buggycodes.mut_033.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_033.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_set(bitSet46, bitSet47, (int) ' ', (int) (short) 1, false);
        buggycodes.mut_033.BitSet bitSet52 = null;
        fuzzTest26.FuzzTest_set(bitSet47, bitSet52, (int) (short) -1, (int) '4', true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet20, bitSet47, (int) (byte) -1, 0, true);
    }
}

