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
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet6, bitSet7, 10, (int) (byte) -1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_previousSetBit(bitSet8, bitSet9, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_previousSetBit(bitSet13, bitSet14, (int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet6, bitSet14, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet6, bitSet7, (int) ' ', 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_previousSetBit(bitSet2, bitSet3, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_previousSetBit(bitSet8, bitSet9, (-1), (int) (byte) 0);
        fuzzTest0.FuzzTest_previousSetBit(bitSet3, bitSet9, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = null;
        fuzzTest16.FuzzTest_previousSetBit(bitSet17, bitSet18, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_previousSetBit(bitSet22, bitSet23, (int) (short) 1, 0);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_previousSetBit(bitSet29, bitSet30, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_previousSetBit(bitSet35, bitSet36, (-1), (int) (byte) 0);
        fuzzTest27.FuzzTest_previousSetBit(bitSet30, bitSet36, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_previousSetBit(bitSet45, bitSet46, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_previousSetBit(bitSet51, bitSet52, (-1), (int) (byte) 0);
        fuzzTest43.FuzzTest_previousSetBit(bitSet46, bitSet52, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_previousSetBit(bitSet60, bitSet61, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_previousSetBit(bitSet65, bitSet66, (int) (short) 1, 0);
        fuzzTest27.FuzzTest_previousSetBit(bitSet52, bitSet65, (int) (short) -1, 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet22, bitSet65, 100, (int) (short) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_previousSetBit(bitSet8, bitSet9, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_previousSetBit(bitSet14, bitSet15, (-1), (int) (byte) 0);
        fuzzTest6.FuzzTest_previousSetBit(bitSet9, bitSet15, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_previousSetBit(bitSet23, bitSet24, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_previousSetBit(bitSet29, bitSet30, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_previousSetBit(bitSet36, bitSet37, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_previousSetBit(bitSet42, bitSet43, (-1), (int) (byte) 0);
        fuzzTest34.FuzzTest_previousSetBit(bitSet37, bitSet43, (-1), (int) (short) 100);
        fuzzTest22.FuzzTest_previousSetBit(bitSet30, bitSet37, (int) '4', 2);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_previousSetBit(bitSet55, bitSet56, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_previousSetBit(bitSet61, bitSet62, (-1), (int) (byte) 0);
        fuzzTest53.FuzzTest_previousSetBit(bitSet56, bitSet62, (-1), (int) (short) 100);
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_previousSetBit(bitSet56, bitSet69, (int) ' ', (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet15, bitSet69, 100, 1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_previousSetBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_previousSetBit(bitSet7, bitSet8, (int) (short) 1, 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_previousSetBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_previousSetBit(bitSet19, bitSet20, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_previousSetBit(bitSet26, bitSet27, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_previousSetBit(bitSet32, bitSet33, (-1), (int) (byte) 0);
        fuzzTest24.FuzzTest_previousSetBit(bitSet27, bitSet33, (-1), (int) (short) 100);
        fuzzTest12.FuzzTest_previousSetBit(bitSet20, bitSet27, (int) '4', 2);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_previousSetBit(bitSet45, bitSet46, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_previousSetBit(bitSet51, bitSet52, (-1), (int) (byte) 0);
        fuzzTest43.FuzzTest_previousSetBit(bitSet46, bitSet52, (-1), (int) (short) 100);
        fuzzTest1.FuzzTest_previousSetBit(bitSet27, bitSet46, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_previousSetBit(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_previousSetBit(bitSet68, bitSet69, (int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet46, bitSet68, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_previousSetBit(bitSet3, bitSet4, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_previousSetBit(bitSet9, bitSet10, (-1), (int) (byte) 0);
        fuzzTest1.FuzzTest_previousSetBit(bitSet4, bitSet10, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_previousSetBit(bitSet19, bitSet20, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_previousSetBit(bitSet25, bitSet26, (-1), (int) (byte) 0);
        fuzzTest17.FuzzTest_previousSetBit(bitSet20, bitSet26, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_previousSetBit(bitSet34, bitSet35, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_previousSetBit(bitSet39, bitSet40, (int) (short) 1, 0);
        fuzzTest1.FuzzTest_previousSetBit(bitSet26, bitSet39, (int) (short) -1, 2);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_previousSetBit(bitSet48, bitSet49, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_previousSetBit(bitSet53, bitSet54, (int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet26, bitSet54, (int) '#', (int) (short) -1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet3 = null;
        c2s_aug_sub.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_previousSetBit(bitSet3, bitSet4, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_previousSetBit(bitSet8, bitSet9, (int) (short) 1, 0);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_previousSetBit(bitSet14, bitSet15, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_previousSetBit(bitSet19, bitSet20, (int) (short) 1, 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet25 = null;
        c2s_aug_sub.BitSet bitSet26 = null;
        fuzzTest24.FuzzTest_previousSetBit(bitSet25, bitSet26, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_previousSetBit(bitSet31, bitSet32, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_previousSetBit(bitSet38, bitSet39, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_previousSetBit(bitSet44, bitSet45, (-1), (int) (byte) 0);
        fuzzTest36.FuzzTest_previousSetBit(bitSet39, bitSet45, (-1), (int) (short) 100);
        fuzzTest24.FuzzTest_previousSetBit(bitSet32, bitSet39, (int) '4', 2);
        fuzzTest2.FuzzTest_previousSetBit(bitSet20, bitSet32, (int) (short) 100, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_previousSetBit(bitSet59, bitSet60, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_previousSetBit(bitSet65, bitSet66, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_previousSetBit(bitSet72, bitSet73, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_previousSetBit(bitSet78, bitSet79, (-1), (int) (byte) 0);
        fuzzTest70.FuzzTest_previousSetBit(bitSet73, bitSet79, (-1), (int) (short) 100);
        fuzzTest58.FuzzTest_previousSetBit(bitSet66, bitSet73, (int) '4', 2);
        fuzzTest1.FuzzTest_previousSetBit(bitSet20, bitSet66, 0, 0);
        c2s_aug_sub.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet66, bitSet92, 100, 1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_previousSetBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_previousSetBit(bitSet7, bitSet8, (int) (short) 1, 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_previousSetBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_previousSetBit(bitSet19, bitSet20, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_previousSetBit(bitSet26, bitSet27, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_previousSetBit(bitSet32, bitSet33, (-1), (int) (byte) 0);
        fuzzTest24.FuzzTest_previousSetBit(bitSet27, bitSet33, (-1), (int) (short) 100);
        fuzzTest12.FuzzTest_previousSetBit(bitSet20, bitSet27, (int) '4', 2);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_previousSetBit(bitSet45, bitSet46, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_previousSetBit(bitSet51, bitSet52, (-1), (int) (byte) 0);
        fuzzTest43.FuzzTest_previousSetBit(bitSet46, bitSet52, (-1), (int) (short) 100);
        fuzzTest1.FuzzTest_previousSetBit(bitSet27, bitSet46, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_previousSetBit(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_previousSetBit(bitSet68, bitSet69, (int) (short) 1, 0);
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_previousSetBit(bitSet68, bitSet73, 2, 0);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_previousSetBit(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_previousSetBit(bitSet83, bitSet84, (int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet73, bitSet83, (int) (byte) 100, 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_previousSetBit(bitSet8, bitSet9, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_previousSetBit(bitSet14, bitSet15, (-1), (int) (byte) 0);
        fuzzTest6.FuzzTest_previousSetBit(bitSet9, bitSet15, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_previousSetBit(bitSet24, bitSet25, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_previousSetBit(bitSet30, bitSet31, (-1), (int) (byte) 0);
        fuzzTest22.FuzzTest_previousSetBit(bitSet25, bitSet31, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_previousSetBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_previousSetBit(bitSet44, bitSet45, (int) (short) 1, 0);
        fuzzTest6.FuzzTest_previousSetBit(bitSet31, bitSet44, (int) (short) -1, 2);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_previousSetBit(bitSet53, bitSet54, (-1), (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest52.FuzzTest_previousSetBit(bitSet58, bitSet59, (int) (short) 100, 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_previousSetBit(bitSet64, bitSet65, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_previousSetBit(bitSet72, bitSet73, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_previousSetBit(bitSet78, bitSet79, (-1), (int) (byte) 0);
        fuzzTest70.FuzzTest_previousSetBit(bitSet73, bitSet79, (-1), (int) (short) 100);
        c2s_aug_sub.BitSet bitSet86 = null;
        fuzzTest69.FuzzTest_previousSetBit(bitSet73, bitSet86, (int) (short) 10, (int) (short) 0);
        fuzzTest52.FuzzTest_previousSetBit(bitSet65, bitSet73, (int) (byte) 0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet31, bitSet73, (int) ' ', 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, (-1), (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet6, bitSet7, (int) (short) 100, 0);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_previousSetBit(bitSet13, bitSet14, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_previousSetBit(bitSet19, bitSet20, (-1), (int) (byte) 0);
        fuzzTest11.FuzzTest_previousSetBit(bitSet14, bitSet20, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_previousSetBit(bitSet29, bitSet30, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_previousSetBit(bitSet35, bitSet36, (-1), (int) (byte) 0);
        fuzzTest27.FuzzTest_previousSetBit(bitSet30, bitSet36, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_previousSetBit(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_previousSetBit(bitSet49, bitSet50, (int) (short) 1, 0);
        fuzzTest11.FuzzTest_previousSetBit(bitSet36, bitSet49, (int) (short) -1, 2);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_previousSetBit(bitSet58, bitSet59, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_previousSetBit(bitSet64, bitSet65, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_previousSetBit(bitSet69, bitSet70, (int) (short) 1, 0);
        fuzzTest11.FuzzTest_previousSetBit(bitSet58, bitSet69, (int) ' ', (int) ' ');
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_previousSetBit(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_previousSetBit(bitSet83, bitSet84, (int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet58, bitSet83, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_previousSetBit(bitSet10, bitSet11, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet16 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_previousSetBit(bitSet16, bitSet17, (-1), (int) (byte) 0);
        fuzzTest8.FuzzTest_previousSetBit(bitSet11, bitSet17, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_previousSetBit(bitSet26, bitSet27, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_previousSetBit(bitSet32, bitSet33, (-1), (int) (byte) 0);
        fuzzTest24.FuzzTest_previousSetBit(bitSet27, bitSet33, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet41 = null;
        c2s_aug_sub.BitSet bitSet42 = null;
        fuzzTest40.FuzzTest_previousSetBit(bitSet41, bitSet42, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_previousSetBit(bitSet46, bitSet47, (int) (short) 1, 0);
        fuzzTest8.FuzzTest_previousSetBit(bitSet33, bitSet46, (int) (short) -1, 2);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_previousSetBit(bitSet55, bitSet56, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet61 = null;
        c2s_aug_sub.BitSet bitSet62 = null;
        fuzzTest60.FuzzTest_previousSetBit(bitSet61, bitSet62, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_previousSetBit(bitSet66, bitSet67, (int) (short) 1, 0);
        fuzzTest8.FuzzTest_previousSetBit(bitSet55, bitSet66, (int) ' ', (int) ' ');
        fuzzTest6.FuzzTest_previousSetBit(bitSet7, bitSet66, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_previousSetBit(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_previousSetBit(bitSet83, bitSet84, (int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet66, bitSet84, (int) '4', 1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_previousSetBit(bitSet6, bitSet7, (int) (short) 1, 0);
        c2s_aug_sub.BitSet bitSet11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_previousSetBit(bitSet14, bitSet15, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_previousSetBit(bitSet20, bitSet21, (-1), (int) (byte) 0);
        fuzzTest12.FuzzTest_previousSetBit(bitSet15, bitSet21, (-1), (int) (short) 100);
        fuzzTest0.FuzzTest_previousSetBit(bitSet11, bitSet21, (int) (byte) 10, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet31 = null;
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_previousSetBit(bitSet31, bitSet32, (int) '#', (-1));
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzzTest36.FuzzTest_previousSetBit(bitSet37, bitSet38, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_previousSetBit(bitSet42, bitSet43, (int) (short) 1, 0);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_previousSetBit(bitSet48, bitSet49, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_previousSetBit(bitSet54, bitSet55, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_previousSetBit(bitSet61, bitSet62, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_previousSetBit(bitSet67, bitSet68, (-1), (int) (byte) 0);
        fuzzTest59.FuzzTest_previousSetBit(bitSet62, bitSet68, (-1), (int) (short) 100);
        fuzzTest47.FuzzTest_previousSetBit(bitSet55, bitSet62, (int) '4', 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet42, bitSet62, 10, 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_previousSetBit(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_previousSetBit(bitSet7, bitSet8, (int) (short) 1, 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_previousSetBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_previousSetBit(bitSet19, bitSet20, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_previousSetBit(bitSet26, bitSet27, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_previousSetBit(bitSet32, bitSet33, (-1), (int) (byte) 0);
        fuzzTest24.FuzzTest_previousSetBit(bitSet27, bitSet33, (-1), (int) (short) 100);
        fuzzTest12.FuzzTest_previousSetBit(bitSet20, bitSet27, (int) '4', 2);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_previousSetBit(bitSet45, bitSet46, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_previousSetBit(bitSet51, bitSet52, (-1), (int) (byte) 0);
        fuzzTest43.FuzzTest_previousSetBit(bitSet46, bitSet52, (-1), (int) (short) 100);
        fuzzTest1.FuzzTest_previousSetBit(bitSet27, bitSet46, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_previousSetBit(bitSet64, bitSet65, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_previousSetBit(bitSet70, bitSet71, (-1), (int) (byte) 0);
        fuzzTest62.FuzzTest_previousSetBit(bitSet65, bitSet71, (-1), (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet27, bitSet71, 10, 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_previousSetBit(bitSet2, bitSet3, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_previousSetBit(bitSet8, bitSet9, (-1), (int) (byte) 0);
        fuzzTest0.FuzzTest_previousSetBit(bitSet3, bitSet9, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_previousSetBit(bitSet18, bitSet19, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_previousSetBit(bitSet24, bitSet25, (-1), (int) (byte) 0);
        fuzzTest16.FuzzTest_previousSetBit(bitSet19, bitSet25, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_previousSetBit(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_previousSetBit(bitSet38, bitSet39, (int) (short) 1, 0);
        fuzzTest0.FuzzTest_previousSetBit(bitSet25, bitSet38, (int) (short) -1, 2);
        c2s_aug_sub.BitSet bitSet46 = null;
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_previousSetBit(bitSet48, bitSet49, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_previousSetBit(bitSet53, bitSet54, (int) (short) 1, 0);
        fuzzTest0.FuzzTest_previousSetBit(bitSet46, bitSet53, (int) 'a', (int) ' ');
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_previousSetBit(bitSet63, bitSet64, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_previousSetBit(bitSet69, bitSet70, (-1), (int) (byte) 0);
        fuzzTest61.FuzzTest_previousSetBit(bitSet64, bitSet70, (-1), (int) (short) 100);
        c2s_aug_sub.BitSet bitSet77 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet64, bitSet77, (int) 'a', (int) (short) -1);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_previousSetBit(bitSet82, bitSet83, (-1), (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet82, bitSet87, (int) ' ', (-1));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_previousSetBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_previousSetBit(bitSet12, bitSet13, (int) (short) 1, 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet13, bitSet17, 0, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_previousSetBit(bitSet24, bitSet25, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_previousSetBit(bitSet30, bitSet31, (-1), (int) (byte) 0);
        fuzzTest22.FuzzTest_previousSetBit(bitSet25, bitSet31, (-1), (int) (short) 100);
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzzTest21.FuzzTest_previousSetBit(bitSet25, bitSet38, (int) (short) 10, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet42 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet38, bitSet42, (int) (short) 10, (int) '4');
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_previousSetBit(bitSet48, bitSet49, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_previousSetBit(bitSet54, bitSet55, (-1), (int) (byte) 0);
        fuzzTest46.FuzzTest_previousSetBit(bitSet49, bitSet55, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_previousSetBit(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_previousSetBit(bitSet68, bitSet69, (int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet55, bitSet68, (int) '4', 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_previousSetBit(bitSet6, bitSet7, (int) (short) 1, 0);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_previousSetBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_previousSetBit(bitSet17, bitSet18, (int) (short) 1, 0);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_previousSetBit(bitSet23, bitSet24, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_previousSetBit(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_previousSetBit(bitSet34, bitSet35, (int) (short) 1, 0);
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest22.FuzzTest_previousSetBit(bitSet35, bitSet39, 0, (int) (byte) 100);
        fuzzTest0.FuzzTest_previousSetBit(bitSet17, bitSet35, (int) (byte) 1, 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_previousSetBit(bitSet49, bitSet50, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_previousSetBit(bitSet55, bitSet56, (-1), (int) (byte) 0);
        fuzzTest47.FuzzTest_previousSetBit(bitSet50, bitSet56, (-1), (int) (short) 100);
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzzTest46.FuzzTest_previousSetBit(bitSet50, bitSet63, (int) (short) 10, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_previousSetBit(bitSet68, bitSet69, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_previousSetBit(bitSet73, bitSet74, (int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet50, bitSet73, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_previousSetBit(bitSet7, bitSet8, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_previousSetBit(bitSet14, bitSet15, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_previousSetBit(bitSet20, bitSet21, (-1), (int) (byte) 0);
        fuzzTest12.FuzzTest_previousSetBit(bitSet15, bitSet21, (-1), (int) (short) 100);
        fuzzTest0.FuzzTest_previousSetBit(bitSet8, bitSet15, (int) '4', 2);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_previousSetBit(bitSet32, bitSet33, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_previousSetBit(bitSet38, bitSet39, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_previousSetBit(bitSet45, bitSet46, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_previousSetBit(bitSet51, bitSet52, (-1), (int) (byte) 0);
        fuzzTest43.FuzzTest_previousSetBit(bitSet46, bitSet52, (-1), (int) (short) 100);
        fuzzTest31.FuzzTest_previousSetBit(bitSet39, bitSet46, (int) '4', 2);
        c2s_aug_sub.BitSet bitSet62 = null;
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzzTest31.FuzzTest_previousSetBit(bitSet62, bitSet63, (int) (byte) 1, 2);
        c2s_aug_sub.BitSet bitSet67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_previousSetBit(bitSet70, bitSet71, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_previousSetBit(bitSet76, bitSet77, (-1), (int) (byte) 0);
        fuzzTest68.FuzzTest_previousSetBit(bitSet71, bitSet77, (-1), (int) (short) 100);
        fuzzTest31.FuzzTest_previousSetBit(bitSet67, bitSet77, (int) '#', (int) (short) 10);
        c2s_aug_sub.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet77, bitSet87, (int) (short) 10, 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_previousSetBit(bitSet2, bitSet3, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_previousSetBit(bitSet8, bitSet9, (-1), (int) (byte) 0);
        fuzzTest0.FuzzTest_previousSetBit(bitSet3, bitSet9, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_previousSetBit(bitSet17, bitSet18, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_previousSetBit(bitSet24, bitSet25, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_previousSetBit(bitSet30, bitSet31, (-1), (int) (byte) 0);
        fuzzTest22.FuzzTest_previousSetBit(bitSet25, bitSet31, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_previousSetBit(bitSet40, bitSet41, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_previousSetBit(bitSet46, bitSet47, (-1), (int) (byte) 0);
        fuzzTest38.FuzzTest_previousSetBit(bitSet41, bitSet47, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet55 = null;
        c2s_aug_sub.BitSet bitSet56 = null;
        fuzzTest54.FuzzTest_previousSetBit(bitSet55, bitSet56, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_previousSetBit(bitSet60, bitSet61, (int) (short) 1, 0);
        fuzzTest22.FuzzTest_previousSetBit(bitSet47, bitSet60, (int) (short) -1, 2);
        c2s_aug_sub.BitSet bitSet68 = null;
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = null;
        fuzzTest69.FuzzTest_previousSetBit(bitSet70, bitSet71, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_previousSetBit(bitSet75, bitSet76, (int) (short) 1, 0);
        fuzzTest22.FuzzTest_previousSetBit(bitSet68, bitSet76, (int) (byte) 10, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet18, bitSet76, 10, (int) (short) -1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_previousSetBit(bitSet6, bitSet7, (int) (short) 1, 0);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_previousSetBit(bitSet13, bitSet14, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_previousSetBit(bitSet19, bitSet20, (-1), (int) (byte) 0);
        fuzzTest11.FuzzTest_previousSetBit(bitSet14, bitSet20, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_previousSetBit(bitSet29, bitSet30, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_previousSetBit(bitSet35, bitSet36, (-1), (int) (byte) 0);
        fuzzTest27.FuzzTest_previousSetBit(bitSet30, bitSet36, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_previousSetBit(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_previousSetBit(bitSet49, bitSet50, (int) (short) 1, 0);
        fuzzTest11.FuzzTest_previousSetBit(bitSet36, bitSet49, (int) (short) -1, 2);
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet49, bitSet57, (int) ' ', 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_previousSetBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_previousSetBit(bitSet12, bitSet13, (int) (short) 1, 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_previousSetBit(bitSet20, bitSet21, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_previousSetBit(bitSet26, bitSet27, (-1), (int) (byte) 0);
        fuzzTest18.FuzzTest_previousSetBit(bitSet21, bitSet27, (-1), (int) (short) 100);
        fuzzTest6.FuzzTest_previousSetBit(bitSet17, bitSet27, (int) (byte) 10, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_previousSetBit(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_previousSetBit(bitSet44, bitSet45, (int) (short) 1, 0);
        fuzzTest6.FuzzTest_previousSetBit(bitSet37, bitSet45, 10, (int) ' ');
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_previousSetBit(bitSet53, bitSet54, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_previousSetBit(bitSet58, bitSet59, (int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet45, bitSet58, (int) (short) 100, 1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, 2, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_previousSetBit(bitSet7, bitSet8, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_previousSetBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_previousSetBit(bitSet18, bitSet19, (int) (short) 1, 0);
        c2s_aug_sub.BitSet bitSet23 = null;
        fuzzTest6.FuzzTest_previousSetBit(bitSet19, bitSet23, 0, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_previousSetBit(bitSet30, bitSet31, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_previousSetBit(bitSet36, bitSet37, (-1), (int) (byte) 0);
        fuzzTest28.FuzzTest_previousSetBit(bitSet31, bitSet37, (-1), (int) (short) 100);
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest27.FuzzTest_previousSetBit(bitSet31, bitSet44, (int) (short) 10, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_previousSetBit(bitSet31, bitSet48, (int) (short) -1, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_previousSetBit(bitSet54, bitSet55, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_previousSetBit(bitSet60, bitSet61, (-1), (int) (byte) 0);
        fuzzTest52.FuzzTest_previousSetBit(bitSet55, bitSet61, (-1), (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet48, bitSet61, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_previousSetBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_previousSetBit(bitSet12, bitSet13, (int) (short) 1, 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_previousSetBit(bitSet20, bitSet21, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_previousSetBit(bitSet26, bitSet27, (-1), (int) (byte) 0);
        fuzzTest18.FuzzTest_previousSetBit(bitSet21, bitSet27, (-1), (int) (short) 100);
        fuzzTest6.FuzzTest_previousSetBit(bitSet17, bitSet27, (int) (byte) 10, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_previousSetBit(bitSet37, bitSet38, (int) '#', (-1));
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_previousSetBit(bitSet44, bitSet45, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_previousSetBit(bitSet50, bitSet51, (-1), (int) (byte) 0);
        fuzzTest42.FuzzTest_previousSetBit(bitSet45, bitSet51, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_previousSetBit(bitSet60, bitSet61, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_previousSetBit(bitSet66, bitSet67, (-1), (int) (byte) 0);
        fuzzTest58.FuzzTest_previousSetBit(bitSet61, bitSet67, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet75 = null;
        c2s_aug_sub.BitSet bitSet76 = null;
        fuzzTest74.FuzzTest_previousSetBit(bitSet75, bitSet76, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_previousSetBit(bitSet80, bitSet81, (int) (short) 1, 0);
        fuzzTest42.FuzzTest_previousSetBit(bitSet67, bitSet80, (int) (short) -1, 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet38, bitSet80, (int) ' ', (-1));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_previousSetBit(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_previousSetBit(bitSet12, bitSet13, (int) (short) 1, 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet13, bitSet17, 0, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_previousSetBit(bitSet24, bitSet25, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_previousSetBit(bitSet30, bitSet31, (-1), (int) (byte) 0);
        fuzzTest22.FuzzTest_previousSetBit(bitSet25, bitSet31, (-1), (int) (short) 100);
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzzTest21.FuzzTest_previousSetBit(bitSet25, bitSet38, (int) (short) 10, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_previousSetBit(bitSet25, bitSet42, (int) (short) -1, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_previousSetBit(bitSet47, bitSet48, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_previousSetBit(bitSet53, bitSet54, (-1), (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet48, bitSet53, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_previousSetBit(bitSet7, bitSet8, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_previousSetBit(bitSet14, bitSet15, (-1), (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = null;
        fuzzTest13.FuzzTest_previousSetBit(bitSet19, bitSet20, (int) (short) 100, 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_previousSetBit(bitSet25, bitSet26, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_previousSetBit(bitSet33, bitSet34, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_previousSetBit(bitSet39, bitSet40, (-1), (int) (byte) 0);
        fuzzTest31.FuzzTest_previousSetBit(bitSet34, bitSet40, (-1), (int) (short) 100);
        c2s_aug_sub.BitSet bitSet47 = null;
        fuzzTest30.FuzzTest_previousSetBit(bitSet34, bitSet47, (int) (short) 10, (int) (short) 0);
        fuzzTest13.FuzzTest_previousSetBit(bitSet26, bitSet34, (int) (byte) 0, (int) '4');
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet55 = null;
        c2s_aug_sub.BitSet bitSet56 = null;
        fuzzTest54.FuzzTest_previousSetBit(bitSet55, bitSet56, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_previousSetBit(bitSet60, bitSet61, (int) (short) 1, 0);
        fuzzTest12.FuzzTest_previousSetBit(bitSet26, bitSet60, 10, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet8, bitSet60, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_previousSetBit(bitSet7, bitSet8, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_previousSetBit(bitSet14, bitSet15, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_previousSetBit(bitSet20, bitSet21, (-1), (int) (byte) 0);
        fuzzTest12.FuzzTest_previousSetBit(bitSet15, bitSet21, (-1), (int) (short) 100);
        fuzzTest0.FuzzTest_previousSetBit(bitSet8, bitSet15, (int) '4', 2);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_previousSetBit(bitSet32, bitSet33, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_previousSetBit(bitSet37, bitSet38, (int) (short) 1, 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_previousSetBit(bitSet43, bitSet44, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_previousSetBit(bitSet49, bitSet50, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_previousSetBit(bitSet56, bitSet57, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_previousSetBit(bitSet62, bitSet63, (-1), (int) (byte) 0);
        fuzzTest54.FuzzTest_previousSetBit(bitSet57, bitSet63, (-1), (int) (short) 100);
        fuzzTest42.FuzzTest_previousSetBit(bitSet50, bitSet57, (int) '4', 2);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_previousSetBit(bitSet75, bitSet76, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest80.FuzzTest_previousSetBit(bitSet81, bitSet82, (-1), (int) (byte) 0);
        fuzzTest73.FuzzTest_previousSetBit(bitSet76, bitSet82, (-1), (int) (short) 100);
        c2s_aug_sub.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_previousSetBit(bitSet76, bitSet89, (int) ' ', (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet38, bitSet89, (int) '#', 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, 2, (int) (short) 10);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet6, bitSet7, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_previousSetBit(bitSet13, bitSet14, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_previousSetBit(bitSet19, bitSet20, (-1), (int) (byte) 0);
        fuzzTest11.FuzzTest_previousSetBit(bitSet14, bitSet20, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_previousSetBit(bitSet29, bitSet30, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_previousSetBit(bitSet35, bitSet36, (-1), (int) (byte) 0);
        fuzzTest27.FuzzTest_previousSetBit(bitSet30, bitSet36, (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_previousSetBit(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_previousSetBit(bitSet49, bitSet50, (int) (short) 1, 0);
        fuzzTest11.FuzzTest_previousSetBit(bitSet36, bitSet49, (int) (short) -1, 2);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_previousSetBit(bitSet58, bitSet59, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_previousSetBit(bitSet63, bitSet64, (int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet36, bitSet63, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_previousSetBit(bitSet2, bitSet3, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_previousSetBit(bitSet8, bitSet9, (-1), (int) (byte) 0);
        fuzzTest0.FuzzTest_previousSetBit(bitSet3, bitSet9, (-1), (int) (short) 100);
        c2s_aug_sub.BitSet bitSet16 = null;
        c2s_aug_sub.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet16, bitSet17, 1, (-1));
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet22 = null;
        c2s_aug_sub.BitSet bitSet23 = null;
        fuzzTest21.FuzzTest_previousSetBit(bitSet22, bitSet23, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_previousSetBit(bitSet27, bitSet28, (int) (short) 1, 0);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_previousSetBit(bitSet33, bitSet34, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_previousSetBit(bitSet39, bitSet40, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_previousSetBit(bitSet46, bitSet47, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_previousSetBit(bitSet52, bitSet53, (-1), (int) (byte) 0);
        fuzzTest44.FuzzTest_previousSetBit(bitSet47, bitSet53, (-1), (int) (short) 100);
        fuzzTest32.FuzzTest_previousSetBit(bitSet40, bitSet47, (int) '4', 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet28, bitSet47, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, (-1), (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet6, bitSet7, (int) (short) 100, 0);
        c2s_aug_sub.BitSet bitSet11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_previousSetBit(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_previousSetBit(bitSet18, bitSet19, (int) (short) 1, 0);
        fuzzTest0.FuzzTest_previousSetBit(bitSet11, bitSet18, (int) (short) 1, (int) (byte) 100);
        c2s_aug_sub.BitSet bitSet26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_previousSetBit(bitSet28, bitSet29, (-1), (int) (byte) 0);
        fuzzTest0.FuzzTest_previousSetBit(bitSet26, bitSet29, (-1), (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet36 = null;
        c2s_aug_sub.BitSet bitSet37 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet36, bitSet37, 0, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_previousSetBit(bitSet42, bitSet43, (-1), (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet47 = null;
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzzTest41.FuzzTest_previousSetBit(bitSet47, bitSet48, (int) (short) 100, 0);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_previousSetBit(bitSet53, bitSet54, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_previousSetBit(bitSet61, bitSet62, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_previousSetBit(bitSet67, bitSet68, (-1), (int) (byte) 0);
        fuzzTest59.FuzzTest_previousSetBit(bitSet62, bitSet68, (-1), (int) (short) 100);
        c2s_aug_sub.BitSet bitSet75 = null;
        fuzzTest58.FuzzTest_previousSetBit(bitSet62, bitSet75, (int) (short) 10, (int) (short) 0);
        fuzzTest41.FuzzTest_previousSetBit(bitSet54, bitSet62, (int) (byte) 0, (int) '4');
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet83 = null;
        c2s_aug_sub.BitSet bitSet84 = null;
        fuzzTest82.FuzzTest_previousSetBit(bitSet83, bitSet84, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_previousSetBit(bitSet88, bitSet89, (int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet54, bitSet88, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_previousSetBit(bitSet1, bitSet2, (-1), (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet6, bitSet7, (int) (short) 100, 0);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_previousSetBit(bitSet12, bitSet13, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_previousSetBit(bitSet20, bitSet21, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_previousSetBit(bitSet26, bitSet27, (-1), (int) (byte) 0);
        fuzzTest18.FuzzTest_previousSetBit(bitSet21, bitSet27, (-1), (int) (short) 100);
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest17.FuzzTest_previousSetBit(bitSet21, bitSet34, (int) (short) 10, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_previousSetBit(bitSet40, bitSet41, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_previousSetBit(bitSet46, bitSet47, (-1), (int) (byte) 0);
        fuzzTest38.FuzzTest_previousSetBit(bitSet41, bitSet47, (-1), (int) (short) 100);
        fuzzTest11.FuzzTest_previousSetBit(bitSet34, bitSet47, (int) (byte) 100, (int) (byte) 1);
        c2s_aug_sub.BitSet bitSet57 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet47, bitSet57, (int) (byte) -1, 10);
        c2s_aug_sub.BitSet bitSet61 = null;
        c2s_aug_sub.BitSet bitSet62 = null;
        fuzzTest0.FuzzTest_previousSetBit(bitSet61, bitSet62, 2, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet67 = null;
        c2s_aug_sub.BitSet bitSet68 = null;
        fuzzTest66.FuzzTest_previousSetBit(bitSet67, bitSet68, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_previousSetBit(bitSet72, bitSet73, (int) (short) 1, 0);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_previousSetBit(bitSet79, bitSet80, (-1), (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest84.FuzzTest_previousSetBit(bitSet85, bitSet86, (-1), (int) (byte) 0);
        fuzzTest77.FuzzTest_previousSetBit(bitSet80, bitSet86, (-1), (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_previousSetBit(bitSet72, bitSet86, 10, 0);
    }
}

