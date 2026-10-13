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
        naturalness.Trie trie2 = null;
        naturalness.Trie trie3 = null;
        fuzzTest1.FuzzTest_add(trie2, trie3, "", false);
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie7, trie8, "old0", true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_add(trie13, trie14, "", false);
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie18, trie19, "", false);
        fuzzTest0.FuzzTest_add(trie8, trie19, "seed0", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = null;
        fuzzTest26.FuzzTest_add(trie27, trie28, "", false);
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie32, trie33, "", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = null;
        fuzzTest37.FuzzTest_add(trie38, trie39, "", false);
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(trie43, trie44, "old0", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = null;
        fuzzTest48.FuzzTest_add(trie49, trie50, "", false);
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie54, trie55, "old0", true);
        naturalness.Trie trie59 = null;
        fuzzTest37.FuzzTest_add(trie55, trie59, "old2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie33, trie55, "hi!", false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "", false);
        naturalness.Trie trie11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = null;
        naturalness.Trie trie15 = null;
        fuzzTest13.FuzzTest_add(trie14, trie15, "", false);
        naturalness.Trie trie19 = null;
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie19, trie20, "old0", true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = null;
        naturalness.Trie trie26 = null;
        fuzzTest24.FuzzTest_add(trie25, trie26, "", false);
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie30, trie31, "", false);
        fuzzTest12.FuzzTest_add(trie20, trie31, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie11, trie31, "hi!", true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        naturalness.Trie trie3 = null;
        fuzzTest1.FuzzTest_add(trie2, trie3, "", false);
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie7, trie8, "", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_add(trie13, trie14, "", false);
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie18, trie19, "old0", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = null;
        naturalness.Trie trie25 = null;
        fuzzTest23.FuzzTest_add(trie24, trie25, "", false);
        naturalness.Trie trie29 = null;
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie29, trie30, "old0", true);
        naturalness.Trie trie34 = null;
        fuzzTest12.FuzzTest_add(trie30, trie34, "old2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie8, trie30, "hi!", false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie23, trie24, "", false);
        fuzzTest0.FuzzTest_add(trie12, trie24, "hi!", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = null;
        fuzzTest31.FuzzTest_add(trie32, trie33, "", false);
        naturalness.Trie trie37 = null;
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_add(trie37, trie38, "old0", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = null;
        fuzzTest42.FuzzTest_add(trie43, trie44, "", false);
        naturalness.Trie trie48 = null;
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie48, trie49, "old0", true);
        naturalness.Trie trie53 = null;
        fuzzTest31.FuzzTest_add(trie49, trie53, "old2", true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = null;
        naturalness.Trie trie59 = null;
        fuzzTest57.FuzzTest_add(trie58, trie59, "", false);
        naturalness.Trie trie63 = null;
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(trie63, trie64, "old0", true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.Trie trie69 = null;
        naturalness.Trie trie70 = null;
        fuzzTest68.FuzzTest_add(trie69, trie70, "", false);
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie74, trie75, "", false);
        fuzzTest31.FuzzTest_add(trie63, trie75, "seed2", true);
        naturalness.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie75, trie82, "old0", false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie17, trie18, "old0", true);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie18, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = null;
        fuzzTest26.FuzzTest_add(trie27, trie28, "", false);
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie32, trie33, "old0", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = null;
        fuzzTest37.FuzzTest_add(trie38, trie39, "", false);
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(trie43, trie44, "", false);
        fuzzTest0.FuzzTest_add(trie32, trie44, "seed2", true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.Trie trie52 = null;
        naturalness.Trie trie53 = null;
        fuzzTest51.FuzzTest_add(trie52, trie53, "", false);
        naturalness.Trie trie57 = null;
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_add(trie57, trie58, "old0", true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.Trie trie63 = null;
        naturalness.Trie trie64 = null;
        fuzzTest62.FuzzTest_add(trie63, trie64, "", false);
        naturalness.Trie trie68 = null;
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_add(trie68, trie69, "old0", true);
        naturalness.Trie trie73 = null;
        fuzzTest51.FuzzTest_add(trie69, trie73, "old2", true);
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie69, trie77, "old0", true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie23, trie24, "", false);
        fuzzTest0.FuzzTest_add(trie12, trie24, "hi!", true);
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = null;
        fuzzTest32.FuzzTest_add(trie33, trie34, "", false);
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie38, trie39, "", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = null;
        naturalness.Trie trie45 = null;
        fuzzTest43.FuzzTest_add(trie44, trie45, "", false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = null;
        naturalness.Trie trie51 = null;
        fuzzTest49.FuzzTest_add(trie50, trie51, "", false);
        naturalness.Trie trie55 = null;
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(trie55, trie56, "old0", true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.Trie trie61 = null;
        naturalness.Trie trie62 = null;
        fuzzTest60.FuzzTest_add(trie61, trie62, "", false);
        naturalness.Trie trie66 = null;
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_add(trie66, trie67, "old0", true);
        naturalness.Trie trie71 = null;
        fuzzTest49.FuzzTest_add(trie67, trie71, "old2", true);
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie67, trie75, "", true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.Trie trie80 = null;
        naturalness.Trie trie81 = null;
        fuzzTest79.FuzzTest_add(trie80, trie81, "", false);
        naturalness.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie85, trie86, "", false);
        fuzzTest32.FuzzTest_add(trie75, trie86, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie31, trie86, "old1", false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = null;
        naturalness.Trie trie4 = null;
        fuzzTest2.FuzzTest_add(trie3, trie4, "", false);
        naturalness.Trie trie8 = null;
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie8, trie9, "old0", true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = null;
        naturalness.Trie trie15 = null;
        fuzzTest13.FuzzTest_add(trie14, trie15, "", false);
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie19, trie20, "", false);
        fuzzTest1.FuzzTest_add(trie9, trie20, "seed0", true);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = null;
        fuzzTest27.FuzzTest_add(trie28, trie29, "", false);
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_add(trie33, trie34, "old0", true);
        fuzzTest0.FuzzTest_add(trie20, trie33, "seed1", false);
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = null;
        fuzzTest42.FuzzTest_add(trie43, trie44, "", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = null;
        fuzzTest48.FuzzTest_add(trie49, trie50, "", false);
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie54, trie55, "old0", true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.Trie trie60 = null;
        naturalness.Trie trie61 = null;
        fuzzTest59.FuzzTest_add(trie60, trie61, "", false);
        naturalness.Trie trie65 = null;
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_add(trie65, trie66, "old0", true);
        naturalness.Trie trie70 = null;
        fuzzTest48.FuzzTest_add(trie66, trie70, "old2", true);
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie66, trie74, "", true);
        fuzzTest0.FuzzTest_add(trie41, trie66, "seed2", true);
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.Trie trie83 = null;
        naturalness.Trie trie84 = null;
        fuzzTest82.FuzzTest_add(trie83, trie84, "", false);
        naturalness.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_add(trie88, trie89, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie81, trie89, "old0", true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = null;
        naturalness.Trie trie4 = null;
        fuzzTest2.FuzzTest_add(trie3, trie4, "", false);
        naturalness.Trie trie8 = null;
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie8, trie9, "old0", true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = null;
        naturalness.Trie trie15 = null;
        fuzzTest13.FuzzTest_add(trie14, trie15, "", false);
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie19, trie20, "", false);
        fuzzTest1.FuzzTest_add(trie9, trie20, "seed0", true);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = null;
        fuzzTest27.FuzzTest_add(trie28, trie29, "", false);
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_add(trie33, trie34, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie20, trie34, "old1", false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = null;
        naturalness.Trie trie25 = null;
        fuzzTest23.FuzzTest_add(trie24, trie25, "", false);
        naturalness.Trie trie29 = null;
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie29, trie30, "old0", true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = null;
        naturalness.Trie trie36 = null;
        fuzzTest34.FuzzTest_add(trie35, trie36, "", false);
        naturalness.Trie trie40 = null;
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie40, trie41, "old0", true);
        naturalness.Trie trie45 = null;
        fuzzTest23.FuzzTest_add(trie41, trie45, "old2", true);
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie41, trie49, "", true);
        naturalness.Trie trie53 = null;
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = null;
        naturalness.Trie trie56 = null;
        fuzzTest54.FuzzTest_add(trie55, trie56, "", false);
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(trie60, trie61, "", false);
        fuzzTest17.FuzzTest_add(trie53, trie60, "", false);
        fuzzTest0.FuzzTest_add(trie13, trie53, "", false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.Trie trie72 = null;
        naturalness.Trie trie73 = null;
        fuzzTest71.FuzzTest_add(trie72, trie73, "", false);
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_add(trie77, trie78, "", false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.Trie trie83 = null;
        naturalness.Trie trie84 = null;
        fuzzTest82.FuzzTest_add(trie83, trie84, "", false);
        naturalness.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_add(trie88, trie89, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie77, trie89, "old1", true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie17, trie18, "old0", true);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie18, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = null;
        fuzzTest26.FuzzTest_add(trie27, trie28, "", false);
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie32, trie33, "old0", true);
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = null;
        naturalness.Trie trie40 = null;
        fuzzTest38.FuzzTest_add(trie39, trie40, "", false);
        naturalness.Trie trie44 = null;
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(trie44, trie45, "old0", true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = null;
        naturalness.Trie trie51 = null;
        fuzzTest49.FuzzTest_add(trie50, trie51, "", false);
        naturalness.Trie trie55 = null;
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(trie55, trie56, "old0", true);
        naturalness.Trie trie60 = null;
        fuzzTest38.FuzzTest_add(trie56, trie60, "old2", true);
        fuzzTest26.FuzzTest_add(trie37, trie56, "", false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.Trie trie69 = null;
        naturalness.Trie trie70 = null;
        fuzzTest68.FuzzTest_add(trie69, trie70, "", false);
        naturalness.Trie trie74 = null;
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie74, trie75, "old0", true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.Trie trie80 = null;
        naturalness.Trie trie81 = null;
        fuzzTest79.FuzzTest_add(trie80, trie81, "", false);
        naturalness.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie85, trie86, "", false);
        fuzzTest67.FuzzTest_add(trie75, trie86, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie56, trie86, "hi!", false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie17, trie18, "", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = null;
        naturalness.Trie trie25 = null;
        fuzzTest23.FuzzTest_add(trie24, trie25, "", false);
        naturalness.Trie trie29 = null;
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie29, trie30, "old0", true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = null;
        naturalness.Trie trie36 = null;
        fuzzTest34.FuzzTest_add(trie35, trie36, "", false);
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie40, trie41, "", false);
        fuzzTest22.FuzzTest_add(trie30, trie41, "seed0", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = null;
        naturalness.Trie trie51 = null;
        fuzzTest49.FuzzTest_add(trie50, trie51, "", false);
        naturalness.Trie trie55 = null;
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(trie55, trie56, "old0", true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.Trie trie61 = null;
        naturalness.Trie trie62 = null;
        fuzzTest60.FuzzTest_add(trie61, trie62, "", false);
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_add(trie66, trie67, "", false);
        fuzzTest48.FuzzTest_add(trie56, trie67, "seed0", true);
        fuzzTest11.FuzzTest_add(trie30, trie56, "old1", true);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.Trie trie78 = null;
        naturalness.Trie trie79 = null;
        fuzzTest77.FuzzTest_add(trie78, trie79, "", false);
        naturalness.Trie trie83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_add(trie83, trie84, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie30, trie84, "old1", false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        naturalness.Trie trie3 = null;
        fuzzTest1.FuzzTest_add(trie2, trie3, "", false);
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie7, trie8, "", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_add(trie13, trie14, "", false);
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie18, trie19, "", false);
        naturalness.Trie trie23 = null;
        fuzzTest1.FuzzTest_add(trie18, trie23, "seed1", false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = null;
        fuzzTest27.FuzzTest_add(trie28, trie29, "", false);
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_add(trie33, trie34, "old0", true);
        fuzzTest0.FuzzTest_add(trie18, trie33, "old2", false);
        naturalness.Trie trie41 = null;
        naturalness.Trie trie42 = null;
        fuzzTest0.FuzzTest_add(trie41, trie42, "", true);
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.Trie trie48 = null;
        naturalness.Trie trie49 = null;
        fuzzTest47.FuzzTest_add(trie48, trie49, "", false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = null;
        fuzzTest53.FuzzTest_add(trie54, trie55, "", false);
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie59, trie60, "old0", true);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.Trie trie65 = null;
        naturalness.Trie trie66 = null;
        fuzzTest64.FuzzTest_add(trie65, trie66, "", false);
        naturalness.Trie trie70 = null;
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_add(trie70, trie71, "old0", true);
        naturalness.Trie trie75 = null;
        fuzzTest53.FuzzTest_add(trie71, trie75, "old2", true);
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie71, trie79, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie46, trie79, "old0", false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        naturalness.Trie trie23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = null;
        naturalness.Trie trie26 = null;
        fuzzTest24.FuzzTest_add(trie25, trie26, "", false);
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie30, trie31, "", false);
        fuzzTest17.FuzzTest_add(trie23, trie31, "hi!", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie12, trie31, "hi!", true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = null;
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.Trie trie10 = null;
        naturalness.Trie trie11 = null;
        fuzzTest9.FuzzTest_add(trie10, trie11, "", false);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.Trie trie16 = null;
        naturalness.Trie trie17 = null;
        fuzzTest15.FuzzTest_add(trie16, trie17, "", false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.Trie trie22 = null;
        naturalness.Trie trie23 = null;
        fuzzTest21.FuzzTest_add(trie22, trie23, "", false);
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_add(trie27, trie28, "old0", true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = null;
        fuzzTest32.FuzzTest_add(trie33, trie34, "", false);
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie38, trie39, "old0", true);
        naturalness.Trie trie43 = null;
        fuzzTest21.FuzzTest_add(trie39, trie43, "old2", true);
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_add(trie39, trie47, "", true);
        naturalness.Trie trie51 = null;
        fuzzTest9.FuzzTest_add(trie39, trie51, "old0", false);
        fuzzTest7.FuzzTest_add(trie8, trie39, "seed2", true);
        fuzzTest0.FuzzTest_add(trie6, trie8, "old0", true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.Trie trie62 = null;
        naturalness.Trie trie63 = null;
        fuzzTest61.FuzzTest_add(trie62, trie63, "", false);
        naturalness.Trie trie67 = null;
        naturalness.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_add(trie67, trie68, "old0", true);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.Trie trie73 = null;
        naturalness.Trie trie74 = null;
        fuzzTest72.FuzzTest_add(trie73, trie74, "", false);
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_add(trie78, trie79, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie68, trie78, "hi!", false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest6.FuzzTest_add(trie12, trie13, "hi!", false);
        naturalness.Trie trie17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = null;
        naturalness.Trie trie20 = null;
        fuzzTest18.FuzzTest_add(trie19, trie20, "", false);
        naturalness.Trie trie24 = null;
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie24, trie25, "old0", true);
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.Trie trie31 = null;
        naturalness.Trie trie32 = null;
        fuzzTest30.FuzzTest_add(trie31, trie32, "", false);
        naturalness.Trie trie36 = null;
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_add(trie36, trie37, "old0", true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.Trie trie42 = null;
        naturalness.Trie trie43 = null;
        fuzzTest41.FuzzTest_add(trie42, trie43, "", false);
        naturalness.Trie trie47 = null;
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_add(trie47, trie48, "old0", true);
        naturalness.Trie trie52 = null;
        fuzzTest30.FuzzTest_add(trie48, trie52, "old2", true);
        fuzzTest18.FuzzTest_add(trie29, trie48, "", false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.Trie trie60 = null;
        naturalness.Trie trie61 = null;
        fuzzTest59.FuzzTest_add(trie60, trie61, "", false);
        naturalness.Trie trie65 = null;
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_add(trie65, trie66, "old0", true);
        naturalness.Trie trie70 = null;
        fuzzTest18.FuzzTest_add(trie66, trie70, "old0", true);
        fuzzTest6.FuzzTest_add(trie17, trie66, "seed2", false);
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie66, trie77, "old0", true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie17, trie18, "old0", true);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie18, trie22, "old2", true);
        naturalness.Trie trie26 = null;
        naturalness.Trie trie27 = null;
        fuzzTest0.FuzzTest_add(trie26, trie27, "seed0", false);
        naturalness.Trie trie31 = null;
        naturalness.Trie trie32 = null;
        fuzzTest0.FuzzTest_add(trie31, trie32, "", true);
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = null;
        naturalness.Trie trie41 = null;
        fuzzTest39.FuzzTest_add(trie40, trie41, "", false);
        naturalness.Trie trie45 = null;
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie45, trie46, "old0", true);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.Trie trie51 = null;
        naturalness.Trie trie52 = null;
        fuzzTest50.FuzzTest_add(trie51, trie52, "", false);
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_add(trie56, trie57, "", false);
        fuzzTest38.FuzzTest_add(trie46, trie57, "seed0", true);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.Trie trie65 = null;
        naturalness.Trie trie66 = null;
        fuzzTest64.FuzzTest_add(trie65, trie66, "", false);
        naturalness.Trie trie70 = null;
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_add(trie70, trie71, "old0", true);
        fuzzTest37.FuzzTest_add(trie57, trie70, "seed1", false);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.Trie trie79 = null;
        naturalness.Trie trie80 = null;
        fuzzTest78.FuzzTest_add(trie79, trie80, "", false);
        naturalness.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_add(trie84, trie85, "", false);
        naturalness.Trie trie89 = null;
        fuzzTest37.FuzzTest_add(trie85, trie89, "seed1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie36, trie85, "old2", false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = null;
        naturalness.Trie trie10 = null;
        fuzzTest8.FuzzTest_add(trie9, trie10, "", false);
        naturalness.Trie trie14 = null;
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie14, trie15, "old0", true);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.Trie trie20 = null;
        naturalness.Trie trie21 = null;
        fuzzTest19.FuzzTest_add(trie20, trie21, "", false);
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(trie25, trie26, "", false);
        fuzzTest7.FuzzTest_add(trie15, trie26, "seed0", true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = null;
        naturalness.Trie trie35 = null;
        fuzzTest33.FuzzTest_add(trie34, trie35, "", false);
        naturalness.Trie trie39 = null;
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie39, trie40, "old0", true);
        fuzzTest6.FuzzTest_add(trie26, trie39, "seed1", false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.Trie trie48 = null;
        naturalness.Trie trie49 = null;
        fuzzTest47.FuzzTest_add(trie48, trie49, "", false);
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie53, trie54, "", false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = null;
        fuzzTest58.FuzzTest_add(trie59, trie60, "", false);
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie64, trie65, "", false);
        naturalness.Trie trie69 = null;
        fuzzTest47.FuzzTest_add(trie64, trie69, "seed1", false);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        naturalness.Trie trie74 = null;
        naturalness.Trie trie75 = null;
        fuzzTest73.FuzzTest_add(trie74, trie75, "", false);
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_add(trie79, trie80, "", false);
        naturalness.Trie trie84 = null;
        fuzzTest47.FuzzTest_add(trie80, trie84, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie26, trie80, "hi!", false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        naturalness.Trie trie3 = null;
        fuzzTest1.FuzzTest_add(trie2, trie3, "", false);
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie7, trie8, "", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_add(trie13, trie14, "", false);
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie18, trie19, "", false);
        naturalness.Trie trie23 = null;
        fuzzTest1.FuzzTest_add(trie18, trie23, "seed1", false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = null;
        fuzzTest27.FuzzTest_add(trie28, trie29, "", false);
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_add(trie33, trie34, "old0", true);
        fuzzTest0.FuzzTest_add(trie18, trie33, "old2", false);
        naturalness.Trie trie41 = null;
        naturalness.Trie trie42 = null;
        fuzzTest0.FuzzTest_add(trie41, trie42, "", true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.Trie trie47 = null;
        naturalness.Trie trie48 = null;
        fuzzTest46.FuzzTest_add(trie47, trie48, "", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = null;
        naturalness.Trie trie54 = null;
        fuzzTest52.FuzzTest_add(trie53, trie54, "", false);
        naturalness.Trie trie58 = null;
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_add(trie58, trie59, "old0", true);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = null;
        naturalness.Trie trie65 = null;
        fuzzTest63.FuzzTest_add(trie64, trie65, "", false);
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie69, trie70, "", false);
        fuzzTest46.FuzzTest_add(trie58, trie70, "hi!", true);
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie70, trie77, "old2", true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        fuzzTest0.FuzzTest_add(trie12, trie17, "old2", true);
        naturalness.Trie trie21 = null;
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie21, trie22, "seed1", true);
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie27 = null;
        fuzzTest0.FuzzTest_add(trie26, trie27, "old1", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = null;
        fuzzTest31.FuzzTest_add(trie32, trie33, "", false);
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_add(trie37, trie38, "", false);
        naturalness.Trie trie42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = null;
        naturalness.Trie trie45 = null;
        fuzzTest43.FuzzTest_add(trie44, trie45, "", false);
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie49, trie50, "", false);
        fuzzTest31.FuzzTest_add(trie42, trie49, "seed0", false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = null;
        fuzzTest58.FuzzTest_add(trie59, trie60, "", false);
        naturalness.Trie trie64 = null;
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie64, trie65, "old0", true);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.Trie trie70 = null;
        naturalness.Trie trie71 = null;
        fuzzTest69.FuzzTest_add(trie70, trie71, "", false);
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_add(trie75, trie76, "", false);
        fuzzTest57.FuzzTest_add(trie65, trie76, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie49, trie76, "old1", true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        naturalness.Trie trie4 = null;
        naturalness.Trie trie5 = null;
        fuzzTest3.FuzzTest_add(trie4, trie5, "", false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.Trie trie10 = null;
        naturalness.Trie trie11 = null;
        fuzzTest9.FuzzTest_add(trie10, trie11, "", false);
        naturalness.Trie trie15 = null;
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_add(trie15, trie16, "old0", true);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.Trie trie21 = null;
        naturalness.Trie trie22 = null;
        fuzzTest20.FuzzTest_add(trie21, trie22, "", false);
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_add(trie26, trie27, "", false);
        fuzzTest3.FuzzTest_add(trie15, trie27, "hi!", true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = null;
        naturalness.Trie trie36 = null;
        fuzzTest34.FuzzTest_add(trie35, trie36, "", false);
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie40, trie41, "", false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.Trie trie47 = null;
        naturalness.Trie trie48 = null;
        fuzzTest46.FuzzTest_add(trie47, trie48, "", false);
        naturalness.Trie trie52 = null;
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_add(trie52, trie53, "old0", true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = null;
        naturalness.Trie trie59 = null;
        fuzzTest57.FuzzTest_add(trie58, trie59, "", false);
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(trie63, trie64, "", false);
        fuzzTest45.FuzzTest_add(trie53, trie64, "seed0", true);
        fuzzTest3.FuzzTest_add(trie40, trie53, "old0", true);
        fuzzTest1.FuzzTest_add(trie2, trie40, "seed0", true);
        naturalness.Trie trie77 = null;
        fuzzTest0.FuzzTest_add(trie40, trie77, "old0", false);
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.Trie trie83 = null;
        naturalness.Trie trie84 = null;
        fuzzTest82.FuzzTest_add(trie83, trie84, "", false);
        naturalness.Trie trie88 = null;
        naturalness.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_add(trie88, trie89, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie81, trie89, "old2", false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        naturalness.Trie trie23 = null;
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie23, trie24, "old0", true);
        naturalness.Trie trie28 = null;
        fuzzTest6.FuzzTest_add(trie24, trie28, "old2", true);
        naturalness.Trie trie32 = null;
        fuzzTest0.FuzzTest_add(trie28, trie32, "old0", true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = null;
        fuzzTest37.FuzzTest_add(trie38, trie39, "", false);
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(trie43, trie44, "old0", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = null;
        fuzzTest48.FuzzTest_add(trie49, trie50, "", false);
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie54, trie55, "old0", true);
        naturalness.Trie trie59 = null;
        fuzzTest37.FuzzTest_add(trie55, trie59, "old2", true);
        naturalness.Trie trie63 = null;
        naturalness.Trie trie64 = null;
        fuzzTest37.FuzzTest_add(trie63, trie64, "seed0", false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.Trie trie69 = null;
        naturalness.Trie trie70 = null;
        fuzzTest68.FuzzTest_add(trie69, trie70, "", false);
        naturalness.Trie trie74 = null;
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie74, trie75, "old0", true);
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(trie75, trie79, "", false);
        naturalness.Trie trie83 = null;
        fuzzTest36.FuzzTest_add(trie79, trie83, "seed0", true);
        naturalness.Trie trie87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie79, trie87, "hi!", false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie17, trie18, "", false);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie17, trie22, "seed1", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = null;
        fuzzTest26.FuzzTest_add(trie27, trie28, "", false);
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie32, trie33, "", false);
        naturalness.Trie trie37 = null;
        fuzzTest0.FuzzTest_add(trie33, trie37, "", true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.Trie trie42 = null;
        naturalness.Trie trie43 = null;
        fuzzTest41.FuzzTest_add(trie42, trie43, "", false);
        naturalness.Trie trie47 = null;
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = null;
        fuzzTest48.FuzzTest_add(trie49, trie50, "", false);
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie54, trie55, "old0", true);
        fuzzTest41.FuzzTest_add(trie47, trie55, "seed1", true);
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = null;
        naturalness.Trie trie65 = null;
        fuzzTest63.FuzzTest_add(trie64, trie65, "", false);
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie69, trie70, "", false);
        fuzzTest41.FuzzTest_add(trie62, trie70, "", true);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.Trie trie78 = null;
        naturalness.Trie trie79 = null;
        fuzzTest77.FuzzTest_add(trie78, trie79, "", false);
        naturalness.Trie trie83 = null;
        naturalness.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_add(trie83, trie84, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie70, trie84, "hi!", true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie17, trie18, "old0", true);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie18, trie22, "old2", true);
        naturalness.Trie trie26 = null;
        naturalness.Trie trie27 = null;
        fuzzTest0.FuzzTest_add(trie26, trie27, "seed0", false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = null;
        fuzzTest31.FuzzTest_add(trie32, trie33, "", false);
        naturalness.Trie trie37 = null;
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_add(trie37, trie38, "old0", true);
        naturalness.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie38, trie42, "", false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.Trie trie47 = null;
        naturalness.Trie trie48 = null;
        fuzzTest46.FuzzTest_add(trie47, trie48, "", false);
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_add(trie52, trie53, "", false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = null;
        fuzzTest58.FuzzTest_add(trie59, trie60, "", false);
        naturalness.Trie trie64 = null;
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie64, trie65, "old0", true);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.Trie trie70 = null;
        naturalness.Trie trie71 = null;
        fuzzTest69.FuzzTest_add(trie70, trie71, "", false);
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_add(trie75, trie76, "", false);
        fuzzTest57.FuzzTest_add(trie65, trie76, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie53, trie76, "old0", true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        fuzzTest0.FuzzTest_add(trie12, trie17, "old2", true);
        naturalness.Trie trie21 = null;
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie21, trie22, "seed1", true);
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie27 = null;
        fuzzTest0.FuzzTest_add(trie26, trie27, "old1", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = null;
        fuzzTest31.FuzzTest_add(trie32, trie33, "", false);
        naturalness.Trie trie37 = null;
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_add(trie37, trie38, "old0", true);
        naturalness.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = null;
        naturalness.Trie trie45 = null;
        fuzzTest43.FuzzTest_add(trie44, trie45, "", false);
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie49, trie50, "old0", true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = null;
        naturalness.Trie trie56 = null;
        fuzzTest54.FuzzTest_add(trie55, trie56, "", false);
        naturalness.Trie trie60 = null;
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(trie60, trie61, "old0", true);
        naturalness.Trie trie65 = null;
        fuzzTest43.FuzzTest_add(trie61, trie65, "old2", true);
        fuzzTest31.FuzzTest_add(trie42, trie61, "", false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.Trie trie73 = null;
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_add(trie73, trie74, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie42, trie74, "hi!", false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = null;
        fuzzTest0.FuzzTest_add(trie6, trie7, "hi!", false);
        naturalness.Trie trie11 = null;
        naturalness.Trie trie12 = null;
        fuzzTest0.FuzzTest_add(trie11, trie12, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = null;
        fuzzTest16.FuzzTest_add(trie17, trie18, "", false);
        naturalness.Trie trie22 = null;
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_add(trie22, trie23, "old0", true);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = null;
        naturalness.Trie trie31 = null;
        fuzzTest29.FuzzTest_add(trie30, trie31, "", false);
        naturalness.Trie trie35 = null;
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie35, trie36, "old0", true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.Trie trie41 = null;
        naturalness.Trie trie42 = null;
        fuzzTest40.FuzzTest_add(trie41, trie42, "", false);
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_add(trie46, trie47, "", false);
        fuzzTest28.FuzzTest_add(trie36, trie47, "seed0", true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = null;
        naturalness.Trie trie56 = null;
        fuzzTest54.FuzzTest_add(trie55, trie56, "", false);
        naturalness.Trie trie60 = null;
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(trie60, trie61, "old0", true);
        fuzzTest27.FuzzTest_add(trie47, trie60, "seed1", false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.Trie trie69 = null;
        naturalness.Trie trie70 = null;
        fuzzTest68.FuzzTest_add(trie69, trie70, "", false);
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie74, trie75, "", false);
        naturalness.Trie trie79 = null;
        fuzzTest27.FuzzTest_add(trie75, trie79, "seed1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie23, trie75, "old0", true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie17, trie18, "", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = null;
        naturalness.Trie trie24 = null;
        fuzzTest22.FuzzTest_add(trie23, trie24, "", false);
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_add(trie28, trie29, "", false);
        naturalness.Trie trie33 = null;
        fuzzTest11.FuzzTest_add(trie28, trie33, "seed1", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = null;
        fuzzTest37.FuzzTest_add(trie38, trie39, "", false);
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(trie43, trie44, "", false);
        naturalness.Trie trie48 = null;
        fuzzTest11.FuzzTest_add(trie44, trie48, "", true);
        naturalness.Trie trie52 = null;
        naturalness.Trie trie53 = null;
        fuzzTest11.FuzzTest_add(trie52, trie53, "hi!", true);
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = null;
        fuzzTest58.FuzzTest_add(trie59, trie60, "", false);
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie64, trie65, "", false);
        fuzzTest11.FuzzTest_add(trie57, trie64, "", true);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.Trie trie73 = null;
        naturalness.Trie trie74 = null;
        fuzzTest72.FuzzTest_add(trie73, trie74, "", false);
        naturalness.Trie trie78 = null;
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_add(trie78, trie79, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie57, trie79, "old0", true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie23, trie24, "", false);
        fuzzTest0.FuzzTest_add(trie12, trie24, "hi!", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = null;
        fuzzTest31.FuzzTest_add(trie32, trie33, "", false);
        naturalness.Trie trie37 = null;
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_add(trie37, trie38, "old0", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = null;
        fuzzTest42.FuzzTest_add(trie43, trie44, "", false);
        naturalness.Trie trie48 = null;
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie48, trie49, "old0", true);
        naturalness.Trie trie53 = null;
        fuzzTest31.FuzzTest_add(trie49, trie53, "old2", true);
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie58 = null;
        fuzzTest31.FuzzTest_add(trie57, trie58, "seed2", false);
        naturalness.Trie trie62 = null;
        fuzzTest0.FuzzTest_add(trie58, trie62, "seed1", false);
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.Trie trie68 = null;
        naturalness.Trie trie69 = null;
        fuzzTest67.FuzzTest_add(trie68, trie69, "", false);
        naturalness.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_add(trie73, trie74, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie66, trie74, "old0", false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = null;
        fuzzTest0.FuzzTest_add(trie6, trie7, "seed0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = null;
        fuzzTest11.FuzzTest_add(trie17, trie18, "hi!", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = null;
        naturalness.Trie trie25 = null;
        fuzzTest23.FuzzTest_add(trie24, trie25, "", false);
        naturalness.Trie trie29 = null;
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie29, trie30, "old0", true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = null;
        naturalness.Trie trie36 = null;
        fuzzTest34.FuzzTest_add(trie35, trie36, "", false);
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie40, trie41, "", false);
        fuzzTest22.FuzzTest_add(trie30, trie41, "seed0", true);
        naturalness.Trie trie48 = null;
        fuzzTest11.FuzzTest_add(trie30, trie48, "hi!", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = null;
        fuzzTest53.FuzzTest_add(trie54, trie55, "", false);
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie59, trie60, "old0", true);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.Trie trie65 = null;
        naturalness.Trie trie66 = null;
        fuzzTest64.FuzzTest_add(trie65, trie66, "", false);
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_add(trie70, trie71, "", false);
        fuzzTest52.FuzzTest_add(trie60, trie71, "seed0", true);
        naturalness.Trie trie78 = null;
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.Trie trie80 = null;
        naturalness.Trie trie81 = null;
        fuzzTest79.FuzzTest_add(trie80, trie81, "", false);
        naturalness.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie85, trie86, "", false);
        fuzzTest52.FuzzTest_add(trie78, trie85, "old1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie30, trie85, "hi!", true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        naturalness.Trie trie23 = null;
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie23, trie24, "old0", true);
        naturalness.Trie trie28 = null;
        fuzzTest6.FuzzTest_add(trie24, trie28, "old2", true);
        naturalness.Trie trie32 = null;
        fuzzTest0.FuzzTest_add(trie28, trie32, "old0", true);
        naturalness.Trie trie36 = null;
        naturalness.Trie trie37 = null;
        fuzzTest0.FuzzTest_add(trie36, trie37, "seed1", false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.Trie trie42 = null;
        naturalness.Trie trie43 = null;
        fuzzTest41.FuzzTest_add(trie42, trie43, "", false);
        naturalness.Trie trie47 = null;
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = null;
        fuzzTest48.FuzzTest_add(trie49, trie50, "", false);
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie54, trie55, "old0", true);
        fuzzTest41.FuzzTest_add(trie47, trie55, "seed1", true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = null;
        naturalness.Trie trie65 = null;
        fuzzTest63.FuzzTest_add(trie64, trie65, "", false);
        naturalness.Trie trie69 = null;
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie69, trie70, "old0", true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.Trie trie75 = null;
        naturalness.Trie trie76 = null;
        fuzzTest74.FuzzTest_add(trie75, trie76, "", false);
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_add(trie80, trie81, "", false);
        fuzzTest62.FuzzTest_add(trie70, trie81, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie55, trie81, "old2", true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "old0", true);
        naturalness.Trie trie17 = null;
        fuzzTest0.FuzzTest_add(trie13, trie17, "old0", false);
        naturalness.Trie trie21 = null;
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = null;
        naturalness.Trie trie24 = null;
        fuzzTest22.FuzzTest_add(trie23, trie24, "", false);
        naturalness.Trie trie28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = null;
        naturalness.Trie trie31 = null;
        fuzzTest29.FuzzTest_add(trie30, trie31, "", false);
        naturalness.Trie trie35 = null;
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie35, trie36, "old0", true);
        fuzzTest22.FuzzTest_add(trie28, trie36, "seed1", true);
        fuzzTest0.FuzzTest_add(trie21, trie36, "", true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.Trie trie47 = null;
        naturalness.Trie trie48 = null;
        fuzzTest46.FuzzTest_add(trie47, trie48, "", false);
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_add(trie52, trie53, "", false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = null;
        fuzzTest58.FuzzTest_add(trie59, trie60, "", false);
        naturalness.Trie trie64 = null;
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie64, trie65, "old0", true);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.Trie trie70 = null;
        naturalness.Trie trie71 = null;
        fuzzTest69.FuzzTest_add(trie70, trie71, "", false);
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_add(trie75, trie76, "", false);
        fuzzTest57.FuzzTest_add(trie65, trie76, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie52, trie76, "hi!", false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = null;
        naturalness.Trie trie4 = null;
        fuzzTest2.FuzzTest_add(trie3, trie4, "", false);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = null;
        naturalness.Trie trie10 = null;
        fuzzTest8.FuzzTest_add(trie9, trie10, "", false);
        naturalness.Trie trie14 = null;
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie14, trie15, "old0", true);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.Trie trie20 = null;
        naturalness.Trie trie21 = null;
        fuzzTest19.FuzzTest_add(trie20, trie21, "", false);
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(trie25, trie26, "", false);
        fuzzTest2.FuzzTest_add(trie14, trie26, "hi!", true);
        fuzzTest0.FuzzTest_add(trie1, trie14, "hi!", false);
        naturalness.Trie trie36 = null;
        naturalness.Trie trie37 = null;
        fuzzTest0.FuzzTest_add(trie36, trie37, "seed0", false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = null;
        fuzzTest42.FuzzTest_add(trie43, trie44, "", false);
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie48, trie49, "", false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = null;
        fuzzTest53.FuzzTest_add(trie54, trie55, "", false);
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie59, trie60, "", false);
        naturalness.Trie trie64 = null;
        fuzzTest42.FuzzTest_add(trie59, trie64, "seed1", false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.Trie trie69 = null;
        naturalness.Trie trie70 = null;
        fuzzTest68.FuzzTest_add(trie69, trie70, "", false);
        naturalness.Trie trie74 = null;
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie74, trie75, "old0", true);
        fuzzTest41.FuzzTest_add(trie59, trie74, "old2", false);
        naturalness.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie59, trie82, "old1", false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "seed0", true);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = null;
        fuzzTest0.FuzzTest_add(trie6, trie7, "seed2", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie23, trie24, "", false);
        naturalness.Trie trie28 = null;
        fuzzTest11.FuzzTest_add(trie23, trie28, "old2", true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = null;
        fuzzTest32.FuzzTest_add(trie33, trie34, "", false);
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie38, trie39, "", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = null;
        naturalness.Trie trie45 = null;
        fuzzTest43.FuzzTest_add(trie44, trie45, "", false);
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie49, trie50, "", false);
        naturalness.Trie trie54 = null;
        fuzzTest32.FuzzTest_add(trie49, trie54, "seed1", false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = null;
        fuzzTest58.FuzzTest_add(trie59, trie60, "", false);
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie64, trie65, "", false);
        naturalness.Trie trie69 = null;
        fuzzTest32.FuzzTest_add(trie65, trie69, "", true);
        naturalness.Trie trie73 = null;
        naturalness.Trie trie74 = null;
        fuzzTest32.FuzzTest_add(trie73, trie74, "hi!", true);
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.Trie trie80 = null;
        naturalness.Trie trie81 = null;
        fuzzTest79.FuzzTest_add(trie80, trie81, "", false);
        naturalness.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie85, trie86, "", false);
        fuzzTest32.FuzzTest_add(trie78, trie85, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie23, trie78, "hi!", false);
    }
}

