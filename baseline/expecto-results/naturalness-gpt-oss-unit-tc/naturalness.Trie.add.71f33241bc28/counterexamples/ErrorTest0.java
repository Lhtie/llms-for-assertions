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
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        naturalness.mut_000.Trie trie23 = null;
        naturalness.mut_000.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie23, trie24, "old0", true);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie29 = null;
        naturalness.mut_000.Trie trie30 = null;
        fuzzTest28.FuzzTest_add(trie29, trie30, "", false);
        naturalness.mut_000.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_add(trie34, trie35, "", false);
        fuzzTest11.FuzzTest_add(trie23, trie35, "hi!", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie44 = null;
        naturalness.mut_000.Trie trie45 = null;
        fuzzTest43.FuzzTest_add(trie44, trie45, "", false);
        naturalness.mut_000.Trie trie49 = null;
        naturalness.mut_000.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie49, trie50, "old0", true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie55 = null;
        naturalness.mut_000.Trie trie56 = null;
        fuzzTest54.FuzzTest_add(trie55, trie56, "", false);
        naturalness.mut_000.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(trie60, trie61, "", false);
        fuzzTest42.FuzzTest_add(trie50, trie61, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie35, trie50, "old2", true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie2 = null;
        naturalness.mut_000.Trie trie3 = null;
        fuzzTest1.FuzzTest_add(trie2, trie3, "", false);
        naturalness.mut_000.Trie trie7 = null;
        naturalness.mut_000.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie7, trie8, "old0", true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie13 = null;
        naturalness.mut_000.Trie trie14 = null;
        fuzzTest12.FuzzTest_add(trie13, trie14, "", false);
        naturalness.mut_000.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie18, trie19, "", false);
        fuzzTest0.FuzzTest_add(trie8, trie19, "seed0", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie28 = null;
        naturalness.mut_000.Trie trie29 = null;
        fuzzTest27.FuzzTest_add(trie28, trie29, "", false);
        naturalness.mut_000.Trie trie33 = null;
        naturalness.mut_000.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_add(trie33, trie34, "old0", true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie39 = null;
        naturalness.mut_000.Trie trie40 = null;
        fuzzTest38.FuzzTest_add(trie39, trie40, "", false);
        naturalness.mut_000.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(trie44, trie45, "", false);
        fuzzTest26.FuzzTest_add(trie34, trie45, "seed0", true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie53 = null;
        naturalness.mut_000.Trie trie54 = null;
        fuzzTest52.FuzzTest_add(trie53, trie54, "", false);
        naturalness.mut_000.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_add(trie58, trie59, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie45, trie58, "seed2", true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie7 = null;
        naturalness.mut_000.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        naturalness.mut_000.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie24 = null;
        naturalness.mut_000.Trie trie25 = null;
        fuzzTest23.FuzzTest_add(trie24, trie25, "", false);
        naturalness.mut_000.Trie trie29 = null;
        naturalness.mut_000.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie29, trie30, "old0", true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie35 = null;
        naturalness.mut_000.Trie trie36 = null;
        fuzzTest34.FuzzTest_add(trie35, trie36, "", false);
        naturalness.mut_000.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie40, trie41, "", false);
        fuzzTest17.FuzzTest_add(trie29, trie41, "hi!", true);
        fuzzTest0.FuzzTest_add(trie12, trie29, "seed0", false);
        naturalness.mut_000.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie51, trie52, "hi!", true);
        naturalness.mut_000.Trie trie56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie58 = null;
        naturalness.mut_000.Trie trie59 = null;
        fuzzTest57.FuzzTest_add(trie58, trie59, "", false);
        naturalness.mut_000.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(trie63, trie64, "", false);
        fuzzTest0.FuzzTest_add(trie56, trie63, "hi!", false);
        naturalness.mut_000.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie73 = null;
        naturalness.mut_000.Trie trie74 = null;
        fuzzTest72.FuzzTest_add(trie73, trie74, "", false);
        naturalness.mut_000.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_add(trie78, trie79, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie71, trie79, "old2", true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie13 = null;
        naturalness.mut_000.Trie trie14 = null;
        fuzzTest12.FuzzTest_add(trie13, trie14, "", false);
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie18, trie19, "old0", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie24 = null;
        naturalness.mut_000.Trie trie25 = null;
        fuzzTest23.FuzzTest_add(trie24, trie25, "", false);
        naturalness.mut_000.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie29, trie30, "", false);
        fuzzTest11.FuzzTest_add(trie19, trie30, "seed0", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie38 = null;
        naturalness.mut_000.Trie trie39 = null;
        fuzzTest37.FuzzTest_add(trie38, trie39, "", false);
        naturalness.mut_000.Trie trie43 = null;
        naturalness.mut_000.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(trie43, trie44, "old0", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie49 = null;
        naturalness.mut_000.Trie trie50 = null;
        fuzzTest48.FuzzTest_add(trie49, trie50, "", false);
        naturalness.mut_000.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie54, trie55, "", false);
        fuzzTest11.FuzzTest_add(trie44, trie54, "", false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie64 = null;
        naturalness.mut_000.Trie trie65 = null;
        fuzzTest63.FuzzTest_add(trie64, trie65, "", false);
        naturalness.mut_000.Trie trie69 = null;
        naturalness.mut_000.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie69, trie70, "old0", true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie75 = null;
        naturalness.mut_000.Trie trie76 = null;
        fuzzTest74.FuzzTest_add(trie75, trie76, "", false);
        naturalness.mut_000.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_add(trie80, trie81, "", false);
        fuzzTest62.FuzzTest_add(trie70, trie81, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie54, trie70, "seed2", true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie2 = null;
        naturalness.mut_000.Trie trie3 = null;
        fuzzTest1.FuzzTest_add(trie2, trie3, "", false);
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie7, trie8, "", false);
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest1.FuzzTest_add(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie24 = null;
        naturalness.mut_000.Trie trie25 = null;
        fuzzTest23.FuzzTest_add(trie24, trie25, "", false);
        naturalness.mut_000.Trie trie29 = null;
        naturalness.mut_000.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie29, trie30, "old0", true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie35 = null;
        naturalness.mut_000.Trie trie36 = null;
        fuzzTest34.FuzzTest_add(trie35, trie36, "", false);
        naturalness.mut_000.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie40, trie41, "", false);
        fuzzTest17.FuzzTest_add(trie29, trie41, "hi!", true);
        naturalness.mut_000.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie41, trie48, "old1", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie53 = null;
        naturalness.mut_000.Trie trie54 = null;
        fuzzTest52.FuzzTest_add(trie53, trie54, "", false);
        naturalness.mut_000.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_add(trie58, trie59, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie41, trie58, "seed0", true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie2 = null;
        naturalness.mut_000.Trie trie3 = null;
        fuzzTest1.FuzzTest_add(trie2, trie3, "", false);
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie10 = null;
        naturalness.mut_000.Trie trie11 = null;
        fuzzTest9.FuzzTest_add(trie10, trie11, "", false);
        naturalness.mut_000.Trie trie15 = null;
        naturalness.mut_000.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_add(trie15, trie16, "old0", true);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie21 = null;
        naturalness.mut_000.Trie trie22 = null;
        fuzzTest20.FuzzTest_add(trie21, trie22, "", false);
        naturalness.mut_000.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_add(trie26, trie27, "", false);
        fuzzTest8.FuzzTest_add(trie16, trie27, "seed0", true);
        fuzzTest1.FuzzTest_add(trie7, trie16, "", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie38 = null;
        naturalness.mut_000.Trie trie39 = null;
        fuzzTest37.FuzzTest_add(trie38, trie39, "", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie44 = null;
        naturalness.mut_000.Trie trie45 = null;
        fuzzTest43.FuzzTest_add(trie44, trie45, "", false);
        naturalness.mut_000.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie49, trie50, "", false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie55 = null;
        naturalness.mut_000.Trie trie56 = null;
        fuzzTest54.FuzzTest_add(trie55, trie56, "", false);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie61 = null;
        naturalness.mut_000.Trie trie62 = null;
        fuzzTest60.FuzzTest_add(trie61, trie62, "", false);
        naturalness.mut_000.Trie trie66 = null;
        naturalness.mut_000.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_add(trie66, trie67, "old0", true);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie72 = null;
        naturalness.mut_000.Trie trie73 = null;
        fuzzTest71.FuzzTest_add(trie72, trie73, "", false);
        naturalness.mut_000.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_add(trie77, trie78, "", false);
        fuzzTest54.FuzzTest_add(trie66, trie78, "hi!", true);
        fuzzTest37.FuzzTest_add(trie49, trie66, "seed0", false);
        naturalness.mut_000.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(trie88, trie89, "hi!", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie7, trie89, "old0", true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie19 = null;
        naturalness.mut_000.Trie trie20 = null;
        fuzzTest18.FuzzTest_add(trie19, trie20, "", false);
        naturalness.mut_000.Trie trie24 = null;
        naturalness.mut_000.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie24, trie25, "old0", true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie30 = null;
        naturalness.mut_000.Trie trie31 = null;
        fuzzTest29.FuzzTest_add(trie30, trie31, "", false);
        naturalness.mut_000.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie35, trie36, "", false);
        fuzzTest17.FuzzTest_add(trie25, trie36, "seed0", true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie44 = null;
        naturalness.mut_000.Trie trie45 = null;
        fuzzTest43.FuzzTest_add(trie44, trie45, "", false);
        naturalness.mut_000.Trie trie49 = null;
        naturalness.mut_000.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie49, trie50, "old0", true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie55 = null;
        naturalness.mut_000.Trie trie56 = null;
        fuzzTest54.FuzzTest_add(trie55, trie56, "", false);
        naturalness.mut_000.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(trie60, trie61, "", false);
        fuzzTest17.FuzzTest_add(trie50, trie60, "", false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie69 = null;
        naturalness.mut_000.Trie trie70 = null;
        fuzzTest68.FuzzTest_add(trie69, trie70, "", false);
        naturalness.mut_000.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie74, trie75, "", false);
        fuzzTest11.FuzzTest_add(trie60, trie75, "seed1", true);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie83 = null;
        naturalness.mut_000.Trie trie84 = null;
        fuzzTest82.FuzzTest_add(trie83, trie84, "", false);
        naturalness.mut_000.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_add(trie88, trie89, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie60, trie88, "seed2", true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = null;
        naturalness.mut_000.Trie trie7 = null;
        fuzzTest0.FuzzTest_add(trie6, trie7, "", true);
        naturalness.mut_000.Trie trie11 = null;
        naturalness.mut_000.Trie trie12 = null;
        fuzzTest0.FuzzTest_add(trie11, trie12, "old0", true);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie17 = null;
        naturalness.mut_000.Trie trie18 = null;
        fuzzTest16.FuzzTest_add(trie17, trie18, "", false);
        naturalness.mut_000.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_add(trie22, trie23, "", false);
        naturalness.mut_000.Trie trie27 = null;
        naturalness.mut_000.Trie trie28 = null;
        fuzzTest16.FuzzTest_add(trie27, trie28, "seed1", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie33 = null;
        naturalness.mut_000.Trie trie34 = null;
        fuzzTest32.FuzzTest_add(trie33, trie34, "", false);
        naturalness.mut_000.Trie trie38 = null;
        naturalness.mut_000.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie38, trie39, "old0", true);
        naturalness.mut_000.Trie trie43 = null;
        fuzzTest16.FuzzTest_add(trie39, trie43, "old1", false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie49 = null;
        naturalness.mut_000.Trie trie50 = null;
        fuzzTest48.FuzzTest_add(trie49, trie50, "", false);
        naturalness.mut_000.Trie trie54 = null;
        naturalness.mut_000.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie54, trie55, "old0", true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie60 = null;
        naturalness.mut_000.Trie trie61 = null;
        fuzzTest59.FuzzTest_add(trie60, trie61, "", false);
        naturalness.mut_000.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_add(trie65, trie66, "", false);
        fuzzTest47.FuzzTest_add(trie55, trie66, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie39, trie66, "old1", true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = null;
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        naturalness.mut_000.Trie trie17 = null;
        naturalness.mut_000.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie17, trie18, "old0", true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie23 = null;
        naturalness.mut_000.Trie trie24 = null;
        fuzzTest22.FuzzTest_add(trie23, trie24, "", false);
        naturalness.mut_000.Trie trie28 = null;
        naturalness.mut_000.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_add(trie28, trie29, "old0", true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie35 = null;
        naturalness.mut_000.Trie trie36 = null;
        fuzzTest34.FuzzTest_add(trie35, trie36, "", false);
        naturalness.mut_000.Trie trie40 = null;
        naturalness.mut_000.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie40, trie41, "old0", true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie46 = null;
        naturalness.mut_000.Trie trie47 = null;
        fuzzTest45.FuzzTest_add(trie46, trie47, "", false);
        naturalness.mut_000.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(trie51, trie52, "", false);
        fuzzTest33.FuzzTest_add(trie41, trie52, "seed0", true);
        fuzzTest11.FuzzTest_add(trie29, trie41, "seed0", true);
        naturalness.mut_000.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie41, trie62, "seed2", false);
        naturalness.mut_000.Trie trie66 = null;
        naturalness.mut_000.Trie trie67 = null;
        fuzzTest0.FuzzTest_add(trie66, trie67, "seed2", false);
        naturalness.mut_000.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie71, trie72, "old0", true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie7 = null;
        naturalness.mut_000.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        naturalness.mut_000.Trie trie23 = null;
        naturalness.mut_000.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie23, trie24, "old0", true);
        naturalness.mut_000.Trie trie28 = null;
        fuzzTest6.FuzzTest_add(trie24, trie28, "old2", true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie33 = null;
        naturalness.mut_000.Trie trie34 = null;
        fuzzTest32.FuzzTest_add(trie33, trie34, "", false);
        naturalness.mut_000.Trie trie38 = null;
        naturalness.mut_000.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie38, trie39, "old0", true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie44 = null;
        naturalness.mut_000.Trie trie45 = null;
        fuzzTest43.FuzzTest_add(trie44, trie45, "", false);
        naturalness.mut_000.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie49, trie50, "", false);
        fuzzTest6.FuzzTest_add(trie38, trie50, "seed2", true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie58 = null;
        naturalness.mut_000.Trie trie59 = null;
        fuzzTest57.FuzzTest_add(trie58, trie59, "", false);
        naturalness.mut_000.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(trie63, trie64, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie50, trie63, "old1", true);
    }
}

