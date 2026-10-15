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
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextSetBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextSetBit(bitSet12, bitSet13, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_nextSetBit(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_nextSetBit(bitSet23, bitSet24, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextSetBit(bitSet12, bitSet24, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_nextSetBit(bitSet32, bitSet33, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextSetBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_nextSetBit(bitSet43, bitSet44, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_nextSetBit(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_nextSetBit(bitSet54, bitSet55, 10, (int) (byte) -1);
        fuzzTest31.FuzzTest_nextSetBit(bitSet43, bitSet55, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_nextSetBit(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_nextSetBit(bitSet68, bitSet69, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet74 = null;
        c2s_aug_sub.BitSet bitSet75 = null;
        fuzzTest73.FuzzTest_nextSetBit(bitSet74, bitSet75, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet79 = null;
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_nextSetBit(bitSet79, bitSet80, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet84 = null;
        fuzzTest62.FuzzTest_nextSetBit(bitSet80, bitSet84, (int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet55, bitSet80, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextSetBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextSetBit(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextSetBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_nextSetBit(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_nextSetBit(bitSet34, bitSet35, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_nextSetBit(bitSet40, bitSet41, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_nextSetBit(bitSet45, bitSet46, 10, (int) (byte) -1);
        fuzzTest22.FuzzTest_nextSetBit(bitSet34, bitSet46, (int) '#', 10);
        fuzzTest0.FuzzTest_nextSetBit(bitSet18, bitSet46, 2, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet57 = null;
        c2s_aug_sub.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_nextSetBit(bitSet57, bitSet58, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet62 = null;
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_nextSetBit(bitSet62, bitSet63, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = null;
        fuzzTest68.FuzzTest_nextSetBit(bitSet69, bitSet70, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet74 = null;
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_nextSetBit(bitSet74, bitSet75, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet80 = null;
        c2s_aug_sub.BitSet bitSet81 = null;
        fuzzTest79.FuzzTest_nextSetBit(bitSet80, bitSet81, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_nextSetBit(bitSet85, bitSet86, 10, (int) (byte) -1);
        fuzzTest67.FuzzTest_nextSetBit(bitSet75, bitSet86, (int) (byte) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet63, bitSet75, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextSetBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextSetBit(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextSetBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_nextSetBit(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_nextSetBit(bitSet34, bitSet35, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_nextSetBit(bitSet40, bitSet41, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_nextSetBit(bitSet45, bitSet46, 10, (int) (byte) -1);
        fuzzTest22.FuzzTest_nextSetBit(bitSet34, bitSet46, (int) '#', 10);
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet55 = null;
        c2s_aug_sub.BitSet bitSet56 = null;
        fuzzTest54.FuzzTest_nextSetBit(bitSet55, bitSet56, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet61 = null;
        c2s_aug_sub.BitSet bitSet62 = null;
        fuzzTest60.FuzzTest_nextSetBit(bitSet61, bitSet62, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet66 = null;
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_nextSetBit(bitSet66, bitSet67, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet72 = null;
        c2s_aug_sub.BitSet bitSet73 = null;
        fuzzTest71.FuzzTest_nextSetBit(bitSet72, bitSet73, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_nextSetBit(bitSet77, bitSet78, 10, (int) (byte) -1);
        fuzzTest54.FuzzTest_nextSetBit(bitSet66, bitSet78, (int) '#', 10);
        fuzzTest22.FuzzTest_nextSetBit(bitSet53, bitSet66, (int) '#', (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet18, bitSet53, 2, (int) (byte) 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_nextSetBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_nextSetBit(bitSet7, bitSet8, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextSetBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextSetBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextSetBit(bitSet7, bitSet19, 2, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_nextSetBit(bitSet27, bitSet28, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_nextSetBit(bitSet32, bitSet33, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextSetBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_nextSetBit(bitSet43, bitSet44, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_nextSetBit(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_nextSetBit(bitSet54, bitSet55, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_nextSetBit(bitSet60, bitSet61, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_nextSetBit(bitSet65, bitSet66, (int) '4', (int) '4');
        fuzzTest37.FuzzTest_nextSetBit(bitSet54, bitSet65, 10, 2);
        fuzzTest0.FuzzTest_nextSetBit(bitSet33, bitSet54, (int) '#', (int) (short) -1);
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_nextSetBit(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_nextSetBit(bitSet83, bitSet84, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet76, bitSet84, 10, (int) (short) 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextSetBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextSetBit(bitSet17, bitSet18, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_nextSetBit(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_nextSetBit(bitSet29, bitSet30, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = null;
        c2s_aug_sub.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_nextSetBit(bitSet35, bitSet36, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_nextSetBit(bitSet40, bitSet41, 10, (int) (byte) -1);
        fuzzTest22.FuzzTest_nextSetBit(bitSet30, bitSet41, (int) (byte) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet18, bitSet41, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextSetBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextSetBit(bitSet12, bitSet13, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_nextSetBit(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_nextSetBit(bitSet23, bitSet24, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_nextSetBit(bitSet29, bitSet30, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = null;
        c2s_aug_sub.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_nextSetBit(bitSet35, bitSet36, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_nextSetBit(bitSet40, bitSet41, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet46 = null;
        c2s_aug_sub.BitSet bitSet47 = null;
        fuzzTest45.FuzzTest_nextSetBit(bitSet46, bitSet47, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_nextSetBit(bitSet51, bitSet52, 10, (int) (byte) -1);
        fuzzTest28.FuzzTest_nextSetBit(bitSet40, bitSet52, (int) '#', 10);
        fuzzTest6.FuzzTest_nextSetBit(bitSet24, bitSet52, 2, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_nextSetBit(bitSet63, bitSet64, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = null;
        fuzzTest68.FuzzTest_nextSetBit(bitSet69, bitSet70, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet74 = null;
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_nextSetBit(bitSet74, bitSet75, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet80 = null;
        c2s_aug_sub.BitSet bitSet81 = null;
        fuzzTest79.FuzzTest_nextSetBit(bitSet80, bitSet81, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_nextSetBit(bitSet85, bitSet86, 10, (int) (byte) -1);
        fuzzTest62.FuzzTest_nextSetBit(bitSet74, bitSet86, (int) '#', 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet24, bitSet86, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextSetBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextSetBit(bitSet17, bitSet18, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextSetBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_nextSetBit(bitSet28, bitSet29, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet18, bitSet28, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextSetBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextSetBit(bitSet12, bitSet13, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_nextSetBit(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_nextSetBit(bitSet23, bitSet24, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextSetBit(bitSet12, bitSet24, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_nextSetBit(bitSet32, bitSet33, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_nextSetBit(bitSet37, bitSet38, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_nextSetBit(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_nextSetBit(bitSet49, bitSet50, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet55 = null;
        c2s_aug_sub.BitSet bitSet56 = null;
        fuzzTest54.FuzzTest_nextSetBit(bitSet55, bitSet56, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_nextSetBit(bitSet60, bitSet61, 10, (int) (byte) -1);
        fuzzTest42.FuzzTest_nextSetBit(bitSet49, bitSet61, 2, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet37, bitSet61, (int) '#', 10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_nextSetBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_nextSetBit(bitSet8, bitSet9, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_nextSetBit(bitSet13, bitSet14, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = null;
        fuzzTest18.FuzzTest_nextSetBit(bitSet19, bitSet20, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_nextSetBit(bitSet24, bitSet25, 10, (int) (byte) -1);
        fuzzTest1.FuzzTest_nextSetBit(bitSet13, bitSet25, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_nextSetBit(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_nextSetBit(bitSet38, bitSet39, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_nextSetBit(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_nextSetBit(bitSet49, bitSet50, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet55 = null;
        c2s_aug_sub.BitSet bitSet56 = null;
        fuzzTest54.FuzzTest_nextSetBit(bitSet55, bitSet56, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet61 = null;
        c2s_aug_sub.BitSet bitSet62 = null;
        fuzzTest60.FuzzTest_nextSetBit(bitSet61, bitSet62, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet66 = null;
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_nextSetBit(bitSet66, bitSet67, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet72 = null;
        c2s_aug_sub.BitSet bitSet73 = null;
        fuzzTest71.FuzzTest_nextSetBit(bitSet72, bitSet73, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_nextSetBit(bitSet77, bitSet78, 10, (int) (byte) -1);
        fuzzTest54.FuzzTest_nextSetBit(bitSet66, bitSet78, (int) '#', 10);
        fuzzTest32.FuzzTest_nextSetBit(bitSet50, bitSet78, 2, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet25, bitSet78, (-1), (int) '4');
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextSetBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextSetBit(bitSet12, bitSet13, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_nextSetBit(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_nextSetBit(bitSet23, bitSet24, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextSetBit(bitSet12, bitSet24, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_nextSetBit(bitSet32, bitSet33, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextSetBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_nextSetBit(bitSet43, bitSet44, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_nextSetBit(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_nextSetBit(bitSet54, bitSet55, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_nextSetBit(bitSet60, bitSet61, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_nextSetBit(bitSet65, bitSet66, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet70 = null;
        fuzzTest48.FuzzTest_nextSetBit(bitSet66, bitSet70, (int) (short) -1, (int) (byte) 10);
        fuzzTest31.FuzzTest_nextSetBit(bitSet44, bitSet66, (int) (short) 0, (int) 'a');
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_nextSetBit(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_nextSetBit(bitSet83, bitSet84, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet66, bitSet84, (int) (byte) 100, 100);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_nextSetBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_nextSetBit(bitSet8, bitSet9, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_nextSetBit(bitSet13, bitSet14, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = null;
        fuzzTest18.FuzzTest_nextSetBit(bitSet19, bitSet20, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_nextSetBit(bitSet24, bitSet25, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest7.FuzzTest_nextSetBit(bitSet25, bitSet29, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_nextSetBit(bitSet34, bitSet35, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_nextSetBit(bitSet39, bitSet40, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = null;
        c2s_aug_sub.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_nextSetBit(bitSet45, bitSet46, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_nextSetBit(bitSet50, bitSet51, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet56 = null;
        c2s_aug_sub.BitSet bitSet57 = null;
        fuzzTest55.FuzzTest_nextSetBit(bitSet56, bitSet57, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_nextSetBit(bitSet61, bitSet62, 10, (int) (byte) -1);
        fuzzTest33.FuzzTest_nextSetBit(bitSet50, bitSet61, (int) (byte) 0, (int) (short) 0);
        fuzzTest1.FuzzTest_nextSetBit(bitSet25, bitSet61, (int) (byte) 100, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_nextSetBit(bitSet73, bitSet74, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_nextSetBit(bitSet78, bitSet79, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet61, bitSet78, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet9 = null;
        c2s_aug_sub.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_nextSetBit(bitSet9, bitSet10, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_nextSetBit(bitSet14, bitSet15, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet20 = null;
        c2s_aug_sub.BitSet bitSet21 = null;
        fuzzTest19.FuzzTest_nextSetBit(bitSet20, bitSet21, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet25 = null;
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_nextSetBit(bitSet25, bitSet26, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet31 = null;
        c2s_aug_sub.BitSet bitSet32 = null;
        fuzzTest30.FuzzTest_nextSetBit(bitSet31, bitSet32, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzzTest36.FuzzTest_nextSetBit(bitSet37, bitSet38, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet42 = null;
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_nextSetBit(bitSet42, bitSet43, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_nextSetBit(bitSet48, bitSet49, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_nextSetBit(bitSet53, bitSet54, 10, (int) (byte) -1);
        fuzzTest30.FuzzTest_nextSetBit(bitSet42, bitSet54, (int) '#', 10);
        fuzzTest8.FuzzTest_nextSetBit(bitSet26, bitSet54, 2, (int) (short) 10);
        fuzzTest6.FuzzTest_nextSetBit(bitSet7, bitSet54, (int) (short) 100, (-1));
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_nextSetBit(bitSet68, bitSet69, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_nextSetBit(bitSet73, bitSet74, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet54, bitSet74, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextSetBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextSetBit(bitSet12, bitSet13, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_nextSetBit(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_nextSetBit(bitSet23, bitSet24, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextSetBit(bitSet12, bitSet24, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_nextSetBit(bitSet32, bitSet33, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_nextSetBit(bitSet37, bitSet38, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_nextSetBit(bitSet43, bitSet44, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_nextSetBit(bitSet48, bitSet49, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_nextSetBit(bitSet54, bitSet55, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_nextSetBit(bitSet59, bitSet60, 10, (int) (byte) -1);
        fuzzTest31.FuzzTest_nextSetBit(bitSet48, bitSet59, (int) (byte) 0, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet67 = null;
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_nextSetBit(bitSet67, bitSet68, 10, 10);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_nextSetBit(bitSet73, bitSet74, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_nextSetBit(bitSet78, bitSet79, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet68, bitSet79, (-1), (int) '#');
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextSetBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextSetBit(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextSetBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_nextSetBit(bitSet28, bitSet29, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextSetBit(bitSet17, bitSet28, (int) (byte) 0, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzzTest36.FuzzTest_nextSetBit(bitSet37, bitSet38, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_nextSetBit(bitSet43, bitSet44, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_nextSetBit(bitSet48, bitSet49, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_nextSetBit(bitSet54, bitSet55, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_nextSetBit(bitSet59, bitSet60, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_nextSetBit(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_nextSetBit(bitSet70, bitSet71, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet75 = null;
        fuzzTest53.FuzzTest_nextSetBit(bitSet71, bitSet75, (int) (short) -1, (int) (byte) 10);
        fuzzTest36.FuzzTest_nextSetBit(bitSet49, bitSet71, (int) (short) 0, (int) 'a');
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet71, bitSet82, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextSetBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextSetBit(bitSet18, bitSet19, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_nextSetBit(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_nextSetBit(bitSet29, bitSet30, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = null;
        c2s_aug_sub.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_nextSetBit(bitSet35, bitSet36, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet41 = null;
        c2s_aug_sub.BitSet bitSet42 = null;
        fuzzTest40.FuzzTest_nextSetBit(bitSet41, bitSet42, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet46 = null;
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_nextSetBit(bitSet46, bitSet47, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet52 = null;
        c2s_aug_sub.BitSet bitSet53 = null;
        fuzzTest51.FuzzTest_nextSetBit(bitSet52, bitSet53, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_nextSetBit(bitSet57, bitSet58, 10, (int) (byte) -1);
        fuzzTest34.FuzzTest_nextSetBit(bitSet46, bitSet58, (int) '#', 10);
        fuzzTest12.FuzzTest_nextSetBit(bitSet30, bitSet58, 2, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet11, bitSet30, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_nextSetBit(bitSet8, bitSet9, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_nextSetBit(bitSet13, bitSet14, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = null;
        fuzzTest18.FuzzTest_nextSetBit(bitSet19, bitSet20, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_nextSetBit(bitSet24, bitSet25, 10, (int) (byte) -1);
        fuzzTest6.FuzzTest_nextSetBit(bitSet13, bitSet25, 2, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_nextSetBit(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_nextSetBit(bitSet38, bitSet39, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_nextSetBit(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_nextSetBit(bitSet49, bitSet50, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet55 = null;
        c2s_aug_sub.BitSet bitSet56 = null;
        fuzzTest54.FuzzTest_nextSetBit(bitSet55, bitSet56, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet61 = null;
        c2s_aug_sub.BitSet bitSet62 = null;
        fuzzTest60.FuzzTest_nextSetBit(bitSet61, bitSet62, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet66 = null;
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_nextSetBit(bitSet66, bitSet67, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet72 = null;
        c2s_aug_sub.BitSet bitSet73 = null;
        fuzzTest71.FuzzTest_nextSetBit(bitSet72, bitSet73, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_nextSetBit(bitSet77, bitSet78, 10, (int) (byte) -1);
        fuzzTest54.FuzzTest_nextSetBit(bitSet66, bitSet78, (int) '#', 10);
        fuzzTest32.FuzzTest_nextSetBit(bitSet50, bitSet78, 2, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet13, bitSet78, (int) (short) -1, (int) '#');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextSetBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextSetBit(bitSet17, bitSet18, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextSetBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_nextSetBit(bitSet28, bitSet29, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_nextSetBit(bitSet34, bitSet35, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_nextSetBit(bitSet39, bitSet40, (int) '4', (int) '4');
        fuzzTest11.FuzzTest_nextSetBit(bitSet28, bitSet39, 10, 2);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_nextSetBit(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_nextSetBit(bitSet54, bitSet55, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_nextSetBit(bitSet60, bitSet61, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_nextSetBit(bitSet65, bitSet66, 10, (int) (byte) -1);
        fuzzTest47.FuzzTest_nextSetBit(bitSet55, bitSet66, (int) (byte) 1, (int) (short) 10);
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextSetBit(bitSet55, bitSet73, (int) (byte) 0, (int) 'a');
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_nextSetBit(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_nextSetBit(bitSet83, bitSet84, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet55, bitSet84, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextSetBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextSetBit(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextSetBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_nextSetBit(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_nextSetBit(bitSet34, bitSet35, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_nextSetBit(bitSet40, bitSet41, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_nextSetBit(bitSet45, bitSet46, 10, (int) (byte) -1);
        fuzzTest22.FuzzTest_nextSetBit(bitSet34, bitSet46, (int) '#', 10);
        fuzzTest0.FuzzTest_nextSetBit(bitSet18, bitSet46, 2, (int) (short) 10);
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_nextSetBit(bitSet58, bitSet59, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_nextSetBit(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_nextSetBit(bitSet70, bitSet71, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet76 = null;
        c2s_aug_sub.BitSet bitSet77 = null;
        fuzzTest75.FuzzTest_nextSetBit(bitSet76, bitSet77, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_nextSetBit(bitSet81, bitSet82, 10, (int) (byte) -1);
        fuzzTest63.FuzzTest_nextSetBit(bitSet71, bitSet82, (int) (byte) 1, (int) (short) 10);
        c2s_aug_sub.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_nextSetBit(bitSet71, bitSet89, (int) ' ', (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet56, bitSet71, (int) ' ', (int) '#');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextSetBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextSetBit(bitSet17, bitSet18, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextSetBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_nextSetBit(bitSet28, bitSet29, (int) '4', (int) '4');
        fuzzTest0.FuzzTest_nextSetBit(bitSet17, bitSet28, 10, 2);
        c2s_aug_sub.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_nextSetBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_nextSetBit(bitSet44, bitSet45, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_nextSetBit(bitSet50, bitSet51, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_nextSetBit(bitSet55, bitSet56, 10, (int) (byte) -1);
        fuzzTest37.FuzzTest_nextSetBit(bitSet45, bitSet56, (int) (byte) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet36, bitSet56, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_nextSetBit(bitSet8, bitSet9, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_nextSetBit(bitSet13, bitSet14, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = null;
        fuzzTest18.FuzzTest_nextSetBit(bitSet19, bitSet20, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_nextSetBit(bitSet24, bitSet25, 10, (int) (byte) -1);
        fuzzTest6.FuzzTest_nextSetBit(bitSet14, bitSet25, (int) (byte) 1, (int) (short) 10);
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet14, bitSet32, (int) ' ', (int) (short) 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzzTest36.FuzzTest_nextSetBit(bitSet37, bitSet38, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_nextSetBit(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_nextSetBit(bitSet49, bitSet50, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet55 = null;
        c2s_aug_sub.BitSet bitSet56 = null;
        fuzzTest54.FuzzTest_nextSetBit(bitSet55, bitSet56, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_nextSetBit(bitSet60, bitSet61, 10, (int) (byte) -1);
        fuzzTest42.FuzzTest_nextSetBit(bitSet50, bitSet61, (int) (byte) 1, (int) (short) 10);
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_nextSetBit(bitSet50, bitSet68, (int) ' ', (int) (short) 0);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_nextSetBit(bitSet73, bitSet74, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_nextSetBit(bitSet78, bitSet79, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet50, bitSet79, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_nextSetBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_nextSetBit(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextSetBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextSetBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextSetBit(bitSet8, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_nextSetBit(bitSet27, bitSet28, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_nextSetBit(bitSet32, bitSet33, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextSetBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_nextSetBit(bitSet43, bitSet44, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzzTest26.FuzzTest_nextSetBit(bitSet44, bitSet48, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_nextSetBit(bitSet54, bitSet55, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_nextSetBit(bitSet59, bitSet60, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_nextSetBit(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_nextSetBit(bitSet70, bitSet71, 10, (int) (byte) -1);
        fuzzTest52.FuzzTest_nextSetBit(bitSet59, bitSet71, 2, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet44, bitSet71, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextSetBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet20 = null;
        c2s_aug_sub.BitSet bitSet21 = null;
        fuzzTest19.FuzzTest_nextSetBit(bitSet20, bitSet21, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet25 = null;
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_nextSetBit(bitSet25, bitSet26, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet31 = null;
        c2s_aug_sub.BitSet bitSet32 = null;
        fuzzTest30.FuzzTest_nextSetBit(bitSet31, bitSet32, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_nextSetBit(bitSet36, bitSet37, 10, (int) (byte) -1);
        fuzzTest18.FuzzTest_nextSetBit(bitSet26, bitSet37, (int) (byte) 1, (int) (short) 10);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextSetBit(bitSet26, bitSet44, (int) ' ', (int) (short) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_nextSetBit(bitSet50, bitSet51, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_nextSetBit(bitSet55, bitSet56, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet61 = null;
        c2s_aug_sub.BitSet bitSet62 = null;
        fuzzTest60.FuzzTest_nextSetBit(bitSet61, bitSet62, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_nextSetBit(bitSet66, bitSet67, 10, (int) (byte) -1);
        fuzzTest48.FuzzTest_nextSetBit(bitSet55, bitSet67, 2, (int) (short) 100);
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest12.FuzzTest_nextSetBit(bitSet55, bitSet74, (int) ' ', (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet11, bitSet55, 1, (int) (short) 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_nextSetBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_nextSetBit(bitSet7, bitSet8, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextSetBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextSetBit(bitSet18, bitSet19, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_nextSetBit(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_nextSetBit(bitSet29, bitSet30, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest12.FuzzTest_nextSetBit(bitSet30, bitSet34, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_nextSetBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_nextSetBit(bitSet44, bitSet45, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_nextSetBit(bitSet50, bitSet51, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_nextSetBit(bitSet55, bitSet56, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet61 = null;
        c2s_aug_sub.BitSet bitSet62 = null;
        fuzzTest60.FuzzTest_nextSetBit(bitSet61, bitSet62, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet66 = null;
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_nextSetBit(bitSet66, bitSet67, (int) '4', (int) '4');
        fuzzTest38.FuzzTest_nextSetBit(bitSet55, bitSet66, 10, 2);
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextSetBit(bitSet55, bitSet74, (int) (short) 100, (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet8, bitSet55, (-1), 1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextSetBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextSetBit(bitSet12, bitSet13, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_nextSetBit(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_nextSetBit(bitSet23, bitSet24, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextSetBit(bitSet12, bitSet24, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_nextSetBit(bitSet32, bitSet33, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextSetBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_nextSetBit(bitSet43, bitSet44, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_nextSetBit(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_nextSetBit(bitSet54, bitSet55, 10, (int) (byte) -1);
        fuzzTest31.FuzzTest_nextSetBit(bitSet43, bitSet55, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_nextSetBit(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_nextSetBit(bitSet68, bitSet69, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet74 = null;
        c2s_aug_sub.BitSet bitSet75 = null;
        fuzzTest73.FuzzTest_nextSetBit(bitSet74, bitSet75, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_nextSetBit(bitSet79, bitSet80, 10, (int) (byte) -1);
        fuzzTest31.FuzzTest_nextSetBit(bitSet68, bitSet80, 2, 2);
        c2s_aug_sub.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet80, bitSet87, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextSetBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextSetBit(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextSetBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_nextSetBit(bitSet28, bitSet29, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_nextSetBit(bitSet34, bitSet35, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_nextSetBit(bitSet39, bitSet40, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest22.FuzzTest_nextSetBit(bitSet40, bitSet44, (int) (short) -1, (int) (byte) 10);
        fuzzTest0.FuzzTest_nextSetBit(bitSet17, bitSet44, (int) (byte) -1, (int) ' ');
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet52 = null;
        c2s_aug_sub.BitSet bitSet53 = null;
        fuzzTest51.FuzzTest_nextSetBit(bitSet52, bitSet53, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_nextSetBit(bitSet57, bitSet58, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_nextSetBit(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_nextSetBit(bitSet68, bitSet69, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet74 = null;
        c2s_aug_sub.BitSet bitSet75 = null;
        fuzzTest73.FuzzTest_nextSetBit(bitSet74, bitSet75, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_nextSetBit(bitSet79, bitSet80, 10, (int) (byte) -1);
        fuzzTest51.FuzzTest_nextSetBit(bitSet68, bitSet79, (int) (byte) 0, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet79, bitSet87, 2, (int) (byte) 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_nextSetBit(bitSet14, bitSet15, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_nextSetBit(bitSet19, bitSet20, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet25 = null;
        c2s_aug_sub.BitSet bitSet26 = null;
        fuzzTest24.FuzzTest_nextSetBit(bitSet25, bitSet26, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_nextSetBit(bitSet30, bitSet31, 10, (int) (byte) -1);
        fuzzTest12.FuzzTest_nextSetBit(bitSet20, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_nextSetBit(bitSet11, bitSet20, (int) (short) -1, 10);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet42 = null;
        c2s_aug_sub.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_nextSetBit(bitSet42, bitSet43, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_nextSetBit(bitSet47, bitSet48, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_nextSetBit(bitSet53, bitSet54, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_nextSetBit(bitSet59, bitSet60, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_nextSetBit(bitSet64, bitSet65, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = null;
        fuzzTest69.FuzzTest_nextSetBit(bitSet70, bitSet71, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_nextSetBit(bitSet75, bitSet76, 10, (int) (byte) -1);
        fuzzTest52.FuzzTest_nextSetBit(bitSet64, bitSet76, (int) '#', 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet47, bitSet76, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextSetBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextSetBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_nextSetBit(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_nextSetBit(bitSet29, bitSet30, 10, (int) (byte) -1);
        fuzzTest11.FuzzTest_nextSetBit(bitSet18, bitSet30, 2, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextSetBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_nextSetBit(bitSet43, bitSet44, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_nextSetBit(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_nextSetBit(bitSet54, bitSet55, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_nextSetBit(bitSet60, bitSet61, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet66 = null;
        c2s_aug_sub.BitSet bitSet67 = null;
        fuzzTest65.FuzzTest_nextSetBit(bitSet66, bitSet67, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet71 = null;
        c2s_aug_sub.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_nextSetBit(bitSet71, bitSet72, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet77 = null;
        c2s_aug_sub.BitSet bitSet78 = null;
        fuzzTest76.FuzzTest_nextSetBit(bitSet77, bitSet78, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_nextSetBit(bitSet82, bitSet83, 10, (int) (byte) -1);
        fuzzTest59.FuzzTest_nextSetBit(bitSet71, bitSet83, (int) '#', 10);
        fuzzTest37.FuzzTest_nextSetBit(bitSet55, bitSet83, 2, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet30, bitSet83, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextSetBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextSetBit(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextSetBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_nextSetBit(bitSet28, bitSet29, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest11.FuzzTest_nextSetBit(bitSet29, bitSet33, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_nextSetBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_nextSetBit(bitSet44, bitSet45, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_nextSetBit(bitSet50, bitSet51, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_nextSetBit(bitSet55, bitSet56, 10, (int) (byte) -1);
        fuzzTest37.FuzzTest_nextSetBit(bitSet45, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_nextSetBit(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_nextSetBit(bitSet70, bitSet71, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet76 = null;
        c2s_aug_sub.BitSet bitSet77 = null;
        fuzzTest75.FuzzTest_nextSetBit(bitSet76, bitSet77, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_nextSetBit(bitSet81, bitSet82, 10, (int) (byte) -1);
        fuzzTest63.FuzzTest_nextSetBit(bitSet71, bitSet82, (int) (byte) 1, (int) (short) 10);
        fuzzTest11.FuzzTest_nextSetBit(bitSet56, bitSet82, 0, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet82, bitSet92, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextSetBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextSetBit(bitSet18, bitSet19, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_nextSetBit(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_nextSetBit(bitSet29, bitSet30, 10, (int) (byte) -1);
        fuzzTest11.FuzzTest_nextSetBit(bitSet19, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextSetBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_nextSetBit(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_nextSetBit(bitSet49, bitSet50, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet55 = null;
        c2s_aug_sub.BitSet bitSet56 = null;
        fuzzTest54.FuzzTest_nextSetBit(bitSet55, bitSet56, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_nextSetBit(bitSet60, bitSet61, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet66 = null;
        c2s_aug_sub.BitSet bitSet67 = null;
        fuzzTest65.FuzzTest_nextSetBit(bitSet66, bitSet67, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet71 = null;
        c2s_aug_sub.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_nextSetBit(bitSet71, bitSet72, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet76 = null;
        fuzzTest54.FuzzTest_nextSetBit(bitSet72, bitSet76, (int) (short) -1, (int) (byte) 10);
        fuzzTest37.FuzzTest_nextSetBit(bitSet50, bitSet72, (int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet30, bitSet50, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet9 = null;
        c2s_aug_sub.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_nextSetBit(bitSet9, bitSet10, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet15 = null;
        c2s_aug_sub.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_nextSetBit(bitSet15, bitSet16, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet20 = null;
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_nextSetBit(bitSet20, bitSet21, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet26 = null;
        c2s_aug_sub.BitSet bitSet27 = null;
        fuzzTest25.FuzzTest_nextSetBit(bitSet26, bitSet27, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_nextSetBit(bitSet31, bitSet32, 10, (int) (byte) -1);
        fuzzTest8.FuzzTest_nextSetBit(bitSet20, bitSet32, (int) '#', 10);
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet41 = null;
        c2s_aug_sub.BitSet bitSet42 = null;
        fuzzTest40.FuzzTest_nextSetBit(bitSet41, bitSet42, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet47 = null;
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzzTest46.FuzzTest_nextSetBit(bitSet47, bitSet48, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet52 = null;
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_nextSetBit(bitSet52, bitSet53, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_nextSetBit(bitSet58, bitSet59, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_nextSetBit(bitSet63, bitSet64, 10, (int) (byte) -1);
        fuzzTest40.FuzzTest_nextSetBit(bitSet52, bitSet64, (int) '#', 10);
        fuzzTest8.FuzzTest_nextSetBit(bitSet39, bitSet52, (int) '#', (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet75 = null;
        c2s_aug_sub.BitSet bitSet76 = null;
        fuzzTest74.FuzzTest_nextSetBit(bitSet75, bitSet76, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet80 = null;
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_nextSetBit(bitSet80, bitSet81, (int) '4', (int) '4');
        fuzzTest7.FuzzTest_nextSetBit(bitSet39, bitSet80, (int) (byte) 1, 10);
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet80, (int) (short) 100, (int) (byte) 100);
        c2s_aug_sub.BitSet bitSet91 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet91, bitSet92, 10, (int) ' ');
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_nextSetBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_nextSetBit(bitSet7, bitSet8, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextSetBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextSetBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextSetBit(bitSet7, bitSet19, 2, (int) (short) 100);
        c2s_aug_sub.BitSet bitSet26 = null;
        c2s_aug_sub.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet26, bitSet27, (int) (short) 100, 1);
        c2s_aug_sub.BitSet bitSet31 = null;
        c2s_aug_sub.BitSet bitSet32 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet31, bitSet32, 10, (int) 'a');
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzzTest36.FuzzTest_nextSetBit(bitSet37, bitSet38, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_nextSetBit(bitSet42, bitSet43, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_nextSetBit(bitSet48, bitSet49, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_nextSetBit(bitSet53, bitSet54, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_nextSetBit(bitSet59, bitSet60, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_nextSetBit(bitSet64, bitSet65, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = null;
        fuzzTest69.FuzzTest_nextSetBit(bitSet70, bitSet71, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_nextSetBit(bitSet75, bitSet76, 10, (int) (byte) -1);
        fuzzTest47.FuzzTest_nextSetBit(bitSet64, bitSet75, (int) (byte) 0, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet83 = null;
        fuzzTest36.FuzzTest_nextSetBit(bitSet75, bitSet83, (int) (byte) 100, 100);
        c2s_aug_sub.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet75, bitSet87, (int) (byte) 100, 100);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_nextSetBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_nextSetBit(bitSet7, bitSet8, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextSetBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextSetBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextSetBit(bitSet7, bitSet19, 2, (int) (short) 100);
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_nextSetBit(bitSet28, bitSet29, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_nextSetBit(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_nextSetBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_nextSetBit(bitSet44, bitSet45, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest27.FuzzTest_nextSetBit(bitSet45, bitSet49, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_nextSetBit(bitSet54, bitSet55, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_nextSetBit(bitSet59, bitSet60, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_nextSetBit(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_nextSetBit(bitSet70, bitSet71, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet76 = null;
        c2s_aug_sub.BitSet bitSet77 = null;
        fuzzTest75.FuzzTest_nextSetBit(bitSet76, bitSet77, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet81 = null;
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_nextSetBit(bitSet81, bitSet82, (int) '4', (int) '4');
        fuzzTest53.FuzzTest_nextSetBit(bitSet70, bitSet81, 10, 2);
        c2s_aug_sub.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_nextSetBit(bitSet70, bitSet89, (int) (short) 100, (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet26, bitSet89, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet3 = null;
        c2s_aug_sub.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_nextSetBit(bitSet3, bitSet4, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_nextSetBit(bitSet8, bitSet9, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_nextSetBit(bitSet14, bitSet15, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_nextSetBit(bitSet19, bitSet20, 10, (int) (byte) -1);
        fuzzTest1.FuzzTest_nextSetBit(bitSet8, bitSet20, 2, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_nextSetBit(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_nextSetBit(bitSet34, bitSet35, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_nextSetBit(bitSet40, bitSet41, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_nextSetBit(bitSet45, bitSet46, 10, (int) (byte) -1);
        fuzzTest27.FuzzTest_nextSetBit(bitSet34, bitSet46, 2, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_nextSetBit(bitSet54, bitSet55, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_nextSetBit(bitSet59, bitSet60, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_nextSetBit(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_nextSetBit(bitSet70, bitSet71, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet75 = null;
        fuzzTest53.FuzzTest_nextSetBit(bitSet70, bitSet75, (int) (short) 10, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_nextSetBit(bitSet70, bitSet79, 100, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet20, bitSet79, (-1), (int) (byte) 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, (int) (short) 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextSetBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextSetBit(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextSetBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_nextSetBit(bitSet28, bitSet29, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest11.FuzzTest_nextSetBit(bitSet29, bitSet33, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextSetBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_nextSetBit(bitSet43, bitSet44, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_nextSetBit(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_nextSetBit(bitSet54, bitSet55, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_nextSetBit(bitSet60, bitSet61, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_nextSetBit(bitSet65, bitSet66, (int) '4', (int) '4');
        fuzzTest37.FuzzTest_nextSetBit(bitSet54, bitSet65, 10, 2);
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextSetBit(bitSet54, bitSet73, (int) (short) 100, (-1));
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_nextSetBit(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_nextSetBit(bitSet83, bitSet84, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet73, bitSet84, 100, (int) (short) 100);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet3 = null;
        c2s_aug_sub.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_nextSetBit(bitSet3, bitSet4, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_nextSetBit(bitSet8, bitSet9, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_nextSetBit(bitSet14, bitSet15, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_nextSetBit(bitSet19, bitSet20, 10, (int) (byte) -1);
        fuzzTest1.FuzzTest_nextSetBit(bitSet8, bitSet20, 2, (int) (short) 100);
        c2s_aug_sub.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet20, bitSet27, (int) (short) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_nextSetBit(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_nextSetBit(bitSet38, bitSet39, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_nextSetBit(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_nextSetBit(bitSet49, bitSet50, 10, (int) (byte) -1);
        fuzzTest31.FuzzTest_nextSetBit(bitSet39, bitSet50, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_nextSetBit(bitSet59, bitSet60, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_nextSetBit(bitSet64, bitSet65, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = null;
        fuzzTest69.FuzzTest_nextSetBit(bitSet70, bitSet71, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_nextSetBit(bitSet75, bitSet76, 10, (int) (byte) -1);
        fuzzTest57.FuzzTest_nextSetBit(bitSet64, bitSet76, 2, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet50, bitSet64, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextSetBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextSetBit(bitSet17, bitSet18, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet22 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet17, bitSet22, (int) (short) 10, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_nextSetBit(bitSet27, bitSet28, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_nextSetBit(bitSet32, bitSet33, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextSetBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_nextSetBit(bitSet43, bitSet44, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzzTest26.FuzzTest_nextSetBit(bitSet44, bitSet48, (int) (byte) 10, 100);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_nextSetBit(bitSet53, bitSet54, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_nextSetBit(bitSet58, bitSet59, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_nextSetBit(bitSet64, bitSet65, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_nextSetBit(bitSet69, bitSet70, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet75 = null;
        c2s_aug_sub.BitSet bitSet76 = null;
        fuzzTest74.FuzzTest_nextSetBit(bitSet75, bitSet76, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_nextSetBit(bitSet80, bitSet81, 10, (int) (byte) -1);
        fuzzTest52.FuzzTest_nextSetBit(bitSet69, bitSet80, (int) (byte) 0, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet88 = null;
        c2s_aug_sub.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_nextSetBit(bitSet88, bitSet89, 10, 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet44, bitSet89, 100, (int) (byte) 10);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextSetBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextSetBit(bitSet12, bitSet13, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_nextSetBit(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_nextSetBit(bitSet23, bitSet24, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_nextSetBit(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_nextSetBit(bitSet34, bitSet35, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest17.FuzzTest_nextSetBit(bitSet35, bitSet39, (int) (short) -1, (int) (byte) 10);
        fuzzTest0.FuzzTest_nextSetBit(bitSet13, bitSet35, (int) (short) 0, (int) 'a');
        c2s_aug_sub.BitSet bitSet46 = null;
        c2s_aug_sub.BitSet bitSet47 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet46, bitSet47, (int) ' ', (-1));
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_nextSetBit(bitSet54, bitSet55, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_nextSetBit(bitSet59, bitSet60, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_nextSetBit(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_nextSetBit(bitSet70, bitSet71, 10, (int) (byte) -1);
        fuzzTest52.FuzzTest_nextSetBit(bitSet59, bitSet71, 2, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet51, bitSet59, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextSetBit(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextSetBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextSetBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_nextSetBit(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_nextSetBit(bitSet29, bitSet30, 10, (int) (byte) -1);
        fuzzTest11.FuzzTest_nextSetBit(bitSet18, bitSet30, 2, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextSetBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_nextSetBit(bitSet43, bitSet44, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_nextSetBit(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_nextSetBit(bitSet54, bitSet55, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_nextSetBit(bitSet60, bitSet61, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_nextSetBit(bitSet65, bitSet66, 10, (int) (byte) -1);
        fuzzTest37.FuzzTest_nextSetBit(bitSet54, bitSet65, (int) (byte) 0, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet73 = null;
        fuzzTest11.FuzzTest_nextSetBit(bitSet65, bitSet73, 0, (int) '#');
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_nextSetBit(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_nextSetBit(bitSet83, bitSet84, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet65, bitSet83, (int) '4', (int) (short) 100);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_nextSetBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_nextSetBit(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextSetBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextSetBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextSetBit(bitSet8, bitSet19, (int) (byte) 1, (int) (short) 10);
        c2s_aug_sub.BitSet bitSet26 = null;
        c2s_aug_sub.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet26, bitSet27, 2, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_nextSetBit(bitSet32, bitSet33, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_nextSetBit(bitSet37, bitSet38, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_nextSetBit(bitSet43, bitSet44, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_nextSetBit(bitSet48, bitSet49, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_nextSetBit(bitSet54, bitSet55, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_nextSetBit(bitSet60, bitSet61, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_nextSetBit(bitSet65, bitSet66, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet71 = null;
        c2s_aug_sub.BitSet bitSet72 = null;
        fuzzTest70.FuzzTest_nextSetBit(bitSet71, bitSet72, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_nextSetBit(bitSet76, bitSet77, 10, (int) (byte) -1);
        fuzzTest53.FuzzTest_nextSetBit(bitSet65, bitSet77, (int) '#', 10);
        fuzzTest31.FuzzTest_nextSetBit(bitSet49, bitSet77, 2, (int) (short) 10);
        c2s_aug_sub.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet49, bitSet87, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_nextSetBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_nextSetBit(bitSet7, bitSet8, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet15 = null;
        c2s_aug_sub.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_nextSetBit(bitSet15, bitSet16, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet20 = null;
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_nextSetBit(bitSet20, bitSet21, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet26 = null;
        c2s_aug_sub.BitSet bitSet27 = null;
        fuzzTest25.FuzzTest_nextSetBit(bitSet26, bitSet27, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_nextSetBit(bitSet31, bitSet32, 10, (int) (byte) -1);
        fuzzTest13.FuzzTest_nextSetBit(bitSet21, bitSet32, (int) (byte) 1, (int) (short) 10);
        fuzzTest1.FuzzTest_nextSetBit(bitSet12, bitSet21, (int) (short) -1, 10);
        c2s_aug_sub.BitSet bitSet42 = null;
        fuzzTest0.FuzzTest_nextSetBit(bitSet12, bitSet42, (int) '4', 10);
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_nextSetBit(bitSet48, bitSet49, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest47.FuzzTest_nextSetBit(bitSet53, bitSet54, (int) 'a', (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest47.FuzzTest_nextSetBit(bitSet58, bitSet59, (int) (byte) 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextSetBit(bitSet46, bitSet58, (int) '4', (int) (byte) 1);
    }
}

