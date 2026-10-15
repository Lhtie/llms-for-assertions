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
        buggyasrts.mut_031.BitSet bitSet1 = null;
        buggyasrts.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet7 = null;
        buggyasrts.mut_031.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_clear(bitSet7, bitSet8, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet12 = null;
        buggyasrts.mut_031.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_clear(bitSet12, bitSet13, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet18 = null;
        buggyasrts.mut_031.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_clear(bitSet18, bitSet19, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_clear(bitSet23, bitSet24, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_clear(bitSet12, bitSet24, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet32 = null;
        buggyasrts.mut_031.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_clear(bitSet32, bitSet33, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet38 = null;
        buggyasrts.mut_031.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_clear(bitSet38, bitSet39, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet43 = null;
        buggyasrts.mut_031.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_clear(bitSet43, bitSet44, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet49 = null;
        buggyasrts.mut_031.BitSet bitSet50 = null;
        fuzzTest48.FuzzTest_clear(bitSet49, bitSet50, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet54 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_clear(bitSet54, bitSet55, 10, (int) (byte) -1);
        fuzzTest31.FuzzTest_clear(bitSet43, bitSet55, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet63 = null;
        buggyasrts.mut_031.BitSet bitSet64 = null;
        fuzzTest62.FuzzTest_clear(bitSet63, bitSet64, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet68 = null;
        buggyasrts.mut_031.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_clear(bitSet68, bitSet69, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet74 = null;
        buggyasrts.mut_031.BitSet bitSet75 = null;
        fuzzTest73.FuzzTest_clear(bitSet74, bitSet75, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet79 = null;
        buggyasrts.mut_031.BitSet bitSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_clear(bitSet79, bitSet80, (int) '4', (int) '4');
        buggyasrts.mut_031.BitSet bitSet84 = null;
        fuzzTest62.FuzzTest_clear(bitSet80, bitSet84, (int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet55, bitSet80, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet1 = null;
        buggyasrts.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet6 = null;
        buggyasrts.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet12 = null;
        buggyasrts.mut_031.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet17 = null;
        buggyasrts.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet23 = null;
        buggyasrts.mut_031.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_clear(bitSet23, bitSet24, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet29 = null;
        buggyasrts.mut_031.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_clear(bitSet29, bitSet30, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet34 = null;
        buggyasrts.mut_031.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_clear(bitSet34, bitSet35, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet40 = null;
        buggyasrts.mut_031.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_clear(bitSet40, bitSet41, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_clear(bitSet45, bitSet46, 10, (int) (byte) -1);
        fuzzTest22.FuzzTest_clear(bitSet34, bitSet46, (int) '#', 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet18, bitSet46, 2, (int) (short) 10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet1 = null;
        buggyasrts.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet12 = null;
        buggyasrts.mut_031.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet23 = null;
        buggyasrts.mut_031.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_clear(bitSet23, bitSet24, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet28 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_clear(bitSet28, bitSet29, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet34 = null;
        buggyasrts.mut_031.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_clear(bitSet34, bitSet35, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet39 = null;
        buggyasrts.mut_031.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_clear(bitSet39, bitSet40, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet45 = null;
        buggyasrts.mut_031.BitSet bitSet46 = null;
        fuzzTest44.FuzzTest_clear(bitSet45, bitSet46, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet50 = null;
        buggyasrts.mut_031.BitSet bitSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_clear(bitSet50, bitSet51, (int) '4', (int) '4');
        fuzzTest22.FuzzTest_clear(bitSet40, bitSet50, 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet18, bitSet40, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet1 = null;
        buggyasrts.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet12 = null;
        buggyasrts.mut_031.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet17 = null;
        buggyasrts.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet23 = null;
        buggyasrts.mut_031.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_clear(bitSet23, bitSet24, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet28 = null;
        buggyasrts.mut_031.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_clear(bitSet28, bitSet29, (int) '4', (int) '4');
        fuzzTest0.FuzzTest_clear(bitSet18, bitSet28, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet37 = null;
        buggyasrts.mut_031.BitSet bitSet38 = null;
        fuzzTest36.FuzzTest_clear(bitSet37, bitSet38, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet42 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_clear(bitSet42, bitSet43, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet48 = null;
        buggyasrts.mut_031.BitSet bitSet49 = null;
        fuzzTest47.FuzzTest_clear(bitSet48, bitSet49, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet54 = null;
        buggyasrts.mut_031.BitSet bitSet55 = null;
        fuzzTest53.FuzzTest_clear(bitSet54, bitSet55, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet59 = null;
        buggyasrts.mut_031.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_clear(bitSet59, bitSet60, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet65 = null;
        buggyasrts.mut_031.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_clear(bitSet65, bitSet66, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_clear(bitSet70, bitSet71, 10, (int) (byte) -1);
        fuzzTest47.FuzzTest_clear(bitSet59, bitSet71, (int) '#', 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet42, bitSet71, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet1 = null;
        buggyasrts.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet7 = null;
        buggyasrts.mut_031.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_clear(bitSet7, bitSet8, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet12 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_clear(bitSet12, bitSet13, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet18 = null;
        buggyasrts.mut_031.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_clear(bitSet18, bitSet19, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet23 = null;
        buggyasrts.mut_031.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_clear(bitSet23, bitSet24, (int) '4', (int) '4');
        fuzzTest0.FuzzTest_clear(bitSet13, bitSet23, (int) '4', 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet32 = null;
        buggyasrts.mut_031.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_clear(bitSet32, bitSet33, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet39 = null;
        buggyasrts.mut_031.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_clear(bitSet39, bitSet40, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet44 = null;
        buggyasrts.mut_031.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_clear(bitSet44, bitSet45, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet50 = null;
        buggyasrts.mut_031.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_clear(bitSet50, bitSet51, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_clear(bitSet55, bitSet56, 10, (int) (byte) -1);
        fuzzTest37.FuzzTest_clear(bitSet45, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet64 = null;
        buggyasrts.mut_031.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_clear(bitSet64, bitSet65, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet69 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_clear(bitSet69, bitSet70, 10, (int) (byte) -1);
        fuzzTest31.FuzzTest_clear(bitSet45, bitSet70, 100, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet78 = null;
        buggyasrts.mut_031.BitSet bitSet79 = null;
        fuzzTest77.FuzzTest_clear(bitSet78, bitSet79, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet83 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_clear(bitSet83, bitSet84, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet45, bitSet84, (int) (short) -1, 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet1 = null;
        buggyasrts.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet12 = null;
        buggyasrts.mut_031.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet17 = null;
        buggyasrts.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet23 = null;
        buggyasrts.mut_031.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_clear(bitSet23, bitSet24, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet29 = null;
        buggyasrts.mut_031.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_clear(bitSet29, bitSet30, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_clear(bitSet34, bitSet35, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet40 = null;
        buggyasrts.mut_031.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_clear(bitSet40, bitSet41, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_clear(bitSet45, bitSet46, 10, (int) (byte) -1);
        fuzzTest22.FuzzTest_clear(bitSet35, bitSet46, 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet18, bitSet46, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet1 = null;
        buggyasrts.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet6 = null;
        buggyasrts.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet12 = null;
        buggyasrts.mut_031.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet17 = null;
        buggyasrts.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, (int) '4', (int) '4');
        buggyasrts.mut_031.BitSet bitSet22 = null;
        fuzzTest0.FuzzTest_clear(bitSet18, bitSet22, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet28 = null;
        buggyasrts.mut_031.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_clear(bitSet28, bitSet29, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet33 = null;
        buggyasrts.mut_031.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_clear(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet39 = null;
        buggyasrts.mut_031.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_clear(bitSet39, bitSet40, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_clear(bitSet44, bitSet45, 10, (int) (byte) -1);
        fuzzTest26.FuzzTest_clear(bitSet34, bitSet45, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet53 = null;
        buggyasrts.mut_031.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_clear(bitSet53, bitSet54, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet58 = null;
        buggyasrts.mut_031.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_clear(bitSet58, bitSet59, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet64 = null;
        buggyasrts.mut_031.BitSet bitSet65 = null;
        fuzzTest63.FuzzTest_clear(bitSet64, bitSet65, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet69 = null;
        buggyasrts.mut_031.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_clear(bitSet69, bitSet70, (int) '4', (int) '4');
        buggyasrts.mut_031.BitSet bitSet74 = null;
        fuzzTest52.FuzzTest_clear(bitSet70, bitSet74, (int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet45, bitSet70, (int) (short) -1, 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet3 = null;
        buggyasrts.mut_031.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_clear(bitSet3, bitSet4, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet8 = null;
        buggyasrts.mut_031.BitSet bitSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_clear(bitSet8, bitSet9, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet15 = null;
        buggyasrts.mut_031.BitSet bitSet16 = null;
        fuzzTest14.FuzzTest_clear(bitSet15, bitSet16, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet20 = null;
        buggyasrts.mut_031.BitSet bitSet21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_clear(bitSet20, bitSet21, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet26 = null;
        buggyasrts.mut_031.BitSet bitSet27 = null;
        fuzzTest25.FuzzTest_clear(bitSet26, bitSet27, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet31 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_clear(bitSet31, bitSet32, 10, (int) (byte) -1);
        fuzzTest13.FuzzTest_clear(bitSet21, bitSet32, (int) (byte) 1, (int) (short) 10);
        fuzzTest1.FuzzTest_clear(bitSet8, bitSet21, (int) ' ', (int) ' ');
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet44 = null;
        buggyasrts.mut_031.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_clear(bitSet44, bitSet45, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet49 = null;
        buggyasrts.mut_031.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_clear(bitSet49, bitSet50, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet55 = null;
        buggyasrts.mut_031.BitSet bitSet56 = null;
        fuzzTest54.FuzzTest_clear(bitSet55, bitSet56, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_clear(bitSet60, bitSet61, 10, (int) (byte) -1);
        fuzzTest42.FuzzTest_clear(bitSet50, bitSet61, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet69 = null;
        buggyasrts.mut_031.BitSet bitSet70 = null;
        fuzzTest68.FuzzTest_clear(bitSet69, bitSet70, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_clear(bitSet74, bitSet75, 10, (int) (byte) -1);
        fuzzTest1.FuzzTest_clear(bitSet61, bitSet75, (int) (byte) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet83 = null;
        buggyasrts.mut_031.BitSet bitSet84 = null;
        fuzzTest82.FuzzTest_clear(bitSet83, bitSet84, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet88 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_clear(bitSet88, bitSet89, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet61, bitSet88, 10, 100);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet2 = null;
        buggyasrts.mut_031.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_clear(bitSet2, bitSet3, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet7 = null;
        buggyasrts.mut_031.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clear(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet13 = null;
        buggyasrts.mut_031.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_clear(bitSet8, bitSet19, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet28 = null;
        buggyasrts.mut_031.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_clear(bitSet28, bitSet29, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet33 = null;
        buggyasrts.mut_031.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_clear(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet39 = null;
        buggyasrts.mut_031.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_clear(bitSet39, bitSet40, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_clear(bitSet44, bitSet45, 10, (int) (byte) -1);
        fuzzTest26.FuzzTest_clear(bitSet34, bitSet45, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet53 = null;
        buggyasrts.mut_031.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_clear(bitSet53, bitSet54, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet59 = null;
        buggyasrts.mut_031.BitSet bitSet60 = null;
        fuzzTest58.FuzzTest_clear(bitSet59, bitSet60, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_clear(bitSet64, bitSet65, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet70 = null;
        buggyasrts.mut_031.BitSet bitSet71 = null;
        fuzzTest69.FuzzTest_clear(bitSet70, bitSet71, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet75 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_clear(bitSet75, bitSet76, 10, (int) (byte) -1);
        fuzzTest52.FuzzTest_clear(bitSet65, bitSet76, 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet34, bitSet65, (-1), 100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet1 = null;
        buggyasrts.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet6 = null;
        buggyasrts.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet13 = null;
        buggyasrts.mut_031.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet18 = null;
        buggyasrts.mut_031.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet24 = null;
        buggyasrts.mut_031.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_clear(bitSet24, bitSet25, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_clear(bitSet29, bitSet30, 10, (int) (byte) -1);
        fuzzTest11.FuzzTest_clear(bitSet19, bitSet30, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet39 = null;
        buggyasrts.mut_031.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_clear(bitSet39, bitSet40, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet44 = null;
        buggyasrts.mut_031.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_clear(bitSet44, bitSet45, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet50 = null;
        buggyasrts.mut_031.BitSet bitSet51 = null;
        fuzzTest49.FuzzTest_clear(bitSet50, bitSet51, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet55 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_clear(bitSet55, bitSet56, 10, (int) (byte) -1);
        fuzzTest37.FuzzTest_clear(bitSet45, bitSet56, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet65 = null;
        buggyasrts.mut_031.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_clear(bitSet65, bitSet66, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet70 = null;
        buggyasrts.mut_031.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_clear(bitSet70, bitSet71, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet76 = null;
        buggyasrts.mut_031.BitSet bitSet77 = null;
        fuzzTest75.FuzzTest_clear(bitSet76, bitSet77, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_clear(bitSet81, bitSet82, 10, (int) (byte) -1);
        fuzzTest63.FuzzTest_clear(bitSet71, bitSet82, (int) (byte) 1, (int) (short) 10);
        fuzzTest11.FuzzTest_clear(bitSet45, bitSet71, 0, (int) ' ');
        buggyasrts.mut_031.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet71, bitSet92, (int) ' ', 100);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet1 = null;
        buggyasrts.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet7 = null;
        buggyasrts.mut_031.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_clear(bitSet7, bitSet8, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet13 = null;
        buggyasrts.mut_031.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet24 = null;
        buggyasrts.mut_031.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_clear(bitSet24, bitSet25, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_clear(bitSet29, bitSet30, 10, (int) (byte) -1);
        fuzzTest6.FuzzTest_clear(bitSet19, bitSet30, 0, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet38 = null;
        buggyasrts.mut_031.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_clear(bitSet38, bitSet39, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet44 = null;
        buggyasrts.mut_031.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_clear(bitSet44, bitSet45, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_clear(bitSet49, bitSet50, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet55 = null;
        buggyasrts.mut_031.BitSet bitSet56 = null;
        fuzzTest54.FuzzTest_clear(bitSet55, bitSet56, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet60 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_clear(bitSet60, bitSet61, 10, (int) (byte) -1);
        fuzzTest37.FuzzTest_clear(bitSet50, bitSet61, 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet19, bitSet61, (int) (short) -1, (int) '4');
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet1 = null;
        buggyasrts.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet6 = null;
        buggyasrts.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet12 = null;
        buggyasrts.mut_031.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet17 = null;
        buggyasrts.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, (int) '4', (int) '4');
        buggyasrts.mut_031.BitSet bitSet22 = null;
        fuzzTest0.FuzzTest_clear(bitSet18, bitSet22, (int) (short) -1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet28 = null;
        buggyasrts.mut_031.BitSet bitSet29 = null;
        fuzzTest27.FuzzTest_clear(bitSet28, bitSet29, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet33 = null;
        buggyasrts.mut_031.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_clear(bitSet33, bitSet34, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet39 = null;
        buggyasrts.mut_031.BitSet bitSet40 = null;
        fuzzTest38.FuzzTest_clear(bitSet39, bitSet40, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_clear(bitSet44, bitSet45, 10, (int) (byte) -1);
        fuzzTest26.FuzzTest_clear(bitSet34, bitSet45, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet53 = null;
        buggyasrts.mut_031.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_clear(bitSet53, bitSet54, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_clear(bitSet58, bitSet59, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_clear(bitSet34, bitSet59, (int) (byte) 100, (int) (byte) 100);
        buggyasrts.mut_031.BitSet bitSet66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet68 = null;
        buggyasrts.mut_031.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_clear(bitSet68, bitSet69, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet73 = null;
        buggyasrts.mut_031.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_clear(bitSet73, bitSet74, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet79 = null;
        buggyasrts.mut_031.BitSet bitSet80 = null;
        fuzzTest78.FuzzTest_clear(bitSet79, bitSet80, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet84 = null;
        buggyasrts.mut_031.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_clear(bitSet84, bitSet85, (int) '4', (int) '4');
        buggyasrts.mut_031.BitSet bitSet89 = null;
        fuzzTest67.FuzzTest_clear(bitSet85, bitSet89, (int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet66, bitSet85, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet1 = null;
        buggyasrts.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet6 = null;
        buggyasrts.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet12 = null;
        buggyasrts.mut_031.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet17 = null;
        buggyasrts.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet23 = null;
        buggyasrts.mut_031.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_clear(bitSet23, bitSet24, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet28 = null;
        buggyasrts.mut_031.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_clear(bitSet28, bitSet29, (int) '4', (int) '4');
        buggyasrts.mut_031.BitSet bitSet33 = null;
        fuzzTest11.FuzzTest_clear(bitSet29, bitSet33, (int) (short) -1, (int) (byte) 10);
        buggyasrts.mut_031.BitSet bitSet37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet40 = null;
        buggyasrts.mut_031.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_clear(bitSet40, bitSet41, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet45 = null;
        buggyasrts.mut_031.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_clear(bitSet45, bitSet46, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet51 = null;
        buggyasrts.mut_031.BitSet bitSet52 = null;
        fuzzTest50.FuzzTest_clear(bitSet51, bitSet52, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet56 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_clear(bitSet56, bitSet57, 10, (int) (byte) -1);
        fuzzTest38.FuzzTest_clear(bitSet46, bitSet57, (int) (byte) 1, (int) (short) 10);
        fuzzTest11.FuzzTest_clear(bitSet37, bitSet57, (int) (byte) 100, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet68 = null;
        buggyasrts.mut_031.BitSet bitSet69 = null;
        fuzzTest67.FuzzTest_clear(bitSet68, bitSet69, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet73 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_clear(bitSet73, bitSet74, 10, (int) (byte) -1);
        buggyasrts.mut_031.BitSet bitSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet80 = null;
        buggyasrts.mut_031.BitSet bitSet81 = null;
        fuzzTest79.FuzzTest_clear(bitSet80, bitSet81, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet85 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_clear(bitSet85, bitSet86, 10, (int) (byte) -1);
        fuzzTest67.FuzzTest_clear(bitSet78, bitSet86, (int) (byte) 100, 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet57, bitSet86, 2, (int) '4');
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet1 = null;
        buggyasrts.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet6 = null;
        buggyasrts.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet12 = null;
        buggyasrts.mut_031.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, 10, (int) (byte) -1);
        buggyasrts.mut_031.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet24 = null;
        buggyasrts.mut_031.BitSet bitSet25 = null;
        fuzzTest23.FuzzTest_clear(bitSet24, bitSet25, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_clear(bitSet29, bitSet30, 10, (int) (byte) -1);
        fuzzTest11.FuzzTest_clear(bitSet22, bitSet30, (int) (byte) 100, 100);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet38 = null;
        buggyasrts.mut_031.BitSet bitSet39 = null;
        fuzzTest37.FuzzTest_clear(bitSet38, bitSet39, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet43 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_clear(bitSet43, bitSet44, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet22, bitSet44, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet2 = null;
        buggyasrts.mut_031.BitSet bitSet3 = null;
        fuzzTest1.FuzzTest_clear(bitSet2, bitSet3, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet7 = null;
        buggyasrts.mut_031.BitSet bitSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clear(bitSet7, bitSet8, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet13 = null;
        buggyasrts.mut_031.BitSet bitSet14 = null;
        fuzzTest12.FuzzTest_clear(bitSet13, bitSet14, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_clear(bitSet18, bitSet19, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_clear(bitSet8, bitSet19, (int) (byte) 1, (int) (short) 10);
        buggyasrts.mut_031.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet29 = null;
        buggyasrts.mut_031.BitSet bitSet30 = null;
        fuzzTest28.FuzzTest_clear(bitSet29, bitSet30, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet34 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_clear(bitSet34, bitSet35, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet40 = null;
        buggyasrts.mut_031.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_clear(bitSet40, bitSet41, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet45 = null;
        buggyasrts.mut_031.BitSet bitSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_clear(bitSet45, bitSet46, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet51 = null;
        buggyasrts.mut_031.BitSet bitSet52 = null;
        fuzzTest50.FuzzTest_clear(bitSet51, bitSet52, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet56 = null;
        buggyasrts.mut_031.BitSet bitSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_clear(bitSet56, bitSet57, (int) '4', (int) '4');
        fuzzTest28.FuzzTest_clear(bitSet46, bitSet56, 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet65 = null;
        buggyasrts.mut_031.BitSet bitSet66 = null;
        fuzzTest64.FuzzTest_clear(bitSet65, bitSet66, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet70 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_clear(bitSet70, bitSet71, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet76 = null;
        buggyasrts.mut_031.BitSet bitSet77 = null;
        fuzzTest75.FuzzTest_clear(bitSet76, bitSet77, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet81 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_clear(bitSet81, bitSet82, 10, (int) (byte) -1);
        fuzzTest28.FuzzTest_clear(bitSet71, bitSet82, (int) (byte) 0, (int) (byte) 10);
        buggyasrts.mut_031.BitSet bitSet89 = null;
        fuzzTest27.FuzzTest_clear(bitSet71, bitSet89, (int) '4', (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet26, bitSet71, (int) ' ', (int) 'a');
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet1 = null;
        buggyasrts.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet12 = null;
        buggyasrts.mut_031.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet17 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet23 = null;
        buggyasrts.mut_031.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_clear(bitSet23, bitSet24, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet28 = null;
        buggyasrts.mut_031.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_clear(bitSet28, bitSet29, (int) '4', (int) '4');
        buggyasrts.mut_031.BitSet bitSet33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet35 = null;
        buggyasrts.mut_031.BitSet bitSet36 = null;
        fuzzTest34.FuzzTest_clear(bitSet35, bitSet36, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet40 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_clear(bitSet40, bitSet41, 10, (int) (byte) -1);
        buggyasrts.mut_031.BitSet bitSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet47 = null;
        buggyasrts.mut_031.BitSet bitSet48 = null;
        fuzzTest46.FuzzTest_clear(bitSet47, bitSet48, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_clear(bitSet52, bitSet53, 10, (int) (byte) -1);
        fuzzTest34.FuzzTest_clear(bitSet45, bitSet53, (int) (byte) 100, 100);
        fuzzTest22.FuzzTest_clear(bitSet33, bitSet45, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet18, bitSet45, (int) (short) 10, 100);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet4 = null;
        buggyasrts.mut_031.BitSet bitSet5 = null;
        fuzzTest3.FuzzTest_clear(bitSet4, bitSet5, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet9 = null;
        buggyasrts.mut_031.BitSet bitSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_clear(bitSet9, bitSet10, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet16 = null;
        buggyasrts.mut_031.BitSet bitSet17 = null;
        fuzzTest15.FuzzTest_clear(bitSet16, bitSet17, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet21 = null;
        buggyasrts.mut_031.BitSet bitSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_clear(bitSet21, bitSet22, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet27 = null;
        buggyasrts.mut_031.BitSet bitSet28 = null;
        fuzzTest26.FuzzTest_clear(bitSet27, bitSet28, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet32 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_clear(bitSet32, bitSet33, 10, (int) (byte) -1);
        fuzzTest14.FuzzTest_clear(bitSet22, bitSet33, (int) (byte) 1, (int) (short) 10);
        fuzzTest2.FuzzTest_clear(bitSet9, bitSet22, (int) ' ', (int) ' ');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet44 = null;
        buggyasrts.mut_031.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_clear(bitSet44, bitSet45, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_clear(bitSet49, bitSet50, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet55 = null;
        buggyasrts.mut_031.BitSet bitSet56 = null;
        fuzzTest54.FuzzTest_clear(bitSet55, bitSet56, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet60 = null;
        buggyasrts.mut_031.BitSet bitSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_clear(bitSet60, bitSet61, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet66 = null;
        buggyasrts.mut_031.BitSet bitSet67 = null;
        fuzzTest65.FuzzTest_clear(bitSet66, bitSet67, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet71 = null;
        buggyasrts.mut_031.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_clear(bitSet71, bitSet72, (int) '4', (int) '4');
        fuzzTest43.FuzzTest_clear(bitSet61, bitSet71, 0, (int) (byte) 1);
        fuzzTest1.FuzzTest_clear(bitSet22, bitSet61, 2, (int) (short) -1);
        buggyasrts.mut_031.BitSet bitSet82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet22, bitSet82, (int) ' ', (int) '#');
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet1 = null;
        buggyasrts.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet7 = null;
        buggyasrts.mut_031.BitSet bitSet8 = null;
        fuzzTest6.FuzzTest_clear(bitSet7, bitSet8, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet12 = null;
        buggyasrts.mut_031.BitSet bitSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_clear(bitSet12, bitSet13, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet18 = null;
        buggyasrts.mut_031.BitSet bitSet19 = null;
        fuzzTest17.FuzzTest_clear(bitSet18, bitSet19, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet23 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_clear(bitSet23, bitSet24, 10, (int) (byte) -1);
        fuzzTest0.FuzzTest_clear(bitSet12, bitSet23, (int) (byte) 1, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet32 = null;
        buggyasrts.mut_031.BitSet bitSet33 = null;
        fuzzTest31.FuzzTest_clear(bitSet32, bitSet33, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet37 = null;
        buggyasrts.mut_031.BitSet bitSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_clear(bitSet37, bitSet38, (int) '4', (int) '4');
        buggyasrts.mut_031.BitSet bitSet42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet44 = null;
        buggyasrts.mut_031.BitSet bitSet45 = null;
        fuzzTest43.FuzzTest_clear(bitSet44, bitSet45, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet49 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_clear(bitSet49, bitSet50, 10, (int) (byte) -1);
        fuzzTest31.FuzzTest_clear(bitSet42, bitSet49, (int) (byte) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet58 = null;
        buggyasrts.mut_031.BitSet bitSet59 = null;
        fuzzTest57.FuzzTest_clear(bitSet58, bitSet59, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet63 = null;
        buggyasrts.mut_031.BitSet bitSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_clear(bitSet63, bitSet64, (int) '4', (int) '4');
        buggyasrts.mut_031.BitSet bitSet68 = null;
        fuzzTest31.FuzzTest_clear(bitSet64, bitSet68, 0, 2);
        buggyasrts.mut_031.BitSet bitSet72 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet64, bitSet72, 2, (int) (byte) 100);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet3 = null;
        buggyasrts.mut_031.BitSet bitSet4 = null;
        fuzzTest2.FuzzTest_clear(bitSet3, bitSet4, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet9 = null;
        buggyasrts.mut_031.BitSet bitSet10 = null;
        fuzzTest8.FuzzTest_clear(bitSet9, bitSet10, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet14 = null;
        buggyasrts.mut_031.BitSet bitSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_clear(bitSet14, bitSet15, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet20 = null;
        buggyasrts.mut_031.BitSet bitSet21 = null;
        fuzzTest19.FuzzTest_clear(bitSet20, bitSet21, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet25 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_clear(bitSet25, bitSet26, 10, (int) (byte) -1);
        fuzzTest2.FuzzTest_clear(bitSet14, bitSet26, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet34 = null;
        buggyasrts.mut_031.BitSet bitSet35 = null;
        fuzzTest33.FuzzTest_clear(bitSet34, bitSet35, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet40 = null;
        buggyasrts.mut_031.BitSet bitSet41 = null;
        fuzzTest39.FuzzTest_clear(bitSet40, bitSet41, 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet46 = null;
        buggyasrts.mut_031.BitSet bitSet47 = null;
        fuzzTest45.FuzzTest_clear(bitSet46, bitSet47, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet51 = null;
        buggyasrts.mut_031.BitSet bitSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_clear(bitSet51, bitSet52, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet57 = null;
        buggyasrts.mut_031.BitSet bitSet58 = null;
        fuzzTest56.FuzzTest_clear(bitSet57, bitSet58, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet62 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_clear(bitSet62, bitSet63, 10, (int) (byte) -1);
        fuzzTest39.FuzzTest_clear(bitSet51, bitSet63, (int) '#', 10);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet71 = null;
        buggyasrts.mut_031.BitSet bitSet72 = null;
        fuzzTest70.FuzzTest_clear(bitSet71, bitSet72, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet76 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_clear(bitSet76, bitSet77, 10, (int) (byte) -1);
        fuzzTest33.FuzzTest_clear(bitSet63, bitSet76, 100, 0);
        buggyasrts.mut_031.BitSet bitSet84 = null;
        fuzzTest2.FuzzTest_clear(bitSet76, bitSet84, (int) '#', (int) (byte) 1);
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet84, (int) '4', 1);
        buggyasrts.mut_031.BitSet bitSet91 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet91, bitSet92, (int) (byte) -1, 10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet1 = null;
        buggyasrts.mut_031.BitSet bitSet2 = null;
        fuzzTest0.FuzzTest_clear(bitSet1, bitSet2, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet6 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clear(bitSet6, bitSet7, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet12 = null;
        buggyasrts.mut_031.BitSet bitSet13 = null;
        fuzzTest11.FuzzTest_clear(bitSet12, bitSet13, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet17 = null;
        buggyasrts.mut_031.BitSet bitSet18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_clear(bitSet17, bitSet18, (int) '4', (int) '4');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet23 = null;
        buggyasrts.mut_031.BitSet bitSet24 = null;
        fuzzTest22.FuzzTest_clear(bitSet23, bitSet24, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet28 = null;
        buggyasrts.mut_031.BitSet bitSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_clear(bitSet28, bitSet29, (int) '4', (int) '4');
        buggyasrts.mut_031.BitSet bitSet33 = null;
        fuzzTest11.FuzzTest_clear(bitSet29, bitSet33, (int) (short) -1, (int) (byte) 10);
        buggyasrts.mut_031.BitSet bitSet37 = null;
        fuzzTest0.FuzzTest_clear(bitSet33, bitSet37, (-1), (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet42 = null;
        buggyasrts.mut_031.BitSet bitSet43 = null;
        fuzzTest41.FuzzTest_clear(bitSet42, bitSet43, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet47 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_clear(bitSet47, bitSet48, 10, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggyasrts.mut_031.BitSet bitSet53 = null;
        buggyasrts.mut_031.BitSet bitSet54 = null;
        fuzzTest52.FuzzTest_clear(bitSet53, bitSet54, 0, (int) (byte) 0);
        buggyasrts.mut_031.BitSet bitSet58 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_031.BitSet bitSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_clear(bitSet58, bitSet59, 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clear(bitSet48, bitSet59, (int) '#', (int) '4');
    }
}

