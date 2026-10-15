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
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.mut_000.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "", false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie29 = null;
        naturalness.mut_000.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie35 = null;
        naturalness.mut_000.Trie trie36 = null;
        fuzzTest34.FuzzTest_remove(trie35, trie36, "", false);
        naturalness.mut_000.Trie trie40 = null;
        naturalness.mut_000.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_remove(trie40, trie41, "old0", true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie46 = null;
        naturalness.mut_000.Trie trie47 = null;
        fuzzTest45.FuzzTest_remove(trie46, trie47, "", false);
        naturalness.mut_000.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_remove(trie51, trie52, "", false);
        fuzzTest28.FuzzTest_remove(trie40, trie52, "hi!", true);
        fuzzTest11.FuzzTest_remove(trie23, trie40, "seed0", false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie64 = null;
        naturalness.mut_000.Trie trie65 = null;
        fuzzTest63.FuzzTest_remove(trie64, trie65, "", false);
        naturalness.mut_000.Trie trie69 = null;
        naturalness.mut_000.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_remove(trie69, trie70, "old0", true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie75 = null;
        naturalness.mut_000.Trie trie76 = null;
        fuzzTest74.FuzzTest_remove(trie75, trie76, "", false);
        naturalness.mut_000.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_remove(trie80, trie81, "", false);
        fuzzTest62.FuzzTest_remove(trie70, trie81, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie23, trie70, "old2", false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = null;
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.mut_000.Trie trie23 = null;
        naturalness.mut_000.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "old0", true);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie29 = null;
        naturalness.mut_000.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.mut_000.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "", false);
        fuzzTest11.FuzzTest_remove(trie23, trie35, "hi!", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie43 = null;
        naturalness.mut_000.Trie trie44 = null;
        fuzzTest42.FuzzTest_remove(trie43, trie44, "", false);
        naturalness.mut_000.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_remove(trie48, trie49, "", false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie54 = null;
        naturalness.mut_000.Trie trie55 = null;
        fuzzTest53.FuzzTest_remove(trie54, trie55, "", false);
        naturalness.mut_000.Trie trie59 = null;
        naturalness.mut_000.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_remove(trie59, trie60, "old0", true);
        fuzzTest11.FuzzTest_remove(trie48, trie60, "seed1", true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie69 = null;
        naturalness.mut_000.Trie trie70 = null;
        fuzzTest68.FuzzTest_remove(trie69, trie70, "", false);
        naturalness.mut_000.Trie trie74 = null;
        naturalness.mut_000.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_remove(trie74, trie75, "old0", true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie80 = null;
        naturalness.mut_000.Trie trie81 = null;
        fuzzTest79.FuzzTest_remove(trie80, trie81, "", false);
        naturalness.mut_000.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_remove(trie85, trie86, "", false);
        fuzzTest67.FuzzTest_remove(trie75, trie86, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie48, trie75, "seed0", false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie13 = null;
        naturalness.mut_000.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "old0", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie24 = null;
        naturalness.mut_000.Trie trie25 = null;
        fuzzTest23.FuzzTest_remove(trie24, trie25, "", false);
        naturalness.mut_000.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie29, trie30, "", false);
        fuzzTest11.FuzzTest_remove(trie19, trie30, "seed0", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie38 = null;
        naturalness.mut_000.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie44 = null;
        naturalness.mut_000.Trie trie45 = null;
        fuzzTest43.FuzzTest_remove(trie44, trie45, "", false);
        naturalness.mut_000.Trie trie49 = null;
        naturalness.mut_000.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(trie49, trie50, "old0", true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie55 = null;
        naturalness.mut_000.Trie trie56 = null;
        fuzzTest54.FuzzTest_remove(trie55, trie56, "", false);
        naturalness.mut_000.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_remove(trie60, trie61, "", false);
        fuzzTest37.FuzzTest_remove(trie49, trie61, "hi!", true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie69 = null;
        naturalness.mut_000.Trie trie70 = null;
        fuzzTest68.FuzzTest_remove(trie69, trie70, "", false);
        naturalness.mut_000.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_remove(trie74, trie75, "", false);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie80 = null;
        naturalness.mut_000.Trie trie81 = null;
        fuzzTest79.FuzzTest_remove(trie80, trie81, "", false);
        naturalness.mut_000.Trie trie85 = null;
        naturalness.mut_000.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_remove(trie85, trie86, "old0", true);
        fuzzTest37.FuzzTest_remove(trie74, trie86, "seed1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie19, trie74, "old2", false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie7 = null;
        naturalness.mut_000.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.mut_000.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie24 = null;
        naturalness.mut_000.Trie trie25 = null;
        fuzzTest23.FuzzTest_remove(trie24, trie25, "", false);
        naturalness.mut_000.Trie trie29 = null;
        naturalness.mut_000.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie29, trie30, "old0", true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie35 = null;
        naturalness.mut_000.Trie trie36 = null;
        fuzzTest34.FuzzTest_remove(trie35, trie36, "", false);
        naturalness.mut_000.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_remove(trie40, trie41, "", false);
        fuzzTest17.FuzzTest_remove(trie29, trie41, "hi!", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie49 = null;
        naturalness.mut_000.Trie trie50 = null;
        fuzzTest48.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.mut_000.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie54, trie55, "", false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie60 = null;
        naturalness.mut_000.Trie trie61 = null;
        fuzzTest59.FuzzTest_remove(trie60, trie61, "", false);
        naturalness.mut_000.Trie trie65 = null;
        naturalness.mut_000.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_remove(trie65, trie66, "old0", true);
        fuzzTest17.FuzzTest_remove(trie54, trie66, "seed1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie13, trie54, "old1", false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = null;
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.mut_000.Trie trie17 = null;
        naturalness.mut_000.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        naturalness.mut_000.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie18, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie27 = null;
        naturalness.mut_000.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        naturalness.mut_000.Trie trie32 = null;
        naturalness.mut_000.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(trie32, trie33, "old0", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie38 = null;
        naturalness.mut_000.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.mut_000.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie43, trie44, "", false);
        fuzzTest0.FuzzTest_remove(trie32, trie44, "seed2", true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie52 = null;
        naturalness.mut_000.Trie trie53 = null;
        fuzzTest51.FuzzTest_remove(trie52, trie53, "", false);
        naturalness.mut_000.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_remove(trie57, trie58, "", false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie63 = null;
        naturalness.mut_000.Trie trie64 = null;
        fuzzTest62.FuzzTest_remove(trie63, trie64, "", false);
        naturalness.mut_000.Trie trie68 = null;
        naturalness.mut_000.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_remove(trie68, trie69, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie57, trie69, "seed2", false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie2 = null;
        naturalness.mut_000.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie13 = null;
        naturalness.mut_000.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.mut_000.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie8, trie18, "old2", false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie2 = null;
        naturalness.mut_000.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie8 = null;
        naturalness.mut_000.Trie trie9 = null;
        fuzzTest7.FuzzTest_remove(trie8, trie9, "", false);
        naturalness.mut_000.Trie trie13 = null;
        naturalness.mut_000.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_remove(trie13, trie14, "old0", true);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie19 = null;
        naturalness.mut_000.Trie trie20 = null;
        fuzzTest18.FuzzTest_remove(trie19, trie20, "", false);
        naturalness.mut_000.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_remove(trie24, trie25, "", false);
        fuzzTest1.FuzzTest_remove(trie13, trie25, "hi!", true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie33 = null;
        naturalness.mut_000.Trie trie34 = null;
        fuzzTest32.FuzzTest_remove(trie33, trie34, "", false);
        naturalness.mut_000.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_remove(trie38, trie39, "", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie44 = null;
        naturalness.mut_000.Trie trie45 = null;
        fuzzTest43.FuzzTest_remove(trie44, trie45, "", false);
        naturalness.mut_000.Trie trie49 = null;
        naturalness.mut_000.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(trie49, trie50, "old0", true);
        fuzzTest1.FuzzTest_remove(trie38, trie50, "seed1", true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie58 = null;
        naturalness.mut_000.Trie trie59 = null;
        fuzzTest57.FuzzTest_remove(trie58, trie59, "", false);
        naturalness.mut_000.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_remove(trie63, trie64, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie38, trie63, "old0", false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie7 = null;
        naturalness.mut_000.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.mut_000.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.mut_000.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "", false);
        naturalness.mut_000.Trie trie28 = null;
        fuzzTest6.FuzzTest_remove(trie23, trie28, "seed1", true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie33 = null;
        naturalness.mut_000.Trie trie34 = null;
        fuzzTest32.FuzzTest_remove(trie33, trie34, "", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie39 = null;
        naturalness.mut_000.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.mut_000.Trie trie44 = null;
        naturalness.mut_000.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie44, trie45, "old0", true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie50 = null;
        naturalness.mut_000.Trie trie51 = null;
        fuzzTest49.FuzzTest_remove(trie50, trie51, "", false);
        naturalness.mut_000.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_remove(trie55, trie56, "", false);
        fuzzTest32.FuzzTest_remove(trie44, trie56, "hi!", true);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie64 = null;
        naturalness.mut_000.Trie trie65 = null;
        fuzzTest63.FuzzTest_remove(trie64, trie65, "", false);
        naturalness.mut_000.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_remove(trie69, trie70, "", false);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie75 = null;
        naturalness.mut_000.Trie trie76 = null;
        fuzzTest74.FuzzTest_remove(trie75, trie76, "", false);
        naturalness.mut_000.Trie trie80 = null;
        naturalness.mut_000.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_remove(trie80, trie81, "old0", true);
        fuzzTest32.FuzzTest_remove(trie69, trie81, "seed1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie23, trie69, "old2", false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie3 = null;
        naturalness.mut_000.Trie trie4 = null;
        fuzzTest2.FuzzTest_remove(trie3, trie4, "", false);
        naturalness.mut_000.Trie trie8 = null;
        naturalness.mut_000.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_remove(trie8, trie9, "old0", true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie14 = null;
        naturalness.mut_000.Trie trie15 = null;
        fuzzTest13.FuzzTest_remove(trie14, trie15, "", false);
        naturalness.mut_000.Trie trie19 = null;
        naturalness.mut_000.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_remove(trie19, trie20, "old0", true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie26 = null;
        naturalness.mut_000.Trie trie27 = null;
        fuzzTest25.FuzzTest_remove(trie26, trie27, "", false);
        naturalness.mut_000.Trie trie31 = null;
        naturalness.mut_000.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_remove(trie31, trie32, "old0", true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie37 = null;
        naturalness.mut_000.Trie trie38 = null;
        fuzzTest36.FuzzTest_remove(trie37, trie38, "", false);
        naturalness.mut_000.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_remove(trie42, trie43, "", false);
        fuzzTest24.FuzzTest_remove(trie32, trie43, "seed0", true);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie51 = null;
        naturalness.mut_000.Trie trie52 = null;
        fuzzTest50.FuzzTest_remove(trie51, trie52, "", false);
        naturalness.mut_000.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_remove(trie56, trie57, "", false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie62 = null;
        naturalness.mut_000.Trie trie63 = null;
        fuzzTest61.FuzzTest_remove(trie62, trie63, "", false);
        naturalness.mut_000.Trie trie67 = null;
        naturalness.mut_000.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_remove(trie67, trie68, "old0", true);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie73 = null;
        naturalness.mut_000.Trie trie74 = null;
        fuzzTest72.FuzzTest_remove(trie73, trie74, "", false);
        naturalness.mut_000.Trie trie78 = null;
        naturalness.mut_000.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_remove(trie78, trie79, "old0", true);
        naturalness.mut_000.Trie trie83 = null;
        fuzzTest61.FuzzTest_remove(trie79, trie83, "old2", true);
        fuzzTest24.FuzzTest_remove(trie57, trie79, "hi!", false);
        fuzzTest2.FuzzTest_remove(trie20, trie79, "old2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie1, trie20, "seed1", false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.mut_000.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "", false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie29 = null;
        naturalness.mut_000.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.mut_000.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "", false);
        fuzzTest11.FuzzTest_remove(trie23, trie35, "", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie43 = null;
        naturalness.mut_000.Trie trie44 = null;
        fuzzTest42.FuzzTest_remove(trie43, trie44, "", false);
        naturalness.mut_000.Trie trie48 = null;
        naturalness.mut_000.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_remove(trie48, trie49, "old0", true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie54 = null;
        naturalness.mut_000.Trie trie55 = null;
        fuzzTest53.FuzzTest_remove(trie54, trie55, "", false);
        naturalness.mut_000.Trie trie59 = null;
        naturalness.mut_000.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_remove(trie59, trie60, "old0", true);
        naturalness.mut_000.Trie trie64 = null;
        fuzzTest42.FuzzTest_remove(trie60, trie64, "old2", true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie69 = null;
        naturalness.mut_000.Trie trie70 = null;
        fuzzTest68.FuzzTest_remove(trie69, trie70, "", false);
        naturalness.mut_000.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_remove(trie74, trie75, "", false);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie80 = null;
        naturalness.mut_000.Trie trie81 = null;
        fuzzTest79.FuzzTest_remove(trie80, trie81, "", false);
        naturalness.mut_000.Trie trie85 = null;
        naturalness.mut_000.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_remove(trie85, trie86, "old0", true);
        fuzzTest42.FuzzTest_remove(trie75, trie86, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie23, trie86, "seed0", false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie2 = null;
        naturalness.mut_000.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.mut_000.Trie trie7 = null;
        naturalness.mut_000.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "old0", true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie13 = null;
        naturalness.mut_000.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.mut_000.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "", false);
        fuzzTest0.FuzzTest_remove(trie8, trie19, "seed0", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie27 = null;
        naturalness.mut_000.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        naturalness.mut_000.Trie trie32 = null;
        naturalness.mut_000.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(trie32, trie33, "old0", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie38 = null;
        naturalness.mut_000.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.mut_000.Trie trie43 = null;
        naturalness.mut_000.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie43, trie44, "old0", true);
        naturalness.mut_000.Trie trie48 = null;
        fuzzTest26.FuzzTest_remove(trie44, trie48, "old2", true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie53 = null;
        naturalness.mut_000.Trie trie54 = null;
        fuzzTest52.FuzzTest_remove(trie53, trie54, "", false);
        naturalness.mut_000.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(trie58, trie59, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie44, trie58, "seed1", false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie7 = null;
        naturalness.mut_000.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.mut_000.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie24 = null;
        naturalness.mut_000.Trie trie25 = null;
        fuzzTest23.FuzzTest_remove(trie24, trie25, "", false);
        naturalness.mut_000.Trie trie29 = null;
        naturalness.mut_000.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie29, trie30, "old0", true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie35 = null;
        naturalness.mut_000.Trie trie36 = null;
        fuzzTest34.FuzzTest_remove(trie35, trie36, "", false);
        naturalness.mut_000.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_remove(trie40, trie41, "", false);
        fuzzTest17.FuzzTest_remove(trie29, trie41, "hi!", true);
        fuzzTest0.FuzzTest_remove(trie12, trie29, "seed0", false);
        naturalness.mut_000.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie53 = null;
        naturalness.mut_000.Trie trie54 = null;
        fuzzTest52.FuzzTest_remove(trie53, trie54, "", false);
        naturalness.mut_000.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(trie58, trie59, "", false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie64 = null;
        naturalness.mut_000.Trie trie65 = null;
        fuzzTest63.FuzzTest_remove(trie64, trie65, "", false);
        naturalness.mut_000.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_remove(trie69, trie70, "", false);
        naturalness.mut_000.Trie trie74 = null;
        fuzzTest52.FuzzTest_remove(trie69, trie74, "seed1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie51, trie69, "old2", false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie7 = null;
        naturalness.mut_000.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.mut_000.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "", false);
        fuzzTest0.FuzzTest_remove(trie12, trie24, "hi!", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie33 = null;
        naturalness.mut_000.Trie trie34 = null;
        fuzzTest32.FuzzTest_remove(trie33, trie34, "", false);
        naturalness.mut_000.Trie trie38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie40 = null;
        naturalness.mut_000.Trie trie41 = null;
        fuzzTest39.FuzzTest_remove(trie40, trie41, "", false);
        naturalness.mut_000.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_remove(trie45, trie46, "", false);
        fuzzTest32.FuzzTest_remove(trie38, trie46, "seed0", false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie54 = null;
        naturalness.mut_000.Trie trie55 = null;
        fuzzTest53.FuzzTest_remove(trie54, trie55, "", false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie60 = null;
        naturalness.mut_000.Trie trie61 = null;
        fuzzTest59.FuzzTest_remove(trie60, trie61, "", false);
        naturalness.mut_000.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_remove(trie65, trie66, "", false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie71 = null;
        naturalness.mut_000.Trie trie72 = null;
        fuzzTest70.FuzzTest_remove(trie71, trie72, "", false);
        naturalness.mut_000.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_remove(trie76, trie77, "", false);
        fuzzTest53.FuzzTest_remove(trie65, trie77, "", true);
        fuzzTest31.FuzzTest_remove(trie38, trie77, "seed0", false);
        naturalness.mut_000.Trie trie87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie77, trie87, "seed2", false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie2 = null;
        naturalness.mut_000.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie13 = null;
        naturalness.mut_000.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.mut_000.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.mut_000.Trie trie23 = null;
        fuzzTest1.FuzzTest_remove(trie18, trie23, "seed1", true);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie28 = null;
        naturalness.mut_000.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.mut_000.Trie trie33 = null;
        naturalness.mut_000.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie33, trie34, "old0", true);
        naturalness.mut_000.Trie trie38 = null;
        fuzzTest1.FuzzTest_remove(trie34, trie38, "hi!", true);
        naturalness.mut_000.Trie trie42 = null;
        fuzzTest0.FuzzTest_remove(trie38, trie42, "hi!", false);
        naturalness.mut_000.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie49 = null;
        naturalness.mut_000.Trie trie50 = null;
        fuzzTest48.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.mut_000.Trie trie54 = null;
        naturalness.mut_000.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie54, trie55, "old0", true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie60 = null;
        naturalness.mut_000.Trie trie61 = null;
        fuzzTest59.FuzzTest_remove(trie60, trie61, "", false);
        naturalness.mut_000.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_remove(trie65, trie66, "", false);
        fuzzTest47.FuzzTest_remove(trie55, trie66, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie46, trie55, "old0", false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.mut_000.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie23 = null;
        naturalness.mut_000.Trie trie24 = null;
        fuzzTest22.FuzzTest_remove(trie23, trie24, "", false);
        naturalness.mut_000.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie28, trie29, "", false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie34 = null;
        naturalness.mut_000.Trie trie35 = null;
        fuzzTest33.FuzzTest_remove(trie34, trie35, "", false);
        naturalness.mut_000.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.mut_000.Trie trie44 = null;
        fuzzTest22.FuzzTest_remove(trie39, trie44, "seed1", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie49 = null;
        naturalness.mut_000.Trie trie50 = null;
        fuzzTest48.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.mut_000.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie54, trie55, "", false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie60 = null;
        naturalness.mut_000.Trie trie61 = null;
        fuzzTest59.FuzzTest_remove(trie60, trie61, "", false);
        naturalness.mut_000.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_remove(trie65, trie66, "", false);
        naturalness.mut_000.Trie trie70 = null;
        fuzzTest48.FuzzTest_remove(trie65, trie70, "seed1", true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie75 = null;
        naturalness.mut_000.Trie trie76 = null;
        fuzzTest74.FuzzTest_remove(trie75, trie76, "", false);
        naturalness.mut_000.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_remove(trie80, trie81, "", false);
        fuzzTest22.FuzzTest_remove(trie65, trie80, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie17, trie80, "old2", false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie7 = null;
        naturalness.mut_000.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.mut_000.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "", false);
        fuzzTest0.FuzzTest_remove(trie12, trie24, "hi!", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie32 = null;
        naturalness.mut_000.Trie trie33 = null;
        fuzzTest31.FuzzTest_remove(trie32, trie33, "", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie38 = null;
        naturalness.mut_000.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.mut_000.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie43, trie44, "", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie49 = null;
        naturalness.mut_000.Trie trie50 = null;
        fuzzTest48.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.mut_000.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie54, trie55, "", false);
        fuzzTest31.FuzzTest_remove(trie43, trie55, "", true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie63 = null;
        naturalness.mut_000.Trie trie64 = null;
        fuzzTest62.FuzzTest_remove(trie63, trie64, "", false);
        naturalness.mut_000.Trie trie68 = null;
        naturalness.mut_000.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_remove(trie68, trie69, "old0", true);
        fuzzTest0.FuzzTest_remove(trie43, trie69, "hi!", true);
        naturalness.mut_000.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie79 = null;
        naturalness.mut_000.Trie trie80 = null;
        fuzzTest78.FuzzTest_remove(trie79, trie80, "", false);
        naturalness.mut_000.Trie trie84 = null;
        naturalness.mut_000.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_remove(trie84, trie85, "old0", true);
        naturalness.mut_000.Trie trie89 = null;
        fuzzTest77.FuzzTest_remove(trie85, trie89, "hi!", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie76, trie85, "seed0", false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = null;
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie14 = null;
        naturalness.mut_000.Trie trie15 = null;
        fuzzTest13.FuzzTest_remove(trie14, trie15, "", false);
        naturalness.mut_000.Trie trie19 = null;
        naturalness.mut_000.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_remove(trie19, trie20, "old0", true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie25 = null;
        naturalness.mut_000.Trie trie26 = null;
        fuzzTest24.FuzzTest_remove(trie25, trie26, "", false);
        naturalness.mut_000.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_remove(trie30, trie31, "", false);
        fuzzTest12.FuzzTest_remove(trie20, trie31, "seed0", true);
        naturalness.mut_000.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie20, trie38, "seed0", true);
        naturalness.mut_000.Trie trie42 = null;
        fuzzTest0.FuzzTest_remove(trie38, trie42, "seed0", true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie47 = null;
        naturalness.mut_000.Trie trie48 = null;
        fuzzTest46.FuzzTest_remove(trie47, trie48, "", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie53 = null;
        naturalness.mut_000.Trie trie54 = null;
        fuzzTest52.FuzzTest_remove(trie53, trie54, "", false);
        naturalness.mut_000.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(trie58, trie59, "", false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie64 = null;
        naturalness.mut_000.Trie trie65 = null;
        fuzzTest63.FuzzTest_remove(trie64, trie65, "", false);
        naturalness.mut_000.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_remove(trie69, trie70, "", false);
        naturalness.mut_000.Trie trie74 = null;
        fuzzTest52.FuzzTest_remove(trie69, trie74, "seed1", true);
        naturalness.mut_000.Trie trie78 = null;
        fuzzTest46.FuzzTest_remove(trie69, trie78, "hi!", false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie83 = null;
        naturalness.mut_000.Trie trie84 = null;
        fuzzTest82.FuzzTest_remove(trie83, trie84, "", false);
        naturalness.mut_000.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_remove(trie88, trie89, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie69, trie88, "seed2", false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie2 = null;
        naturalness.mut_000.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.mut_000.Trie trie7 = null;
        naturalness.mut_000.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "old0", true);
        naturalness.mut_000.Trie trie12 = null;
        fuzzTest0.FuzzTest_remove(trie8, trie12, "hi!", true);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie17 = null;
        naturalness.mut_000.Trie trie18 = null;
        fuzzTest16.FuzzTest_remove(trie17, trie18, "", false);
        naturalness.mut_000.Trie trie22 = null;
        naturalness.mut_000.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_remove(trie22, trie23, "old0", true);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie28 = null;
        naturalness.mut_000.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.mut_000.Trie trie33 = null;
        naturalness.mut_000.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie33, trie34, "old0", true);
        naturalness.mut_000.Trie trie38 = null;
        fuzzTest16.FuzzTest_remove(trie34, trie38, "old2", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie43 = null;
        naturalness.mut_000.Trie trie44 = null;
        fuzzTest42.FuzzTest_remove(trie43, trie44, "", false);
        naturalness.mut_000.Trie trie48 = null;
        naturalness.mut_000.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_remove(trie48, trie49, "old0", true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie54 = null;
        naturalness.mut_000.Trie trie55 = null;
        fuzzTest53.FuzzTest_remove(trie54, trie55, "", false);
        naturalness.mut_000.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_remove(trie59, trie60, "", false);
        fuzzTest16.FuzzTest_remove(trie48, trie60, "seed2", true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie68 = null;
        naturalness.mut_000.Trie trie69 = null;
        fuzzTest67.FuzzTest_remove(trie68, trie69, "", false);
        naturalness.mut_000.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_remove(trie73, trie74, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie60, trie73, "old1", false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie7 = null;
        naturalness.mut_000.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie20 = null;
        naturalness.mut_000.Trie trie21 = null;
        fuzzTest19.FuzzTest_remove(trie20, trie21, "", false);
        naturalness.mut_000.Trie trie25 = null;
        naturalness.mut_000.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_remove(trie25, trie26, "old0", true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie31 = null;
        naturalness.mut_000.Trie trie32 = null;
        fuzzTest30.FuzzTest_remove(trie31, trie32, "", false);
        naturalness.mut_000.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_remove(trie36, trie37, "", false);
        fuzzTest18.FuzzTest_remove(trie26, trie37, "seed0", true);
        naturalness.mut_000.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie26, trie44, "seed0", true);
        naturalness.mut_000.Trie trie48 = null;
        fuzzTest6.FuzzTest_remove(trie44, trie48, "seed0", true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie54 = null;
        naturalness.mut_000.Trie trie55 = null;
        fuzzTest53.FuzzTest_remove(trie54, trie55, "", false);
        naturalness.mut_000.Trie trie59 = null;
        naturalness.mut_000.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_remove(trie59, trie60, "old0", true);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie65 = null;
        naturalness.mut_000.Trie trie66 = null;
        fuzzTest64.FuzzTest_remove(trie65, trie66, "", false);
        naturalness.mut_000.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_remove(trie70, trie71, "", false);
        fuzzTest52.FuzzTest_remove(trie60, trie71, "seed0", true);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie79 = null;
        naturalness.mut_000.Trie trie80 = null;
        fuzzTest78.FuzzTest_remove(trie79, trie80, "", false);
        naturalness.mut_000.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_remove(trie84, trie85, "", false);
        naturalness.mut_000.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(trie84, trie89, "hi!", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie44, trie84, "old2", false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie7 = null;
        naturalness.mut_000.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.mut_000.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "", false);
        fuzzTest0.FuzzTest_remove(trie12, trie24, "hi!", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie32 = null;
        naturalness.mut_000.Trie trie33 = null;
        fuzzTest31.FuzzTest_remove(trie32, trie33, "", false);
        naturalness.mut_000.Trie trie37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie39 = null;
        naturalness.mut_000.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.mut_000.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie44, trie45, "", false);
        fuzzTest31.FuzzTest_remove(trie37, trie45, "seed0", false);
        naturalness.mut_000.Trie trie52 = null;
        fuzzTest0.FuzzTest_remove(trie37, trie52, "old1", false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie58 = null;
        naturalness.mut_000.Trie trie59 = null;
        fuzzTest57.FuzzTest_remove(trie58, trie59, "", false);
        naturalness.mut_000.Trie trie63 = null;
        naturalness.mut_000.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_remove(trie63, trie64, "old0", true);
        naturalness.mut_000.Trie trie68 = null;
        fuzzTest56.FuzzTest_remove(trie64, trie68, "hi!", true);
        naturalness.mut_000.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie73 = null;
        fuzzTest56.FuzzTest_remove(trie72, trie73, "old0", false);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie78 = null;
        naturalness.mut_000.Trie trie79 = null;
        fuzzTest77.FuzzTest_remove(trie78, trie79, "", false);
        naturalness.mut_000.Trie trie83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_remove(trie83, trie84, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie72, trie83, "seed1", false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.mut_000.Trie trie23 = null;
        naturalness.mut_000.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "old0", true);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie29 = null;
        naturalness.mut_000.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.mut_000.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "", false);
        fuzzTest11.FuzzTest_remove(trie23, trie35, "hi!", true);
        naturalness.mut_000.Trie trie42 = null;
        fuzzTest0.FuzzTest_remove(trie35, trie42, "old0", false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie47 = null;
        naturalness.mut_000.Trie trie48 = null;
        fuzzTest46.FuzzTest_remove(trie47, trie48, "", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie53 = null;
        naturalness.mut_000.Trie trie54 = null;
        fuzzTest52.FuzzTest_remove(trie53, trie54, "", false);
        naturalness.mut_000.Trie trie58 = null;
        naturalness.mut_000.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(trie58, trie59, "old0", true);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie64 = null;
        naturalness.mut_000.Trie trie65 = null;
        fuzzTest63.FuzzTest_remove(trie64, trie65, "", false);
        naturalness.mut_000.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_remove(trie69, trie70, "", false);
        fuzzTest46.FuzzTest_remove(trie58, trie70, "hi!", true);
        naturalness.mut_000.Trie trie77 = null;
        fuzzTest0.FuzzTest_remove(trie58, trie77, "hi!", false);
        naturalness.mut_000.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie83 = null;
        naturalness.mut_000.Trie trie84 = null;
        fuzzTest82.FuzzTest_remove(trie83, trie84, "", false);
        naturalness.mut_000.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_remove(trie88, trie89, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie81, trie88, "old0", false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = null;
        naturalness.mut_000.Trie trie7 = null;
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie13 = null;
        naturalness.mut_000.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "old0", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie24 = null;
        naturalness.mut_000.Trie trie25 = null;
        fuzzTest23.FuzzTest_remove(trie24, trie25, "", false);
        naturalness.mut_000.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie29, trie30, "", false);
        fuzzTest11.FuzzTest_remove(trie19, trie30, "seed0", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie38 = null;
        naturalness.mut_000.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.mut_000.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie43, trie44, "", false);
        naturalness.mut_000.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie43, trie48, "hi!", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie53 = null;
        naturalness.mut_000.Trie trie54 = null;
        fuzzTest52.FuzzTest_remove(trie53, trie54, "", false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie59 = null;
        naturalness.mut_000.Trie trie60 = null;
        fuzzTest58.FuzzTest_remove(trie59, trie60, "", false);
        naturalness.mut_000.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_remove(trie64, trie65, "", false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie70 = null;
        naturalness.mut_000.Trie trie71 = null;
        fuzzTest69.FuzzTest_remove(trie70, trie71, "", false);
        naturalness.mut_000.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_remove(trie75, trie76, "", false);
        naturalness.mut_000.Trie trie80 = null;
        fuzzTest58.FuzzTest_remove(trie75, trie80, "seed1", true);
        naturalness.mut_000.Trie trie84 = null;
        fuzzTest52.FuzzTest_remove(trie75, trie84, "hi!", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie43, trie75, "old2", false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie3 = null;
        naturalness.mut_000.Trie trie4 = null;
        fuzzTest2.FuzzTest_remove(trie3, trie4, "", false);
        naturalness.mut_000.Trie trie8 = null;
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie10 = null;
        naturalness.mut_000.Trie trie11 = null;
        fuzzTest9.FuzzTest_remove(trie10, trie11, "", false);
        naturalness.mut_000.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_remove(trie15, trie16, "", false);
        fuzzTest2.FuzzTest_remove(trie8, trie16, "seed0", false);
        fuzzTest0.FuzzTest_remove(trie1, trie8, "seed0", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie27 = null;
        naturalness.mut_000.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        naturalness.mut_000.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(trie32, trie33, "", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie38 = null;
        naturalness.mut_000.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.mut_000.Trie trie43 = null;
        naturalness.mut_000.Trie trie44 = null;
        fuzzTest37.FuzzTest_remove(trie43, trie44, "", false);
        naturalness.mut_000.Trie trie48 = null;
        naturalness.mut_000.Trie trie49 = null;
        fuzzTest37.FuzzTest_remove(trie48, trie49, "seed1", false);
        naturalness.mut_000.Trie trie53 = null;
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie55 = null;
        naturalness.mut_000.Trie trie56 = null;
        fuzzTest54.FuzzTest_remove(trie55, trie56, "", false);
        naturalness.mut_000.Trie trie60 = null;
        naturalness.mut_000.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_remove(trie60, trie61, "old0", true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie66 = null;
        naturalness.mut_000.Trie trie67 = null;
        fuzzTest65.FuzzTest_remove(trie66, trie67, "", false);
        naturalness.mut_000.Trie trie71 = null;
        naturalness.mut_000.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_remove(trie71, trie72, "old0", true);
        naturalness.mut_000.Trie trie76 = null;
        fuzzTest54.FuzzTest_remove(trie72, trie76, "old2", true);
        fuzzTest37.FuzzTest_remove(trie53, trie72, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie32, trie72, "seed2", false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.mut_000.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "", false);
        naturalness.mut_000.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie17, trie22, "seed1", true);
        naturalness.mut_000.Trie trie26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie28 = null;
        naturalness.mut_000.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.mut_000.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie33, trie34, "", false);
        fuzzTest0.FuzzTest_remove(trie26, trie33, "seed1", true);
        naturalness.mut_000.Trie trie41 = null;
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie43 = null;
        naturalness.mut_000.Trie trie44 = null;
        fuzzTest42.FuzzTest_remove(trie43, trie44, "", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie49 = null;
        naturalness.mut_000.Trie trie50 = null;
        fuzzTest48.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.mut_000.Trie trie54 = null;
        naturalness.mut_000.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie54, trie55, "old0", true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie60 = null;
        naturalness.mut_000.Trie trie61 = null;
        fuzzTest59.FuzzTest_remove(trie60, trie61, "", false);
        naturalness.mut_000.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_remove(trie65, trie66, "", false);
        fuzzTest42.FuzzTest_remove(trie54, trie66, "hi!", true);
        fuzzTest0.FuzzTest_remove(trie41, trie66, "seed0", false);
        naturalness.mut_000.Trie trie76 = null;
        naturalness.mut_000.Trie trie77 = null;
        fuzzTest0.FuzzTest_remove(trie76, trie77, "old2", true);
        naturalness.mut_000.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie83 = null;
        naturalness.mut_000.Trie trie84 = null;
        fuzzTest82.FuzzTest_remove(trie83, trie84, "", false);
        naturalness.mut_000.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_remove(trie88, trie89, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie81, trie88, "seed2", false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.mut_000.Trie trie17 = null;
        naturalness.mut_000.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        naturalness.mut_000.Trie trie22 = null;
        naturalness.mut_000.Trie trie23 = null;
        fuzzTest11.FuzzTest_remove(trie22, trie23, "seed2", true);
        naturalness.mut_000.Trie trie27 = null;
        naturalness.mut_000.Trie trie28 = null;
        fuzzTest11.FuzzTest_remove(trie27, trie28, "old0", false);
        naturalness.mut_000.Trie trie32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie36 = null;
        naturalness.mut_000.Trie trie37 = null;
        fuzzTest35.FuzzTest_remove(trie36, trie37, "", false);
        naturalness.mut_000.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_remove(trie41, trie42, "", false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie47 = null;
        naturalness.mut_000.Trie trie48 = null;
        fuzzTest46.FuzzTest_remove(trie47, trie48, "", false);
        naturalness.mut_000.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_remove(trie52, trie53, "", false);
        naturalness.mut_000.Trie trie57 = null;
        fuzzTest35.FuzzTest_remove(trie52, trie57, "seed1", true);
        naturalness.mut_000.Trie trie61 = null;
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie63 = null;
        naturalness.mut_000.Trie trie64 = null;
        fuzzTest62.FuzzTest_remove(trie63, trie64, "", false);
        naturalness.mut_000.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_remove(trie68, trie69, "", false);
        fuzzTest35.FuzzTest_remove(trie61, trie68, "seed1", true);
        fuzzTest33.FuzzTest_remove(trie34, trie68, "old1", true);
        fuzzTest11.FuzzTest_remove(trie32, trie68, "seed2", true);
        naturalness.mut_000.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie68, trie82, "seed0", false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.mut_000.Trie trie17 = null;
        naturalness.mut_000.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        naturalness.mut_000.Trie trie22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie24 = null;
        naturalness.mut_000.Trie trie25 = null;
        fuzzTest23.FuzzTest_remove(trie24, trie25, "", false);
        naturalness.mut_000.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie29, trie30, "", false);
        fuzzTest11.FuzzTest_remove(trie22, trie30, "old1", false);
        naturalness.mut_000.Trie trie37 = null;
        fuzzTest0.FuzzTest_remove(trie22, trie37, "seed2", false);
        naturalness.mut_000.Trie trie41 = null;
        naturalness.mut_000.Trie trie42 = null;
        fuzzTest0.FuzzTest_remove(trie41, trie42, "seed1", true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie47 = null;
        naturalness.mut_000.Trie trie48 = null;
        fuzzTest46.FuzzTest_remove(trie47, trie48, "", false);
        naturalness.mut_000.Trie trie52 = null;
        naturalness.mut_000.Trie trie53 = null;
        fuzzTest46.FuzzTest_remove(trie52, trie53, "", false);
        naturalness.mut_000.Trie trie57 = null;
        naturalness.mut_000.Trie trie58 = null;
        fuzzTest46.FuzzTest_remove(trie57, trie58, "seed1", false);
        naturalness.mut_000.Trie trie62 = null;
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie64 = null;
        naturalness.mut_000.Trie trie65 = null;
        fuzzTest63.FuzzTest_remove(trie64, trie65, "", false);
        naturalness.mut_000.Trie trie69 = null;
        naturalness.mut_000.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_remove(trie69, trie70, "old0", true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie75 = null;
        naturalness.mut_000.Trie trie76 = null;
        fuzzTest74.FuzzTest_remove(trie75, trie76, "", false);
        naturalness.mut_000.Trie trie80 = null;
        naturalness.mut_000.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_remove(trie80, trie81, "old0", true);
        naturalness.mut_000.Trie trie85 = null;
        fuzzTest63.FuzzTest_remove(trie81, trie85, "old2", true);
        fuzzTest46.FuzzTest_remove(trie62, trie81, "", true);
        naturalness.mut_000.Trie trie92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie81, trie92, "seed0", false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie2 = null;
        naturalness.mut_000.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie14 = null;
        naturalness.mut_000.Trie trie15 = null;
        fuzzTest13.FuzzTest_remove(trie14, trie15, "", false);
        naturalness.mut_000.Trie trie19 = null;
        naturalness.mut_000.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_remove(trie19, trie20, "old0", true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie26 = null;
        naturalness.mut_000.Trie trie27 = null;
        fuzzTest25.FuzzTest_remove(trie26, trie27, "", false);
        naturalness.mut_000.Trie trie31 = null;
        naturalness.mut_000.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_remove(trie31, trie32, "old0", true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie37 = null;
        naturalness.mut_000.Trie trie38 = null;
        fuzzTest36.FuzzTest_remove(trie37, trie38, "", false);
        naturalness.mut_000.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_remove(trie42, trie43, "", false);
        fuzzTest24.FuzzTest_remove(trie32, trie43, "seed0", true);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie53 = null;
        naturalness.mut_000.Trie trie54 = null;
        fuzzTest52.FuzzTest_remove(trie53, trie54, "", false);
        naturalness.mut_000.Trie trie58 = null;
        naturalness.mut_000.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(trie58, trie59, "old0", true);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie64 = null;
        naturalness.mut_000.Trie trie65 = null;
        fuzzTest63.FuzzTest_remove(trie64, trie65, "", false);
        naturalness.mut_000.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_remove(trie69, trie70, "", false);
        fuzzTest51.FuzzTest_remove(trie59, trie70, "seed0", true);
        naturalness.mut_000.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_remove(trie59, trie77, "seed0", true);
        fuzzTest13.FuzzTest_remove(trie43, trie59, "", false);
        naturalness.mut_000.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie43, trie84, "hi!", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie7, trie43, "seed1", false);
    }
}

