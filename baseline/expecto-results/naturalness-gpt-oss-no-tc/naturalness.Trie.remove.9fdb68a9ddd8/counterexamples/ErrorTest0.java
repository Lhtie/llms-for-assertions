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
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_remove(trie40, trie41, "", false);
        fuzzTest22.FuzzTest_remove(trie30, trie41, "seed0", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = null;
        fuzzTest48.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie54, trie55, "", false);
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
        fuzzTest22.FuzzTest_remove(trie55, trie77, "hi!", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie18, trie77, "old2", false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        fuzzTest0.FuzzTest_remove(trie8, trie19, "seed0", true);
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
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie33, trie44, "old0", false);
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
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = null;
        naturalness.Trie trie9 = null;
        fuzzTest7.FuzzTest_remove(trie8, trie9, "", false);
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_remove(trie13, trie14, "old0", true);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = null;
        naturalness.Trie trie20 = null;
        fuzzTest18.FuzzTest_remove(trie19, trie20, "", false);
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_remove(trie24, trie25, "", false);
        fuzzTest6.FuzzTest_remove(trie14, trie25, "seed0", true);
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie14, trie32, "old0", false);
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
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = null;
        naturalness.Trie trie56 = null;
        fuzzTest54.FuzzTest_remove(trie55, trie56, "", false);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.Trie trie61 = null;
        naturalness.Trie trie62 = null;
        fuzzTest60.FuzzTest_remove(trie61, trie62, "", false);
        naturalness.Trie trie66 = null;
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_remove(trie66, trie67, "old0", true);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.Trie trie72 = null;
        naturalness.Trie trie73 = null;
        fuzzTest71.FuzzTest_remove(trie72, trie73, "", false);
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_remove(trie77, trie78, "", false);
        fuzzTest54.FuzzTest_remove(trie66, trie78, "hi!", true);
        fuzzTest37.FuzzTest_remove(trie49, trie66, "seed0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie30, trie49, "old0", false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie54, trie55, "", false);
        fuzzTest6.FuzzTest_remove(trie43, trie55, "seed0", false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = null;
        naturalness.Trie trie65 = null;
        fuzzTest63.FuzzTest_remove(trie64, trie65, "", false);
        naturalness.Trie trie69 = null;
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_remove(trie69, trie70, "old0", true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.Trie trie75 = null;
        naturalness.Trie trie76 = null;
        fuzzTest74.FuzzTest_remove(trie75, trie76, "", false);
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_remove(trie80, trie81, "", false);
        fuzzTest62.FuzzTest_remove(trie70, trie81, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie55, trie70, "old1", false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = null;
        naturalness.Trie trie26 = null;
        fuzzTest24.FuzzTest_remove(trie25, trie26, "", false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.Trie trie31 = null;
        naturalness.Trie trie32 = null;
        fuzzTest30.FuzzTest_remove(trie31, trie32, "", false);
        naturalness.Trie trie36 = null;
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_remove(trie36, trie37, "old0", true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.Trie trie42 = null;
        naturalness.Trie trie43 = null;
        fuzzTest41.FuzzTest_remove(trie42, trie43, "", false);
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_remove(trie47, trie48, "", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
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
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_remove(trie70, trie71, "", false);
        fuzzTest52.FuzzTest_remove(trie60, trie71, "seed0", true);
        fuzzTest30.FuzzTest_remove(trie48, trie60, "", false);
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_remove(trie48, trie81, "seed2", true);
        fuzzTest17.FuzzTest_remove(trie23, trie81, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie13, trie81, "old2", false);
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
        fuzzTest2.FuzzTest_remove(trie3, trie4, "", false);
        naturalness.Trie trie8 = null;
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_remove(trie8, trie9, "old0", true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = null;
        naturalness.Trie trie15 = null;
        fuzzTest13.FuzzTest_remove(trie14, trie15, "", false);
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_remove(trie19, trie20, "", false);
        fuzzTest1.FuzzTest_remove(trie9, trie20, "seed0", true);
        naturalness.Trie trie27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = null;
        naturalness.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.Trie trie34 = null;
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "old0", true);
        fuzzTest1.FuzzTest_remove(trie27, trie35, "old2", false);
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
        naturalness.Trie trie75 = null;
        fuzzTest53.FuzzTest_remove(trie71, trie75, "old2", true);
        fuzzTest1.FuzzTest_remove(trie49, trie75, "hi!", false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.Trie trie83 = null;
        naturalness.Trie trie84 = null;
        fuzzTest82.FuzzTest_remove(trie83, trie84, "", false);
        naturalness.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_remove(trie88, trie89, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie49, trie89, "seed2", false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = null;
        naturalness.Trie trie9 = null;
        fuzzTest7.FuzzTest_remove(trie8, trie9, "", false);
        naturalness.Trie trie13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = null;
        naturalness.Trie trie16 = null;
        fuzzTest14.FuzzTest_remove(trie15, trie16, "", false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.Trie trie21 = null;
        naturalness.Trie trie22 = null;
        fuzzTest20.FuzzTest_remove(trie21, trie22, "", false);
        naturalness.Trie trie26 = null;
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_remove(trie26, trie27, "old0", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = null;
        fuzzTest31.FuzzTest_remove(trie32, trie33, "", false);
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_remove(trie37, trie38, "", false);
        fuzzTest14.FuzzTest_remove(trie26, trie38, "hi!", true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.Trie trie46 = null;
        naturalness.Trie trie47 = null;
        fuzzTest45.FuzzTest_remove(trie46, trie47, "", false);
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_remove(trie51, trie52, "", false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.Trie trie57 = null;
        naturalness.Trie trie58 = null;
        fuzzTest56.FuzzTest_remove(trie57, trie58, "", false);
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_remove(trie62, trie63, "", false);
        fuzzTest14.FuzzTest_remove(trie51, trie63, "seed0", false);
        fuzzTest7.FuzzTest_remove(trie13, trie51, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie6, trie51, "old1", false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
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
        fuzzTest11.FuzzTest_remove(trie19, trie30, "seed0", true);
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
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = null;
        naturalness.Trie trie56 = null;
        fuzzTest54.FuzzTest_remove(trie55, trie56, "", false);
        naturalness.Trie trie60 = null;
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_remove(trie60, trie61, "old0", true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.Trie trie66 = null;
        naturalness.Trie trie67 = null;
        fuzzTest65.FuzzTest_remove(trie66, trie67, "", false);
        naturalness.Trie trie71 = null;
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_remove(trie71, trie72, "old0", true);
        naturalness.Trie trie76 = null;
        fuzzTest54.FuzzTest_remove(trie72, trie76, "old2", true);
        fuzzTest37.FuzzTest_remove(trie49, trie72, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie30, trie49, "seed1", false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = null;
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old1", true);
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
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "", false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = null;
        naturalness.Trie trie41 = null;
        fuzzTest39.FuzzTest_remove(trie40, trie41, "", false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.Trie trie46 = null;
        naturalness.Trie trie47 = null;
        fuzzTest45.FuzzTest_remove(trie46, trie47, "", false);
        naturalness.Trie trie51 = null;
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_remove(trie51, trie52, "old0", true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.Trie trie57 = null;
        naturalness.Trie trie58 = null;
        fuzzTest56.FuzzTest_remove(trie57, trie58, "", false);
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_remove(trie62, trie63, "", false);
        fuzzTest39.FuzzTest_remove(trie51, trie63, "hi!", true);
        fuzzTest22.FuzzTest_remove(trie34, trie51, "seed0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie17, trie34, "old0", false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = null;
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old1", true);
        naturalness.Trie trie11 = null;
        naturalness.Trie trie12 = null;
        fuzzTest0.FuzzTest_remove(trie11, trie12, "old0", true);
        naturalness.Trie trie16 = null;
        naturalness.Trie trie17 = null;
        fuzzTest0.FuzzTest_remove(trie16, trie17, "seed0", false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.Trie trie22 = null;
        naturalness.Trie trie23 = null;
        fuzzTest21.FuzzTest_remove(trie22, trie23, "", false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie33, trie34, "old0", true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = null;
        naturalness.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie44, trie45, "", false);
        fuzzTest21.FuzzTest_remove(trie33, trie45, "hi!", true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = null;
        naturalness.Trie trie54 = null;
        fuzzTest52.FuzzTest_remove(trie53, trie54, "", false);
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(trie58, trie59, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie45, trie58, "seed1", false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        naturalness.Trie trie11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = null;
        naturalness.Trie trie16 = null;
        fuzzTest14.FuzzTest_remove(trie15, trie16, "", false);
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_remove(trie20, trie21, "", false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.Trie trie26 = null;
        naturalness.Trie trie27 = null;
        fuzzTest25.FuzzTest_remove(trie26, trie27, "", false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = null;
        fuzzTest31.FuzzTest_remove(trie32, trie33, "", false);
        naturalness.Trie trie37 = null;
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_remove(trie37, trie38, "old0", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = null;
        fuzzTest42.FuzzTest_remove(trie43, trie44, "", false);
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_remove(trie48, trie49, "", false);
        fuzzTest25.FuzzTest_remove(trie37, trie49, "hi!", true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
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
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_remove(trie74, trie75, "", false);
        fuzzTest56.FuzzTest_remove(trie64, trie75, "seed0", true);
        fuzzTest14.FuzzTest_remove(trie49, trie64, "old2", true);
        fuzzTest12.FuzzTest_remove(trie13, trie64, "seed2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie11, trie13, "old0", false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        naturalness.Trie trie26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie33, trie34, "old0", true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = null;
        naturalness.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.Trie trie44 = null;
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie44, trie45, "old0", true);
        naturalness.Trie trie49 = null;
        fuzzTest27.FuzzTest_remove(trie45, trie49, "old2", true);
        fuzzTest0.FuzzTest_remove(trie26, trie49, "seed0", false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.Trie trie57 = null;
        naturalness.Trie trie58 = null;
        fuzzTest56.FuzzTest_remove(trie57, trie58, "", false);
        naturalness.Trie trie62 = null;
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_remove(trie62, trie63, "old0", true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.Trie trie68 = null;
        naturalness.Trie trie69 = null;
        fuzzTest67.FuzzTest_remove(trie68, trie69, "", false);
        naturalness.Trie trie73 = null;
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_remove(trie73, trie74, "old0", true);
        naturalness.Trie trie78 = null;
        fuzzTest56.FuzzTest_remove(trie74, trie78, "old2", true);
        naturalness.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie74, trie82, "old0", false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = null;
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old1", true);
        naturalness.Trie trie11 = null;
        naturalness.Trie trie12 = null;
        fuzzTest0.FuzzTest_remove(trie11, trie12, "seed1", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = null;
        fuzzTest16.FuzzTest_remove(trie17, trie18, "", false);
        naturalness.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_remove(trie22, trie23, "", false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie33, trie34, "old0", true);
        naturalness.Trie trie38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.Trie trie41 = null;
        naturalness.Trie trie42 = null;
        fuzzTest40.FuzzTest_remove(trie41, trie42, "", false);
        naturalness.Trie trie46 = null;
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_remove(trie46, trie47, "old0", true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.Trie trie52 = null;
        naturalness.Trie trie53 = null;
        fuzzTest51.FuzzTest_remove(trie52, trie53, "", false);
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_remove(trie57, trie58, "", false);
        fuzzTest39.FuzzTest_remove(trie47, trie58, "seed0", true);
        naturalness.Trie trie65 = null;
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.Trie trie67 = null;
        naturalness.Trie trie68 = null;
        fuzzTest66.FuzzTest_remove(trie67, trie68, "", false);
        naturalness.Trie trie72 = null;
        naturalness.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_remove(trie72, trie73, "old0", true);
        fuzzTest39.FuzzTest_remove(trie65, trie73, "old2", false);
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie81 = null;
        fuzzTest39.FuzzTest_remove(trie80, trie81, "", false);
        fuzzTest27.FuzzTest_remove(trie38, trie80, "old1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie22, trie80, "old1", false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = null;
        fuzzTest0.FuzzTest_remove(trie6, trie7, "", true);
        naturalness.Trie trie11 = null;
        naturalness.Trie trie12 = null;
        fuzzTest0.FuzzTest_remove(trie11, trie12, "old2", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = null;
        fuzzTest16.FuzzTest_remove(trie17, trie18, "", false);
        naturalness.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_remove(trie22, trie23, "", false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie33, trie34, "old0", true);
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = null;
        naturalness.Trie trie41 = null;
        fuzzTest39.FuzzTest_remove(trie40, trie41, "", false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.Trie trie46 = null;
        naturalness.Trie trie47 = null;
        fuzzTest45.FuzzTest_remove(trie46, trie47, "", false);
        naturalness.Trie trie51 = null;
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_remove(trie51, trie52, "old0", true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.Trie trie57 = null;
        naturalness.Trie trie58 = null;
        fuzzTest56.FuzzTest_remove(trie57, trie58, "", false);
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_remove(trie62, trie63, "", false);
        fuzzTest39.FuzzTest_remove(trie51, trie63, "hi!", true);
        fuzzTest27.FuzzTest_remove(trie38, trie51, "seed0", true);
        naturalness.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.Trie trie75 = null;
        naturalness.Trie trie76 = null;
        fuzzTest74.FuzzTest_remove(trie75, trie76, "", false);
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_remove(trie80, trie81, "", false);
        fuzzTest27.FuzzTest_remove(trie73, trie80, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie23, trie80, "seed0", false);
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
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie18, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(trie32, trie33, "old0", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie43, trie44, "", false);
        fuzzTest0.FuzzTest_remove(trie32, trie44, "seed2", true);
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie52 = null;
        fuzzTest0.FuzzTest_remove(trie51, trie52, "old0", true);
        naturalness.Trie trie56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = null;
        naturalness.Trie trie59 = null;
        fuzzTest57.FuzzTest_remove(trie58, trie59, "", false);
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_remove(trie63, trie64, "", false);
        fuzzTest0.FuzzTest_remove(trie56, trie64, "old0", true);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.Trie trie72 = null;
        naturalness.Trie trie73 = null;
        fuzzTest71.FuzzTest_remove(trie72, trie73, "", false);
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_remove(trie77, trie78, "", false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.Trie trie83 = null;
        naturalness.Trie trie84 = null;
        fuzzTest82.FuzzTest_remove(trie83, trie84, "", false);
        naturalness.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_remove(trie88, trie89, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie78, trie89, "seed0", false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = null;
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old1", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
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
        fuzzTest11.FuzzTest_remove(trie19, trie30, "seed0", true);
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
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = null;
        naturalness.Trie trie56 = null;
        fuzzTest54.FuzzTest_remove(trie55, trie56, "", false);
        naturalness.Trie trie60 = null;
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_remove(trie60, trie61, "old0", true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.Trie trie66 = null;
        naturalness.Trie trie67 = null;
        fuzzTest65.FuzzTest_remove(trie66, trie67, "", false);
        naturalness.Trie trie71 = null;
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_remove(trie71, trie72, "old0", true);
        naturalness.Trie trie76 = null;
        fuzzTest54.FuzzTest_remove(trie72, trie76, "old2", true);
        fuzzTest37.FuzzTest_remove(trie49, trie72, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie19, trie72, "old2", false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie28, trie29, "old0", true);
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = null;
        naturalness.Trie trie36 = null;
        fuzzTest34.FuzzTest_remove(trie35, trie36, "", false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.Trie trie41 = null;
        naturalness.Trie trie42 = null;
        fuzzTest40.FuzzTest_remove(trie41, trie42, "", false);
        naturalness.Trie trie46 = null;
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_remove(trie46, trie47, "old0", true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.Trie trie52 = null;
        naturalness.Trie trie53 = null;
        fuzzTest51.FuzzTest_remove(trie52, trie53, "", false);
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_remove(trie57, trie58, "", false);
        fuzzTest34.FuzzTest_remove(trie46, trie58, "hi!", true);
        fuzzTest22.FuzzTest_remove(trie33, trie46, "seed0", true);
        naturalness.Trie trie68 = null;
        naturalness.Trie trie69 = null;
        fuzzTest22.FuzzTest_remove(trie68, trie69, "seed0", false);
        naturalness.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie74 = null;
        fuzzTest22.FuzzTest_remove(trie73, trie74, "seed0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie18, trie73, "old0", false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
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
        fuzzTest11.FuzzTest_remove(trie19, trie30, "seed0", true);
        naturalness.Trie trie37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = null;
        naturalness.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.Trie trie44 = null;
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie44, trie45, "old0", true);
        fuzzTest11.FuzzTest_remove(trie37, trie45, "seed1", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = null;
        fuzzTest53.FuzzTest_remove(trie54, trie55, "", false);
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_remove(trie59, trie60, "old0", true);
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(trie59, trie64, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie45, trie64, "old1", false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = null;
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old1", true);
        naturalness.Trie trie11 = null;
        naturalness.Trie trie12 = null;
        fuzzTest0.FuzzTest_remove(trie11, trie12, "old0", true);
        naturalness.Trie trie16 = null;
        naturalness.Trie trie17 = null;
        fuzzTest0.FuzzTest_remove(trie16, trie17, "seed0", false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.Trie trie22 = null;
        naturalness.Trie trie23 = null;
        fuzzTest21.FuzzTest_remove(trie22, trie23, "", false);
        naturalness.Trie trie27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = null;
        naturalness.Trie trie31 = null;
        fuzzTest29.FuzzTest_remove(trie30, trie31, "", false);
        naturalness.Trie trie35 = null;
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_remove(trie35, trie36, "old0", true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.Trie trie41 = null;
        naturalness.Trie trie42 = null;
        fuzzTest40.FuzzTest_remove(trie41, trie42, "", false);
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_remove(trie46, trie47, "", false);
        fuzzTest28.FuzzTest_remove(trie36, trie47, "seed0", true);
        fuzzTest21.FuzzTest_remove(trie27, trie36, "hi!", false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = null;
        fuzzTest58.FuzzTest_remove(trie59, trie60, "", false);
        naturalness.Trie trie64 = null;
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_remove(trie64, trie65, "old0", true);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.Trie trie70 = null;
        naturalness.Trie trie71 = null;
        fuzzTest69.FuzzTest_remove(trie70, trie71, "", false);
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_remove(trie75, trie76, "", false);
        fuzzTest57.FuzzTest_remove(trie65, trie76, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie36, trie76, "old1", false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        fuzzTest0.FuzzTest_remove(trie8, trie19, "seed0", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(trie32, trie33, "old0", true);
        naturalness.Trie trie37 = null;
        fuzzTest0.FuzzTest_remove(trie32, trie37, "", true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = null;
        fuzzTest42.FuzzTest_remove(trie43, trie44, "", false);
        naturalness.Trie trie48 = null;
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_remove(trie48, trie49, "old0", true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = null;
        fuzzTest53.FuzzTest_remove(trie54, trie55, "", false);
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_remove(trie59, trie60, "", false);
        fuzzTest41.FuzzTest_remove(trie49, trie60, "seed0", true);
        naturalness.Trie trie67 = null;
        fuzzTest0.FuzzTest_remove(trie60, trie67, "hi!", true);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.Trie trie72 = null;
        naturalness.Trie trie73 = null;
        fuzzTest71.FuzzTest_remove(trie72, trie73, "", false);
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_remove(trie77, trie78, "", false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.Trie trie83 = null;
        naturalness.Trie trie84 = null;
        fuzzTest82.FuzzTest_remove(trie83, trie84, "", false);
        naturalness.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_remove(trie88, trie89, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie77, trie89, "old1", false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = null;
        naturalness.Trie trie31 = null;
        fuzzTest29.FuzzTest_remove(trie30, trie31, "", false);
        naturalness.Trie trie35 = null;
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_remove(trie35, trie36, "old0", true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.Trie trie41 = null;
        naturalness.Trie trie42 = null;
        fuzzTest40.FuzzTest_remove(trie41, trie42, "", false);
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_remove(trie46, trie47, "", false);
        fuzzTest28.FuzzTest_remove(trie36, trie47, "seed0", true);
        fuzzTest6.FuzzTest_remove(trie24, trie36, "", false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = null;
        naturalness.Trie trie59 = null;
        fuzzTest57.FuzzTest_remove(trie58, trie59, "seed1", false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = null;
        naturalness.Trie trie65 = null;
        fuzzTest63.FuzzTest_remove(trie64, trie65, "", false);
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_remove(trie69, trie70, "", false);
        naturalness.Trie trie74 = null;
        fuzzTest57.FuzzTest_remove(trie69, trie74, "seed0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie36, trie69, "seed0", false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = null;
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old1", true);
        naturalness.Trie trie11 = null;
        naturalness.Trie trie12 = null;
        fuzzTest0.FuzzTest_remove(trie11, trie12, "old0", true);
        naturalness.Trie trie16 = null;
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.Trie trie23 = null;
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "old0", true);
        fuzzTest0.FuzzTest_remove(trie16, trie23, "seed0", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = null;
        fuzzTest31.FuzzTest_remove(trie32, trie33, "", false);
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_remove(trie37, trie38, "", false);
        naturalness.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie38, trie42, "old0", false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", false);
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = null;
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old1", true);
        naturalness.Trie trie11 = null;
        naturalness.Trie trie12 = null;
        fuzzTest0.FuzzTest_remove(trie11, trie12, "seed1", false);
        naturalness.Trie trie16 = null;
        naturalness.Trie trie17 = null;
        fuzzTest0.FuzzTest_remove(trie16, trie17, "", true);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.Trie trie22 = null;
        naturalness.Trie trie23 = null;
        fuzzTest21.FuzzTest_remove(trie22, trie23, "", false);
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_remove(trie27, trie28, "", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = null;
        naturalness.Trie trie34 = null;
        fuzzTest32.FuzzTest_remove(trie33, trie34, "", false);
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_remove(trie38, trie39, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie27, trie39, "old1", false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
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
        fuzzTest11.FuzzTest_remove(trie12, trie13, "seed1", false);
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = null;
        fuzzTest11.FuzzTest_remove(trie17, trie18, "", true);
        naturalness.Trie trie22 = null;
        naturalness.Trie trie23 = null;
        fuzzTest11.FuzzTest_remove(trie22, trie23, "old2", false);
        naturalness.Trie trie27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = null;
        naturalness.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "", false);
        fuzzTest11.FuzzTest_remove(trie27, trie35, "seed2", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = null;
        naturalness.Trie trie45 = null;
        fuzzTest43.FuzzTest_remove(trie44, trie45, "", false);
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(trie49, trie50, "old0", true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = null;
        naturalness.Trie trie56 = null;
        fuzzTest54.FuzzTest_remove(trie55, trie56, "", false);
        naturalness.Trie trie60 = null;
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_remove(trie60, trie61, "old0", true);
        naturalness.Trie trie65 = null;
        fuzzTest43.FuzzTest_remove(trie61, trie65, "old2", true);
        naturalness.Trie trie69 = null;
        fuzzTest42.FuzzTest_remove(trie61, trie69, "old2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie35, trie61, "seed2", false);
    }
}

