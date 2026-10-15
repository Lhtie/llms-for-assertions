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
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie8, trie19, "seed0", true);
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
        naturalness.mut_000.Trie trie17 = null;
        naturalness.mut_000.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie23 = null;
        naturalness.mut_000.Trie trie24 = null;
        fuzzTest22.FuzzTest_remove(trie23, trie24, "", false);
        naturalness.mut_000.Trie trie28 = null;
        naturalness.mut_000.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie28, trie29, "old0", true);
        naturalness.mut_000.Trie trie33 = null;
        fuzzTest11.FuzzTest_remove(trie29, trie33, "old2", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie38 = null;
        naturalness.mut_000.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.mut_000.Trie trie43 = null;
        naturalness.mut_000.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie43, trie44, "old0", true);
        fuzzTest0.FuzzTest_remove(trie33, trie43, "seed1", true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie52 = null;
        naturalness.mut_000.Trie trie53 = null;
        fuzzTest51.FuzzTest_remove(trie52, trie53, "", false);
        naturalness.mut_000.Trie trie57 = null;
        naturalness.mut_000.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_remove(trie57, trie58, "old0", true);
        naturalness.mut_000.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie58, trie62, "", true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        naturalness.mut_000.Trie trie26 = null;
        naturalness.mut_000.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie26, trie27, "seed0", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie32 = null;
        naturalness.mut_000.Trie trie33 = null;
        fuzzTest31.FuzzTest_remove(trie32, trie33, "", false);
        naturalness.mut_000.Trie trie37 = null;
        naturalness.mut_000.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_remove(trie37, trie38, "old0", true);
        naturalness.mut_000.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie38, trie42, "seed1", true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie4 = null;
        naturalness.mut_000.Trie trie5 = null;
        fuzzTest3.FuzzTest_remove(trie4, trie5, "", false);
        naturalness.mut_000.Trie trie9 = null;
        naturalness.mut_000.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_remove(trie9, trie10, "old0", true);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie15 = null;
        naturalness.mut_000.Trie trie16 = null;
        fuzzTest14.FuzzTest_remove(trie15, trie16, "", false);
        naturalness.mut_000.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_remove(trie20, trie21, "", false);
        naturalness.mut_000.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_remove(trie21, trie25, "old0", false);
        fuzzTest1.FuzzTest_remove(trie2, trie21, "old2", true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie33 = null;
        naturalness.mut_000.Trie trie34 = null;
        fuzzTest32.FuzzTest_remove(trie33, trie34, "", false);
        naturalness.mut_000.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_remove(trie38, trie39, "", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie45 = null;
        naturalness.mut_000.Trie trie46 = null;
        fuzzTest44.FuzzTest_remove(trie45, trie46, "", false);
        naturalness.mut_000.Trie trie50 = null;
        naturalness.mut_000.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_remove(trie50, trie51, "old0", true);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie56 = null;
        naturalness.mut_000.Trie trie57 = null;
        fuzzTest55.FuzzTest_remove(trie56, trie57, "", false);
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
        naturalness.mut_000.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_remove(trie78, trie79, "", false);
        fuzzTest55.FuzzTest_remove(trie67, trie79, "hi!", true);
        fuzzTest43.FuzzTest_remove(trie51, trie79, "", false);
        fuzzTest1.FuzzTest_remove(trie38, trie51, "old2", true);
        naturalness.mut_000.Trie trie92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie38, trie92, "", true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie2 = null;
        naturalness.mut_000.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.mut_000.Trie trie7 = null;
        naturalness.mut_000.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "old0", true);
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest1.FuzzTest_remove(trie12, trie13, "old0", false);
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
        naturalness.mut_000.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie35, trie39, "old0", false);
        naturalness.mut_000.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie45 = null;
        naturalness.mut_000.Trie trie46 = null;
        fuzzTest44.FuzzTest_remove(trie45, trie46, "", false);
        naturalness.mut_000.Trie trie50 = null;
        naturalness.mut_000.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_remove(trie50, trie51, "old0", true);
        fuzzTest17.FuzzTest_remove(trie43, trie50, "seed0", false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie59 = null;
        naturalness.mut_000.Trie trie60 = null;
        fuzzTest58.FuzzTest_remove(trie59, trie60, "", false);
        naturalness.mut_000.Trie trie64 = null;
        naturalness.mut_000.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_remove(trie64, trie65, "old0", true);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie70 = null;
        naturalness.mut_000.Trie trie71 = null;
        fuzzTest69.FuzzTest_remove(trie70, trie71, "", false);
        naturalness.mut_000.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_remove(trie75, trie76, "", false);
        naturalness.mut_000.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_remove(trie76, trie80, "old0", false);
        fuzzTest1.FuzzTest_remove(trie43, trie80, "old0", false);
        naturalness.mut_000.Trie trie87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie43, trie87, "seed0", true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", true);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = null;
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old1", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.mut_000.Trie trie17 = null;
        naturalness.mut_000.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie23 = null;
        naturalness.mut_000.Trie trie24 = null;
        fuzzTest22.FuzzTest_remove(trie23, trie24, "", false);
        naturalness.mut_000.Trie trie28 = null;
        naturalness.mut_000.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie28, trie29, "old0", true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie34 = null;
        naturalness.mut_000.Trie trie35 = null;
        fuzzTest33.FuzzTest_remove(trie34, trie35, "", false);
        naturalness.mut_000.Trie trie39 = null;
        naturalness.mut_000.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_remove(trie39, trie40, "old0", true);
        naturalness.mut_000.Trie trie44 = null;
        fuzzTest22.FuzzTest_remove(trie40, trie44, "old2", true);
        naturalness.mut_000.Trie trie48 = null;
        naturalness.mut_000.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie48, trie49, "seed0", true);
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
        naturalness.mut_000.Trie trie70 = null;
        naturalness.mut_000.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_remove(trie70, trie71, "old0", true);
        naturalness.mut_000.Trie trie75 = null;
        fuzzTest53.FuzzTest_remove(trie71, trie75, "old2", true);
        naturalness.mut_000.Trie trie79 = null;
        fuzzTest22.FuzzTest_remove(trie71, trie79, "seed1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie18, trie71, "seed1", true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        naturalness.mut_000.Trie trie23 = null;
        naturalness.mut_000.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "old0", true);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie29 = null;
        naturalness.mut_000.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.mut_000.Trie trie34 = null;
        naturalness.mut_000.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "old0", true);
        naturalness.mut_000.Trie trie39 = null;
        fuzzTest17.FuzzTest_remove(trie35, trie39, "old2", true);
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
        naturalness.mut_000.Trie trie60 = null;
        naturalness.mut_000.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_remove(trie60, trie61, "old0", true);
        fuzzTest17.FuzzTest_remove(trie50, trie60, "", true);
        naturalness.mut_000.Trie trie68 = null;
        naturalness.mut_000.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie68, trie69, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie12, trie69, "seed0", true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie7 = null;
        naturalness.mut_000.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
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
        fuzzTest6.FuzzTest_remove(trie18, trie30, "hi!", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie38 = null;
        naturalness.mut_000.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.mut_000.Trie trie43 = null;
        naturalness.mut_000.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie43, trie44, "old0", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie49 = null;
        naturalness.mut_000.Trie trie50 = null;
        fuzzTest48.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.mut_000.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie54, trie55, "", false);
        naturalness.mut_000.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie55, trie59, "old0", false);
        naturalness.mut_000.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie55, trie63, "", true);
        naturalness.mut_000.Trie trie67 = null;
        fuzzTest0.FuzzTest_remove(trie55, trie67, "old0", true);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie72 = null;
        naturalness.mut_000.Trie trie73 = null;
        fuzzTest71.FuzzTest_remove(trie72, trie73, "", false);
        naturalness.mut_000.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_remove(trie77, trie78, "", false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie83 = null;
        naturalness.mut_000.Trie trie84 = null;
        fuzzTest82.FuzzTest_remove(trie83, trie84, "", false);
        naturalness.mut_000.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_remove(trie88, trie89, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie77, trie89, "", true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        naturalness.mut_000.Trie trie26 = null;
        naturalness.mut_000.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie26, trie27, "seed0", true);
        naturalness.mut_000.Trie trie31 = null;
        naturalness.mut_000.Trie trie32 = null;
        fuzzTest0.FuzzTest_remove(trie31, trie32, "seed0", false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie37 = null;
        naturalness.mut_000.Trie trie38 = null;
        fuzzTest36.FuzzTest_remove(trie37, trie38, "seed1", true);
        naturalness.mut_000.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie43 = null;
        fuzzTest36.FuzzTest_remove(trie42, trie43, "old1", false);
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
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie66 = null;
        naturalness.mut_000.Trie trie67 = null;
        fuzzTest65.FuzzTest_remove(trie66, trie67, "", false);
        naturalness.mut_000.Trie trie71 = null;
        naturalness.mut_000.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_remove(trie71, trie72, "old0", true);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie77 = null;
        naturalness.mut_000.Trie trie78 = null;
        fuzzTest76.FuzzTest_remove(trie77, trie78, "", false);
        naturalness.mut_000.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_remove(trie82, trie83, "", false);
        fuzzTest59.FuzzTest_remove(trie71, trie83, "hi!", true);
        fuzzTest47.FuzzTest_remove(trie55, trie83, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie42, trie83, "seed0", true);
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
        naturalness.mut_000.Trie trie11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie13 = null;
        naturalness.mut_000.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "old0", true);
        fuzzTest0.FuzzTest_remove(trie11, trie18, "hi!", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie29 = null;
        naturalness.mut_000.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.mut_000.Trie trie34 = null;
        naturalness.mut_000.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "old0", true);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie40 = null;
        naturalness.mut_000.Trie trie41 = null;
        fuzzTest39.FuzzTest_remove(trie40, trie41, "", false);
        naturalness.mut_000.Trie trie45 = null;
        naturalness.mut_000.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_remove(trie45, trie46, "old0", true);
        naturalness.mut_000.Trie trie50 = null;
        fuzzTest28.FuzzTest_remove(trie46, trie50, "old2", true);
        fuzzTest26.FuzzTest_remove(trie27, trie46, "old0", true);
        naturalness.mut_000.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie27, trie57, "", true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", true);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = null;
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old1", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "seed1", true);
        naturalness.mut_000.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie18 = null;
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old1", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie23 = null;
        naturalness.mut_000.Trie trie24 = null;
        fuzzTest22.FuzzTest_remove(trie23, trie24, "", false);
        naturalness.mut_000.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie28, trie29, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie17, trie29, "seed2", true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", true);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = null;
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old1", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.mut_000.Trie trie17 = null;
        naturalness.mut_000.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie23 = null;
        naturalness.mut_000.Trie trie24 = null;
        fuzzTest22.FuzzTest_remove(trie23, trie24, "", false);
        naturalness.mut_000.Trie trie28 = null;
        naturalness.mut_000.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie28, trie29, "old0", true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie34 = null;
        naturalness.mut_000.Trie trie35 = null;
        fuzzTest33.FuzzTest_remove(trie34, trie35, "", false);
        naturalness.mut_000.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.mut_000.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie40, trie44, "old0", false);
        naturalness.mut_000.Trie trie48 = null;
        fuzzTest11.FuzzTest_remove(trie40, trie48, "hi!", true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
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
        fuzzTest52.FuzzTest_remove(trie53, trie72, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie40, trie53, "hi!", true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie3 = null;
        naturalness.mut_000.Trie trie4 = null;
        fuzzTest2.FuzzTest_remove(trie3, trie4, "", false);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie9 = null;
        naturalness.mut_000.Trie trie10 = null;
        fuzzTest8.FuzzTest_remove(trie9, trie10, "", false);
        naturalness.mut_000.Trie trie14 = null;
        naturalness.mut_000.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_remove(trie14, trie15, "old0", true);
        naturalness.mut_000.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie21 = null;
        naturalness.mut_000.Trie trie22 = null;
        fuzzTest20.FuzzTest_remove(trie21, trie22, "", false);
        naturalness.mut_000.Trie trie26 = null;
        naturalness.mut_000.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_remove(trie26, trie27, "old0", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie32 = null;
        naturalness.mut_000.Trie trie33 = null;
        fuzzTest31.FuzzTest_remove(trie32, trie33, "", false);
        naturalness.mut_000.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_remove(trie37, trie38, "", false);
        naturalness.mut_000.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_remove(trie38, trie42, "old0", false);
        fuzzTest8.FuzzTest_remove(trie19, trie42, "seed0", false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie50 = null;
        naturalness.mut_000.Trie trie51 = null;
        fuzzTest49.FuzzTest_remove(trie50, trie51, "", false);
        naturalness.mut_000.Trie trie55 = null;
        naturalness.mut_000.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_remove(trie55, trie56, "old0", true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie61 = null;
        naturalness.mut_000.Trie trie62 = null;
        fuzzTest60.FuzzTest_remove(trie61, trie62, "", false);
        naturalness.mut_000.Trie trie66 = null;
        naturalness.mut_000.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_remove(trie66, trie67, "old0", true);
        naturalness.mut_000.Trie trie71 = null;
        fuzzTest49.FuzzTest_remove(trie67, trie71, "old2", true);
        fuzzTest2.FuzzTest_remove(trie19, trie67, "", false);
        fuzzTest0.FuzzTest_remove(trie1, trie67, "seed1", true);
        naturalness.mut_000.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie81, trie82, "old0", false);
        naturalness.mut_000.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie86, trie87, "hi!", true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "", false);
        naturalness.mut_000.Trie trie11 = null;
        naturalness.mut_000.Trie trie12 = null;
        fuzzTest0.FuzzTest_remove(trie11, trie12, "seed1", true);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie17 = null;
        naturalness.mut_000.Trie trie18 = null;
        fuzzTest16.FuzzTest_remove(trie17, trie18, "", false);
        naturalness.mut_000.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_remove(trie22, trie23, "", false);
        naturalness.mut_000.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie29 = null;
        naturalness.mut_000.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.mut_000.Trie trie34 = null;
        naturalness.mut_000.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "old0", true);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie40 = null;
        naturalness.mut_000.Trie trie41 = null;
        fuzzTest39.FuzzTest_remove(trie40, trie41, "", false);
        naturalness.mut_000.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_remove(trie45, trie46, "", false);
        naturalness.mut_000.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie46, trie50, "old0", false);
        fuzzTest16.FuzzTest_remove(trie27, trie46, "old2", true);
        naturalness.mut_000.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie27, trie57, "hi!", true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        naturalness.mut_000.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
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
        naturalness.mut_000.Trie trie36 = null;
        naturalness.mut_000.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_remove(trie36, trie37, "old0", true);
        naturalness.mut_000.Trie trie41 = null;
        fuzzTest19.FuzzTest_remove(trie37, trie41, "old2", true);
        fuzzTest17.FuzzTest_remove(trie18, trie37, "old0", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie49 = null;
        naturalness.mut_000.Trie trie50 = null;
        fuzzTest48.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.mut_000.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie54, trie55, "", false);
        naturalness.mut_000.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie61 = null;
        naturalness.mut_000.Trie trie62 = null;
        fuzzTest60.FuzzTest_remove(trie61, trie62, "", false);
        naturalness.mut_000.Trie trie66 = null;
        naturalness.mut_000.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_remove(trie66, trie67, "old0", true);
        fuzzTest48.FuzzTest_remove(trie59, trie66, "hi!", false);
        naturalness.mut_000.Trie trie74 = null;
        fuzzTest17.FuzzTest_remove(trie59, trie74, "old2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie12, trie59, "", true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "", false);
        naturalness.mut_000.Trie trie11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie13 = null;
        naturalness.mut_000.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.mut_000.Trie trie18 = null;
        naturalness.mut_000.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "old0", true);
        fuzzTest0.FuzzTest_remove(trie11, trie18, "hi!", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie27 = null;
        naturalness.mut_000.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie33 = null;
        naturalness.mut_000.Trie trie34 = null;
        fuzzTest32.FuzzTest_remove(trie33, trie34, "", false);
        naturalness.mut_000.Trie trie38 = null;
        naturalness.mut_000.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_remove(trie38, trie39, "old0", true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie44 = null;
        naturalness.mut_000.Trie trie45 = null;
        fuzzTest43.FuzzTest_remove(trie44, trie45, "", false);
        naturalness.mut_000.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(trie49, trie50, "", false);
        fuzzTest26.FuzzTest_remove(trie38, trie50, "hi!", true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie58 = null;
        naturalness.mut_000.Trie trie59 = null;
        fuzzTest57.FuzzTest_remove(trie58, trie59, "", false);
        naturalness.mut_000.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_remove(trie63, trie64, "", false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie69 = null;
        naturalness.mut_000.Trie trie70 = null;
        fuzzTest68.FuzzTest_remove(trie69, trie70, "", false);
        naturalness.mut_000.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_remove(trie74, trie75, "", false);
        fuzzTest26.FuzzTest_remove(trie63, trie75, "seed0", false);
        naturalness.mut_000.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie63, trie82, "seed2", true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie7 = null;
        naturalness.mut_000.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.mut_000.Trie trie12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie14 = null;
        naturalness.mut_000.Trie trie15 = null;
        fuzzTest13.FuzzTest_remove(trie14, trie15, "", false);
        naturalness.mut_000.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_remove(trie19, trie20, "", false);
        fuzzTest6.FuzzTest_remove(trie12, trie19, "seed2", true);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie30 = null;
        naturalness.mut_000.Trie trie31 = null;
        fuzzTest29.FuzzTest_remove(trie30, trie31, "", false);
        naturalness.mut_000.Trie trie35 = null;
        naturalness.mut_000.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_remove(trie35, trie36, "old0", true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie41 = null;
        naturalness.mut_000.Trie trie42 = null;
        fuzzTest40.FuzzTest_remove(trie41, trie42, "", false);
        naturalness.mut_000.Trie trie46 = null;
        naturalness.mut_000.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_remove(trie46, trie47, "old0", true);
        naturalness.mut_000.Trie trie51 = null;
        fuzzTest29.FuzzTest_remove(trie47, trie51, "old2", true);
        fuzzTest27.FuzzTest_remove(trie28, trie47, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie19, trie47, "hi!", true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_000.Trie trie6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie8 = null;
        naturalness.mut_000.Trie trie9 = null;
        fuzzTest7.FuzzTest_remove(trie8, trie9, "", false);
        naturalness.mut_000.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_remove(trie13, trie14, "", false);
        fuzzTest0.FuzzTest_remove(trie6, trie13, "seed2", true);
        naturalness.mut_000.Trie trie21 = null;
        naturalness.mut_000.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie21, trie22, "", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie27 = null;
        naturalness.mut_000.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        naturalness.mut_000.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(trie32, trie33, "", false);
        naturalness.mut_000.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
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
        naturalness.mut_000.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie56, trie60, "old0", false);
        fuzzTest26.FuzzTest_remove(trie37, trie56, "old2", true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie68 = null;
        naturalness.mut_000.Trie trie69 = null;
        fuzzTest67.FuzzTest_remove(trie68, trie69, "", false);
        naturalness.mut_000.Trie trie73 = null;
        naturalness.mut_000.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_remove(trie73, trie74, "old0", true);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie79 = null;
        naturalness.mut_000.Trie trie80 = null;
        fuzzTest78.FuzzTest_remove(trie79, trie80, "", false);
        naturalness.mut_000.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_remove(trie84, trie85, "", false);
        naturalness.mut_000.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_remove(trie85, trie89, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie56, trie85, "hi!", true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", true);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie8 = null;
        naturalness.mut_000.Trie trie9 = null;
        fuzzTest7.FuzzTest_remove(trie8, trie9, "", false);
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
        fuzzTest7.FuzzTest_remove(trie19, trie31, "hi!", true);
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
        naturalness.mut_000.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie56, trie60, "old0", false);
        naturalness.mut_000.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_remove(trie56, trie64, "", true);
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
        fuzzTest7.FuzzTest_remove(trie75, trie85, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie6, trie75, "hi!", true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", true);
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
        naturalness.mut_000.Trie trie23 = null;
        naturalness.mut_000.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "old0", true);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie29 = null;
        naturalness.mut_000.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.mut_000.Trie trie34 = null;
        naturalness.mut_000.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "old0", true);
        naturalness.mut_000.Trie trie39 = null;
        fuzzTest17.FuzzTest_remove(trie35, trie39, "old2", true);
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
        naturalness.mut_000.Trie trie60 = null;
        naturalness.mut_000.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_remove(trie60, trie61, "old0", true);
        fuzzTest17.FuzzTest_remove(trie50, trie60, "", true);
        naturalness.mut_000.Trie trie68 = null;
        naturalness.mut_000.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie68, trie69, "seed0", true);
        naturalness.mut_000.Trie trie73 = null;
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie75 = null;
        naturalness.mut_000.Trie trie76 = null;
        fuzzTest74.FuzzTest_remove(trie75, trie76, "", false);
        naturalness.mut_000.Trie trie80 = null;
        naturalness.mut_000.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_remove(trie80, trie81, "old0", true);
        fuzzTest17.FuzzTest_remove(trie73, trie81, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie13, trie81, "seed2", true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie1 = null;
        naturalness.mut_000.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "seed1", true);
        naturalness.mut_000.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.Trie trie7 = null;
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old1", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie12 = null;
        naturalness.mut_000.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.mut_000.Trie trie17 = null;
        naturalness.mut_000.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        naturalness.mut_000.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
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
        naturalness.mut_000.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie41, trie45, "old0", false);
        fuzzTest11.FuzzTest_remove(trie22, trie45, "seed0", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie53 = null;
        naturalness.mut_000.Trie trie54 = null;
        fuzzTest52.FuzzTest_remove(trie53, trie54, "", false);
        naturalness.mut_000.Trie trie58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_000.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
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
        fuzzTest59.FuzzTest_remove(trie60, trie79, "old0", true);
        fuzzTest52.FuzzTest_remove(trie58, trie60, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie45, trie60, "", true);
    }
}

