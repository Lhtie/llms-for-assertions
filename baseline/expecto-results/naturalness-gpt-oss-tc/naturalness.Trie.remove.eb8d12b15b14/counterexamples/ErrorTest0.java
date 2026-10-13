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
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "old0", true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie8, trie19, "seed0", true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "", false);
        naturalness.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie18, trie22, "old0", false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "", false);
        fuzzTest0.FuzzTest_remove(trie12, trie24, "hi!", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = null;
        fuzzTest31.FuzzTest_remove(trie32, trie33, "", false);
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_remove(trie37, trie38, "", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = null;
        fuzzTest42.FuzzTest_remove(trie43, trie44, "", false);
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_remove(trie48, trie49, "", false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = null;
        fuzzTest53.FuzzTest_remove(trie54, trie55, "", false);
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_remove(trie59, trie60, "old0", true);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.Trie trie65 = null;
        naturalness.Trie trie66 = null;
        fuzzTest64.FuzzTest_remove(trie65, trie66, "", false);
        naturalness.Trie trie70 = null;
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_remove(trie70, trie71, "old0", true);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        naturalness.Trie trie76 = null;
        naturalness.Trie trie77 = null;
        fuzzTest75.FuzzTest_remove(trie76, trie77, "", false);
        naturalness.Trie trie81 = null;
        naturalness.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_remove(trie81, trie82, "old0", true);
        naturalness.Trie trie86 = null;
        fuzzTest64.FuzzTest_remove(trie82, trie86, "old2", true);
        fuzzTest42.FuzzTest_remove(trie60, trie82, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie38, trie82, "old2", false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.Trie trie23 = null;
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "old0", true);
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie28, trie29, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie13, trie29, "old1", false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie18, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(trie32, trie33, "old0", true);
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(trie37, trie38, "old0", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = null;
        naturalness.Trie trie45 = null;
        fuzzTest43.FuzzTest_remove(trie44, trie45, "", false);
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(trie49, trie50, "old0", true);
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(trie54, trie55, "old0", true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.Trie trie60 = null;
        naturalness.Trie trie61 = null;
        fuzzTest59.FuzzTest_remove(trie60, trie61, "", false);
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_remove(trie65, trie66, "", false);
        fuzzTest42.FuzzTest_remove(trie54, trie66, "", true);
        fuzzTest0.FuzzTest_remove(trie38, trie66, "", true);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.Trie trie77 = null;
        naturalness.Trie trie78 = null;
        fuzzTest76.FuzzTest_remove(trie77, trie78, "", false);
        naturalness.Trie trie82 = null;
        naturalness.Trie trie83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_remove(trie82, trie83, "old0", true);
        naturalness.Trie trie87 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_remove(trie87, trie88, "old0", true);
        naturalness.Trie trie92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie88, trie92, "old1", false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = null;
        naturalness.Trie trie4 = null;
        fuzzTest2.FuzzTest_remove(trie3, trie4, "", false);
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_remove(trie8, trie9, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie1, trie9, "old2", false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = null;
        naturalness.Trie trie24 = null;
        fuzzTest22.FuzzTest_remove(trie23, trie24, "", false);
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie28, trie29, "old0", true);
        naturalness.Trie trie33 = null;
        fuzzTest11.FuzzTest_remove(trie29, trie33, "old2", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie43, trie44, "old0", true);
        fuzzTest0.FuzzTest_remove(trie33, trie43, "seed1", true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = null;
        naturalness.Trie trie54 = null;
        fuzzTest52.FuzzTest_remove(trie53, trie54, "", false);
        naturalness.Trie trie58 = null;
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(trie58, trie59, "old0", true);
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(trie63, trie64, "old0", true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.Trie trie69 = null;
        naturalness.Trie trie70 = null;
        fuzzTest68.FuzzTest_remove(trie69, trie70, "", false);
        naturalness.Trie trie74 = null;
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_remove(trie74, trie75, "old0", true);
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_remove(trie79, trie80, "old0", true);
        fuzzTest51.FuzzTest_remove(trie64, trie79, "old2", false);
        naturalness.Trie trie87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie64, trie87, "old0", false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie18, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie33, trie34, "old0", true);
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie38, trie39, "old0", true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = null;
        naturalness.Trie trie46 = null;
        fuzzTest44.FuzzTest_remove(trie45, trie46, "", false);
        naturalness.Trie trie50 = null;
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_remove(trie50, trie51, "old0", true);
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_remove(trie55, trie56, "old0", true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.Trie trie61 = null;
        naturalness.Trie trie62 = null;
        fuzzTest60.FuzzTest_remove(trie61, trie62, "", false);
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_remove(trie66, trie67, "", false);
        fuzzTest43.FuzzTest_remove(trie55, trie67, "", true);
        fuzzTest26.FuzzTest_remove(trie39, trie67, "", false);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.Trie trie78 = null;
        naturalness.Trie trie79 = null;
        fuzzTest77.FuzzTest_remove(trie78, trie79, "", false);
        naturalness.Trie trie83 = null;
        naturalness.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_remove(trie83, trie84, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie67, trie84, "old2", false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = null;
        naturalness.Trie trie24 = null;
        fuzzTest22.FuzzTest_remove(trie23, trie24, "", false);
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie28, trie29, "old0", true);
        naturalness.Trie trie33 = null;
        fuzzTest11.FuzzTest_remove(trie29, trie33, "old2", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie43, trie44, "old0", true);
        fuzzTest0.FuzzTest_remove(trie33, trie43, "seed1", true);
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = null;
        naturalness.Trie trie54 = null;
        fuzzTest52.FuzzTest_remove(trie53, trie54, "", false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = null;
        fuzzTest58.FuzzTest_remove(trie59, trie60, "", false);
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_remove(trie64, trie65, "", false);
        naturalness.Trie trie69 = null;
        fuzzTest52.FuzzTest_remove(trie65, trie69, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie51, trie65, "seed0", true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        naturalness.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "old0", true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "old0", true);
        naturalness.Trie trie23 = null;
        fuzzTest1.FuzzTest_remove(trie19, trie23, "old2", true);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie33, trie34, "old0", true);
        naturalness.Trie trie38 = null;
        fuzzTest1.FuzzTest_remove(trie34, trie38, "", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = null;
        fuzzTest42.FuzzTest_remove(trie43, trie44, "", false);
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_remove(trie48, trie49, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie34, trie48, "seed0", false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        naturalness.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = null;
        naturalness.Trie trie9 = null;
        fuzzTest7.FuzzTest_remove(trie8, trie9, "", false);
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.Trie trie18 = null;
        fuzzTest1.FuzzTest_remove(trie14, trie18, "", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = null;
        naturalness.Trie trie24 = null;
        fuzzTest22.FuzzTest_remove(trie23, trie24, "", false);
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie28, trie29, "old0", true);
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie33, trie34, "old0", true);
        fuzzTest0.FuzzTest_remove(trie18, trie34, "", true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.Trie trie42 = null;
        naturalness.Trie trie43 = null;
        fuzzTest41.FuzzTest_remove(trie42, trie43, "", false);
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_remove(trie47, trie48, "", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = null;
        naturalness.Trie trie54 = null;
        fuzzTest52.FuzzTest_remove(trie53, trie54, "", false);
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(trie58, trie59, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie47, trie59, "seed0", true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        naturalness.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "old0", true);
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.Trie trie23 = null;
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "old0", true);
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie28, trie29, "old0", true);
        fuzzTest0.FuzzTest_remove(trie13, trie28, "old2", false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.Trie trie37 = null;
        naturalness.Trie trie38 = null;
        fuzzTest36.FuzzTest_remove(trie37, trie38, "", false);
        naturalness.Trie trie42 = null;
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_remove(trie42, trie43, "old0", true);
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_remove(trie47, trie48, "old0", true);
        naturalness.Trie trie52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = null;
        fuzzTest53.FuzzTest_remove(trie54, trie55, "", false);
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_remove(trie59, trie60, "old0", true);
        fuzzTest36.FuzzTest_remove(trie52, trie60, "seed2", true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.Trie trie68 = null;
        naturalness.Trie trie69 = null;
        fuzzTest67.FuzzTest_remove(trie68, trie69, "", false);
        naturalness.Trie trie73 = null;
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_remove(trie73, trie74, "old0", true);
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_remove(trie78, trie79, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie60, trie78, "seed1", false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        naturalness.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "old0", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = null;
        naturalness.Trie trie25 = null;
        fuzzTest23.FuzzTest_remove(trie24, trie25, "", false);
        naturalness.Trie trie29 = null;
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie29, trie30, "old0", true);
        naturalness.Trie trie34 = null;
        fuzzTest12.FuzzTest_remove(trie30, trie34, "old2", true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = null;
        naturalness.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = null;
        naturalness.Trie trie46 = null;
        fuzzTest44.FuzzTest_remove(trie45, trie46, "", false);
        naturalness.Trie trie50 = null;
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_remove(trie50, trie51, "old0", true);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.Trie trie56 = null;
        naturalness.Trie trie57 = null;
        fuzzTest55.FuzzTest_remove(trie56, trie57, "", false);
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_remove(trie61, trie62, "", false);
        fuzzTest38.FuzzTest_remove(trie50, trie62, "hi!", true);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.Trie trie70 = null;
        naturalness.Trie trie71 = null;
        fuzzTest69.FuzzTest_remove(trie70, trie71, "", false);
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_remove(trie75, trie76, "", false);
        fuzzTest12.FuzzTest_remove(trie62, trie75, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie7, trie62, "seed1", true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "old0", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = null;
        naturalness.Trie trie25 = null;
        fuzzTest23.FuzzTest_remove(trie24, trie25, "", false);
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie29, trie30, "", false);
        fuzzTest6.FuzzTest_remove(trie18, trie30, "hi!", true);
        naturalness.Trie trie37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = null;
        naturalness.Trie trie41 = null;
        fuzzTest39.FuzzTest_remove(trie40, trie41, "", false);
        naturalness.Trie trie45 = null;
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_remove(trie45, trie46, "old0", true);
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_remove(trie50, trie51, "old0", true);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.Trie trie56 = null;
        naturalness.Trie trie57 = null;
        fuzzTest55.FuzzTest_remove(trie56, trie57, "", false);
        naturalness.Trie trie61 = null;
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_remove(trie61, trie62, "old0", true);
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_remove(trie66, trie67, "old0", true);
        fuzzTest38.FuzzTest_remove(trie51, trie66, "old2", false);
        fuzzTest6.FuzzTest_remove(trie37, trie51, "old1", false);
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.Trie trie79 = null;
        naturalness.Trie trie80 = null;
        fuzzTest78.FuzzTest_remove(trie79, trie80, "", false);
        naturalness.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_remove(trie84, trie85, "", false);
        fuzzTest6.FuzzTest_remove(trie77, trie85, "hi!", false);
        naturalness.Trie trie92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie77, trie92, "old0", false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "", false);
        fuzzTest0.FuzzTest_remove(trie12, trie24, "hi!", true);
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie32 = null;
        fuzzTest0.FuzzTest_remove(trie31, trie32, "seed2", true);
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = null;
        naturalness.Trie trie45 = null;
        fuzzTest43.FuzzTest_remove(trie44, trie45, "", false);
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.Trie trie54 = null;
        fuzzTest37.FuzzTest_remove(trie50, trie54, "", false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = null;
        fuzzTest58.FuzzTest_remove(trie59, trie60, "", false);
        naturalness.Trie trie64 = null;
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_remove(trie64, trie65, "old0", true);
        naturalness.Trie trie69 = null;
        fuzzTest37.FuzzTest_remove(trie65, trie69, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie36, trie65, "seed1", true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        naturalness.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie22, trie23, "old0", true);
        naturalness.Trie trie27 = null;
        fuzzTest0.FuzzTest_remove(trie23, trie27, "", false);
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = null;
        fuzzTest32.FuzzTest_remove(trie33, trie34, "", false);
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_remove(trie38, trie39, "old0", true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = null;
        naturalness.Trie trie45 = null;
        fuzzTest43.FuzzTest_remove(trie44, trie45, "", false);
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(trie49, trie50, "old0", true);
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(trie54, trie55, "old0", true);
        naturalness.Trie trie59 = null;
        fuzzTest32.FuzzTest_remove(trie55, trie59, "", false);
        fuzzTest0.FuzzTest_remove(trie31, trie59, "seed1", false);
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.Trie trie68 = null;
        naturalness.Trie trie69 = null;
        fuzzTest67.FuzzTest_remove(trie68, trie69, "", false);
        naturalness.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_remove(trie73, trie74, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie66, trie74, "seed0", false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = null;
        naturalness.Trie trie24 = null;
        fuzzTest22.FuzzTest_remove(trie23, trie24, "", false);
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie28, trie29, "old0", true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = null;
        naturalness.Trie trie35 = null;
        fuzzTest33.FuzzTest_remove(trie34, trie35, "", false);
        naturalness.Trie trie39 = null;
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_remove(trie39, trie40, "old0", true);
        naturalness.Trie trie44 = null;
        fuzzTest22.FuzzTest_remove(trie40, trie44, "old2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie17, trie40, "seed2", false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "", false);
        fuzzTest0.FuzzTest_remove(trie12, trie24, "hi!", true);
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie32 = null;
        fuzzTest0.FuzzTest_remove(trie31, trie32, "seed2", true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.Trie trie37 = null;
        naturalness.Trie trie38 = null;
        fuzzTest36.FuzzTest_remove(trie37, trie38, "", false);
        naturalness.Trie trie42 = null;
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_remove(trie42, trie43, "old0", true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.Trie trie48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = null;
        naturalness.Trie trie51 = null;
        fuzzTest49.FuzzTest_remove(trie50, trie51, "", false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.Trie trie56 = null;
        naturalness.Trie trie57 = null;
        fuzzTest55.FuzzTest_remove(trie56, trie57, "", false);
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_remove(trie61, trie62, "", false);
        naturalness.Trie trie66 = null;
        fuzzTest49.FuzzTest_remove(trie62, trie66, "", false);
        fuzzTest47.FuzzTest_remove(trie48, trie62, "seed1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie43, trie62, "seed0", true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        naturalness.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "old0", true);
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "", false);
        fuzzTest0.FuzzTest_remove(trie12, trie24, "", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = null;
        fuzzTest31.FuzzTest_remove(trie32, trie33, "", false);
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_remove(trie37, trie38, "", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = null;
        naturalness.Trie trie45 = null;
        fuzzTest43.FuzzTest_remove(trie44, trie45, "", false);
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(trie49, trie50, "old0", true);
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(trie54, trie55, "old0", true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.Trie trie60 = null;
        naturalness.Trie trie61 = null;
        fuzzTest59.FuzzTest_remove(trie60, trie61, "", false);
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_remove(trie65, trie66, "", false);
        fuzzTest42.FuzzTest_remove(trie54, trie66, "", true);
        fuzzTest0.FuzzTest_remove(trie38, trie66, "seed0", false);
        naturalness.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.Trie trie78 = null;
        naturalness.Trie trie79 = null;
        fuzzTest77.FuzzTest_remove(trie78, trie79, "", false);
        naturalness.Trie trie83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_remove(trie83, trie84, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie76, trie84, "seed0", false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        naturalness.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie22, trie23, "old0", true);
        naturalness.Trie trie27 = null;
        fuzzTest0.FuzzTest_remove(trie23, trie27, "", false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = null;
        fuzzTest32.FuzzTest_remove(trie33, trie34, "", false);
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_remove(trie38, trie39, "old0", true);
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_remove(trie43, trie44, "old0", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = null;
        fuzzTest48.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie54, trie55, "", false);
        fuzzTest31.FuzzTest_remove(trie43, trie55, "", true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.Trie trie63 = null;
        naturalness.Trie trie64 = null;
        fuzzTest62.FuzzTest_remove(trie63, trie64, "", false);
        naturalness.Trie trie68 = null;
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_remove(trie68, trie69, "old0", true);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        naturalness.Trie trie74 = null;
        naturalness.Trie trie75 = null;
        fuzzTest73.FuzzTest_remove(trie74, trie75, "", false);
        naturalness.Trie trie79 = null;
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_remove(trie79, trie80, "old0", true);
        naturalness.Trie trie84 = null;
        fuzzTest62.FuzzTest_remove(trie80, trie84, "old2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie55, trie80, "old0", false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = null;
        naturalness.Trie trie9 = null;
        fuzzTest7.FuzzTest_remove(trie8, trie9, "", false);
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_remove(trie13, trie14, "old0", true);
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_remove(trie18, trie19, "old0", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = null;
        naturalness.Trie trie25 = null;
        fuzzTest23.FuzzTest_remove(trie24, trie25, "", false);
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie29, trie30, "", false);
        fuzzTest6.FuzzTest_remove(trie18, trie30, "", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie43, trie44, "", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = null;
        fuzzTest48.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie54, trie55, "old0", true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.Trie trie60 = null;
        naturalness.Trie trie61 = null;
        fuzzTest59.FuzzTest_remove(trie60, trie61, "", false);
        naturalness.Trie trie65 = null;
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_remove(trie65, trie66, "old0", true);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.Trie trie71 = null;
        naturalness.Trie trie72 = null;
        fuzzTest70.FuzzTest_remove(trie71, trie72, "", false);
        naturalness.Trie trie76 = null;
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_remove(trie76, trie77, "old0", true);
        naturalness.Trie trie81 = null;
        fuzzTest59.FuzzTest_remove(trie77, trie81, "old2", true);
        fuzzTest37.FuzzTest_remove(trie55, trie77, "", true);
        fuzzTest0.FuzzTest_remove(trie30, trie77, "", true);
        naturalness.Trie trie91 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie91, trie92, "seed1", true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = null;
        naturalness.Trie trie24 = null;
        fuzzTest22.FuzzTest_remove(trie23, trie24, "", false);
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie28, trie29, "old0", true);
        naturalness.Trie trie33 = null;
        fuzzTest11.FuzzTest_remove(trie29, trie33, "old2", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie43, trie44, "old0", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = null;
        fuzzTest48.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie54, trie55, "old0", true);
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie59, trie60, "old0", true);
        naturalness.Trie trie64 = null;
        fuzzTest37.FuzzTest_remove(trie60, trie64, "", false);
        naturalness.Trie trie68 = null;
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.Trie trie70 = null;
        naturalness.Trie trie71 = null;
        fuzzTest69.FuzzTest_remove(trie70, trie71, "", false);
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_remove(trie75, trie76, "", false);
        fuzzTest37.FuzzTest_remove(trie68, trie75, "old2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie29, trie75, "seed2", true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.Trie trie23 = null;
        fuzzTest6.FuzzTest_remove(trie19, trie23, "", false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie33, trie34, "", false);
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie34, trie38, "hi!", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = null;
        fuzzTest42.FuzzTest_remove(trie43, trie44, "", false);
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_remove(trie48, trie49, "", false);
        naturalness.Trie trie53 = null;
        fuzzTest6.FuzzTest_remove(trie48, trie53, "seed0", true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = null;
        naturalness.Trie trie59 = null;
        fuzzTest57.FuzzTest_remove(trie58, trie59, "", false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = null;
        naturalness.Trie trie65 = null;
        fuzzTest63.FuzzTest_remove(trie64, trie65, "", false);
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_remove(trie69, trie70, "", false);
        naturalness.Trie trie74 = null;
        fuzzTest57.FuzzTest_remove(trie70, trie74, "", false);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.Trie trie79 = null;
        naturalness.Trie trie80 = null;
        fuzzTest78.FuzzTest_remove(trie79, trie80, "", false);
        naturalness.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_remove(trie84, trie85, "", false);
        naturalness.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_remove(trie85, trie89, "hi!", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie48, trie89, "old2", false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.Trie trie23 = null;
        fuzzTest6.FuzzTest_remove(trie19, trie23, "", false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie33, trie34, "", false);
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie34, trie38, "hi!", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = null;
        fuzzTest42.FuzzTest_remove(trie43, trie44, "", false);
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_remove(trie48, trie49, "", false);
        naturalness.Trie trie53 = null;
        fuzzTest6.FuzzTest_remove(trie48, trie53, "seed0", true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = null;
        naturalness.Trie trie59 = null;
        fuzzTest57.FuzzTest_remove(trie58, trie59, "", false);
        naturalness.Trie trie63 = null;
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_remove(trie63, trie64, "old0", true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.Trie trie69 = null;
        naturalness.Trie trie70 = null;
        fuzzTest68.FuzzTest_remove(trie69, trie70, "", false);
        naturalness.Trie trie74 = null;
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_remove(trie74, trie75, "old0", true);
        naturalness.Trie trie79 = null;
        fuzzTest57.FuzzTest_remove(trie75, trie79, "old2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie48, trie75, "seed2", true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "", false);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie18, trie22, "seed0", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(trie32, trie33, "", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = null;
        naturalness.Trie trie45 = null;
        fuzzTest43.FuzzTest_remove(trie44, trie45, "", false);
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.Trie trie54 = null;
        fuzzTest37.FuzzTest_remove(trie50, trie54, "", false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = null;
        fuzzTest58.FuzzTest_remove(trie59, trie60, "", false);
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_remove(trie64, trie65, "", false);
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie65, trie69, "hi!", true);
        naturalness.Trie trie73 = null;
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.Trie trie75 = null;
        naturalness.Trie trie76 = null;
        fuzzTest74.FuzzTest_remove(trie75, trie76, "", false);
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_remove(trie80, trie81, "", false);
        fuzzTest37.FuzzTest_remove(trie73, trie81, "hi!", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie33, trie81, "old2", false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "old0", true);
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie17, trie18, "old0", true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = null;
        naturalness.Trie trie25 = null;
        fuzzTest23.FuzzTest_remove(trie24, trie25, "", false);
        naturalness.Trie trie29 = null;
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie29, trie30, "old0", true);
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie34, trie35, "old0", true);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = null;
        naturalness.Trie trie41 = null;
        fuzzTest39.FuzzTest_remove(trie40, trie41, "", false);
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_remove(trie45, trie46, "", false);
        fuzzTest22.FuzzTest_remove(trie34, trie46, "", true);
        fuzzTest0.FuzzTest_remove(trie18, trie34, "", false);
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = null;
        naturalness.Trie trie59 = null;
        fuzzTest57.FuzzTest_remove(trie58, trie59, "", false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = null;
        naturalness.Trie trie65 = null;
        fuzzTest63.FuzzTest_remove(trie64, trie65, "", false);
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_remove(trie69, trie70, "", false);
        naturalness.Trie trie74 = null;
        fuzzTest57.FuzzTest_remove(trie70, trie74, "", false);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.Trie trie79 = null;
        naturalness.Trie trie80 = null;
        fuzzTest78.FuzzTest_remove(trie79, trie80, "", false);
        naturalness.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_remove(trie84, trie85, "", false);
        naturalness.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_remove(trie85, trie89, "hi!", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie56, trie85, "seed2", true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        fuzzTest0.FuzzTest_remove(trie13, trie17, "", false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.Trie trie22 = null;
        naturalness.Trie trie23 = null;
        fuzzTest21.FuzzTest_remove(trie22, trie23, "", false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie33, trie34, "", false);
        naturalness.Trie trie38 = null;
        fuzzTest21.FuzzTest_remove(trie34, trie38, "", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = null;
        fuzzTest42.FuzzTest_remove(trie43, trie44, "", false);
        naturalness.Trie trie48 = null;
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_remove(trie48, trie49, "old0", true);
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_remove(trie53, trie54, "old0", true);
        fuzzTest0.FuzzTest_remove(trie38, trie53, "old1", false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.Trie trie62 = null;
        naturalness.Trie trie63 = null;
        fuzzTest61.FuzzTest_remove(trie62, trie63, "", false);
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_remove(trie67, trie68, "", false);
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie67, trie72, "seed0", false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        naturalness.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "old0", true);
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.Trie trie23 = null;
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "old0", true);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = null;
        naturalness.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.Trie trie34 = null;
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "old0", true);
        naturalness.Trie trie39 = null;
        fuzzTest17.FuzzTest_remove(trie35, trie39, "old2", true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = null;
        naturalness.Trie trie45 = null;
        fuzzTest43.FuzzTest_remove(trie44, trie45, "", false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = null;
        naturalness.Trie trie51 = null;
        fuzzTest49.FuzzTest_remove(trie50, trie51, "", false);
        naturalness.Trie trie55 = null;
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_remove(trie55, trie56, "old0", true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.Trie trie61 = null;
        naturalness.Trie trie62 = null;
        fuzzTest60.FuzzTest_remove(trie61, trie62, "", false);
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_remove(trie66, trie67, "", false);
        fuzzTest43.FuzzTest_remove(trie55, trie67, "hi!", true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.Trie trie75 = null;
        naturalness.Trie trie76 = null;
        fuzzTest74.FuzzTest_remove(trie75, trie76, "", false);
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_remove(trie80, trie81, "", false);
        fuzzTest17.FuzzTest_remove(trie67, trie80, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie12, trie67, "seed2", true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie18, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(trie32, trie33, "", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie43, trie44, "old0", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = null;
        fuzzTest48.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie54, trie55, "old0", true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.Trie trie60 = null;
        naturalness.Trie trie61 = null;
        fuzzTest59.FuzzTest_remove(trie60, trie61, "", false);
        naturalness.Trie trie65 = null;
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_remove(trie65, trie66, "old0", true);
        naturalness.Trie trie70 = null;
        fuzzTest48.FuzzTest_remove(trie66, trie70, "old2", true);
        fuzzTest26.FuzzTest_remove(trie44, trie66, "", true);
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie44, trie77, "seed0", false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = null;
        naturalness.Trie trie9 = null;
        fuzzTest7.FuzzTest_remove(trie8, trie9, "", false);
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_remove(trie13, trie14, "old0", true);
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_remove(trie18, trie19, "old0", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = null;
        naturalness.Trie trie25 = null;
        fuzzTest23.FuzzTest_remove(trie24, trie25, "", false);
        naturalness.Trie trie29 = null;
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie29, trie30, "old0", true);
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie34, trie35, "old0", true);
        fuzzTest6.FuzzTest_remove(trie19, trie34, "old2", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = null;
        fuzzTest42.FuzzTest_remove(trie43, trie44, "", false);
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_remove(trie48, trie49, "", false);
        fuzzTest0.FuzzTest_remove(trie34, trie49, "seed2", false);
        naturalness.Trie trie56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = null;
        naturalness.Trie trie59 = null;
        fuzzTest57.FuzzTest_remove(trie58, trie59, "", false);
        naturalness.Trie trie63 = null;
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_remove(trie63, trie64, "old0", true);
        fuzzTest0.FuzzTest_remove(trie56, trie63, "hi!", true);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.Trie trie72 = null;
        naturalness.Trie trie73 = null;
        fuzzTest71.FuzzTest_remove(trie72, trie73, "", false);
        naturalness.Trie trie77 = null;
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_remove(trie77, trie78, "old0", true);
        naturalness.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie78, trie82, "seed0", true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = null;
        naturalness.Trie trie24 = null;
        fuzzTest22.FuzzTest_remove(trie23, trie24, "", false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = null;
        naturalness.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.Trie trie34 = null;
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "old0", true);
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie39, trie40, "old0", true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.Trie trie46 = null;
        naturalness.Trie trie47 = null;
        fuzzTest45.FuzzTest_remove(trie46, trie47, "", false);
        naturalness.Trie trie51 = null;
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_remove(trie51, trie52, "old0", true);
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_remove(trie56, trie57, "old0", true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.Trie trie62 = null;
        naturalness.Trie trie63 = null;
        fuzzTest61.FuzzTest_remove(trie62, trie63, "", false);
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_remove(trie67, trie68, "", false);
        fuzzTest44.FuzzTest_remove(trie56, trie68, "", true);
        fuzzTest22.FuzzTest_remove(trie40, trie56, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie17, trie56, "seed1", false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        fuzzTest0.FuzzTest_remove(trie13, trie17, "", false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.Trie trie22 = null;
        naturalness.Trie trie23 = null;
        fuzzTest21.FuzzTest_remove(trie22, trie23, "", false);
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_remove(trie27, trie28, "old0", true);
        naturalness.Trie trie32 = null;
        fuzzTest0.FuzzTest_remove(trie28, trie32, "old0", false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.Trie trie37 = null;
        naturalness.Trie trie38 = null;
        fuzzTest36.FuzzTest_remove(trie37, trie38, "", false);
        naturalness.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_remove(trie42, trie43, "", false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = null;
        fuzzTest48.FuzzTest_remove(trie49, trie50, "", false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = null;
        naturalness.Trie trie56 = null;
        fuzzTest54.FuzzTest_remove(trie55, trie56, "", false);
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_remove(trie60, trie61, "", false);
        naturalness.Trie trie65 = null;
        fuzzTest48.FuzzTest_remove(trie61, trie65, "", false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.Trie trie70 = null;
        naturalness.Trie trie71 = null;
        fuzzTest69.FuzzTest_remove(trie70, trie71, "", false);
        naturalness.Trie trie75 = null;
        naturalness.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_remove(trie75, trie76, "old0", true);
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_remove(trie80, trie81, "old0", true);
        fuzzTest47.FuzzTest_remove(trie65, trie81, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie43, trie81, "old2", false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "old1", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.Trie trie23 = null;
        fuzzTest6.FuzzTest_remove(trie19, trie23, "", false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie33, trie34, "old0", true);
        naturalness.Trie trie38 = null;
        fuzzTest6.FuzzTest_remove(trie34, trie38, "old0", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = null;
        fuzzTest42.FuzzTest_remove(trie43, trie44, "", false);
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.Trie trie51 = null;
        naturalness.Trie trie52 = null;
        fuzzTest50.FuzzTest_remove(trie51, trie52, "", false);
        naturalness.Trie trie56 = null;
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_remove(trie56, trie57, "old0", true);
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_remove(trie61, trie62, "old0", true);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.Trie trie67 = null;
        naturalness.Trie trie68 = null;
        fuzzTest66.FuzzTest_remove(trie67, trie68, "", false);
        naturalness.Trie trie72 = null;
        naturalness.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_remove(trie72, trie73, "old0", true);
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_remove(trie77, trie78, "old0", true);
        fuzzTest49.FuzzTest_remove(trie62, trie77, "old2", false);
        fuzzTest42.FuzzTest_remove(trie48, trie62, "old2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie34, trie62, "seed0", true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        fuzzTest0.FuzzTest_remove(trie13, trie17, "", false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.Trie trie22 = null;
        naturalness.Trie trie23 = null;
        fuzzTest21.FuzzTest_remove(trie22, trie23, "", false);
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_remove(trie27, trie28, "old0", true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = null;
        fuzzTest32.FuzzTest_remove(trie33, trie34, "", false);
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.Trie trie43 = null;
        fuzzTest21.FuzzTest_remove(trie38, trie43, "", false);
        naturalness.Trie trie47 = null;
        naturalness.Trie trie48 = null;
        fuzzTest21.FuzzTest_remove(trie47, trie48, "", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = null;
        naturalness.Trie trie54 = null;
        fuzzTest52.FuzzTest_remove(trie53, trie54, "", false);
        naturalness.Trie trie58 = null;
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(trie58, trie59, "old0", true);
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(trie63, trie64, "old0", true);
        naturalness.Trie trie68 = null;
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.Trie trie70 = null;
        naturalness.Trie trie71 = null;
        fuzzTest69.FuzzTest_remove(trie70, trie71, "", false);
        naturalness.Trie trie75 = null;
        naturalness.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_remove(trie75, trie76, "old0", true);
        fuzzTest52.FuzzTest_remove(trie68, trie76, "seed2", true);
        naturalness.Trie trie83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_remove(trie76, trie83, "", true);
        naturalness.Trie trie87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie76, trie87, "seed2", true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = null;
        naturalness.Trie trie4 = null;
        fuzzTest2.FuzzTest_remove(trie3, trie4, "", false);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = null;
        naturalness.Trie trie10 = null;
        fuzzTest8.FuzzTest_remove(trie9, trie10, "", false);
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_remove(trie14, trie15, "", false);
        naturalness.Trie trie19 = null;
        fuzzTest2.FuzzTest_remove(trie15, trie19, "", false);
        fuzzTest0.FuzzTest_remove(trie1, trie15, "seed1", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = null;
        naturalness.Trie trie35 = null;
        fuzzTest33.FuzzTest_remove(trie34, trie35, "", false);
        naturalness.Trie trie39 = null;
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_remove(trie39, trie40, "old0", true);
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_remove(trie44, trie45, "old0", true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = null;
        naturalness.Trie trie51 = null;
        fuzzTest49.FuzzTest_remove(trie50, trie51, "", false);
        naturalness.Trie trie55 = null;
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_remove(trie55, trie56, "old0", true);
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_remove(trie60, trie61, "old0", true);
        fuzzTest32.FuzzTest_remove(trie45, trie60, "old2", false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.Trie trie69 = null;
        naturalness.Trie trie70 = null;
        fuzzTest68.FuzzTest_remove(trie69, trie70, "", false);
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_remove(trie74, trie75, "", false);
        fuzzTest26.FuzzTest_remove(trie60, trie75, "seed2", false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.Trie trie83 = null;
        naturalness.Trie trie84 = null;
        fuzzTest82.FuzzTest_remove(trie83, trie84, "", false);
        naturalness.Trie trie88 = null;
        naturalness.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_remove(trie88, trie89, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie60, trie89, "old1", false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie18, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(trie32, trie33, "old0", true);
        naturalness.Trie trie37 = null;
        fuzzTest0.FuzzTest_remove(trie33, trie37, "", false);
        naturalness.Trie trie41 = null;
        naturalness.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie41, trie42, "old1", false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.Trie trie47 = null;
        naturalness.Trie trie48 = null;
        fuzzTest46.FuzzTest_remove(trie47, trie48, "", false);
        naturalness.Trie trie52 = null;
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_remove(trie52, trie53, "old0", true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = null;
        naturalness.Trie trie59 = null;
        fuzzTest57.FuzzTest_remove(trie58, trie59, "", false);
        naturalness.Trie trie63 = null;
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_remove(trie63, trie64, "old0", true);
        naturalness.Trie trie68 = null;
        fuzzTest46.FuzzTest_remove(trie64, trie68, "old2", true);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.Trie trie73 = null;
        naturalness.Trie trie74 = null;
        fuzzTest72.FuzzTest_remove(trie73, trie74, "", false);
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_remove(trie78, trie79, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie64, trie79, "old0", false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        naturalness.Trie trie11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = null;
        naturalness.Trie trie25 = null;
        fuzzTest23.FuzzTest_remove(trie24, trie25, "", false);
        naturalness.Trie trie29 = null;
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie29, trie30, "old0", true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = null;
        naturalness.Trie trie36 = null;
        fuzzTest34.FuzzTest_remove(trie35, trie36, "", false);
        naturalness.Trie trie40 = null;
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_remove(trie40, trie41, "old0", true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.Trie trie46 = null;
        naturalness.Trie trie47 = null;
        fuzzTest45.FuzzTest_remove(trie46, trie47, "", false);
        naturalness.Trie trie51 = null;
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_remove(trie51, trie52, "old0", true);
        naturalness.Trie trie56 = null;
        fuzzTest34.FuzzTest_remove(trie52, trie56, "old2", true);
        fuzzTest12.FuzzTest_remove(trie30, trie52, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie11, trie52, "seed1", true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        naturalness.Trie trie11 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie11, trie12, "old0", true);
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = null;
        naturalness.Trie trie25 = null;
        fuzzTest23.FuzzTest_remove(trie24, trie25, "", false);
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.Trie trie34 = null;
        fuzzTest17.FuzzTest_remove(trie30, trie34, "", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = null;
        naturalness.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie44, trie45, "", false);
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie45, trie49, "hi!", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie16, trie49, "seed0", true);
    }
}

