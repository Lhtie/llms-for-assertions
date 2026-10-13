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
        examples.PairMap pairMap2 = null;
        examples.PairMap pairMap3 = null;
        fuzzTest1.FuzzTest_getKey(pairMap2, pairMap3, "", "seed2");
        examples.PairMap pairMap7 = null;
        examples.PairMap pairMap8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_getKey(pairMap7, pairMap8, "old0", "");
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        examples.PairMap pairMap13 = null;
        examples.PairMap pairMap14 = null;
        fuzzTest12.FuzzTest_getKey(pairMap13, pairMap14, "", "seed2");
        examples.PairMap pairMap18 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_getKey(pairMap18, pairMap19, "", "seed2");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap8, pairMap19, "seed0", "old1");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = null;
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "old0", "");
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = null;
        fuzzTest11.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        examples.PairMap pairMap17 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_getKey(pairMap17, pairMap18, "", "seed2");
        examples.PairMap pairMap22 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap18, pairMap22, "old0", "seed0");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        examples.PairMap pairMap7 = null;
        examples.PairMap pairMap8 = null;
        fuzzTest6.FuzzTest_getKey(pairMap7, pairMap8, "", "seed2");
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_getKey(pairMap12, pairMap13, "old0", "");
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        examples.PairMap pairMap18 = null;
        examples.PairMap pairMap19 = null;
        fuzzTest17.FuzzTest_getKey(pairMap18, pairMap19, "", "seed2");
        examples.PairMap pairMap23 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_getKey(pairMap23, pairMap24, "", "seed2");
        fuzzTest0.FuzzTest_getKey(pairMap12, pairMap24, "hi!", "old1");
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        examples.PairMap pairMap32 = null;
        examples.PairMap pairMap33 = null;
        fuzzTest31.FuzzTest_getKey(pairMap32, pairMap33, "", "seed2");
        examples.PairMap pairMap37 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_getKey(pairMap37, pairMap38, "", "seed2");
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        examples.PairMap pairMap43 = null;
        examples.PairMap pairMap44 = null;
        fuzzTest42.FuzzTest_getKey(pairMap43, pairMap44, "", "seed2");
        examples.PairMap pairMap48 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_getKey(pairMap48, pairMap49, "", "seed2");
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        examples.PairMap pairMap54 = null;
        examples.PairMap pairMap55 = null;
        fuzzTest53.FuzzTest_getKey(pairMap54, pairMap55, "", "seed2");
        examples.PairMap pairMap59 = null;
        examples.PairMap pairMap60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_getKey(pairMap59, pairMap60, "old0", "");
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        examples.PairMap pairMap65 = null;
        examples.PairMap pairMap66 = null;
        fuzzTest64.FuzzTest_getKey(pairMap65, pairMap66, "", "seed2");
        examples.PairMap pairMap70 = null;
        examples.PairMap pairMap71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_getKey(pairMap70, pairMap71, "old0", "");
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        examples.PairMap pairMap76 = null;
        examples.PairMap pairMap77 = null;
        fuzzTest75.FuzzTest_getKey(pairMap76, pairMap77, "", "seed2");
        examples.PairMap pairMap81 = null;
        examples.PairMap pairMap82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_getKey(pairMap81, pairMap82, "old0", "");
        examples.PairMap pairMap86 = null;
        fuzzTest64.FuzzTest_getKey(pairMap82, pairMap86, "old2", "old0");
        fuzzTest42.FuzzTest_getKey(pairMap60, pairMap82, "", "hi!");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap38, pairMap82, "old2", "seed0");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = null;
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "old0", "");
        examples.PairMap pairMap11 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap12 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap11, pairMap12, "old0", "");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = null;
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "old0", "");
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = null;
        fuzzTest11.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        examples.PairMap pairMap17 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_getKey(pairMap17, pairMap18, "", "seed2");
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        examples.PairMap pairMap23 = null;
        examples.PairMap pairMap24 = null;
        fuzzTest22.FuzzTest_getKey(pairMap23, pairMap24, "", "seed2");
        examples.PairMap pairMap28 = null;
        examples.PairMap pairMap29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_getKey(pairMap28, pairMap29, "old0", "");
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        examples.PairMap pairMap34 = null;
        examples.PairMap pairMap35 = null;
        fuzzTest33.FuzzTest_getKey(pairMap34, pairMap35, "", "seed2");
        examples.PairMap pairMap39 = null;
        examples.PairMap pairMap40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_getKey(pairMap39, pairMap40, "old0", "");
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        examples.PairMap pairMap45 = null;
        examples.PairMap pairMap46 = null;
        fuzzTest44.FuzzTest_getKey(pairMap45, pairMap46, "", "seed2");
        examples.PairMap pairMap50 = null;
        examples.PairMap pairMap51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_getKey(pairMap50, pairMap51, "old0", "");
        examples.PairMap pairMap55 = null;
        fuzzTest33.FuzzTest_getKey(pairMap51, pairMap55, "old2", "old0");
        fuzzTest11.FuzzTest_getKey(pairMap29, pairMap51, "", "hi!");
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        examples.PairMap pairMap63 = null;
        examples.PairMap pairMap64 = null;
        fuzzTest62.FuzzTest_getKey(pairMap63, pairMap64, "", "seed2");
        examples.PairMap pairMap68 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_getKey(pairMap68, pairMap69, "", "seed2");
        examples.PairMap pairMap73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        examples.PairMap pairMap75 = null;
        examples.PairMap pairMap76 = null;
        fuzzTest74.FuzzTest_getKey(pairMap75, pairMap76, "", "seed2");
        examples.PairMap pairMap80 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_getKey(pairMap80, pairMap81, "", "seed2");
        fuzzTest62.FuzzTest_getKey(pairMap73, pairMap80, "hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap51, pairMap73, "old0", "old1");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        examples.PairMap pairMap7 = null;
        examples.PairMap pairMap8 = null;
        fuzzTest6.FuzzTest_getKey(pairMap7, pairMap8, "", "seed2");
        examples.PairMap pairMap12 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        examples.PairMap pairMap18 = null;
        examples.PairMap pairMap19 = null;
        fuzzTest17.FuzzTest_getKey(pairMap18, pairMap19, "", "seed2");
        examples.PairMap pairMap23 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_getKey(pairMap23, pairMap24, "", "seed2");
        examples.PairMap pairMap28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        examples.PairMap pairMap30 = null;
        examples.PairMap pairMap31 = null;
        fuzzTest29.FuzzTest_getKey(pairMap30, pairMap31, "", "seed2");
        examples.PairMap pairMap35 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_getKey(pairMap35, pairMap36, "", "seed2");
        fuzzTest17.FuzzTest_getKey(pairMap28, pairMap35, "hi!", "hi!");
        examples.PairMap pairMap43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        examples.PairMap pairMap45 = null;
        examples.PairMap pairMap46 = null;
        fuzzTest44.FuzzTest_getKey(pairMap45, pairMap46, "", "seed2");
        examples.PairMap pairMap50 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_getKey(pairMap50, pairMap51, "", "seed2");
        examples.PairMap pairMap55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        examples.PairMap pairMap57 = null;
        examples.PairMap pairMap58 = null;
        fuzzTest56.FuzzTest_getKey(pairMap57, pairMap58, "", "seed2");
        examples.PairMap pairMap62 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_getKey(pairMap62, pairMap63, "", "seed2");
        fuzzTest44.FuzzTest_getKey(pairMap55, pairMap62, "hi!", "hi!");
        fuzzTest17.FuzzTest_getKey(pairMap43, pairMap55, "", "old2");
        fuzzTest0.FuzzTest_getKey(pairMap13, pairMap43, "old2", "seed2");
        examples.PairMap pairMap76 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap76, pairMap77, "seed0", "old2");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "", "seed2");
        examples.PairMap pairMap11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        examples.PairMap pairMap13 = null;
        examples.PairMap pairMap14 = null;
        fuzzTest12.FuzzTest_getKey(pairMap13, pairMap14, "", "seed2");
        examples.PairMap pairMap18 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_getKey(pairMap18, pairMap19, "", "seed2");
        fuzzTest0.FuzzTest_getKey(pairMap11, pairMap19, "hi!", "hi!");
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        examples.PairMap pairMap27 = null;
        examples.PairMap pairMap28 = null;
        fuzzTest26.FuzzTest_getKey(pairMap27, pairMap28, "", "seed2");
        examples.PairMap pairMap32 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_getKey(pairMap32, pairMap33, "", "seed2");
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        examples.PairMap pairMap38 = null;
        examples.PairMap pairMap39 = null;
        fuzzTest37.FuzzTest_getKey(pairMap38, pairMap39, "", "seed2");
        examples.PairMap pairMap43 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_getKey(pairMap43, pairMap44, "", "seed2");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap32, pairMap44, "old2", "old1");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        examples.PairMap pairMap7 = null;
        examples.PairMap pairMap8 = null;
        fuzzTest6.FuzzTest_getKey(pairMap7, pairMap8, "", "seed2");
        examples.PairMap pairMap12 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        examples.PairMap pairMap18 = null;
        examples.PairMap pairMap19 = null;
        fuzzTest17.FuzzTest_getKey(pairMap18, pairMap19, "", "seed2");
        examples.PairMap pairMap23 = null;
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_getKey(pairMap23, pairMap24, "old0", "");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap12, pairMap24, "old0", "old0");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        examples.PairMap pairMap7 = null;
        examples.PairMap pairMap8 = null;
        fuzzTest6.FuzzTest_getKey(pairMap7, pairMap8, "", "seed2");
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_getKey(pairMap12, pairMap13, "old0", "");
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        examples.PairMap pairMap18 = null;
        examples.PairMap pairMap19 = null;
        fuzzTest17.FuzzTest_getKey(pairMap18, pairMap19, "", "seed2");
        examples.PairMap pairMap23 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_getKey(pairMap23, pairMap24, "", "seed2");
        fuzzTest0.FuzzTest_getKey(pairMap12, pairMap24, "hi!", "old1");
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        examples.PairMap pairMap32 = null;
        examples.PairMap pairMap33 = null;
        fuzzTest31.FuzzTest_getKey(pairMap32, pairMap33, "", "seed2");
        examples.PairMap pairMap37 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_getKey(pairMap37, pairMap38, "", "seed2");
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        examples.PairMap pairMap43 = null;
        examples.PairMap pairMap44 = null;
        fuzzTest42.FuzzTest_getKey(pairMap43, pairMap44, "", "seed2");
        examples.PairMap pairMap48 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_getKey(pairMap48, pairMap49, "", "seed2");
        examples.PairMap pairMap53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        examples.PairMap pairMap55 = null;
        examples.PairMap pairMap56 = null;
        fuzzTest54.FuzzTest_getKey(pairMap55, pairMap56, "", "seed2");
        examples.PairMap pairMap60 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_getKey(pairMap60, pairMap61, "", "seed2");
        fuzzTest42.FuzzTest_getKey(pairMap53, pairMap61, "hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap37, pairMap53, "seed0", "old2");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        examples.PairMap pairMap2 = null;
        examples.PairMap pairMap3 = null;
        fuzzTest1.FuzzTest_getKey(pairMap2, pairMap3, "", "seed2");
        examples.PairMap pairMap7 = null;
        examples.PairMap pairMap8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_getKey(pairMap7, pairMap8, "old0", "");
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        examples.PairMap pairMap13 = null;
        examples.PairMap pairMap14 = null;
        fuzzTest12.FuzzTest_getKey(pairMap13, pairMap14, "", "seed2");
        examples.PairMap pairMap18 = null;
        examples.PairMap pairMap19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_getKey(pairMap18, pairMap19, "old0", "");
        examples.PairMap pairMap23 = null;
        fuzzTest1.FuzzTest_getKey(pairMap19, pairMap23, "old2", "old0");
        examples.PairMap pairMap27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        examples.PairMap pairMap29 = null;
        examples.PairMap pairMap30 = null;
        fuzzTest28.FuzzTest_getKey(pairMap29, pairMap30, "", "seed2");
        examples.PairMap pairMap34 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_getKey(pairMap34, pairMap35, "", "seed2");
        examples.PairMap pairMap39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        examples.PairMap pairMap41 = null;
        examples.PairMap pairMap42 = null;
        fuzzTest40.FuzzTest_getKey(pairMap41, pairMap42, "", "seed2");
        examples.PairMap pairMap46 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_getKey(pairMap46, pairMap47, "", "seed2");
        fuzzTest28.FuzzTest_getKey(pairMap39, pairMap47, "hi!", "hi!");
        fuzzTest1.FuzzTest_getKey(pairMap27, pairMap39, "hi!", "seed1");
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        examples.PairMap pairMap58 = null;
        examples.PairMap pairMap59 = null;
        fuzzTest57.FuzzTest_getKey(pairMap58, pairMap59, "", "seed2");
        examples.PairMap pairMap63 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_getKey(pairMap63, pairMap64, "", "seed2");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap39, pairMap64, "seed0", "seed0");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        examples.PairMap pairMap7 = null;
        examples.PairMap pairMap8 = null;
        fuzzTest6.FuzzTest_getKey(pairMap7, pairMap8, "", "seed2");
        examples.PairMap pairMap12 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        examples.PairMap pairMap17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        examples.PairMap pairMap19 = null;
        examples.PairMap pairMap20 = null;
        fuzzTest18.FuzzTest_getKey(pairMap19, pairMap20, "", "seed2");
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_getKey(pairMap24, pairMap25, "", "seed2");
        fuzzTest6.FuzzTest_getKey(pairMap17, pairMap24, "hi!", "hi!");
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        examples.PairMap pairMap34 = null;
        examples.PairMap pairMap35 = null;
        fuzzTest33.FuzzTest_getKey(pairMap34, pairMap35, "", "seed2");
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        examples.PairMap pairMap40 = null;
        examples.PairMap pairMap41 = null;
        fuzzTest39.FuzzTest_getKey(pairMap40, pairMap41, "", "seed2");
        examples.PairMap pairMap45 = null;
        examples.PairMap pairMap46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_getKey(pairMap45, pairMap46, "old0", "");
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        examples.PairMap pairMap51 = null;
        examples.PairMap pairMap52 = null;
        fuzzTest50.FuzzTest_getKey(pairMap51, pairMap52, "", "seed2");
        examples.PairMap pairMap56 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_getKey(pairMap56, pairMap57, "", "seed2");
        fuzzTest33.FuzzTest_getKey(pairMap45, pairMap57, "hi!", "old1");
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        examples.PairMap pairMap65 = null;
        examples.PairMap pairMap66 = null;
        fuzzTest64.FuzzTest_getKey(pairMap65, pairMap66, "", "seed2");
        examples.PairMap pairMap70 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_getKey(pairMap70, pairMap71, "", "seed2");
        fuzzTest32.FuzzTest_getKey(pairMap45, pairMap71, "", "hi!");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap17, pairMap71, "seed1", "old0");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = null;
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "old0", "");
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = null;
        fuzzTest11.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        examples.PairMap pairMap17 = null;
        examples.PairMap pairMap18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_getKey(pairMap17, pairMap18, "old0", "");
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        examples.PairMap pairMap23 = null;
        examples.PairMap pairMap24 = null;
        fuzzTest22.FuzzTest_getKey(pairMap23, pairMap24, "", "seed2");
        examples.PairMap pairMap28 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_getKey(pairMap28, pairMap29, "", "seed2");
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        examples.PairMap pairMap34 = null;
        examples.PairMap pairMap35 = null;
        fuzzTest33.FuzzTest_getKey(pairMap34, pairMap35, "", "seed2");
        examples.PairMap pairMap39 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_getKey(pairMap39, pairMap40, "", "seed2");
        fuzzTest11.FuzzTest_getKey(pairMap28, pairMap39, "hi!", "old1");
        examples.PairMap pairMap47 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap28, pairMap47, "old0", "old0");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = null;
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "old0", "");
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = null;
        fuzzTest11.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        examples.PairMap pairMap18 = null;
        examples.PairMap pairMap19 = null;
        fuzzTest17.FuzzTest_getKey(pairMap18, pairMap19, "", "seed2");
        examples.PairMap pairMap23 = null;
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_getKey(pairMap23, pairMap24, "old0", "");
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        examples.PairMap pairMap29 = null;
        examples.PairMap pairMap30 = null;
        fuzzTest28.FuzzTest_getKey(pairMap29, pairMap30, "", "seed2");
        examples.PairMap pairMap34 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_getKey(pairMap34, pairMap35, "", "seed2");
        fuzzTest11.FuzzTest_getKey(pairMap23, pairMap35, "hi!", "old1");
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        examples.PairMap pairMap43 = null;
        examples.PairMap pairMap44 = null;
        fuzzTest42.FuzzTest_getKey(pairMap43, pairMap44, "", "seed2");
        examples.PairMap pairMap48 = null;
        examples.PairMap pairMap49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_getKey(pairMap48, pairMap49, "old0", "");
        fuzzTest0.FuzzTest_getKey(pairMap23, pairMap48, "hi!", "old0");
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        examples.PairMap pairMap57 = null;
        examples.PairMap pairMap58 = null;
        fuzzTest56.FuzzTest_getKey(pairMap57, pairMap58, "", "seed2");
        examples.PairMap pairMap62 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_getKey(pairMap62, pairMap63, "", "seed2");
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        examples.PairMap pairMap68 = null;
        examples.PairMap pairMap69 = null;
        fuzzTest67.FuzzTest_getKey(pairMap68, pairMap69, "", "seed2");
        examples.PairMap pairMap73 = null;
        examples.PairMap pairMap74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_getKey(pairMap73, pairMap74, "old0", "");
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        examples.PairMap pairMap79 = null;
        examples.PairMap pairMap80 = null;
        fuzzTest78.FuzzTest_getKey(pairMap79, pairMap80, "", "seed2");
        examples.PairMap pairMap84 = null;
        examples.PairMap pairMap85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_getKey(pairMap84, pairMap85, "old0", "");
        examples.PairMap pairMap89 = null;
        fuzzTest67.FuzzTest_getKey(pairMap85, pairMap89, "old2", "old0");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap63, pairMap85, "old0", "old1");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        examples.PairMap pairMap3 = null;
        examples.PairMap pairMap4 = null;
        fuzzTest2.FuzzTest_getKey(pairMap3, pairMap4, "", "seed2");
        examples.PairMap pairMap8 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_getKey(pairMap8, pairMap9, "", "seed2");
        examples.PairMap pairMap13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        examples.PairMap pairMap15 = null;
        examples.PairMap pairMap16 = null;
        fuzzTest14.FuzzTest_getKey(pairMap15, pairMap16, "", "seed2");
        examples.PairMap pairMap20 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_getKey(pairMap20, pairMap21, "", "seed2");
        fuzzTest2.FuzzTest_getKey(pairMap13, pairMap21, "hi!", "hi!");
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        examples.PairMap pairMap29 = null;
        examples.PairMap pairMap30 = null;
        fuzzTest28.FuzzTest_getKey(pairMap29, pairMap30, "", "seed2");
        examples.PairMap pairMap34 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_getKey(pairMap34, pairMap35, "", "seed2");
        examples.PairMap pairMap39 = null;
        fuzzTest2.FuzzTest_getKey(pairMap35, pairMap39, "hi!", "seed0");
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap39, "seed1", "");
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        examples.PairMap pairMap47 = null;
        examples.PairMap pairMap48 = null;
        fuzzTest46.FuzzTest_getKey(pairMap47, pairMap48, "", "seed2");
        examples.PairMap pairMap52 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_getKey(pairMap52, pairMap53, "", "seed2");
        examples.PairMap pairMap57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        examples.PairMap pairMap59 = null;
        examples.PairMap pairMap60 = null;
        fuzzTest58.FuzzTest_getKey(pairMap59, pairMap60, "", "seed2");
        examples.PairMap pairMap64 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_getKey(pairMap64, pairMap65, "", "seed2");
        fuzzTest46.FuzzTest_getKey(pairMap57, pairMap64, "hi!", "hi!");
        examples.PairMap pairMap72 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap64, pairMap72, "old1", "old2");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        examples.PairMap pairMap2 = null;
        examples.PairMap pairMap3 = null;
        fuzzTest1.FuzzTest_getKey(pairMap2, pairMap3, "", "seed2");
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_getKey(pairMap7, pairMap8, "", "seed2");
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        examples.PairMap pairMap13 = null;
        examples.PairMap pairMap14 = null;
        fuzzTest12.FuzzTest_getKey(pairMap13, pairMap14, "", "seed2");
        examples.PairMap pairMap18 = null;
        examples.PairMap pairMap19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_getKey(pairMap18, pairMap19, "old0", "");
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        examples.PairMap pairMap24 = null;
        examples.PairMap pairMap25 = null;
        fuzzTest23.FuzzTest_getKey(pairMap24, pairMap25, "", "seed2");
        examples.PairMap pairMap29 = null;
        examples.PairMap pairMap30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_getKey(pairMap29, pairMap30, "old0", "");
        examples.PairMap pairMap34 = null;
        fuzzTest12.FuzzTest_getKey(pairMap30, pairMap34, "old2", "old0");
        examples.PairMap pairMap38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        examples.PairMap pairMap40 = null;
        examples.PairMap pairMap41 = null;
        fuzzTest39.FuzzTest_getKey(pairMap40, pairMap41, "", "seed2");
        examples.PairMap pairMap45 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_getKey(pairMap45, pairMap46, "", "seed2");
        examples.PairMap pairMap50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        examples.PairMap pairMap52 = null;
        examples.PairMap pairMap53 = null;
        fuzzTest51.FuzzTest_getKey(pairMap52, pairMap53, "", "seed2");
        examples.PairMap pairMap57 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_getKey(pairMap57, pairMap58, "", "seed2");
        fuzzTest39.FuzzTest_getKey(pairMap50, pairMap57, "hi!", "hi!");
        fuzzTest12.FuzzTest_getKey(pairMap38, pairMap57, "seed0", "seed0");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap7, pairMap57, "seed1", "old2");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        examples.PairMap pairMap2 = null;
        examples.PairMap pairMap3 = null;
        fuzzTest1.FuzzTest_getKey(pairMap2, pairMap3, "", "seed2");
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        examples.PairMap pairMap8 = null;
        examples.PairMap pairMap9 = null;
        fuzzTest7.FuzzTest_getKey(pairMap8, pairMap9, "", "seed2");
        examples.PairMap pairMap13 = null;
        examples.PairMap pairMap14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_getKey(pairMap13, pairMap14, "old0", "");
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        examples.PairMap pairMap19 = null;
        examples.PairMap pairMap20 = null;
        fuzzTest18.FuzzTest_getKey(pairMap19, pairMap20, "", "seed2");
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_getKey(pairMap24, pairMap25, "", "seed2");
        fuzzTest1.FuzzTest_getKey(pairMap13, pairMap25, "hi!", "old1");
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        examples.PairMap pairMap33 = null;
        examples.PairMap pairMap34 = null;
        fuzzTest32.FuzzTest_getKey(pairMap33, pairMap34, "", "seed2");
        examples.PairMap pairMap38 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_getKey(pairMap38, pairMap39, "", "seed2");
        fuzzTest0.FuzzTest_getKey(pairMap13, pairMap39, "", "hi!");
        examples.PairMap pairMap46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        examples.PairMap pairMap48 = null;
        examples.PairMap pairMap49 = null;
        fuzzTest47.FuzzTest_getKey(pairMap48, pairMap49, "", "seed2");
        examples.PairMap pairMap53 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_getKey(pairMap53, pairMap54, "", "seed2");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap46, pairMap54, "seed0", "old0");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        examples.PairMap pairMap7 = null;
        examples.PairMap pairMap8 = null;
        fuzzTest6.FuzzTest_getKey(pairMap7, pairMap8, "", "seed2");
        examples.PairMap pairMap12 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        examples.PairMap pairMap17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        examples.PairMap pairMap19 = null;
        examples.PairMap pairMap20 = null;
        fuzzTest18.FuzzTest_getKey(pairMap19, pairMap20, "", "seed2");
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_getKey(pairMap24, pairMap25, "", "seed2");
        fuzzTest6.FuzzTest_getKey(pairMap17, pairMap24, "hi!", "hi!");
        examples.PairMap pairMap32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        examples.PairMap pairMap34 = null;
        examples.PairMap pairMap35 = null;
        fuzzTest33.FuzzTest_getKey(pairMap34, pairMap35, "", "seed2");
        examples.PairMap pairMap39 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_getKey(pairMap39, pairMap40, "", "seed2");
        examples.PairMap pairMap44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        examples.PairMap pairMap46 = null;
        examples.PairMap pairMap47 = null;
        fuzzTest45.FuzzTest_getKey(pairMap46, pairMap47, "", "seed2");
        examples.PairMap pairMap51 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_getKey(pairMap51, pairMap52, "", "seed2");
        fuzzTest33.FuzzTest_getKey(pairMap44, pairMap51, "hi!", "hi!");
        fuzzTest6.FuzzTest_getKey(pairMap32, pairMap44, "", "old2");
        examples.PairMap pairMap62 = null;
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        examples.PairMap pairMap64 = null;
        examples.PairMap pairMap65 = null;
        fuzzTest63.FuzzTest_getKey(pairMap64, pairMap65, "", "seed2");
        examples.PairMap pairMap69 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_getKey(pairMap69, pairMap70, "", "seed2");
        fuzzTest6.FuzzTest_getKey(pairMap62, pairMap69, "", "old2");
        examples.PairMap pairMap77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap69, pairMap77, "seed2", "old0");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        examples.PairMap pairMap7 = null;
        examples.PairMap pairMap8 = null;
        fuzzTest6.FuzzTest_getKey(pairMap7, pairMap8, "", "seed2");
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_getKey(pairMap12, pairMap13, "old0", "");
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        examples.PairMap pairMap18 = null;
        examples.PairMap pairMap19 = null;
        fuzzTest17.FuzzTest_getKey(pairMap18, pairMap19, "", "seed2");
        examples.PairMap pairMap23 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_getKey(pairMap23, pairMap24, "", "seed2");
        fuzzTest0.FuzzTest_getKey(pairMap12, pairMap24, "hi!", "old1");
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        examples.PairMap pairMap32 = null;
        examples.PairMap pairMap33 = null;
        fuzzTest31.FuzzTest_getKey(pairMap32, pairMap33, "", "seed2");
        examples.PairMap pairMap37 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_getKey(pairMap37, pairMap38, "", "seed2");
        examples.PairMap pairMap42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        examples.PairMap pairMap44 = null;
        examples.PairMap pairMap45 = null;
        fuzzTest43.FuzzTest_getKey(pairMap44, pairMap45, "", "seed2");
        examples.PairMap pairMap49 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_getKey(pairMap49, pairMap50, "", "seed2");
        examples.PairMap pairMap54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        examples.PairMap pairMap56 = null;
        examples.PairMap pairMap57 = null;
        fuzzTest55.FuzzTest_getKey(pairMap56, pairMap57, "", "seed2");
        examples.PairMap pairMap61 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_getKey(pairMap61, pairMap62, "", "seed2");
        fuzzTest43.FuzzTest_getKey(pairMap54, pairMap62, "hi!", "hi!");
        fuzzTest31.FuzzTest_getKey(pairMap42, pairMap54, "old2", "seed1");
        examples.PairMap pairMap72 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap54, pairMap72, "seed2", "hi!");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        examples.PairMap pairMap7 = null;
        examples.PairMap pairMap8 = null;
        fuzzTest6.FuzzTest_getKey(pairMap7, pairMap8, "", "seed2");
        examples.PairMap pairMap12 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        examples.PairMap pairMap17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        examples.PairMap pairMap19 = null;
        examples.PairMap pairMap20 = null;
        fuzzTest18.FuzzTest_getKey(pairMap19, pairMap20, "", "seed2");
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_getKey(pairMap24, pairMap25, "", "seed2");
        fuzzTest6.FuzzTest_getKey(pairMap17, pairMap24, "hi!", "hi!");
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        examples.PairMap pairMap33 = null;
        examples.PairMap pairMap34 = null;
        fuzzTest32.FuzzTest_getKey(pairMap33, pairMap34, "", "seed2");
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        examples.PairMap pairMap39 = null;
        examples.PairMap pairMap40 = null;
        fuzzTest38.FuzzTest_getKey(pairMap39, pairMap40, "", "seed2");
        examples.PairMap pairMap44 = null;
        examples.PairMap pairMap45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_getKey(pairMap44, pairMap45, "old0", "");
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        examples.PairMap pairMap50 = null;
        examples.PairMap pairMap51 = null;
        fuzzTest49.FuzzTest_getKey(pairMap50, pairMap51, "", "seed2");
        examples.PairMap pairMap55 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_getKey(pairMap55, pairMap56, "", "seed2");
        fuzzTest32.FuzzTest_getKey(pairMap44, pairMap56, "hi!", "old1");
        fuzzTest0.FuzzTest_getKey(pairMap24, pairMap56, "seed2", "old1");
        examples.PairMap pairMap66 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap67 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap66, pairMap67, "old2", "old0");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        examples.PairMap pairMap2 = null;
        examples.PairMap pairMap3 = null;
        fuzzTest1.FuzzTest_getKey(pairMap2, pairMap3, "", "seed2");
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        examples.PairMap pairMap8 = null;
        examples.PairMap pairMap9 = null;
        fuzzTest7.FuzzTest_getKey(pairMap8, pairMap9, "", "seed2");
        examples.PairMap pairMap13 = null;
        examples.PairMap pairMap14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_getKey(pairMap13, pairMap14, "old0", "");
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        examples.PairMap pairMap19 = null;
        examples.PairMap pairMap20 = null;
        fuzzTest18.FuzzTest_getKey(pairMap19, pairMap20, "", "seed2");
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_getKey(pairMap24, pairMap25, "", "seed2");
        fuzzTest1.FuzzTest_getKey(pairMap13, pairMap25, "hi!", "old1");
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        examples.PairMap pairMap33 = null;
        examples.PairMap pairMap34 = null;
        fuzzTest32.FuzzTest_getKey(pairMap33, pairMap34, "", "seed2");
        examples.PairMap pairMap38 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_getKey(pairMap38, pairMap39, "", "seed2");
        fuzzTest0.FuzzTest_getKey(pairMap13, pairMap39, "", "hi!");
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        examples.PairMap pairMap47 = null;
        examples.PairMap pairMap48 = null;
        fuzzTest46.FuzzTest_getKey(pairMap47, pairMap48, "", "seed2");
        examples.PairMap pairMap52 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_getKey(pairMap52, pairMap53, "", "seed2");
        examples.PairMap pairMap57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        examples.PairMap pairMap59 = null;
        examples.PairMap pairMap60 = null;
        fuzzTest58.FuzzTest_getKey(pairMap59, pairMap60, "", "seed2");
        examples.PairMap pairMap64 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_getKey(pairMap64, pairMap65, "", "seed2");
        fuzzTest46.FuzzTest_getKey(pairMap57, pairMap65, "hi!", "hi!");
        examples.PairMap pairMap72 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap57, pairMap72, "old0", "old1");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = null;
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "old0", "");
        examples.PairMap pairMap11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        examples.PairMap pairMap13 = null;
        examples.PairMap pairMap14 = null;
        fuzzTest12.FuzzTest_getKey(pairMap13, pairMap14, "", "seed2");
        examples.PairMap pairMap18 = null;
        examples.PairMap pairMap19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_getKey(pairMap18, pairMap19, "old0", "");
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        examples.PairMap pairMap24 = null;
        examples.PairMap pairMap25 = null;
        fuzzTest23.FuzzTest_getKey(pairMap24, pairMap25, "", "seed2");
        examples.PairMap pairMap29 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_getKey(pairMap29, pairMap30, "", "seed2");
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        examples.PairMap pairMap35 = null;
        examples.PairMap pairMap36 = null;
        fuzzTest34.FuzzTest_getKey(pairMap35, pairMap36, "", "seed2");
        examples.PairMap pairMap40 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_getKey(pairMap40, pairMap41, "", "seed2");
        examples.PairMap pairMap45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        examples.PairMap pairMap47 = null;
        examples.PairMap pairMap48 = null;
        fuzzTest46.FuzzTest_getKey(pairMap47, pairMap48, "", "seed2");
        examples.PairMap pairMap52 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_getKey(pairMap52, pairMap53, "", "seed2");
        examples.PairMap pairMap57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        examples.PairMap pairMap59 = null;
        examples.PairMap pairMap60 = null;
        fuzzTest58.FuzzTest_getKey(pairMap59, pairMap60, "", "seed2");
        examples.PairMap pairMap64 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_getKey(pairMap64, pairMap65, "", "seed2");
        fuzzTest46.FuzzTest_getKey(pairMap57, pairMap65, "hi!", "hi!");
        fuzzTest34.FuzzTest_getKey(pairMap45, pairMap57, "old2", "seed1");
        fuzzTest12.FuzzTest_getKey(pairMap30, pairMap57, "", "seed2");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap11, pairMap30, "seed1", "seed1");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "", "seed2");
        examples.PairMap pairMap11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        examples.PairMap pairMap13 = null;
        examples.PairMap pairMap14 = null;
        fuzzTest12.FuzzTest_getKey(pairMap13, pairMap14, "", "seed2");
        examples.PairMap pairMap18 = null;
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        examples.PairMap pairMap20 = null;
        examples.PairMap pairMap21 = null;
        fuzzTest19.FuzzTest_getKey(pairMap20, pairMap21, "", "seed2");
        examples.PairMap pairMap25 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_getKey(pairMap25, pairMap26, "", "seed2");
        fuzzTest12.FuzzTest_getKey(pairMap18, pairMap26, "hi!", "seed0");
        fuzzTest0.FuzzTest_getKey(pairMap11, pairMap18, "old1", "old0");
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        examples.PairMap pairMap37 = null;
        examples.PairMap pairMap38 = null;
        fuzzTest36.FuzzTest_getKey(pairMap37, pairMap38, "", "seed2");
        examples.PairMap pairMap42 = null;
        examples.PairMap pairMap43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_getKey(pairMap42, pairMap43, "old0", "");
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        examples.PairMap pairMap48 = null;
        examples.PairMap pairMap49 = null;
        fuzzTest47.FuzzTest_getKey(pairMap48, pairMap49, "", "seed2");
        examples.PairMap pairMap53 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_getKey(pairMap53, pairMap54, "", "seed2");
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        examples.PairMap pairMap59 = null;
        examples.PairMap pairMap60 = null;
        fuzzTest58.FuzzTest_getKey(pairMap59, pairMap60, "", "seed2");
        examples.PairMap pairMap64 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_getKey(pairMap64, pairMap65, "", "seed2");
        fuzzTest36.FuzzTest_getKey(pairMap53, pairMap64, "hi!", "old1");
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        examples.PairMap pairMap73 = null;
        examples.PairMap pairMap74 = null;
        fuzzTest72.FuzzTest_getKey(pairMap73, pairMap74, "", "seed2");
        examples.PairMap pairMap78 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_getKey(pairMap78, pairMap79, "", "seed2");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap53, pairMap79, "seed0", "seed0");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = null;
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "old0", "");
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = null;
        fuzzTest11.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        examples.PairMap pairMap17 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_getKey(pairMap17, pairMap18, "", "seed2");
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        examples.PairMap pairMap23 = null;
        examples.PairMap pairMap24 = null;
        fuzzTest22.FuzzTest_getKey(pairMap23, pairMap24, "", "seed2");
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        examples.PairMap pairMap29 = null;
        examples.PairMap pairMap30 = null;
        fuzzTest28.FuzzTest_getKey(pairMap29, pairMap30, "", "seed2");
        examples.PairMap pairMap34 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_getKey(pairMap34, pairMap35, "", "seed2");
        examples.PairMap pairMap39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        examples.PairMap pairMap41 = null;
        examples.PairMap pairMap42 = null;
        fuzzTest40.FuzzTest_getKey(pairMap41, pairMap42, "", "seed2");
        examples.PairMap pairMap46 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_getKey(pairMap46, pairMap47, "", "seed2");
        fuzzTest28.FuzzTest_getKey(pairMap39, pairMap46, "hi!", "hi!");
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        examples.PairMap pairMap55 = null;
        examples.PairMap pairMap56 = null;
        fuzzTest54.FuzzTest_getKey(pairMap55, pairMap56, "", "seed2");
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        examples.PairMap pairMap61 = null;
        examples.PairMap pairMap62 = null;
        fuzzTest60.FuzzTest_getKey(pairMap61, pairMap62, "", "seed2");
        examples.PairMap pairMap66 = null;
        examples.PairMap pairMap67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_getKey(pairMap66, pairMap67, "old0", "");
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        examples.PairMap pairMap72 = null;
        examples.PairMap pairMap73 = null;
        fuzzTest71.FuzzTest_getKey(pairMap72, pairMap73, "", "seed2");
        examples.PairMap pairMap77 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_getKey(pairMap77, pairMap78, "", "seed2");
        fuzzTest54.FuzzTest_getKey(pairMap66, pairMap78, "hi!", "old1");
        fuzzTest22.FuzzTest_getKey(pairMap46, pairMap78, "seed2", "old1");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap18, pairMap46, "seed1", "seed2");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = null;
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "old0", "");
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = null;
        fuzzTest11.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        examples.PairMap pairMap17 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_getKey(pairMap17, pairMap18, "", "seed2");
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        examples.PairMap pairMap23 = null;
        examples.PairMap pairMap24 = null;
        fuzzTest22.FuzzTest_getKey(pairMap23, pairMap24, "", "seed2");
        examples.PairMap pairMap28 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_getKey(pairMap28, pairMap29, "", "seed2");
        fuzzTest0.FuzzTest_getKey(pairMap17, pairMap28, "hi!", "old1");
        examples.PairMap pairMap36 = null;
        examples.PairMap pairMap37 = null;
        fuzzTest0.FuzzTest_getKey(pairMap36, pairMap37, "hi!", "seed2");
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        examples.PairMap pairMap42 = null;
        examples.PairMap pairMap43 = null;
        fuzzTest41.FuzzTest_getKey(pairMap42, pairMap43, "", "seed2");
        examples.PairMap pairMap47 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_getKey(pairMap47, pairMap48, "", "seed2");
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        examples.PairMap pairMap53 = null;
        examples.PairMap pairMap54 = null;
        fuzzTest52.FuzzTest_getKey(pairMap53, pairMap54, "", "seed2");
        examples.PairMap pairMap58 = null;
        examples.PairMap pairMap59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_getKey(pairMap58, pairMap59, "old0", "");
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        examples.PairMap pairMap64 = null;
        examples.PairMap pairMap65 = null;
        fuzzTest63.FuzzTest_getKey(pairMap64, pairMap65, "", "seed2");
        examples.PairMap pairMap69 = null;
        examples.PairMap pairMap70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_getKey(pairMap69, pairMap70, "old0", "");
        examples.PairMap pairMap74 = null;
        fuzzTest52.FuzzTest_getKey(pairMap70, pairMap74, "old2", "old0");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap47, pairMap70, "seed2", "hi!");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "", "seed2");
        examples.PairMap pairMap11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        examples.PairMap pairMap13 = null;
        examples.PairMap pairMap14 = null;
        fuzzTest12.FuzzTest_getKey(pairMap13, pairMap14, "", "seed2");
        examples.PairMap pairMap18 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_getKey(pairMap18, pairMap19, "", "seed2");
        examples.PairMap pairMap23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        examples.PairMap pairMap25 = null;
        examples.PairMap pairMap26 = null;
        fuzzTest24.FuzzTest_getKey(pairMap25, pairMap26, "", "seed2");
        examples.PairMap pairMap30 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_getKey(pairMap30, pairMap31, "", "seed2");
        fuzzTest12.FuzzTest_getKey(pairMap23, pairMap30, "hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap11, pairMap23, "old1", "old2");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "seed0", "old2");
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        examples.PairMap pairMap7 = null;
        examples.PairMap pairMap8 = null;
        fuzzTest6.FuzzTest_getKey(pairMap7, pairMap8, "seed0", "old2");
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = null;
        fuzzTest6.FuzzTest_getKey(pairMap12, pairMap13, "seed1", "seed2");
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        examples.PairMap pairMap18 = null;
        examples.PairMap pairMap19 = null;
        fuzzTest17.FuzzTest_getKey(pairMap18, pairMap19, "", "seed2");
        examples.PairMap pairMap23 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_getKey(pairMap23, pairMap24, "", "seed2");
        examples.PairMap pairMap28 = null;
        fuzzTest6.FuzzTest_getKey(pairMap23, pairMap28, "", "seed0");
        examples.PairMap pairMap32 = null;
        fuzzTest0.FuzzTest_getKey(pairMap23, pairMap32, "old2", "hi!");
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        examples.PairMap pairMap37 = null;
        examples.PairMap pairMap38 = null;
        fuzzTest36.FuzzTest_getKey(pairMap37, pairMap38, "", "seed2");
        examples.PairMap pairMap42 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_getKey(pairMap42, pairMap43, "", "seed2");
        examples.PairMap pairMap47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        examples.PairMap pairMap49 = null;
        examples.PairMap pairMap50 = null;
        fuzzTest48.FuzzTest_getKey(pairMap49, pairMap50, "", "seed2");
        examples.PairMap pairMap54 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_getKey(pairMap54, pairMap55, "", "seed2");
        fuzzTest36.FuzzTest_getKey(pairMap47, pairMap55, "hi!", "hi!");
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        examples.PairMap pairMap63 = null;
        examples.PairMap pairMap64 = null;
        fuzzTest62.FuzzTest_getKey(pairMap63, pairMap64, "", "seed2");
        examples.PairMap pairMap68 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_getKey(pairMap68, pairMap69, "", "seed2");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap55, pairMap69, "old2", "seed1");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "seed0", "old2");
        examples.PairMap pairMap6 = null;
        examples.PairMap pairMap7 = null;
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "seed1", "seed2");
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = null;
        fuzzTest11.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        examples.PairMap pairMap17 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_getKey(pairMap17, pairMap18, "", "seed2");
        examples.PairMap pairMap22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        examples.PairMap pairMap24 = null;
        examples.PairMap pairMap25 = null;
        fuzzTest23.FuzzTest_getKey(pairMap24, pairMap25, "", "seed2");
        examples.PairMap pairMap29 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_getKey(pairMap29, pairMap30, "", "seed2");
        examples.PairMap pairMap34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        examples.PairMap pairMap36 = null;
        examples.PairMap pairMap37 = null;
        fuzzTest35.FuzzTest_getKey(pairMap36, pairMap37, "", "seed2");
        examples.PairMap pairMap41 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_getKey(pairMap41, pairMap42, "", "seed2");
        fuzzTest23.FuzzTest_getKey(pairMap34, pairMap42, "hi!", "hi!");
        fuzzTest11.FuzzTest_getKey(pairMap22, pairMap34, "old2", "seed1");
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        examples.PairMap pairMap53 = null;
        examples.PairMap pairMap54 = null;
        fuzzTest52.FuzzTest_getKey(pairMap53, pairMap54, "", "seed2");
        examples.PairMap pairMap58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        examples.PairMap pairMap60 = null;
        examples.PairMap pairMap61 = null;
        fuzzTest59.FuzzTest_getKey(pairMap60, pairMap61, "", "seed2");
        examples.PairMap pairMap65 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_getKey(pairMap65, pairMap66, "", "seed2");
        fuzzTest52.FuzzTest_getKey(pairMap58, pairMap66, "hi!", "seed0");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap34, pairMap66, "old0", "old1");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = null;
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "old0", "");
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = null;
        fuzzTest11.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        examples.PairMap pairMap17 = null;
        examples.PairMap pairMap18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_getKey(pairMap17, pairMap18, "old0", "");
        examples.PairMap pairMap22 = null;
        fuzzTest0.FuzzTest_getKey(pairMap18, pairMap22, "old2", "old0");
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        examples.PairMap pairMap27 = null;
        examples.PairMap pairMap28 = null;
        fuzzTest26.FuzzTest_getKey(pairMap27, pairMap28, "", "seed2");
        examples.PairMap pairMap32 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_getKey(pairMap32, pairMap33, "", "seed2");
        examples.PairMap pairMap37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        examples.PairMap pairMap39 = null;
        examples.PairMap pairMap40 = null;
        fuzzTest38.FuzzTest_getKey(pairMap39, pairMap40, "", "seed2");
        examples.PairMap pairMap44 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_getKey(pairMap44, pairMap45, "", "seed2");
        fuzzTest26.FuzzTest_getKey(pairMap37, pairMap44, "hi!", "hi!");
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        examples.PairMap pairMap53 = null;
        examples.PairMap pairMap54 = null;
        fuzzTest52.FuzzTest_getKey(pairMap53, pairMap54, "", "seed2");
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        examples.PairMap pairMap59 = null;
        examples.PairMap pairMap60 = null;
        fuzzTest58.FuzzTest_getKey(pairMap59, pairMap60, "", "seed2");
        examples.PairMap pairMap64 = null;
        examples.PairMap pairMap65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_getKey(pairMap64, pairMap65, "old0", "");
        examples.PairMap pairMap69 = null;
        fuzzTest52.FuzzTest_getKey(pairMap65, pairMap69, "", "seed1");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap37, pairMap65, "old2", "seed2");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        examples.PairMap pairMap8 = null;
        examples.PairMap pairMap9 = null;
        fuzzTest7.FuzzTest_getKey(pairMap8, pairMap9, "", "seed2");
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        examples.PairMap pairMap14 = null;
        examples.PairMap pairMap15 = null;
        fuzzTest13.FuzzTest_getKey(pairMap14, pairMap15, "", "seed2");
        examples.PairMap pairMap19 = null;
        examples.PairMap pairMap20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_getKey(pairMap19, pairMap20, "old0", "");
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        examples.PairMap pairMap25 = null;
        examples.PairMap pairMap26 = null;
        fuzzTest24.FuzzTest_getKey(pairMap25, pairMap26, "", "seed2");
        examples.PairMap pairMap30 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_getKey(pairMap30, pairMap31, "", "seed2");
        fuzzTest7.FuzzTest_getKey(pairMap19, pairMap31, "hi!", "old1");
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        examples.PairMap pairMap39 = null;
        examples.PairMap pairMap40 = null;
        fuzzTest38.FuzzTest_getKey(pairMap39, pairMap40, "", "seed2");
        examples.PairMap pairMap44 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_getKey(pairMap44, pairMap45, "", "seed2");
        fuzzTest6.FuzzTest_getKey(pairMap19, pairMap45, "", "hi!");
        examples.PairMap pairMap52 = null;
        examples.PairMap pairMap53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_getKey(pairMap52, pairMap53, "hi!", "");
        examples.PairMap pairMap57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        examples.PairMap pairMap59 = null;
        examples.PairMap pairMap60 = null;
        fuzzTest58.FuzzTest_getKey(pairMap59, pairMap60, "", "seed2");
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        examples.PairMap pairMap65 = null;
        examples.PairMap pairMap66 = null;
        fuzzTest64.FuzzTest_getKey(pairMap65, pairMap66, "", "seed2");
        examples.PairMap pairMap70 = null;
        examples.PairMap pairMap71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_getKey(pairMap70, pairMap71, "old0", "");
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        examples.PairMap pairMap76 = null;
        examples.PairMap pairMap77 = null;
        fuzzTest75.FuzzTest_getKey(pairMap76, pairMap77, "", "seed2");
        examples.PairMap pairMap81 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_getKey(pairMap81, pairMap82, "", "seed2");
        fuzzTest58.FuzzTest_getKey(pairMap70, pairMap82, "hi!", "old1");
        fuzzTest6.FuzzTest_getKey(pairMap57, pairMap82, "", "seed1");
        examples.PairMap pairMap92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap82, pairMap92, "old1", "seed0");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = null;
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "old0", "");
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = null;
        fuzzTest11.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        examples.PairMap pairMap17 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_getKey(pairMap17, pairMap18, "", "seed2");
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        examples.PairMap pairMap23 = null;
        examples.PairMap pairMap24 = null;
        fuzzTest22.FuzzTest_getKey(pairMap23, pairMap24, "", "seed2");
        examples.PairMap pairMap28 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_getKey(pairMap28, pairMap29, "", "seed2");
        fuzzTest0.FuzzTest_getKey(pairMap17, pairMap28, "hi!", "old1");
        examples.PairMap pairMap36 = null;
        examples.PairMap pairMap37 = null;
        fuzzTest0.FuzzTest_getKey(pairMap36, pairMap37, "hi!", "seed2");
        examples.PairMap pairMap41 = null;
        examples.PairMap pairMap42 = null;
        fuzzTest0.FuzzTest_getKey(pairMap41, pairMap42, "hi!", "seed2");
        examples.PairMap pairMap46 = null;
        examples.PairMap pairMap47 = null;
        fuzzTest0.FuzzTest_getKey(pairMap46, pairMap47, "seed0", "old2");
        examples.PairMap pairMap51 = null;
        examples.PairMap pairMap52 = null;
        fuzzTest0.FuzzTest_getKey(pairMap51, pairMap52, "seed2", "hi!");
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        examples.PairMap pairMap57 = null;
        examples.PairMap pairMap58 = null;
        fuzzTest56.FuzzTest_getKey(pairMap57, pairMap58, "seed0", "old2");
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        examples.PairMap pairMap63 = null;
        examples.PairMap pairMap64 = null;
        fuzzTest62.FuzzTest_getKey(pairMap63, pairMap64, "seed0", "old2");
        examples.PairMap pairMap68 = null;
        examples.PairMap pairMap69 = null;
        fuzzTest62.FuzzTest_getKey(pairMap68, pairMap69, "seed1", "seed2");
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        examples.PairMap pairMap74 = null;
        examples.PairMap pairMap75 = null;
        fuzzTest73.FuzzTest_getKey(pairMap74, pairMap75, "", "seed2");
        examples.PairMap pairMap79 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_getKey(pairMap79, pairMap80, "", "seed2");
        examples.PairMap pairMap84 = null;
        fuzzTest62.FuzzTest_getKey(pairMap79, pairMap84, "", "seed0");
        examples.PairMap pairMap88 = null;
        fuzzTest56.FuzzTest_getKey(pairMap79, pairMap88, "old2", "hi!");
        examples.PairMap pairMap92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap79, pairMap92, "old2", "old0");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        examples.PairMap pairMap2 = null;
        examples.PairMap pairMap3 = null;
        fuzzTest1.FuzzTest_getKey(pairMap2, pairMap3, "", "seed2");
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        examples.PairMap pairMap8 = null;
        examples.PairMap pairMap9 = null;
        fuzzTest7.FuzzTest_getKey(pairMap8, pairMap9, "", "seed2");
        examples.PairMap pairMap13 = null;
        examples.PairMap pairMap14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_getKey(pairMap13, pairMap14, "old0", "");
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        examples.PairMap pairMap19 = null;
        examples.PairMap pairMap20 = null;
        fuzzTest18.FuzzTest_getKey(pairMap19, pairMap20, "", "seed2");
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_getKey(pairMap24, pairMap25, "", "seed2");
        fuzzTest1.FuzzTest_getKey(pairMap13, pairMap25, "hi!", "old1");
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        examples.PairMap pairMap33 = null;
        examples.PairMap pairMap34 = null;
        fuzzTest32.FuzzTest_getKey(pairMap33, pairMap34, "", "seed2");
        examples.PairMap pairMap38 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_getKey(pairMap38, pairMap39, "", "seed2");
        fuzzTest0.FuzzTest_getKey(pairMap13, pairMap39, "", "hi!");
        examples.PairMap pairMap46 = null;
        examples.PairMap pairMap47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap46, pairMap47, "hi!", "");
        examples.PairMap pairMap51 = null;
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        examples.PairMap pairMap53 = null;
        examples.PairMap pairMap54 = null;
        fuzzTest52.FuzzTest_getKey(pairMap53, pairMap54, "", "seed2");
        examples.PairMap pairMap58 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_getKey(pairMap58, pairMap59, "", "seed2");
        fuzzTest0.FuzzTest_getKey(pairMap51, pairMap59, "seed2", "old0");
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        examples.PairMap pairMap67 = null;
        examples.PairMap pairMap68 = null;
        fuzzTest66.FuzzTest_getKey(pairMap67, pairMap68, "", "seed2");
        examples.PairMap pairMap72 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_getKey(pairMap72, pairMap73, "", "seed2");
        examples.PairMap pairMap77 = null;
        fuzzTest0.FuzzTest_getKey(pairMap72, pairMap77, "old1", "seed2");
        examples.PairMap pairMap81 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap81, pairMap82, "seed1", "old1");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = null;
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "old0", "");
        examples.PairMap pairMap11 = null;
        examples.PairMap pairMap12 = null;
        fuzzTest0.FuzzTest_getKey(pairMap11, pairMap12, "seed0", "old0");
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        examples.PairMap pairMap17 = null;
        examples.PairMap pairMap18 = null;
        fuzzTest16.FuzzTest_getKey(pairMap17, pairMap18, "seed0", "old2");
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        examples.PairMap pairMap23 = null;
        examples.PairMap pairMap24 = null;
        fuzzTest22.FuzzTest_getKey(pairMap23, pairMap24, "seed0", "old2");
        examples.PairMap pairMap28 = null;
        examples.PairMap pairMap29 = null;
        fuzzTest22.FuzzTest_getKey(pairMap28, pairMap29, "seed1", "seed2");
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        examples.PairMap pairMap34 = null;
        examples.PairMap pairMap35 = null;
        fuzzTest33.FuzzTest_getKey(pairMap34, pairMap35, "", "seed2");
        examples.PairMap pairMap39 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_getKey(pairMap39, pairMap40, "", "seed2");
        examples.PairMap pairMap44 = null;
        fuzzTest22.FuzzTest_getKey(pairMap39, pairMap44, "", "seed0");
        examples.PairMap pairMap48 = null;
        fuzzTest16.FuzzTest_getKey(pairMap39, pairMap48, "old2", "hi!");
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        examples.PairMap pairMap53 = null;
        examples.PairMap pairMap54 = null;
        fuzzTest52.FuzzTest_getKey(pairMap53, pairMap54, "", "seed2");
        examples.PairMap pairMap58 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_getKey(pairMap58, pairMap59, "", "seed2");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap39, pairMap58, "seed2", "seed2");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = null;
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "old0", "");
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = null;
        fuzzTest11.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        examples.PairMap pairMap17 = null;
        examples.PairMap pairMap18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_getKey(pairMap17, pairMap18, "old0", "");
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        examples.PairMap pairMap23 = null;
        examples.PairMap pairMap24 = null;
        fuzzTest22.FuzzTest_getKey(pairMap23, pairMap24, "", "seed2");
        examples.PairMap pairMap28 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_getKey(pairMap28, pairMap29, "", "seed2");
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        examples.PairMap pairMap34 = null;
        examples.PairMap pairMap35 = null;
        fuzzTest33.FuzzTest_getKey(pairMap34, pairMap35, "", "seed2");
        examples.PairMap pairMap39 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_getKey(pairMap39, pairMap40, "", "seed2");
        fuzzTest11.FuzzTest_getKey(pairMap28, pairMap39, "hi!", "old1");
        examples.PairMap pairMap47 = null;
        examples.PairMap pairMap48 = null;
        fuzzTest11.FuzzTest_getKey(pairMap47, pairMap48, "hi!", "seed2");
        examples.PairMap pairMap52 = null;
        examples.PairMap pairMap53 = null;
        fuzzTest11.FuzzTest_getKey(pairMap52, pairMap53, "hi!", "seed2");
        examples.PairMap pairMap57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        examples.PairMap pairMap59 = null;
        examples.PairMap pairMap60 = null;
        fuzzTest58.FuzzTest_getKey(pairMap59, pairMap60, "", "seed2");
        examples.PairMap pairMap64 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_getKey(pairMap64, pairMap65, "", "seed2");
        examples.PairMap pairMap69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        examples.PairMap pairMap71 = null;
        examples.PairMap pairMap72 = null;
        fuzzTest70.FuzzTest_getKey(pairMap71, pairMap72, "", "seed2");
        examples.PairMap pairMap76 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_getKey(pairMap76, pairMap77, "", "seed2");
        fuzzTest58.FuzzTest_getKey(pairMap69, pairMap77, "hi!", "hi!");
        fuzzTest11.FuzzTest_getKey(pairMap57, pairMap69, "seed1", "old0");
        examples.PairMap pairMap87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap69, pairMap87, "old0", "seed2");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "", "seed2");
        examples.PairMap pairMap11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        examples.PairMap pairMap13 = null;
        examples.PairMap pairMap14 = null;
        fuzzTest12.FuzzTest_getKey(pairMap13, pairMap14, "", "seed2");
        examples.PairMap pairMap18 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_getKey(pairMap18, pairMap19, "", "seed2");
        fuzzTest0.FuzzTest_getKey(pairMap11, pairMap19, "hi!", "hi!");
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        examples.PairMap pairMap27 = null;
        examples.PairMap pairMap28 = null;
        fuzzTest26.FuzzTest_getKey(pairMap27, pairMap28, "", "seed2");
        examples.PairMap pairMap32 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_getKey(pairMap32, pairMap33, "", "seed2");
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        examples.PairMap pairMap38 = null;
        examples.PairMap pairMap39 = null;
        fuzzTest37.FuzzTest_getKey(pairMap38, pairMap39, "", "seed2");
        examples.PairMap pairMap43 = null;
        examples.PairMap pairMap44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_getKey(pairMap43, pairMap44, "old0", "");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap32, pairMap44, "old1", "");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "", "seed2");
        examples.PairMap pairMap11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        examples.PairMap pairMap13 = null;
        examples.PairMap pairMap14 = null;
        fuzzTest12.FuzzTest_getKey(pairMap13, pairMap14, "", "seed2");
        examples.PairMap pairMap18 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_getKey(pairMap18, pairMap19, "", "seed2");
        fuzzTest0.FuzzTest_getKey(pairMap11, pairMap18, "hi!", "hi!");
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        examples.PairMap pairMap27 = null;
        examples.PairMap pairMap28 = null;
        fuzzTest26.FuzzTest_getKey(pairMap27, pairMap28, "", "seed2");
        examples.PairMap pairMap32 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_getKey(pairMap32, pairMap33, "", "seed2");
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        examples.PairMap pairMap38 = null;
        examples.PairMap pairMap39 = null;
        fuzzTest37.FuzzTest_getKey(pairMap38, pairMap39, "", "seed2");
        examples.PairMap pairMap43 = null;
        examples.PairMap pairMap44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_getKey(pairMap43, pairMap44, "old0", "");
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        examples.PairMap pairMap49 = null;
        examples.PairMap pairMap50 = null;
        fuzzTest48.FuzzTest_getKey(pairMap49, pairMap50, "", "seed2");
        examples.PairMap pairMap54 = null;
        examples.PairMap pairMap55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_getKey(pairMap54, pairMap55, "old0", "");
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        examples.PairMap pairMap60 = null;
        examples.PairMap pairMap61 = null;
        fuzzTest59.FuzzTest_getKey(pairMap60, pairMap61, "", "seed2");
        examples.PairMap pairMap65 = null;
        examples.PairMap pairMap66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_getKey(pairMap65, pairMap66, "old0", "");
        examples.PairMap pairMap70 = null;
        fuzzTest48.FuzzTest_getKey(pairMap66, pairMap70, "old2", "old0");
        fuzzTest26.FuzzTest_getKey(pairMap44, pairMap66, "", "hi!");
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        examples.PairMap pairMap78 = null;
        examples.PairMap pairMap79 = null;
        fuzzTest77.FuzzTest_getKey(pairMap78, pairMap79, "", "seed2");
        examples.PairMap pairMap83 = null;
        examples.PairMap pairMap84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_getKey(pairMap83, pairMap84, "old0", "");
        examples.PairMap pairMap88 = null;
        fuzzTest26.FuzzTest_getKey(pairMap84, pairMap88, "old0", "");
        examples.PairMap pairMap92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap84, pairMap92, "old1", "");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        examples.PairMap pairMap2 = null;
        examples.PairMap pairMap3 = null;
        fuzzTest1.FuzzTest_getKey(pairMap2, pairMap3, "", "seed2");
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        examples.PairMap pairMap8 = null;
        examples.PairMap pairMap9 = null;
        fuzzTest7.FuzzTest_getKey(pairMap8, pairMap9, "", "seed2");
        examples.PairMap pairMap13 = null;
        examples.PairMap pairMap14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_getKey(pairMap13, pairMap14, "old0", "");
        examples.PairMap pairMap18 = null;
        fuzzTest1.FuzzTest_getKey(pairMap14, pairMap18, "", "seed1");
        examples.PairMap pairMap22 = null;
        fuzzTest0.FuzzTest_getKey(pairMap18, pairMap22, "seed0", "seed1");
        examples.PairMap pairMap26 = null;
        examples.PairMap pairMap27 = null;
        fuzzTest0.FuzzTest_getKey(pairMap26, pairMap27, "", "hi!");
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        examples.PairMap pairMap32 = null;
        examples.PairMap pairMap33 = null;
        fuzzTest31.FuzzTest_getKey(pairMap32, pairMap33, "", "seed2");
        examples.PairMap pairMap37 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_getKey(pairMap37, pairMap38, "", "seed2");
        examples.PairMap pairMap42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        examples.PairMap pairMap44 = null;
        examples.PairMap pairMap45 = null;
        fuzzTest43.FuzzTest_getKey(pairMap44, pairMap45, "", "seed2");
        examples.PairMap pairMap49 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_getKey(pairMap49, pairMap50, "", "seed2");
        fuzzTest31.FuzzTest_getKey(pairMap42, pairMap50, "hi!", "hi!");
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        examples.PairMap pairMap58 = null;
        examples.PairMap pairMap59 = null;
        fuzzTest57.FuzzTest_getKey(pairMap58, pairMap59, "", "seed2");
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        examples.PairMap pairMap64 = null;
        examples.PairMap pairMap65 = null;
        fuzzTest63.FuzzTest_getKey(pairMap64, pairMap65, "", "seed2");
        examples.PairMap pairMap69 = null;
        examples.PairMap pairMap70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_getKey(pairMap69, pairMap70, "old0", "");
        examples.PairMap pairMap74 = null;
        fuzzTest57.FuzzTest_getKey(pairMap70, pairMap74, "", "seed1");
        examples.PairMap pairMap78 = null;
        examples.PairMap pairMap79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_getKey(pairMap78, pairMap79, "seed1", "");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap42, pairMap79, "old2", "seed2");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        examples.PairMap pairMap3 = null;
        examples.PairMap pairMap4 = null;
        fuzzTest2.FuzzTest_getKey(pairMap3, pairMap4, "", "seed2");
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        examples.PairMap pairMap9 = null;
        examples.PairMap pairMap10 = null;
        fuzzTest8.FuzzTest_getKey(pairMap9, pairMap10, "", "seed2");
        examples.PairMap pairMap14 = null;
        examples.PairMap pairMap15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_getKey(pairMap14, pairMap15, "old0", "");
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        examples.PairMap pairMap20 = null;
        examples.PairMap pairMap21 = null;
        fuzzTest19.FuzzTest_getKey(pairMap20, pairMap21, "", "seed2");
        examples.PairMap pairMap25 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_getKey(pairMap25, pairMap26, "", "seed2");
        fuzzTest2.FuzzTest_getKey(pairMap14, pairMap26, "hi!", "old1");
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        examples.PairMap pairMap34 = null;
        examples.PairMap pairMap35 = null;
        fuzzTest33.FuzzTest_getKey(pairMap34, pairMap35, "", "seed2");
        examples.PairMap pairMap39 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_getKey(pairMap39, pairMap40, "", "seed2");
        examples.PairMap pairMap44 = null;
        fuzzTest2.FuzzTest_getKey(pairMap40, pairMap44, "hi!", "");
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap44, "seed2", "seed0");
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        examples.PairMap pairMap52 = null;
        examples.PairMap pairMap53 = null;
        fuzzTest51.FuzzTest_getKey(pairMap52, pairMap53, "", "seed2");
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        examples.PairMap pairMap58 = null;
        examples.PairMap pairMap59 = null;
        fuzzTest57.FuzzTest_getKey(pairMap58, pairMap59, "", "seed2");
        examples.PairMap pairMap63 = null;
        examples.PairMap pairMap64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_getKey(pairMap63, pairMap64, "old0", "");
        examples.PairMap pairMap68 = null;
        fuzzTest51.FuzzTest_getKey(pairMap64, pairMap68, "", "seed1");
        examples.PairMap pairMap72 = null;
        fuzzTest0.FuzzTest_getKey(pairMap68, pairMap72, "seed0", "seed0");
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        examples.PairMap pairMap77 = null;
        examples.PairMap pairMap78 = null;
        fuzzTest76.FuzzTest_getKey(pairMap77, pairMap78, "", "seed2");
        examples.PairMap pairMap82 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_getKey(pairMap82, pairMap83, "", "seed2");
        examples.PairMap pairMap87 = null;
        fuzzTest0.FuzzTest_getKey(pairMap83, pairMap87, "", "hi!");
        examples.PairMap pairMap91 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap91, pairMap92, "old0", "old0");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "", "seed2");
        examples.PairMap pairMap11 = null;
        examples.PairMap pairMap12 = null;
        fuzzTest0.FuzzTest_getKey(pairMap11, pairMap12, "hi!", "old1");
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        examples.PairMap pairMap17 = null;
        examples.PairMap pairMap18 = null;
        fuzzTest16.FuzzTest_getKey(pairMap17, pairMap18, "", "seed2");
        examples.PairMap pairMap22 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_getKey(pairMap22, pairMap23, "", "seed2");
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        examples.PairMap pairMap28 = null;
        examples.PairMap pairMap29 = null;
        fuzzTest27.FuzzTest_getKey(pairMap28, pairMap29, "", "seed2");
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        examples.PairMap pairMap34 = null;
        examples.PairMap pairMap35 = null;
        fuzzTest33.FuzzTest_getKey(pairMap34, pairMap35, "", "seed2");
        examples.PairMap pairMap39 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_getKey(pairMap39, pairMap40, "", "seed2");
        examples.PairMap pairMap44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        examples.PairMap pairMap46 = null;
        examples.PairMap pairMap47 = null;
        fuzzTest45.FuzzTest_getKey(pairMap46, pairMap47, "", "seed2");
        examples.PairMap pairMap51 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_getKey(pairMap51, pairMap52, "", "seed2");
        fuzzTest33.FuzzTest_getKey(pairMap44, pairMap51, "hi!", "hi!");
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        examples.PairMap pairMap60 = null;
        examples.PairMap pairMap61 = null;
        fuzzTest59.FuzzTest_getKey(pairMap60, pairMap61, "", "seed2");
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        examples.PairMap pairMap66 = null;
        examples.PairMap pairMap67 = null;
        fuzzTest65.FuzzTest_getKey(pairMap66, pairMap67, "", "seed2");
        examples.PairMap pairMap71 = null;
        examples.PairMap pairMap72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_getKey(pairMap71, pairMap72, "old0", "");
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        examples.PairMap pairMap77 = null;
        examples.PairMap pairMap78 = null;
        fuzzTest76.FuzzTest_getKey(pairMap77, pairMap78, "", "seed2");
        examples.PairMap pairMap82 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_getKey(pairMap82, pairMap83, "", "seed2");
        fuzzTest59.FuzzTest_getKey(pairMap71, pairMap83, "hi!", "old1");
        fuzzTest27.FuzzTest_getKey(pairMap51, pairMap83, "seed2", "old1");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap22, pairMap51, "old1", "old2");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "", "seed2");
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = null;
        fuzzTest11.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        examples.PairMap pairMap17 = null;
        examples.PairMap pairMap18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_getKey(pairMap17, pairMap18, "old0", "");
        examples.PairMap pairMap22 = null;
        examples.PairMap pairMap23 = null;
        fuzzTest11.FuzzTest_getKey(pairMap22, pairMap23, "seed2", "seed0");
        examples.PairMap pairMap27 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap28 = null;
        fuzzTest11.FuzzTest_getKey(pairMap27, pairMap28, "seed0", "hi!");
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        examples.PairMap pairMap33 = null;
        examples.PairMap pairMap34 = null;
        fuzzTest32.FuzzTest_getKey(pairMap33, pairMap34, "seed0", "old2");
        examples.PairMap pairMap38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        examples.PairMap pairMap40 = null;
        examples.PairMap pairMap41 = null;
        fuzzTest39.FuzzTest_getKey(pairMap40, pairMap41, "", "seed2");
        examples.PairMap pairMap45 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_getKey(pairMap45, pairMap46, "", "seed2");
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        examples.PairMap pairMap51 = null;
        examples.PairMap pairMap52 = null;
        fuzzTest50.FuzzTest_getKey(pairMap51, pairMap52, "", "seed2");
        examples.PairMap pairMap56 = null;
        examples.PairMap pairMap57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_getKey(pairMap56, pairMap57, "old0", "");
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        examples.PairMap pairMap62 = null;
        examples.PairMap pairMap63 = null;
        fuzzTest61.FuzzTest_getKey(pairMap62, pairMap63, "", "seed2");
        examples.PairMap pairMap67 = null;
        examples.PairMap pairMap68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_getKey(pairMap67, pairMap68, "old0", "");
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        examples.PairMap pairMap73 = null;
        examples.PairMap pairMap74 = null;
        fuzzTest72.FuzzTest_getKey(pairMap73, pairMap74, "", "seed2");
        examples.PairMap pairMap78 = null;
        examples.PairMap pairMap79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_getKey(pairMap78, pairMap79, "old0", "");
        examples.PairMap pairMap83 = null;
        fuzzTest61.FuzzTest_getKey(pairMap79, pairMap83, "old2", "old0");
        fuzzTest39.FuzzTest_getKey(pairMap57, pairMap79, "", "hi!");
        fuzzTest32.FuzzTest_getKey(pairMap38, pairMap79, "old1", "hi!");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap27, pairMap79, "seed2", "seed1");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "seed0", "old2");
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        examples.PairMap pairMap7 = null;
        examples.PairMap pairMap8 = null;
        fuzzTest6.FuzzTest_getKey(pairMap7, pairMap8, "seed0", "old2");
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = null;
        fuzzTest6.FuzzTest_getKey(pairMap12, pairMap13, "seed1", "seed2");
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        examples.PairMap pairMap18 = null;
        examples.PairMap pairMap19 = null;
        fuzzTest17.FuzzTest_getKey(pairMap18, pairMap19, "", "seed2");
        examples.PairMap pairMap23 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_getKey(pairMap23, pairMap24, "", "seed2");
        examples.PairMap pairMap28 = null;
        fuzzTest6.FuzzTest_getKey(pairMap23, pairMap28, "", "seed0");
        examples.PairMap pairMap32 = null;
        fuzzTest0.FuzzTest_getKey(pairMap23, pairMap32, "old2", "hi!");
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        examples.PairMap pairMap37 = null;
        examples.PairMap pairMap38 = null;
        fuzzTest36.FuzzTest_getKey(pairMap37, pairMap38, "", "seed2");
        examples.PairMap pairMap42 = null;
        examples.PairMap pairMap43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_getKey(pairMap42, pairMap43, "old0", "");
        examples.PairMap pairMap47 = null;
        examples.PairMap pairMap48 = null;
        fuzzTest36.FuzzTest_getKey(pairMap47, pairMap48, "seed2", "seed0");
        examples.PairMap pairMap52 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap53 = null;
        fuzzTest36.FuzzTest_getKey(pairMap52, pairMap53, "seed0", "hi!");
        examples.PairMap pairMap57 = null;
        fuzzTest0.FuzzTest_getKey(pairMap53, pairMap57, "hi!", "old0");
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        examples.PairMap pairMap62 = null;
        examples.PairMap pairMap63 = null;
        fuzzTest61.FuzzTest_getKey(pairMap62, pairMap63, "", "seed2");
        examples.PairMap pairMap67 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_getKey(pairMap67, pairMap68, "", "seed2");
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        examples.PairMap pairMap73 = null;
        examples.PairMap pairMap74 = null;
        fuzzTest72.FuzzTest_getKey(pairMap73, pairMap74, "", "seed2");
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        examples.PairMap pairMap79 = null;
        examples.PairMap pairMap80 = null;
        fuzzTest78.FuzzTest_getKey(pairMap79, pairMap80, "", "seed2");
        examples.PairMap pairMap84 = null;
        examples.PairMap pairMap85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_getKey(pairMap84, pairMap85, "old0", "");
        examples.PairMap pairMap89 = null;
        fuzzTest72.FuzzTest_getKey(pairMap85, pairMap89, "", "seed1");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap67, pairMap85, "old0", "old0");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        examples.PairMap pairMap2 = null;
        examples.PairMap pairMap3 = null;
        fuzzTest1.FuzzTest_getKey(pairMap2, pairMap3, "", "seed2");
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        examples.PairMap pairMap8 = null;
        examples.PairMap pairMap9 = null;
        fuzzTest7.FuzzTest_getKey(pairMap8, pairMap9, "", "seed2");
        examples.PairMap pairMap13 = null;
        examples.PairMap pairMap14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_getKey(pairMap13, pairMap14, "old0", "");
        examples.PairMap pairMap18 = null;
        fuzzTest1.FuzzTest_getKey(pairMap14, pairMap18, "", "seed1");
        examples.PairMap pairMap22 = null;
        fuzzTest0.FuzzTest_getKey(pairMap18, pairMap22, "seed0", "seed1");
        examples.PairMap pairMap26 = null;
        examples.PairMap pairMap27 = null;
        fuzzTest0.FuzzTest_getKey(pairMap26, pairMap27, "hi!", "seed2");
        examples.PairMap pairMap31 = null;
        examples.PairMap pairMap32 = null;
        fuzzTest0.FuzzTest_getKey(pairMap31, pairMap32, "seed0", "");
        examples.PairMap pairMap36 = null;
        examples.PairMap pairMap37 = null;
        fuzzTest0.FuzzTest_getKey(pairMap36, pairMap37, "seed1", "old1");
        examples.PairMap pairMap41 = null;
        examples.PairMap pairMap42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap41, pairMap42, "old0", "");
        examples.PairMap pairMap46 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap47 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap46, pairMap47, "old1", "hi!");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        examples.PairMap pairMap7 = null;
        examples.PairMap pairMap8 = null;
        fuzzTest6.FuzzTest_getKey(pairMap7, pairMap8, "", "seed2");
        examples.PairMap pairMap12 = null;
        examples.PairMap pairMap13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_getKey(pairMap12, pairMap13, "old0", "");
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        examples.PairMap pairMap18 = null;
        examples.PairMap pairMap19 = null;
        fuzzTest17.FuzzTest_getKey(pairMap18, pairMap19, "", "seed2");
        examples.PairMap pairMap23 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_getKey(pairMap23, pairMap24, "", "seed2");
        fuzzTest0.FuzzTest_getKey(pairMap12, pairMap24, "hi!", "old1");
        examples.PairMap pairMap31 = null;
        examples.PairMap pairMap32 = null;
        fuzzTest0.FuzzTest_getKey(pairMap31, pairMap32, "old1", "");
        examples.PairMap pairMap36 = null;
        examples.PairMap pairMap37 = null;
        fuzzTest0.FuzzTest_getKey(pairMap36, pairMap37, "seed1", "hi!");
        examples.PairMap pairMap41 = null;
        examples.PairMap pairMap42 = null;
        fuzzTest0.FuzzTest_getKey(pairMap41, pairMap42, "old0", "");
        examples.PairMap pairMap46 = null;
        examples.PairMap pairMap47 = null;
        fuzzTest0.FuzzTest_getKey(pairMap46, pairMap47, "old1", "old2");
        examples.PairMap pairMap51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        examples.PairMap pairMap53 = null;
        examples.PairMap pairMap54 = null;
        fuzzTest52.FuzzTest_getKey(pairMap53, pairMap54, "", "seed2");
        examples.PairMap pairMap58 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_getKey(pairMap58, pairMap59, "", "seed2");
        examples.PairMap pairMap63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        examples.PairMap pairMap65 = null;
        examples.PairMap pairMap66 = null;
        fuzzTest64.FuzzTest_getKey(pairMap65, pairMap66, "", "seed2");
        examples.PairMap pairMap70 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_getKey(pairMap70, pairMap71, "", "seed2");
        fuzzTest52.FuzzTest_getKey(pairMap63, pairMap71, "hi!", "hi!");
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        examples.PairMap pairMap79 = null;
        examples.PairMap pairMap80 = null;
        fuzzTest78.FuzzTest_getKey(pairMap79, pairMap80, "", "seed2");
        examples.PairMap pairMap84 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_getKey(pairMap84, pairMap85, "", "seed2");
        examples.PairMap pairMap89 = null;
        fuzzTest52.FuzzTest_getKey(pairMap85, pairMap89, "hi!", "seed0");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap51, pairMap85, "old2", "seed0");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "seed0", "old2");
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        examples.PairMap pairMap7 = null;
        examples.PairMap pairMap8 = null;
        fuzzTest6.FuzzTest_getKey(pairMap7, pairMap8, "", "seed2");
        examples.PairMap pairMap12 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        examples.PairMap pairMap17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        examples.PairMap pairMap19 = null;
        examples.PairMap pairMap20 = null;
        fuzzTest18.FuzzTest_getKey(pairMap19, pairMap20, "", "seed2");
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_getKey(pairMap24, pairMap25, "", "seed2");
        fuzzTest6.FuzzTest_getKey(pairMap17, pairMap24, "hi!", "hi!");
        examples.PairMap pairMap32 = null;
        fuzzTest0.FuzzTest_getKey(pairMap24, pairMap32, "hi!", "seed1");
        examples.PairMap pairMap36 = null;
        examples.PairMap pairMap37 = null;
        fuzzTest0.FuzzTest_getKey(pairMap36, pairMap37, "", "seed2");
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        examples.PairMap pairMap42 = null;
        examples.PairMap pairMap43 = null;
        fuzzTest41.FuzzTest_getKey(pairMap42, pairMap43, "", "seed2");
        examples.PairMap pairMap47 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_getKey(pairMap47, pairMap48, "", "seed2");
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        examples.PairMap pairMap53 = null;
        examples.PairMap pairMap54 = null;
        fuzzTest52.FuzzTest_getKey(pairMap53, pairMap54, "", "seed2");
        examples.PairMap pairMap58 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_getKey(pairMap58, pairMap59, "", "seed2");
        examples.PairMap pairMap63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        examples.PairMap pairMap65 = null;
        examples.PairMap pairMap66 = null;
        fuzzTest64.FuzzTest_getKey(pairMap65, pairMap66, "", "seed2");
        examples.PairMap pairMap70 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_getKey(pairMap70, pairMap71, "", "seed2");
        fuzzTest52.FuzzTest_getKey(pairMap63, pairMap70, "hi!", "hi!");
        examples.PairMap pairMap78 = null;
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        examples.PairMap pairMap80 = null;
        examples.PairMap pairMap81 = null;
        fuzzTest79.FuzzTest_getKey(pairMap80, pairMap81, "", "seed2");
        examples.PairMap pairMap85 = null;
        examples.PairMap pairMap86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_getKey(pairMap85, pairMap86, "old0", "");
        fuzzTest52.FuzzTest_getKey(pairMap78, pairMap86, "seed2", "seed2");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap47, pairMap86, "seed1", "seed1");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = null;
        examples.PairMap pairMap7 = null;
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "old2", "seed2");
        examples.PairMap pairMap11 = null;
        examples.PairMap pairMap12 = null;
        fuzzTest0.FuzzTest_getKey(pairMap11, pairMap12, "", "seed1");
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        examples.PairMap pairMap17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        examples.PairMap pairMap19 = null;
        examples.PairMap pairMap20 = null;
        fuzzTest18.FuzzTest_getKey(pairMap19, pairMap20, "", "seed2");
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_getKey(pairMap24, pairMap25, "", "seed2");
        examples.PairMap pairMap29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        examples.PairMap pairMap31 = null;
        examples.PairMap pairMap32 = null;
        fuzzTest30.FuzzTest_getKey(pairMap31, pairMap32, "", "seed2");
        examples.PairMap pairMap36 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_getKey(pairMap36, pairMap37, "", "seed2");
        fuzzTest18.FuzzTest_getKey(pairMap29, pairMap37, "hi!", "hi!");
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        examples.PairMap pairMap45 = null;
        examples.PairMap pairMap46 = null;
        fuzzTest44.FuzzTest_getKey(pairMap45, pairMap46, "", "seed2");
        examples.PairMap pairMap50 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_getKey(pairMap50, pairMap51, "", "seed2");
        examples.PairMap pairMap55 = null;
        fuzzTest18.FuzzTest_getKey(pairMap51, pairMap55, "hi!", "seed0");
        fuzzTest16.FuzzTest_getKey(pairMap17, pairMap55, "seed1", "");
        examples.PairMap pairMap62 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap63 = null;
        fuzzTest16.FuzzTest_getKey(pairMap62, pairMap63, "old1", "old0");
        examples.PairMap pairMap67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        examples.PairMap pairMap69 = null;
        examples.PairMap pairMap70 = null;
        fuzzTest68.FuzzTest_getKey(pairMap69, pairMap70, "", "seed2");
        examples.PairMap pairMap74 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_getKey(pairMap74, pairMap75, "", "seed2");
        fuzzTest16.FuzzTest_getKey(pairMap67, pairMap74, "hi!", "seed2");
        examples.PairMap pairMap82 = null;
        examples.PairMap pairMap83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_getKey(pairMap82, pairMap83, "old0", "seed0");
        examples.PairMap pairMap87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap83, pairMap87, "old1", "old1");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = null;
        examples.PairMap pairMap7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "old0", "");
        examples.PairMap pairMap11 = null;
        examples.PairMap pairMap12 = null;
        fuzzTest0.FuzzTest_getKey(pairMap11, pairMap12, "seed0", "old0");
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        examples.PairMap pairMap17 = null;
        examples.PairMap pairMap18 = null;
        fuzzTest16.FuzzTest_getKey(pairMap17, pairMap18, "", "seed2");
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        examples.PairMap pairMap23 = null;
        examples.PairMap pairMap24 = null;
        fuzzTest22.FuzzTest_getKey(pairMap23, pairMap24, "", "seed2");
        examples.PairMap pairMap28 = null;
        examples.PairMap pairMap29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_getKey(pairMap28, pairMap29, "old0", "");
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        examples.PairMap pairMap34 = null;
        examples.PairMap pairMap35 = null;
        fuzzTest33.FuzzTest_getKey(pairMap34, pairMap35, "", "seed2");
        examples.PairMap pairMap39 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_getKey(pairMap39, pairMap40, "", "seed2");
        fuzzTest16.FuzzTest_getKey(pairMap28, pairMap40, "hi!", "old1");
        examples.PairMap pairMap47 = null;
        fuzzTest0.FuzzTest_getKey(pairMap40, pairMap47, "seed0", "old2");
        examples.PairMap pairMap51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        examples.PairMap pairMap53 = null;
        examples.PairMap pairMap54 = null;
        fuzzTest52.FuzzTest_getKey(pairMap53, pairMap54, "", "seed2");
        examples.PairMap pairMap58 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_getKey(pairMap58, pairMap59, "", "seed2");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap51, pairMap58, "seed0", "hi!");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "seed0", "old2");
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        examples.PairMap pairMap7 = null;
        examples.PairMap pairMap8 = null;
        fuzzTest6.FuzzTest_getKey(pairMap7, pairMap8, "", "seed2");
        examples.PairMap pairMap12 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        examples.PairMap pairMap17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        examples.PairMap pairMap19 = null;
        examples.PairMap pairMap20 = null;
        fuzzTest18.FuzzTest_getKey(pairMap19, pairMap20, "", "seed2");
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_getKey(pairMap24, pairMap25, "", "seed2");
        fuzzTest6.FuzzTest_getKey(pairMap17, pairMap24, "hi!", "hi!");
        examples.PairMap pairMap32 = null;
        fuzzTest0.FuzzTest_getKey(pairMap24, pairMap32, "hi!", "seed1");
        examples.PairMap pairMap36 = null;
        examples.PairMap pairMap37 = null;
        fuzzTest0.FuzzTest_getKey(pairMap36, pairMap37, "seed2", "old1");
        examples.PairMap pairMap41 = null;
        examples.PairMap pairMap42 = null;
        fuzzTest0.FuzzTest_getKey(pairMap41, pairMap42, "old0", "seed0");
        examples.PairMap pairMap46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        examples.PairMap pairMap48 = null;
        examples.PairMap pairMap49 = null;
        fuzzTest47.FuzzTest_getKey(pairMap48, pairMap49, "", "seed2");
        examples.PairMap pairMap53 = null;
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        examples.PairMap pairMap55 = null;
        examples.PairMap pairMap56 = null;
        fuzzTest54.FuzzTest_getKey(pairMap55, pairMap56, "", "seed2");
        examples.PairMap pairMap60 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_getKey(pairMap60, pairMap61, "", "seed2");
        fuzzTest47.FuzzTest_getKey(pairMap53, pairMap61, "hi!", "seed0");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap46, pairMap61, "seed2", "seed0");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        examples.PairMap pairMap3 = null;
        examples.PairMap pairMap4 = null;
        fuzzTest2.FuzzTest_getKey(pairMap3, pairMap4, "", "seed2");
        examples.PairMap pairMap8 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_getKey(pairMap8, pairMap9, "", "seed2");
        examples.PairMap pairMap13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        examples.PairMap pairMap15 = null;
        examples.PairMap pairMap16 = null;
        fuzzTest14.FuzzTest_getKey(pairMap15, pairMap16, "", "seed2");
        examples.PairMap pairMap20 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_getKey(pairMap20, pairMap21, "", "seed2");
        fuzzTest2.FuzzTest_getKey(pairMap13, pairMap21, "hi!", "hi!");
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        examples.PairMap pairMap29 = null;
        examples.PairMap pairMap30 = null;
        fuzzTest28.FuzzTest_getKey(pairMap29, pairMap30, "", "seed2");
        examples.PairMap pairMap34 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_getKey(pairMap34, pairMap35, "", "seed2");
        examples.PairMap pairMap39 = null;
        fuzzTest2.FuzzTest_getKey(pairMap35, pairMap39, "hi!", "seed0");
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap39, "seed1", "");
        examples.PairMap pairMap46 = null;
        examples.PairMap pairMap47 = null;
        fuzzTest0.FuzzTest_getKey(pairMap46, pairMap47, "seed0", "seed2");
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        examples.PairMap pairMap52 = null;
        examples.PairMap pairMap53 = null;
        fuzzTest51.FuzzTest_getKey(pairMap52, pairMap53, "", "seed2");
        examples.PairMap pairMap57 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_getKey(pairMap57, pairMap58, "", "seed2");
        examples.PairMap pairMap62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        examples.PairMap pairMap64 = null;
        examples.PairMap pairMap65 = null;
        fuzzTest63.FuzzTest_getKey(pairMap64, pairMap65, "", "seed2");
        examples.PairMap pairMap69 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_getKey(pairMap69, pairMap70, "", "seed2");
        fuzzTest51.FuzzTest_getKey(pairMap62, pairMap70, "hi!", "hi!");
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        examples.PairMap pairMap78 = null;
        examples.PairMap pairMap79 = null;
        fuzzTest77.FuzzTest_getKey(pairMap78, pairMap79, "", "seed2");
        examples.PairMap pairMap83 = null;
        examples.PairMap pairMap84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_getKey(pairMap83, pairMap84, "old0", "");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap62, pairMap84, "old2", "seed1");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "seed0", "old2");
        examples.PairMap pairMap6 = null;
        examples.PairMap pairMap7 = null;
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap7, "seed1", "seed2");
        examples.PairMap pairMap11 = null;
        examples.PairMap pairMap12 = null;
        fuzzTest0.FuzzTest_getKey(pairMap11, pairMap12, "old2", "old2");
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        examples.PairMap pairMap18 = null;
        examples.PairMap pairMap19 = null;
        fuzzTest17.FuzzTest_getKey(pairMap18, pairMap19, "", "seed2");
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        examples.PairMap pairMap24 = null;
        examples.PairMap pairMap25 = null;
        fuzzTest23.FuzzTest_getKey(pairMap24, pairMap25, "", "seed2");
        examples.PairMap pairMap29 = null;
        examples.PairMap pairMap30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_getKey(pairMap29, pairMap30, "old0", "");
        examples.PairMap pairMap34 = null;
        fuzzTest17.FuzzTest_getKey(pairMap30, pairMap34, "", "seed1");
        examples.PairMap pairMap38 = null;
        fuzzTest16.FuzzTest_getKey(pairMap34, pairMap38, "seed0", "seed1");
        examples.PairMap pairMap42 = null;
        examples.PairMap pairMap43 = null;
        fuzzTest16.FuzzTest_getKey(pairMap42, pairMap43, "hi!", "seed2");
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        examples.PairMap pairMap48 = null;
        examples.PairMap pairMap49 = null;
        fuzzTest47.FuzzTest_getKey(pairMap48, pairMap49, "seed0", "old2");
        examples.PairMap pairMap53 = null;
        examples.PairMap pairMap54 = null;
        fuzzTest47.FuzzTest_getKey(pairMap53, pairMap54, "seed1", "seed2");
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        examples.PairMap pairMap59 = null;
        examples.PairMap pairMap60 = null;
        fuzzTest58.FuzzTest_getKey(pairMap59, pairMap60, "", "seed2");
        examples.PairMap pairMap64 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_getKey(pairMap64, pairMap65, "", "seed2");
        examples.PairMap pairMap69 = null;
        fuzzTest47.FuzzTest_getKey(pairMap64, pairMap69, "", "seed0");
        examples.PairMap pairMap73 = null;
        fuzzTest16.FuzzTest_getKey(pairMap64, pairMap73, "seed1", "old1");
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        examples.PairMap pairMap78 = null;
        examples.PairMap pairMap79 = null;
        fuzzTest77.FuzzTest_getKey(pairMap78, pairMap79, "", "seed2");
        examples.PairMap pairMap83 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_getKey(pairMap83, pairMap84, "", "seed2");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap64, pairMap84, "seed0", "seed0");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "", "seed2");
        examples.PairMap pairMap6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        examples.PairMap pairMap8 = null;
        examples.PairMap pairMap9 = null;
        fuzzTest7.FuzzTest_getKey(pairMap8, pairMap9, "", "seed2");
        examples.PairMap pairMap13 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_getKey(pairMap13, pairMap14, "", "seed2");
        fuzzTest0.FuzzTest_getKey(pairMap6, pairMap14, "hi!", "seed0");
        examples.PairMap pairMap21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        examples.PairMap pairMap23 = null;
        examples.PairMap pairMap24 = null;
        fuzzTest22.FuzzTest_getKey(pairMap23, pairMap24, "", "seed2");
        examples.PairMap pairMap28 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_getKey(pairMap28, pairMap29, "", "seed2");
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        examples.PairMap pairMap34 = null;
        examples.PairMap pairMap35 = null;
        fuzzTest33.FuzzTest_getKey(pairMap34, pairMap35, "", "seed2");
        examples.PairMap pairMap39 = null;
        examples.PairMap pairMap40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_getKey(pairMap39, pairMap40, "old0", "");
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        examples.PairMap pairMap45 = null;
        examples.PairMap pairMap46 = null;
        fuzzTest44.FuzzTest_getKey(pairMap45, pairMap46, "", "seed2");
        examples.PairMap pairMap50 = null;
        examples.PairMap pairMap51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_getKey(pairMap50, pairMap51, "old0", "");
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        examples.PairMap pairMap56 = null;
        examples.PairMap pairMap57 = null;
        fuzzTest55.FuzzTest_getKey(pairMap56, pairMap57, "", "seed2");
        examples.PairMap pairMap61 = null;
        examples.PairMap pairMap62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_getKey(pairMap61, pairMap62, "old0", "");
        examples.PairMap pairMap66 = null;
        fuzzTest44.FuzzTest_getKey(pairMap62, pairMap66, "old2", "old0");
        fuzzTest22.FuzzTest_getKey(pairMap40, pairMap62, "", "hi!");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap21, pairMap62, "seed2", "old0");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        examples.PairMap pairMap1 = null;
        examples.PairMap pairMap2 = null;
        fuzzTest0.FuzzTest_getKey(pairMap1, pairMap2, "seed0", "old2");
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        examples.PairMap pairMap7 = null;
        examples.PairMap pairMap8 = null;
        fuzzTest6.FuzzTest_getKey(pairMap7, pairMap8, "", "seed2");
        examples.PairMap pairMap12 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_getKey(pairMap12, pairMap13, "", "seed2");
        examples.PairMap pairMap17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        examples.PairMap pairMap19 = null;
        examples.PairMap pairMap20 = null;
        fuzzTest18.FuzzTest_getKey(pairMap19, pairMap20, "", "seed2");
        examples.PairMap pairMap24 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_getKey(pairMap24, pairMap25, "", "seed2");
        fuzzTest6.FuzzTest_getKey(pairMap17, pairMap24, "hi!", "hi!");
        examples.PairMap pairMap32 = null;
        fuzzTest0.FuzzTest_getKey(pairMap24, pairMap32, "hi!", "seed1");
        examples.PairMap pairMap36 = null;
        examples.PairMap pairMap37 = null;
        fuzzTest0.FuzzTest_getKey(pairMap36, pairMap37, "seed2", "old1");
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        examples.PairMap pairMap42 = null;
        examples.PairMap pairMap43 = null;
        fuzzTest41.FuzzTest_getKey(pairMap42, pairMap43, "", "seed2");
        examples.PairMap pairMap47 = fuzztests.FuzzTest.makeFuzzInput();
        examples.PairMap pairMap48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_getKey(pairMap47, pairMap48, "", "seed2");
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        examples.PairMap pairMap53 = null;
        examples.PairMap pairMap54 = null;
        fuzzTest52.FuzzTest_getKey(pairMap53, pairMap54, "", "seed2");
        examples.PairMap pairMap58 = null;
        examples.PairMap pairMap59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_getKey(pairMap58, pairMap59, "old0", "");
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        examples.PairMap pairMap64 = null;
        examples.PairMap pairMap65 = null;
        fuzzTest63.FuzzTest_getKey(pairMap64, pairMap65, "", "seed2");
        examples.PairMap pairMap69 = null;
        examples.PairMap pairMap70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_getKey(pairMap69, pairMap70, "old0", "");
        examples.PairMap pairMap74 = null;
        fuzzTest52.FuzzTest_getKey(pairMap70, pairMap74, "old2", "old0");
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_getKey(pairMap47, pairMap70, "seed0", "");
    }
}

