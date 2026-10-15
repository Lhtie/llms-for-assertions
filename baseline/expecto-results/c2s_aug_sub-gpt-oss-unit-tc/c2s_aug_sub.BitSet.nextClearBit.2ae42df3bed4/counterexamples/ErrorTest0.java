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
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextClearBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextClearBit(bitSet12, bitSet13, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_nextClearBit(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_nextClearBit(bitSet23, bitSet24, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextClearBit(bitSet12, bitSet24, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_nextClearBit(bitSet32, bitSet33, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextClearBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_nextClearBit(bitSet43, bitSet44, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_nextClearBit(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_nextClearBit(bitSet54, bitSet55, 10, (int) (byte) -1);
        fuzzTest31.FuzzTest_nextClearBit(bitSet43, bitSet55, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_nextClearBit(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_nextClearBit(bitSet68, bitSet69, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet74 = null;
        c2s_aug_sub.BitSet bitSet75 = null;
        fuzzTest73.FuzzTest_nextClearBit(bitSet74, bitSet75, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet79 = null;
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_nextClearBit(bitSet79, bitSet80, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet84 = null;
        fuzzTest62.FuzzTest_nextClearBit(bitSet80, bitSet84, (int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet55, bitSet80, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextClearBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextClearBit(bitSet17, bitSet18, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet22 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet18, bitSet22, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_nextClearBit(bitSet27, bitSet28, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_nextClearBit(bitSet32, bitSet33, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextClearBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_nextClearBit(bitSet43, bitSet44, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_nextClearBit(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_nextClearBit(bitSet54, bitSet55, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest37.FuzzTest_nextClearBit(bitSet55, bitSet59, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_nextClearBit(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_nextClearBit(bitSet70, bitSet71, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet76 = null;
        c2s_aug_sub.BitSet bitSet77 = null;
        fuzzTest75.FuzzTest_nextClearBit(bitSet76, bitSet77, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_nextClearBit(bitSet81, bitSet82, 10, (int) (byte) -1);
        fuzzTest63.FuzzTest_nextClearBit(bitSet71, bitSet82, (int) (byte) 1, (int) (short) 10);
        c2s_aug_sub.BitSet bitSet89 = null;
        fuzzTest37.FuzzTest_nextClearBit(bitSet82, bitSet89, 0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet32, bitSet82, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_nextClearBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_nextClearBit(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_nextClearBit(bitSet14, bitSet15, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_nextClearBit(bitSet19, bitSet20, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet25 = null;
        c2s_aug_sub.BitSet bitSet26 = null;
        fuzzTest24.FuzzTest_nextClearBit(bitSet25, bitSet26, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_nextClearBit(bitSet30, bitSet31, 10, (int) (byte) -1);
        fuzzTest12.FuzzTest_nextClearBit(bitSet19, bitSet31, 2, (int) (short) 100);
        fuzzTest0.FuzzTest_nextClearBit(bitSet7, bitSet19, (int) (short) 1, 100);
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_nextClearBit(bitSet43, bitSet44, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_nextClearBit(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_nextClearBit(bitSet54, bitSet55, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_nextClearBit(bitSet60, bitSet61, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_nextClearBit(bitSet65, bitSet66, 10, (int) (byte) -1);
        fuzzTest42.FuzzTest_nextClearBit(bitSet54, bitSet66, (int) '#', 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet41, bitSet66, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextClearBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextClearBit(bitSet17, bitSet18, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextClearBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_nextClearBit(bitSet28, bitSet29, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_nextClearBit(bitSet34, bitSet35, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_nextClearBit(bitSet39, bitSet40, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet47 = null;
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzzTest46.FuzzTest_nextClearBit(bitSet47, bitSet48, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_nextClearBit(bitSet52, bitSet53, 10, (int) (byte) -1);
        fuzzTest44.FuzzTest_nextClearBit(bitSet45, bitSet53, (int) (byte) 100, 1);
        fuzzTest22.FuzzTest_nextClearBit(bitSet39, bitSet45, (int) (short) 0, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet18, bitSet39, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextClearBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextClearBit(bitSet17, bitSet18, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_nextClearBit(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_nextClearBit(bitSet29, bitSet30, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = null;
        c2s_aug_sub.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_nextClearBit(bitSet35, bitSet36, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_nextClearBit(bitSet40, bitSet41, 10, (int) (byte) -1);
        fuzzTest22.FuzzTest_nextClearBit(bitSet29, bitSet41, 2, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet18, bitSet41, (int) '#', (int) '4');
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_nextClearBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_nextClearBit(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_nextClearBit(bitSet14, bitSet15, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_nextClearBit(bitSet19, bitSet20, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet25 = null;
        c2s_aug_sub.BitSet bitSet26 = null;
        fuzzTest24.FuzzTest_nextClearBit(bitSet25, bitSet26, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_nextClearBit(bitSet30, bitSet31, 10, (int) (byte) -1);
        fuzzTest12.FuzzTest_nextClearBit(bitSet19, bitSet31, 2, (int) (short) 100);
        fuzzTest0.FuzzTest_nextClearBit(bitSet7, bitSet19, (int) (short) 1, 100);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_nextClearBit(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_nextClearBit(bitSet49, bitSet50, 10, (int) (byte) -1);
        fuzzTest41.FuzzTest_nextClearBit(bitSet42, bitSet50, (int) (byte) 100, 1);
        c2s_aug_sub.BitSet bitSet57 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet50, bitSet57, (int) (byte) 10, 2);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet62 = null;
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzzTest61.FuzzTest_nextClearBit(bitSet62, bitSet63, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_nextClearBit(bitSet67, bitSet68, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet75 = null;
        c2s_aug_sub.BitSet bitSet76 = null;
        fuzzTest74.FuzzTest_nextClearBit(bitSet75, bitSet76, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_nextClearBit(bitSet80, bitSet81, 10, (int) (byte) -1);
        fuzzTest72.FuzzTest_nextClearBit(bitSet73, bitSet81, (int) (byte) 100, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet68, bitSet73, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet3 = null;
        c2s_aug_sub.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_nextClearBit(bitSet3, bitSet4, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_nextClearBit(bitSet8, bitSet9, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest2.FuzzTest_nextClearBit(bitSet13, bitSet14, (-1), (int) (short) 100);
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet14, (-1), (int) 'a');
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextClearBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_nextClearBit(bitSet28, bitSet29, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = null;
        c2s_aug_sub.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_nextClearBit(bitSet35, bitSet36, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_nextClearBit(bitSet40, bitSet41, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet46 = null;
        c2s_aug_sub.BitSet bitSet47 = null;
        fuzzTest45.FuzzTest_nextClearBit(bitSet46, bitSet47, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_nextClearBit(bitSet51, bitSet52, 10, (int) (byte) -1);
        fuzzTest33.FuzzTest_nextClearBit(bitSet40, bitSet52, 2, (int) (short) 100);
        fuzzTest21.FuzzTest_nextClearBit(bitSet28, bitSet40, (int) (short) 1, 100);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_nextClearBit(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_nextClearBit(bitSet70, bitSet71, 10, (int) (byte) -1);
        fuzzTest62.FuzzTest_nextClearBit(bitSet63, bitSet71, (int) (byte) 100, 1);
        c2s_aug_sub.BitSet bitSet78 = null;
        fuzzTest21.FuzzTest_nextClearBit(bitSet71, bitSet78, (int) (byte) 10, (-1));
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet83 = null;
        c2s_aug_sub.BitSet bitSet84 = null;
        fuzzTest82.FuzzTest_nextClearBit(bitSet83, bitSet84, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_nextClearBit(bitSet88, bitSet89, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet71, bitSet88, (int) (short) 10, 100);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_nextClearBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_nextClearBit(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextClearBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextClearBit(bitSet8, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_nextClearBit(bitSet27, bitSet28, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_nextClearBit(bitSet32, bitSet33, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_nextClearBit(bitSet40, bitSet41, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet45 = null;
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_nextClearBit(bitSet45, bitSet46, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet51 = null;
        c2s_aug_sub.BitSet bitSet52 = null;
        fuzzTest50.FuzzTest_nextClearBit(bitSet51, bitSet52, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_nextClearBit(bitSet56, bitSet57, 10, (int) (byte) -1);
        fuzzTest38.FuzzTest_nextClearBit(bitSet46, bitSet57, (int) (byte) 1, (int) (short) 10);
        fuzzTest26.FuzzTest_nextClearBit(bitSet37, bitSet57, (int) (byte) 100, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = null;
        fuzzTest68.FuzzTest_nextClearBit(bitSet69, bitSet70, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_nextClearBit(bitSet74, bitSet75, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet80 = null;
        c2s_aug_sub.BitSet bitSet81 = null;
        fuzzTest79.FuzzTest_nextClearBit(bitSet80, bitSet81, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_nextClearBit(bitSet85, bitSet86, 10, (int) (byte) -1);
        fuzzTest67.FuzzTest_nextClearBit(bitSet74, bitSet86, 2, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet57, bitSet86, 10, (int) '#');
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_nextClearBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_nextClearBit(bitSet7, bitSet8, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet15 = null;
        c2s_aug_sub.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_nextClearBit(bitSet15, bitSet16, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_nextClearBit(bitSet20, bitSet21, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet26 = null;
        c2s_aug_sub.BitSet bitSet27 = null;
        fuzzTest25.FuzzTest_nextClearBit(bitSet26, bitSet27, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_nextClearBit(bitSet31, bitSet32, 10, (int) (byte) -1);
        fuzzTest13.FuzzTest_nextClearBit(bitSet20, bitSet32, 2, (int) (short) 100);
        fuzzTest1.FuzzTest_nextClearBit(bitSet12, bitSet20, (int) (short) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = null;
        c2s_aug_sub.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_nextClearBit(bitSet45, bitSet46, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_nextClearBit(bitSet50, bitSet51, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = null;
        fuzzTest44.FuzzTest_nextClearBit(bitSet55, bitSet56, (-1), (int) (short) 100);
        fuzzTest42.FuzzTest_nextClearBit(bitSet43, bitSet56, (-1), (int) 'a');
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_nextClearBit(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_nextClearBit(bitSet70, bitSet71, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet76 = null;
        fuzzTest64.FuzzTest_nextClearBit(bitSet75, bitSet76, (-1), (int) (short) 100);
        fuzzTest42.FuzzTest_nextClearBit(bitSet63, bitSet75, 0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet20, bitSet75, 10, (int) '#');
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet11 = null;
        c2s_aug_sub.BitSet bitSet12 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet11, bitSet12, 10, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_nextClearBit(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_nextClearBit(bitSet23, bitSet24, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_nextClearBit(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_nextClearBit(bitSet34, bitSet35, 10, (int) (byte) -1);
        fuzzTest16.FuzzTest_nextClearBit(bitSet23, bitSet35, 2, (int) (short) 100);
        c2s_aug_sub.BitSet bitSet42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet46 = null;
        c2s_aug_sub.BitSet bitSet47 = null;
        fuzzTest45.FuzzTest_nextClearBit(bitSet46, bitSet47, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_nextClearBit(bitSet51, bitSet52, 10, (int) (byte) -1);
        fuzzTest43.FuzzTest_nextClearBit(bitSet44, bitSet52, (int) (byte) 100, 1);
        fuzzTest16.FuzzTest_nextClearBit(bitSet42, bitSet44, (int) ' ', 1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_nextClearBit(bitSet64, bitSet65, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_nextClearBit(bitSet69, bitSet70, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet75 = null;
        c2s_aug_sub.BitSet bitSet76 = null;
        fuzzTest74.FuzzTest_nextClearBit(bitSet75, bitSet76, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_nextClearBit(bitSet80, bitSet81, 10, (int) (byte) -1);
        fuzzTest62.FuzzTest_nextClearBit(bitSet69, bitSet81, 2, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet44, bitSet81, 10, (int) 'a');
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextClearBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_nextClearBit(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_nextClearBit(bitSet29, bitSet30, 10, (int) (byte) -1);
        fuzzTest11.FuzzTest_nextClearBit(bitSet19, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_nextClearBit(bitSet40, bitSet41, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_nextClearBit(bitSet45, bitSet46, 10, (int) (byte) -1);
        fuzzTest37.FuzzTest_nextClearBit(bitSet38, bitSet46, (int) (byte) 100, 1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet55 = null;
        c2s_aug_sub.BitSet bitSet56 = null;
        fuzzTest54.FuzzTest_nextClearBit(bitSet55, bitSet56, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_nextClearBit(bitSet60, bitSet61, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet66 = null;
        c2s_aug_sub.BitSet bitSet67 = null;
        fuzzTest65.FuzzTest_nextClearBit(bitSet66, bitSet67, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_nextClearBit(bitSet71, bitSet72, 10, (int) (byte) -1);
        fuzzTest53.FuzzTest_nextClearBit(bitSet61, bitSet72, (int) (byte) 1, (int) (short) 10);
        fuzzTest11.FuzzTest_nextClearBit(bitSet46, bitSet61, (int) '#', (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet83 = null;
        c2s_aug_sub.BitSet bitSet84 = null;
        fuzzTest82.FuzzTest_nextClearBit(bitSet83, bitSet84, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_nextClearBit(bitSet88, bitSet89, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet61, bitSet89, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet12 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet11, bitSet12, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = null;
        fuzzTest16.FuzzTest_nextClearBit(bitSet17, bitSet18, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet22 = null;
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_nextClearBit(bitSet22, bitSet23, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_nextClearBit(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_nextClearBit(bitSet34, bitSet35, 10, (int) (byte) -1);
        fuzzTest16.FuzzTest_nextClearBit(bitSet27, bitSet34, 2, 1);
        c2s_aug_sub.BitSet bitSet42 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet27, bitSet42, (int) (short) -1, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet47 = null;
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzzTest46.FuzzTest_nextClearBit(bitSet47, bitSet48, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_nextClearBit(bitSet52, bitSet53, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_nextClearBit(bitSet60, bitSet61, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_nextClearBit(bitSet65, bitSet66, 10, (int) (byte) -1);
        fuzzTest57.FuzzTest_nextClearBit(bitSet58, bitSet66, (int) (byte) 100, 1);
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet77 = null;
        c2s_aug_sub.BitSet bitSet78 = null;
        fuzzTest76.FuzzTest_nextClearBit(bitSet77, bitSet78, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_nextClearBit(bitSet82, bitSet83, 10, (int) (byte) -1);
        fuzzTest74.FuzzTest_nextClearBit(bitSet75, bitSet83, (int) (byte) 100, 1);
        fuzzTest57.FuzzTest_nextClearBit(bitSet73, bitSet75, (int) (byte) 10, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet53, bitSet75, (int) '#', (int) 'a');
    }
}

