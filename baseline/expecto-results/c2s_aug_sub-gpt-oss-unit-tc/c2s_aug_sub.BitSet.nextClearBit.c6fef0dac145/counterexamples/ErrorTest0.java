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
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet8, bitSet19, (int) (byte) 1, (int) (short) 10);
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
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextClearBit(bitSet17, bitSet18, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet18, bitSet22, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_nextClearBit(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_nextClearBit(bitSet38, bitSet39, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_nextClearBit(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_nextClearBit(bitSet49, bitSet50, 10, (int) (byte) -1);
        fuzzTest26.FuzzTest_nextClearBit(bitSet38, bitSet50, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_nextClearBit(bitSet58, bitSet59, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_nextClearBit(bitSet63, bitSet64, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet50, bitSet63, 0, (int) (short) 10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        c2s_aug_sub.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_nextClearBit(bitSet37, bitSet38, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_nextClearBit(bitSet43, bitSet44, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_nextClearBit(bitSet48, bitSet49, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_nextClearBit(bitSet54, bitSet55, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_nextClearBit(bitSet59, bitSet60, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_nextClearBit(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_nextClearBit(bitSet70, bitSet71, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet75 = null;
        fuzzTest53.FuzzTest_nextClearBit(bitSet71, bitSet75, (int) (short) -1, (int) (byte) 10);
        fuzzTest31.FuzzTest_nextClearBit(bitSet49, bitSet71, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet83 = null;
        c2s_aug_sub.BitSet bitSet84 = null;
        fuzzTest82.FuzzTest_nextClearBit(bitSet83, bitSet84, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_nextClearBit(bitSet88, bitSet89, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet71, bitSet88, (int) 'a', (int) ' ');
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
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_nextClearBit(bitSet8, bitSet9, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_nextClearBit(bitSet14, bitSet15, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_nextClearBit(bitSet19, bitSet20, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet25 = null;
        c2s_aug_sub.BitSet bitSet26 = null;
        fuzzTest24.FuzzTest_nextClearBit(bitSet25, bitSet26, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet30 = null;
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_nextClearBit(bitSet30, bitSet31, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest13.FuzzTest_nextClearBit(bitSet31, bitSet35, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_nextClearBit(bitSet40, bitSet41, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet46 = null;
        c2s_aug_sub.BitSet bitSet47 = null;
        fuzzTest45.FuzzTest_nextClearBit(bitSet46, bitSet47, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet51 = null;
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_nextClearBit(bitSet51, bitSet52, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet57 = null;
        c2s_aug_sub.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_nextClearBit(bitSet57, bitSet58, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_nextClearBit(bitSet62, bitSet63, 10, (int) (byte) -1);
        fuzzTest39.FuzzTest_nextClearBit(bitSet51, bitSet63, (int) '#', 10);
        fuzzTest7.FuzzTest_nextClearBit(bitSet31, bitSet63, 100, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet63, (int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        c2s_aug_sub.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_nextClearBit(bitSet37, bitSet38, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_nextClearBit(bitSet43, bitSet44, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_nextClearBit(bitSet48, bitSet49, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_nextClearBit(bitSet54, bitSet55, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_nextClearBit(bitSet59, bitSet60, (int) '4', (int) '4');
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
        c2s_aug_sub.BitSet bitSet81 = null;
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_nextClearBit(bitSet81, bitSet82, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet86 = null;
        fuzzTest64.FuzzTest_nextClearBit(bitSet82, bitSet86, (int) (short) -1, (int) (byte) 10);
        fuzzTest42.FuzzTest_nextClearBit(bitSet60, bitSet82, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet38, bitSet82, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet11, bitSet12, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextClearBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet11, bitSet18, 100, (int) ' ');
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
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_nextClearBit(bitSet7, bitSet8, 10, (int) (byte) -1);
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
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_nextClearBit(bitSet29, bitSet30, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = null;
        c2s_aug_sub.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_nextClearBit(bitSet35, bitSet36, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_nextClearBit(bitSet40, bitSet41, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest23.FuzzTest_nextClearBit(bitSet41, bitSet45, (int) (short) -1, (int) (byte) 10);
        fuzzTest1.FuzzTest_nextClearBit(bitSet19, bitSet41, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_nextClearBit(bitSet53, bitSet54, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_nextClearBit(bitSet58, bitSet59, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_nextClearBit(bitSet64, bitSet65, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_nextClearBit(bitSet69, bitSet70, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet75 = null;
        c2s_aug_sub.BitSet bitSet76 = null;
        fuzzTest74.FuzzTest_nextClearBit(bitSet75, bitSet76, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet80 = null;
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_nextClearBit(bitSet80, bitSet81, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet85 = null;
        fuzzTest63.FuzzTest_nextClearBit(bitSet81, bitSet85, (int) (short) -1, (int) (byte) 10);
        fuzzTest1.FuzzTest_nextClearBit(bitSet59, bitSet81, 2, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet59, bitSet92, (int) (short) -1, 10);
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
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextClearBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet11, bitSet19, 2, (int) '#');
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextClearBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextClearBit(bitSet11, bitSet19, (int) (byte) 100, 1);
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet26, bitSet27, (int) (byte) -1, 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextClearBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextClearBit(bitSet12, bitSet13, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_nextClearBit(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_nextClearBit(bitSet23, bitSet24, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_nextClearBit(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_nextClearBit(bitSet34, bitSet35, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_nextClearBit(bitSet40, bitSet41, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet45 = null;
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_nextClearBit(bitSet45, bitSet46, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest28.FuzzTest_nextClearBit(bitSet46, bitSet50, (int) (short) -1, (int) (byte) 10);
        fuzzTest6.FuzzTest_nextClearBit(bitSet24, bitSet46, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_nextClearBit(bitSet58, bitSet59, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_nextClearBit(bitSet63, bitSet64, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = null;
        fuzzTest69.FuzzTest_nextClearBit(bitSet70, bitSet71, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_nextClearBit(bitSet75, bitSet76, 10, (int) (byte) -1);
        fuzzTest57.FuzzTest_nextClearBit(bitSet68, bitSet76, (int) (byte) 100, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet24, bitSet68, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet3 = null;
        c2s_aug_sub.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_nextClearBit(bitSet3, bitSet4, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet9 = null;
        c2s_aug_sub.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_nextClearBit(bitSet9, bitSet10, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_nextClearBit(bitSet14, bitSet15, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet20 = null;
        c2s_aug_sub.BitSet bitSet21 = null;
        fuzzTest19.FuzzTest_nextClearBit(bitSet20, bitSet21, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_nextClearBit(bitSet25, bitSet26, 10, (int) (byte) -1);
        fuzzTest2.FuzzTest_nextClearBit(bitSet14, bitSet26, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_nextClearBit(bitSet34, bitSet35, 0, (int) (byte) 0);
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
        fuzzTest33.FuzzTest_nextClearBit(bitSet45, bitSet57, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_nextClearBit(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_nextClearBit(bitSet70, bitSet71, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet77 = null;
        c2s_aug_sub.BitSet bitSet78 = null;
        fuzzTest76.FuzzTest_nextClearBit(bitSet77, bitSet78, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_nextClearBit(bitSet82, bitSet83, 10, (int) (byte) -1);
        fuzzTest64.FuzzTest_nextClearBit(bitSet75, bitSet83, (int) (byte) 100, 1);
        fuzzTest2.FuzzTest_nextClearBit(bitSet57, bitSet83, 2, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet83, (int) (byte) 10, 10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextClearBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_nextClearBit(bitSet28, bitSet29, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest11.FuzzTest_nextClearBit(bitSet29, bitSet33, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextClearBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_nextClearBit(bitSet43, bitSet44, (int) '4', (int) '4');
        fuzzTest0.FuzzTest_nextClearBit(bitSet33, bitSet43, (int) (byte) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet52 = null;
        c2s_aug_sub.BitSet bitSet53 = null;
        fuzzTest51.FuzzTest_nextClearBit(bitSet52, bitSet53, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_nextClearBit(bitSet57, bitSet58, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet57, bitSet62, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextClearBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextClearBit(bitSet11, bitSet19, (int) (byte) 100, 1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_nextClearBit(bitSet28, bitSet29, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_nextClearBit(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_nextClearBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_nextClearBit(bitSet44, bitSet45, 10, (int) (byte) -1);
        fuzzTest26.FuzzTest_nextClearBit(bitSet34, bitSet45, (int) (byte) 10, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_nextClearBit(bitSet53, bitSet54, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_nextClearBit(bitSet58, bitSet59, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_nextClearBit(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_nextClearBit(bitSet70, bitSet71, 10, (int) (byte) -1);
        fuzzTest52.FuzzTest_nextClearBit(bitSet63, bitSet71, (int) (byte) 100, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet45, bitSet71, 0, (int) (byte) 10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        c2s_aug_sub.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_nextClearBit(bitSet37, bitSet38, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet42 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet37, bitSet42, 0, 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet47 = null;
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzzTest46.FuzzTest_nextClearBit(bitSet47, bitSet48, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_nextClearBit(bitSet52, bitSet53, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_nextClearBit(bitSet59, bitSet60, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_nextClearBit(bitSet64, bitSet65, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = null;
        fuzzTest69.FuzzTest_nextClearBit(bitSet70, bitSet71, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_nextClearBit(bitSet75, bitSet76, 10, (int) (byte) -1);
        fuzzTest57.FuzzTest_nextClearBit(bitSet65, bitSet76, (int) (byte) 10, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet52, bitSet65, (int) (byte) 1, 10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextClearBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_nextClearBit(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_nextClearBit(bitSet34, bitSet35, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_nextClearBit(bitSet40, bitSet41, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_nextClearBit(bitSet45, bitSet46, 10, (int) (byte) -1);
        fuzzTest22.FuzzTest_nextClearBit(bitSet34, bitSet46, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_nextClearBit(bitSet54, bitSet55, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_nextClearBit(bitSet59, bitSet60, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest22.FuzzTest_nextClearBit(bitSet59, bitSet64, 0, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet17, bitSet59, (int) '4', 10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet4 = null;
        c2s_aug_sub.BitSet bitSet5 = null;
        fuzzTest3.FuzzTest_nextClearBit(bitSet4, bitSet5, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet9 = null;
        c2s_aug_sub.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_nextClearBit(bitSet9, bitSet10, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet16 = null;
        c2s_aug_sub.BitSet bitSet17 = null;
        fuzzTest15.FuzzTest_nextClearBit(bitSet16, bitSet17, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_nextClearBit(bitSet21, bitSet22, 10, (int) (byte) -1);
        fuzzTest3.FuzzTest_nextClearBit(bitSet14, bitSet22, (int) (byte) 100, 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet30 = null;
        c2s_aug_sub.BitSet bitSet31 = null;
        fuzzTest29.FuzzTest_nextClearBit(bitSet30, bitSet31, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet35 = null;
        c2s_aug_sub.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_nextClearBit(bitSet35, bitSet36, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet41 = null;
        c2s_aug_sub.BitSet bitSet42 = null;
        fuzzTest40.FuzzTest_nextClearBit(bitSet41, bitSet42, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet46 = null;
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_nextClearBit(bitSet46, bitSet47, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_nextClearBit(bitSet53, bitSet54, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_nextClearBit(bitSet58, bitSet59, 10, (int) (byte) -1);
        fuzzTest40.FuzzTest_nextClearBit(bitSet51, bitSet59, (int) (byte) 100, 1);
        fuzzTest3.FuzzTest_nextClearBit(bitSet35, bitSet59, 10, 0);
        fuzzTest1.FuzzTest_nextClearBit(bitSet2, bitSet59, 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_nextClearBit(bitSet73, bitSet74, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_nextClearBit(bitSet78, bitSet79, (int) '4', (int) '4');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet59, bitSet79, 0, (int) (short) 10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextClearBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextClearBit(bitSet12, bitSet13, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_nextClearBit(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_nextClearBit(bitSet23, bitSet24, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_nextClearBit(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_nextClearBit(bitSet34, bitSet35, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_nextClearBit(bitSet40, bitSet41, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet45 = null;
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_nextClearBit(bitSet45, bitSet46, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest28.FuzzTest_nextClearBit(bitSet46, bitSet50, (int) (short) -1, (int) (byte) 10);
        fuzzTest6.FuzzTest_nextClearBit(bitSet24, bitSet46, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_nextClearBit(bitSet59, bitSet60, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_nextClearBit(bitSet64, bitSet65, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = null;
        fuzzTest69.FuzzTest_nextClearBit(bitSet70, bitSet71, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_nextClearBit(bitSet75, bitSet76, 10, (int) (byte) -1);
        fuzzTest57.FuzzTest_nextClearBit(bitSet65, bitSet76, (int) (byte) 10, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet24, bitSet76, 0, 100);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextClearBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = null;
        fuzzTest18.FuzzTest_nextClearBit(bitSet19, bitSet20, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_nextClearBit(bitSet24, bitSet25, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet30 = null;
        c2s_aug_sub.BitSet bitSet31 = null;
        fuzzTest29.FuzzTest_nextClearBit(bitSet30, bitSet31, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_nextClearBit(bitSet35, bitSet36, 10, (int) (byte) -1);
        fuzzTest12.FuzzTest_nextClearBit(bitSet24, bitSet36, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_nextClearBit(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_nextClearBit(bitSet49, bitSet50, 10, (int) (byte) -1);
        fuzzTest11.FuzzTest_nextClearBit(bitSet24, bitSet50, 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_nextClearBit(bitSet58, bitSet59, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_nextClearBit(bitSet63, bitSet64, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet50, bitSet63, (int) (short) 10, 10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextClearBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextClearBit(bitSet12, bitSet13, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_nextClearBit(bitSet18, bitSet19, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_nextClearBit(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_nextClearBit(bitSet29, bitSet30, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = null;
        c2s_aug_sub.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_nextClearBit(bitSet35, bitSet36, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_nextClearBit(bitSet40, bitSet41, 10, (int) (byte) -1);
        fuzzTest17.FuzzTest_nextClearBit(bitSet29, bitSet41, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_nextClearBit(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_nextClearBit(bitSet54, bitSet55, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest17.FuzzTest_nextClearBit(bitSet54, bitSet59, 0, 0);
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
        c2s_aug_sub.BitSet bitSet80 = null;
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_nextClearBit(bitSet80, bitSet81, (int) '4', (int) '4');
        fuzzTest17.FuzzTest_nextClearBit(bitSet69, bitSet81, (int) (short) 10, 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet13, bitSet81, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        fuzzTest0.FuzzTest_nextClearBit(bitSet8, bitSet19, (int) (byte) 10, (int) (short) 0);
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
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_nextClearBit(bitSet60, bitSet61, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_nextClearBit(bitSet65, bitSet66, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet70 = null;
        fuzzTest48.FuzzTest_nextClearBit(bitSet66, bitSet70, (int) (short) -1, (int) (byte) 10);
        fuzzTest26.FuzzTest_nextClearBit(bitSet44, bitSet66, 0, (int) (byte) 1);
        c2s_aug_sub.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet66, bitSet77, 0, (int) (short) 10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_nextClearBit(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_nextClearBit(bitSet34, bitSet35, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet41 = null;
        c2s_aug_sub.BitSet bitSet42 = null;
        fuzzTest40.FuzzTest_nextClearBit(bitSet41, bitSet42, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_nextClearBit(bitSet46, bitSet47, 10, (int) (byte) -1);
        fuzzTest28.FuzzTest_nextClearBit(bitSet39, bitSet47, (int) (byte) 100, 1);
        fuzzTest6.FuzzTest_nextClearBit(bitSet24, bitSet47, (int) (byte) 100, 0);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_nextClearBit(bitSet59, bitSet60, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_nextClearBit(bitSet64, bitSet65, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = null;
        fuzzTest69.FuzzTest_nextClearBit(bitSet70, bitSet71, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_nextClearBit(bitSet75, bitSet76, 10, (int) (byte) -1);
        fuzzTest57.FuzzTest_nextClearBit(bitSet65, bitSet76, (int) (byte) 10, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet47, bitSet76, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = null;
        fuzzTest18.FuzzTest_nextClearBit(bitSet19, bitSet20, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_nextClearBit(bitSet24, bitSet25, 10, (int) (byte) -1);
        fuzzTest6.FuzzTest_nextClearBit(bitSet17, bitSet25, (int) (byte) 100, 1);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_nextClearBit(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_nextClearBit(bitSet38, bitSet39, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet25, bitSet38, 1, (int) (short) 100);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
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
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_nextClearBit(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_nextClearBit(bitSet29, bitSet30, 10, (int) (byte) -1);
        fuzzTest11.FuzzTest_nextClearBit(bitSet19, bitSet29, (int) (short) 0, 1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_nextClearBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_nextClearBit(bitSet44, bitSet45, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_nextClearBit(bitSet50, bitSet51, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_nextClearBit(bitSet55, bitSet56, 10, (int) (byte) -1);
        fuzzTest37.FuzzTest_nextClearBit(bitSet45, bitSet56, (int) (byte) 10, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_nextClearBit(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_nextClearBit(bitSet70, bitSet71, 10, (int) (byte) -1);
        fuzzTest37.FuzzTest_nextClearBit(bitSet63, bitSet70, (int) (byte) 100, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet19, bitSet70, (int) (byte) 0, 10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextClearBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextClearBit(bitSet12, bitSet13, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet13, bitSet17, (int) ' ', (int) 'a');
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
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
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_nextClearBit(bitSet28, bitSet29, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_nextClearBit(bitSet34, bitSet35, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_nextClearBit(bitSet39, bitSet40, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = null;
        c2s_aug_sub.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_nextClearBit(bitSet45, bitSet46, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_nextClearBit(bitSet50, bitSet51, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet56 = null;
        c2s_aug_sub.BitSet bitSet57 = null;
        fuzzTest55.FuzzTest_nextClearBit(bitSet56, bitSet57, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet61 = null;
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_nextClearBit(bitSet61, bitSet62, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_nextClearBit(bitSet68, bitSet69, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_nextClearBit(bitSet73, bitSet74, 10, (int) (byte) -1);
        fuzzTest55.FuzzTest_nextClearBit(bitSet66, bitSet74, (int) (byte) 100, 1);
        fuzzTest33.FuzzTest_nextClearBit(bitSet51, bitSet74, (int) (byte) 100, 0);
        c2s_aug_sub.BitSet bitSet84 = null;
        fuzzTest22.FuzzTest_nextClearBit(bitSet74, bitSet84, (int) ' ', (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet18, bitSet74, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
        fuzzTest0.FuzzTest_nextClearBit(bitSet8, bitSet19, (int) (byte) 10, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_nextClearBit(bitSet28, bitSet29, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_nextClearBit(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_nextClearBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_nextClearBit(bitSet44, bitSet45, 10, (int) (byte) -1);
        fuzzTest26.FuzzTest_nextClearBit(bitSet34, bitSet45, (int) (byte) 10, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet52 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet45, bitSet52, 0, (int) '#');
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_nextClearBit(bitSet58, bitSet59, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_nextClearBit(bitSet64, bitSet65, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_nextClearBit(bitSet69, bitSet70, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_nextClearBit(bitSet69, bitSet74, (int) (short) 0, 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet56, bitSet74, (int) (short) -1, 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet3 = null;
        c2s_aug_sub.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_nextClearBit(bitSet3, bitSet4, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_nextClearBit(bitSet8, bitSet9, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_nextClearBit(bitSet14, bitSet15, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_nextClearBit(bitSet19, bitSet20, 10, (int) (byte) -1);
        fuzzTest1.FuzzTest_nextClearBit(bitSet9, bitSet19, (int) (short) 0, 1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_nextClearBit(bitSet28, bitSet29, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_nextClearBit(bitSet33, bitSet34, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_nextClearBit(bitSet40, bitSet41, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_nextClearBit(bitSet45, bitSet46, 10, (int) (byte) -1);
        fuzzTest27.FuzzTest_nextClearBit(bitSet38, bitSet46, (int) (byte) 100, 1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_nextClearBit(bitSet54, bitSet55, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_nextClearBit(bitSet59, bitSet60, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_nextClearBit(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_nextClearBit(bitSet70, bitSet71, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet77 = null;
        c2s_aug_sub.BitSet bitSet78 = null;
        fuzzTest76.FuzzTest_nextClearBit(bitSet77, bitSet78, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_nextClearBit(bitSet82, bitSet83, 10, (int) (byte) -1);
        fuzzTest64.FuzzTest_nextClearBit(bitSet75, bitSet83, (int) (byte) 100, 1);
        fuzzTest27.FuzzTest_nextClearBit(bitSet59, bitSet83, 10, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet19, bitSet83, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextClearBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = null;
        fuzzTest18.FuzzTest_nextClearBit(bitSet19, bitSet20, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_nextClearBit(bitSet24, bitSet25, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet24, bitSet29, (int) (short) 0, 2);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_nextClearBit(bitSet34, bitSet35, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_nextClearBit(bitSet39, bitSet40, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = null;
        c2s_aug_sub.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_nextClearBit(bitSet45, bitSet46, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_nextClearBit(bitSet50, bitSet51, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet56 = null;
        c2s_aug_sub.BitSet bitSet57 = null;
        fuzzTest55.FuzzTest_nextClearBit(bitSet56, bitSet57, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_nextClearBit(bitSet61, bitSet62, 10, (int) (byte) -1);
        fuzzTest33.FuzzTest_nextClearBit(bitSet50, bitSet61, 0, 0);
        fuzzTest11.FuzzTest_nextClearBit(bitSet24, bitSet50, (int) (byte) 100, 0);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_nextClearBit(bitSet73, bitSet74, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_nextClearBit(bitSet78, bitSet79, (int) '4', (int) '4');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet24, bitSet79, 0, (int) (short) 10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
        fuzzTest0.FuzzTest_nextClearBit(bitSet8, bitSet19, (int) (byte) 10, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_nextClearBit(bitSet28, bitSet29, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_nextClearBit(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_nextClearBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_nextClearBit(bitSet44, bitSet45, 10, (int) (byte) -1);
        fuzzTest26.FuzzTest_nextClearBit(bitSet34, bitSet45, (int) (byte) 10, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet52 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet45, bitSet52, 0, (int) '#');
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet57 = null;
        c2s_aug_sub.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_nextClearBit(bitSet57, bitSet58, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet62 = null;
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_nextClearBit(bitSet62, bitSet63, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_nextClearBit(bitSet68, bitSet69, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_nextClearBit(bitSet73, bitSet74, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet78 = null;
        fuzzTest56.FuzzTest_nextClearBit(bitSet74, bitSet78, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet83 = null;
        c2s_aug_sub.BitSet bitSet84 = null;
        fuzzTest82.FuzzTest_nextClearBit(bitSet83, bitSet84, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_nextClearBit(bitSet88, bitSet89, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet74, bitSet89, (-1), (int) (short) 10);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
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
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_nextClearBit(bitSet28, bitSet29, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_nextClearBit(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_nextClearBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_nextClearBit(bitSet44, bitSet45, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_nextClearBit(bitSet50, bitSet51, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_nextClearBit(bitSet55, bitSet56, 10, (int) (byte) -1);
        fuzzTest27.FuzzTest_nextClearBit(bitSet44, bitSet55, 0, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet26, bitSet55, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextClearBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextClearBit(bitSet12, bitSet13, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet12, bitSet17, (int) (short) 0, 2);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet22 = null;
        c2s_aug_sub.BitSet bitSet23 = null;
        fuzzTest21.FuzzTest_nextClearBit(bitSet22, bitSet23, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_nextClearBit(bitSet27, bitSet28, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet36 = null;
        c2s_aug_sub.BitSet bitSet37 = null;
        fuzzTest35.FuzzTest_nextClearBit(bitSet36, bitSet37, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet41 = null;
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_nextClearBit(bitSet41, bitSet42, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet47 = null;
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzzTest46.FuzzTest_nextClearBit(bitSet47, bitSet48, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_nextClearBit(bitSet52, bitSet53, 10, (int) (byte) -1);
        fuzzTest34.FuzzTest_nextClearBit(bitSet42, bitSet53, (int) (byte) 10, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet62 = null;
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzzTest61.FuzzTest_nextClearBit(bitSet62, bitSet63, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet67 = null;
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_nextClearBit(bitSet67, bitSet68, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_nextClearBit(bitSet73, bitSet74, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_nextClearBit(bitSet78, bitSet79, 10, (int) (byte) -1);
        fuzzTest60.FuzzTest_nextClearBit(bitSet68, bitSet79, (int) (byte) 10, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet86 = null;
        fuzzTest34.FuzzTest_nextClearBit(bitSet79, bitSet86, 0, (int) '#');
        fuzzTest32.FuzzTest_nextClearBit(bitSet33, bitSet79, (int) (short) 10, 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet28, bitSet79, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextClearBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextClearBit(bitSet12, bitSet13, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_nextClearBit(bitSet18, bitSet19, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_nextClearBit(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_nextClearBit(bitSet29, bitSet30, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = null;
        c2s_aug_sub.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_nextClearBit(bitSet35, bitSet36, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_nextClearBit(bitSet40, bitSet41, 10, (int) (byte) -1);
        fuzzTest17.FuzzTest_nextClearBit(bitSet29, bitSet41, (int) '#', 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet12, bitSet41, (int) (byte) 1, 100);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
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
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextClearBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_nextClearBit(bitSet28, bitSet29, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_nextClearBit(bitSet34, bitSet35, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_nextClearBit(bitSet39, bitSet40, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = null;
        c2s_aug_sub.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_nextClearBit(bitSet45, bitSet46, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_nextClearBit(bitSet50, bitSet51, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest33.FuzzTest_nextClearBit(bitSet51, bitSet55, (int) (short) -1, (int) (byte) 10);
        fuzzTest11.FuzzTest_nextClearBit(bitSet29, bitSet51, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_nextClearBit(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_nextClearBit(bitSet68, bitSet69, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet75 = null;
        c2s_aug_sub.BitSet bitSet76 = null;
        fuzzTest74.FuzzTest_nextClearBit(bitSet75, bitSet76, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_nextClearBit(bitSet80, bitSet81, 10, (int) (byte) -1);
        fuzzTest62.FuzzTest_nextClearBit(bitSet73, bitSet81, (int) (byte) 100, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet29, bitSet73, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextClearBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextClearBit(bitSet12, bitSet13, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet12, bitSet17, (int) (short) 0, 2);
        c2s_aug_sub.BitSet bitSet21 = null;
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
        fuzzTest22.FuzzTest_nextClearBit(bitSet30, bitSet40, (int) (short) 0, 1);
        fuzzTest0.FuzzTest_nextClearBit(bitSet21, bitSet30, (int) 'a', 100);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_nextClearBit(bitSet53, bitSet54, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_nextClearBit(bitSet58, bitSet59, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_nextClearBit(bitSet64, bitSet65, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_nextClearBit(bitSet69, bitSet70, 10, (int) (byte) -1);
        fuzzTest51.FuzzTest_nextClearBit(bitSet59, bitSet70, (int) (byte) 10, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_nextClearBit(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_nextClearBit(bitSet83, bitSet84, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet59, bitSet84, (int) (short) 10, 100);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
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
        fuzzTest0.FuzzTest_nextClearBit(bitSet17, bitSet28, 0, 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextClearBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_nextClearBit(bitSet43, bitSet44, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_nextClearBit(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_nextClearBit(bitSet54, bitSet55, 10, (int) (byte) -1);
        fuzzTest36.FuzzTest_nextClearBit(bitSet44, bitSet54, (int) (short) 0, 1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_nextClearBit(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_nextClearBit(bitSet68, bitSet69, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet75 = null;
        c2s_aug_sub.BitSet bitSet76 = null;
        fuzzTest74.FuzzTest_nextClearBit(bitSet75, bitSet76, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_nextClearBit(bitSet80, bitSet81, 10, (int) (byte) -1);
        fuzzTest62.FuzzTest_nextClearBit(bitSet73, bitSet81, (int) (byte) 100, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet44, bitSet81, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
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
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_nextClearBit(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_nextClearBit(bitSet23, bitSet24, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextClearBit(bitSet23, bitSet28, (int) (short) 0, 2);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_nextClearBit(bitSet33, bitSet34, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_nextClearBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_nextClearBit(bitSet44, bitSet45, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_nextClearBit(bitSet44, bitSet49, (int) (short) 0, 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet28, bitSet49, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
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
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet23 = null;
        fuzzTest1.FuzzTest_nextClearBit(bitSet19, bitSet23, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_nextClearBit(bitSet28, bitSet29, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_nextClearBit(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_nextClearBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_nextClearBit(bitSet44, bitSet45, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_nextClearBit(bitSet50, bitSet51, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet55 = null;
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_nextClearBit(bitSet55, bitSet56, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet62 = null;
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzzTest61.FuzzTest_nextClearBit(bitSet62, bitSet63, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_nextClearBit(bitSet67, bitSet68, 10, (int) (byte) -1);
        fuzzTest49.FuzzTest_nextClearBit(bitSet60, bitSet68, (int) (byte) 100, 1);
        fuzzTest27.FuzzTest_nextClearBit(bitSet45, bitSet68, (int) (byte) 100, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet19, bitSet45, 0, 10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
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
        c2s_aug_sub.BitSet bitSet26 = null;
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet26, bitSet27, (int) (byte) 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_nextClearBit(bitSet32, bitSet33, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_nextClearBit(bitSet37, bitSet38, (int) '4', (int) '4');
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
        c2s_aug_sub.BitSet bitSet73 = null;
        fuzzTest31.FuzzTest_nextClearBit(bitSet66, bitSet73, 1, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_nextClearBit(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = null;
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_nextClearBit(bitSet83, bitSet84, (int) '4', (int) '4');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet66, bitSet84, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
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
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet23 = null;
        fuzzTest1.FuzzTest_nextClearBit(bitSet19, bitSet23, (int) (short) -1, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_nextClearBit(bitSet27, bitSet28, (int) (byte) 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet32 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet27, bitSet32, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzzTest36.FuzzTest_nextClearBit(bitSet37, bitSet38, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet42 = null;
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_nextClearBit(bitSet42, bitSet43, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_nextClearBit(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_nextClearBit(bitSet54, bitSet55, 10, (int) (byte) -1);
        fuzzTest36.FuzzTest_nextClearBit(bitSet47, bitSet55, (int) (byte) 100, 1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_nextClearBit(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_nextClearBit(bitSet68, bitSet69, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet75 = null;
        c2s_aug_sub.BitSet bitSet76 = null;
        fuzzTest74.FuzzTest_nextClearBit(bitSet75, bitSet76, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_nextClearBit(bitSet80, bitSet81, 10, (int) (byte) -1);
        fuzzTest62.FuzzTest_nextClearBit(bitSet73, bitSet81, (int) (byte) 100, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet55, bitSet73, (int) ' ', 100);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
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
        c2s_aug_sub.BitSet bitSet26 = null;
        c2s_aug_sub.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet26, bitSet27, (int) '#', 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_nextClearBit(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_nextClearBit(bitSet38, bitSet39, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_nextClearBit(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_nextClearBit(bitSet49, bitSet50, 10, (int) (byte) -1);
        fuzzTest31.FuzzTest_nextClearBit(bitSet39, bitSet49, (int) (short) 0, 1);
        c2s_aug_sub.BitSet bitSet57 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet49, bitSet57, (int) '#', (-1));
        c2s_aug_sub.BitSet bitSet61 = null;
        c2s_aug_sub.BitSet bitSet62 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet61, bitSet62, (int) 'a', (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_nextClearBit(bitSet68, bitSet69, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet74 = null;
        c2s_aug_sub.BitSet bitSet75 = null;
        fuzzTest73.FuzzTest_nextClearBit(bitSet74, bitSet75, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_nextClearBit(bitSet79, bitSet80, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_nextClearBit(bitSet79, bitSet84, (int) (short) 0, 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet66, bitSet79, (int) (short) -1, (-1));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
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
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_nextClearBit(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_nextClearBit(bitSet29, bitSet30, 10, (int) (byte) -1);
        fuzzTest11.FuzzTest_nextClearBit(bitSet19, bitSet29, (int) (short) 0, 1);
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
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_nextClearBit(bitSet60, bitSet61, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_nextClearBit(bitSet65, bitSet66, 10, (int) (byte) -1);
        fuzzTest37.FuzzTest_nextClearBit(bitSet54, bitSet65, 0, 0);
        c2s_aug_sub.BitSet bitSet73 = null;
        fuzzTest11.FuzzTest_nextClearBit(bitSet65, bitSet73, (int) (short) 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_nextClearBit(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_nextClearBit(bitSet83, bitSet84, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet65, bitSet83, (int) (short) 10, (int) '4');
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
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
        fuzzTest0.FuzzTest_nextClearBit(bitSet17, bitSet28, 0, 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzzTest36.FuzzTest_nextClearBit(bitSet37, bitSet38, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_nextClearBit(bitSet42, bitSet43, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_nextClearBit(bitSet48, bitSet49, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_nextClearBit(bitSet53, bitSet54, (int) '4', (int) '4');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet42, bitSet54, 0, (int) 'a');
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
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
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_nextClearBit(bitSet32, bitSet33, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextClearBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_nextClearBit(bitSet43, bitSet44, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzzTest26.FuzzTest_nextClearBit(bitSet44, bitSet48, (int) (short) -1, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet52 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet44, bitSet52, (int) (byte) 1, 2);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet57 = null;
        c2s_aug_sub.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_nextClearBit(bitSet57, bitSet58, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_nextClearBit(bitSet62, bitSet63, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_nextClearBit(bitSet68, bitSet69, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_nextClearBit(bitSet73, bitSet74, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet62, bitSet74, 2, (int) (byte) 10);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_nextClearBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_nextClearBit(bitSet8, bitSet9, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_nextClearBit(bitSet13, bitSet14, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = null;
        fuzzTest18.FuzzTest_nextClearBit(bitSet19, bitSet20, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_nextClearBit(bitSet24, bitSet25, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest7.FuzzTest_nextClearBit(bitSet25, bitSet29, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_nextClearBit(bitSet34, bitSet35, 0, (int) (byte) 0);
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
        fuzzTest33.FuzzTest_nextClearBit(bitSet45, bitSet57, (int) '#', 10);
        fuzzTest1.FuzzTest_nextClearBit(bitSet25, bitSet57, 100, (int) (short) 0);
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
        fuzzTest67.FuzzTest_nextClearBit(bitSet75, bitSet85, (int) (short) 0, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet57, bitSet85, (-1), (int) (byte) 0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet4 = null;
        c2s_aug_sub.BitSet bitSet5 = null;
        fuzzTest3.FuzzTest_nextClearBit(bitSet4, bitSet5, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet9 = null;
        c2s_aug_sub.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_nextClearBit(bitSet9, bitSet10, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet15 = null;
        c2s_aug_sub.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_nextClearBit(bitSet15, bitSet16, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_nextClearBit(bitSet20, bitSet21, 10, (int) (byte) -1);
        fuzzTest2.FuzzTest_nextClearBit(bitSet10, bitSet21, (int) (byte) 10, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet30 = null;
        c2s_aug_sub.BitSet bitSet31 = null;
        fuzzTest29.FuzzTest_nextClearBit(bitSet30, bitSet31, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_nextClearBit(bitSet35, bitSet36, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet41 = null;
        c2s_aug_sub.BitSet bitSet42 = null;
        fuzzTest40.FuzzTest_nextClearBit(bitSet41, bitSet42, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_nextClearBit(bitSet46, bitSet47, 10, (int) (byte) -1);
        fuzzTest28.FuzzTest_nextClearBit(bitSet36, bitSet46, (int) (short) 0, 1);
        fuzzTest1.FuzzTest_nextClearBit(bitSet21, bitSet36, 10, 0);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_nextClearBit(bitSet58, bitSet59, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_nextClearBit(bitSet63, bitSet64, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet36, bitSet63, (int) 'a', (int) '4');
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
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
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextClearBit(bitSet17, bitSet18, (int) '4', (int) '4');
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
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_nextClearBit(bitSet39, bitSet40, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = null;
        c2s_aug_sub.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_nextClearBit(bitSet45, bitSet46, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_nextClearBit(bitSet50, bitSet51, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet56 = null;
        c2s_aug_sub.BitSet bitSet57 = null;
        fuzzTest55.FuzzTest_nextClearBit(bitSet56, bitSet57, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet61 = null;
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_nextClearBit(bitSet61, bitSet62, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest44.FuzzTest_nextClearBit(bitSet62, bitSet66, (int) (short) -1, (int) (byte) 10);
        fuzzTest22.FuzzTest_nextClearBit(bitSet40, bitSet62, 0, (int) (byte) 1);
        c2s_aug_sub.BitSet bitSet73 = null;
        fuzzTest11.FuzzTest_nextClearBit(bitSet62, bitSet73, (int) ' ', (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_nextClearBit(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_nextClearBit(bitSet83, bitSet84, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet88 = null;
        fuzzTest11.FuzzTest_nextClearBit(bitSet83, bitSet88, (int) '4', (int) (short) 100);
        c2s_aug_sub.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet83, bitSet92, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
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
        c2s_aug_sub.BitSet bitSet26 = null;
        c2s_aug_sub.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet26, bitSet27, (int) '#', 0);
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_nextClearBit(bitSet34, bitSet35, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_nextClearBit(bitSet39, bitSet40, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = null;
        c2s_aug_sub.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_nextClearBit(bitSet45, bitSet46, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_nextClearBit(bitSet50, bitSet51, 10, (int) (byte) -1);
        fuzzTest32.FuzzTest_nextClearBit(bitSet40, bitSet50, (int) (short) 0, 1);
        fuzzTest0.FuzzTest_nextClearBit(bitSet31, bitSet40, 10, (int) (short) 1);
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_nextClearBit(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_nextClearBit(bitSet68, bitSet69, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet61, bitSet69, (int) (short) 10, (int) '#');
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
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
        fuzzTest0.FuzzTest_nextClearBit(bitSet17, bitSet28, 0, 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
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
        fuzzTest36.FuzzTest_nextClearBit(bitSet44, bitSet55, (int) (byte) 10, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_nextClearBit(bitSet64, bitSet65, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_nextClearBit(bitSet69, bitSet70, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet75 = null;
        c2s_aug_sub.BitSet bitSet76 = null;
        fuzzTest74.FuzzTest_nextClearBit(bitSet75, bitSet76, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_nextClearBit(bitSet80, bitSet81, 10, (int) (byte) -1);
        fuzzTest62.FuzzTest_nextClearBit(bitSet70, bitSet81, (int) (byte) 10, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet88 = null;
        fuzzTest36.FuzzTest_nextClearBit(bitSet70, bitSet88, 1, (int) (short) -1);
        c2s_aug_sub.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet70, bitSet92, 0, (int) '#');
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextClearBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextClearBit(bitSet11, bitSet19, (int) (byte) 100, 1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_nextClearBit(bitSet27, bitSet28, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_nextClearBit(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_nextClearBit(bitSet38, bitSet39, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_nextClearBit(bitSet38, bitSet43, (int) (short) 0, 2);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
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
        fuzzTest47.FuzzTest_nextClearBit(bitSet55, bitSet66, (int) (byte) 10, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet38, bitSet55, (int) (short) 1, (int) '#');
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextClearBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextClearBit(bitSet12, bitSet13, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet12, bitSet17, (int) (short) 0, 2);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextClearBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_nextClearBit(bitSet28, bitSet29, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_nextClearBit(bitSet34, bitSet35, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_nextClearBit(bitSet39, bitSet40, 10, (int) (byte) -1);
        fuzzTest21.FuzzTest_nextClearBit(bitSet29, bitSet40, (int) (byte) 10, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_nextClearBit(bitSet48, bitSet49, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_nextClearBit(bitSet53, bitSet54, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_nextClearBit(bitSet59, bitSet60, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_nextClearBit(bitSet64, bitSet65, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = null;
        fuzzTest69.FuzzTest_nextClearBit(bitSet70, bitSet71, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_nextClearBit(bitSet75, bitSet76, 10, (int) (byte) -1);
        fuzzTest47.FuzzTest_nextClearBit(bitSet64, bitSet75, 0, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet29, bitSet64, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextClearBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextClearBit(bitSet11, bitSet19, (int) (byte) 100, 1);
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_nextClearBit(bitSet28, bitSet29, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_nextClearBit(bitSet34, bitSet35, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_nextClearBit(bitSet39, bitSet40, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_nextClearBit(bitSet39, bitSet44, (int) (short) 0, 2);
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet51 = null;
        c2s_aug_sub.BitSet bitSet52 = null;
        fuzzTest50.FuzzTest_nextClearBit(bitSet51, bitSet52, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_nextClearBit(bitSet56, bitSet57, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet62 = null;
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzzTest61.FuzzTest_nextClearBit(bitSet62, bitSet63, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_nextClearBit(bitSet67, bitSet68, 10, (int) (byte) -1);
        fuzzTest49.FuzzTest_nextClearBit(bitSet57, bitSet67, (int) (short) 0, 1);
        fuzzTest27.FuzzTest_nextClearBit(bitSet48, bitSet57, (int) (byte) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet26, bitSet57, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
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
        c2s_aug_sub.BitSet bitSet26 = null;
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet26, bitSet27, (int) (byte) 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_nextClearBit(bitSet32, bitSet33, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_nextClearBit(bitSet37, bitSet38, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_nextClearBit(bitSet43, bitSet44, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_nextClearBit(bitSet48, bitSet49, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet53 = null;
        fuzzTest31.FuzzTest_nextClearBit(bitSet49, bitSet53, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_nextClearBit(bitSet58, bitSet59, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_nextClearBit(bitSet63, bitSet64, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet49, bitSet63, 1, (int) ' ');
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
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
        fuzzTest0.FuzzTest_nextClearBit(bitSet17, bitSet28, 0, 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzzTest36.FuzzTest_nextClearBit(bitSet37, bitSet38, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_nextClearBit(bitSet42, bitSet43, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_nextClearBit(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_nextClearBit(bitSet54, bitSet55, (int) '4', (int) '4');
        fuzzTest36.FuzzTest_nextClearBit(bitSet47, bitSet54, (int) (byte) 0, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_nextClearBit(bitSet64, bitSet65, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_nextClearBit(bitSet69, bitSet70, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet75 = null;
        c2s_aug_sub.BitSet bitSet76 = null;
        fuzzTest74.FuzzTest_nextClearBit(bitSet75, bitSet76, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_nextClearBit(bitSet80, bitSet81, 10, (int) (byte) -1);
        fuzzTest62.FuzzTest_nextClearBit(bitSet70, bitSet81, (int) (byte) 10, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet47, bitSet81, 1, 100);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, (int) ' ', (int) (short) -1);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, (int) ' ', (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextClearBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_nextClearBit(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_nextClearBit(bitSet23, bitSet24, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextClearBit(bitSet23, bitSet28, (int) (short) 0, 2);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_nextClearBit(bitSet33, bitSet34, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_nextClearBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_nextClearBit(bitSet44, bitSet45, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_nextClearBit(bitSet50, bitSet51, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_nextClearBit(bitSet55, bitSet56, 10, (int) (byte) -1);
        fuzzTest32.FuzzTest_nextClearBit(bitSet44, bitSet56, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_nextClearBit(bitSet64, bitSet65, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_nextClearBit(bitSet69, bitSet70, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest32.FuzzTest_nextClearBit(bitSet69, bitSet74, 0, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet23, bitSet69, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, (int) ' ', (int) (short) -1);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, 10, 0);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextClearBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextClearBit(bitSet17, bitSet18, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_nextClearBit(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_nextClearBit(bitSet29, bitSet30, 10, (int) (byte) -1);
        fuzzTest11.FuzzTest_nextClearBit(bitSet22, bitSet30, (int) (byte) 100, 1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_nextClearBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_nextClearBit(bitSet44, bitSet45, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_nextClearBit(bitSet50, bitSet51, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_nextClearBit(bitSet55, bitSet56, 10, (int) (byte) -1);
        fuzzTest37.FuzzTest_nextClearBit(bitSet45, bitSet55, (int) (short) 0, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet22, bitSet45, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet3 = null;
        c2s_aug_sub.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_nextClearBit(bitSet3, bitSet4, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_nextClearBit(bitSet8, bitSet9, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_nextClearBit(bitSet14, bitSet15, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_nextClearBit(bitSet19, bitSet20, 10, (int) (byte) -1);
        fuzzTest1.FuzzTest_nextClearBit(bitSet9, bitSet19, (int) (short) 0, 1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_nextClearBit(bitSet28, bitSet29, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_nextClearBit(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_nextClearBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = null;
        c2s_aug_sub.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_nextClearBit(bitSet45, bitSet46, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_nextClearBit(bitSet50, bitSet51, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet56 = null;
        c2s_aug_sub.BitSet bitSet57 = null;
        fuzzTest55.FuzzTest_nextClearBit(bitSet56, bitSet57, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_nextClearBit(bitSet61, bitSet62, 10, (int) (byte) -1);
        fuzzTest38.FuzzTest_nextClearBit(bitSet50, bitSet62, (int) '#', 10);
        c2s_aug_sub.BitSet bitSet69 = null;
        fuzzTest27.FuzzTest_nextClearBit(bitSet62, bitSet69, 1, (int) (short) 1);
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest27.FuzzTest_nextClearBit(bitSet73, bitSet74, (int) (short) 0, (int) (short) 10);
        c2s_aug_sub.BitSet bitSet78 = null;
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet80 = null;
        c2s_aug_sub.BitSet bitSet81 = null;
        fuzzTest79.FuzzTest_nextClearBit(bitSet80, bitSet81, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_nextClearBit(bitSet85, bitSet86, 10, (int) (byte) -1);
        fuzzTest27.FuzzTest_nextClearBit(bitSet78, bitSet86, 0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet19, bitSet86, 0, (int) 'a');
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, (int) ' ', (int) (short) -1);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, 10, 0);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_nextClearBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextClearBit(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_nextClearBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_nextClearBit(bitSet28, bitSet29, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest11.FuzzTest_nextClearBit(bitSet29, bitSet33, (int) (short) -1, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzzTest11.FuzzTest_nextClearBit(bitSet37, bitSet38, (int) '#', 0);
        c2s_aug_sub.BitSet bitSet42 = null;
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_nextClearBit(bitSet42, bitSet43, (int) ' ', 100);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_nextClearBit(bitSet48, bitSet49, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_nextClearBit(bitSet53, bitSet54, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_nextClearBit(bitSet60, bitSet61, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_nextClearBit(bitSet65, bitSet66, (int) '4', (int) '4');
        fuzzTest47.FuzzTest_nextClearBit(bitSet58, bitSet65, (int) (byte) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet43, bitSet58, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
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
        fuzzTest0.FuzzTest_nextClearBit(bitSet8, bitSet19, (int) (byte) 10, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_nextClearBit(bitSet27, bitSet28, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_nextClearBit(bitSet32, bitSet33, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextClearBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_nextClearBit(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_nextClearBit(bitSet49, bitSet50, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet55 = null;
        c2s_aug_sub.BitSet bitSet56 = null;
        fuzzTest54.FuzzTest_nextClearBit(bitSet55, bitSet56, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_nextClearBit(bitSet60, bitSet61, 10, (int) (byte) -1);
        fuzzTest37.FuzzTest_nextClearBit(bitSet49, bitSet61, (int) '#', 10);
        c2s_aug_sub.BitSet bitSet68 = null;
        fuzzTest26.FuzzTest_nextClearBit(bitSet61, bitSet68, 1, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_nextClearBit(bitSet73, bitSet74, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet79 = null;
        c2s_aug_sub.BitSet bitSet80 = null;
        fuzzTest78.FuzzTest_nextClearBit(bitSet79, bitSet80, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_nextClearBit(bitSet84, bitSet85, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_nextClearBit(bitSet84, bitSet89, (int) (short) 0, 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet61, bitSet84, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
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
        c2s_aug_sub.BitSet bitSet26 = null;
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet26, bitSet27, (int) (byte) 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_nextClearBit(bitSet32, bitSet33, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_nextClearBit(bitSet37, bitSet38, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet42 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet38, bitSet42, (int) (byte) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet47 = null;
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzzTest46.FuzzTest_nextClearBit(bitSet47, bitSet48, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet52 = null;
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_nextClearBit(bitSet52, bitSet53, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_nextClearBit(bitSet58, bitSet59, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_nextClearBit(bitSet63, bitSet64, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet68 = null;
        fuzzTest46.FuzzTest_nextClearBit(bitSet64, bitSet68, (int) (short) -1, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet72 = null;
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_nextClearBit(bitSet72, bitSet73, (int) (byte) 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_nextClearBit(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_nextClearBit(bitSet83, bitSet84, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet73, bitSet83, (int) 'a', (int) 'a');
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextClearBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextClearBit(bitSet11, bitSet19, (int) (byte) 100, 1);
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
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_nextClearBit(bitSet54, bitSet55, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_nextClearBit(bitSet60, bitSet61, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_nextClearBit(bitSet65, bitSet66, 10, (int) (byte) -1);
        fuzzTest37.FuzzTest_nextClearBit(bitSet54, bitSet65, 0, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet32, bitSet65, 2, (int) '4');
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextClearBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_nextClearBit(bitSet12, bitSet13, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet12, bitSet17, (int) (short) 0, 2);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_nextClearBit(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_nextClearBit(bitSet29, bitSet30, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = null;
        c2s_aug_sub.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_nextClearBit(bitSet35, bitSet36, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_nextClearBit(bitSet40, bitSet41, 10, (int) (byte) -1);
        fuzzTest22.FuzzTest_nextClearBit(bitSet30, bitSet41, (int) (byte) 10, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_nextClearBit(bitSet50, bitSet51, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_nextClearBit(bitSet55, bitSet56, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet61 = null;
        c2s_aug_sub.BitSet bitSet62 = null;
        fuzzTest60.FuzzTest_nextClearBit(bitSet61, bitSet62, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_nextClearBit(bitSet66, bitSet67, 10, (int) (byte) -1);
        fuzzTest48.FuzzTest_nextClearBit(bitSet56, bitSet66, (int) (short) 0, 1);
        fuzzTest21.FuzzTest_nextClearBit(bitSet41, bitSet56, 10, 0);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_nextClearBit(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_nextClearBit(bitSet83, bitSet84, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet56, bitSet83, 10, (int) (short) 100);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
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
        fuzzTest0.FuzzTest_nextClearBit(bitSet17, bitSet28, 0, 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzzTest36.FuzzTest_nextClearBit(bitSet37, bitSet38, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_nextClearBit(bitSet42, bitSet43, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet47 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet43, bitSet47, (int) ' ', (int) (byte) 100);
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_nextClearBit(bitSet53, bitSet54, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_nextClearBit(bitSet59, bitSet60, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_nextClearBit(bitSet64, bitSet65, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_nextClearBit(bitSet64, bitSet69, (int) (short) 0, 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet51, bitSet64, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, (int) (byte) 100, (int) 'a');
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_nextClearBit(bitSet8, bitSet9, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_nextClearBit(bitSet13, bitSet14, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = null;
        fuzzTest18.FuzzTest_nextClearBit(bitSet19, bitSet20, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_nextClearBit(bitSet24, bitSet25, 10, (int) (byte) -1);
        fuzzTest6.FuzzTest_nextClearBit(bitSet14, bitSet25, (int) (byte) 10, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_nextClearBit(bitSet34, bitSet35, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_nextClearBit(bitSet39, bitSet40, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = null;
        c2s_aug_sub.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_nextClearBit(bitSet45, bitSet46, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_nextClearBit(bitSet50, bitSet51, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet56 = null;
        c2s_aug_sub.BitSet bitSet57 = null;
        fuzzTest55.FuzzTest_nextClearBit(bitSet56, bitSet57, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet61 = null;
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_nextClearBit(bitSet61, bitSet62, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_nextClearBit(bitSet68, bitSet69, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_nextClearBit(bitSet73, bitSet74, 10, (int) (byte) -1);
        fuzzTest55.FuzzTest_nextClearBit(bitSet66, bitSet74, (int) (byte) 100, 1);
        fuzzTest33.FuzzTest_nextClearBit(bitSet51, bitSet74, (int) (byte) 100, 0);
        fuzzTest6.FuzzTest_nextClearBit(bitSet32, bitSet51, 10, (int) (short) -1);
        c2s_aug_sub.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet51, bitSet87, (int) 'a', (int) '#');
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
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
        fuzzTest0.FuzzTest_nextClearBit(bitSet17, bitSet28, 0, 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzzTest36.FuzzTest_nextClearBit(bitSet37, bitSet38, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_nextClearBit(bitSet42, bitSet43, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet47 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet43, bitSet47, (int) ' ', (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet52 = null;
        c2s_aug_sub.BitSet bitSet53 = null;
        fuzzTest51.FuzzTest_nextClearBit(bitSet52, bitSet53, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_nextClearBit(bitSet57, bitSet58, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_nextClearBit(bitSet63, bitSet64, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = null;
        fuzzTest68.FuzzTest_nextClearBit(bitSet69, bitSet70, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet74 = null;
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_nextClearBit(bitSet74, bitSet75, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet80 = null;
        c2s_aug_sub.BitSet bitSet81 = null;
        fuzzTest79.FuzzTest_nextClearBit(bitSet80, bitSet81, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_nextClearBit(bitSet85, bitSet86, 10, (int) (byte) -1);
        fuzzTest62.FuzzTest_nextClearBit(bitSet74, bitSet86, (int) '#', 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet58, bitSet86, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
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
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_nextClearBit(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_nextClearBit(bitSet38, bitSet39, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_nextClearBit(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_nextClearBit(bitSet49, bitSet50, 10, (int) (byte) -1);
        fuzzTest31.FuzzTest_nextClearBit(bitSet39, bitSet49, (int) (short) 0, 1);
        c2s_aug_sub.BitSet bitSet57 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet49, bitSet57, (int) (short) 10, (int) '#');
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet62 = null;
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzzTest61.FuzzTest_nextClearBit(bitSet62, bitSet63, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_nextClearBit(bitSet67, bitSet68, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet74 = null;
        c2s_aug_sub.BitSet bitSet75 = null;
        fuzzTest73.FuzzTest_nextClearBit(bitSet74, bitSet75, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet79 = null;
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_nextClearBit(bitSet79, bitSet80, (int) '4', (int) '4');
        fuzzTest61.FuzzTest_nextClearBit(bitSet72, bitSet79, (int) (byte) 0, (int) (byte) 100);
        c2s_aug_sub.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet72, bitSet87, 0, (int) ' ');
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet6, bitSet7, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextClearBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextClearBit(bitSet11, bitSet19, (int) (byte) 100, 1);
        c2s_aug_sub.BitSet bitSet26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_nextClearBit(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_nextClearBit(bitSet34, bitSet35, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_nextClearBit(bitSet40, bitSet41, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_nextClearBit(bitSet45, bitSet46, 10, (int) (byte) -1);
        fuzzTest27.FuzzTest_nextClearBit(bitSet35, bitSet45, (int) (short) 0, 1);
        fuzzTest0.FuzzTest_nextClearBit(bitSet26, bitSet45, (int) (byte) 10, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet57 = null;
        c2s_aug_sub.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_nextClearBit(bitSet57, bitSet58, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_nextClearBit(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_nextClearBit(bitSet68, bitSet69, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_nextClearBit(bitSet68, bitSet73, (int) (short) 0, 2);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_nextClearBit(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_nextClearBit(bitSet83, bitSet84, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet73, bitSet84, 10, (int) (short) 100);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_nextClearBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_nextClearBit(bitSet7, bitSet8, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextClearBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextClearBit(bitSet8, bitSet18, (int) (short) 0, 1);
        c2s_aug_sub.BitSet bitSet26 = null;
        c2s_aug_sub.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet26, bitSet27, (int) (byte) 100, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_nextClearBit(bitSet32, bitSet33, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_nextClearBit(bitSet37, bitSet38, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_nextClearBit(bitSet43, bitSet44, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_nextClearBit(bitSet48, bitSet49, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet53 = null;
        fuzzTest31.FuzzTest_nextClearBit(bitSet49, bitSet53, (int) (short) -1, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet57 = null;
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_nextClearBit(bitSet57, bitSet58, (int) (byte) 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_nextClearBit(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_nextClearBit(bitSet68, bitSet69, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet58, bitSet68, (int) '#', 10);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_nextClearBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_nextClearBit(bitSet8, bitSet9, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_nextClearBit(bitSet13, bitSet14, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = null;
        fuzzTest18.FuzzTest_nextClearBit(bitSet19, bitSet20, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_nextClearBit(bitSet24, bitSet25, 10, (int) (byte) -1);
        fuzzTest1.FuzzTest_nextClearBit(bitSet13, bitSet25, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_nextClearBit(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_nextClearBit(bitSet38, bitSet39, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_nextClearBit(bitSet13, bitSet39, 0, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet47 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet46, bitSet47, 0, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet52 = null;
        c2s_aug_sub.BitSet bitSet53 = null;
        fuzzTest51.FuzzTest_nextClearBit(bitSet52, bitSet53, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_nextClearBit(bitSet57, bitSet58, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_nextClearBit(bitSet64, bitSet65, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_nextClearBit(bitSet69, bitSet70, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet75 = null;
        c2s_aug_sub.BitSet bitSet76 = null;
        fuzzTest74.FuzzTest_nextClearBit(bitSet75, bitSet76, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_nextClearBit(bitSet80, bitSet81, 10, (int) (byte) -1);
        fuzzTest62.FuzzTest_nextClearBit(bitSet70, bitSet81, (int) (byte) 10, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet57, bitSet70, (int) (short) 10, 100);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
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
        c2s_aug_sub.BitSet bitSet26 = null;
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_nextClearBit(bitSet26, bitSet27, (int) (byte) 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet31 = null;
        c2s_aug_sub.BitSet bitSet32 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet31, bitSet32, 10, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzzTest36.FuzzTest_nextClearBit(bitSet37, bitSet38, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_nextClearBit(bitSet43, bitSet44, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_nextClearBit(bitSet48, bitSet49, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_nextClearBit(bitSet54, bitSet55, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_nextClearBit(bitSet59, bitSet60, 10, (int) (byte) -1);
        fuzzTest36.FuzzTest_nextClearBit(bitSet48, bitSet60, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = null;
        fuzzTest68.FuzzTest_nextClearBit(bitSet69, bitSet70, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet74 = null;
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_nextClearBit(bitSet74, bitSet75, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet80 = null;
        c2s_aug_sub.BitSet bitSet81 = null;
        fuzzTest79.FuzzTest_nextClearBit(bitSet80, bitSet81, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_nextClearBit(bitSet85, bitSet86, 10, (int) (byte) -1);
        fuzzTest67.FuzzTest_nextClearBit(bitSet75, bitSet86, (int) (byte) 10, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet60, bitSet75, (-1), 10);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_nextClearBit(bitSet7, bitSet8, (int) ' ', (int) (short) -1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_nextClearBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet23 = null;
        fuzzTest6.FuzzTest_nextClearBit(bitSet18, bitSet23, 2, 2);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_nextClearBit(bitSet28, bitSet29, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_nextClearBit(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_nextClearBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_nextClearBit(bitSet44, bitSet45, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest27.FuzzTest_nextClearBit(bitSet45, bitSet49, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_nextClearBit(bitSet54, bitSet55, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_nextClearBit(bitSet60, bitSet61, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_nextClearBit(bitSet65, bitSet66, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_nextClearBit(bitSet65, bitSet70, (int) (short) 0, 2);
        fuzzTest6.FuzzTest_nextClearBit(bitSet45, bitSet70, (int) (short) 10, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_nextClearBit(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_nextClearBit(bitSet83, bitSet84, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet70, bitSet84, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
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
        c2s_aug_sub.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_nextClearBit(bitSet37, bitSet38, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet42 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet37, bitSet42, 0, 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet47 = null;
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzzTest46.FuzzTest_nextClearBit(bitSet47, bitSet48, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_nextClearBit(bitSet52, bitSet53, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_nextClearBit(bitSet58, bitSet59, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_nextClearBit(bitSet63, bitSet64, (int) '4', (int) '4');
        fuzzTest0.FuzzTest_nextClearBit(bitSet52, bitSet64, (int) (short) 10, 2);
        c2s_aug_sub.BitSet bitSet71 = null;
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_nextClearBit(bitSet73, bitSet74, (int) ' ', (int) (short) -1);
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_nextClearBit(bitSet78, bitSet79, (int) ' ', (int) (byte) 0);
        fuzzTest0.FuzzTest_nextClearBit(bitSet71, bitSet78, (int) (short) 10, (int) 'a');
        c2s_aug_sub.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet86, bitSet87, 0, (int) (short) 100);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
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
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_nextClearBit(bitSet18, bitSet19, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet23 = null;
        fuzzTest1.FuzzTest_nextClearBit(bitSet19, bitSet23, (int) (short) -1, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_nextClearBit(bitSet27, bitSet28, (int) (byte) 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet32 = null;
        fuzzTest0.FuzzTest_nextClearBit(bitSet27, bitSet32, (int) (short) 0, 100);
        c2s_aug_sub.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_nextClearBit(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = null;
        c2s_aug_sub.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_nextClearBit(bitSet45, bitSet46, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_nextClearBit(bitSet50, bitSet51, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet57 = null;
        c2s_aug_sub.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_nextClearBit(bitSet57, bitSet58, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_nextClearBit(bitSet62, bitSet63, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_nextClearBit(bitSet68, bitSet69, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_nextClearBit(bitSet73, bitSet74, 10, (int) (byte) -1);
        fuzzTest55.FuzzTest_nextClearBit(bitSet63, bitSet73, (int) (short) 0, 1);
        c2s_aug_sub.BitSet bitSet81 = null;
        fuzzTest44.FuzzTest_nextClearBit(bitSet73, bitSet81, (int) (short) 100, (int) (short) 100);
        fuzzTest37.FuzzTest_nextClearBit(bitSet43, bitSet73, (int) (short) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_nextClearBit(bitSet36, bitSet73, (int) (short) 0, (int) (byte) 100);
    }
}

