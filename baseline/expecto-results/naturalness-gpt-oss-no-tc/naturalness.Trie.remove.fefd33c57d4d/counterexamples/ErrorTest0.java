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
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie6, trie7, "", false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie6, trie7, "hi!", false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie1, trie2, "old0", false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_remove(trie3, trie4, "seed1", false);
        fuzzTest0.FuzzTest_remove(trie1, trie3, "old1", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_remove(trie14, trie15, "seed1", false);
        fuzzTest11.FuzzTest_remove(trie12, trie14, "old1", true);
        naturalness.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie14, trie22, "hi!", false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "seed2", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_remove(trie14, trie15, "seed1", false);
        fuzzTest11.FuzzTest_remove(trie12, trie14, "old1", true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = null;
        naturalness.Trie trie26 = null;
        fuzzTest24.FuzzTest_remove(trie25, trie26, "", false);
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_remove(trie30, trie31, "seed2", true);
        fuzzTest22.FuzzTest_remove(trie23, trie30, "seed1", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.Trie trie41 = null;
        naturalness.Trie trie42 = null;
        fuzzTest40.FuzzTest_remove(trie41, trie42, "", false);
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_remove(trie46, trie47, "seed2", true);
        fuzzTest38.FuzzTest_remove(trie39, trie46, "seed1", false);
        fuzzTest11.FuzzTest_remove(trie23, trie39, "old1", true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.Trie trie60 = null;
        naturalness.Trie trie61 = null;
        fuzzTest59.FuzzTest_remove(trie60, trie61, "", false);
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_remove(trie65, trie66, "seed2", true);
        fuzzTest57.FuzzTest_remove(trie58, trie65, "seed1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie39, trie58, "hi!", false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        naturalness.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "seed2", true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie13, trie14, "seed1", false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_remove(trie19, trie20, "seed1", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = null;
        naturalness.Trie trie26 = null;
        fuzzTest24.FuzzTest_remove(trie25, trie26, "", false);
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_remove(trie30, trie31, "seed2", true);
        fuzzTest12.FuzzTest_remove(trie19, trie30, "old2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie8, trie30, "hi!", false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie2, trie3, "seed1", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_remove(trie8, trie9, "seed1", false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = null;
        naturalness.Trie trie15 = null;
        fuzzTest13.FuzzTest_remove(trie14, trie15, "", false);
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_remove(trie19, trie20, "seed2", true);
        fuzzTest1.FuzzTest_remove(trie8, trie19, "old2", false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie28, trie29, "seed1", false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_remove(trie34, trie35, "seed1", false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_remove(trie40, trie41, "seed1", false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.Trie trie46 = null;
        naturalness.Trie trie47 = null;
        fuzzTest45.FuzzTest_remove(trie46, trie47, "", false);
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_remove(trie51, trie52, "seed2", true);
        fuzzTest33.FuzzTest_remove(trie40, trie51, "old2", false);
        fuzzTest1.FuzzTest_remove(trie28, trie51, "old1", true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_remove(trie63, trie64, "seed1", false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_remove(trie69, trie70, "seed1", false);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.Trie trie75 = null;
        naturalness.Trie trie76 = null;
        fuzzTest74.FuzzTest_remove(trie75, trie76, "", false);
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_remove(trie80, trie81, "seed2", true);
        fuzzTest62.FuzzTest_remove(trie69, trie80, "old2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie28, trie69, "", false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        naturalness.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_remove(trie8, trie9, "seed1", false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = null;
        naturalness.Trie trie15 = null;
        fuzzTest13.FuzzTest_remove(trie14, trie15, "", false);
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_remove(trie19, trie20, "seed2", true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(trie27, trie28, "seed1", false);
        fuzzTest24.FuzzTest_remove(trie25, trie27, "old1", true);
        fuzzTest7.FuzzTest_remove(trie19, trie27, "old0", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = null;
        naturalness.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie44, trie45, "seed2", true);
        fuzzTest1.FuzzTest_remove(trie19, trie44, "seed0", false);
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie44, trie52, "old2", true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.Trie trie57 = null;
        naturalness.Trie trie58 = null;
        fuzzTest56.FuzzTest_remove(trie57, trie58, "", false);
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_remove(trie62, trie63, "seed2", true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.Trie trie68 = null;
        naturalness.Trie trie69 = null;
        fuzzTest67.FuzzTest_remove(trie68, trie69, "", false);
        naturalness.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_remove(trie73, trie74, "seed2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie62, trie74, "old0", false);
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
        fuzzTest0.FuzzTest_remove(trie6, trie7, "seed2", true);
        naturalness.Trie trie11 = null;
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie11, trie12, "hi!", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_remove(trie17, trie18, "seed1", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie23, trie24, "seed1", false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie29, trie30, "seed1", false);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = null;
        naturalness.Trie trie36 = null;
        fuzzTest34.FuzzTest_remove(trie35, trie36, "", false);
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_remove(trie40, trie41, "seed2", true);
        fuzzTest22.FuzzTest_remove(trie29, trie40, "old2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie18, trie40, "", false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie7, trie8, "seed1", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie13, trie14, "seed1", false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = null;
        naturalness.Trie trie20 = null;
        fuzzTest18.FuzzTest_remove(trie19, trie20, "", false);
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_remove(trie24, trie25, "seed2", true);
        fuzzTest6.FuzzTest_remove(trie13, trie24, "old2", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_remove(trie33, trie34, "seed1", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie39, trie40, "seed1", false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_remove(trie45, trie46, "seed1", false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.Trie trie51 = null;
        naturalness.Trie trie52 = null;
        fuzzTest50.FuzzTest_remove(trie51, trie52, "", false);
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_remove(trie56, trie57, "seed2", true);
        fuzzTest38.FuzzTest_remove(trie45, trie56, "old2", false);
        fuzzTest6.FuzzTest_remove(trie33, trie56, "old1", true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.Trie trie69 = null;
        naturalness.Trie trie70 = null;
        fuzzTest68.FuzzTest_remove(trie69, trie70, "", false);
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_remove(trie74, trie75, "seed2", true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.Trie trie80 = null;
        naturalness.Trie trie81 = null;
        fuzzTest79.FuzzTest_remove(trie80, trie81, "", false);
        naturalness.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_remove(trie85, trie86, "seed2", true);
        fuzzTest67.FuzzTest_remove(trie74, trie86, "hi!", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie56, trie74, "hi!", false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie7 = null;
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old2", false);
        naturalness.Trie trie11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_remove(trie19, trie20, "seed1", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(trie32, trie33, "seed2", true);
        fuzzTest24.FuzzTest_remove(trie25, trie32, "seed1", false);
        fuzzTest12.FuzzTest_remove(trie20, trie25, "old0", true);
        fuzzTest0.FuzzTest_remove(trie11, trie20, "seed2", true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_remove(trie47, trie48, "seed1", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = null;
        naturalness.Trie trie56 = null;
        fuzzTest54.FuzzTest_remove(trie55, trie56, "", false);
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_remove(trie60, trie61, "seed2", true);
        fuzzTest52.FuzzTest_remove(trie53, trie60, "seed1", false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.Trie trie71 = null;
        naturalness.Trie trie72 = null;
        fuzzTest70.FuzzTest_remove(trie71, trie72, "", false);
        naturalness.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_remove(trie76, trie77, "seed2", true);
        fuzzTest68.FuzzTest_remove(trie69, trie76, "seed1", false);
        fuzzTest46.FuzzTest_remove(trie53, trie76, "old0", false);
        fuzztests.FuzzTest fuzzTest87 = new fuzztests.FuzzTest();
        naturalness.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest87.FuzzTest_remove(trie88, trie89, "seed1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie76, trie88, "hi!", false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = null;
        naturalness.Trie trie4 = null;
        fuzzTest2.FuzzTest_remove(trie3, trie4, "", false);
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_remove(trie8, trie9, "seed2", true);
        fuzzTest0.FuzzTest_remove(trie1, trie8, "seed1", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_remove(trie17, trie18, "seed1", false);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie17, trie22, "old1", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(trie32, trie33, "seed2", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_remove(trie40, trie41, "seed1", false);
        fuzzTest37.FuzzTest_remove(trie38, trie40, "old1", true);
        fuzzTest0.FuzzTest_remove(trie32, trie38, "old1", false);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_remove(trie52, trie53, "seed1", false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_remove(trie58, trie59, "seed1", false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = null;
        naturalness.Trie trie65 = null;
        fuzzTest63.FuzzTest_remove(trie64, trie65, "", false);
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_remove(trie69, trie70, "seed2", true);
        fuzzTest51.FuzzTest_remove(trie58, trie69, "old2", false);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.Trie trie80 = null;
        naturalness.Trie trie81 = null;
        fuzzTest79.FuzzTest_remove(trie80, trie81, "", false);
        naturalness.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_remove(trie85, trie86, "seed2", true);
        fuzzTest77.FuzzTest_remove(trie78, trie85, "seed1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie69, trie85, "hi!", false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie7, trie8, "seed1", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "seed2", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_remove(trie26, trie27, "seed1", false);
        fuzzTest23.FuzzTest_remove(trie24, trie26, "old1", true);
        fuzzTest6.FuzzTest_remove(trie18, trie26, "old0", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie38, trie39, "seed1", false);
        naturalness.Trie trie43 = null;
        fuzzTest6.FuzzTest_remove(trie39, trie43, "", true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_remove(trie48, trie49, "seed1", false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = null;
        fuzzTest53.FuzzTest_remove(trie54, trie55, "", false);
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_remove(trie59, trie60, "seed2", true);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.Trie trie65 = null;
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_remove(trie67, trie68, "seed1", false);
        fuzzTest64.FuzzTest_remove(trie65, trie67, "old1", true);
        fuzzTest47.FuzzTest_remove(trie59, trie67, "old0", false);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_remove(trie79, trie80, "seed1", false);
        naturalness.Trie trie84 = null;
        fuzzTest47.FuzzTest_remove(trie80, trie84, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie39, trie80, "", false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        naturalness.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "seed2", true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "seed2", true);
        fuzzTest0.FuzzTest_remove(trie7, trie19, "hi!", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = null;
        naturalness.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "seed2", true);
        fuzzTest26.FuzzTest_remove(trie27, trie34, "seed1", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = null;
        fuzzTest42.FuzzTest_remove(trie43, trie44, "", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie49, trie50, "seed1", false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = null;
        naturalness.Trie trie56 = null;
        fuzzTest54.FuzzTest_remove(trie55, trie56, "", false);
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_remove(trie60, trie61, "seed2", true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.Trie trie66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_remove(trie68, trie69, "seed1", false);
        fuzzTest65.FuzzTest_remove(trie66, trie68, "old1", true);
        fuzzTest48.FuzzTest_remove(trie60, trie68, "old0", false);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.Trie trie80 = null;
        naturalness.Trie trie81 = null;
        fuzzTest79.FuzzTest_remove(trie80, trie81, "", false);
        naturalness.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_remove(trie85, trie86, "seed2", true);
        fuzzTest42.FuzzTest_remove(trie60, trie85, "seed0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie34, trie85, "hi!", false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        naturalness.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "seed2", true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "seed2", true);
        fuzzTest0.FuzzTest_remove(trie7, trie19, "hi!", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie33, trie34, "seed2", true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie39, trie40, "seed1", false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = null;
        naturalness.Trie trie46 = null;
        fuzzTest44.FuzzTest_remove(trie45, trie46, "", false);
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_remove(trie50, trie51, "seed2", true);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.Trie trie56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_remove(trie58, trie59, "seed1", false);
        fuzzTest55.FuzzTest_remove(trie56, trie58, "old1", true);
        fuzzTest38.FuzzTest_remove(trie50, trie58, "old0", false);
        fuzzTest26.FuzzTest_remove(trie33, trie58, "old0", true);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        naturalness.Trie trie74 = null;
        naturalness.Trie trie75 = null;
        fuzzTest73.FuzzTest_remove(trie74, trie75, "", false);
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_remove(trie79, trie80, "seed2", true);
        naturalness.Trie trie84 = null;
        fuzzTest72.FuzzTest_remove(trie80, trie84, "seed0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie33, trie80, "old2", false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie7, trie8, "seed1", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = null;
        naturalness.Trie trie16 = null;
        fuzzTest14.FuzzTest_remove(trie15, trie16, "", false);
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_remove(trie20, trie21, "seed2", true);
        fuzzTest12.FuzzTest_remove(trie13, trie20, "seed1", false);
        fuzzTest0.FuzzTest_remove(trie8, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_remove(trie32, trie33, "seed1", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie38, trie39, "seed1", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = null;
        naturalness.Trie trie45 = null;
        fuzzTest43.FuzzTest_remove(trie44, trie45, "", false);
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(trie49, trie50, "seed2", true);
        fuzzTest31.FuzzTest_remove(trie38, trie49, "old2", false);
        naturalness.Trie trie57 = null;
        fuzzTest0.FuzzTest_remove(trie38, trie57, "old2", false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_remove(trie62, trie63, "seed1", false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.Trie trie68 = null;
        naturalness.Trie trie69 = null;
        fuzzTest67.FuzzTest_remove(trie68, trie69, "", false);
        naturalness.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_remove(trie73, trie74, "seed2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie63, trie74, "old0", false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        naturalness.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "seed2", true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "seed2", true);
        fuzzTest0.FuzzTest_remove(trie7, trie19, "hi!", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie33, trie34, "seed2", true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = null;
        naturalness.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie44, trie45, "seed2", true);
        fuzzTest26.FuzzTest_remove(trie33, trie45, "hi!", true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = null;
        fuzzTest53.FuzzTest_remove(trie54, trie55, "", false);
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_remove(trie59, trie60, "seed2", true);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.Trie trie65 = null;
        naturalness.Trie trie66 = null;
        fuzzTest64.FuzzTest_remove(trie65, trie66, "", false);
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_remove(trie70, trie71, "seed2", true);
        fuzzTest52.FuzzTest_remove(trie59, trie71, "hi!", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie45, trie71, "old0", false);
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
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = null;
        naturalness.Trie trie9 = null;
        fuzzTest7.FuzzTest_remove(trie8, trie9, "", false);
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_remove(trie13, trie14, "seed2", true);
        naturalness.Trie trie18 = null;
        fuzzTest6.FuzzTest_remove(trie14, trie18, "seed0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie23, trie24, "seed1", false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = null;
        naturalness.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "seed2", true);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = null;
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_remove(trie42, trie43, "seed1", false);
        fuzzTest39.FuzzTest_remove(trie40, trie42, "old1", true);
        fuzzTest22.FuzzTest_remove(trie34, trie42, "old0", false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_remove(trie54, trie55, "seed1", false);
        naturalness.Trie trie59 = null;
        fuzzTest22.FuzzTest_remove(trie55, trie59, "", true);
        naturalness.Trie trie63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.Trie trie66 = null;
        naturalness.Trie trie67 = null;
        fuzzTest65.FuzzTest_remove(trie66, trie67, "", false);
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_remove(trie71, trie72, "seed2", true);
        naturalness.Trie trie76 = null;
        fuzzTest64.FuzzTest_remove(trie72, trie76, "seed0", false);
        fuzzTest22.FuzzTest_remove(trie63, trie72, "old2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie14, trie72, "", false);
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
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = null;
        naturalness.Trie trie10 = null;
        fuzzTest8.FuzzTest_remove(trie9, trie10, "", false);
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_remove(trie14, trie15, "seed2", true);
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = null;
        naturalness.Trie trie24 = null;
        fuzzTest22.FuzzTest_remove(trie23, trie24, "", false);
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie28, trie29, "seed2", true);
        fuzzTest20.FuzzTest_remove(trie21, trie28, "seed1", false);
        fuzzTest8.FuzzTest_remove(trie19, trie28, "old0", false);
        fuzzTest1.FuzzTest_remove(trie7, trie28, "old2", true);
        naturalness.Trie trie42 = null;
        fuzzTest0.FuzzTest_remove(trie28, trie42, "", false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_remove(trie47, trie48, "seed1", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(trie53, trie54, "seed1", false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = null;
        fuzzTest58.FuzzTest_remove(trie59, trie60, "", false);
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_remove(trie64, trie65, "seed2", true);
        fuzzTest46.FuzzTest_remove(trie53, trie64, "old2", false);
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie64, trie72, "hi!", false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "seed2", true);
        naturalness.Trie trie11 = null;
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie11, trie12, "hi!", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_remove(trie17, trie18, "seed1", false);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie17, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = null;
        naturalness.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_remove(trie33, trie34, "seed1", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = null;
        naturalness.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie44, trie45, "seed2", true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = null;
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_remove(trie52, trie53, "seed1", false);
        fuzzTest49.FuzzTest_remove(trie50, trie52, "old1", true);
        fuzzTest32.FuzzTest_remove(trie44, trie52, "old0", false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = null;
        naturalness.Trie trie65 = null;
        fuzzTest63.FuzzTest_remove(trie64, trie65, "", false);
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_remove(trie69, trie70, "seed2", true);
        fuzzTest26.FuzzTest_remove(trie44, trie69, "seed0", false);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.Trie trie80 = null;
        naturalness.Trie trie81 = null;
        fuzzTest79.FuzzTest_remove(trie80, trie81, "", false);
        naturalness.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_remove(trie85, trie86, "seed2", true);
        fuzzTest77.FuzzTest_remove(trie78, trie85, "seed1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie69, trie78, "", false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "seed2", true);
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.Trie trie21 = null;
        naturalness.Trie trie22 = null;
        fuzzTest20.FuzzTest_remove(trie21, trie22, "", false);
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_remove(trie26, trie27, "seed2", true);
        fuzzTest18.FuzzTest_remove(trie19, trie26, "seed1", false);
        fuzzTest6.FuzzTest_remove(trie17, trie26, "old0", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = null;
        naturalness.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie44, trie45, "seed2", true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_remove(trie50, trie51, "seed1", false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.Trie trie56 = null;
        naturalness.Trie trie57 = null;
        fuzzTest55.FuzzTest_remove(trie56, trie57, "", false);
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_remove(trie61, trie62, "seed2", true);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.Trie trie67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_remove(trie69, trie70, "seed1", false);
        fuzzTest66.FuzzTest_remove(trie67, trie69, "old1", true);
        fuzzTest49.FuzzTest_remove(trie61, trie69, "old0", false);
        fuzzTest37.FuzzTest_remove(trie44, trie69, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie17, trie69, "", false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = null;
        naturalness.Trie trie4 = null;
        fuzzTest2.FuzzTest_remove(trie3, trie4, "", false);
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_remove(trie8, trie9, "seed2", true);
        fuzzTest0.FuzzTest_remove(trie1, trie8, "seed1", false);
        naturalness.Trie trie16 = null;
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "seed2", true);
        fuzzTest0.FuzzTest_remove(trie16, trie23, "seed1", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_remove(trie32, trie33, "seed1", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie43, trie44, "seed2", true);
        naturalness.Trie trie48 = null;
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie48, trie49, "hi!", false);
        fuzzTest0.FuzzTest_remove(trie33, trie48, "", false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = null;
        fuzzTest58.FuzzTest_remove(trie59, trie60, "", false);
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_remove(trie64, trie65, "seed2", true);
        fuzzTest56.FuzzTest_remove(trie57, trie64, "seed1", false);
        naturalness.Trie trie72 = null;
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        naturalness.Trie trie74 = null;
        naturalness.Trie trie75 = null;
        fuzzTest73.FuzzTest_remove(trie74, trie75, "", false);
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_remove(trie79, trie80, "seed2", true);
        fuzzTest56.FuzzTest_remove(trie72, trie79, "seed1", true);
        naturalness.Trie trie87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie79, trie87, "", false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = null;
        naturalness.Trie trie4 = null;
        fuzzTest2.FuzzTest_remove(trie3, trie4, "", false);
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_remove(trie8, trie9, "seed2", true);
        fuzzTest0.FuzzTest_remove(trie1, trie8, "seed1", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = null;
        fuzzTest16.FuzzTest_remove(trie17, trie18, "", false);
        naturalness.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_remove(trie22, trie23, "seed2", true);
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.Trie trie31 = null;
        naturalness.Trie trie32 = null;
        fuzzTest30.FuzzTest_remove(trie31, trie32, "", false);
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_remove(trie36, trie37, "seed2", true);
        fuzzTest28.FuzzTest_remove(trie29, trie36, "seed1", false);
        fuzzTest16.FuzzTest_remove(trie27, trie36, "old0", false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = null;
        fuzzTest48.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie54, trie55, "seed2", true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_remove(trie60, trie61, "seed1", false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.Trie trie66 = null;
        naturalness.Trie trie67 = null;
        fuzzTest65.FuzzTest_remove(trie66, trie67, "", false);
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_remove(trie71, trie72, "seed2", true);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.Trie trie77 = null;
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_remove(trie79, trie80, "seed1", false);
        fuzzTest76.FuzzTest_remove(trie77, trie79, "old1", true);
        fuzzTest59.FuzzTest_remove(trie71, trie79, "old0", false);
        fuzzTest47.FuzzTest_remove(trie54, trie79, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie27, trie54, "", false);
    }
}

