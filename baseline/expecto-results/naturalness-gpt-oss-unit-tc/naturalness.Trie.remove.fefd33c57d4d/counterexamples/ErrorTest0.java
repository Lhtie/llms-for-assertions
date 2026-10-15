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
        naturalness.mut_001.Trie trie2 = null;
        naturalness.mut_001.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.mut_001.Trie trie7 = null;
        naturalness.mut_001.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "old0", true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie13 = null;
        naturalness.mut_001.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.mut_001.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie8, trie19, "seed0", true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = null;
        naturalness.mut_001.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_001.Trie trie6 = null;
        naturalness.mut_001.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        naturalness.mut_001.Trie trie11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie13 = null;
        naturalness.mut_001.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.mut_001.Trie trie18 = null;
        naturalness.mut_001.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "old0", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie24 = null;
        naturalness.mut_001.Trie trie25 = null;
        fuzzTest23.FuzzTest_remove(trie24, trie25, "", false);
        naturalness.mut_001.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.mut_001.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie30, trie34, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie11, trie34, "seed0", false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = null;
        naturalness.mut_001.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_001.Trie trie6 = null;
        naturalness.mut_001.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie12 = null;
        naturalness.mut_001.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.mut_001.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "", false);
        naturalness.mut_001.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie18, trie22, "old0", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie27 = null;
        naturalness.mut_001.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        naturalness.mut_001.Trie trie32 = null;
        naturalness.mut_001.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(trie32, trie33, "old0", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie38 = null;
        naturalness.mut_001.Trie trie39 = null;
        fuzzTest37.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.mut_001.Trie trie43 = null;
        naturalness.mut_001.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(trie43, trie44, "old0", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie49 = null;
        naturalness.mut_001.Trie trie50 = null;
        fuzzTest48.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.mut_001.Trie trie54 = null;
        naturalness.mut_001.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie54, trie55, "old0", true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie60 = null;
        naturalness.mut_001.Trie trie61 = null;
        fuzzTest59.FuzzTest_remove(trie60, trie61, "", false);
        naturalness.mut_001.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_remove(trie65, trie66, "", false);
        naturalness.mut_001.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie66, trie70, "old0", false);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie75 = null;
        naturalness.mut_001.Trie trie76 = null;
        fuzzTest74.FuzzTest_remove(trie75, trie76, "", false);
        naturalness.mut_001.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_remove(trie80, trie81, "", false);
        fuzzTest37.FuzzTest_remove(trie66, trie81, "seed1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie33, trie81, "seed0", false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = null;
        naturalness.mut_001.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie7 = null;
        naturalness.mut_001.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.mut_001.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie18 = null;
        naturalness.mut_001.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.mut_001.Trie trie23 = null;
        naturalness.mut_001.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "old0", true);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie29 = null;
        naturalness.mut_001.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.mut_001.Trie trie34 = null;
        naturalness.mut_001.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "old0", true);
        naturalness.mut_001.Trie trie39 = null;
        fuzzTest17.FuzzTest_remove(trie35, trie39, "old2", true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie44 = null;
        naturalness.mut_001.Trie trie45 = null;
        fuzzTest43.FuzzTest_remove(trie44, trie45, "", false);
        naturalness.mut_001.Trie trie49 = null;
        naturalness.mut_001.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(trie49, trie50, "old0", true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie55 = null;
        naturalness.mut_001.Trie trie56 = null;
        fuzzTest54.FuzzTest_remove(trie55, trie56, "", false);
        naturalness.mut_001.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_remove(trie60, trie61, "", false);
        naturalness.mut_001.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(trie61, trie65, "old0", false);
        fuzzTest6.FuzzTest_remove(trie35, trie65, "old2", false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie75 = null;
        naturalness.mut_001.Trie trie76 = null;
        fuzzTest74.FuzzTest_remove(trie75, trie76, "", false);
        naturalness.mut_001.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_remove(trie80, trie81, "", false);
        fuzzTest72.FuzzTest_remove(trie73, trie80, "hi!", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie35, trie80, "seed0", false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = null;
        naturalness.mut_001.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_001.Trie trie6 = null;
        naturalness.mut_001.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie12 = null;
        naturalness.mut_001.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.mut_001.Trie trie17 = null;
        naturalness.mut_001.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        naturalness.mut_001.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie18, trie22, "old2", true);
        naturalness.mut_001.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie29 = null;
        naturalness.mut_001.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.mut_001.Trie trie34 = null;
        naturalness.mut_001.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "old0", true);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie40 = null;
        naturalness.mut_001.Trie trie41 = null;
        fuzzTest39.FuzzTest_remove(trie40, trie41, "", false);
        naturalness.mut_001.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_remove(trie45, trie46, "", false);
        naturalness.mut_001.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie46, trie50, "old0", false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie55 = null;
        naturalness.mut_001.Trie trie56 = null;
        fuzzTest54.FuzzTest_remove(trie55, trie56, "", false);
        naturalness.mut_001.Trie trie60 = null;
        naturalness.mut_001.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_remove(trie60, trie61, "old0", true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie66 = null;
        naturalness.mut_001.Trie trie67 = null;
        fuzzTest65.FuzzTest_remove(trie66, trie67, "", false);
        naturalness.mut_001.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_remove(trie71, trie72, "", false);
        naturalness.mut_001.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_remove(trie72, trie76, "old0", false);
        fuzzTest27.FuzzTest_remove(trie46, trie72, "seed0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie26, trie72, "seed2", true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie2 = null;
        naturalness.mut_001.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.mut_001.Trie trie7 = null;
        naturalness.mut_001.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "old0", true);
        naturalness.mut_001.Trie trie12 = null;
        fuzzTest0.FuzzTest_remove(trie7, trie12, "old0", true);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie19 = null;
        naturalness.mut_001.Trie trie20 = null;
        fuzzTest18.FuzzTest_remove(trie19, trie20, "", false);
        naturalness.mut_001.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_remove(trie24, trie25, "", false);
        fuzzTest16.FuzzTest_remove(trie17, trie24, "hi!", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie35 = null;
        naturalness.mut_001.Trie trie36 = null;
        fuzzTest34.FuzzTest_remove(trie35, trie36, "", false);
        naturalness.mut_001.Trie trie40 = null;
        naturalness.mut_001.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_remove(trie40, trie41, "old0", true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie46 = null;
        naturalness.mut_001.Trie trie47 = null;
        fuzzTest45.FuzzTest_remove(trie46, trie47, "", false);
        naturalness.mut_001.Trie trie51 = null;
        naturalness.mut_001.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_remove(trie51, trie52, "old0", true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie57 = null;
        naturalness.mut_001.Trie trie58 = null;
        fuzzTest56.FuzzTest_remove(trie57, trie58, "", false);
        naturalness.mut_001.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_remove(trie62, trie63, "", false);
        naturalness.mut_001.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_remove(trie63, trie67, "old0", false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie72 = null;
        naturalness.mut_001.Trie trie73 = null;
        fuzzTest71.FuzzTest_remove(trie72, trie73, "", false);
        naturalness.mut_001.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_remove(trie77, trie78, "", false);
        fuzzTest34.FuzzTest_remove(trie63, trie78, "seed1", false);
        fuzzTest32.FuzzTest_remove(trie33, trie63, "old2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie17, trie33, "seed1", false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = null;
        naturalness.mut_001.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie7 = null;
        naturalness.mut_001.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.mut_001.Trie trie12 = null;
        naturalness.mut_001.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie18 = null;
        naturalness.mut_001.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.mut_001.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "", false);
        fuzzTest0.FuzzTest_remove(trie12, trie24, "hi!", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie32 = null;
        naturalness.mut_001.Trie trie33 = null;
        fuzzTest31.FuzzTest_remove(trie32, trie33, "", false);
        naturalness.mut_001.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie39 = null;
        naturalness.mut_001.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.mut_001.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie44, trie45, "", false);
        fuzzTest31.FuzzTest_remove(trie37, trie45, "hi!", false);
        naturalness.mut_001.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie37, trie52, "seed0", true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie2 = null;
        naturalness.mut_001.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.mut_001.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie9 = null;
        naturalness.mut_001.Trie trie10 = null;
        fuzzTest8.FuzzTest_remove(trie9, trie10, "", false);
        naturalness.mut_001.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_remove(trie14, trie15, "", false);
        fuzzTest1.FuzzTest_remove(trie7, trie15, "hi!", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie23 = null;
        naturalness.mut_001.Trie trie24 = null;
        fuzzTest22.FuzzTest_remove(trie23, trie24, "", false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie29 = null;
        naturalness.mut_001.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.mut_001.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie36 = null;
        naturalness.mut_001.Trie trie37 = null;
        fuzzTest35.FuzzTest_remove(trie36, trie37, "", false);
        naturalness.mut_001.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_remove(trie41, trie42, "", false);
        fuzzTest28.FuzzTest_remove(trie34, trie42, "hi!", false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie50 = null;
        naturalness.mut_001.Trie trie51 = null;
        fuzzTest49.FuzzTest_remove(trie50, trie51, "", false);
        naturalness.mut_001.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_remove(trie55, trie56, "", false);
        naturalness.mut_001.Trie trie60 = null;
        fuzzTest28.FuzzTest_remove(trie55, trie60, "seed1", true);
        naturalness.mut_001.Trie trie64 = null;
        fuzzTest22.FuzzTest_remove(trie55, trie64, "old1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie7, trie55, "seed1", false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie4 = null;
        naturalness.mut_001.Trie trie5 = null;
        fuzzTest3.FuzzTest_remove(trie4, trie5, "", false);
        naturalness.mut_001.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_remove(trie9, trie10, "", false);
        fuzzTest1.FuzzTest_remove(trie2, trie9, "hi!", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie18 = null;
        naturalness.mut_001.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.mut_001.Trie trie23 = null;
        naturalness.mut_001.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "old0", true);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie29 = null;
        naturalness.mut_001.Trie trie30 = null;
        fuzzTest28.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.mut_001.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(trie34, trie35, "", false);
        naturalness.mut_001.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie35, trie39, "old0", false);
        naturalness.mut_001.Trie trie43 = null;
        naturalness.mut_001.Trie trie44 = null;
        fuzzTest17.FuzzTest_remove(trie43, trie44, "", false);
        naturalness.mut_001.Trie trie48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie50 = null;
        naturalness.mut_001.Trie trie51 = null;
        fuzzTest49.FuzzTest_remove(trie50, trie51, "", false);
        naturalness.mut_001.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie57 = null;
        naturalness.mut_001.Trie trie58 = null;
        fuzzTest56.FuzzTest_remove(trie57, trie58, "", false);
        naturalness.mut_001.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_remove(trie62, trie63, "", false);
        fuzzTest49.FuzzTest_remove(trie55, trie63, "hi!", false);
        fuzzTest17.FuzzTest_remove(trie48, trie55, "seed0", false);
        naturalness.mut_001.Trie trie73 = null;
        fuzzTest1.FuzzTest_remove(trie55, trie73, "hi!", true);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie78 = null;
        naturalness.mut_001.Trie trie79 = null;
        fuzzTest77.FuzzTest_remove(trie78, trie79, "", false);
        naturalness.mut_001.Trie trie83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_remove(trie83, trie84, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie55, trie83, "seed0", true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = null;
        naturalness.mut_001.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_001.Trie trie6 = null;
        naturalness.mut_001.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie12 = null;
        naturalness.mut_001.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.mut_001.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "", false);
        naturalness.mut_001.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie18, trie22, "old0", false);
        naturalness.mut_001.Trie trie26 = null;
        naturalness.mut_001.Trie trie27 = null;
        fuzzTest0.FuzzTest_remove(trie26, trie27, "", false);
        naturalness.mut_001.Trie trie31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie33 = null;
        naturalness.mut_001.Trie trie34 = null;
        fuzzTest32.FuzzTest_remove(trie33, trie34, "", false);
        naturalness.mut_001.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie40 = null;
        naturalness.mut_001.Trie trie41 = null;
        fuzzTest39.FuzzTest_remove(trie40, trie41, "", false);
        naturalness.mut_001.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_remove(trie45, trie46, "", false);
        fuzzTest32.FuzzTest_remove(trie38, trie46, "hi!", false);
        fuzzTest0.FuzzTest_remove(trie31, trie38, "seed0", false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie59 = null;
        naturalness.mut_001.Trie trie60 = null;
        fuzzTest58.FuzzTest_remove(trie59, trie60, "", false);
        naturalness.mut_001.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_remove(trie64, trie65, "", false);
        fuzzTest56.FuzzTest_remove(trie57, trie64, "hi!", false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie73 = null;
        naturalness.mut_001.Trie trie74 = null;
        fuzzTest72.FuzzTest_remove(trie73, trie74, "", false);
        naturalness.mut_001.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie80 = null;
        naturalness.mut_001.Trie trie81 = null;
        fuzzTest79.FuzzTest_remove(trie80, trie81, "", false);
        naturalness.mut_001.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_remove(trie85, trie86, "", false);
        fuzzTest72.FuzzTest_remove(trie78, trie86, "hi!", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie57, trie78, "seed2", false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie3 = null;
        naturalness.mut_001.Trie trie4 = null;
        fuzzTest2.FuzzTest_remove(trie3, trie4, "", false);
        naturalness.mut_001.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_remove(trie8, trie9, "", false);
        fuzzTest0.FuzzTest_remove(trie1, trie8, "hi!", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie18 = null;
        naturalness.mut_001.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.mut_001.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie25 = null;
        naturalness.mut_001.Trie trie26 = null;
        fuzzTest24.FuzzTest_remove(trie25, trie26, "", false);
        naturalness.mut_001.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_remove(trie30, trie31, "", false);
        fuzzTest17.FuzzTest_remove(trie23, trie31, "hi!", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie39 = null;
        naturalness.mut_001.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.mut_001.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie44, trie45, "", false);
        fuzzTest16.FuzzTest_remove(trie23, trie44, "old1", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie55 = null;
        naturalness.mut_001.Trie trie56 = null;
        fuzzTest54.FuzzTest_remove(trie55, trie56, "", false);
        naturalness.mut_001.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_remove(trie60, trie61, "", false);
        fuzzTest52.FuzzTest_remove(trie53, trie60, "hi!", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie23, trie60, "seed2", false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = null;
        naturalness.mut_001.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_001.Trie trie6 = null;
        naturalness.mut_001.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie12 = null;
        naturalness.mut_001.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.mut_001.Trie trie17 = null;
        naturalness.mut_001.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        naturalness.mut_001.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie18, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie28 = null;
        naturalness.mut_001.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.mut_001.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie35 = null;
        naturalness.mut_001.Trie trie36 = null;
        fuzzTest34.FuzzTest_remove(trie35, trie36, "", false);
        naturalness.mut_001.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_remove(trie40, trie41, "", false);
        fuzzTest27.FuzzTest_remove(trie33, trie41, "hi!", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie49 = null;
        naturalness.mut_001.Trie trie50 = null;
        fuzzTest48.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.mut_001.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(trie54, trie55, "", false);
        fuzzTest26.FuzzTest_remove(trie33, trie54, "old1", false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie63 = null;
        naturalness.mut_001.Trie trie64 = null;
        fuzzTest62.FuzzTest_remove(trie63, trie64, "", false);
        naturalness.mut_001.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_remove(trie68, trie69, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie33, trie69, "seed0", false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie2 = null;
        naturalness.mut_001.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.mut_001.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie9 = null;
        naturalness.mut_001.Trie trie10 = null;
        fuzzTest8.FuzzTest_remove(trie9, trie10, "", false);
        naturalness.mut_001.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_remove(trie14, trie15, "", false);
        fuzzTest1.FuzzTest_remove(trie7, trie15, "hi!", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie23 = null;
        naturalness.mut_001.Trie trie24 = null;
        fuzzTest22.FuzzTest_remove(trie23, trie24, "", false);
        naturalness.mut_001.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie30 = null;
        naturalness.mut_001.Trie trie31 = null;
        fuzzTest29.FuzzTest_remove(trie30, trie31, "", false);
        naturalness.mut_001.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_remove(trie35, trie36, "", false);
        fuzzTest22.FuzzTest_remove(trie28, trie36, "hi!", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie44 = null;
        naturalness.mut_001.Trie trie45 = null;
        fuzzTest43.FuzzTest_remove(trie44, trie45, "", false);
        naturalness.mut_001.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie51 = null;
        naturalness.mut_001.Trie trie52 = null;
        fuzzTest50.FuzzTest_remove(trie51, trie52, "", false);
        naturalness.mut_001.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_remove(trie56, trie57, "", false);
        fuzzTest43.FuzzTest_remove(trie49, trie57, "hi!", false);
        fuzzTest1.FuzzTest_remove(trie28, trie57, "old0", true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie70 = null;
        naturalness.mut_001.Trie trie71 = null;
        fuzzTest69.FuzzTest_remove(trie70, trie71, "", false);
        naturalness.mut_001.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_remove(trie75, trie76, "", false);
        fuzzTest67.FuzzTest_remove(trie68, trie75, "hi!", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie28, trie68, "seed2", true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = null;
        naturalness.mut_001.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_001.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie8 = null;
        naturalness.mut_001.Trie trie9 = null;
        fuzzTest7.FuzzTest_remove(trie8, trie9, "", false);
        naturalness.mut_001.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_remove(trie13, trie14, "", false);
        fuzzTest0.FuzzTest_remove(trie6, trie14, "hi!", false);
        naturalness.mut_001.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie21, trie22, "seed2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie27 = null;
        naturalness.mut_001.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        naturalness.mut_001.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_remove(trie32, trie33, "", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie39 = null;
        naturalness.mut_001.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.mut_001.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie46 = null;
        naturalness.mut_001.Trie trie47 = null;
        fuzzTest45.FuzzTest_remove(trie46, trie47, "", false);
        naturalness.mut_001.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_remove(trie51, trie52, "", false);
        fuzzTest38.FuzzTest_remove(trie44, trie52, "hi!", false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie60 = null;
        naturalness.mut_001.Trie trie61 = null;
        fuzzTest59.FuzzTest_remove(trie60, trie61, "", false);
        naturalness.mut_001.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_remove(trie65, trie66, "", false);
        fuzzTest37.FuzzTest_remove(trie44, trie65, "old1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie32, trie65, "seed0", true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = null;
        naturalness.mut_001.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie7 = null;
        naturalness.mut_001.Trie trie8 = null;
        fuzzTest6.FuzzTest_remove(trie7, trie8, "", false);
        naturalness.mut_001.Trie trie12 = null;
        naturalness.mut_001.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie18 = null;
        naturalness.mut_001.Trie trie19 = null;
        fuzzTest17.FuzzTest_remove(trie18, trie19, "", false);
        naturalness.mut_001.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(trie23, trie24, "", false);
        fuzzTest0.FuzzTest_remove(trie12, trie24, "hi!", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie32 = null;
        naturalness.mut_001.Trie trie33 = null;
        fuzzTest31.FuzzTest_remove(trie32, trie33, "", false);
        naturalness.mut_001.Trie trie37 = null;
        naturalness.mut_001.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_remove(trie37, trie38, "old0", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie43 = null;
        naturalness.mut_001.Trie trie44 = null;
        fuzzTest42.FuzzTest_remove(trie43, trie44, "", false);
        naturalness.mut_001.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_remove(trie48, trie49, "", false);
        naturalness.mut_001.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_remove(trie49, trie53, "old0", false);
        naturalness.mut_001.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie53, trie57, "old2", false);
        naturalness.mut_001.Trie trie61 = null;
        naturalness.mut_001.Trie trie62 = null;
        fuzzTest0.FuzzTest_remove(trie61, trie62, "seed1", false);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie69 = null;
        naturalness.mut_001.Trie trie70 = null;
        fuzzTest68.FuzzTest_remove(trie69, trie70, "", false);
        naturalness.mut_001.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_remove(trie74, trie75, "", false);
        fuzzTest66.FuzzTest_remove(trie67, trie74, "hi!", false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie83 = null;
        naturalness.mut_001.Trie trie84 = null;
        fuzzTest82.FuzzTest_remove(trie83, trie84, "", false);
        naturalness.mut_001.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_remove(trie88, trie89, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie67, trie89, "seed1", false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = null;
        naturalness.mut_001.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_001.Trie trie6 = null;
        naturalness.mut_001.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie12 = null;
        naturalness.mut_001.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.mut_001.Trie trie17 = null;
        naturalness.mut_001.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "old0", true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie23 = null;
        naturalness.mut_001.Trie trie24 = null;
        fuzzTest22.FuzzTest_remove(trie23, trie24, "", false);
        naturalness.mut_001.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.mut_001.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie29, trie33, "old0", false);
        naturalness.mut_001.Trie trie37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie39 = null;
        naturalness.mut_001.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.mut_001.Trie trie44 = null;
        naturalness.mut_001.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie44, trie45, "old0", true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie50 = null;
        naturalness.mut_001.Trie trie51 = null;
        fuzzTest49.FuzzTest_remove(trie50, trie51, "", false);
        naturalness.mut_001.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_remove(trie55, trie56, "", false);
        naturalness.mut_001.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie56, trie60, "old0", false);
        fuzzTest11.FuzzTest_remove(trie37, trie60, "hi!", false);
        naturalness.mut_001.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie68 = null;
        fuzzTest11.FuzzTest_remove(trie67, trie68, "seed1", true);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie73 = null;
        naturalness.mut_001.Trie trie74 = null;
        fuzzTest72.FuzzTest_remove(trie73, trie74, "", false);
        naturalness.mut_001.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_remove(trie78, trie79, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie67, trie78, "seed2", true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = null;
        naturalness.mut_001.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_001.Trie trie6 = null;
        naturalness.mut_001.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "old0", true);
        naturalness.mut_001.Trie trie11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie13 = null;
        naturalness.mut_001.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.mut_001.Trie trie18 = null;
        naturalness.mut_001.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie18, trie19, "old0", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie24 = null;
        naturalness.mut_001.Trie trie25 = null;
        fuzzTest23.FuzzTest_remove(trie24, trie25, "", false);
        naturalness.mut_001.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie29, trie30, "", false);
        naturalness.mut_001.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_remove(trie30, trie34, "old0", false);
        fuzzTest0.FuzzTest_remove(trie11, trie34, "seed1", false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie42 = null;
        naturalness.mut_001.Trie trie43 = null;
        fuzzTest41.FuzzTest_remove(trie42, trie43, "", false);
        naturalness.mut_001.Trie trie47 = null;
        naturalness.mut_001.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_remove(trie47, trie48, "old0", true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie54 = null;
        naturalness.mut_001.Trie trie55 = null;
        fuzzTest53.FuzzTest_remove(trie54, trie55, "", false);
        naturalness.mut_001.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie61 = null;
        naturalness.mut_001.Trie trie62 = null;
        fuzzTest60.FuzzTest_remove(trie61, trie62, "", false);
        naturalness.mut_001.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_remove(trie66, trie67, "", false);
        fuzzTest53.FuzzTest_remove(trie59, trie67, "hi!", false);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie75 = null;
        naturalness.mut_001.Trie trie76 = null;
        fuzzTest74.FuzzTest_remove(trie75, trie76, "", false);
        naturalness.mut_001.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_remove(trie80, trie81, "", false);
        fuzzTest52.FuzzTest_remove(trie59, trie80, "old1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie48, trie59, "seed2", false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie2 = null;
        naturalness.mut_001.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.mut_001.Trie trie7 = null;
        naturalness.mut_001.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "old0", true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie13 = null;
        naturalness.mut_001.Trie trie14 = null;
        fuzzTest12.FuzzTest_remove(trie13, trie14, "", false);
        naturalness.mut_001.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie20 = null;
        naturalness.mut_001.Trie trie21 = null;
        fuzzTest19.FuzzTest_remove(trie20, trie21, "", false);
        naturalness.mut_001.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_remove(trie25, trie26, "", false);
        fuzzTest12.FuzzTest_remove(trie18, trie26, "hi!", false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie34 = null;
        naturalness.mut_001.Trie trie35 = null;
        fuzzTest33.FuzzTest_remove(trie34, trie35, "", false);
        naturalness.mut_001.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.mut_001.Trie trie44 = null;
        fuzzTest12.FuzzTest_remove(trie39, trie44, "seed1", true);
        fuzzTest0.FuzzTest_remove(trie8, trie44, "old0", false);
        naturalness.mut_001.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie54 = null;
        naturalness.mut_001.Trie trie55 = null;
        fuzzTest53.FuzzTest_remove(trie54, trie55, "", false);
        naturalness.mut_001.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie61 = null;
        naturalness.mut_001.Trie trie62 = null;
        fuzzTest60.FuzzTest_remove(trie61, trie62, "", false);
        naturalness.mut_001.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_remove(trie66, trie67, "", false);
        fuzzTest53.FuzzTest_remove(trie59, trie67, "hi!", false);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie75 = null;
        naturalness.mut_001.Trie trie76 = null;
        fuzzTest74.FuzzTest_remove(trie75, trie76, "", false);
        naturalness.mut_001.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_remove(trie80, trie81, "", false);
        fuzzTest52.FuzzTest_remove(trie59, trie80, "old1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie51, trie80, "seed0", false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = null;
        naturalness.mut_001.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_001.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie8 = null;
        naturalness.mut_001.Trie trie9 = null;
        fuzzTest7.FuzzTest_remove(trie8, trie9, "", false);
        naturalness.mut_001.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_remove(trie13, trie14, "", false);
        fuzzTest0.FuzzTest_remove(trie6, trie14, "hi!", false);
        naturalness.mut_001.Trie trie21 = null;
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie24 = null;
        naturalness.mut_001.Trie trie25 = null;
        fuzzTest23.FuzzTest_remove(trie24, trie25, "", false);
        naturalness.mut_001.Trie trie29 = null;
        naturalness.mut_001.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie29, trie30, "old0", true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie35 = null;
        naturalness.mut_001.Trie trie36 = null;
        fuzzTest34.FuzzTest_remove(trie35, trie36, "", false);
        naturalness.mut_001.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_remove(trie40, trie41, "", false);
        naturalness.mut_001.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(trie41, trie45, "old0", false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie50 = null;
        naturalness.mut_001.Trie trie51 = null;
        fuzzTest49.FuzzTest_remove(trie50, trie51, "", false);
        naturalness.mut_001.Trie trie55 = null;
        naturalness.mut_001.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_remove(trie55, trie56, "old0", true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie61 = null;
        naturalness.mut_001.Trie trie62 = null;
        fuzzTest60.FuzzTest_remove(trie61, trie62, "", false);
        naturalness.mut_001.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_remove(trie66, trie67, "", false);
        naturalness.mut_001.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_remove(trie67, trie71, "old0", false);
        fuzzTest22.FuzzTest_remove(trie41, trie67, "seed0", false);
        fuzzTest0.FuzzTest_remove(trie21, trie41, "seed0", true);
        naturalness.mut_001.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie81, trie82, "seed1", false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = null;
        naturalness.mut_001.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_001.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie8 = null;
        naturalness.mut_001.Trie trie9 = null;
        fuzzTest7.FuzzTest_remove(trie8, trie9, "", false);
        naturalness.mut_001.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_remove(trie13, trie14, "", false);
        fuzzTest0.FuzzTest_remove(trie6, trie14, "hi!", false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie22 = null;
        naturalness.mut_001.Trie trie23 = null;
        fuzzTest21.FuzzTest_remove(trie22, trie23, "", false);
        naturalness.mut_001.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_remove(trie27, trie28, "", false);
        naturalness.mut_001.Trie trie32 = null;
        fuzzTest0.FuzzTest_remove(trie27, trie32, "seed1", true);
        naturalness.mut_001.Trie trie36 = null;
        naturalness.mut_001.Trie trie37 = null;
        fuzzTest0.FuzzTest_remove(trie36, trie37, "old2", false);
        naturalness.mut_001.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie45 = null;
        naturalness.mut_001.Trie trie46 = null;
        fuzzTest44.FuzzTest_remove(trie45, trie46, "", false);
        naturalness.mut_001.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_remove(trie50, trie51, "", false);
        fuzzTest42.FuzzTest_remove(trie43, trie50, "hi!", false);
        naturalness.mut_001.Trie trie58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie60 = null;
        naturalness.mut_001.Trie trie61 = null;
        fuzzTest59.FuzzTest_remove(trie60, trie61, "", false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie66 = null;
        naturalness.mut_001.Trie trie67 = null;
        fuzzTest65.FuzzTest_remove(trie66, trie67, "", false);
        naturalness.mut_001.Trie trie71 = null;
        naturalness.mut_001.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_remove(trie71, trie72, "old0", true);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie77 = null;
        naturalness.mut_001.Trie trie78 = null;
        fuzzTest76.FuzzTest_remove(trie77, trie78, "", false);
        naturalness.mut_001.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_remove(trie82, trie83, "", false);
        fuzzTest59.FuzzTest_remove(trie71, trie83, "hi!", true);
        fuzzTest42.FuzzTest_remove(trie58, trie83, "seed2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie41, trie83, "seed0", false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie3 = null;
        naturalness.mut_001.Trie trie4 = null;
        fuzzTest2.FuzzTest_remove(trie3, trie4, "", false);
        naturalness.mut_001.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_remove(trie8, trie9, "", false);
        fuzzTest0.FuzzTest_remove(trie1, trie8, "hi!", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie17 = null;
        naturalness.mut_001.Trie trie18 = null;
        fuzzTest16.FuzzTest_remove(trie17, trie18, "", false);
        naturalness.mut_001.Trie trie22 = null;
        naturalness.mut_001.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_remove(trie22, trie23, "old0", true);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie28 = null;
        naturalness.mut_001.Trie trie29 = null;
        fuzzTest27.FuzzTest_remove(trie28, trie29, "", false);
        naturalness.mut_001.Trie trie33 = null;
        naturalness.mut_001.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie33, trie34, "old0", true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie39 = null;
        naturalness.mut_001.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.mut_001.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie44, trie45, "", false);
        naturalness.mut_001.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(trie45, trie49, "old0", false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie54 = null;
        naturalness.mut_001.Trie trie55 = null;
        fuzzTest53.FuzzTest_remove(trie54, trie55, "", false);
        naturalness.mut_001.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_remove(trie59, trie60, "", false);
        fuzzTest16.FuzzTest_remove(trie45, trie60, "seed1", false);
        naturalness.mut_001.Trie trie67 = null;
        fuzzTest0.FuzzTest_remove(trie45, trie67, "old0", false);
        naturalness.mut_001.Trie trie71 = null;
        naturalness.mut_001.Trie trie72 = null;
        fuzzTest0.FuzzTest_remove(trie71, trie72, "seed0", true);
        naturalness.mut_001.Trie trie76 = null;
        naturalness.mut_001.Trie trie77 = null;
        fuzzTest0.FuzzTest_remove(trie76, trie77, "seed2", true);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie82 = null;
        naturalness.mut_001.Trie trie83 = null;
        fuzzTest81.FuzzTest_remove(trie82, trie83, "", false);
        naturalness.mut_001.Trie trie87 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_remove(trie87, trie88, "", false);
        naturalness.mut_001.Trie trie92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie87, trie92, "seed1", false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie2 = null;
        naturalness.mut_001.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.mut_001.Trie trie7 = null;
        naturalness.mut_001.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "old0", true);
        naturalness.mut_001.Trie trie12 = null;
        fuzzTest0.FuzzTest_remove(trie7, trie12, "old0", true);
        naturalness.mut_001.Trie trie16 = null;
        naturalness.mut_001.Trie trie17 = null;
        fuzzTest0.FuzzTest_remove(trie16, trie17, "seed0", false);
        naturalness.mut_001.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie26 = null;
        naturalness.mut_001.Trie trie27 = null;
        fuzzTest25.FuzzTest_remove(trie26, trie27, "", false);
        naturalness.mut_001.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_remove(trie31, trie32, "", false);
        fuzzTest23.FuzzTest_remove(trie24, trie31, "hi!", false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie40 = null;
        naturalness.mut_001.Trie trie41 = null;
        fuzzTest39.FuzzTest_remove(trie40, trie41, "", false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie46 = null;
        naturalness.mut_001.Trie trie47 = null;
        fuzzTest45.FuzzTest_remove(trie46, trie47, "", false);
        naturalness.mut_001.Trie trie51 = null;
        naturalness.mut_001.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_remove(trie51, trie52, "old0", true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie57 = null;
        naturalness.mut_001.Trie trie58 = null;
        fuzzTest56.FuzzTest_remove(trie57, trie58, "", false);
        naturalness.mut_001.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_remove(trie62, trie63, "", false);
        naturalness.mut_001.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_remove(trie63, trie67, "old0", false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie72 = null;
        naturalness.mut_001.Trie trie73 = null;
        fuzzTest71.FuzzTest_remove(trie72, trie73, "", false);
        naturalness.mut_001.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_remove(trie77, trie78, "", false);
        fuzzTest39.FuzzTest_remove(trie67, trie78, "seed2", false);
        fuzzTest22.FuzzTest_remove(trie31, trie67, "old1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie21, trie67, "seed1", true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = null;
        naturalness.mut_001.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_001.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(trie6, trie7, "", false);
        naturalness.mut_001.Trie trie11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie14 = null;
        naturalness.mut_001.Trie trie15 = null;
        fuzzTest13.FuzzTest_remove(trie14, trie15, "", false);
        naturalness.mut_001.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_remove(trie19, trie20, "", false);
        naturalness.mut_001.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie26 = null;
        naturalness.mut_001.Trie trie27 = null;
        fuzzTest25.FuzzTest_remove(trie26, trie27, "", false);
        naturalness.mut_001.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie33 = null;
        naturalness.mut_001.Trie trie34 = null;
        fuzzTest32.FuzzTest_remove(trie33, trie34, "", false);
        naturalness.mut_001.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_remove(trie38, trie39, "", false);
        fuzzTest25.FuzzTest_remove(trie31, trie39, "hi!", false);
        fuzzTest13.FuzzTest_remove(trie24, trie39, "", true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie51 = null;
        naturalness.mut_001.Trie trie52 = null;
        fuzzTest50.FuzzTest_remove(trie51, trie52, "", false);
        naturalness.mut_001.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie58 = null;
        naturalness.mut_001.Trie trie59 = null;
        fuzzTest57.FuzzTest_remove(trie58, trie59, "", false);
        naturalness.mut_001.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_remove(trie63, trie64, "", false);
        fuzzTest50.FuzzTest_remove(trie56, trie64, "hi!", false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie72 = null;
        naturalness.mut_001.Trie trie73 = null;
        fuzzTest71.FuzzTest_remove(trie72, trie73, "", false);
        naturalness.mut_001.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_remove(trie77, trie78, "", false);
        fuzzTest49.FuzzTest_remove(trie56, trie77, "old1", false);
        fuzzTest12.FuzzTest_remove(trie39, trie56, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie11, trie39, "seed1", true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie2 = null;
        naturalness.mut_001.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.mut_001.Trie trie7 = null;
        naturalness.mut_001.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "old0", true);
        naturalness.mut_001.Trie trie12 = null;
        fuzzTest0.FuzzTest_remove(trie7, trie12, "old0", true);
        naturalness.mut_001.Trie trie16 = null;
        naturalness.mut_001.Trie trie17 = null;
        fuzzTest0.FuzzTest_remove(trie16, trie17, "seed0", false);
        naturalness.mut_001.Trie trie21 = null;
        naturalness.mut_001.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie21, trie22, "old0", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie27 = null;
        naturalness.mut_001.Trie trie28 = null;
        fuzzTest26.FuzzTest_remove(trie27, trie28, "", false);
        naturalness.mut_001.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie34 = null;
        naturalness.mut_001.Trie trie35 = null;
        fuzzTest33.FuzzTest_remove(trie34, trie35, "", false);
        naturalness.mut_001.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_remove(trie39, trie40, "", false);
        fuzzTest26.FuzzTest_remove(trie32, trie40, "hi!", false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie48 = null;
        naturalness.mut_001.Trie trie49 = null;
        fuzzTest47.FuzzTest_remove(trie48, trie49, "", false);
        naturalness.mut_001.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_remove(trie53, trie54, "", false);
        naturalness.mut_001.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie60 = null;
        naturalness.mut_001.Trie trie61 = null;
        fuzzTest59.FuzzTest_remove(trie60, trie61, "", false);
        naturalness.mut_001.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie67 = null;
        naturalness.mut_001.Trie trie68 = null;
        fuzzTest66.FuzzTest_remove(trie67, trie68, "", false);
        naturalness.mut_001.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_remove(trie72, trie73, "", false);
        fuzzTest59.FuzzTest_remove(trie65, trie73, "hi!", false);
        fuzzTest47.FuzzTest_remove(trie58, trie73, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie32, trie58, "seed2", false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie2 = null;
        naturalness.mut_001.Trie trie3 = null;
        fuzzTest1.FuzzTest_remove(trie2, trie3, "", false);
        naturalness.mut_001.Trie trie7 = null;
        naturalness.mut_001.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(trie7, trie8, "old0", true);
        naturalness.mut_001.Trie trie12 = null;
        fuzzTest0.FuzzTest_remove(trie7, trie12, "old0", true);
        naturalness.mut_001.Trie trie16 = null;
        naturalness.mut_001.Trie trie17 = null;
        fuzzTest0.FuzzTest_remove(trie16, trie17, "seed0", false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie22 = null;
        naturalness.mut_001.Trie trie23 = null;
        fuzzTest21.FuzzTest_remove(trie22, trie23, "", false);
        naturalness.mut_001.Trie trie27 = null;
        naturalness.mut_001.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_remove(trie27, trie28, "old0", true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie33 = null;
        naturalness.mut_001.Trie trie34 = null;
        fuzzTest32.FuzzTest_remove(trie33, trie34, "", false);
        naturalness.mut_001.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_remove(trie38, trie39, "", false);
        naturalness.mut_001.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_remove(trie39, trie43, "old0", false);
        naturalness.mut_001.Trie trie47 = null;
        naturalness.mut_001.Trie trie48 = null;
        fuzzTest21.FuzzTest_remove(trie47, trie48, "", false);
        naturalness.mut_001.Trie trie52 = null;
        naturalness.mut_001.Trie trie53 = null;
        fuzzTest21.FuzzTest_remove(trie52, trie53, "old1", false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie58 = null;
        naturalness.mut_001.Trie trie59 = null;
        fuzzTest57.FuzzTest_remove(trie58, trie59, "", false);
        naturalness.mut_001.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_remove(trie63, trie64, "", false);
        naturalness.mut_001.Trie trie68 = null;
        fuzzTest21.FuzzTest_remove(trie63, trie68, "seed2", false);
        naturalness.mut_001.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie63, trie72, "seed0", true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = null;
        naturalness.mut_001.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_001.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie8 = null;
        naturalness.mut_001.Trie trie9 = null;
        fuzzTest7.FuzzTest_remove(trie8, trie9, "", false);
        naturalness.mut_001.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_remove(trie13, trie14, "", false);
        fuzzTest0.FuzzTest_remove(trie6, trie14, "hi!", false);
        naturalness.mut_001.Trie trie21 = null;
        naturalness.mut_001.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie21, trie22, "hi!", false);
        naturalness.mut_001.Trie trie26 = null;
        naturalness.mut_001.Trie trie27 = null;
        fuzzTest0.FuzzTest_remove(trie26, trie27, "hi!", false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie32 = null;
        naturalness.mut_001.Trie trie33 = null;
        fuzzTest31.FuzzTest_remove(trie32, trie33, "", false);
        naturalness.mut_001.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie39 = null;
        naturalness.mut_001.Trie trie40 = null;
        fuzzTest38.FuzzTest_remove(trie39, trie40, "", false);
        naturalness.mut_001.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_remove(trie44, trie45, "", false);
        fuzzTest31.FuzzTest_remove(trie37, trie45, "hi!", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie53 = null;
        naturalness.mut_001.Trie trie54 = null;
        fuzzTest52.FuzzTest_remove(trie53, trie54, "", false);
        naturalness.mut_001.Trie trie58 = null;
        naturalness.mut_001.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_remove(trie58, trie59, "old0", true);
        naturalness.mut_001.Trie trie63 = null;
        naturalness.mut_001.Trie trie64 = null;
        fuzzTest52.FuzzTest_remove(trie63, trie64, "old0", true);
        naturalness.mut_001.Trie trie68 = null;
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie70 = null;
        naturalness.mut_001.Trie trie71 = null;
        fuzzTest69.FuzzTest_remove(trie70, trie71, "", false);
        naturalness.mut_001.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie77 = null;
        naturalness.mut_001.Trie trie78 = null;
        fuzzTest76.FuzzTest_remove(trie77, trie78, "", false);
        naturalness.mut_001.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_remove(trie82, trie83, "", false);
        fuzzTest69.FuzzTest_remove(trie75, trie83, "hi!", false);
        fuzzTest52.FuzzTest_remove(trie68, trie75, "seed1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie37, trie75, "seed2", true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie1 = null;
        naturalness.mut_001.Trie trie2 = null;
        fuzzTest0.FuzzTest_remove(trie1, trie2, "", false);
        naturalness.mut_001.Trie trie6 = null;
        naturalness.mut_001.Trie trie7 = null;
        fuzzTest0.FuzzTest_remove(trie6, trie7, "seed0", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie12 = null;
        naturalness.mut_001.Trie trie13 = null;
        fuzzTest11.FuzzTest_remove(trie12, trie13, "", false);
        naturalness.mut_001.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(trie17, trie18, "", false);
        naturalness.mut_001.Trie trie22 = null;
        fuzzTest0.FuzzTest_remove(trie17, trie22, "old2", false);
        naturalness.mut_001.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie30 = null;
        naturalness.mut_001.Trie trie31 = null;
        fuzzTest29.FuzzTest_remove(trie30, trie31, "", false);
        naturalness.mut_001.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_remove(trie35, trie36, "", false);
        fuzzTest27.FuzzTest_remove(trie28, trie35, "hi!", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie44 = null;
        naturalness.mut_001.Trie trie45 = null;
        fuzzTest43.FuzzTest_remove(trie44, trie45, "", false);
        naturalness.mut_001.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(trie49, trie50, "", false);
        naturalness.mut_001.Trie trie54 = null;
        fuzzTest27.FuzzTest_remove(trie49, trie54, "old1", false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.mut_001.Trie trie59 = null;
        naturalness.mut_001.Trie trie60 = null;
        fuzzTest58.FuzzTest_remove(trie59, trie60, "", false);
        naturalness.mut_001.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_001.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_remove(trie64, trie65, "", false);
        naturalness.mut_001.Trie trie69 = null;
        fuzzTest27.FuzzTest_remove(trie65, trie69, "old2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(trie26, trie65, "seed2", true);
    }
}

