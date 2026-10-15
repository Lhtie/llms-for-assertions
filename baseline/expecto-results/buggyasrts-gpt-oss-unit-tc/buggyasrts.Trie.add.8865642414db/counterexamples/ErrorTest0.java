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
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie7 = null;
        buggyasrts.mut_050.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        buggyasrts.mut_050.Trie trie12 = null;
        buggyasrts.mut_050.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie18 = null;
        buggyasrts.mut_050.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        buggyasrts.mut_050.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie23, trie24, "", false);
        fuzzTest0.FuzzTest_add(trie12, trie24, "hi!", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie32 = null;
        buggyasrts.mut_050.Trie trie33 = null;
        fuzzTest31.FuzzTest_add(trie32, trie33, "", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie38 = null;
        buggyasrts.mut_050.Trie trie39 = null;
        fuzzTest37.FuzzTest_add(trie38, trie39, "", false);
        buggyasrts.mut_050.Trie trie43 = null;
        buggyasrts.mut_050.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(trie43, trie44, "old0", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie49 = null;
        buggyasrts.mut_050.Trie trie50 = null;
        fuzzTest48.FuzzTest_add(trie49, trie50, "", false);
        buggyasrts.mut_050.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie54, trie55, "", false);
        fuzzTest31.FuzzTest_add(trie43, trie55, "hi!", true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie63 = null;
        buggyasrts.mut_050.Trie trie64 = null;
        fuzzTest62.FuzzTest_add(trie63, trie64, "", false);
        buggyasrts.mut_050.Trie trie68 = null;
        buggyasrts.mut_050.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_add(trie68, trie69, "old0", true);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie74 = null;
        buggyasrts.mut_050.Trie trie75 = null;
        fuzzTest73.FuzzTest_add(trie74, trie75, "", false);
        buggyasrts.mut_050.Trie trie79 = null;
        buggyasrts.mut_050.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_add(trie79, trie80, "old0", true);
        buggyasrts.mut_050.Trie trie84 = null;
        fuzzTest62.FuzzTest_add(trie80, trie84, "old2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie55, trie80, "seed1", true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie7 = null;
        buggyasrts.mut_050.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        buggyasrts.mut_050.Trie trie12 = null;
        buggyasrts.mut_050.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie18 = null;
        buggyasrts.mut_050.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        buggyasrts.mut_050.Trie trie23 = null;
        buggyasrts.mut_050.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie23, trie24, "old0", true);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie29 = null;
        buggyasrts.mut_050.Trie trie30 = null;
        fuzzTest28.FuzzTest_add(trie29, trie30, "", false);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie35 = null;
        buggyasrts.mut_050.Trie trie36 = null;
        fuzzTest34.FuzzTest_add(trie35, trie36, "", false);
        buggyasrts.mut_050.Trie trie40 = null;
        buggyasrts.mut_050.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie40, trie41, "old0", true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie46 = null;
        buggyasrts.mut_050.Trie trie47 = null;
        fuzzTest45.FuzzTest_add(trie46, trie47, "", false);
        buggyasrts.mut_050.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(trie51, trie52, "", false);
        fuzzTest28.FuzzTest_add(trie40, trie52, "hi!", true);
        fuzzTest6.FuzzTest_add(trie24, trie52, "old0", false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie64 = null;
        buggyasrts.mut_050.Trie trie65 = null;
        fuzzTest63.FuzzTest_add(trie64, trie65, "", false);
        buggyasrts.mut_050.Trie trie69 = null;
        buggyasrts.mut_050.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie69, trie70, "old0", true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie75 = null;
        buggyasrts.mut_050.Trie trie76 = null;
        fuzzTest74.FuzzTest_add(trie75, trie76, "", false);
        buggyasrts.mut_050.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_add(trie80, trie81, "", false);
        fuzzTest62.FuzzTest_add(trie70, trie81, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie52, trie81, "old2", true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie2 = null;
        buggyasrts.mut_050.Trie trie3 = null;
        fuzzTest1.FuzzTest_add(trie2, trie3, "", false);
        buggyasrts.mut_050.Trie trie7 = null;
        buggyasrts.mut_050.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie7, trie8, "old0", true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie13 = null;
        buggyasrts.mut_050.Trie trie14 = null;
        fuzzTest12.FuzzTest_add(trie13, trie14, "", false);
        buggyasrts.mut_050.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie18, trie19, "", false);
        fuzzTest0.FuzzTest_add(trie8, trie19, "seed0", true);
        buggyasrts.mut_050.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie29 = null;
        buggyasrts.mut_050.Trie trie30 = null;
        fuzzTest28.FuzzTest_add(trie29, trie30, "", false);
        buggyasrts.mut_050.Trie trie34 = null;
        buggyasrts.mut_050.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_add(trie34, trie35, "old0", true);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie40 = null;
        buggyasrts.mut_050.Trie trie41 = null;
        fuzzTest39.FuzzTest_add(trie40, trie41, "", false);
        buggyasrts.mut_050.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie45, trie46, "", false);
        fuzzTest27.FuzzTest_add(trie35, trie46, "seed0", true);
        fuzzTest0.FuzzTest_add(trie26, trie46, "hi!", true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie57 = null;
        buggyasrts.mut_050.Trie trie58 = null;
        fuzzTest56.FuzzTest_add(trie57, trie58, "", false);
        buggyasrts.mut_050.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_add(trie62, trie63, "", false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie68 = null;
        buggyasrts.mut_050.Trie trie69 = null;
        fuzzTest67.FuzzTest_add(trie68, trie69, "", false);
        buggyasrts.mut_050.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_add(trie73, trie74, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie63, trie73, "seed1", true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie7 = null;
        buggyasrts.mut_050.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        buggyasrts.mut_050.Trie trie12 = null;
        buggyasrts.mut_050.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie18 = null;
        buggyasrts.mut_050.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        buggyasrts.mut_050.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie23, trie24, "", false);
        fuzzTest0.FuzzTest_add(trie12, trie24, "hi!", true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie32 = null;
        buggyasrts.mut_050.Trie trie33 = null;
        fuzzTest31.FuzzTest_add(trie32, trie33, "", false);
        buggyasrts.mut_050.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_add(trie37, trie38, "", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie43 = null;
        buggyasrts.mut_050.Trie trie44 = null;
        fuzzTest42.FuzzTest_add(trie43, trie44, "", false);
        buggyasrts.mut_050.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie48, trie49, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie38, trie48, "seed1", true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie10 = null;
        buggyasrts.mut_050.Trie trie11 = null;
        fuzzTest9.FuzzTest_add(trie10, trie11, "", false);
        buggyasrts.mut_050.Trie trie15 = null;
        buggyasrts.mut_050.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_add(trie15, trie16, "old0", true);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie21 = null;
        buggyasrts.mut_050.Trie trie22 = null;
        fuzzTest20.FuzzTest_add(trie21, trie22, "", false);
        buggyasrts.mut_050.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_add(trie26, trie27, "", false);
        fuzzTest8.FuzzTest_add(trie16, trie27, "seed0", true);
        fuzzTest6.FuzzTest_add(trie7, trie27, "seed1", false);
        buggyasrts.mut_050.Trie trie37 = null;
        fuzzTest0.FuzzTest_add(trie27, trie37, "old0", false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie43 = null;
        buggyasrts.mut_050.Trie trie44 = null;
        fuzzTest42.FuzzTest_add(trie43, trie44, "", false);
        buggyasrts.mut_050.Trie trie48 = null;
        buggyasrts.mut_050.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie48, trie49, "old0", true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie54 = null;
        buggyasrts.mut_050.Trie trie55 = null;
        fuzzTest53.FuzzTest_add(trie54, trie55, "", false);
        buggyasrts.mut_050.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie59, trie60, "", false);
        fuzzTest41.FuzzTest_add(trie49, trie60, "seed0", true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie69 = null;
        buggyasrts.mut_050.Trie trie70 = null;
        fuzzTest68.FuzzTest_add(trie69, trie70, "", false);
        buggyasrts.mut_050.Trie trie74 = null;
        buggyasrts.mut_050.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie74, trie75, "old0", true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie80 = null;
        buggyasrts.mut_050.Trie trie81 = null;
        fuzzTest79.FuzzTest_add(trie80, trie81, "", false);
        buggyasrts.mut_050.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie85, trie86, "", false);
        fuzzTest67.FuzzTest_add(trie75, trie86, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie49, trie86, "old0", true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggyasrts.mut_050.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie12 = null;
        buggyasrts.mut_050.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        buggyasrts.mut_050.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie17, trie18, "", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie23 = null;
        buggyasrts.mut_050.Trie trie24 = null;
        fuzzTest22.FuzzTest_add(trie23, trie24, "", false);
        buggyasrts.mut_050.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_add(trie28, trie29, "", false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie34 = null;
        buggyasrts.mut_050.Trie trie35 = null;
        fuzzTest33.FuzzTest_add(trie34, trie35, "", false);
        buggyasrts.mut_050.Trie trie39 = null;
        buggyasrts.mut_050.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie39, trie40, "old0", true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie45 = null;
        buggyasrts.mut_050.Trie trie46 = null;
        fuzzTest44.FuzzTest_add(trie45, trie46, "", false);
        buggyasrts.mut_050.Trie trie50 = null;
        buggyasrts.mut_050.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(trie50, trie51, "old0", true);
        buggyasrts.mut_050.Trie trie55 = null;
        fuzzTest33.FuzzTest_add(trie51, trie55, "old2", true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie60 = null;
        buggyasrts.mut_050.Trie trie61 = null;
        fuzzTest59.FuzzTest_add(trie60, trie61, "", false);
        buggyasrts.mut_050.Trie trie65 = null;
        buggyasrts.mut_050.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_add(trie65, trie66, "old0", true);
        buggyasrts.mut_050.Trie trie70 = null;
        fuzzTest33.FuzzTest_add(trie66, trie70, "", false);
        fuzzTest11.FuzzTest_add(trie29, trie66, "hi!", false);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie78 = null;
        buggyasrts.mut_050.Trie trie79 = null;
        fuzzTest77.FuzzTest_add(trie78, trie79, "", false);
        buggyasrts.mut_050.Trie trie83 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_add(trie83, trie84, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie29, trie83, "old1", true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggyasrts.mut_050.Trie trie6 = null;
        buggyasrts.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie12 = null;
        buggyasrts.mut_050.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        buggyasrts.mut_050.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie17, trie18, "", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie24 = null;
        buggyasrts.mut_050.Trie trie25 = null;
        fuzzTest23.FuzzTest_add(trie24, trie25, "", false);
        buggyasrts.mut_050.Trie trie29 = null;
        buggyasrts.mut_050.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie29, trie30, "old0", true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie35 = null;
        buggyasrts.mut_050.Trie trie36 = null;
        fuzzTest34.FuzzTest_add(trie35, trie36, "", false);
        buggyasrts.mut_050.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie40, trie41, "", false);
        fuzzTest22.FuzzTest_add(trie30, trie41, "seed0", true);
        fuzzTest0.FuzzTest_add(trie17, trie41, "seed0", true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie54 = null;
        buggyasrts.mut_050.Trie trie55 = null;
        fuzzTest53.FuzzTest_add(trie54, trie55, "", false);
        buggyasrts.mut_050.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie59, trie60, "", false);
        fuzzTest51.FuzzTest_add(trie52, trie60, "old2", false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie68 = null;
        buggyasrts.mut_050.Trie trie69 = null;
        fuzzTest67.FuzzTest_add(trie68, trie69, "", false);
        buggyasrts.mut_050.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_add(trie73, trie74, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie60, trie74, "old0", true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggyasrts.mut_050.Trie trie6 = null;
        buggyasrts.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie12 = null;
        buggyasrts.mut_050.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        buggyasrts.mut_050.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie17, trie18, "", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie23 = null;
        buggyasrts.mut_050.Trie trie24 = null;
        fuzzTest22.FuzzTest_add(trie23, trie24, "", false);
        buggyasrts.mut_050.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_add(trie28, trie29, "", false);
        buggyasrts.mut_050.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie28, trie33, "hi!", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie40 = null;
        buggyasrts.mut_050.Trie trie41 = null;
        fuzzTest39.FuzzTest_add(trie40, trie41, "", false);
        buggyasrts.mut_050.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie45, trie46, "", false);
        fuzzTest37.FuzzTest_add(trie38, trie46, "old2", false);
        buggyasrts.mut_050.Trie trie53 = null;
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie56 = null;
        buggyasrts.mut_050.Trie trie57 = null;
        fuzzTest55.FuzzTest_add(trie56, trie57, "", false);
        buggyasrts.mut_050.Trie trie61 = null;
        buggyasrts.mut_050.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_add(trie61, trie62, "old0", true);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie67 = null;
        buggyasrts.mut_050.Trie trie68 = null;
        fuzzTest66.FuzzTest_add(trie67, trie68, "", false);
        buggyasrts.mut_050.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_add(trie72, trie73, "", false);
        fuzzTest54.FuzzTest_add(trie62, trie73, "seed0", true);
        fuzzTest37.FuzzTest_add(trie53, trie62, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie28, trie62, "old1", true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie3 = null;
        buggyasrts.mut_050.Trie trie4 = null;
        fuzzTest2.FuzzTest_add(trie3, trie4, "", false);
        buggyasrts.mut_050.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie8, trie9, "", false);
        fuzzTest0.FuzzTest_add(trie1, trie9, "old2", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie19 = null;
        buggyasrts.mut_050.Trie trie20 = null;
        fuzzTest18.FuzzTest_add(trie19, trie20, "", false);
        buggyasrts.mut_050.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie24, trie25, "", false);
        fuzzTest16.FuzzTest_add(trie17, trie25, "old2", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie35 = null;
        buggyasrts.mut_050.Trie trie36 = null;
        fuzzTest34.FuzzTest_add(trie35, trie36, "", false);
        buggyasrts.mut_050.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie40, trie41, "", false);
        fuzzTest32.FuzzTest_add(trie33, trie41, "old2", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie51 = null;
        buggyasrts.mut_050.Trie trie52 = null;
        fuzzTest50.FuzzTest_add(trie51, trie52, "", false);
        buggyasrts.mut_050.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_add(trie56, trie57, "", false);
        fuzzTest48.FuzzTest_add(trie49, trie57, "old2", false);
        fuzzTest16.FuzzTest_add(trie33, trie57, "seed2", false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie69 = null;
        buggyasrts.mut_050.Trie trie70 = null;
        fuzzTest68.FuzzTest_add(trie69, trie70, "", false);
        buggyasrts.mut_050.Trie trie74 = null;
        buggyasrts.mut_050.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie74, trie75, "old0", true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie80 = null;
        buggyasrts.mut_050.Trie trie81 = null;
        fuzzTest79.FuzzTest_add(trie80, trie81, "", false);
        buggyasrts.mut_050.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie85, trie86, "", false);
        fuzzTest67.FuzzTest_add(trie75, trie86, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie33, trie86, "old0", true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie4 = null;
        buggyasrts.mut_050.Trie trie5 = null;
        fuzzTest3.FuzzTest_add(trie4, trie5, "", false);
        buggyasrts.mut_050.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_add(trie9, trie10, "", false);
        fuzzTest1.FuzzTest_add(trie2, trie10, "old2", false);
        buggyasrts.mut_050.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie19 = null;
        buggyasrts.mut_050.Trie trie20 = null;
        fuzzTest18.FuzzTest_add(trie19, trie20, "", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie25 = null;
        buggyasrts.mut_050.Trie trie26 = null;
        fuzzTest24.FuzzTest_add(trie25, trie26, "", false);
        buggyasrts.mut_050.Trie trie30 = null;
        buggyasrts.mut_050.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie30, trie31, "old0", true);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie36 = null;
        buggyasrts.mut_050.Trie trie37 = null;
        fuzzTest35.FuzzTest_add(trie36, trie37, "", false);
        buggyasrts.mut_050.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_add(trie41, trie42, "", false);
        fuzzTest18.FuzzTest_add(trie30, trie42, "hi!", true);
        fuzzTest1.FuzzTest_add(trie17, trie42, "old2", false);
        buggyasrts.mut_050.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie42, trie52, "seed0", true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie4 = null;
        buggyasrts.mut_050.Trie trie5 = null;
        fuzzTest3.FuzzTest_add(trie4, trie5, "", false);
        buggyasrts.mut_050.Trie trie9 = null;
        buggyasrts.mut_050.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_add(trie9, trie10, "old0", true);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie15 = null;
        buggyasrts.mut_050.Trie trie16 = null;
        fuzzTest14.FuzzTest_add(trie15, trie16, "", false);
        buggyasrts.mut_050.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie20, trie21, "", false);
        fuzzTest2.FuzzTest_add(trie10, trie21, "seed0", true);
        fuzzTest0.FuzzTest_add(trie1, trie21, "seed1", false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie32 = null;
        buggyasrts.mut_050.Trie trie33 = null;
        fuzzTest31.FuzzTest_add(trie32, trie33, "", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie38 = null;
        buggyasrts.mut_050.Trie trie39 = null;
        fuzzTest37.FuzzTest_add(trie38, trie39, "", false);
        buggyasrts.mut_050.Trie trie43 = null;
        buggyasrts.mut_050.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(trie43, trie44, "old0", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie49 = null;
        buggyasrts.mut_050.Trie trie50 = null;
        fuzzTest48.FuzzTest_add(trie49, trie50, "", false);
        buggyasrts.mut_050.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie54, trie55, "", false);
        fuzzTest31.FuzzTest_add(trie43, trie55, "hi!", true);
        buggyasrts.mut_050.Trie trie62 = null;
        fuzzTest0.FuzzTest_add(trie55, trie62, "old1", true);
        buggyasrts.mut_050.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie70 = null;
        buggyasrts.mut_050.Trie trie71 = null;
        fuzzTest69.FuzzTest_add(trie70, trie71, "", false);
        buggyasrts.mut_050.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_add(trie75, trie76, "", false);
        fuzzTest67.FuzzTest_add(trie68, trie76, "old2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie66, trie76, "old1", true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie4 = null;
        buggyasrts.mut_050.Trie trie5 = null;
        fuzzTest3.FuzzTest_add(trie4, trie5, "", false);
        buggyasrts.mut_050.Trie trie9 = null;
        buggyasrts.mut_050.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_add(trie9, trie10, "old0", true);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie15 = null;
        buggyasrts.mut_050.Trie trie16 = null;
        fuzzTest14.FuzzTest_add(trie15, trie16, "", false);
        buggyasrts.mut_050.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie20, trie21, "", false);
        fuzzTest2.FuzzTest_add(trie10, trie21, "seed0", true);
        fuzzTest0.FuzzTest_add(trie1, trie21, "seed1", false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie33 = null;
        buggyasrts.mut_050.Trie trie34 = null;
        fuzzTest32.FuzzTest_add(trie33, trie34, "", false);
        buggyasrts.mut_050.Trie trie38 = null;
        buggyasrts.mut_050.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie38, trie39, "old0", true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie44 = null;
        buggyasrts.mut_050.Trie trie45 = null;
        fuzzTest43.FuzzTest_add(trie44, trie45, "", false);
        buggyasrts.mut_050.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie49, trie50, "", false);
        fuzzTest31.FuzzTest_add(trie39, trie50, "seed0", true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie58 = null;
        buggyasrts.mut_050.Trie trie59 = null;
        fuzzTest57.FuzzTest_add(trie58, trie59, "", false);
        buggyasrts.mut_050.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(trie63, trie64, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie50, trie64, "old2", true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie3 = null;
        buggyasrts.mut_050.Trie trie4 = null;
        fuzzTest2.FuzzTest_add(trie3, trie4, "", false);
        buggyasrts.mut_050.Trie trie8 = null;
        buggyasrts.mut_050.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie8, trie9, "old0", true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie14 = null;
        buggyasrts.mut_050.Trie trie15 = null;
        fuzzTest13.FuzzTest_add(trie14, trie15, "", false);
        buggyasrts.mut_050.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie19, trie20, "", false);
        fuzzTest1.FuzzTest_add(trie9, trie20, "seed0", true);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie28 = null;
        buggyasrts.mut_050.Trie trie29 = null;
        fuzzTest27.FuzzTest_add(trie28, trie29, "", false);
        buggyasrts.mut_050.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_add(trie33, trie34, "", false);
        buggyasrts.mut_050.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie34, trie38, "old1", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie43 = null;
        buggyasrts.mut_050.Trie trie44 = null;
        fuzzTest42.FuzzTest_add(trie43, trie44, "", false);
        buggyasrts.mut_050.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie48, trie49, "", false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie55 = null;
        buggyasrts.mut_050.Trie trie56 = null;
        fuzzTest54.FuzzTest_add(trie55, trie56, "", false);
        buggyasrts.mut_050.Trie trie60 = null;
        buggyasrts.mut_050.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(trie60, trie61, "old0", true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie66 = null;
        buggyasrts.mut_050.Trie trie67 = null;
        fuzzTest65.FuzzTest_add(trie66, trie67, "", false);
        buggyasrts.mut_050.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_add(trie71, trie72, "", false);
        fuzzTest53.FuzzTest_add(trie61, trie72, "seed0", true);
        buggyasrts.mut_050.Trie trie79 = null;
        fuzzTest42.FuzzTest_add(trie61, trie79, "hi!", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie38, trie61, "old2", true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggyasrts.mut_050.Trie trie6 = null;
        buggyasrts.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie13 = null;
        buggyasrts.mut_050.Trie trie14 = null;
        fuzzTest12.FuzzTest_add(trie13, trie14, "", false);
        buggyasrts.mut_050.Trie trie18 = null;
        buggyasrts.mut_050.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie18, trie19, "old0", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie24 = null;
        buggyasrts.mut_050.Trie trie25 = null;
        fuzzTest23.FuzzTest_add(trie24, trie25, "", false);
        buggyasrts.mut_050.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie29, trie30, "", false);
        fuzzTest11.FuzzTest_add(trie19, trie30, "seed0", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie40 = null;
        buggyasrts.mut_050.Trie trie41 = null;
        fuzzTest39.FuzzTest_add(trie40, trie41, "", false);
        buggyasrts.mut_050.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie45, trie46, "", false);
        fuzzTest37.FuzzTest_add(trie38, trie46, "old2", false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie54 = null;
        buggyasrts.mut_050.Trie trie55 = null;
        fuzzTest53.FuzzTest_add(trie54, trie55, "", false);
        buggyasrts.mut_050.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie59, trie60, "", false);
        fuzzTest11.FuzzTest_add(trie46, trie60, "old2", false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie68 = null;
        buggyasrts.mut_050.Trie trie69 = null;
        fuzzTest67.FuzzTest_add(trie68, trie69, "", false);
        buggyasrts.mut_050.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_add(trie73, trie74, "", false);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie79 = null;
        buggyasrts.mut_050.Trie trie80 = null;
        fuzzTest78.FuzzTest_add(trie79, trie80, "", false);
        buggyasrts.mut_050.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_add(trie84, trie85, "", false);
        buggyasrts.mut_050.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_add(trie84, trie89, "hi!", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie60, trie84, "seed2", true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie2 = null;
        buggyasrts.mut_050.Trie trie3 = null;
        fuzzTest1.FuzzTest_add(trie2, trie3, "", false);
        buggyasrts.mut_050.Trie trie7 = null;
        buggyasrts.mut_050.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie7, trie8, "old0", true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie13 = null;
        buggyasrts.mut_050.Trie trie14 = null;
        fuzzTest12.FuzzTest_add(trie13, trie14, "", false);
        buggyasrts.mut_050.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie18, trie19, "", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie25 = null;
        buggyasrts.mut_050.Trie trie26 = null;
        fuzzTest24.FuzzTest_add(trie25, trie26, "", false);
        buggyasrts.mut_050.Trie trie30 = null;
        buggyasrts.mut_050.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie30, trie31, "old0", true);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie36 = null;
        buggyasrts.mut_050.Trie trie37 = null;
        fuzzTest35.FuzzTest_add(trie36, trie37, "", false);
        buggyasrts.mut_050.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_add(trie41, trie42, "", false);
        fuzzTest23.FuzzTest_add(trie31, trie42, "seed0", true);
        fuzzTest1.FuzzTest_add(trie18, trie42, "seed0", true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie53 = null;
        buggyasrts.mut_050.Trie trie54 = null;
        fuzzTest52.FuzzTest_add(trie53, trie54, "", false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie61 = null;
        buggyasrts.mut_050.Trie trie62 = null;
        fuzzTest60.FuzzTest_add(trie61, trie62, "", false);
        buggyasrts.mut_050.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_add(trie66, trie67, "", false);
        fuzzTest58.FuzzTest_add(trie59, trie67, "old2", false);
        buggyasrts.mut_050.Trie trie74 = null;
        fuzzTest52.FuzzTest_add(trie67, trie74, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie18, trie67, "old2", true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie3 = null;
        buggyasrts.mut_050.Trie trie4 = null;
        fuzzTest2.FuzzTest_add(trie3, trie4, "", false);
        buggyasrts.mut_050.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie8, trie9, "", false);
        fuzzTest0.FuzzTest_add(trie1, trie9, "old2", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie20 = null;
        buggyasrts.mut_050.Trie trie21 = null;
        fuzzTest19.FuzzTest_add(trie20, trie21, "", false);
        buggyasrts.mut_050.Trie trie25 = null;
        buggyasrts.mut_050.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(trie25, trie26, "old0", true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie31 = null;
        buggyasrts.mut_050.Trie trie32 = null;
        fuzzTest30.FuzzTest_add(trie31, trie32, "", false);
        buggyasrts.mut_050.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_add(trie36, trie37, "", false);
        fuzzTest18.FuzzTest_add(trie26, trie37, "seed0", true);
        fuzzTest16.FuzzTest_add(trie17, trie37, "seed1", false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie48 = null;
        buggyasrts.mut_050.Trie trie49 = null;
        fuzzTest47.FuzzTest_add(trie48, trie49, "", false);
        buggyasrts.mut_050.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie53, trie54, "", false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie59 = null;
        buggyasrts.mut_050.Trie trie60 = null;
        fuzzTest58.FuzzTest_add(trie59, trie60, "", false);
        buggyasrts.mut_050.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie64, trie65, "", false);
        buggyasrts.mut_050.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie64, trie69, "hi!", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie37, trie69, "old1", true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggyasrts.mut_050.Trie trie6 = null;
        buggyasrts.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie13 = null;
        buggyasrts.mut_050.Trie trie14 = null;
        fuzzTest12.FuzzTest_add(trie13, trie14, "", false);
        buggyasrts.mut_050.Trie trie18 = null;
        buggyasrts.mut_050.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie18, trie19, "old0", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie24 = null;
        buggyasrts.mut_050.Trie trie25 = null;
        fuzzTest23.FuzzTest_add(trie24, trie25, "", false);
        buggyasrts.mut_050.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie29, trie30, "", false);
        fuzzTest11.FuzzTest_add(trie19, trie30, "seed0", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie38 = null;
        buggyasrts.mut_050.Trie trie39 = null;
        fuzzTest37.FuzzTest_add(trie38, trie39, "", false);
        buggyasrts.mut_050.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(trie43, trie44, "", false);
        buggyasrts.mut_050.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie44, trie48, "old1", false);
        buggyasrts.mut_050.Trie trie52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie54 = null;
        buggyasrts.mut_050.Trie trie55 = null;
        fuzzTest53.FuzzTest_add(trie54, trie55, "", false);
        buggyasrts.mut_050.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie59, trie60, "", false);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie65 = null;
        buggyasrts.mut_050.Trie trie66 = null;
        fuzzTest64.FuzzTest_add(trie65, trie66, "", false);
        buggyasrts.mut_050.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_add(trie70, trie71, "", false);
        buggyasrts.mut_050.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie70, trie75, "hi!", false);
        fuzzTest11.FuzzTest_add(trie52, trie75, "hi!", true);
        buggyasrts.mut_050.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie75, trie82, "old0", true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggyasrts.mut_050.Trie trie6 = null;
        buggyasrts.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie13 = null;
        buggyasrts.mut_050.Trie trie14 = null;
        fuzzTest12.FuzzTest_add(trie13, trie14, "", false);
        buggyasrts.mut_050.Trie trie18 = null;
        buggyasrts.mut_050.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie18, trie19, "old0", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie24 = null;
        buggyasrts.mut_050.Trie trie25 = null;
        fuzzTest23.FuzzTest_add(trie24, trie25, "", false);
        buggyasrts.mut_050.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie29, trie30, "", false);
        fuzzTest11.FuzzTest_add(trie19, trie30, "seed0", true);
        buggyasrts.mut_050.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie40 = null;
        buggyasrts.mut_050.Trie trie41 = null;
        fuzzTest39.FuzzTest_add(trie40, trie41, "", false);
        buggyasrts.mut_050.Trie trie45 = null;
        buggyasrts.mut_050.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie45, trie46, "old0", true);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie51 = null;
        buggyasrts.mut_050.Trie trie52 = null;
        fuzzTest50.FuzzTest_add(trie51, trie52, "", false);
        buggyasrts.mut_050.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_add(trie56, trie57, "", false);
        fuzzTest38.FuzzTest_add(trie46, trie57, "seed0", true);
        fuzzTest11.FuzzTest_add(trie37, trie57, "hi!", true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie69 = null;
        buggyasrts.mut_050.Trie trie70 = null;
        fuzzTest68.FuzzTest_add(trie69, trie70, "", false);
        buggyasrts.mut_050.Trie trie74 = null;
        buggyasrts.mut_050.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie74, trie75, "old0", true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie80 = null;
        buggyasrts.mut_050.Trie trie81 = null;
        fuzzTest79.FuzzTest_add(trie80, trie81, "", false);
        buggyasrts.mut_050.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie85, trie86, "", false);
        fuzzTest67.FuzzTest_add(trie75, trie86, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie57, trie86, "old0", true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie3 = null;
        buggyasrts.mut_050.Trie trie4 = null;
        fuzzTest2.FuzzTest_add(trie3, trie4, "", false);
        buggyasrts.mut_050.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie8, trie9, "", false);
        fuzzTest0.FuzzTest_add(trie1, trie9, "old2", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie19 = null;
        buggyasrts.mut_050.Trie trie20 = null;
        fuzzTest18.FuzzTest_add(trie19, trie20, "", false);
        buggyasrts.mut_050.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie24, trie25, "", false);
        fuzzTest16.FuzzTest_add(trie17, trie25, "old2", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie35 = null;
        buggyasrts.mut_050.Trie trie36 = null;
        fuzzTest34.FuzzTest_add(trie35, trie36, "", false);
        buggyasrts.mut_050.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie40, trie41, "", false);
        fuzzTest32.FuzzTest_add(trie33, trie41, "old2", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie51 = null;
        buggyasrts.mut_050.Trie trie52 = null;
        fuzzTest50.FuzzTest_add(trie51, trie52, "", false);
        buggyasrts.mut_050.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_add(trie56, trie57, "", false);
        fuzzTest48.FuzzTest_add(trie49, trie57, "old2", false);
        fuzzTest16.FuzzTest_add(trie33, trie57, "seed2", false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie69 = null;
        buggyasrts.mut_050.Trie trie70 = null;
        fuzzTest68.FuzzTest_add(trie69, trie70, "", false);
        buggyasrts.mut_050.Trie trie74 = null;
        buggyasrts.mut_050.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie74, trie75, "old0", true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie80 = null;
        buggyasrts.mut_050.Trie trie81 = null;
        fuzzTest79.FuzzTest_add(trie80, trie81, "", false);
        buggyasrts.mut_050.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie85, trie86, "", false);
        fuzzTest67.FuzzTest_add(trie75, trie86, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie33, trie86, "old1", true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie4 = null;
        buggyasrts.mut_050.Trie trie5 = null;
        fuzzTest3.FuzzTest_add(trie4, trie5, "", false);
        buggyasrts.mut_050.Trie trie9 = null;
        buggyasrts.mut_050.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_add(trie9, trie10, "old0", true);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie15 = null;
        buggyasrts.mut_050.Trie trie16 = null;
        fuzzTest14.FuzzTest_add(trie15, trie16, "", false);
        buggyasrts.mut_050.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie20, trie21, "", false);
        fuzzTest2.FuzzTest_add(trie10, trie21, "seed0", true);
        fuzzTest0.FuzzTest_add(trie1, trie21, "old2", false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie32 = null;
        buggyasrts.mut_050.Trie trie33 = null;
        fuzzTest31.FuzzTest_add(trie32, trie33, "", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie38 = null;
        buggyasrts.mut_050.Trie trie39 = null;
        fuzzTest37.FuzzTest_add(trie38, trie39, "", false);
        buggyasrts.mut_050.Trie trie43 = null;
        buggyasrts.mut_050.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(trie43, trie44, "old0", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie49 = null;
        buggyasrts.mut_050.Trie trie50 = null;
        fuzzTest48.FuzzTest_add(trie49, trie50, "", false);
        buggyasrts.mut_050.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie54, trie55, "", false);
        fuzzTest31.FuzzTest_add(trie43, trie55, "hi!", true);
        buggyasrts.mut_050.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie55, trie62, "seed2", true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "seed0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie7 = null;
        buggyasrts.mut_050.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        buggyasrts.mut_050.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie18 = null;
        buggyasrts.mut_050.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        buggyasrts.mut_050.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie23, trie24, "", false);
        buggyasrts.mut_050.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie23, trie28, "hi!", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie33 = null;
        buggyasrts.mut_050.Trie trie34 = null;
        fuzzTest32.FuzzTest_add(trie33, trie34, "", false);
        buggyasrts.mut_050.Trie trie38 = null;
        buggyasrts.mut_050.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie38, trie39, "old0", true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie44 = null;
        buggyasrts.mut_050.Trie trie45 = null;
        fuzzTest43.FuzzTest_add(trie44, trie45, "", false);
        buggyasrts.mut_050.Trie trie49 = null;
        buggyasrts.mut_050.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie49, trie50, "old0", true);
        buggyasrts.mut_050.Trie trie54 = null;
        fuzzTest32.FuzzTest_add(trie50, trie54, "old2", true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie59 = null;
        buggyasrts.mut_050.Trie trie60 = null;
        fuzzTest58.FuzzTest_add(trie59, trie60, "", false);
        buggyasrts.mut_050.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie64, trie65, "", false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie72 = null;
        buggyasrts.mut_050.Trie trie73 = null;
        fuzzTest71.FuzzTest_add(trie72, trie73, "", false);
        buggyasrts.mut_050.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_add(trie77, trie78, "", false);
        fuzzTest69.FuzzTest_add(trie70, trie78, "old2", false);
        fuzzTest32.FuzzTest_add(trie64, trie78, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie28, trie78, "seed0", true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie10 = null;
        buggyasrts.mut_050.Trie trie11 = null;
        fuzzTest9.FuzzTest_add(trie10, trie11, "", false);
        buggyasrts.mut_050.Trie trie15 = null;
        buggyasrts.mut_050.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_add(trie15, trie16, "old0", true);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie21 = null;
        buggyasrts.mut_050.Trie trie22 = null;
        fuzzTest20.FuzzTest_add(trie21, trie22, "", false);
        buggyasrts.mut_050.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_add(trie26, trie27, "", false);
        fuzzTest8.FuzzTest_add(trie16, trie27, "seed0", true);
        fuzzTest6.FuzzTest_add(trie7, trie27, "seed1", false);
        buggyasrts.mut_050.Trie trie37 = null;
        fuzzTest0.FuzzTest_add(trie27, trie37, "old0", false);
        buggyasrts.mut_050.Trie trie41 = null;
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie43 = null;
        buggyasrts.mut_050.Trie trie44 = null;
        fuzzTest42.FuzzTest_add(trie43, trie44, "", false);
        buggyasrts.mut_050.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie48, trie49, "", false);
        fuzzTest0.FuzzTest_add(trie41, trie49, "hi!", true);
        buggyasrts.mut_050.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie61 = null;
        buggyasrts.mut_050.Trie trie62 = null;
        fuzzTest60.FuzzTest_add(trie61, trie62, "", false);
        buggyasrts.mut_050.Trie trie66 = null;
        buggyasrts.mut_050.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_add(trie66, trie67, "old0", true);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie72 = null;
        buggyasrts.mut_050.Trie trie73 = null;
        fuzzTest71.FuzzTest_add(trie72, trie73, "", false);
        buggyasrts.mut_050.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_add(trie77, trie78, "", false);
        fuzzTest59.FuzzTest_add(trie67, trie78, "seed0", true);
        fuzzTest57.FuzzTest_add(trie58, trie78, "seed1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie56, trie58, "old0", true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggyasrts.mut_050.Trie trie6 = null;
        buggyasrts.mut_050.Trie trie7 = null;
        fuzzTest0.FuzzTest_add(trie6, trie7, "hi!", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie14 = null;
        buggyasrts.mut_050.Trie trie15 = null;
        fuzzTest13.FuzzTest_add(trie14, trie15, "", false);
        buggyasrts.mut_050.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie19, trie20, "", false);
        fuzzTest11.FuzzTest_add(trie12, trie20, "old2", false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie30 = null;
        buggyasrts.mut_050.Trie trie31 = null;
        fuzzTest29.FuzzTest_add(trie30, trie31, "", false);
        buggyasrts.mut_050.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie35, trie36, "", false);
        fuzzTest27.FuzzTest_add(trie28, trie36, "old2", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie46 = null;
        buggyasrts.mut_050.Trie trie47 = null;
        fuzzTest45.FuzzTest_add(trie46, trie47, "", false);
        buggyasrts.mut_050.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(trie51, trie52, "", false);
        fuzzTest43.FuzzTest_add(trie44, trie52, "old2", false);
        fuzzTest11.FuzzTest_add(trie28, trie52, "seed2", false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie65 = null;
        buggyasrts.mut_050.Trie trie66 = null;
        fuzzTest64.FuzzTest_add(trie65, trie66, "", false);
        buggyasrts.mut_050.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_add(trie70, trie71, "", false);
        fuzzTest62.FuzzTest_add(trie63, trie71, "old2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie28, trie71, "old0", true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggyasrts.mut_050.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie14 = null;
        buggyasrts.mut_050.Trie trie15 = null;
        fuzzTest13.FuzzTest_add(trie14, trie15, "", false);
        buggyasrts.mut_050.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie19, trie20, "", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie25 = null;
        buggyasrts.mut_050.Trie trie26 = null;
        fuzzTest24.FuzzTest_add(trie25, trie26, "", false);
        buggyasrts.mut_050.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie30, trie31, "", false);
        buggyasrts.mut_050.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie30, trie35, "hi!", false);
        fuzzTest11.FuzzTest_add(trie12, trie35, "hi!", false);
        buggyasrts.mut_050.Trie trie42 = null;
        fuzzTest0.FuzzTest_add(trie35, trie42, "", false);
        buggyasrts.mut_050.Trie trie46 = null;
        buggyasrts.mut_050.Trie trie47 = null;
        fuzzTest0.FuzzTest_add(trie46, trie47, "old0", false);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie52 = null;
        buggyasrts.mut_050.Trie trie53 = null;
        fuzzTest51.FuzzTest_add(trie52, trie53, "", false);
        buggyasrts.mut_050.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_add(trie57, trie58, "", false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie63 = null;
        buggyasrts.mut_050.Trie trie64 = null;
        fuzzTest62.FuzzTest_add(trie63, trie64, "", false);
        buggyasrts.mut_050.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_add(trie68, trie69, "", false);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie74 = null;
        buggyasrts.mut_050.Trie trie75 = null;
        fuzzTest73.FuzzTest_add(trie74, trie75, "", false);
        buggyasrts.mut_050.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_add(trie79, trie80, "", false);
        buggyasrts.mut_050.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_add(trie79, trie84, "hi!", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie58, trie84, "old1", true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie7 = null;
        buggyasrts.mut_050.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie13 = null;
        buggyasrts.mut_050.Trie trie14 = null;
        fuzzTest12.FuzzTest_add(trie13, trie14, "", false);
        buggyasrts.mut_050.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie18, trie19, "", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie25 = null;
        buggyasrts.mut_050.Trie trie26 = null;
        fuzzTest24.FuzzTest_add(trie25, trie26, "", false);
        buggyasrts.mut_050.Trie trie30 = null;
        buggyasrts.mut_050.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie30, trie31, "old0", true);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie36 = null;
        buggyasrts.mut_050.Trie trie37 = null;
        fuzzTest35.FuzzTest_add(trie36, trie37, "", false);
        buggyasrts.mut_050.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_add(trie41, trie42, "", false);
        fuzzTest23.FuzzTest_add(trie31, trie42, "seed0", true);
        buggyasrts.mut_050.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie52 = null;
        buggyasrts.mut_050.Trie trie53 = null;
        fuzzTest51.FuzzTest_add(trie52, trie53, "", false);
        buggyasrts.mut_050.Trie trie57 = null;
        buggyasrts.mut_050.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_add(trie57, trie58, "old0", true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie63 = null;
        buggyasrts.mut_050.Trie trie64 = null;
        fuzzTest62.FuzzTest_add(trie63, trie64, "", false);
        buggyasrts.mut_050.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_add(trie68, trie69, "", false);
        fuzzTest50.FuzzTest_add(trie58, trie69, "seed0", true);
        fuzzTest23.FuzzTest_add(trie49, trie69, "hi!", true);
        fuzzTest6.FuzzTest_add(trie18, trie49, "seed0", true);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie83 = null;
        buggyasrts.mut_050.Trie trie84 = null;
        fuzzTest82.FuzzTest_add(trie83, trie84, "", false);
        buggyasrts.mut_050.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_add(trie88, trie89, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie49, trie89, "seed1", true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie5 = null;
        buggyasrts.mut_050.Trie trie6 = null;
        fuzzTest4.FuzzTest_add(trie5, trie6, "", false);
        buggyasrts.mut_050.Trie trie10 = null;
        buggyasrts.mut_050.Trie trie11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest4.FuzzTest_add(trie10, trie11, "old0", true);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie16 = null;
        buggyasrts.mut_050.Trie trie17 = null;
        fuzzTest15.FuzzTest_add(trie16, trie17, "", false);
        buggyasrts.mut_050.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_add(trie21, trie22, "", false);
        fuzzTest3.FuzzTest_add(trie11, trie22, "seed0", true);
        fuzzTest1.FuzzTest_add(trie2, trie22, "seed1", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie33 = null;
        buggyasrts.mut_050.Trie trie34 = null;
        fuzzTest32.FuzzTest_add(trie33, trie34, "", false);
        buggyasrts.mut_050.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie38, trie39, "", false);
        fuzzTest0.FuzzTest_add(trie2, trie39, "seed2", false);
        buggyasrts.mut_050.Trie trie46 = null;
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie50 = null;
        buggyasrts.mut_050.Trie trie51 = null;
        fuzzTest49.FuzzTest_add(trie50, trie51, "", false);
        buggyasrts.mut_050.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(trie55, trie56, "", false);
        fuzzTest47.FuzzTest_add(trie48, trie56, "old2", false);
        fuzzTest0.FuzzTest_add(trie46, trie48, "seed1", false);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie68 = null;
        buggyasrts.mut_050.Trie trie69 = null;
        fuzzTest67.FuzzTest_add(trie68, trie69, "", false);
        buggyasrts.mut_050.Trie trie73 = null;
        buggyasrts.mut_050.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_add(trie73, trie74, "old0", true);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie79 = null;
        buggyasrts.mut_050.Trie trie80 = null;
        fuzzTest78.FuzzTest_add(trie79, trie80, "", false);
        buggyasrts.mut_050.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_add(trie84, trie85, "", false);
        fuzzTest66.FuzzTest_add(trie74, trie85, "seed0", true);
        buggyasrts.mut_050.Trie trie92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie74, trie92, "old1", true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie7 = null;
        buggyasrts.mut_050.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        buggyasrts.mut_050.Trie trie12 = null;
        buggyasrts.mut_050.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie12, trie13, "old0", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie18 = null;
        buggyasrts.mut_050.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        buggyasrts.mut_050.Trie trie23 = null;
        buggyasrts.mut_050.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie23, trie24, "old0", true);
        buggyasrts.mut_050.Trie trie28 = null;
        fuzzTest6.FuzzTest_add(trie24, trie28, "old2", true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie33 = null;
        buggyasrts.mut_050.Trie trie34 = null;
        fuzzTest32.FuzzTest_add(trie33, trie34, "", false);
        buggyasrts.mut_050.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie38, trie39, "", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie46 = null;
        buggyasrts.mut_050.Trie trie47 = null;
        fuzzTest45.FuzzTest_add(trie46, trie47, "", false);
        buggyasrts.mut_050.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(trie51, trie52, "", false);
        fuzzTest43.FuzzTest_add(trie44, trie52, "old2", false);
        fuzzTest6.FuzzTest_add(trie38, trie52, "", false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie64 = null;
        buggyasrts.mut_050.Trie trie65 = null;
        fuzzTest63.FuzzTest_add(trie64, trie65, "", false);
        buggyasrts.mut_050.Trie trie69 = null;
        buggyasrts.mut_050.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie69, trie70, "old0", true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie75 = null;
        buggyasrts.mut_050.Trie trie76 = null;
        fuzzTest74.FuzzTest_add(trie75, trie76, "", false);
        buggyasrts.mut_050.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_add(trie80, trie81, "", false);
        fuzzTest62.FuzzTest_add(trie70, trie81, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie52, trie81, "old0", true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggyasrts.mut_050.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "", false);
        buggyasrts.mut_050.Trie trie11 = null;
        buggyasrts.mut_050.Trie trie12 = null;
        fuzzTest0.FuzzTest_add(trie11, trie12, "seed2", true);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie17 = null;
        buggyasrts.mut_050.Trie trie18 = null;
        fuzzTest16.FuzzTest_add(trie17, trie18, "", false);
        buggyasrts.mut_050.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_add(trie22, trie23, "", false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie31 = null;
        buggyasrts.mut_050.Trie trie32 = null;
        fuzzTest30.FuzzTest_add(trie31, trie32, "", false);
        buggyasrts.mut_050.Trie trie36 = null;
        buggyasrts.mut_050.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_add(trie36, trie37, "old0", true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie42 = null;
        buggyasrts.mut_050.Trie trie43 = null;
        fuzzTest41.FuzzTest_add(trie42, trie43, "", false);
        buggyasrts.mut_050.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_add(trie47, trie48, "", false);
        fuzzTest29.FuzzTest_add(trie37, trie48, "seed0", true);
        fuzzTest27.FuzzTest_add(trie28, trie48, "seed1", false);
        buggyasrts.mut_050.Trie trie58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie60 = null;
        buggyasrts.mut_050.Trie trie61 = null;
        fuzzTest59.FuzzTest_add(trie60, trie61, "", false);
        buggyasrts.mut_050.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_add(trie65, trie66, "", false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie71 = null;
        buggyasrts.mut_050.Trie trie72 = null;
        fuzzTest70.FuzzTest_add(trie71, trie72, "", false);
        buggyasrts.mut_050.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_add(trie76, trie77, "", false);
        buggyasrts.mut_050.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_add(trie76, trie81, "hi!", false);
        fuzzTest27.FuzzTest_add(trie58, trie76, "old1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie23, trie76, "seed2", true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie9 = null;
        buggyasrts.mut_050.Trie trie10 = null;
        fuzzTest8.FuzzTest_add(trie9, trie10, "", false);
        buggyasrts.mut_050.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie14, trie15, "", false);
        fuzzTest6.FuzzTest_add(trie7, trie15, "old2", false);
        buggyasrts.mut_050.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie15, trie22, "", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie30 = null;
        buggyasrts.mut_050.Trie trie31 = null;
        fuzzTest29.FuzzTest_add(trie30, trie31, "", false);
        buggyasrts.mut_050.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie35, trie36, "", false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie41 = null;
        buggyasrts.mut_050.Trie trie42 = null;
        fuzzTest40.FuzzTest_add(trie41, trie42, "", false);
        buggyasrts.mut_050.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_add(trie46, trie47, "", false);
        buggyasrts.mut_050.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie46, trie51, "hi!", false);
        buggyasrts.mut_050.Trie trie55 = null;
        fuzzTest28.FuzzTest_add(trie51, trie55, "seed2", false);
        fuzzTest26.FuzzTest_add(trie27, trie51, "seed0", true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie66 = null;
        buggyasrts.mut_050.Trie trie67 = null;
        fuzzTest65.FuzzTest_add(trie66, trie67, "", false);
        buggyasrts.mut_050.Trie trie71 = null;
        buggyasrts.mut_050.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_add(trie71, trie72, "old0", true);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie77 = null;
        buggyasrts.mut_050.Trie trie78 = null;
        fuzzTest76.FuzzTest_add(trie77, trie78, "", false);
        buggyasrts.mut_050.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_add(trie82, trie83, "", false);
        fuzzTest64.FuzzTest_add(trie72, trie83, "seed0", true);
        fuzzTest62.FuzzTest_add(trie63, trie83, "seed1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie51, trie83, "old0", true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggyasrts.mut_050.Trie trie6 = null;
        buggyasrts.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie14 = null;
        buggyasrts.mut_050.Trie trie15 = null;
        fuzzTest13.FuzzTest_add(trie14, trie15, "", false);
        buggyasrts.mut_050.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie19, trie20, "", false);
        fuzzTest11.FuzzTest_add(trie12, trie20, "old2", false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie30 = null;
        buggyasrts.mut_050.Trie trie31 = null;
        fuzzTest29.FuzzTest_add(trie30, trie31, "", false);
        buggyasrts.mut_050.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie35, trie36, "", false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie41 = null;
        buggyasrts.mut_050.Trie trie42 = null;
        fuzzTest40.FuzzTest_add(trie41, trie42, "", false);
        buggyasrts.mut_050.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_add(trie46, trie47, "", false);
        buggyasrts.mut_050.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie46, trie51, "hi!", false);
        fuzzTest27.FuzzTest_add(trie28, trie51, "hi!", false);
        fuzzTest0.FuzzTest_add(trie20, trie28, "seed0", true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie62 = null;
        buggyasrts.mut_050.Trie trie63 = null;
        fuzzTest61.FuzzTest_add(trie62, trie63, "", false);
        buggyasrts.mut_050.Trie trie67 = null;
        buggyasrts.mut_050.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_add(trie67, trie68, "old0", true);
        buggyasrts.mut_050.Trie trie72 = null;
        fuzzTest0.FuzzTest_add(trie68, trie72, "hi!", false);
        buggyasrts.mut_050.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie80 = null;
        buggyasrts.mut_050.Trie trie81 = null;
        fuzzTest79.FuzzTest_add(trie80, trie81, "", false);
        buggyasrts.mut_050.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie85, trie86, "", false);
        fuzzTest77.FuzzTest_add(trie78, trie86, "old2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie76, trie86, "old2", true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggyasrts.mut_050.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie13 = null;
        buggyasrts.mut_050.Trie trie14 = null;
        fuzzTest12.FuzzTest_add(trie13, trie14, "", false);
        buggyasrts.mut_050.Trie trie18 = null;
        buggyasrts.mut_050.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie18, trie19, "old0", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie24 = null;
        buggyasrts.mut_050.Trie trie25 = null;
        fuzzTest23.FuzzTest_add(trie24, trie25, "", false);
        buggyasrts.mut_050.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie29, trie30, "", false);
        fuzzTest11.FuzzTest_add(trie19, trie30, "seed0", true);
        buggyasrts.mut_050.Trie trie37 = null;
        fuzzTest0.FuzzTest_add(trie19, trie37, "hi!", false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie44 = null;
        buggyasrts.mut_050.Trie trie45 = null;
        fuzzTest43.FuzzTest_add(trie44, trie45, "", false);
        buggyasrts.mut_050.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie49, trie50, "", false);
        fuzzTest41.FuzzTest_add(trie42, trie50, "old2", false);
        buggyasrts.mut_050.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie59 = null;
        buggyasrts.mut_050.Trie trie60 = null;
        fuzzTest58.FuzzTest_add(trie59, trie60, "", false);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie65 = null;
        buggyasrts.mut_050.Trie trie66 = null;
        fuzzTest64.FuzzTest_add(trie65, trie66, "", false);
        buggyasrts.mut_050.Trie trie70 = null;
        buggyasrts.mut_050.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_add(trie70, trie71, "old0", true);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie76 = null;
        buggyasrts.mut_050.Trie trie77 = null;
        fuzzTest75.FuzzTest_add(trie76, trie77, "", false);
        buggyasrts.mut_050.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_add(trie81, trie82, "", false);
        fuzzTest58.FuzzTest_add(trie70, trie82, "hi!", true);
        fuzzTest41.FuzzTest_add(trie57, trie82, "old2", false);
        buggyasrts.mut_050.Trie trie92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie57, trie92, "old1", true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie3 = null;
        buggyasrts.mut_050.Trie trie4 = null;
        fuzzTest2.FuzzTest_add(trie3, trie4, "", false);
        buggyasrts.mut_050.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie8, trie9, "", false);
        fuzzTest0.FuzzTest_add(trie1, trie9, "old2", false);
        buggyasrts.mut_050.Trie trie16 = null;
        buggyasrts.mut_050.Trie trie17 = null;
        fuzzTest0.FuzzTest_add(trie16, trie17, "seed0", true);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie23 = null;
        buggyasrts.mut_050.Trie trie24 = null;
        fuzzTest22.FuzzTest_add(trie23, trie24, "", false);
        buggyasrts.mut_050.Trie trie28 = null;
        buggyasrts.mut_050.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_add(trie28, trie29, "old0", true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie34 = null;
        buggyasrts.mut_050.Trie trie35 = null;
        fuzzTest33.FuzzTest_add(trie34, trie35, "", false);
        buggyasrts.mut_050.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie39, trie40, "", false);
        fuzzTest21.FuzzTest_add(trie29, trie40, "seed0", true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie50 = null;
        buggyasrts.mut_050.Trie trie51 = null;
        fuzzTest49.FuzzTest_add(trie50, trie51, "", false);
        buggyasrts.mut_050.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(trie55, trie56, "", false);
        fuzzTest47.FuzzTest_add(trie48, trie56, "old2", false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie64 = null;
        buggyasrts.mut_050.Trie trie65 = null;
        fuzzTest63.FuzzTest_add(trie64, trie65, "", false);
        buggyasrts.mut_050.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie69, trie70, "", false);
        fuzzTest21.FuzzTest_add(trie56, trie70, "old2", false);
        buggyasrts.mut_050.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie78 = null;
        fuzzTest21.FuzzTest_add(trie77, trie78, "seed0", false);
        buggyasrts.mut_050.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie77, trie82, "old1", true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie4 = null;
        buggyasrts.mut_050.Trie trie5 = null;
        fuzzTest3.FuzzTest_add(trie4, trie5, "", false);
        buggyasrts.mut_050.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_add(trie9, trie10, "", false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie15 = null;
        buggyasrts.mut_050.Trie trie16 = null;
        fuzzTest14.FuzzTest_add(trie15, trie16, "", false);
        buggyasrts.mut_050.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie20, trie21, "", false);
        buggyasrts.mut_050.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_add(trie20, trie25, "hi!", false);
        buggyasrts.mut_050.Trie trie29 = null;
        fuzzTest2.FuzzTest_add(trie25, trie29, "seed2", false);
        fuzzTest0.FuzzTest_add(trie1, trie25, "seed0", true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie39 = null;
        buggyasrts.mut_050.Trie trie40 = null;
        fuzzTest38.FuzzTest_add(trie39, trie40, "", false);
        buggyasrts.mut_050.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(trie44, trie45, "", false);
        fuzzTest36.FuzzTest_add(trie37, trie45, "old2", false);
        buggyasrts.mut_050.Trie trie52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie55 = null;
        buggyasrts.mut_050.Trie trie56 = null;
        fuzzTest54.FuzzTest_add(trie55, trie56, "", false);
        buggyasrts.mut_050.Trie trie60 = null;
        buggyasrts.mut_050.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(trie60, trie61, "old0", true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie66 = null;
        buggyasrts.mut_050.Trie trie67 = null;
        fuzzTest65.FuzzTest_add(trie66, trie67, "", false);
        buggyasrts.mut_050.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_add(trie71, trie72, "", false);
        fuzzTest53.FuzzTest_add(trie61, trie72, "seed0", true);
        fuzzTest36.FuzzTest_add(trie52, trie61, "", false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie83 = null;
        buggyasrts.mut_050.Trie trie84 = null;
        fuzzTest82.FuzzTest_add(trie83, trie84, "", false);
        buggyasrts.mut_050.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_add(trie88, trie89, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie61, trie88, "old2", true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggyasrts.mut_050.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "", false);
        buggyasrts.mut_050.Trie trie11 = null;
        buggyasrts.mut_050.Trie trie12 = null;
        fuzzTest0.FuzzTest_add(trie11, trie12, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie17 = null;
        buggyasrts.mut_050.Trie trie18 = null;
        fuzzTest16.FuzzTest_add(trie17, trie18, "", false);
        buggyasrts.mut_050.Trie trie22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie26 = null;
        buggyasrts.mut_050.Trie trie27 = null;
        fuzzTest25.FuzzTest_add(trie26, trie27, "", false);
        buggyasrts.mut_050.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_add(trie31, trie32, "", false);
        fuzzTest23.FuzzTest_add(trie24, trie32, "old2", false);
        fuzzTest16.FuzzTest_add(trie22, trie32, "old2", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie43 = null;
        buggyasrts.mut_050.Trie trie44 = null;
        fuzzTest42.FuzzTest_add(trie43, trie44, "", false);
        buggyasrts.mut_050.Trie trie48 = null;
        buggyasrts.mut_050.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie48, trie49, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie32, trie49, "seed2", true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "seed1", true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie8 = null;
        buggyasrts.mut_050.Trie trie9 = null;
        fuzzTest7.FuzzTest_add(trie8, trie9, "", false);
        buggyasrts.mut_050.Trie trie13 = null;
        buggyasrts.mut_050.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie13, trie14, "old0", true);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie19 = null;
        buggyasrts.mut_050.Trie trie20 = null;
        fuzzTest18.FuzzTest_add(trie19, trie20, "", false);
        buggyasrts.mut_050.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie24, trie25, "", false);
        fuzzTest6.FuzzTest_add(trie14, trie25, "seed0", true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie33 = null;
        buggyasrts.mut_050.Trie trie34 = null;
        fuzzTest32.FuzzTest_add(trie33, trie34, "", false);
        buggyasrts.mut_050.Trie trie38 = null;
        buggyasrts.mut_050.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie38, trie39, "old0", true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie44 = null;
        buggyasrts.mut_050.Trie trie45 = null;
        fuzzTest43.FuzzTest_add(trie44, trie45, "", false);
        buggyasrts.mut_050.Trie trie49 = null;
        buggyasrts.mut_050.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie49, trie50, "old0", true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie55 = null;
        buggyasrts.mut_050.Trie trie56 = null;
        fuzzTest54.FuzzTest_add(trie55, trie56, "", false);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie61 = null;
        buggyasrts.mut_050.Trie trie62 = null;
        fuzzTest60.FuzzTest_add(trie61, trie62, "", false);
        buggyasrts.mut_050.Trie trie66 = null;
        buggyasrts.mut_050.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_add(trie66, trie67, "old0", true);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie72 = null;
        buggyasrts.mut_050.Trie trie73 = null;
        fuzzTest71.FuzzTest_add(trie72, trie73, "", false);
        buggyasrts.mut_050.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_add(trie77, trie78, "", false);
        fuzzTest54.FuzzTest_add(trie66, trie78, "hi!", true);
        fuzzTest32.FuzzTest_add(trie50, trie78, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie25, trie50, "old2", true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggyasrts.mut_050.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "", false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie12 = null;
        buggyasrts.mut_050.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        buggyasrts.mut_050.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie17, trie18, "", false);
        buggyasrts.mut_050.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie17, trie22, "hi!", false);
        buggyasrts.mut_050.Trie trie26 = null;
        buggyasrts.mut_050.Trie trie27 = null;
        fuzzTest0.FuzzTest_add(trie26, trie27, "old2", false);
        buggyasrts.mut_050.Trie trie31 = null;
        buggyasrts.mut_050.Trie trie32 = null;
        fuzzTest0.FuzzTest_add(trie31, trie32, "old1", true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie37 = null;
        buggyasrts.mut_050.Trie trie38 = null;
        fuzzTest36.FuzzTest_add(trie37, trie38, "", false);
        buggyasrts.mut_050.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_add(trie42, trie43, "", false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie48 = null;
        buggyasrts.mut_050.Trie trie49 = null;
        fuzzTest47.FuzzTest_add(trie48, trie49, "", false);
        buggyasrts.mut_050.Trie trie53 = null;
        buggyasrts.mut_050.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie53, trie54, "old0", true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie59 = null;
        buggyasrts.mut_050.Trie trie60 = null;
        fuzzTest58.FuzzTest_add(trie59, trie60, "", false);
        buggyasrts.mut_050.Trie trie64 = null;
        buggyasrts.mut_050.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie64, trie65, "old0", true);
        buggyasrts.mut_050.Trie trie69 = null;
        fuzzTest47.FuzzTest_add(trie65, trie69, "old2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie43, trie65, "old0", true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie4 = null;
        buggyasrts.mut_050.Trie trie5 = null;
        fuzzTest3.FuzzTest_add(trie4, trie5, "", false);
        buggyasrts.mut_050.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_add(trie9, trie10, "", false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie15 = null;
        buggyasrts.mut_050.Trie trie16 = null;
        fuzzTest14.FuzzTest_add(trie15, trie16, "", false);
        buggyasrts.mut_050.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie20, trie21, "", false);
        buggyasrts.mut_050.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_add(trie20, trie25, "hi!", false);
        buggyasrts.mut_050.Trie trie29 = null;
        fuzzTest2.FuzzTest_add(trie25, trie29, "seed2", false);
        fuzzTest0.FuzzTest_add(trie1, trie25, "seed0", true);
        buggyasrts.mut_050.Trie trie36 = null;
        buggyasrts.mut_050.Trie trie37 = null;
        fuzzTest0.FuzzTest_add(trie36, trie37, "hi!", false);
        buggyasrts.mut_050.Trie trie41 = null;
        buggyasrts.mut_050.Trie trie42 = null;
        fuzzTest0.FuzzTest_add(trie41, trie42, "seed1", false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie47 = null;
        buggyasrts.mut_050.Trie trie48 = null;
        fuzzTest46.FuzzTest_add(trie47, trie48, "", false);
        buggyasrts.mut_050.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_add(trie52, trie53, "", false);
        buggyasrts.mut_050.Trie trie57 = null;
        fuzzTest0.FuzzTest_add(trie53, trie57, "", false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie62 = null;
        buggyasrts.mut_050.Trie trie63 = null;
        fuzzTest61.FuzzTest_add(trie62, trie63, "", false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie68 = null;
        buggyasrts.mut_050.Trie trie69 = null;
        fuzzTest67.FuzzTest_add(trie68, trie69, "", false);
        buggyasrts.mut_050.Trie trie73 = null;
        buggyasrts.mut_050.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_add(trie73, trie74, "old0", true);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie79 = null;
        buggyasrts.mut_050.Trie trie80 = null;
        fuzzTest78.FuzzTest_add(trie79, trie80, "", false);
        buggyasrts.mut_050.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_add(trie84, trie85, "", false);
        fuzzTest61.FuzzTest_add(trie73, trie85, "hi!", true);
        buggyasrts.mut_050.Trie trie92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie85, trie92, "old2", true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie4 = null;
        buggyasrts.mut_050.Trie trie5 = null;
        fuzzTest3.FuzzTest_add(trie4, trie5, "", false);
        buggyasrts.mut_050.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_add(trie9, trie10, "", false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie15 = null;
        buggyasrts.mut_050.Trie trie16 = null;
        fuzzTest14.FuzzTest_add(trie15, trie16, "", false);
        buggyasrts.mut_050.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie20, trie21, "", false);
        buggyasrts.mut_050.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_add(trie20, trie25, "hi!", false);
        buggyasrts.mut_050.Trie trie29 = null;
        fuzzTest2.FuzzTest_add(trie25, trie29, "seed2", false);
        fuzzTest0.FuzzTest_add(trie1, trie25, "seed0", true);
        buggyasrts.mut_050.Trie trie36 = null;
        buggyasrts.mut_050.Trie trie37 = null;
        fuzzTest0.FuzzTest_add(trie36, trie37, "hi!", false);
        buggyasrts.mut_050.Trie trie41 = null;
        buggyasrts.mut_050.Trie trie42 = null;
        fuzzTest0.FuzzTest_add(trie41, trie42, "seed1", false);
        buggyasrts.mut_050.Trie trie46 = null;
        buggyasrts.mut_050.Trie trie47 = null;
        fuzzTest0.FuzzTest_add(trie46, trie47, "seed0", true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie54 = null;
        buggyasrts.mut_050.Trie trie55 = null;
        fuzzTest53.FuzzTest_add(trie54, trie55, "", false);
        buggyasrts.mut_050.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie59, trie60, "", false);
        fuzzTest51.FuzzTest_add(trie52, trie60, "old2", false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie68 = null;
        buggyasrts.mut_050.Trie trie69 = null;
        fuzzTest67.FuzzTest_add(trie68, trie69, "", false);
        buggyasrts.mut_050.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_add(trie73, trie74, "", false);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie79 = null;
        buggyasrts.mut_050.Trie trie80 = null;
        fuzzTest78.FuzzTest_add(trie79, trie80, "", false);
        buggyasrts.mut_050.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_add(trie84, trie85, "", false);
        buggyasrts.mut_050.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_add(trie84, trie89, "hi!", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie60, trie84, "seed0", true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie1 = null;
        buggyasrts.mut_050.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        buggyasrts.mut_050.Trie trie6 = null;
        buggyasrts.mut_050.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie6, trie7, "old0", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie12 = null;
        buggyasrts.mut_050.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        buggyasrts.mut_050.Trie trie17 = null;
        buggyasrts.mut_050.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie17, trie18, "old0", true);
        buggyasrts.mut_050.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie18, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie27 = null;
        buggyasrts.mut_050.Trie trie28 = null;
        fuzzTest26.FuzzTest_add(trie27, trie28, "", false);
        buggyasrts.mut_050.Trie trie32 = null;
        buggyasrts.mut_050.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie32, trie33, "old0", true);
        buggyasrts.mut_050.Trie trie37 = null;
        fuzzTest0.FuzzTest_add(trie33, trie37, "", false);
        buggyasrts.mut_050.Trie trie41 = null;
        buggyasrts.mut_050.Trie trie42 = null;
        fuzzTest0.FuzzTest_add(trie41, trie42, "seed1", true);
        buggyasrts.mut_050.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie48 = null;
        buggyasrts.mut_050.Trie trie49 = null;
        fuzzTest47.FuzzTest_add(trie48, trie49, "", false);
        buggyasrts.mut_050.Trie trie53 = null;
        buggyasrts.mut_050.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie53, trie54, "old0", true);
        buggyasrts.mut_050.Trie trie58 = null;
        buggyasrts.mut_050.Trie trie59 = null;
        fuzzTest47.FuzzTest_add(trie58, trie59, "old1", false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie65 = null;
        buggyasrts.mut_050.Trie trie66 = null;
        fuzzTest64.FuzzTest_add(trie65, trie66, "", false);
        buggyasrts.mut_050.Trie trie70 = null;
        buggyasrts.mut_050.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_add(trie70, trie71, "old0", true);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggyasrts.mut_050.Trie trie76 = null;
        buggyasrts.mut_050.Trie trie77 = null;
        fuzzTest75.FuzzTest_add(trie76, trie77, "", false);
        buggyasrts.mut_050.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_050.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_add(trie81, trie82, "", false);
        fuzzTest63.FuzzTest_add(trie71, trie82, "seed0", true);
        buggyasrts.mut_050.Trie trie89 = null;
        fuzzTest47.FuzzTest_add(trie71, trie89, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie46, trie71, "old2", true);
    }
}

