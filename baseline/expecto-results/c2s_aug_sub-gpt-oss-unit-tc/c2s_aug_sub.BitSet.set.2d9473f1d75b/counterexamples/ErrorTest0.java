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
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet14, bitSet15, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet21 = null;
        c2s_aug_sub.BitSet bitSet22 = null;
        fuzzTest20.FuzzTest_set(bitSet21, bitSet22, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_set(bitSet27, bitSet28, (int) ' ', (int) (short) 1, false);
        fuzzTest0.FuzzTest_set(bitSet14, bitSet28, 100, (int) ' ', false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_set(bitSet39, bitSet40, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet45, bitSet46, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet46, bitSet51, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet57 = null;
        c2s_aug_sub.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_set(bitSet57, bitSet58, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_set(bitSet63, bitSet64, (int) ' ', (int) (short) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet51, bitSet64, (int) (short) 0, (int) (byte) 100, false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet8, bitSet9, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet16 = null;
        c2s_aug_sub.BitSet bitSet17 = null;
        fuzzTest15.FuzzTest_set(bitSet16, bitSet17, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_set(bitSet22, bitSet23, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet23, bitSet28, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_set(bitSet34, bitSet35, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_set(bitSet40, bitSet41, (int) ' ', (int) (short) 1, false);
        fuzzTest1.FuzzTest_set(bitSet23, bitSet40, (-1), 100, false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_set(bitSet51, bitSet52, (int) '#', 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet23, bitSet51, (int) (byte) 1, 10, true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet15 = null;
        c2s_aug_sub.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet21, bitSet22, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet22, bitSet27, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_set(bitSet33, bitSet34, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_set(bitSet39, bitSet40, (int) ' ', (int) (short) 1, false);
        fuzzTest0.FuzzTest_set(bitSet22, bitSet39, (-1), 100, false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet51 = null;
        c2s_aug_sub.BitSet bitSet52 = null;
        fuzzTest50.FuzzTest_set(bitSet51, bitSet52, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_set(bitSet57, bitSet58, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_set(bitSet58, bitSet63, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_set(bitSet69, bitSet70, (int) '#', 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet63, bitSet69, (int) (short) 0, (int) '#', false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet9 = null;
        c2s_aug_sub.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet15, bitSet16, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet29, bitSet30, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet30, bitSet35, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet41 = null;
        c2s_aug_sub.BitSet bitSet42 = null;
        fuzzTest40.FuzzTest_set(bitSet41, bitSet42, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_set(bitSet47, bitSet48, (int) ' ', (int) (short) 1, false);
        fuzzTest8.FuzzTest_set(bitSet30, bitSet47, (-1), 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet7, bitSet47, 2, (int) (byte) 10, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet8, bitSet9, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet9, bitSet14, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_set(bitSet20, bitSet21, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_set(bitSet27, bitSet28, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_set(bitSet33, bitSet34, (int) ' ', (int) (short) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet20, bitSet33, 2, (int) (byte) 100, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet9 = null;
        c2s_aug_sub.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet15, bitSet16, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet29, bitSet30, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet30, bitSet35, (int) '4', 1, true);
        fuzzTest7.FuzzTest_set(bitSet15, bitSet35, 2, 2, false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet46 = null;
        c2s_aug_sub.BitSet bitSet47 = null;
        fuzzTest45.FuzzTest_set(bitSet46, bitSet47, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_set(bitSet52, bitSet53, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_set(bitSet60, bitSet61, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_set(bitSet66, bitSet67, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(bitSet67, bitSet72, (int) '4', 1, true);
        fuzzTest44.FuzzTest_set(bitSet52, bitSet72, 2, 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet35, bitSet72, 2, (int) (short) 100, true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet9 = null;
        c2s_aug_sub.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet15, bitSet16, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet16, bitSet21, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet34, bitSet35, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet42 = null;
        c2s_aug_sub.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet48, bitSet49, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_set(bitSet49, bitSet54, (int) '4', 1, true);
        fuzzTest26.FuzzTest_set(bitSet34, bitSet54, 2, 2, false);
        fuzzTest0.FuzzTest_set(bitSet21, bitSet34, (int) ' ', (int) ' ', true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = null;
        fuzzTest68.FuzzTest_set(bitSet69, bitSet70, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_set(bitSet75, bitSet76, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_set(bitSet76, bitSet81, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest86 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest86.FuzzTest_set(bitSet87, bitSet88, (int) '#', 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet76, bitSet88, (int) (short) 1, (int) (short) 10, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet20, bitSet21, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet26 = null;
        fuzzTest0.FuzzTest_set(bitSet20, bitSet26, 0, 1, true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_set(bitSet34, bitSet35, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_set(bitSet40, bitSet41, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_set(bitSet41, bitSet46, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_set(bitSet52, bitSet53, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_set(bitSet60, bitSet61, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_set(bitSet66, bitSet67, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(bitSet67, bitSet72, (int) '4', 1, true);
        fuzzTest32.FuzzTest_set(bitSet52, bitSet72, 10, (int) (byte) 100, false);
        c2s_aug_sub.BitSet bitSet81 = null;
        fuzzTest31.FuzzTest_set(bitSet52, bitSet81, (int) ' ', 10, true);
        fuzztests.FuzzTest fuzzTest86 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest86.FuzzTest_set(bitSet87, bitSet88, (int) '#', 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet52, bitSet88, 0, 100, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet8, bitSet9, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet9, bitSet14, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_set(bitSet20, bitSet21, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet34, bitSet35, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_set(bitSet35, bitSet40, (int) '4', 1, true);
        fuzzTest0.FuzzTest_set(bitSet20, bitSet40, 10, (int) (byte) 100, false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_set(bitSet50, bitSet51, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_set(bitSet56, bitSet57, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_set(bitSet63, bitSet64, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_set(bitSet69, bitSet70, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet75 = null;
        fuzzTest49.FuzzTest_set(bitSet69, bitSet75, 0, 1, true);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet81 = null;
        c2s_aug_sub.BitSet bitSet82 = null;
        fuzzTest80.FuzzTest_set(bitSet81, bitSet82, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest80.FuzzTest_set(bitSet87, bitSet88, (int) ' ', (int) (short) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet69, bitSet87, 0, (int) ' ', true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet9 = null;
        c2s_aug_sub.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet15, bitSet16, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet29, bitSet30, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet30, bitSet35, (int) '4', 1, true);
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest8.FuzzTest_set(bitSet30, bitSet40, (int) (short) 100, 1, false);
        fuzzTest0.FuzzTest_set(bitSet3, bitSet40, (int) (short) -1, (int) 'a', false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_set(bitSet50, bitSet51, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet57 = null;
        c2s_aug_sub.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_set(bitSet57, bitSet58, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_set(bitSet63, bitSet64, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = null;
        fuzzTest69.FuzzTest_set(bitSet70, bitSet71, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_set(bitSet76, bitSet77, (int) ' ', (int) (short) 1, false);
        fuzzTest49.FuzzTest_set(bitSet63, bitSet77, 100, (int) ' ', false);
        c2s_aug_sub.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet77, bitSet86, (int) (short) 1, 100, false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet15 = null;
        c2s_aug_sub.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet21, bitSet22, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet34, bitSet35, (int) ' ', (int) (short) 1, false);
        fuzzTest7.FuzzTest_set(bitSet21, bitSet34, (int) (byte) 100, (-1), false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = null;
        c2s_aug_sub.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_set(bitSet45, bitSet46, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet59, bitSet60, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_set(bitSet60, bitSet65, (int) '4', 1, true);
        c2s_aug_sub.BitSet bitSet70 = null;
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet72 = null;
        c2s_aug_sub.BitSet bitSet73 = null;
        fuzzTest71.FuzzTest_set(bitSet72, bitSet73, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_set(bitSet78, bitSet79, (int) ' ', (int) (short) 1, false);
        fuzzTest51.FuzzTest_set(bitSet70, bitSet79, (int) (short) 1, 0, true);
        c2s_aug_sub.BitSet bitSet88 = null;
        fuzzTest44.FuzzTest_set(bitSet79, bitSet88, 100, (int) ' ', false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet34, bitSet79, 0, (int) 'a', true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet8, bitSet9, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet9, bitSet14, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet20 = null;
        c2s_aug_sub.BitSet bitSet21 = null;
        fuzzTest19.FuzzTest_set(bitSet20, bitSet21, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_set(bitSet27, bitSet28, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_set(bitSet33, bitSet34, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_set(bitSet40, bitSet41, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_set(bitSet46, bitSet47, (int) ' ', (int) (short) 1, false);
        fuzzTest19.FuzzTest_set(bitSet33, bitSet46, (int) (byte) 100, (-1), false);
        c2s_aug_sub.BitSet bitSet56 = null;
        fuzzTest0.FuzzTest_set(bitSet33, bitSet56, (-1), (int) (byte) 0, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_set(bitSet63, bitSet64, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_set(bitSet69, bitSet70, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_set(bitSet70, bitSet75, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest80.FuzzTest_set(bitSet81, bitSet82, (int) '#', 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet75, bitSet81, (int) (byte) 1, (int) 'a', false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet8, bitSet9, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet9, bitSet14, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet21 = null;
        c2s_aug_sub.BitSet bitSet22 = null;
        fuzzTest20.FuzzTest_set(bitSet21, bitSet22, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_set(bitSet27, bitSet28, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_set(bitSet28, bitSet33, (int) '4', 1, true);
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_set(bitSet40, bitSet41, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_set(bitSet46, bitSet47, (int) ' ', (int) (short) 1, false);
        fuzzTest19.FuzzTest_set(bitSet38, bitSet47, (int) (short) 1, 0, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_set(bitSet57, bitSet58, (int) '#', 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet47, bitSet57, 0, (int) '4', true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, (int) '#', 2, false);
        fuzzTest0.FuzzTest_set(bitSet7, bitSet9, (int) '4', (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet20 = null;
        c2s_aug_sub.BitSet bitSet21 = null;
        fuzzTest19.FuzzTest_set(bitSet20, bitSet21, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_set(bitSet26, bitSet27, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_set(bitSet33, bitSet34, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_set(bitSet41, bitSet42, (int) '#', 2, false);
        fuzzTest32.FuzzTest_set(bitSet39, bitSet41, (int) '4', (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, (int) '#', 2, false);
        fuzzTest32.FuzzTest_set(bitSet51, bitSet54, 0, (int) ' ', false);
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet66 = null;
        c2s_aug_sub.BitSet bitSet67 = null;
        fuzzTest65.FuzzTest_set(bitSet66, bitSet67, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_set(bitSet72, bitSet73, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet73, bitSet78, (int) '4', 1, true);
        fuzzTest32.FuzzTest_set(bitSet63, bitSet73, (int) 'a', (int) (byte) -1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet26, bitSet73, (int) (short) 1, 10, false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet15 = null;
        c2s_aug_sub.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet21, bitSet22, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet22, bitSet27, (int) '4', 1, true);
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = null;
        c2s_aug_sub.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_set(bitSet35, bitSet36, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_set(bitSet41, bitSet42, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_set(bitSet42, bitSet47, (int) '4', 1, true);
        fuzzTest13.FuzzTest_set(bitSet32, bitSet42, (int) (byte) 10, 1, false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet57 = null;
        c2s_aug_sub.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_set(bitSet57, bitSet58, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_set(bitSet63, bitSet64, (int) ' ', (int) (short) 1, false);
        fuzzTest0.FuzzTest_set(bitSet32, bitSet63, (-1), (int) (short) 0, false);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_set(bitSet74, bitSet75, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet81 = null;
        c2s_aug_sub.BitSet bitSet82 = null;
        fuzzTest80.FuzzTest_set(bitSet81, bitSet82, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest80.FuzzTest_set(bitSet87, bitSet88, (int) ' ', (int) (short) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet75, bitSet88, (int) (short) 10, 100, true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (-1), false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet14, bitSet15, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet21 = null;
        c2s_aug_sub.BitSet bitSet22 = null;
        fuzzTest20.FuzzTest_set(bitSet21, bitSet22, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_set(bitSet27, bitSet28, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest7.FuzzTest_set(bitSet27, bitSet33, 0, 1, true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_set(bitSet40, bitSet41, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_set(bitSet46, bitSet47, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet47, bitSet52, (int) '4', 1, true);
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_set(bitSet60, bitSet61, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_set(bitSet66, bitSet67, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(bitSet67, bitSet72, (int) '4', 1, true);
        fuzzTest38.FuzzTest_set(bitSet57, bitSet67, (int) (byte) 10, 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet27, bitSet57, 2, (int) 'a', false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet15 = null;
        c2s_aug_sub.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet21, bitSet22, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet22, bitSet27, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_set(bitSet33, bitSet34, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_set(bitSet40, bitSet41, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_set(bitSet46, bitSet47, (int) ' ', (int) (short) 1, false);
        fuzzTest13.FuzzTest_set(bitSet34, bitSet47, 0, (int) (byte) -1, false);
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet47, bitSet56, (int) (byte) 1, (int) ' ', false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet15 = null;
        c2s_aug_sub.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet21, bitSet22, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet35, bitSet36, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet36, bitSet41, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_set(bitSet47, bitSet48, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet55 = null;
        c2s_aug_sub.BitSet bitSet56 = null;
        fuzzTest54.FuzzTest_set(bitSet55, bitSet56, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_set(bitSet61, bitSet62, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_set(bitSet62, bitSet67, (int) '4', 1, true);
        fuzzTest27.FuzzTest_set(bitSet47, bitSet67, 10, (int) (byte) 100, false);
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet67, bitSet76, 1, (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet8, bitSet67, (int) (byte) 0, (int) ' ', false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0, true);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet9 = null;
        c2s_aug_sub.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet15, bitSet16, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet16, bitSet21, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_set(bitSet27, bitSet28, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = null;
        c2s_aug_sub.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_set(bitSet35, bitSet36, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_set(bitSet41, bitSet42, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_set(bitSet42, bitSet47, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_set(bitSet54, bitSet55, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_set(bitSet60, bitSet61, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_set(bitSet68, bitSet69, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_set(bitSet74, bitSet75, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_set(bitSet75, bitSet80, (int) '4', 1, true);
        fuzzTest52.FuzzTest_set(bitSet60, bitSet80, 2, 2, false);
        fuzzTest26.FuzzTest_set(bitSet47, bitSet60, (int) ' ', (int) ' ', true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet21, bitSet47, (int) (byte) 0, (int) (byte) 100, true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0, true);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet14, bitSet15, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet22 = null;
        c2s_aug_sub.BitSet bitSet23 = null;
        fuzzTest21.FuzzTest_set(bitSet22, bitSet23, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet28, bitSet29, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_set(bitSet29, bitSet34, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_set(bitSet40, bitSet41, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_set(bitSet46, bitSet47, (int) ' ', (int) (short) 1, false);
        fuzzTest7.FuzzTest_set(bitSet29, bitSet46, (-1), 100, false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_set(bitSet58, bitSet59, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_set(bitSet64, bitSet65, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet72 = null;
        c2s_aug_sub.BitSet bitSet73 = null;
        fuzzTest71.FuzzTest_set(bitSet72, bitSet73, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_set(bitSet78, bitSet79, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_set(bitSet79, bitSet84, (int) '4', 1, true);
        fuzzTest56.FuzzTest_set(bitSet64, bitSet84, 2, 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet29, bitSet84, 0, (int) (short) 10, false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet15 = null;
        c2s_aug_sub.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet21, bitSet22, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = null;
        c2s_aug_sub.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_set(bitSet35, bitSet36, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_set(bitSet41, bitSet42, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_set(bitSet48, bitSet49, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_set(bitSet54, bitSet55, (int) ' ', (int) (short) 1, false);
        fuzzTest27.FuzzTest_set(bitSet41, bitSet55, 100, (int) ' ', false);
        fuzzTest7.FuzzTest_set(bitSet22, bitSet55, (int) (short) 10, 0, true);
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet22, bitSet68, (int) (short) 1, (int) ' ', true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet8, bitSet9, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet16 = null;
        c2s_aug_sub.BitSet bitSet17 = null;
        fuzzTest15.FuzzTest_set(bitSet16, bitSet17, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_set(bitSet22, bitSet23, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet23, bitSet28, (int) '4', 1, true);
        fuzzTest0.FuzzTest_set(bitSet8, bitSet28, 2, 2, false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet44, bitSet45, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet51 = null;
        c2s_aug_sub.BitSet bitSet52 = null;
        fuzzTest50.FuzzTest_set(bitSet51, bitSet52, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_set(bitSet57, bitSet58, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzzTest37.FuzzTest_set(bitSet57, bitSet63, 0, 1, true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = null;
        fuzzTest68.FuzzTest_set(bitSet69, bitSet70, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_set(bitSet75, bitSet76, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_set(bitSet82, bitSet83, (int) '#', 2, false);
        fuzzTest37.FuzzTest_set(bitSet75, bitSet82, (int) 'a', (int) 'a', false);
        c2s_aug_sub.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet82, bitSet92, (int) (short) 1, (int) (byte) 100, false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) ' ', (-1), false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet9 = null;
        c2s_aug_sub.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet15, bitSet16, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet16, bitSet21, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet34, bitSet35, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet42 = null;
        c2s_aug_sub.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet48, bitSet49, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_set(bitSet49, bitSet54, (int) '4', 1, true);
        fuzzTest26.FuzzTest_set(bitSet34, bitSet54, 2, 2, false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_set(bitSet65, bitSet66, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet71, bitSet72, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_set(bitSet72, bitSet77, (int) '4', 1, true);
        c2s_aug_sub.BitSet bitSet82 = null;
        fuzzTest26.FuzzTest_set(bitSet77, bitSet82, (int) (byte) 0, (int) '#', true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet16, bitSet77, 0, (int) (short) 100, false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet8, bitSet9, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet9, bitSet14, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet20 = null;
        c2s_aug_sub.BitSet bitSet21 = null;
        fuzzTest19.FuzzTest_set(bitSet20, bitSet21, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_set(bitSet26, bitSet27, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_set(bitSet33, bitSet34, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_set(bitSet39, bitSet40, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_set(bitSet48, bitSet49, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_set(bitSet54, bitSet55, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet62 = null;
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzzTest61.FuzzTest_set(bitSet62, bitSet63, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_set(bitSet68, bitSet69, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_set(bitSet69, bitSet74, (int) '4', 1, true);
        fuzzTest46.FuzzTest_set(bitSet54, bitSet74, 2, 2, false);
        fuzzTest32.FuzzTest_set(bitSet45, bitSet54, (int) (short) 10, 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet27, bitSet45, 2, (int) 'a', false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet15 = null;
        c2s_aug_sub.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet21, bitSet22, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet35, bitSet36, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet36, bitSet41, (int) '4', 1, true);
        c2s_aug_sub.BitSet bitSet46 = null;
        fuzzTest14.FuzzTest_set(bitSet36, bitSet46, (int) (short) 100, 1, false);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet59, bitSet60, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_set(bitSet60, bitSet65, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet71 = null;
        c2s_aug_sub.BitSet bitSet72 = null;
        fuzzTest70.FuzzTest_set(bitSet71, bitSet72, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_set(bitSet77, bitSet78, (int) ' ', (int) (short) 1, false);
        fuzzTest14.FuzzTest_set(bitSet60, bitSet77, 1, (int) (short) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet8, bitSet77, 2, (int) ' ', false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet16 = null;
        c2s_aug_sub.BitSet bitSet17 = null;
        fuzzTest15.FuzzTest_set(bitSet16, bitSet17, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_set(bitSet22, bitSet23, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet23, bitSet28, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_set(bitSet34, bitSet35, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet42 = null;
        c2s_aug_sub.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet48, bitSet49, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_set(bitSet49, bitSet54, (int) '4', 1, true);
        fuzzTest14.FuzzTest_set(bitSet34, bitSet54, 10, (int) (byte) 100, false);
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzzTest13.FuzzTest_set(bitSet34, bitSet63, (int) ' ', 10, true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_set(bitSet69, bitSet70, (int) '#', 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet34, bitSet70, (int) (byte) 0, (int) (short) 100, false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet7, bitSet8, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet21 = null;
        c2s_aug_sub.BitSet bitSet22 = null;
        fuzzTest20.FuzzTest_set(bitSet21, bitSet22, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_set(bitSet27, bitSet28, (int) ' ', (int) (short) 1, false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = null;
        c2s_aug_sub.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_set(bitSet35, bitSet36, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_set(bitSet41, bitSet42, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_set(bitSet42, bitSet47, (int) '4', 1, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet59, bitSet60, (int) ' ', (int) (short) 1, false);
        fuzzTest20.FuzzTest_set(bitSet42, bitSet59, (-1), 100, false);
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet59, bitSet69, (int) 'a', 2, false);
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet59, bitSet74, 2, (int) (short) 100, false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (-1), false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(bitSet8, bitSet9, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet15 = null;
        c2s_aug_sub.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, (int) (short) -1, (int) (byte) 1, true);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet29, bitSet30, (int) ' ', (int) (short) 1, false);
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet30, bitSet35, (int) '4', 1, true);
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet42 = null;
        c2s_aug_sub.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, (int) (short) -1, (int) (byte) 1, true);
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet48, bitSet49, (int) ' ', (int) (short) 1, false);
        fuzzTest21.FuzzTest_set(bitSet40, bitSet49, (int) (short) 1, 0, true);
        c2s_aug_sub.BitSet bitSet58 = null;
        fuzzTest14.FuzzTest_set(bitSet49, bitSet58, 100, (int) ' ', false);
        fuzzTest0.FuzzTest_set(bitSet9, bitSet58, (int) '#', 1, true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_set(bitSet68, bitSet69, (int) '#', 2, false);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_set(bitSet75, bitSet76, (int) '#', 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet68, bitSet76, 2, (int) (short) 10, true);
    }
}

