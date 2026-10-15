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
        fuzzTest1.FuzzTest_clear(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clear(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet8, bitSet19, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_clear(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clear(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clear(bitSet19, bitSet23, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_clear(bitSet28, bitSet29, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_clear(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_clear(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_clear(bitSet44, bitSet45, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_clear(bitSet45, bitSet49, (int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet19, bitSet45, 0, (int) ' ');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_clear(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_clear(bitSet12, bitSet13, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_clear(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_clear(bitSet23, bitSet24, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_clear(bitSet12, bitSet24, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_clear(bitSet32, bitSet33, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_clear(bitSet37, bitSet38, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_clear(bitSet43, bitSet44, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_clear(bitSet48, bitSet49, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet37, bitSet49, 0, (int) (byte) 10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet3 = null;
        c2s_aug_sub.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_clear(bitSet3, bitSet4, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_clear(bitSet8, bitSet9, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_clear(bitSet14, bitSet15, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_clear(bitSet19, bitSet20, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet25 = null;
        c2s_aug_sub.BitSet bitSet26 = null;
        fuzzTest24.FuzzTest_clear(bitSet25, bitSet26, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_clear(bitSet30, bitSet31, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet36 = null;
        c2s_aug_sub.BitSet bitSet37 = null;
        fuzzTest35.FuzzTest_clear(bitSet36, bitSet37, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_clear(bitSet41, bitSet42, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet47 = null;
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzzTest46.FuzzTest_clear(bitSet47, bitSet48, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet52 = null;
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_clear(bitSet52, bitSet53, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_clear(bitSet58, bitSet59, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_clear(bitSet63, bitSet64, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_clear(bitSet64, bitSet68, (int) (byte) -1, (int) (short) -1);
        fuzzTest24.FuzzTest_clear(bitSet41, bitSet64, 0, (int) (short) 0);
        fuzzTest2.FuzzTest_clear(bitSet20, bitSet41, (int) (short) 100, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet20, 0, 100);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet25 = null;
        c2s_aug_sub.BitSet bitSet26 = null;
        fuzzTest24.FuzzTest_clear(bitSet25, bitSet26, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_clear(bitSet30, bitSet31, 10, (int) (byte) -1);
        fuzzTest12.FuzzTest_clear(bitSet23, bitSet30, (int) '4', 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet11, bitSet23, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet18, bitSet22, (int) (byte) -1, (int) (short) -1);
        c2s_aug_sub.BitSet bitSet26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_clear(bitSet28, bitSet29, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_clear(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_clear(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_clear(bitSet44, bitSet45, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_clear(bitSet45, bitSet49, (int) (byte) -1, (int) (short) -1);
        fuzzTest0.FuzzTest_clear(bitSet26, bitSet45, 10, (int) (byte) 1);
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_clear(bitSet58, bitSet59, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_clear(bitSet63, bitSet64, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = null;
        fuzzTest68.FuzzTest_clear(bitSet69, bitSet70, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_clear(bitSet74, bitSet75, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_clear(bitSet75, bitSet79, (int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet56, bitSet75, (int) (byte) 1, (int) '4');
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_clear(bitSet7, bitSet8, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_clear(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_clear(bitSet29, bitSet30, 10, (int) (byte) -1);
        fuzzTest6.FuzzTest_clear(bitSet18, bitSet30, 100, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_clear(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_clear(bitSet44, bitSet45, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_clear(bitSet50, bitSet51, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_clear(bitSet55, bitSet56, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_clear(bitSet56, bitSet60, (int) (byte) -1, (int) (short) -1);
        fuzzTest6.FuzzTest_clear(bitSet37, bitSet56, (int) (byte) -1, 100);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_clear(bitSet68, bitSet69, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_clear(bitSet73, bitSet74, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet80 = null;
        c2s_aug_sub.BitSet bitSet81 = null;
        fuzzTest79.FuzzTest_clear(bitSet80, bitSet81, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_clear(bitSet85, bitSet86, 10, (int) (byte) -1);
        fuzzTest67.FuzzTest_clear(bitSet78, bitSet85, (int) '4', 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet56, bitSet78, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet11 = null;
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet11, bitSet12, (int) 'a', 1);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = null;
        fuzzTest16.FuzzTest_clear(bitSet17, bitSet18, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet22 = null;
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_clear(bitSet22, bitSet23, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_clear(bitSet28, bitSet29, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_clear(bitSet33, bitSet34, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzzTest16.FuzzTest_clear(bitSet34, bitSet38, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_clear(bitSet43, bitSet44, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_clear(bitSet48, bitSet49, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet53 = null;
        fuzzTest16.FuzzTest_clear(bitSet48, bitSet53, (int) (byte) 100, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet58 = null;
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_clear(bitSet58, bitSet59, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_clear(bitSet63, bitSet64, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = null;
        fuzzTest68.FuzzTest_clear(bitSet69, bitSet70, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_clear(bitSet74, bitSet75, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_clear(bitSet75, bitSet79, (int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet48, bitSet79, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_clear(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clear(bitSet7, bitSet8, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clear(bitSet18, bitSet23, 1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_clear(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_clear(bitSet34, bitSet35, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_clear(bitSet40, bitSet41, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_clear(bitSet45, bitSet46, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet52 = null;
        c2s_aug_sub.BitSet bitSet53 = null;
        fuzzTest51.FuzzTest_clear(bitSet52, bitSet53, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_clear(bitSet57, bitSet58, 10, (int) (byte) -1);
        fuzzTest39.FuzzTest_clear(bitSet50, bitSet57, (int) '4', 100);
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet66 = null;
        fuzzTest39.FuzzTest_clear(bitSet65, bitSet66, (int) (byte) 1, (int) (short) 1);
        fuzzTest27.FuzzTest_clear(bitSet34, bitSet65, (-1), (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet23, bitSet34, (int) (byte) 0, 100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_clear(bitSet24, bitSet25, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_clear(bitSet29, bitSet30, 10, (int) (byte) -1);
        fuzzTest11.FuzzTest_clear(bitSet22, bitSet29, (int) '4', 100);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_clear(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_clear(bitSet43, bitSet44, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_clear(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_clear(bitSet54, bitSet55, 10, (int) (byte) -1);
        fuzzTest11.FuzzTest_clear(bitSet44, bitSet54, (int) '#', (int) 'a');
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_clear(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = null;
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_clear(bitSet68, bitSet69, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet74 = null;
        c2s_aug_sub.BitSet bitSet75 = null;
        fuzzTest73.FuzzTest_clear(bitSet74, bitSet75, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet79 = null;
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_clear(bitSet79, bitSet80, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet84 = null;
        fuzzTest62.FuzzTest_clear(bitSet80, bitSet84, (int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet44, bitSet80, 0, (int) (byte) 100);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_clear(bitSet8, bitSet9, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_clear(bitSet13, bitSet14, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = null;
        fuzzTest18.FuzzTest_clear(bitSet19, bitSet20, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_clear(bitSet24, bitSet25, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_clear(bitSet25, bitSet29, (int) (byte) -1, (int) (short) -1);
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet29, 2, 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet37 = null;
        c2s_aug_sub.BitSet bitSet38 = null;
        fuzzTest36.FuzzTest_clear(bitSet37, bitSet38, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_clear(bitSet42, bitSet43, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_clear(bitSet48, bitSet49, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_clear(bitSet53, bitSet54, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_clear(bitSet53, bitSet58, 1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_clear(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_clear(bitSet68, bitSet69, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet58, bitSet68, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet18, bitSet22, (int) (byte) -1, (int) (short) -1);
        c2s_aug_sub.BitSet bitSet26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_clear(bitSet28, bitSet29, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_clear(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet39 = null;
        c2s_aug_sub.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_clear(bitSet39, bitSet40, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_clear(bitSet44, bitSet45, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_clear(bitSet45, bitSet49, (int) (byte) -1, (int) (short) -1);
        fuzzTest0.FuzzTest_clear(bitSet26, bitSet45, 10, (int) (byte) 1);
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet56, bitSet57, (int) 'a', 10);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet62 = null;
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzzTest61.FuzzTest_clear(bitSet62, bitSet63, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet67 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_clear(bitSet67, bitSet68, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_clear(bitSet73, bitSet74, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_clear(bitSet78, bitSet79, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet67, bitSet79, 1, (int) (byte) 10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_clear(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clear(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, (int) '4', (int) '4');
        fuzzTest0.FuzzTest_clear(bitSet7, bitSet18, (int) ' ', (int) ' ');
        c2s_aug_sub.BitSet bitSet26 = null;
        c2s_aug_sub.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_clear(bitSet26, bitSet27, 0, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_clear(bitSet32, bitSet33, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet37 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_clear(bitSet37, bitSet38, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet43 = null;
        fuzzTest31.FuzzTest_clear(bitSet42, bitSet43, (-1), (int) 'a');
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet48 = null;
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_clear(bitSet48, bitSet49, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_clear(bitSet53, bitSet54, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_clear(bitSet59, bitSet60, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_clear(bitSet64, bitSet65, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_clear(bitSet64, bitSet69, 1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet74 = null;
        c2s_aug_sub.BitSet bitSet75 = null;
        fuzzTest73.FuzzTest_clear(bitSet74, bitSet75, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_clear(bitSet79, bitSet80, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet84 = null;
        fuzzTest47.FuzzTest_clear(bitSet79, bitSet84, (int) ' ', 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet42, bitSet79, 1, (int) (byte) 100);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet3 = null;
        c2s_aug_sub.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_clear(bitSet3, bitSet4, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_clear(bitSet8, bitSet9, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_clear(bitSet14, bitSet15, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_clear(bitSet19, bitSet20, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_clear(bitSet20, bitSet24, (int) (byte) -1, (int) (short) -1);
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet20, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_clear(bitSet32, bitSet33, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_clear(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_clear(bitSet43, bitSet44, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_clear(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_clear(bitSet54, bitSet55, 10, (int) (byte) -1);
        fuzzTest31.FuzzTest_clear(bitSet43, bitSet55, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_clear(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_clear(bitSet68, bitSet69, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet55, bitSet69, 0, (int) (short) 100);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_clear(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clear(bitSet7, bitSet8, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_clear(bitSet14, bitSet15, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_clear(bitSet19, bitSet20, 10, (int) (byte) -1);
        fuzzTest1.FuzzTest_clear(bitSet12, bitSet19, (int) '4', 100);
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest1.FuzzTest_clear(bitSet27, bitSet28, (int) (byte) 1, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_clear(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_clear(bitSet38, bitSet39, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet45 = null;
        c2s_aug_sub.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_clear(bitSet45, bitSet46, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_clear(bitSet50, bitSet51, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet56 = null;
        c2s_aug_sub.BitSet bitSet57 = null;
        fuzzTest55.FuzzTest_clear(bitSet56, bitSet57, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_clear(bitSet61, bitSet62, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_clear(bitSet62, bitSet66, (int) (byte) -1, (int) (short) -1);
        fuzzTest32.FuzzTest_clear(bitSet43, bitSet62, 1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet27, bitSet62, 1, (int) (short) 100);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet12 = null;
        fuzzTest0.FuzzTest_clear(bitSet11, bitSet12, (-1), (int) 'a');
        c2s_aug_sub.BitSet bitSet16 = null;
        c2s_aug_sub.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_clear(bitSet16, bitSet17, (-1), (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet22 = null;
        c2s_aug_sub.BitSet bitSet23 = null;
        fuzzTest21.FuzzTest_clear(bitSet22, bitSet23, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_clear(bitSet27, bitSet28, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet32 = null;
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_clear(bitSet32, bitSet33, (int) 'a', 1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_clear(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_clear(bitSet43, bitSet44, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_clear(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_clear(bitSet54, bitSet55, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet59 = null;
        fuzzTest37.FuzzTest_clear(bitSet55, bitSet59, (int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet33, bitSet55, 0, (int) '#');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_clear(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_clear(bitSet12, bitSet13, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_clear(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_clear(bitSet23, bitSet24, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet29 = null;
        c2s_aug_sub.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_clear(bitSet29, bitSet30, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet34 = null;
        c2s_aug_sub.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_clear(bitSet34, bitSet35, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet40 = null;
        c2s_aug_sub.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_clear(bitSet40, bitSet41, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_clear(bitSet45, bitSet46, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet51 = null;
        c2s_aug_sub.BitSet bitSet52 = null;
        fuzzTest50.FuzzTest_clear(bitSet51, bitSet52, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_clear(bitSet56, bitSet57, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet62 = null;
        c2s_aug_sub.BitSet bitSet63 = null;
        fuzzTest61.FuzzTest_clear(bitSet62, bitSet63, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet67 = null;
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_clear(bitSet67, bitSet68, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet73 = null;
        c2s_aug_sub.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_clear(bitSet73, bitSet74, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_clear(bitSet78, bitSet79, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_clear(bitSet79, bitSet83, (int) (byte) -1, (int) (short) -1);
        fuzzTest39.FuzzTest_clear(bitSet56, bitSet79, 0, (int) (short) 0);
        fuzzTest17.FuzzTest_clear(bitSet35, bitSet56, (int) (short) 100, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet13, bitSet56, 0, (int) 'a');
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet11 = null;
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet11, bitSet12, (int) 'a', 1);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = null;
        fuzzTest16.FuzzTest_clear(bitSet17, bitSet18, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_clear(bitSet22, bitSet23, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet27 = null;
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_clear(bitSet27, bitSet28, (int) 'a', 1);
        c2s_aug_sub.BitSet bitSet32 = null;
        fuzzTest0.FuzzTest_clear(bitSet28, bitSet32, (int) (short) 0, 0);
        c2s_aug_sub.BitSet bitSet36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_clear(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_clear(bitSet43, bitSet44, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_clear(bitSet36, bitSet43, (int) (byte) 1, 0);
        c2s_aug_sub.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_clear(bitSet54, bitSet55, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_clear(bitSet59, bitSet60, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest52.FuzzTest_clear(bitSet60, bitSet64, (int) (byte) 10, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet51, bitSet60, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 10, 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet7 = null;
        c2s_aug_sub.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_clear(bitSet7, bitSet8, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_clear(bitSet12, bitSet13, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet18 = null;
        c2s_aug_sub.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_clear(bitSet18, bitSet19, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_clear(bitSet23, bitSet24, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_clear(bitSet24, bitSet28, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_clear(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_clear(bitSet38, bitSet39, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet43 = null;
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_clear(bitSet43, bitSet44, (int) 'a', 1);
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet49 = null;
        fuzzTest32.FuzzTest_clear(bitSet48, bitSet49, (int) (short) 1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet24, bitSet48, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_clear(bitSet2, bitSet3, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_clear(bitSet8, bitSet9, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_clear(bitSet13, bitSet14, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = null;
        fuzzTest18.FuzzTest_clear(bitSet19, bitSet20, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_clear(bitSet24, bitSet25, 10, (int) (byte) -1);
        fuzzTest1.FuzzTest_clear(bitSet13, bitSet25, (int) '#', 10);
        c2s_aug_sub.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet25, bitSet32, (int) (short) 100, (int) 'a');
        c2s_aug_sub.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_clear(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_clear(bitSet43, bitSet44, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet49 = null;
        c2s_aug_sub.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_clear(bitSet49, bitSet50, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_clear(bitSet54, bitSet55, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet60 = null;
        c2s_aug_sub.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_clear(bitSet60, bitSet61, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet65 = null;
        c2s_aug_sub.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_clear(bitSet65, bitSet66, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet71 = null;
        c2s_aug_sub.BitSet bitSet72 = null;
        fuzzTest70.FuzzTest_clear(bitSet71, bitSet72, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_clear(bitSet76, bitSet77, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_clear(bitSet77, bitSet81, (int) (byte) -1, (int) (short) -1);
        fuzzTest37.FuzzTest_clear(bitSet54, bitSet77, 0, (int) (short) 0);
        c2s_aug_sub.BitSet bitSet88 = null;
        c2s_aug_sub.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_clear(bitSet88, bitSet89, 2, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet36, bitSet89, (int) (byte) 0, 10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet8 = null;
        c2s_aug_sub.BitSet bitSet9 = null;
        fuzzTest7.FuzzTest_clear(bitSet8, bitSet9, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet13 = null;
        c2s_aug_sub.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_clear(bitSet13, bitSet14, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet19 = null;
        c2s_aug_sub.BitSet bitSet20 = null;
        fuzzTest18.FuzzTest_clear(bitSet19, bitSet20, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet24 = null;
        c2s_aug_sub.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_clear(bitSet24, bitSet25, (int) '4', (int) '4');
        fuzzTest6.FuzzTest_clear(bitSet13, bitSet24, (int) ' ', (int) ' ');
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_clear(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_clear(bitSet38, bitSet39, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_clear(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_clear(bitSet49, bitSet50, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet54 = null;
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_clear(bitSet54, bitSet55, (int) 'a', 1);
        fuzzTest6.FuzzTest_clear(bitSet39, bitSet55, (int) (byte) 10, 2);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet63 = null;
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_clear(bitSet63, bitSet64, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_clear(bitSet68, bitSet69, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet75 = null;
        c2s_aug_sub.BitSet bitSet76 = null;
        fuzzTest74.FuzzTest_clear(bitSet75, bitSet76, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_clear(bitSet80, bitSet81, 10, (int) (byte) -1);
        fuzzTest62.FuzzTest_clear(bitSet73, bitSet80, (int) '4', 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet39, bitSet73, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet7 = null;
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) (byte) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_clear(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = null;
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_clear(bitSet28, bitSet29, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet28, bitSet33, 1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_clear(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_clear(bitSet43, bitSet44, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet48 = null;
        fuzzTest11.FuzzTest_clear(bitSet43, bitSet48, (int) ' ', 0);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet53 = null;
        c2s_aug_sub.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_clear(bitSet53, bitSet54, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_clear(bitSet58, bitSet59, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet64 = null;
        c2s_aug_sub.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_clear(bitSet64, bitSet65, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet69 = null;
        c2s_aug_sub.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_clear(bitSet69, bitSet70, (int) '4', (int) '4');
        c2s_aug_sub.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_clear(bitSet69, bitSet74, 1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet43, bitSet74, 1, (int) ' ');
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet2 = null;
        c2s_aug_sub.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_clear(bitSet2, bitSet3, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clear(bitSet7, bitSet8, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet14 = null;
        c2s_aug_sub.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_clear(bitSet14, bitSet15, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_clear(bitSet19, bitSet20, 10, (int) (byte) -1);
        fuzzTest1.FuzzTest_clear(bitSet12, bitSet19, (int) '4', 100);
        c2s_aug_sub.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet28 = null;
        fuzzTest1.FuzzTest_clear(bitSet27, bitSet28, (int) (byte) 1, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet33 = null;
        c2s_aug_sub.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_clear(bitSet33, bitSet34, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_clear(bitSet38, bitSet39, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet44 = null;
        c2s_aug_sub.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_clear(bitSet44, bitSet45, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_clear(bitSet49, bitSet50, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_clear(bitSet50, bitSet54, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet59 = null;
        c2s_aug_sub.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_clear(bitSet59, bitSet60, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_clear(bitSet64, bitSet65, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet71 = null;
        c2s_aug_sub.BitSet bitSet72 = null;
        fuzzTest70.FuzzTest_clear(bitSet71, bitSet72, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_clear(bitSet76, bitSet77, 10, (int) (byte) -1);
        fuzzTest58.FuzzTest_clear(bitSet69, bitSet76, (int) '4', 100);
        fuzzTest1.FuzzTest_clear(bitSet50, bitSet76, (int) (short) 10, 2);
        c2s_aug_sub.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet50, bitSet87, 1, (int) (short) 100);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet1 = null;
        c2s_aug_sub.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet6 = null;
        c2s_aug_sub.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet12 = null;
        c2s_aug_sub.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet17 = null;
        c2s_aug_sub.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet23 = null;
        c2s_aug_sub.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_clear(bitSet23, bitSet24, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_clear(bitSet28, bitSet29, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet29, bitSet33, (int) (byte) -1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet38 = null;
        c2s_aug_sub.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_clear(bitSet38, bitSet39, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_clear(bitSet43, bitSet44, 10, (int) (byte) -1);
        c2s_aug_sub.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.BitSet bitSet50 = null;
        c2s_aug_sub.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_clear(bitSet50, bitSet51, 0, (int) (byte) 0);
        c2s_aug_sub.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_clear(bitSet55, bitSet56, 10, (int) (byte) -1);
        fuzzTest37.FuzzTest_clear(bitSet48, bitSet55, (int) '4', 100);
        c2s_aug_sub.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.BitSet bitSet64 = null;
        fuzzTest37.FuzzTest_clear(bitSet63, bitSet64, (int) (byte) 1, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet29, bitSet63, (int) (byte) 0, (int) '#');
    }
}

