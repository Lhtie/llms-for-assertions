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
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet18, bitSet19, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet8, bitSet19, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet18, bitSet19, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet19, bitSet23, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_set(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet44, bitSet45, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet45, bitSet49, (int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet19, bitSet45, 0, (int) ' ');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet18, bitSet19, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_set(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_set(bitSet29, bitSet30, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet30, bitSet34, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_set(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet44, bitSet45, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_set(bitSet50, bitSet51, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_set(bitSet55, bitSet56, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet56, bitSet60, (int) (byte) -1, (int) (short) -1);
        fuzzTest11.FuzzTest_set(bitSet30, bitSet56, (int) (byte) 0, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_set(bitSet68, bitSet69, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_set(bitSet73, bitSet74, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet79 = null;
        c2s_aug_sub.BitSet bitSet80 = null;
        fuzzTest78.FuzzTest_set(bitSet79, bitSet80, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet84 = null;
        c2s_aug_sub.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_set(bitSet84, bitSet85, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet89 = null;
        fuzzTest67.FuzzTest_set(bitSet85, bitSet89, (int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet30, bitSet85, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_set(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_set(bitSet17, bitSet18, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet22 = null;
        fuzzTest0.FuzzTest_set(bitSet18, bitSet22, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_set(bitSet27, bitSet28, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_set(bitSet32, bitSet33, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet43, bitSet44, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzzTest26.FuzzTest_set(bitSet44, bitSet48, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet58, bitSet59, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_set(bitSet64, bitSet65, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_set(bitSet69, bitSet70, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet70, bitSet74, (int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet44, bitSet74, 0, 10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet12, bitSet13, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_set(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_set(bitSet23, bitSet24, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet13, bitSet23, 0, 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet3 = null;
        c2s_aug_sub.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_set(bitSet3, bitSet4, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_set(bitSet8, bitSet9, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet19, bitSet20, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet25 = null;
        c2s_aug_sub.BitSet bitSet26 = null;
        fuzzTest24.FuzzTest_set(bitSet25, bitSet26, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet30 = null;
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_set(bitSet30, bitSet31, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet36 = null;
        c2s_aug_sub.BitSet bitSet37 = null;
        fuzzTest35.FuzzTest_set(bitSet36, bitSet37, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet42 = null;
        c2s_aug_sub.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet47 = null;
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet47, bitSet48, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet58, bitSet59, 10, (int) (byte) -1);
        fuzzTest35.FuzzTest_set(bitSet47, bitSet59, (int) '#', 10);
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest24.FuzzTest_set(bitSet59, bitSet66, (int) (short) 10, 1);
        fuzzTest2.FuzzTest_set(bitSet19, bitSet66, (int) (byte) 100, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet1, bitSet19, 2, (int) (byte) 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_set(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_set(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet28, bitSet29, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest11.FuzzTest_set(bitSet29, bitSet33, (int) (short) -1, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet37 = null;
        fuzzTest0.FuzzTest_set(bitSet29, bitSet37, (int) (short) 0, 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet42 = null;
        c2s_aug_sub.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet47 = null;
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet47, bitSet48, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet58, bitSet59, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzzTest41.FuzzTest_set(bitSet59, bitSet63, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_set(bitSet68, bitSet69, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_set(bitSet73, bitSet74, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet79 = null;
        c2s_aug_sub.BitSet bitSet80 = null;
        fuzzTest78.FuzzTest_set(bitSet79, bitSet80, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_set(bitSet84, bitSet85, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_set(bitSet85, bitSet89, (int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet59, bitSet85, (int) (short) 1, 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet18, bitSet19, (int) '4', (int) '4');
        fuzzTest0.FuzzTest_set(bitSet7, bitSet18, (int) ' ', (int) ' ');
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_set(bitSet27, bitSet28, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_set(bitSet32, bitSet33, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet43, bitSet44, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_set(bitSet44, bitSet48, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet58, bitSet59, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_set(bitSet64, bitSet65, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_set(bitSet69, bitSet70, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet70, bitSet74, (int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet48, bitSet74, 0, (int) ' ');
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet7, bitSet8, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet18, bitSet19, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_set(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_set(bitSet29, bitSet30, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest12.FuzzTest_set(bitSet30, bitSet34, (int) (short) -1, (int) (byte) 10);
        fuzzTest0.FuzzTest_set(bitSet7, bitSet34, (int) (short) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet42 = null;
        c2s_aug_sub.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet47, bitSet48, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet58, bitSet59, (int) '4', (int) '4');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet47, bitSet59, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet18, bitSet19, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet19, bitSet23, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_set(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet44, bitSet45, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet45, bitSet49, (int) (byte) -1, (int) (short) -1);
        fuzzTest0.FuzzTest_set(bitSet19, bitSet45, (int) (byte) 0, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet57 = null;
        c2s_aug_sub.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_set(bitSet57, bitSet58, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_set(bitSet62, bitSet63, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet67 = null;
        fuzzTest0.FuzzTest_set(bitSet63, bitSet67, (int) (short) 0, 100);
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_set(bitSet73, bitSet74, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_set(bitSet78, bitSet79, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet71, bitSet78, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet18, bitSet19, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_set(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_set(bitSet29, bitSet30, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest12.FuzzTest_set(bitSet30, bitSet34, (int) (short) -1, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_set(bitSet40, bitSet41, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet45 = null;
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_set(bitSet45, bitSet46, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet51 = null;
        c2s_aug_sub.BitSet bitSet52 = null;
        fuzzTest50.FuzzTest_set(bitSet51, bitSet52, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_set(bitSet56, bitSet57, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_set(bitSet57, bitSet61, (int) (byte) -1, (int) (short) -1);
        fuzzTest12.FuzzTest_set(bitSet38, bitSet57, 10, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = null;
        fuzzTest68.FuzzTest_set(bitSet69, bitSet70, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_set(bitSet74, bitSet75, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest12.FuzzTest_set(bitSet75, bitSet79, (int) 'a', 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet11, bitSet75, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_set(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_set(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet28, bitSet29, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest11.FuzzTest_set(bitSet29, bitSet33, (int) (short) -1, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet37 = null;
        fuzzTest0.FuzzTest_set(bitSet29, bitSet37, (int) (short) 0, 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet42 = null;
        c2s_aug_sub.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet47, bitSet48, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet47, bitSet52, (int) (byte) 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet57 = null;
        c2s_aug_sub.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_set(bitSet57, bitSet58, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_set(bitSet62, bitSet63, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet63, bitSet67, (int) ' ', (int) 'a');
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
        fuzzTest2.FuzzTest_set(bitSet3, bitSet4, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_set(bitSet8, bitSet9, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_set(bitSet14, bitSet15, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_set(bitSet19, bitSet20, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_set(bitSet20, bitSet24, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet34, bitSet35, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_set(bitSet40, bitSet41, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_set(bitSet45, bitSet46, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet51 = null;
        c2s_aug_sub.BitSet bitSet52 = null;
        fuzzTest50.FuzzTest_set(bitSet51, bitSet52, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet56 = null;
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_set(bitSet56, bitSet57, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet62 = null;
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzzTest61.FuzzTest_set(bitSet62, bitSet63, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_set(bitSet67, bitSet68, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_set(bitSet68, bitSet72, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet77 = null;
        c2s_aug_sub.BitSet bitSet78 = null;
        fuzzTest76.FuzzTest_set(bitSet77, bitSet78, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_set(bitSet82, bitSet83, 10, (int) (byte) -1);
        fuzzTest39.FuzzTest_set(bitSet72, bitSet82, 0, (int) (byte) 1);
        fuzzTest2.FuzzTest_set(bitSet35, bitSet82, 100, 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet1, bitSet82, (int) (short) 10, (int) '4');
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet12, bitSet13, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_set(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_set(bitSet23, bitSet24, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_set(bitSet12, bitSet24, 100, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet31, bitSet32, 0, (int) (short) 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet15 = null;
        c2s_aug_sub.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet20, bitSet21, 10, (int) (byte) -1);
        fuzzTest12.FuzzTest_set(bitSet13, bitSet20, 1, 10);
        fuzzTest0.FuzzTest_set(bitSet11, bitSet13, (int) (short) 0, (-1));
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_set(bitSet32, bitSet33, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_set(bitSet37, bitSet38, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_set(bitSet43, bitSet44, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_set(bitSet48, bitSet49, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_set(bitSet54, bitSet55, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_set(bitSet59, bitSet60, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_set(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet70, bitSet71, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_set(bitSet71, bitSet75, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet80 = null;
        c2s_aug_sub.BitSet bitSet81 = null;
        fuzzTest79.FuzzTest_set(bitSet80, bitSet81, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_set(bitSet85, bitSet86, 10, (int) (byte) -1);
        fuzzTest42.FuzzTest_set(bitSet75, bitSet85, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet38, bitSet75, 10, (int) ' ');
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_set(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_set(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet28, bitSet29, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest11.FuzzTest_set(bitSet29, bitSet33, (int) (short) -1, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet37 = null;
        fuzzTest0.FuzzTest_set(bitSet29, bitSet37, (int) (short) 0, 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet42 = null;
        c2s_aug_sub.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet47, bitSet48, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet47, bitSet52, (int) (byte) 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet57 = null;
        c2s_aug_sub.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_set(bitSet57, bitSet58, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_set(bitSet62, bitSet63, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_set(bitSet68, bitSet69, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_set(bitSet73, bitSet74, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet62, bitSet73, 0, (int) (short) 10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet20 = null;
        c2s_aug_sub.BitSet bitSet21 = null;
        fuzzTest19.FuzzTest_set(bitSet20, bitSet21, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_set(bitSet25, bitSet26, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet31 = null;
        c2s_aug_sub.BitSet bitSet32 = null;
        fuzzTest30.FuzzTest_set(bitSet31, bitSet32, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet36 = null;
        c2s_aug_sub.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_set(bitSet36, bitSet37, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet42 = null;
        c2s_aug_sub.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet47 = null;
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(bitSet47, bitSet48, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet52 = null;
        fuzzTest30.FuzzTest_set(bitSet48, bitSet52, (int) (short) -1, (int) (byte) 10);
        fuzzTest18.FuzzTest_set(bitSet25, bitSet52, (int) (short) 1, (int) (short) 10);
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet25, bitSet59, (int) ' ', 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet11, bitSet59, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet9 = null;
        c2s_aug_sub.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet14, bitSet15, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet20 = null;
        c2s_aug_sub.BitSet bitSet21 = null;
        fuzzTest19.FuzzTest_set(bitSet20, bitSet21, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_set(bitSet27, bitSet28, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_set(bitSet32, bitSet33, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet43, bitSet44, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_set(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_set(bitSet54, bitSet55, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet55, bitSet59, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_set(bitSet64, bitSet65, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_set(bitSet69, bitSet70, 10, (int) (byte) -1);
        fuzzTest26.FuzzTest_set(bitSet59, bitSet69, 0, (int) (byte) 1);
        fuzzTest19.FuzzTest_set(bitSet25, bitSet69, (int) ' ', (int) ' ');
        fuzzTest7.FuzzTest_set(bitSet15, bitSet69, (int) (byte) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet6, bitSet69, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet12, bitSet13, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_set(bitSet13, bitSet17, 0, (int) ' ');
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet22 = null;
        c2s_aug_sub.BitSet bitSet23 = null;
        fuzzTest21.FuzzTest_set(bitSet22, bitSet23, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet27, bitSet28, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_set(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_set(bitSet38, bitSet39, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_set(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_set(bitSet49, bitSet50, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_set(bitSet50, bitSet54, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_set(bitSet59, bitSet60, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(bitSet64, bitSet65, 10, (int) (byte) -1);
        fuzzTest21.FuzzTest_set(bitSet54, bitSet64, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet74 = null;
        c2s_aug_sub.BitSet bitSet75 = null;
        fuzzTest73.FuzzTest_set(bitSet74, bitSet75, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_set(bitSet79, bitSet80, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet84 = null;
        fuzzTest72.FuzzTest_set(bitSet79, bitSet84, (int) (short) 10, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet54, bitSet79, 10, (int) 'a');
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet12, bitSet13, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_set(bitSet13, bitSet17, 0, (int) ' ');
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet22 = null;
        c2s_aug_sub.BitSet bitSet23 = null;
        fuzzTest21.FuzzTest_set(bitSet22, bitSet23, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet27, bitSet28, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet36 = null;
        c2s_aug_sub.BitSet bitSet37 = null;
        fuzzTest35.FuzzTest_set(bitSet36, bitSet37, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_set(bitSet41, bitSet42, 10, (int) (byte) -1);
        fuzzTest33.FuzzTest_set(bitSet34, bitSet41, 1, 10);
        fuzzTest21.FuzzTest_set(bitSet32, bitSet34, (int) (short) 0, (-1));
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_set(bitSet53, bitSet54, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_set(bitSet58, bitSet59, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet32, bitSet58, 0, (int) (short) 100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet9 = null;
        c2s_aug_sub.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_set(bitSet9, bitSet10, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(bitSet14, bitSet15, 10, (int) (byte) -1);
        fuzzTest6.FuzzTest_set(bitSet7, bitSet14, 1, 10);
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet26 = null;
        c2s_aug_sub.BitSet bitSet27 = null;
        fuzzTest25.FuzzTest_set(bitSet26, bitSet27, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_set(bitSet31, bitSet32, 10, (int) (byte) -1);
        fuzzTest23.FuzzTest_set(bitSet24, bitSet31, 1, 10);
        fuzzTest6.FuzzTest_set(bitSet22, bitSet31, 0, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_set(bitSet43, bitSet44, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_set(bitSet48, bitSet49, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_set(bitSet54, bitSet55, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_set(bitSet59, bitSet60, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_set(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet70, bitSet71, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_set(bitSet71, bitSet75, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet80 = null;
        c2s_aug_sub.BitSet bitSet81 = null;
        fuzzTest79.FuzzTest_set(bitSet80, bitSet81, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_set(bitSet85, bitSet86, 10, (int) (byte) -1);
        fuzzTest42.FuzzTest_set(bitSet75, bitSet85, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet31, bitSet85, (int) ' ', (int) '#');
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet12, bitSet13, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_set(bitSet13, bitSet17, 0, (int) ' ');
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet22 = null;
        c2s_aug_sub.BitSet bitSet23 = null;
        fuzzTest21.FuzzTest_set(bitSet22, bitSet23, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet27, bitSet28, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_set(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_set(bitSet38, bitSet39, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet43 = null;
        fuzzTest21.FuzzTest_set(bitSet39, bitSet43, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_set(bitSet48, bitSet49, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_set(bitSet53, bitSet54, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet39, bitSet54, 0, (int) (byte) 100);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet7, bitSet8, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet18, bitSet19, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_set(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_set(bitSet29, bitSet30, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet35 = null;
        c2s_aug_sub.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_set(bitSet35, bitSet36, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet41 = null;
        c2s_aug_sub.BitSet bitSet42 = null;
        fuzzTest40.FuzzTest_set(bitSet41, bitSet42, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet46 = null;
        c2s_aug_sub.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_set(bitSet46, bitSet47, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet52 = null;
        c2s_aug_sub.BitSet bitSet53 = null;
        fuzzTest51.FuzzTest_set(bitSet52, bitSet53, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_set(bitSet57, bitSet58, 10, (int) (byte) -1);
        fuzzTest34.FuzzTest_set(bitSet46, bitSet58, (int) '#', 10);
        c2s_aug_sub.BitSet bitSet65 = null;
        fuzzTest23.FuzzTest_set(bitSet58, bitSet65, (int) (short) 10, 1);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = null;
        fuzzTest69.FuzzTest_set(bitSet70, bitSet71, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_set(bitSet75, bitSet76, 10, (int) (byte) -1);
        fuzzTest12.FuzzTest_set(bitSet58, bitSet75, (int) (short) 100, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet8, bitSet58, 2, (int) (byte) 100);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_set(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_set(bitSet17, bitSet18, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet18, bitSet22, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_set(bitSet28, bitSet29, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_set(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_set(bitSet44, bitSet45, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(bitSet45, bitSet49, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_set(bitSet54, bitSet55, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_set(bitSet59, bitSet60, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_set(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet70, bitSet71, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_set(bitSet71, bitSet75, (int) (byte) -1, (int) (short) -1);
        fuzzTest26.FuzzTest_set(bitSet45, bitSet71, (int) (byte) 0, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet45, bitSet82, 10, (int) (short) 100);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet18, bitSet19, (int) '4', (int) '4');
        fuzzTest0.FuzzTest_set(bitSet7, bitSet18, (int) ' ', (int) ' ');
        c2s_aug_sub.BitSet bitSet26 = null;
        c2s_aug_sub.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_set(bitSet26, bitSet27, 100, (-1));
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_set(bitSet32, bitSet33, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_set(bitSet37, bitSet38, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_set(bitSet43, bitSet44, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_set(bitSet48, bitSet49, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet53 = null;
        fuzzTest31.FuzzTest_set(bitSet49, bitSet53, (int) (short) -1, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet58 = null;
        fuzzTest31.FuzzTest_set(bitSet57, bitSet58, 0, (-1));
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_set(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet70, bitSet71, 10, (int) (byte) -1);
        fuzzTest62.FuzzTest_set(bitSet63, bitSet70, 1, 10);
        c2s_aug_sub.BitSet bitSet78 = null;
        fuzzTest31.FuzzTest_set(bitSet70, bitSet78, (int) '4', (int) (short) 1);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet83 = null;
        c2s_aug_sub.BitSet bitSet84 = null;
        fuzzTest82.FuzzTest_set(bitSet83, bitSet84, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_set(bitSet88, bitSet89, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet70, bitSet89, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_set(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_set(bitSet17, bitSet18, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_set(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_set(bitSet28, bitSet29, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_set(bitSet34, bitSet35, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_set(bitSet39, bitSet40, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest22.FuzzTest_set(bitSet40, bitSet44, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_set(bitSet50, bitSet51, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_set(bitSet55, bitSet56, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet61 = null;
        c2s_aug_sub.BitSet bitSet62 = null;
        fuzzTest60.FuzzTest_set(bitSet61, bitSet62, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet66 = null;
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_set(bitSet66, bitSet67, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet72 = null;
        c2s_aug_sub.BitSet bitSet73 = null;
        fuzzTest71.FuzzTest_set(bitSet72, bitSet73, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet77 = null;
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_set(bitSet77, bitSet78, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet82 = null;
        fuzzTest60.FuzzTest_set(bitSet78, bitSet82, (int) (short) -1, (int) (byte) 10);
        fuzzTest48.FuzzTest_set(bitSet55, bitSet82, (int) (short) 1, (int) (short) 10);
        fuzzTest11.FuzzTest_set(bitSet40, bitSet55, (int) '4', (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet55, bitSet92, 0, (int) 'a');
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet7, bitSet8, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet18, bitSet19, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet7, bitSet19, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_set(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_set(bitSet17, bitSet18, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet22 = null;
        fuzzTest0.FuzzTest_set(bitSet18, bitSet22, (int) (short) -1, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_set(bitSet26, bitSet27, 0, (-1));
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_set(bitSet34, bitSet35, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_set(bitSet39, bitSet40, 10, (int) (byte) -1);
        fuzzTest31.FuzzTest_set(bitSet32, bitSet39, 1, 10);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_set(bitSet48, bitSet49, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_set(bitSet53, bitSet54, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet39, bitSet54, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_set(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_set(bitSet17, bitSet18, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet18, bitSet22, (int) (byte) -1, (int) (short) -1);
        c2s_aug_sub.BitSet bitSet26 = null;
        c2s_aug_sub.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_set(bitSet26, bitSet27, 10, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_set(bitSet32, bitSet33, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_set(bitSet37, bitSet38, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_set(bitSet43, bitSet44, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_set(bitSet48, bitSet49, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_set(bitSet54, bitSet55, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_set(bitSet59, bitSet60, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest42.FuzzTest_set(bitSet60, bitSet64, (int) (short) -1, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet68 = null;
        fuzzTest31.FuzzTest_set(bitSet60, bitSet68, (int) (short) 0, 1);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_set(bitSet73, bitSet74, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_set(bitSet78, bitSet79, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_set(bitSet78, bitSet83, (int) (byte) 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet83, bitSet87, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet12, bitSet13, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_set(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_set(bitSet23, bitSet24, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_set(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(bitSet34, bitSet35, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest17.FuzzTest_set(bitSet35, bitSet39, 1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet13, bitSet35, 2, (int) '4');
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet7, bitSet8, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet12 = null;
        fuzzTest0.FuzzTest_set(bitSet7, bitSet12, (int) (short) 10, (int) (short) 100);
        c2s_aug_sub.BitSet bitSet16 = null;
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_set(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_set(bitSet23, bitSet24, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_set(bitSet16, bitSet24, 0, (int) '4');
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_set(bitSet32, bitSet33, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_set(bitSet37, bitSet38, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet46 = null;
        c2s_aug_sub.BitSet bitSet47 = null;
        fuzzTest45.FuzzTest_set(bitSet46, bitSet47, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_set(bitSet51, bitSet52, 10, (int) (byte) -1);
        fuzzTest43.FuzzTest_set(bitSet44, bitSet51, 1, 10);
        fuzzTest31.FuzzTest_set(bitSet42, bitSet44, (int) (short) 0, (-1));
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_set(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_set(bitSet68, bitSet69, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet74 = null;
        c2s_aug_sub.BitSet bitSet75 = null;
        fuzzTest73.FuzzTest_set(bitSet74, bitSet75, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet79 = null;
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_set(bitSet79, bitSet80, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet84 = null;
        fuzzTest62.FuzzTest_set(bitSet80, bitSet84, (int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet42, bitSet80, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_set(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_set(bitSet17, bitSet18, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet22 = null;
        fuzzTest0.FuzzTest_set(bitSet18, bitSet22, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_set(bitSet27, bitSet28, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_set(bitSet32, bitSet33, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet37 = null;
        fuzzTest0.FuzzTest_set(bitSet33, bitSet37, (int) (byte) 0, (int) '#');
        c2s_aug_sub.BitSet bitSet41 = null;
        c2s_aug_sub.BitSet bitSet42 = null;
        fuzzTest0.FuzzTest_set(bitSet41, bitSet42, 10, 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet47 = null;
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzzTest46.FuzzTest_set(bitSet47, bitSet48, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_set(bitSet52, bitSet53, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_set(bitSet59, bitSet60, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(bitSet64, bitSet65, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = null;
        fuzzTest69.FuzzTest_set(bitSet70, bitSet71, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet75 = null;
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_set(bitSet75, bitSet76, (int) '4', (int) '4');
        fuzzTest57.FuzzTest_set(bitSet64, bitSet75, (int) ' ', (int) ' ');
        c2s_aug_sub.BitSet bitSet83 = null;
        c2s_aug_sub.BitSet bitSet84 = null;
        fuzzTest57.FuzzTest_set(bitSet83, bitSet84, 100, (-1));
        c2s_aug_sub.BitSet bitSet88 = null;
        c2s_aug_sub.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_set(bitSet88, bitSet89, (int) (short) 100, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet52, bitSet89, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_set(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_set(bitSet17, bitSet18, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet22 = null;
        fuzzTest0.FuzzTest_set(bitSet18, bitSet22, (int) (short) -1, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_set(bitSet26, bitSet27, 0, (-1));
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet36 = null;
        c2s_aug_sub.BitSet bitSet37 = null;
        fuzzTest35.FuzzTest_set(bitSet36, bitSet37, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet41 = null;
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_set(bitSet41, bitSet42, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet47 = null;
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzzTest46.FuzzTest_set(bitSet47, bitSet48, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_set(bitSet52, bitSet53, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_set(bitSet53, bitSet57, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet62 = null;
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzzTest61.FuzzTest_set(bitSet62, bitSet63, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet67 = null;
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_set(bitSet67, bitSet68, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_set(bitSet73, bitSet74, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_set(bitSet78, bitSet79, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_set(bitSet79, bitSet83, (int) (byte) -1, (int) (short) -1);
        fuzzTest34.FuzzTest_set(bitSet53, bitSet79, (int) (byte) 0, (int) (short) 0);
        fuzzTest32.FuzzTest_set(bitSet33, bitSet79, (-1), (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet31, bitSet79, 10, (int) (short) 100);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet15 = null;
        c2s_aug_sub.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet20, bitSet21, 10, (int) (byte) -1);
        fuzzTest12.FuzzTest_set(bitSet13, bitSet20, 1, 10);
        fuzzTest0.FuzzTest_set(bitSet11, bitSet13, (int) (short) 0, (-1));
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_set(bitSet32, bitSet33, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet43, bitSet44, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_set(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_set(bitSet54, bitSet55, 10, (int) (byte) -1);
        fuzzTest31.FuzzTest_set(bitSet43, bitSet55, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_set(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_set(bitSet68, bitSet69, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet73 = null;
        fuzzTest31.FuzzTest_set(bitSet69, bitSet73, 1, (int) ' ');
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet78 = null;
        c2s_aug_sub.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_set(bitSet78, bitSet79, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet83 = null;
        c2s_aug_sub.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_set(bitSet83, bitSet84, (int) '4', (int) '4');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet69, bitSet84, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_set(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_set(bitSet12, bitSet13, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_set(bitSet13, bitSet17, 0, (int) ' ');
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_set(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_set(bitSet29, bitSet30, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest22.FuzzTest_set(bitSet29, bitSet34, (int) (short) 10, (int) (short) 100);
        fuzzTest0.FuzzTest_set(bitSet21, bitSet29, (int) '#', (int) '#');
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet42 = null;
        c2s_aug_sub.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_set(bitSet42, bitSet43, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_set(bitSet48, bitSet49, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_set(bitSet53, bitSet54, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet58 = null;
        fuzzTest41.FuzzTest_set(bitSet54, bitSet58, 0, (int) ' ');
        c2s_aug_sub.BitSet bitSet62 = null;
        fuzzTest0.FuzzTest_set(bitSet58, bitSet62, (int) (short) 100, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = null;
        fuzzTest68.FuzzTest_set(bitSet69, bitSet70, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_set(bitSet74, bitSet75, 10, (int) (byte) -1);
        fuzzTest66.FuzzTest_set(bitSet67, bitSet74, 1, 10);
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet74, bitSet82, 2, (int) (short) 10);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_set(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(bitSet6, bitSet7, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet15 = null;
        c2s_aug_sub.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_set(bitSet15, bitSet16, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_set(bitSet20, bitSet21, 10, (int) (byte) -1);
        fuzzTest12.FuzzTest_set(bitSet13, bitSet20, 1, 10);
        fuzzTest0.FuzzTest_set(bitSet11, bitSet13, (int) (short) 100, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet31, bitSet32, 1, (int) (short) 100);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet3 = null;
        c2s_aug_sub.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_set(bitSet3, bitSet4, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_set(bitSet8, bitSet9, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_set(bitSet1, bitSet8, 1, 10);
        c2s_aug_sub.BitSet bitSet16 = null;
        c2s_aug_sub.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_set(bitSet16, bitSet17, 2, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet22 = null;
        c2s_aug_sub.BitSet bitSet23 = null;
        fuzzTest21.FuzzTest_set(bitSet22, bitSet23, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet27, bitSet28, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_set(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_set(bitSet38, bitSet39, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(bitSet39, bitSet43, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_set(bitSet48, bitSet49, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_set(bitSet53, bitSet54, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_set(bitSet59, bitSet60, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_set(bitSet65, bitSet66, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet70 = null;
        c2s_aug_sub.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_set(bitSet70, bitSet71, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet76 = null;
        c2s_aug_sub.BitSet bitSet77 = null;
        fuzzTest75.FuzzTest_set(bitSet76, bitSet77, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_set(bitSet81, bitSet82, 10, (int) (byte) -1);
        fuzzTest58.FuzzTest_set(bitSet70, bitSet82, (int) '#', 10);
        c2s_aug_sub.BitSet bitSet89 = null;
        fuzzTest47.FuzzTest_set(bitSet82, bitSet89, (int) (short) 10, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet43, bitSet82, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_set(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_set(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_set(bitSet18, bitSet19, (int) '4', (int) '4');
        fuzzTest0.FuzzTest_set(bitSet7, bitSet18, (int) ' ', (int) ' ');
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_set(bitSet27, bitSet28, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_set(bitSet32, bitSet33, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_set(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(bitSet43, bitSet44, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_set(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_set(bitSet54, bitSet55, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_set(bitSet60, bitSet61, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_set(bitSet65, bitSet66, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet70 = null;
        fuzzTest48.FuzzTest_set(bitSet66, bitSet70, (int) (short) -1, (int) (byte) 10);
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest37.FuzzTest_set(bitSet66, bitSet74, (int) (short) 0, 1);
        fuzzTest0.FuzzTest_set(bitSet33, bitSet74, 0, (int) (short) 1);
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(bitSet81, bitSet82, 0, 10);
    }
}

