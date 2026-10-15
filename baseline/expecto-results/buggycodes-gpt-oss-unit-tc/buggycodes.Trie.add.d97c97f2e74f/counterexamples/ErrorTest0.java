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
        buggycodes.mut_050.Trie trie1 = null;
        buggycodes.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie7 = null;
        buggycodes.mut_050.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        buggycodes.mut_050.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie18 = null;
        buggycodes.mut_050.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        buggycodes.mut_050.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie23, trie24, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie12, trie24, "", true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie1 = null;
        buggycodes.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie7 = null;
        buggycodes.mut_050.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        buggycodes.mut_050.Trie trie12 = null;
        buggycodes.mut_050.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie18 = null;
        buggycodes.mut_050.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        buggycodes.mut_050.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie23, trie24, "", false);
        fuzzTest0.FuzzTest_add(trie12, trie24, "hi!", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie32 = null;
        buggycodes.mut_050.Trie trie33 = null;
        fuzzTest31.FuzzTest_add(trie32, trie33, "", false);
        buggycodes.mut_050.Trie trie37 = null;
        buggycodes.mut_050.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_add(trie37, trie38, "old0", true);
        buggycodes.mut_050.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_add(trie42, trie43, "", false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie50 = null;
        buggycodes.mut_050.Trie trie51 = null;
        fuzzTest49.FuzzTest_add(trie50, trie51, "", false);
        buggycodes.mut_050.Trie trie55 = null;
        buggycodes.mut_050.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(trie55, trie56, "old0", true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie61 = null;
        buggycodes.mut_050.Trie trie62 = null;
        fuzzTest60.FuzzTest_add(trie61, trie62, "", false);
        buggycodes.mut_050.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_add(trie66, trie67, "", false);
        fuzzTest48.FuzzTest_add(trie56, trie67, "seed0", true);
        buggycodes.mut_050.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie56, trie74, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie43, trie56, "", true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie3 = null;
        buggycodes.mut_050.Trie trie4 = null;
        fuzzTest2.FuzzTest_add(trie3, trie4, "", false);
        buggycodes.mut_050.Trie trie8 = null;
        buggycodes.mut_050.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie8, trie9, "old0", true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie14 = null;
        buggycodes.mut_050.Trie trie15 = null;
        fuzzTest13.FuzzTest_add(trie14, trie15, "", false);
        buggycodes.mut_050.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie19, trie20, "", false);
        fuzzTest1.FuzzTest_add(trie9, trie20, "seed0", true);
        buggycodes.mut_050.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie9, trie27, "seed0", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie32 = null;
        buggycodes.mut_050.Trie trie33 = null;
        fuzzTest31.FuzzTest_add(trie32, trie33, "", false);
        buggycodes.mut_050.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_add(trie37, trie38, "", false);
        buggycodes.mut_050.Trie trie42 = null;
        fuzzTest0.FuzzTest_add(trie37, trie42, "seed0", false);
        buggycodes.mut_050.Trie trie46 = null;
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie48 = null;
        buggycodes.mut_050.Trie trie49 = null;
        fuzzTest47.FuzzTest_add(trie48, trie49, "", false);
        buggycodes.mut_050.Trie trie53 = null;
        buggycodes.mut_050.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie53, trie54, "old0", true);
        fuzzTest0.FuzzTest_add(trie46, trie53, "old1", false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie62 = null;
        buggycodes.mut_050.Trie trie63 = null;
        fuzzTest61.FuzzTest_add(trie62, trie63, "", false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie68 = null;
        buggycodes.mut_050.Trie trie69 = null;
        fuzzTest67.FuzzTest_add(trie68, trie69, "", false);
        buggycodes.mut_050.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_add(trie73, trie74, "", false);
        buggycodes.mut_050.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_add(trie73, trie78, "hi!", false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie83 = null;
        buggycodes.mut_050.Trie trie84 = null;
        fuzzTest82.FuzzTest_add(trie83, trie84, "", false);
        buggycodes.mut_050.Trie trie88 = null;
        buggycodes.mut_050.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_add(trie88, trie89, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie73, trie89, "hi!", true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie1 = null;
        buggycodes.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie7 = null;
        buggycodes.mut_050.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        buggycodes.mut_050.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "", false);
        buggycodes.mut_050.Trie trie17 = null;
        fuzzTest0.FuzzTest_add(trie12, trie17, "old0", true);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie24 = null;
        buggycodes.mut_050.Trie trie25 = null;
        fuzzTest23.FuzzTest_add(trie24, trie25, "", false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie30 = null;
        buggycodes.mut_050.Trie trie31 = null;
        fuzzTest29.FuzzTest_add(trie30, trie31, "", false);
        buggycodes.mut_050.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie35, trie36, "", false);
        buggycodes.mut_050.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie35, trie40, "hi!", false);
        fuzzTest21.FuzzTest_add(trie22, trie40, "seed2", true);
        buggycodes.mut_050.Trie trie47 = null;
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie49 = null;
        buggycodes.mut_050.Trie trie50 = null;
        fuzzTest48.FuzzTest_add(trie49, trie50, "", false);
        buggycodes.mut_050.Trie trie54 = null;
        buggycodes.mut_050.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie54, trie55, "old0", true);
        buggycodes.mut_050.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie59, trie60, "", false);
        fuzzTest21.FuzzTest_add(trie47, trie59, "seed0", false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie69 = null;
        buggycodes.mut_050.Trie trie70 = null;
        fuzzTest68.FuzzTest_add(trie69, trie70, "", false);
        buggycodes.mut_050.Trie trie74 = null;
        buggycodes.mut_050.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie74, trie75, "old0", true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie80 = null;
        buggycodes.mut_050.Trie trie81 = null;
        fuzzTest79.FuzzTest_add(trie80, trie81, "", false);
        buggycodes.mut_050.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie85, trie86, "", false);
        fuzzTest67.FuzzTest_add(trie75, trie86, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie59, trie75, "", true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie1 = null;
        buggycodes.mut_050.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "", true);
        buggycodes.mut_050.Trie trie6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie10 = null;
        buggycodes.mut_050.Trie trie11 = null;
        fuzzTest9.FuzzTest_add(trie10, trie11, "", false);
        buggycodes.mut_050.Trie trie15 = null;
        buggycodes.mut_050.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_add(trie15, trie16, "old0", true);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie21 = null;
        buggycodes.mut_050.Trie trie22 = null;
        fuzzTest20.FuzzTest_add(trie21, trie22, "", false);
        buggycodes.mut_050.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_add(trie26, trie27, "", false);
        fuzzTest8.FuzzTest_add(trie16, trie27, "seed0", true);
        buggycodes.mut_050.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie16, trie34, "seed0", true);
        fuzzTest0.FuzzTest_add(trie6, trie16, "old1", false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie43 = null;
        buggycodes.mut_050.Trie trie44 = null;
        fuzzTest42.FuzzTest_add(trie43, trie44, "", false);
        buggycodes.mut_050.Trie trie48 = null;
        buggycodes.mut_050.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie48, trie49, "old0", true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie54 = null;
        buggycodes.mut_050.Trie trie55 = null;
        fuzzTest53.FuzzTest_add(trie54, trie55, "", false);
        buggycodes.mut_050.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie59, trie60, "", false);
        fuzzTest41.FuzzTest_add(trie49, trie60, "seed0", true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie69 = null;
        buggycodes.mut_050.Trie trie70 = null;
        fuzzTest68.FuzzTest_add(trie69, trie70, "", false);
        buggycodes.mut_050.Trie trie74 = null;
        buggycodes.mut_050.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie74, trie75, "old0", true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie80 = null;
        buggycodes.mut_050.Trie trie81 = null;
        fuzzTest79.FuzzTest_add(trie80, trie81, "", false);
        buggycodes.mut_050.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie85, trie86, "", false);
        fuzzTest67.FuzzTest_add(trie75, trie86, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie60, trie75, "", true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie1 = null;
        buggycodes.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "seed1", true);
        buggycodes.mut_050.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie8 = null;
        buggycodes.mut_050.Trie trie9 = null;
        fuzzTest7.FuzzTest_add(trie8, trie9, "", false);
        buggycodes.mut_050.Trie trie13 = null;
        buggycodes.mut_050.Trie trie14 = null;
        fuzzTest7.FuzzTest_add(trie13, trie14, "", false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie19 = null;
        buggycodes.mut_050.Trie trie20 = null;
        fuzzTest18.FuzzTest_add(trie19, trie20, "", false);
        buggycodes.mut_050.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie24, trie25, "", false);
        buggycodes.mut_050.Trie trie29 = null;
        fuzzTest7.FuzzTest_add(trie24, trie29, "old0", false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie34 = null;
        buggycodes.mut_050.Trie trie35 = null;
        fuzzTest33.FuzzTest_add(trie34, trie35, "", false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie41 = null;
        buggycodes.mut_050.Trie trie42 = null;
        fuzzTest40.FuzzTest_add(trie41, trie42, "", false);
        buggycodes.mut_050.Trie trie46 = null;
        buggycodes.mut_050.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_add(trie46, trie47, "old0", true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie52 = null;
        buggycodes.mut_050.Trie trie53 = null;
        fuzzTest51.FuzzTest_add(trie52, trie53, "", false);
        buggycodes.mut_050.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_add(trie57, trie58, "", false);
        fuzzTest39.FuzzTest_add(trie47, trie58, "seed0", true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie66 = null;
        buggycodes.mut_050.Trie trie67 = null;
        fuzzTest65.FuzzTest_add(trie66, trie67, "", false);
        buggycodes.mut_050.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_add(trie71, trie72, "", false);
        fuzzTest33.FuzzTest_add(trie58, trie71, "old0", true);
        buggycodes.mut_050.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie58, trie79, "old1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie6, trie79, "hi!", true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie1 = null;
        buggycodes.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggycodes.mut_050.Trie trie6 = null;
        buggycodes.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "seed0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie12 = null;
        buggycodes.mut_050.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        buggycodes.mut_050.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie17, trie18, "", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie23 = null;
        buggycodes.mut_050.Trie trie24 = null;
        fuzzTest22.FuzzTest_add(trie23, trie24, "seed0", false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie29 = null;
        buggycodes.mut_050.Trie trie30 = null;
        fuzzTest28.FuzzTest_add(trie29, trie30, "", false);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie37 = null;
        buggycodes.mut_050.Trie trie38 = null;
        fuzzTest36.FuzzTest_add(trie37, trie38, "", false);
        buggycodes.mut_050.Trie trie42 = null;
        buggycodes.mut_050.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_add(trie42, trie43, "old0", true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie48 = null;
        buggycodes.mut_050.Trie trie49 = null;
        fuzzTest47.FuzzTest_add(trie48, trie49, "", false);
        buggycodes.mut_050.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie53, trie54, "", false);
        fuzzTest35.FuzzTest_add(trie43, trie54, "seed0", true);
        buggycodes.mut_050.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie43, trie61, "seed0", true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie66 = null;
        buggycodes.mut_050.Trie trie67 = null;
        fuzzTest65.FuzzTest_add(trie66, trie67, "", false);
        buggycodes.mut_050.Trie trie71 = null;
        buggycodes.mut_050.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_add(trie71, trie72, "old0", true);
        buggycodes.mut_050.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_add(trie76, trie77, "", false);
        fuzzTest28.FuzzTest_add(trie61, trie77, "", false);
        buggycodes.mut_050.Trie trie84 = null;
        fuzzTest22.FuzzTest_add(trie77, trie84, "seed0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie17, trie77, "", true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie1 = null;
        buggycodes.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "hi!", false);
        buggycodes.mut_050.Trie trie6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie8 = null;
        buggycodes.mut_050.Trie trie9 = null;
        fuzzTest7.FuzzTest_add(trie8, trie9, "", false);
        buggycodes.mut_050.Trie trie13 = null;
        buggycodes.mut_050.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie13, trie14, "old0", true);
        fuzzTest0.FuzzTest_add(trie6, trie14, "hi!", false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie23 = null;
        buggycodes.mut_050.Trie trie24 = null;
        fuzzTest22.FuzzTest_add(trie23, trie24, "", false);
        buggycodes.mut_050.Trie trie28 = null;
        buggycodes.mut_050.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_add(trie28, trie29, "old0", true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie34 = null;
        buggycodes.mut_050.Trie trie35 = null;
        fuzzTest33.FuzzTest_add(trie34, trie35, "", false);
        buggycodes.mut_050.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie39, trie40, "", false);
        fuzzTest21.FuzzTest_add(trie29, trie40, "seed0", true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie48 = null;
        buggycodes.mut_050.Trie trie49 = null;
        fuzzTest47.FuzzTest_add(trie48, trie49, "", false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie54 = null;
        buggycodes.mut_050.Trie trie55 = null;
        fuzzTest53.FuzzTest_add(trie54, trie55, "", false);
        buggycodes.mut_050.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie59, trie60, "", false);
        buggycodes.mut_050.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie59, trie64, "hi!", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie29, trie64, "hi!", true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie1 = null;
        buggycodes.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggycodes.mut_050.Trie trie6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie8 = null;
        buggycodes.mut_050.Trie trie9 = null;
        fuzzTest7.FuzzTest_add(trie8, trie9, "hi!", false);
        buggycodes.mut_050.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie15 = null;
        buggycodes.mut_050.Trie trie16 = null;
        fuzzTest14.FuzzTest_add(trie15, trie16, "", false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie21 = null;
        buggycodes.mut_050.Trie trie22 = null;
        fuzzTest20.FuzzTest_add(trie21, trie22, "", false);
        buggycodes.mut_050.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_add(trie26, trie27, "", false);
        buggycodes.mut_050.Trie trie31 = null;
        fuzzTest14.FuzzTest_add(trie26, trie31, "old0", true);
        fuzzTest7.FuzzTest_add(trie13, trie26, "hi!", false);
        fuzzTest0.FuzzTest_add(trie6, trie26, "old1", false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie43 = null;
        buggycodes.mut_050.Trie trie44 = null;
        fuzzTest42.FuzzTest_add(trie43, trie44, "", false);
        buggycodes.mut_050.Trie trie48 = null;
        buggycodes.mut_050.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie48, trie49, "old0", true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie54 = null;
        buggycodes.mut_050.Trie trie55 = null;
        fuzzTest53.FuzzTest_add(trie54, trie55, "", false);
        buggycodes.mut_050.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie59, trie60, "", false);
        fuzzTest41.FuzzTest_add(trie49, trie60, "seed0", true);
        buggycodes.mut_050.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie60, trie67, "", true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie1 = null;
        buggycodes.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "hi!", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie7 = null;
        buggycodes.mut_050.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "", true);
        buggycodes.mut_050.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie14 = null;
        buggycodes.mut_050.Trie trie15 = null;
        fuzzTest13.FuzzTest_add(trie14, trie15, "hi!", false);
        buggycodes.mut_050.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie21 = null;
        buggycodes.mut_050.Trie trie22 = null;
        fuzzTest20.FuzzTest_add(trie21, trie22, "", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie27 = null;
        buggycodes.mut_050.Trie trie28 = null;
        fuzzTest26.FuzzTest_add(trie27, trie28, "", false);
        buggycodes.mut_050.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie32, trie33, "", false);
        buggycodes.mut_050.Trie trie37 = null;
        fuzzTest20.FuzzTest_add(trie32, trie37, "old0", true);
        fuzzTest13.FuzzTest_add(trie19, trie32, "hi!", false);
        fuzzTest6.FuzzTest_add(trie12, trie19, "seed2", false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie48 = null;
        buggycodes.mut_050.Trie trie49 = null;
        fuzzTest47.FuzzTest_add(trie48, trie49, "", false);
        buggycodes.mut_050.Trie trie53 = null;
        buggycodes.mut_050.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie53, trie54, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie19, trie54, "", true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie1 = null;
        buggycodes.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggycodes.mut_050.Trie trie6 = null;
        buggycodes.mut_050.Trie trie7 = null;
        fuzzTest0.FuzzTest_add(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie12 = null;
        buggycodes.mut_050.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        buggycodes.mut_050.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie17, trie18, "", false);
        buggycodes.mut_050.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie17, trie22, "old0", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie27 = null;
        buggycodes.mut_050.Trie trie28 = null;
        fuzzTest26.FuzzTest_add(trie27, trie28, "", false);
        buggycodes.mut_050.Trie trie32 = null;
        buggycodes.mut_050.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie32, trie33, "old0", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie39 = null;
        buggycodes.mut_050.Trie trie40 = null;
        fuzzTest38.FuzzTest_add(trie39, trie40, "", false);
        buggycodes.mut_050.Trie trie44 = null;
        buggycodes.mut_050.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(trie44, trie45, "old0", true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie50 = null;
        buggycodes.mut_050.Trie trie51 = null;
        fuzzTest49.FuzzTest_add(trie50, trie51, "", false);
        buggycodes.mut_050.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(trie55, trie56, "", false);
        fuzzTest37.FuzzTest_add(trie45, trie56, "seed0", true);
        buggycodes.mut_050.Trie trie63 = null;
        fuzzTest26.FuzzTest_add(trie56, trie63, "old1", false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie69 = null;
        buggycodes.mut_050.Trie trie70 = null;
        fuzzTest68.FuzzTest_add(trie69, trie70, "", false);
        buggycodes.mut_050.Trie trie74 = null;
        buggycodes.mut_050.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie74, trie75, "old0", true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie80 = null;
        buggycodes.mut_050.Trie trie81 = null;
        fuzzTest79.FuzzTest_add(trie80, trie81, "", false);
        buggycodes.mut_050.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie85, trie86, "", false);
        fuzzTest67.FuzzTest_add(trie75, trie86, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie56, trie86, "", true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie1 = null;
        buggycodes.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "seed1", true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie8 = null;
        buggycodes.mut_050.Trie trie9 = null;
        fuzzTest7.FuzzTest_add(trie8, trie9, "", false);
        buggycodes.mut_050.Trie trie13 = null;
        buggycodes.mut_050.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie13, trie14, "old0", true);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie19 = null;
        buggycodes.mut_050.Trie trie20 = null;
        fuzzTest18.FuzzTest_add(trie19, trie20, "", false);
        buggycodes.mut_050.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie24, trie25, "", false);
        fuzzTest6.FuzzTest_add(trie14, trie25, "seed0", true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie35 = null;
        buggycodes.mut_050.Trie trie36 = null;
        fuzzTest34.FuzzTest_add(trie35, trie36, "", false);
        buggycodes.mut_050.Trie trie40 = null;
        buggycodes.mut_050.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie40, trie41, "old0", true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie46 = null;
        buggycodes.mut_050.Trie trie47 = null;
        fuzzTest45.FuzzTest_add(trie46, trie47, "", false);
        buggycodes.mut_050.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(trie51, trie52, "", false);
        fuzzTest33.FuzzTest_add(trie41, trie52, "seed0", true);
        buggycodes.mut_050.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie41, trie59, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie25, trie59, "hi!", true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie1 = null;
        buggycodes.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggycodes.mut_050.Trie trie6 = null;
        buggycodes.mut_050.Trie trie7 = null;
        fuzzTest0.FuzzTest_add(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie12 = null;
        buggycodes.mut_050.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        buggycodes.mut_050.Trie trie17 = null;
        buggycodes.mut_050.Trie trie18 = null;
        fuzzTest11.FuzzTest_add(trie17, trie18, "", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie23 = null;
        buggycodes.mut_050.Trie trie24 = null;
        fuzzTest22.FuzzTest_add(trie23, trie24, "", false);
        buggycodes.mut_050.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_add(trie28, trie29, "", false);
        buggycodes.mut_050.Trie trie33 = null;
        fuzzTest11.FuzzTest_add(trie28, trie33, "old0", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie38 = null;
        buggycodes.mut_050.Trie trie39 = null;
        fuzzTest37.FuzzTest_add(trie38, trie39, "", false);
        buggycodes.mut_050.Trie trie43 = null;
        buggycodes.mut_050.Trie trie44 = null;
        fuzzTest37.FuzzTest_add(trie43, trie44, "old1", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie49 = null;
        buggycodes.mut_050.Trie trie50 = null;
        fuzzTest48.FuzzTest_add(trie49, trie50, "", false);
        buggycodes.mut_050.Trie trie54 = null;
        buggycodes.mut_050.Trie trie55 = null;
        fuzzTest48.FuzzTest_add(trie54, trie55, "", false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie60 = null;
        buggycodes.mut_050.Trie trie61 = null;
        fuzzTest59.FuzzTest_add(trie60, trie61, "", false);
        buggycodes.mut_050.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_add(trie65, trie66, "", false);
        buggycodes.mut_050.Trie trie70 = null;
        fuzzTest48.FuzzTest_add(trie65, trie70, "old0", false);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie75 = null;
        buggycodes.mut_050.Trie trie76 = null;
        fuzzTest74.FuzzTest_add(trie75, trie76, "", false);
        buggycodes.mut_050.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_add(trie80, trie81, "", false);
        buggycodes.mut_050.Trie trie85 = null;
        fuzzTest48.FuzzTest_add(trie81, trie85, "", true);
        buggycodes.mut_050.Trie trie89 = null;
        fuzzTest37.FuzzTest_add(trie81, trie89, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie28, trie81, "", true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie1 = null;
        buggycodes.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "seed1", true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie7 = null;
        buggycodes.mut_050.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "seed0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie15 = null;
        buggycodes.mut_050.Trie trie16 = null;
        fuzzTest14.FuzzTest_add(trie15, trie16, "", false);
        buggycodes.mut_050.Trie trie20 = null;
        buggycodes.mut_050.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie20, trie21, "old0", true);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie26 = null;
        buggycodes.mut_050.Trie trie27 = null;
        fuzzTest25.FuzzTest_add(trie26, trie27, "", false);
        buggycodes.mut_050.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_add(trie31, trie32, "", false);
        fuzzTest13.FuzzTest_add(trie21, trie32, "seed0", true);
        buggycodes.mut_050.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie21, trie39, "seed0", true);
        buggycodes.mut_050.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie39, trie43, "seed0", true);
        buggycodes.mut_050.Trie trie47 = null;
        fuzzTest0.FuzzTest_add(trie43, trie47, "seed2", false);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie54 = null;
        buggycodes.mut_050.Trie trie55 = null;
        fuzzTest53.FuzzTest_add(trie54, trie55, "", false);
        buggycodes.mut_050.Trie trie59 = null;
        buggycodes.mut_050.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie59, trie60, "old0", true);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie65 = null;
        buggycodes.mut_050.Trie trie66 = null;
        fuzzTest64.FuzzTest_add(trie65, trie66, "", false);
        buggycodes.mut_050.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_add(trie70, trie71, "", false);
        fuzzTest52.FuzzTest_add(trie60, trie71, "seed0", true);
        buggycodes.mut_050.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_add(trie60, trie78, "seed0", true);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie83 = null;
        buggycodes.mut_050.Trie trie84 = null;
        fuzzTest82.FuzzTest_add(trie83, trie84, "", false);
        buggycodes.mut_050.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_add(trie88, trie89, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie60, trie89, "", true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie1 = null;
        buggycodes.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggycodes.mut_050.Trie trie6 = null;
        buggycodes.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie12 = null;
        buggycodes.mut_050.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        buggycodes.mut_050.Trie trie17 = null;
        buggycodes.mut_050.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie17, trie18, "old0", true);
        buggycodes.mut_050.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie18, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie27 = null;
        buggycodes.mut_050.Trie trie28 = null;
        fuzzTest26.FuzzTest_add(trie27, trie28, "", false);
        buggycodes.mut_050.Trie trie32 = null;
        buggycodes.mut_050.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie32, trie33, "old0", true);
        buggycodes.mut_050.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie37, trie38, "", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie43 = null;
        buggycodes.mut_050.Trie trie44 = null;
        fuzzTest42.FuzzTest_add(trie43, trie44, "", false);
        buggycodes.mut_050.Trie trie48 = null;
        buggycodes.mut_050.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie48, trie49, "old0", true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie54 = null;
        buggycodes.mut_050.Trie trie55 = null;
        fuzzTest53.FuzzTest_add(trie54, trie55, "", false);
        buggycodes.mut_050.Trie trie59 = null;
        buggycodes.mut_050.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie59, trie60, "old0", true);
        buggycodes.mut_050.Trie trie64 = null;
        fuzzTest42.FuzzTest_add(trie60, trie64, "old2", true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie69 = null;
        buggycodes.mut_050.Trie trie70 = null;
        fuzzTest68.FuzzTest_add(trie69, trie70, "", false);
        buggycodes.mut_050.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie74, trie75, "", false);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie80 = null;
        buggycodes.mut_050.Trie trie81 = null;
        fuzzTest79.FuzzTest_add(trie80, trie81, "", false);
        buggycodes.mut_050.Trie trie85 = null;
        buggycodes.mut_050.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie85, trie86, "old0", true);
        fuzzTest42.FuzzTest_add(trie75, trie86, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie37, trie86, "", true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie1 = null;
        buggycodes.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "hi!", false);
        buggycodes.mut_050.Trie trie6 = null;
        buggycodes.mut_050.Trie trie7 = null;
        fuzzTest0.FuzzTest_add(trie6, trie7, "seed0", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie12 = null;
        buggycodes.mut_050.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie20 = null;
        buggycodes.mut_050.Trie trie21 = null;
        fuzzTest19.FuzzTest_add(trie20, trie21, "", false);
        buggycodes.mut_050.Trie trie25 = null;
        buggycodes.mut_050.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(trie25, trie26, "old0", true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie31 = null;
        buggycodes.mut_050.Trie trie32 = null;
        fuzzTest30.FuzzTest_add(trie31, trie32, "", false);
        buggycodes.mut_050.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_add(trie36, trie37, "", false);
        fuzzTest18.FuzzTest_add(trie26, trie37, "seed0", true);
        buggycodes.mut_050.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie26, trie44, "seed0", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie49 = null;
        buggycodes.mut_050.Trie trie50 = null;
        fuzzTest48.FuzzTest_add(trie49, trie50, "", false);
        buggycodes.mut_050.Trie trie54 = null;
        buggycodes.mut_050.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie54, trie55, "old0", true);
        buggycodes.mut_050.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie59, trie60, "", false);
        fuzzTest11.FuzzTest_add(trie44, trie60, "", false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie69 = null;
        buggycodes.mut_050.Trie trie70 = null;
        fuzzTest68.FuzzTest_add(trie69, trie70, "", false);
        buggycodes.mut_050.Trie trie74 = null;
        buggycodes.mut_050.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie74, trie75, "old0", true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie80 = null;
        buggycodes.mut_050.Trie trie81 = null;
        fuzzTest79.FuzzTest_add(trie80, trie81, "", false);
        buggycodes.mut_050.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie85, trie86, "", false);
        fuzzTest67.FuzzTest_add(trie75, trie86, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie44, trie75, "", true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie1 = null;
        buggycodes.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggycodes.mut_050.Trie trie6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie8 = null;
        buggycodes.mut_050.Trie trie9 = null;
        fuzzTest7.FuzzTest_add(trie8, trie9, "hi!", false);
        buggycodes.mut_050.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie15 = null;
        buggycodes.mut_050.Trie trie16 = null;
        fuzzTest14.FuzzTest_add(trie15, trie16, "", false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie21 = null;
        buggycodes.mut_050.Trie trie22 = null;
        fuzzTest20.FuzzTest_add(trie21, trie22, "", false);
        buggycodes.mut_050.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_add(trie26, trie27, "", false);
        buggycodes.mut_050.Trie trie31 = null;
        fuzzTest14.FuzzTest_add(trie26, trie31, "old0", true);
        fuzzTest7.FuzzTest_add(trie13, trie26, "hi!", false);
        fuzzTest0.FuzzTest_add(trie6, trie26, "old1", false);
        buggycodes.mut_050.Trie trie41 = null;
        buggycodes.mut_050.Trie trie42 = null;
        fuzzTest0.FuzzTest_add(trie41, trie42, "old0", false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie48 = null;
        buggycodes.mut_050.Trie trie49 = null;
        fuzzTest47.FuzzTest_add(trie48, trie49, "", false);
        buggycodes.mut_050.Trie trie53 = null;
        buggycodes.mut_050.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie53, trie54, "old0", true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggycodes.mut_050.Trie trie59 = null;
        buggycodes.mut_050.Trie trie60 = null;
        fuzzTest58.FuzzTest_add(trie59, trie60, "", false);
        buggycodes.mut_050.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_050.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie64, trie65, "", false);
        fuzzTest46.FuzzTest_add(trie54, trie65, "seed0", true);
        buggycodes.mut_050.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie65, trie72, "hi!", true);
    }
}

