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
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet3 = null;
        buggycodes.mut_031.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_clear(bitSet3, bitSet4, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet8 = null;
        buggycodes.mut_031.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_clear(bitSet8, bitSet9, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet14 = null;
        buggycodes.mut_031.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_clear(bitSet14, bitSet15, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_clear(bitSet19, bitSet20, 10, (int) (byte) -1);
        fuzzTest1.FuzzTest_clear(bitSet9, bitSet20, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_031.BitSet bitSet27 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet9, bitSet27, (-1), 10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet1 = null;
        buggycodes.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet6 = null;
        buggycodes.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet13 = null;
        buggycodes.mut_031.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet18 = null;
        buggycodes.mut_031.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet24 = null;
        buggycodes.mut_031.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_clear(bitSet24, bitSet25, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_clear(bitSet29, bitSet30, 10, (int) (byte) -1);
        fuzzTest11.FuzzTest_clear(bitSet19, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet38 = null;
        buggycodes.mut_031.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_clear(bitSet38, bitSet39, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_clear(bitSet43, bitSet44, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet49 = null;
        buggycodes.mut_031.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_clear(bitSet49, bitSet50, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet54 = null;
        buggycodes.mut_031.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_clear(bitSet54, bitSet55, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet60 = null;
        buggycodes.mut_031.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_clear(bitSet60, bitSet61, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet65 = null;
        buggycodes.mut_031.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_clear(bitSet65, bitSet66, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet70 = null;
        fuzzTest48.FuzzTest_clear(bitSet66, bitSet70, (int) (short) -1, (int) (byte) 10);
        fuzzTest11.FuzzTest_clear(bitSet44, bitSet66, 2, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet78 = null;
        buggycodes.mut_031.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_clear(bitSet78, bitSet79, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet83 = null;
        buggycodes.mut_031.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_clear(bitSet83, bitSet84, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_clear(bitSet88, bitSet89, (int) (short) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet66, bitSet88, (-1), (int) (byte) 100);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet2 = null;
        buggycodes.mut_031.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_clear(bitSet2, bitSet3, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet7 = null;
        buggycodes.mut_031.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clear(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet13 = null;
        buggycodes.mut_031.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_clear(bitSet8, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet27 = null;
        buggycodes.mut_031.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_clear(bitSet27, bitSet28, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet32 = null;
        buggycodes.mut_031.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_clear(bitSet32, bitSet33, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet38 = null;
        buggycodes.mut_031.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_clear(bitSet38, bitSet39, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet43 = null;
        buggycodes.mut_031.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_clear(bitSet43, bitSet44, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet48 = null;
        fuzzTest26.FuzzTest_clear(bitSet44, bitSet48, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet53 = null;
        buggycodes.mut_031.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_clear(bitSet53, bitSet54, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet58 = null;
        buggycodes.mut_031.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_clear(bitSet58, bitSet59, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_clear(bitSet63, bitSet64, (int) (short) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_clear(bitSet48, bitSet64, (int) (short) -1, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet72 = null;
        buggycodes.mut_031.BitSet bitSet73 = null;
        fuzzTest71.FuzzTest_clear(bitSet72, bitSet73, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_clear(bitSet77, bitSet78, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet83 = null;
        buggycodes.mut_031.BitSet bitSet84 = null;
        fuzzTest82.FuzzTest_clear(bitSet83, bitSet84, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_clear(bitSet88, bitSet89, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet78, bitSet88, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet1 = null;
        buggycodes.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet6 = null;
        buggycodes.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet11, bitSet12, (int) (short) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet18 = null;
        buggycodes.mut_031.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_clear(bitSet18, bitSet19, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet23 = null;
        buggycodes.mut_031.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_clear(bitSet23, bitSet24, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet29 = null;
        buggycodes.mut_031.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_clear(bitSet29, bitSet30, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_clear(bitSet34, bitSet35, 10, (int) (byte) -1);
        fuzzTest16.FuzzTest_clear(bitSet24, bitSet35, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet43 = null;
        buggycodes.mut_031.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_clear(bitSet43, bitSet44, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet48 = null;
        buggycodes.mut_031.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_clear(bitSet48, bitSet49, (int) '4', (int) '4');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet24, bitSet49, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet1 = null;
        buggycodes.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet6 = null;
        buggycodes.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet11, bitSet12, (int) (short) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet17 = null;
        buggycodes.mut_031.BitSet bitSet18 = null;
        fuzzTest16.FuzzTest_clear(bitSet17, bitSet18, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet22 = null;
        buggycodes.mut_031.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_clear(bitSet22, bitSet23, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet28 = null;
        buggycodes.mut_031.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_clear(bitSet28, bitSet29, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet33 = null;
        buggycodes.mut_031.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_clear(bitSet33, bitSet34, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet38 = null;
        fuzzTest16.FuzzTest_clear(bitSet34, bitSet38, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_031.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet45 = null;
        buggycodes.mut_031.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_clear(bitSet45, bitSet46, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet50 = null;
        buggycodes.mut_031.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_clear(bitSet50, bitSet51, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet56 = null;
        buggycodes.mut_031.BitSet bitSet57 = null;
        fuzzTest55.FuzzTest_clear(bitSet56, bitSet57, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_clear(bitSet61, bitSet62, 10, (int) (byte) -1);
        fuzzTest43.FuzzTest_clear(bitSet51, bitSet62, (int) (byte) 1, (int) (short) 10);
        fuzzTest16.FuzzTest_clear(bitSet42, bitSet51, (int) (byte) 100, 0);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet73 = null;
        buggycodes.mut_031.BitSet bitSet74 = null;
        fuzzTest72.FuzzTest_clear(bitSet73, bitSet74, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_clear(bitSet78, bitSet79, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet42, bitSet78, (-1), 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet1 = null;
        buggycodes.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet6 = null;
        buggycodes.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet11, bitSet12, (int) (short) 1, (int) (short) 10);
        buggycodes.mut_031.BitSet bitSet16 = null;
        buggycodes.mut_031.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_clear(bitSet16, bitSet17, 2, (int) '4');
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet22 = null;
        buggycodes.mut_031.BitSet bitSet23 = null;
        fuzzTest21.FuzzTest_clear(bitSet22, bitSet23, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet27 = null;
        buggycodes.mut_031.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_clear(bitSet27, bitSet28, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_clear(bitSet32, bitSet33, (int) (short) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet39 = null;
        buggycodes.mut_031.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_clear(bitSet39, bitSet40, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet44 = null;
        buggycodes.mut_031.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_clear(bitSet44, bitSet45, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet50 = null;
        buggycodes.mut_031.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_clear(bitSet50, bitSet51, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_clear(bitSet55, bitSet56, 10, (int) (byte) -1);
        fuzzTest37.FuzzTest_clear(bitSet45, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet64 = null;
        buggycodes.mut_031.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_clear(bitSet64, bitSet65, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet69 = null;
        buggycodes.mut_031.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_clear(bitSet69, bitSet70, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet75 = null;
        buggycodes.mut_031.BitSet bitSet76 = null;
        fuzzTest74.FuzzTest_clear(bitSet75, bitSet76, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet80 = null;
        buggycodes.mut_031.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_clear(bitSet80, bitSet81, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet85 = null;
        fuzzTest63.FuzzTest_clear(bitSet81, bitSet85, (int) (short) -1, (int) (byte) 10);
        fuzzTest21.FuzzTest_clear(bitSet56, bitSet85, (int) '#', (int) (short) 10);
        buggycodes.mut_031.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet56, bitSet92, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet2 = null;
        buggycodes.mut_031.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_clear(bitSet2, bitSet3, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet7 = null;
        buggycodes.mut_031.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clear(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet13 = null;
        buggycodes.mut_031.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet18 = null;
        buggycodes.mut_031.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet23, bitSet24, (int) (short) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet30 = null;
        buggycodes.mut_031.BitSet bitSet31 = null;
        fuzzTest29.FuzzTest_clear(bitSet30, bitSet31, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_clear(bitSet35, bitSet36, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet41 = null;
        buggycodes.mut_031.BitSet bitSet42 = null;
        fuzzTest40.FuzzTest_clear(bitSet41, bitSet42, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet46 = null;
        buggycodes.mut_031.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_clear(bitSet46, bitSet47, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet52 = null;
        buggycodes.mut_031.BitSet bitSet53 = null;
        fuzzTest51.FuzzTest_clear(bitSet52, bitSet53, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet57 = null;
        buggycodes.mut_031.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_clear(bitSet57, bitSet58, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet62 = null;
        fuzzTest40.FuzzTest_clear(bitSet58, bitSet62, (int) (short) -1, (int) (byte) 10);
        fuzzTest28.FuzzTest_clear(bitSet36, bitSet58, 1, (int) 'a');
        buggycodes.mut_031.BitSet bitSet69 = null;
        fuzzTest12.FuzzTest_clear(bitSet58, bitSet69, 10, (int) (byte) 100);
        fuzzTest0.FuzzTest_clear(bitSet7, bitSet69, 0, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet77 = null;
        buggycodes.mut_031.BitSet bitSet78 = null;
        fuzzTest76.FuzzTest_clear(bitSet77, bitSet78, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_clear(bitSet82, bitSet83, 10, (int) (byte) -1);
        buggycodes.mut_031.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet82, bitSet87, (-1), 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet1 = null;
        buggycodes.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet6 = null;
        buggycodes.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet14 = null;
        buggycodes.mut_031.BitSet bitSet15 = null;
        fuzzTest13.FuzzTest_clear(bitSet14, bitSet15, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet19 = null;
        buggycodes.mut_031.BitSet bitSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_clear(bitSet19, bitSet20, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet25 = null;
        buggycodes.mut_031.BitSet bitSet26 = null;
        fuzzTest24.FuzzTest_clear(bitSet25, bitSet26, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_clear(bitSet30, bitSet31, 10, (int) (byte) -1);
        fuzzTest12.FuzzTest_clear(bitSet20, bitSet31, (int) (byte) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_clear(bitSet11, bitSet20, (int) (byte) -1, 100);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet43 = null;
        buggycodes.mut_031.BitSet bitSet44 = null;
        fuzzTest42.FuzzTest_clear(bitSet43, bitSet44, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet48 = null;
        buggycodes.mut_031.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_clear(bitSet48, bitSet49, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet54 = null;
        buggycodes.mut_031.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_clear(bitSet54, bitSet55, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_clear(bitSet59, bitSet60, 10, (int) (byte) -1);
        fuzzTest41.FuzzTest_clear(bitSet49, bitSet60, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet68 = null;
        buggycodes.mut_031.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_clear(bitSet68, bitSet69, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet73 = null;
        buggycodes.mut_031.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_clear(bitSet73, bitSet74, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet79 = null;
        buggycodes.mut_031.BitSet bitSet80 = null;
        fuzzTest78.FuzzTest_clear(bitSet79, bitSet80, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_clear(bitSet84, bitSet85, 10, (int) (byte) -1);
        fuzzTest41.FuzzTest_clear(bitSet74, bitSet84, 0, 100);
        buggycodes.mut_031.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet74, bitSet92, (-1), 10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet1 = null;
        buggycodes.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet9 = null;
        buggycodes.mut_031.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_clear(bitSet9, bitSet10, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet14 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_clear(bitSet14, bitSet15, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet20 = null;
        buggycodes.mut_031.BitSet bitSet21 = null;
        fuzzTest19.FuzzTest_clear(bitSet20, bitSet21, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet26 = null;
        buggycodes.mut_031.BitSet bitSet27 = null;
        fuzzTest25.FuzzTest_clear(bitSet26, bitSet27, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet31 = null;
        buggycodes.mut_031.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_clear(bitSet31, bitSet32, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet37 = null;
        buggycodes.mut_031.BitSet bitSet38 = null;
        fuzzTest36.FuzzTest_clear(bitSet37, bitSet38, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_clear(bitSet42, bitSet43, 10, (int) (byte) -1);
        fuzzTest19.FuzzTest_clear(bitSet31, bitSet43, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet52 = null;
        buggycodes.mut_031.BitSet bitSet53 = null;
        fuzzTest51.FuzzTest_clear(bitSet52, bitSet53, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet57 = null;
        buggycodes.mut_031.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_clear(bitSet57, bitSet58, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet63 = null;
        buggycodes.mut_031.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_clear(bitSet63, bitSet64, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet68 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_clear(bitSet68, bitSet69, 10, (int) (byte) -1);
        fuzzTest50.FuzzTest_clear(bitSet58, bitSet69, (int) (byte) 1, (int) (short) 10);
        fuzzTest8.FuzzTest_clear(bitSet43, bitSet58, (int) (byte) 100, (int) (byte) 10);
        fuzzTest6.FuzzTest_clear(bitSet7, bitSet43, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet83 = null;
        buggycodes.mut_031.BitSet bitSet84 = null;
        fuzzTest82.FuzzTest_clear(bitSet83, bitSet84, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_clear(bitSet88, bitSet89, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet7, bitSet88, (-1), (int) (short) 100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet2 = null;
        buggycodes.mut_031.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_clear(bitSet2, bitSet3, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet7 = null;
        buggycodes.mut_031.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clear(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet13 = null;
        buggycodes.mut_031.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_clear(bitSet8, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet28 = null;
        buggycodes.mut_031.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_clear(bitSet28, bitSet29, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet33 = null;
        buggycodes.mut_031.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_clear(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet39 = null;
        buggycodes.mut_031.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_clear(bitSet39, bitSet40, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_clear(bitSet44, bitSet45, 10, (int) (byte) -1);
        fuzzTest26.FuzzTest_clear(bitSet34, bitSet45, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet54 = null;
        buggycodes.mut_031.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_clear(bitSet54, bitSet55, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet59 = null;
        buggycodes.mut_031.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_clear(bitSet59, bitSet60, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet65 = null;
        buggycodes.mut_031.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_clear(bitSet65, bitSet66, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_clear(bitSet70, bitSet71, 10, (int) (byte) -1);
        fuzzTest52.FuzzTest_clear(bitSet60, bitSet71, (int) (byte) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet34, bitSet71, (-1), 10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet2 = null;
        buggycodes.mut_031.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_clear(bitSet2, bitSet3, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet7 = null;
        buggycodes.mut_031.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clear(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet13 = null;
        buggycodes.mut_031.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_clear(bitSet8, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet27 = null;
        buggycodes.mut_031.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_clear(bitSet27, bitSet28, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet32 = null;
        buggycodes.mut_031.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_clear(bitSet32, bitSet33, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet38 = null;
        buggycodes.mut_031.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_clear(bitSet38, bitSet39, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet43 = null;
        buggycodes.mut_031.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_clear(bitSet43, bitSet44, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet48 = null;
        fuzzTest26.FuzzTest_clear(bitSet44, bitSet48, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_031.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet44, bitSet52, (int) (byte) 100, (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet57 = null;
        buggycodes.mut_031.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_clear(bitSet57, bitSet58, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_clear(bitSet62, bitSet63, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet68 = null;
        buggycodes.mut_031.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_clear(bitSet68, bitSet69, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_clear(bitSet73, bitSet74, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet62, bitSet73, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet1 = null;
        buggycodes.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet12 = null;
        buggycodes.mut_031.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet17 = null;
        buggycodes.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet22, bitSet23, (int) (short) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet28 = null;
        buggycodes.mut_031.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_clear(bitSet28, bitSet29, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet33 = null;
        buggycodes.mut_031.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_clear(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzzTest0.FuzzTest_clear(bitSet23, bitSet33, (int) 'a', (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet41 = null;
        buggycodes.mut_031.BitSet bitSet42 = null;
        fuzzTest0.FuzzTest_clear(bitSet41, bitSet42, (int) (byte) 0, 10);
        buggycodes.mut_031.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet49 = null;
        buggycodes.mut_031.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_clear(bitSet49, bitSet50, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_clear(bitSet54, bitSet55, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet60 = null;
        buggycodes.mut_031.BitSet bitSet61 = null;
        fuzzTest59.FuzzTest_clear(bitSet60, bitSet61, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet65 = null;
        buggycodes.mut_031.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_clear(bitSet65, bitSet66, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet71 = null;
        buggycodes.mut_031.BitSet bitSet72 = null;
        fuzzTest70.FuzzTest_clear(bitSet71, bitSet72, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet76 = null;
        buggycodes.mut_031.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_clear(bitSet76, bitSet77, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet81 = null;
        fuzzTest59.FuzzTest_clear(bitSet77, bitSet81, (int) (short) -1, (int) (byte) 10);
        fuzzTest47.FuzzTest_clear(bitSet55, bitSet77, 1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet46, bitSet77, (-1), (int) (short) 100);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet1 = null;
        buggycodes.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet6 = null;
        buggycodes.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet13 = null;
        buggycodes.mut_031.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet18 = null;
        buggycodes.mut_031.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet24 = null;
        buggycodes.mut_031.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_clear(bitSet24, bitSet25, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet29 = null;
        buggycodes.mut_031.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_clear(bitSet29, bitSet30, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet34 = null;
        fuzzTest12.FuzzTest_clear(bitSet30, bitSet34, (int) (short) -1, (int) (byte) 10);
        buggycodes.mut_031.BitSet bitSet38 = null;
        buggycodes.mut_031.BitSet bitSet39 = null;
        fuzzTest12.FuzzTest_clear(bitSet38, bitSet39, (int) (byte) 100, 100);
        buggycodes.mut_031.BitSet bitSet43 = null;
        buggycodes.mut_031.BitSet bitSet44 = null;
        fuzzTest12.FuzzTest_clear(bitSet43, bitSet44, 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet49 = null;
        buggycodes.mut_031.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_clear(bitSet49, bitSet50, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet54 = null;
        buggycodes.mut_031.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_clear(bitSet54, bitSet55, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet59 = null;
        fuzzTest12.FuzzTest_clear(bitSet54, bitSet59, (int) (short) 100, 1);
        buggycodes.mut_031.BitSet bitSet63 = null;
        buggycodes.mut_031.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet63, bitSet64, (int) '4', (int) '4');
        fuzzTest0.FuzzTest_clear(bitSet11, bitSet64, (int) 'a', 0);
        buggycodes.mut_031.BitSet bitSet71 = null;
        buggycodes.mut_031.BitSet bitSet72 = null;
        fuzzTest0.FuzzTest_clear(bitSet71, bitSet72, (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet77 = null;
        buggycodes.mut_031.BitSet bitSet78 = null;
        fuzzTest76.FuzzTest_clear(bitSet77, bitSet78, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_clear(bitSet82, bitSet83, 10, (int) (byte) -1);
        buggycodes.mut_031.BitSet bitSet87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet82, bitSet87, (-1), 100);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet1 = null;
        buggycodes.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet6 = null;
        buggycodes.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet11 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet11, bitSet12, (int) (short) 1, (int) (short) 10);
        buggycodes.mut_031.BitSet bitSet16 = null;
        buggycodes.mut_031.BitSet bitSet17 = null;
        fuzzTest0.FuzzTest_clear(bitSet16, bitSet17, 10, (int) (short) 0);
        buggycodes.mut_031.BitSet bitSet21 = null;
        buggycodes.mut_031.BitSet bitSet22 = null;
        fuzzTest0.FuzzTest_clear(bitSet21, bitSet22, 10, (int) '4');
        buggycodes.mut_031.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet27 = null;
        fuzzTest0.FuzzTest_clear(bitSet26, bitSet27, (int) (byte) 0, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet33 = null;
        buggycodes.mut_031.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_clear(bitSet33, bitSet34, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_clear(bitSet38, bitSet39, 10, (int) (byte) -1);
        buggycodes.mut_031.BitSet bitSet43 = null;
        fuzzTest31.FuzzTest_clear(bitSet39, bitSet43, 0, (int) (short) 100);
        buggycodes.mut_031.BitSet bitSet47 = null;
        buggycodes.mut_031.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_clear(bitSet47, bitSet48, (int) '#', (int) (short) 100);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet53 = null;
        buggycodes.mut_031.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_clear(bitSet53, bitSet54, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet58 = null;
        buggycodes.mut_031.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_clear(bitSet58, bitSet59, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_clear(bitSet63, bitSet64, (int) (short) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet48, bitSet64, (int) (byte) -1, 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet2 = null;
        buggycodes.mut_031.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_clear(bitSet2, bitSet3, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet7 = null;
        buggycodes.mut_031.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clear(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet13 = null;
        buggycodes.mut_031.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_clear(bitSet8, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet27 = null;
        buggycodes.mut_031.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_clear(bitSet27, bitSet28, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet33 = null;
        buggycodes.mut_031.BitSet bitSet34 = null;
        fuzzTest32.FuzzTest_clear(bitSet33, bitSet34, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet38 = null;
        buggycodes.mut_031.BitSet bitSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_clear(bitSet38, bitSet39, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet44 = null;
        buggycodes.mut_031.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_clear(bitSet44, bitSet45, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_clear(bitSet49, bitSet50, 10, (int) (byte) -1);
        fuzzTest26.FuzzTest_clear(bitSet38, bitSet50, (int) '#', 10);
        buggycodes.mut_031.BitSet bitSet57 = null;
        fuzzTest0.FuzzTest_clear(bitSet50, bitSet57, (int) (byte) 10, (int) (byte) 1);
        buggycodes.mut_031.BitSet bitSet61 = null;
        buggycodes.mut_031.BitSet bitSet62 = null;
        fuzzTest0.FuzzTest_clear(bitSet61, bitSet62, (int) (short) 0, 0);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet67 = null;
        buggycodes.mut_031.BitSet bitSet68 = null;
        fuzzTest66.FuzzTest_clear(bitSet67, bitSet68, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet72 = null;
        buggycodes.mut_031.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_clear(bitSet72, bitSet73, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_clear(bitSet77, bitSet78, (int) (short) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet83 = null;
        buggycodes.mut_031.BitSet bitSet84 = null;
        fuzzTest82.FuzzTest_clear(bitSet83, bitSet84, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_clear(bitSet88, bitSet89, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet78, bitSet88, (-1), (int) (short) 10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet1 = null;
        buggycodes.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet6 = null;
        buggycodes.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet12 = null;
        buggycodes.mut_031.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet17 = null;
        buggycodes.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet22 = null;
        fuzzTest0.FuzzTest_clear(bitSet18, bitSet22, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet27 = null;
        buggycodes.mut_031.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_clear(bitSet27, bitSet28, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_clear(bitSet32, bitSet33, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet38 = null;
        buggycodes.mut_031.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_clear(bitSet38, bitSet39, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet43 = null;
        buggycodes.mut_031.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_clear(bitSet43, bitSet44, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_clear(bitSet48, bitSet49, (int) (short) 1, (int) (short) 10);
        fuzzTest0.FuzzTest_clear(bitSet32, bitSet48, (int) (byte) 0, 10);
        buggycodes.mut_031.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet58 = null;
        buggycodes.mut_031.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_clear(bitSet58, bitSet59, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_clear(bitSet63, bitSet64, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_clear(bitSet56, bitSet63, (int) (short) 100, (-1));
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet72 = null;
        buggycodes.mut_031.BitSet bitSet73 = null;
        fuzzTest71.FuzzTest_clear(bitSet72, bitSet73, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet77 = null;
        buggycodes.mut_031.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_clear(bitSet77, bitSet78, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet78, bitSet82, (int) (short) -1, (int) '#');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet1 = null;
        buggycodes.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, 10, (int) (byte) -1);
        buggycodes.mut_031.BitSet bitSet11 = null;
        buggycodes.mut_031.BitSet bitSet12 = null;
        fuzzTest0.FuzzTest_clear(bitSet11, bitSet12, (int) (short) 0, 100);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet18 = null;
        buggycodes.mut_031.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_clear(bitSet18, bitSet19, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet23 = null;
        buggycodes.mut_031.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_clear(bitSet23, bitSet24, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet29 = null;
        buggycodes.mut_031.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_clear(bitSet29, bitSet30, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_clear(bitSet34, bitSet35, 10, (int) (byte) -1);
        fuzzTest16.FuzzTest_clear(bitSet24, bitSet35, (int) (byte) 1, (int) (short) 10);
        buggycodes.mut_031.BitSet bitSet42 = null;
        fuzzTest0.FuzzTest_clear(bitSet24, bitSet42, (int) '#', 10);
        buggycodes.mut_031.BitSet bitSet46 = null;
        buggycodes.mut_031.BitSet bitSet47 = null;
        fuzzTest0.FuzzTest_clear(bitSet46, bitSet47, 0, (int) (short) 1);
        buggycodes.mut_031.BitSet bitSet51 = null;
        buggycodes.mut_031.BitSet bitSet52 = null;
        fuzzTest0.FuzzTest_clear(bitSet51, bitSet52, (int) '4', (int) 'a');
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet57 = null;
        buggycodes.mut_031.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_clear(bitSet57, bitSet58, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_clear(bitSet62, bitSet63, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggycodes.mut_031.BitSet bitSet68 = null;
        buggycodes.mut_031.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_clear(bitSet68, bitSet69, 0, (int) (byte) 0);
        buggycodes.mut_031.BitSet bitSet73 = null;
        buggycodes.mut_031.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_clear(bitSet73, bitSet74, (int) '4', (int) '4');
        buggycodes.mut_031.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_031.BitSet bitSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_clear(bitSet78, bitSet79, (int) (short) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet62, bitSet78, (int) (short) -1, (int) (short) 1);
    }
}

