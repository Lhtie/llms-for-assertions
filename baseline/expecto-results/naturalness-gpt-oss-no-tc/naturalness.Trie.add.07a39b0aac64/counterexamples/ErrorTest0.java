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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie6, trie7, "", false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie6, trie7, "hi!", false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie6, trie7, "seed1", false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie1, trie2, "seed1", false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie6, trie7, "seed2", true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie7, trie12, "", false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie13, trie14, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie7, trie14, "old2", true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzzTest0.FuzzTest_add(trie1, trie3, "old1", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie12, trie13, "old0", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie18, trie19, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie12, trie18, "old1", true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie13, trie14, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie8, trie13, "old1", true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie13, trie14, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie7, trie13, "seed0", false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = null;
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_add(trie10, trie11, "old0", false);
        fuzzTest7.FuzzTest_add(trie8, trie10, "old1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie6, trie10, "seed0", false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie2, trie3, "old0", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzzTest7.FuzzTest_add(trie10, trie15, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie2, trie15, "old0", true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzzTest1.FuzzTest_add(trie4, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie18, trie19, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie4, trie18, "", false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzzTest6.FuzzTest_add(trie9, trie14, "old0", false);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie14, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie27, trie28, "old0", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie35, trie36, "old0", false);
        fuzzTest32.FuzzTest_add(trie33, trie35, "old1", true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(trie45, trie46, "old0", false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_add(trie51, trie52, "old0", false);
        fuzzTest43.FuzzTest_add(trie46, trie51, "old0", false);
        fuzzTest26.FuzzTest_add(trie33, trie51, "hi!", true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie64, trie65, "old0", false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_add(trie70, trie71, "old0", false);
        fuzzTest62.FuzzTest_add(trie65, trie70, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie51, trie65, "", true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie2, trie3, "old0", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzzTest0.FuzzTest_add(trie3, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_add(trie17, trie18, "old0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie30, trie31, "old0", false);
        fuzzTest22.FuzzTest_add(trie25, trie30, "old0", false);
        naturalness.Trie trie38 = null;
        fuzzTest16.FuzzTest_add(trie30, trie38, "old2", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie44, trie45, "old0", false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(trie50, trie51, "old0", false);
        fuzzTest42.FuzzTest_add(trie45, trie50, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie30, trie50, "old0", true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzzTest7.FuzzTest_add(trie10, trie15, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie6, trie15, "old1", true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzzTest0.FuzzTest_add(trie1, trie3, "old1", true);
        naturalness.Trie trie11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzzTest12.FuzzTest_add(trie13, trie15, "old1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie11, trie15, "old2", true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzzTest6.FuzzTest_add(trie7, trie9, "old1", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie19, trie20, "old0", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzzTest17.FuzzTest_add(trie20, trie25, "old0", false);
        fuzzTest0.FuzzTest_add(trie7, trie25, "hi!", true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_add(trie37, trie38, "old0", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie43, trie44, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie38, trie43, "seed0", true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzzTest6.FuzzTest_add(trie7, trie9, "old1", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie19, trie20, "old0", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzzTest17.FuzzTest_add(trie20, trie25, "old0", false);
        fuzzTest0.FuzzTest_add(trie7, trie25, "hi!", true);
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(trie39, trie40, "old0", false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(trie45, trie46, "old0", false);
        fuzzTest37.FuzzTest_add(trie40, trie45, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie36, trie45, "", false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie6, trie7, "hi!", true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzzTest6.FuzzTest_add(trie7, trie9, "old1", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie19, trie20, "old0", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzzTest17.FuzzTest_add(trie20, trie25, "old0", false);
        fuzzTest0.FuzzTest_add(trie7, trie25, "hi!", true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_add(trie37, trie38, "old0", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(trie45, trie46, "old0", false);
        fuzzTest42.FuzzTest_add(trie43, trie45, "old1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie37, trie45, "old2", true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzzTest1.FuzzTest_add(trie4, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie19, trie20, "old0", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzzTest17.FuzzTest_add(trie20, trie25, "old0", false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie35, trie36, "old0", false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_add(trie41, trie42, "old0", false);
        fuzzTest33.FuzzTest_add(trie36, trie41, "old0", false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(trie50, trie51, "old0", false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_add(trie56, trie57, "old0", false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.Trie trie62 = null;
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie64, trie65, "old0", false);
        fuzzTest61.FuzzTest_add(trie62, trie64, "old1", true);
        fuzzTest49.FuzzTest_add(trie57, trie62, "hi!", false);
        fuzzTest17.FuzzTest_add(trie36, trie62, "seed1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie9, trie36, "old1", true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzzTest12.FuzzTest_add(trie13, trie15, "old1", true);
        fuzzTest0.FuzzTest_add(trie8, trie13, "hi!", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_add(trie28, trie29, "old0", false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie34, trie35, "old0", false);
        fuzzTest26.FuzzTest_add(trie29, trie34, "old0", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie43, trie44, "old0", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_add(trie51, trie52, "old0", false);
        fuzzTest48.FuzzTest_add(trie49, trie51, "old1", true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_add(trie61, trie62, "old0", false);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_add(trie67, trie68, "old0", false);
        fuzzTest59.FuzzTest_add(trie62, trie67, "old0", false);
        fuzzTest42.FuzzTest_add(trie49, trie67, "hi!", true);
        fuzzTest0.FuzzTest_add(trie34, trie49, "old2", true);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        naturalness.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_add(trie82, trie83, "old0", false);
        naturalness.Trie trie87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie82, trie87, "seed0", true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie13, trie14, "old0", false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie19, trie20, "old0", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.Trie trie31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie33, trie34, "old0", false);
        fuzzTest30.FuzzTest_add(trie31, trie33, "old1", true);
        fuzzTest18.FuzzTest_add(trie26, trie31, "hi!", false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(trie45, trie46, "old0", false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.Trie trie51 = null;
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_add(trie53, trie54, "old0", false);
        fuzzTest50.FuzzTest_add(trie51, trie53, "old1", true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_add(trie63, trie64, "old0", false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie69, trie70, "old0", false);
        fuzzTest61.FuzzTest_add(trie64, trie69, "old0", false);
        fuzzTest44.FuzzTest_add(trie51, trie69, "hi!", true);
        fuzzTest12.FuzzTest_add(trie26, trie69, "seed0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie7, trie26, "seed1", true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(trie20, trie21, "old0", false);
        fuzzTest12.FuzzTest_add(trie15, trie20, "old0", false);
        naturalness.Trie trie28 = null;
        fuzzTest6.FuzzTest_add(trie20, trie28, "old2", true);
        naturalness.Trie trie32 = null;
        fuzzTest0.FuzzTest_add(trie28, trie32, "seed2", false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_add(trie37, trie38, "old0", false);
        naturalness.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie38, trie42, "seed1", true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzzTest0.FuzzTest_add(trie1, trie3, "old1", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie12, trie13, "old0", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie18, trie19, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie12, trie19, "old2", true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie2, trie3, "old0", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzzTest0.FuzzTest_add(trie3, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie19, trie20, "old0", false);
        fuzzTest16.FuzzTest_add(trie17, trie19, "old1", true);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_add(trie29, trie30, "old0", false);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie35, trie36, "old0", false);
        fuzzTest27.FuzzTest_add(trie30, trie35, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie19, trie35, "", true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie2, trie3, "old0", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzzTest0.FuzzTest_add(trie3, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_add(trie17, trie18, "old0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie30, trie31, "old0", false);
        fuzzTest22.FuzzTest_add(trie25, trie30, "old0", false);
        naturalness.Trie trie38 = null;
        fuzzTest16.FuzzTest_add(trie30, trie38, "old2", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(trie45, trie46, "old0", false);
        fuzzTest42.FuzzTest_add(trie43, trie45, "old1", true);
        fuzzTest0.FuzzTest_add(trie38, trie45, "hi!", false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(trie58, trie59, "old0", false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie64, trie65, "old0", false);
        fuzzTest56.FuzzTest_add(trie59, trie64, "old0", false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_add(trie74, trie75, "old0", false);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie80, trie81, "old0", false);
        fuzzTest72.FuzzTest_add(trie75, trie80, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie64, trie80, "", true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzzTest12.FuzzTest_add(trie13, trie15, "old1", true);
        fuzzTest0.FuzzTest_add(trie8, trie13, "hi!", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_add(trie28, trie29, "old0", false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie34, trie35, "old0", false);
        fuzzTest26.FuzzTest_add(trie29, trie34, "old0", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie43, trie44, "old0", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(trie50, trie51, "old0", false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_add(trie56, trie57, "old0", false);
        fuzzTest48.FuzzTest_add(trie51, trie56, "old0", false);
        naturalness.Trie trie64 = null;
        fuzzTest42.FuzzTest_add(trie56, trie64, "old2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie29, trie56, "seed2", true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie2, trie3, "old0", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzzTest0.FuzzTest_add(trie3, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_add(trie17, trie18, "old0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie30, trie31, "old0", false);
        fuzzTest22.FuzzTest_add(trie25, trie30, "old0", false);
        naturalness.Trie trie38 = null;
        fuzzTest16.FuzzTest_add(trie30, trie38, "old2", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(trie45, trie46, "old0", false);
        fuzzTest42.FuzzTest_add(trie43, trie45, "old1", true);
        fuzzTest0.FuzzTest_add(trie38, trie45, "hi!", false);
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie59, trie60, "old0", false);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_add(trie65, trie66, "old0", false);
        fuzzTest57.FuzzTest_add(trie60, trie65, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie56, trie65, "old0", true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzzTest0.FuzzTest_add(trie1, trie3, "old1", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie18, trie19, "old0", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_add(trie26, trie27, "old0", false);
        fuzzTest23.FuzzTest_add(trie24, trie26, "old1", true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_add(trie36, trie37, "old0", false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_add(trie42, trie43, "old0", false);
        fuzzTest34.FuzzTest_add(trie37, trie42, "old0", false);
        fuzzTest17.FuzzTest_add(trie24, trie42, "hi!", true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(trie55, trie56, "old0", false);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_add(trie61, trie62, "old0", false);
        fuzzTest53.FuzzTest_add(trie56, trie61, "old0", false);
        fuzzTest11.FuzzTest_add(trie24, trie56, "hi!", false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.Trie trie73 = null;
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_add(trie75, trie76, "old0", false);
        fuzzTest72.FuzzTest_add(trie73, trie75, "old1", true);
        fuzzTest0.FuzzTest_add(trie24, trie75, "seed2", false);
        naturalness.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie86, trie87, "hi!", true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzzTest12.FuzzTest_add(trie13, trie15, "old1", true);
        fuzzTest0.FuzzTest_add(trie8, trie13, "hi!", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie27, trie28, "old0", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie34, trie35, "old0", false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie40, trie41, "old0", false);
        fuzzTest32.FuzzTest_add(trie35, trie40, "old0", false);
        naturalness.Trie trie48 = null;
        fuzzTest26.FuzzTest_add(trie40, trie48, "old2", true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_add(trie53, trie54, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie40, trie54, "old1", true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzzTest1.FuzzTest_add(trie4, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie19, trie20, "old0", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzzTest17.FuzzTest_add(trie20, trie25, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie9, trie25, "", false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzzTest6.FuzzTest_add(trie9, trie14, "old0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie30, trie31, "old0", false);
        fuzzTest22.FuzzTest_add(trie25, trie30, "old0", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(trie39, trie40, "old0", false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(trie45, trie46, "old0", false);
        fuzzTest22.FuzzTest_add(trie40, trie45, "old1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie14, trie45, "old1", true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie2, trie3, "old0", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzzTest0.FuzzTest_add(trie3, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_add(trie17, trie18, "old0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_add(trie23, trie24, "old0", false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_add(trie29, trie30, "old0", false);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = null;
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_add(trie37, trie38, "old0", false);
        fuzzTest34.FuzzTest_add(trie35, trie37, "old1", true);
        fuzzTest22.FuzzTest_add(trie30, trie35, "hi!", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie49, trie50, "old0", false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = null;
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_add(trie57, trie58, "old0", false);
        fuzzTest54.FuzzTest_add(trie55, trie57, "old1", true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_add(trie67, trie68, "old0", false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_add(trie73, trie74, "old0", false);
        fuzzTest65.FuzzTest_add(trie68, trie73, "old0", false);
        fuzzTest48.FuzzTest_add(trie55, trie73, "hi!", true);
        fuzzTest16.FuzzTest_add(trie30, trie73, "seed0", false);
        fuzztests.FuzzTest fuzzTest87 = new fuzztests.FuzzTest();
        naturalness.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest87.FuzzTest_add(trie88, trie89, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie30, trie89, "seed1", true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzzTest1.FuzzTest_add(trie4, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie18, trie19, "old0", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzzTest1.FuzzTest_add(trie19, trie24, "old1", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie34, trie35, "old0", false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie40, trie41, "old0", false);
        fuzzTest32.FuzzTest_add(trie35, trie40, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie24, trie40, "hi!", true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie2, trie3, "old0", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzzTest0.FuzzTest_add(trie3, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_add(trie17, trie18, "old0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_add(trie23, trie24, "old0", false);
        fuzzTest0.FuzzTest_add(trie18, trie23, "old1", false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie33, trie34, "old0", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(trie39, trie40, "old0", false);
        fuzzTest31.FuzzTest_add(trie34, trie39, "old0", false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie48, trie49, "old0", false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie54, trie55, "old0", false);
        fuzzTest31.FuzzTest_add(trie49, trie54, "old1", false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_add(trie63, trie64, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie54, trie63, "hi!", false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzzTest6.FuzzTest_add(trie9, trie14, "old0", false);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie14, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_add(trie29, trie30, "old0", false);
        fuzzTest26.FuzzTest_add(trie27, trie29, "old1", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(trie38, trie39, "old0", false);
        fuzzTest0.FuzzTest_add(trie27, trie38, "seed1", true);
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie48, trie49, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie46, trie48, "", false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        naturalness.Trie trie3 = null;
        fuzzTest1.FuzzTest_add(trie2, trie3, "", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzzTest7.FuzzTest_add(trie10, trie15, "old0", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = null;
        naturalness.Trie trie25 = null;
        fuzzTest23.FuzzTest_add(trie24, trie25, "", false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie30, trie31, "old0", false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.Trie trie36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(trie38, trie39, "old0", false);
        fuzzTest35.FuzzTest_add(trie36, trie38, "old1", true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie48, trie49, "old0", false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie54, trie55, "old0", false);
        fuzzTest46.FuzzTest_add(trie49, trie54, "old0", false);
        fuzzTest29.FuzzTest_add(trie36, trie54, "hi!", true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_add(trie67, trie68, "old0", false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_add(trie73, trie74, "old0", false);
        fuzzTest65.FuzzTest_add(trie68, trie73, "old0", false);
        fuzzTest23.FuzzTest_add(trie36, trie68, "hi!", false);
        fuzzTest1.FuzzTest_add(trie15, trie36, "seed2", true);
        fuzztests.FuzzTest fuzzTest87 = new fuzztests.FuzzTest();
        naturalness.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest87.FuzzTest_add(trie88, trie89, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie15, trie88, "", false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzzTest6.FuzzTest_add(trie9, trie14, "old0", false);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie14, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_add(trie28, trie29, "old0", false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie34, trie35, "old0", false);
        fuzzTest26.FuzzTest_add(trie29, trie34, "old0", false);
        naturalness.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie34, trie42, "old2", false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie2, trie3, "old0", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzzTest0.FuzzTest_add(trie3, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_add(trie17, trie18, "old0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie30, trie31, "old0", false);
        fuzzTest22.FuzzTest_add(trie25, trie30, "old0", false);
        naturalness.Trie trie38 = null;
        fuzzTest16.FuzzTest_add(trie30, trie38, "old2", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(trie45, trie46, "old0", false);
        fuzzTest42.FuzzTest_add(trie43, trie45, "old1", true);
        fuzzTest0.FuzzTest_add(trie38, trie45, "hi!", false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(trie58, trie59, "old0", false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie64, trie65, "old0", false);
        fuzzTest56.FuzzTest_add(trie59, trie64, "old0", false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_add(trie73, trie74, "old0", false);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_add(trie79, trie80, "old0", false);
        fuzzTest56.FuzzTest_add(trie74, trie79, "old1", false);
        fuzztests.FuzzTest fuzzTest87 = new fuzztests.FuzzTest();
        naturalness.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest87.FuzzTest_add(trie88, trie89, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie74, trie89, "seed2", false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzzTest6.FuzzTest_add(trie9, trie14, "old0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie30, trie31, "old0", false);
        fuzzTest22.FuzzTest_add(trie25, trie30, "old0", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(trie39, trie40, "old0", false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(trie45, trie46, "old0", false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.Trie trie51 = null;
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_add(trie53, trie54, "old0", false);
        fuzzTest50.FuzzTest_add(trie51, trie53, "old1", true);
        fuzzTest38.FuzzTest_add(trie46, trie51, "hi!", false);
        fuzzTest6.FuzzTest_add(trie25, trie51, "seed1", true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_add(trie68, trie69, "old0", false);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_add(trie75, trie76, "old0", false);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest80.FuzzTest_add(trie81, trie82, "old0", false);
        fuzzTest73.FuzzTest_add(trie76, trie81, "old0", false);
        naturalness.Trie trie89 = null;
        fuzzTest67.FuzzTest_add(trie81, trie89, "old2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie25, trie81, "", false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie2, trie3, "old0", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzzTest0.FuzzTest_add(trie3, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie18, trie19, "old0", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzzTest16.FuzzTest_add(trie19, trie24, "old0", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie34, trie35, "old0", false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie40, trie41, "old0", false);
        fuzzTest32.FuzzTest_add(trie35, trie40, "old0", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie49, trie50, "old0", false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(trie55, trie56, "old0", false);
        fuzzTest32.FuzzTest_add(trie50, trie55, "old1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie19, trie50, "seed0", true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzzTest0.FuzzTest_add(trie1, trie3, "old1", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie12, trie13, "old0", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie19, trie20, "old0", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzzTest17.FuzzTest_add(trie20, trie25, "old0", false);
        naturalness.Trie trie33 = null;
        fuzzTest11.FuzzTest_add(trie25, trie33, "old2", true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(trie38, trie39, "old0", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(trie46, trie47, "old0", false);
        fuzzTest43.FuzzTest_add(trie44, trie46, "old1", true);
        fuzzTest11.FuzzTest_add(trie39, trie46, "seed0", false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(trie58, trie59, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie39, trie59, "old1", true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzzTest0.FuzzTest_add(trie1, trie3, "old1", true);
        naturalness.Trie trie11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie13, trie14, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie11, trie13, "seed1", true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzzTest0.FuzzTest_add(trie1, trie3, "old1", true);
        naturalness.Trie trie11 = null;
        naturalness.Trie trie12 = null;
        fuzzTest0.FuzzTest_add(trie11, trie12, "old0", false);
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie18, trie19, "old0", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_add(trie26, trie27, "old0", false);
        fuzzTest23.FuzzTest_add(trie24, trie26, "old1", true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_add(trie36, trie37, "old0", false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_add(trie42, trie43, "old0", false);
        fuzzTest34.FuzzTest_add(trie37, trie42, "old0", false);
        fuzzTest17.FuzzTest_add(trie24, trie42, "hi!", true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(trie55, trie56, "old0", false);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_add(trie61, trie62, "old0", false);
        fuzzTest53.FuzzTest_add(trie56, trie61, "old0", false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_add(trie71, trie72, "old0", false);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_add(trie77, trie78, "old0", false);
        fuzzTest69.FuzzTest_add(trie72, trie77, "old0", false);
        fuzzTest17.FuzzTest_add(trie61, trie77, "old2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie16, trie77, "seed2", true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie2, trie3, "old0", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzzTest0.FuzzTest_add(trie3, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie18, trie19, "old0", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzzTest16.FuzzTest_add(trie19, trie24, "old0", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie33, trie34, "old0", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(trie39, trie40, "old0", false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_add(trie47, trie48, "old0", false);
        fuzzTest44.FuzzTest_add(trie45, trie47, "old1", true);
        fuzzTest32.FuzzTest_add(trie40, trie45, "hi!", false);
        fuzzTest0.FuzzTest_add(trie19, trie45, "seed1", true);
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie64, trie65, "old0", false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_add(trie70, trie71, "old0", false);
        fuzzTest62.FuzzTest_add(trie65, trie70, "old0", false);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_add(trie79, trie80, "old0", false);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        naturalness.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest84.FuzzTest_add(trie85, trie86, "old0", false);
        fuzzTest62.FuzzTest_add(trie80, trie85, "old1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie61, trie85, "seed2", false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzzTest12.FuzzTest_add(trie13, trie15, "old1", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_add(trie31, trie32, "old0", false);
        fuzzTest23.FuzzTest_add(trie26, trie31, "old0", false);
        fuzzTest6.FuzzTest_add(trie13, trie31, "hi!", true);
        naturalness.Trie trie42 = null;
        fuzzTest0.FuzzTest_add(trie13, trie42, "old2", true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_add(trie47, trie48, "old0", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_add(trie53, trie54, "old0", false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = null;
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_add(trie61, trie62, "old0", false);
        fuzzTest58.FuzzTest_add(trie59, trie61, "old1", true);
        fuzzTest46.FuzzTest_add(trie54, trie59, "hi!", false);
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie54, trie72, "old2", true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(trie20, trie21, "old0", false);
        fuzzTest12.FuzzTest_add(trie15, trie20, "old0", false);
        naturalness.Trie trie28 = null;
        fuzzTest6.FuzzTest_add(trie20, trie28, "old2", true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie33, trie34, "old0", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_add(trie41, trie42, "old0", false);
        fuzzTest38.FuzzTest_add(trie39, trie41, "old1", true);
        fuzzTest6.FuzzTest_add(trie34, trie41, "seed0", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_add(trie53, trie54, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie41, trie53, "old2", true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie5 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_add(trie4, trie5, "old0", false);
        fuzzTest1.FuzzTest_add(trie2, trie4, "old1", true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        naturalness.Trie trie14 = null;
        fuzzTest12.FuzzTest_add(trie13, trie14, "", false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie19, trie20, "old0", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie27, trie28, "old0", false);
        fuzzTest24.FuzzTest_add(trie25, trie27, "old1", true);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_add(trie37, trie38, "old0", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie43, trie44, "old0", false);
        fuzzTest35.FuzzTest_add(trie38, trie43, "old0", false);
        fuzzTest18.FuzzTest_add(trie25, trie43, "hi!", true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_add(trie56, trie57, "old0", false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_add(trie62, trie63, "old0", false);
        fuzzTest54.FuzzTest_add(trie57, trie62, "old0", false);
        fuzzTest12.FuzzTest_add(trie25, trie57, "hi!", false);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        naturalness.Trie trie74 = null;
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        naturalness.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_add(trie76, trie77, "old0", false);
        fuzzTest73.FuzzTest_add(trie74, trie76, "old1", true);
        fuzzTest1.FuzzTest_add(trie25, trie76, "seed2", false);
        naturalness.Trie trie87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie76, trie87, "seed1", true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzzTest0.FuzzTest_add(trie1, trie3, "old1", true);
        naturalness.Trie trie11 = null;
        naturalness.Trie trie12 = null;
        fuzzTest0.FuzzTest_add(trie11, trie12, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_add(trie17, trie18, "old0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie30, trie31, "old0", false);
        fuzzTest22.FuzzTest_add(trie25, trie30, "old0", false);
        naturalness.Trie trie38 = null;
        fuzzTest16.FuzzTest_add(trie30, trie38, "old2", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie43, trie44, "old0", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_add(trie51, trie52, "old0", false);
        fuzzTest48.FuzzTest_add(trie49, trie51, "old1", true);
        fuzzTest16.FuzzTest_add(trie44, trie51, "seed0", false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.Trie trie63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_add(trie65, trie66, "old0", false);
        fuzzTest62.FuzzTest_add(trie63, trie65, "old1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie51, trie65, "", true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie2, trie3, "old0", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_add(trie16, trie17, "old0", false);
        fuzzTest13.FuzzTest_add(trie14, trie16, "old1", true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_add(trie26, trie27, "old0", false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_add(trie32, trie33, "old0", false);
        fuzzTest24.FuzzTest_add(trie27, trie32, "old0", false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_add(trie41, trie42, "old0", false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_add(trie47, trie48, "old0", false);
        fuzzTest24.FuzzTest_add(trie42, trie47, "old1", false);
        fuzzTest7.FuzzTest_add(trie14, trie42, "old2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie2, trie42, "old1", false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzzTest12.FuzzTest_add(trie13, trie15, "old1", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_add(trie31, trie32, "old0", false);
        fuzzTest23.FuzzTest_add(trie26, trie31, "old0", false);
        fuzzTest6.FuzzTest_add(trie13, trie31, "hi!", true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie44, trie45, "old0", false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(trie50, trie51, "old0", false);
        fuzzTest42.FuzzTest_add(trie45, trie50, "old0", false);
        fuzzTest0.FuzzTest_add(trie13, trie45, "hi!", false);
        naturalness.Trie trie61 = null;
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie64, trie65, "old0", false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_add(trie70, trie71, "old0", false);
        fuzzTest62.FuzzTest_add(trie65, trie70, "old0", false);
        fuzzTest0.FuzzTest_add(trie61, trie65, "old0", true);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        naturalness.Trie trie82 = null;
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        naturalness.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest83.FuzzTest_add(trie84, trie85, "old0", false);
        fuzzTest81.FuzzTest_add(trie82, trie84, "old1", true);
        naturalness.Trie trie92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie84, trie92, "seed2", true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzzTest0.FuzzTest_add(trie1, trie3, "old1", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzzTest11.FuzzTest_add(trie12, trie14, "old1", true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_add(trie31, trie32, "old0", false);
        fuzzTest23.FuzzTest_add(trie26, trie31, "old0", false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie40, trie41, "old0", false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(trie46, trie47, "old0", false);
        fuzzTest23.FuzzTest_add(trie41, trie46, "old1", false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_add(trie56, trie57, "old0", false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_add(trie62, trie63, "old0", false);
        fuzzTest54.FuzzTest_add(trie57, trie62, "old0", false);
        fuzzTest22.FuzzTest_add(trie41, trie57, "old1", false);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_add(trie74, trie75, "old0", false);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie80, trie81, "old0", false);
        fuzzTest22.FuzzTest_add(trie74, trie81, "old2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie14, trie74, "seed0", false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie2, trie3, "old0", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzzTest0.FuzzTest_add(trie3, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie19, trie20, "old0", false);
        fuzzTest16.FuzzTest_add(trie17, trie19, "old1", true);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_add(trie29, trie30, "old0", false);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie35, trie36, "old0", false);
        fuzzTest27.FuzzTest_add(trie30, trie35, "old0", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie44, trie45, "old0", false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(trie50, trie51, "old0", false);
        fuzzTest27.FuzzTest_add(trie45, trie50, "old1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie19, trie50, "hi!", true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie13, trie14, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie7, trie14, "old0", true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzzTest1.FuzzTest_add(trie4, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie18, trie19, "old0", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzzTest1.FuzzTest_add(trie19, trie24, "old1", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie34, trie35, "old0", false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie40, trie41, "old0", false);
        fuzzTest32.FuzzTest_add(trie35, trie40, "old0", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie49, trie50, "old0", false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(trie55, trie56, "old0", false);
        fuzzTest32.FuzzTest_add(trie50, trie55, "old1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie19, trie50, "hi!", false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzzTest1.FuzzTest_add(trie4, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie18, trie19, "old0", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzzTest1.FuzzTest_add(trie19, trie24, "old1", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie34, trie35, "old0", false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie40, trie41, "old0", false);
        fuzzTest32.FuzzTest_add(trie35, trie40, "old0", false);
        fuzzTest0.FuzzTest_add(trie19, trie35, "old1", false);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_add(trie52, trie53, "old0", false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(trie58, trie59, "old0", false);
        fuzzTest0.FuzzTest_add(trie52, trie59, "old2", false);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.Trie trie67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie69, trie70, "old0", false);
        fuzzTest66.FuzzTest_add(trie67, trie69, "old1", true);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_add(trie78, trie79, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie69, trie79, "seed2", true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie8, trie12, "seed0", false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzzTest7.FuzzTest_add(trie10, trie15, "old0", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie30, trie31, "old0", false);
        fuzzTest7.FuzzTest_add(trie25, trie30, "old1", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie40, trie41, "old0", false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(trie46, trie47, "old0", false);
        fuzzTest38.FuzzTest_add(trie41, trie46, "old0", false);
        fuzzTest6.FuzzTest_add(trie25, trie41, "old1", false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_add(trie60, trie61, "old0", false);
        fuzzTest57.FuzzTest_add(trie58, trie60, "old1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie25, trie60, "old0", true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzzTest6.FuzzTest_add(trie9, trie14, "old0", false);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie14, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie27, trie28, "old0", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie35, trie36, "old0", false);
        fuzzTest32.FuzzTest_add(trie33, trie35, "old1", true);
        fuzzTest0.FuzzTest_add(trie28, trie35, "seed0", false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.Trie trie47 = null;
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_add(trie47, trie48, "seed0", true);
        naturalness.Trie trie52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie54, trie55, "old0", false);
        fuzzTest46.FuzzTest_add(trie52, trie54, "seed2", false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.Trie trie63 = null;
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_add(trie63, trie64, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie54, trie64, "seed1", true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzzTest6.FuzzTest_add(trie9, trie14, "old0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_add(trie23, trie24, "old0", false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_add(trie29, trie30, "old0", false);
        fuzzTest6.FuzzTest_add(trie24, trie29, "old1", false);
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie24, trie37, "seed1", false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzzTest12.FuzzTest_add(trie13, trie15, "old1", true);
        fuzzTest0.FuzzTest_add(trie8, trie13, "hi!", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_add(trie28, trie29, "old0", false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie34, trie35, "old0", false);
        fuzzTest26.FuzzTest_add(trie29, trie34, "old0", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie43, trie44, "old0", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_add(trie51, trie52, "old0", false);
        fuzzTest48.FuzzTest_add(trie49, trie51, "old1", true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_add(trie61, trie62, "old0", false);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_add(trie67, trie68, "old0", false);
        fuzzTest59.FuzzTest_add(trie62, trie67, "old0", false);
        fuzzTest42.FuzzTest_add(trie49, trie67, "hi!", true);
        fuzzTest0.FuzzTest_add(trie34, trie49, "old2", true);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        naturalness.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_add(trie82, trie83, "old0", false);
        fuzztests.FuzzTest fuzzTest87 = new fuzztests.FuzzTest();
        naturalness.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest87.FuzzTest_add(trie88, trie89, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie82, trie88, "old1", true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzzTest1.FuzzTest_add(trie4, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie18, trie19, "old0", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzzTest1.FuzzTest_add(trie19, trie24, "old1", false);
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie24, trie32, "seed1", true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzzTest6.FuzzTest_add(trie7, trie9, "old1", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie19, trie20, "old0", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzzTest17.FuzzTest_add(trie20, trie25, "old0", false);
        fuzzTest0.FuzzTest_add(trie7, trie25, "hi!", true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.Trie trie37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(trie39, trie40, "old0", false);
        fuzzTest36.FuzzTest_add(trie37, trie39, "old1", true);
        naturalness.Trie trie47 = null;
        fuzzTest0.FuzzTest_add(trie37, trie47, "old1", true);
        naturalness.Trie trie51 = null;
        naturalness.Trie trie52 = null;
        fuzzTest0.FuzzTest_add(trie51, trie52, "old2", true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.Trie trie57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie59, trie60, "old0", false);
        fuzzTest56.FuzzTest_add(trie57, trie59, "old1", true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_add(trie68, trie69, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie59, trie68, "hi!", true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzzTest0.FuzzTest_add(trie1, trie3, "old1", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(trie12, trie13, "old0", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie18, trie19, "old0", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_add(trie32, trie33, "old0", false);
        fuzzTest29.FuzzTest_add(trie30, trie32, "old1", true);
        fuzzTest17.FuzzTest_add(trie25, trie30, "hi!", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie44, trie45, "old0", false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = null;
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_add(trie52, trie53, "old0", false);
        fuzzTest49.FuzzTest_add(trie50, trie52, "old1", true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_add(trie62, trie63, "old0", false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_add(trie68, trie69, "old0", false);
        fuzzTest60.FuzzTest_add(trie63, trie68, "old0", false);
        fuzzTest43.FuzzTest_add(trie50, trie68, "hi!", true);
        fuzzTest11.FuzzTest_add(trie25, trie68, "seed0", false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.Trie trie83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_add(trie83, trie84, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie68, trie83, "", false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie2, trie3, "old0", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        naturalness.Trie trie13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_add(trie21, trie22, "old0", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie27, trie28, "old0", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie35, trie36, "old0", false);
        fuzzTest32.FuzzTest_add(trie33, trie35, "old1", true);
        fuzzTest20.FuzzTest_add(trie28, trie33, "hi!", false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_add(trie47, trie48, "old0", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = null;
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(trie55, trie56, "old0", false);
        fuzzTest52.FuzzTest_add(trie53, trie55, "old1", true);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_add(trie65, trie66, "old0", false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_add(trie71, trie72, "old0", false);
        fuzzTest63.FuzzTest_add(trie66, trie71, "old0", false);
        fuzzTest46.FuzzTest_add(trie53, trie71, "hi!", true);
        fuzzTest14.FuzzTest_add(trie28, trie71, "seed0", false);
        fuzzTest7.FuzzTest_add(trie13, trie71, "seed2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie3, trie71, "seed1", true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzzTest6.FuzzTest_add(trie7, trie9, "old1", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie19, trie20, "old0", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzzTest17.FuzzTest_add(trie20, trie25, "old0", false);
        fuzzTest0.FuzzTest_add(trie7, trie25, "hi!", true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(trie38, trie39, "old0", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie44, trie45, "old0", false);
        fuzzTest36.FuzzTest_add(trie39, trie44, "old0", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie54, trie55, "old0", false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_add(trie60, trie61, "old0", false);
        fuzzTest52.FuzzTest_add(trie55, trie60, "old0", false);
        fuzzTest0.FuzzTest_add(trie44, trie60, "old2", false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_add(trie72, trie73, "old0", false);
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie73, trie77, "old2", false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzzTest6.FuzzTest_add(trie7, trie9, "old1", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie19, trie20, "old0", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzzTest17.FuzzTest_add(trie20, trie25, "old0", false);
        fuzzTest0.FuzzTest_add(trie7, trie25, "hi!", true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.Trie trie37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(trie39, trie40, "old0", false);
        fuzzTest36.FuzzTest_add(trie37, trie39, "old1", true);
        naturalness.Trie trie47 = null;
        fuzzTest0.FuzzTest_add(trie37, trie47, "old1", true);
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = null;
        naturalness.Trie trie54 = null;
        fuzzTest52.FuzzTest_add(trie53, trie54, "", false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_add(trie60, trie61, "old0", false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_add(trie66, trie67, "old0", false);
        fuzzTest58.FuzzTest_add(trie61, trie66, "old0", false);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_add(trie75, trie76, "old0", false);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest80.FuzzTest_add(trie81, trie82, "old0", false);
        fuzzTest58.FuzzTest_add(trie76, trie81, "old1", false);
        naturalness.Trie trie89 = null;
        fuzzTest52.FuzzTest_add(trie76, trie89, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie51, trie76, "seed1", false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        naturalness.Trie trie12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(trie20, trie21, "old0", false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_add(trie26, trie27, "old0", false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie34, trie35, "old0", false);
        fuzzTest31.FuzzTest_add(trie32, trie34, "old1", true);
        fuzzTest19.FuzzTest_add(trie27, trie32, "hi!", false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(trie46, trie47, "old0", false);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.Trie trie52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie54, trie55, "old0", false);
        fuzzTest51.FuzzTest_add(trie52, trie54, "old1", true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie64, trie65, "old0", false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_add(trie70, trie71, "old0", false);
        fuzzTest62.FuzzTest_add(trie65, trie70, "old0", false);
        fuzzTest45.FuzzTest_add(trie52, trie70, "hi!", true);
        fuzzTest13.FuzzTest_add(trie27, trie70, "seed0", false);
        fuzzTest6.FuzzTest_add(trie12, trie70, "seed2", false);
        naturalness.Trie trie87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie70, trie87, "seed2", false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzzTest12.FuzzTest_add(trie13, trie15, "old1", true);
        fuzzTest0.FuzzTest_add(trie8, trie13, "hi!", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie27, trie28, "old0", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie34, trie35, "old0", false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie40, trie41, "old0", false);
        fuzzTest32.FuzzTest_add(trie35, trie40, "old0", false);
        naturalness.Trie trie48 = null;
        fuzzTest26.FuzzTest_add(trie40, trie48, "old2", true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_add(trie53, trie54, "old0", false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = null;
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_add(trie61, trie62, "old0", false);
        fuzzTest58.FuzzTest_add(trie59, trie61, "old1", true);
        fuzzTest26.FuzzTest_add(trie54, trie61, "seed0", false);
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie73 = null;
        fuzzTest26.FuzzTest_add(trie72, trie73, "", false);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.Trie trie78 = null;
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie80, trie81, "old0", false);
        fuzzTest77.FuzzTest_add(trie78, trie80, "old1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie72, trie80, "", false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "seed0", true);
        naturalness.Trie trie6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzzTest7.FuzzTest_add(trie10, trie15, "old0", false);
        fuzzTest0.FuzzTest_add(trie6, trie10, "seed2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie27, trie28, "old0", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie33, trie34, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie27, trie33, "", false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie13, trie14, "old0", false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_add(trie21, trie22, "old0", false);
        fuzzTest18.FuzzTest_add(trie19, trie21, "old1", true);
        fuzzTest6.FuzzTest_add(trie14, trie19, "hi!", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie33, trie34, "old0", false);
        naturalness.Trie trie38 = null;
        fuzzTest6.FuzzTest_add(trie33, trie38, "", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        naturalness.Trie trie44 = null;
        fuzzTest42.FuzzTest_add(trie43, trie44, "", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(trie50, trie51, "old0", false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_add(trie56, trie57, "old0", false);
        fuzzTest48.FuzzTest_add(trie51, trie56, "old0", false);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_add(trie65, trie66, "old0", false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_add(trie71, trie72, "old0", false);
        fuzzTest48.FuzzTest_add(trie66, trie71, "old1", false);
        naturalness.Trie trie79 = null;
        fuzzTest42.FuzzTest_add(trie66, trie79, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie33, trie66, "old0", false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(trie20, trie21, "old0", false);
        fuzzTest12.FuzzTest_add(trie15, trie20, "old0", false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_add(trie29, trie30, "old0", false);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie35, trie36, "old0", false);
        fuzzTest12.FuzzTest_add(trie30, trie35, "old1", false);
        naturalness.Trie trie43 = null;
        fuzzTest6.FuzzTest_add(trie30, trie43, "", true);
        naturalness.Trie trie47 = null;
        fuzzTest0.FuzzTest_add(trie30, trie47, "old1", false);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.Trie trie52 = null;
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_add(trie52, trie53, "seed0", true);
        naturalness.Trie trie57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie59, trie60, "old0", false);
        fuzzTest51.FuzzTest_add(trie57, trie59, "seed2", false);
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie59, trie67, "old1", true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        naturalness.Trie trie6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = null;
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "seed0", true);
        naturalness.Trie trie13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_add(trie17, trie18, "old0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_add(trie23, trie24, "old0", false);
        fuzzTest15.FuzzTest_add(trie18, trie23, "old0", false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_add(trie32, trie33, "old0", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_add(trie38, trie39, "old0", false);
        fuzzTest15.FuzzTest_add(trie33, trie38, "old1", false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie48, trie49, "old0", false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie54, trie55, "old0", false);
        fuzzTest46.FuzzTest_add(trie49, trie54, "old0", false);
        fuzzTest14.FuzzTest_add(trie33, trie49, "old1", false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_add(trie66, trie67, "old0", false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_add(trie72, trie73, "old0", false);
        fuzzTest14.FuzzTest_add(trie66, trie73, "old2", false);
        fuzzTest7.FuzzTest_add(trie13, trie73, "seed1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie6, trie73, "seed2", false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzzTest0.FuzzTest_add(trie1, trie3, "old1", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.Trie trie12 = null;
        naturalness.Trie trie13 = null;
        fuzzTest11.FuzzTest_add(trie12, trie13, "", false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie19, trie20, "old0", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzzTest17.FuzzTest_add(trie20, trie25, "old0", false);
        naturalness.Trie trie33 = null;
        fuzzTest11.FuzzTest_add(trie25, trie33, "old2", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(trie39, trie40, "old0", false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(trie45, trie46, "old0", false);
        fuzzTest37.FuzzTest_add(trie40, trie45, "old0", false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie54, trie55, "old0", false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_add(trie60, trie61, "old0", false);
        fuzzTest37.FuzzTest_add(trie55, trie60, "old1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie25, trie55, "old0", true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie13, trie14, "old0", false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_add(trie21, trie22, "old0", false);
        fuzzTest18.FuzzTest_add(trie19, trie21, "old1", true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_add(trie31, trie32, "old0", false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_add(trie37, trie38, "old0", false);
        fuzzTest29.FuzzTest_add(trie32, trie37, "old0", false);
        fuzzTest12.FuzzTest_add(trie19, trie37, "hi!", true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(trie50, trie51, "old0", false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_add(trie56, trie57, "old0", false);
        fuzzTest48.FuzzTest_add(trie51, trie56, "old0", false);
        fuzzTest6.FuzzTest_add(trie19, trie51, "hi!", false);
        naturalness.Trie trie67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_add(trie69, trie70, "old0", false);
        fuzzTest6.FuzzTest_add(trie67, trie69, "seed0", false);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_add(trie78, trie79, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie69, trie78, "hi!", false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzzTest6.FuzzTest_add(trie9, trie14, "old0", false);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie14, trie22, "old2", true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie27, trie28, "old0", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie35, trie36, "old0", false);
        fuzzTest32.FuzzTest_add(trie33, trie35, "old1", true);
        fuzzTest0.FuzzTest_add(trie28, trie35, "seed0", false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_add(trie47, trie48, "old0", false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_add(trie53, trie54, "old0", false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie59, trie60, "old0", false);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.Trie trie65 = null;
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_add(trie67, trie68, "old0", false);
        fuzzTest64.FuzzTest_add(trie65, trie67, "old1", true);
        fuzzTest52.FuzzTest_add(trie60, trie65, "hi!", false);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_add(trie79, trie80, "old0", false);
        naturalness.Trie trie84 = null;
        fuzzTest52.FuzzTest_add(trie79, trie84, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie48, trie79, "seed2", true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = null;
        fuzzTest6.FuzzTest_add(trie7, trie8, "", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(trie20, trie21, "old0", false);
        fuzzTest12.FuzzTest_add(trie15, trie20, "old0", false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_add(trie29, trie30, "old0", false);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie35, trie36, "old0", false);
        fuzzTest12.FuzzTest_add(trie30, trie35, "old1", false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(trie45, trie46, "old0", false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_add(trie51, trie52, "old0", false);
        fuzzTest43.FuzzTest_add(trie46, trie51, "old0", false);
        fuzzTest6.FuzzTest_add(trie35, trie51, "seed2", false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie64, trie65, "old0", false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_add(trie70, trie71, "old0", false);
        fuzzTest62.FuzzTest_add(trie65, trie70, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie35, trie70, "hi!", false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzzTest6.FuzzTest_add(trie9, trie14, "old0", false);
        naturalness.Trie trie22 = null;
        fuzzTest0.FuzzTest_add(trie14, trie22, "old2", false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.Trie trie27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_add(trie27, trie28, "old0", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie33, trie34, "old0", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(trie39, trie40, "old0", false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_add(trie47, trie48, "old0", false);
        fuzzTest44.FuzzTest_add(trie45, trie47, "old1", true);
        fuzzTest32.FuzzTest_add(trie40, trie45, "hi!", false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie59, trie60, "old0", false);
        naturalness.Trie trie64 = null;
        fuzzTest32.FuzzTest_add(trie59, trie64, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie27, trie59, "old0", false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzzTest6.FuzzTest_add(trie9, trie14, "old0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_add(trie23, trie24, "old0", false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_add(trie29, trie30, "old0", false);
        fuzzTest6.FuzzTest_add(trie24, trie29, "old1", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(trie39, trie40, "old0", false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(trie45, trie46, "old0", false);
        fuzzTest37.FuzzTest_add(trie40, trie45, "old0", false);
        fuzzTest0.FuzzTest_add(trie29, trie45, "seed2", false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.Trie trie57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie59, trie60, "old0", false);
        fuzzTest56.FuzzTest_add(trie57, trie59, "old1", true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_add(trie68, trie69, "old0", false);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_add(trie75, trie76, "old0", false);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest80.FuzzTest_add(trie81, trie82, "old0", false);
        fuzzTest73.FuzzTest_add(trie76, trie81, "old0", false);
        naturalness.Trie trie89 = null;
        fuzzTest67.FuzzTest_add(trie81, trie89, "old2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie59, trie81, "", true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "seed0", true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzzTest7.FuzzTest_add(trie10, trie15, "old0", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie30, trie31, "old0", false);
        fuzzTest7.FuzzTest_add(trie25, trie30, "old1", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie40, trie41, "old0", false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(trie46, trie47, "old0", false);
        fuzzTest38.FuzzTest_add(trie41, trie46, "old0", false);
        fuzzTest6.FuzzTest_add(trie25, trie41, "old1", false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(trie58, trie59, "old0", false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie64, trie65, "old0", false);
        fuzzTest6.FuzzTest_add(trie58, trie65, "old2", false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_add(trie74, trie75, "old0", false);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie80, trie81, "old0", false);
        fuzzTest72.FuzzTest_add(trie75, trie80, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie58, trie75, "old1", false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_add(trie21, trie22, "old0", false);
        fuzzTest13.FuzzTest_add(trie16, trie21, "old0", false);
        naturalness.Trie trie29 = null;
        fuzzTest7.FuzzTest_add(trie21, trie29, "old2", true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie34, trie35, "old0", false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = null;
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_add(trie42, trie43, "old0", false);
        fuzzTest39.FuzzTest_add(trie40, trie42, "old1", true);
        fuzzTest7.FuzzTest_add(trie35, trie42, "seed0", false);
        naturalness.Trie trie53 = null;
        fuzzTest6.FuzzTest_add(trie42, trie53, "old1", false);
        naturalness.Trie trie57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_add(trie60, trie61, "old0", false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_add(trie66, trie67, "old0", false);
        fuzzTest58.FuzzTest_add(trie61, trie66, "old0", false);
        fuzzTest6.FuzzTest_add(trie57, trie61, "old1", false);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.Trie trie78 = null;
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_add(trie80, trie81, "old0", false);
        fuzzTest77.FuzzTest_add(trie78, trie80, "old1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie61, trie80, "seed2", true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie2, trie3, "old0", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzzTest0.FuzzTest_add(trie3, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie18, trie19, "old0", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzzTest16.FuzzTest_add(trie19, trie24, "old0", false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(trie34, trie35, "old0", false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie40, trie41, "old0", false);
        fuzzTest32.FuzzTest_add(trie35, trie40, "old0", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(trie50, trie51, "old0", false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_add(trie56, trie57, "old0", false);
        fuzzTest48.FuzzTest_add(trie51, trie56, "old0", false);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_add(trie65, trie66, "old0", false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_add(trie71, trie72, "old0", false);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.Trie trie77 = null;
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_add(trie79, trie80, "old0", false);
        fuzzTest76.FuzzTest_add(trie77, trie79, "old1", true);
        fuzzTest64.FuzzTest_add(trie72, trie77, "hi!", false);
        fuzzTest32.FuzzTest_add(trie51, trie77, "seed1", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie24, trie51, "hi!", false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie2, trie3, "old0", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzzTest0.FuzzTest_add(trie3, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_add(trie17, trie18, "old0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_add(trie23, trie24, "old0", false);
        fuzzTest0.FuzzTest_add(trie18, trie23, "old1", false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_add(trie32, trie33, "old0", false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(trie39, trie40, "old0", false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(trie45, trie46, "old0", false);
        fuzzTest37.FuzzTest_add(trie40, trie45, "old0", false);
        naturalness.Trie trie53 = null;
        fuzzTest31.FuzzTest_add(trie45, trie53, "old2", true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(trie58, trie59, "old0", false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = null;
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_add(trie66, trie67, "old0", false);
        fuzzTest63.FuzzTest_add(trie64, trie66, "old1", true);
        fuzzTest31.FuzzTest_add(trie59, trie66, "seed0", false);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.Trie trie78 = null;
        naturalness.Trie trie79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_add(trie78, trie79, "seed0", true);
        naturalness.Trie trie83 = null;
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        naturalness.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest84.FuzzTest_add(trie85, trie86, "old0", false);
        fuzzTest77.FuzzTest_add(trie83, trie85, "seed2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie59, trie85, "hi!", true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzzTest6.FuzzTest_add(trie7, trie9, "old1", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie19, trie20, "old0", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzzTest17.FuzzTest_add(trie20, trie25, "old0", false);
        fuzzTest0.FuzzTest_add(trie7, trie25, "hi!", true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_add(trie37, trie38, "old0", false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(trie45, trie46, "old0", false);
        fuzzTest42.FuzzTest_add(trie43, trie45, "old1", true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(trie55, trie56, "old0", false);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_add(trie61, trie62, "old0", false);
        fuzzTest53.FuzzTest_add(trie56, trie61, "old0", false);
        fuzzTest36.FuzzTest_add(trie43, trie61, "hi!", true);
        naturalness.Trie trie72 = null;
        fuzzTest0.FuzzTest_add(trie61, trie72, "old1", false);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_add(trie77, trie78, "old0", false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.Trie trie83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_add(trie83, trie84, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie77, trie84, "hi!", true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzzTest0.FuzzTest_add(trie1, trie3, "old1", true);
        naturalness.Trie trie11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(trie20, trie21, "old0", false);
        fuzzTest12.FuzzTest_add(trie15, trie20, "old0", false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_add(trie29, trie30, "old0", false);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie35, trie36, "old0", false);
        fuzzTest12.FuzzTest_add(trie30, trie35, "old1", false);
        fuzzTest0.FuzzTest_add(trie11, trie30, "hi!", true);
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie49, trie50, "old0", false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(trie55, trie56, "old0", false);
        fuzzTest47.FuzzTest_add(trie50, trie55, "old0", false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie64, trie65, "old0", false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_add(trie70, trie71, "old0", false);
        fuzzTest47.FuzzTest_add(trie65, trie70, "old1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie46, trie70, "hi!", false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzzTest6.FuzzTest_add(trie9, trie14, "old0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_add(trie23, trie24, "old0", false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_add(trie29, trie30, "old0", false);
        fuzzTest6.FuzzTest_add(trie24, trie29, "old1", false);
        naturalness.Trie trie37 = null;
        fuzzTest0.FuzzTest_add(trie24, trie37, "", true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.Trie trie42 = null;
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_add(trie42, trie43, "seed0", true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie48, trie49, "old0", false);
        naturalness.Trie trie53 = null;
        fuzzTest41.FuzzTest_add(trie49, trie53, "old0", false);
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie49, trie57, "hi!", true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzzTest0.FuzzTest_add(trie1, trie3, "old1", true);
        naturalness.Trie trie11 = null;
        naturalness.Trie trie12 = null;
        fuzzTest0.FuzzTest_add(trie11, trie12, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_add(trie17, trie18, "old0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzzTest22.FuzzTest_add(trie23, trie25, "old1", true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.Trie trie35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_add(trie35, trie36, "old0", false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_add(trie41, trie42, "old0", false);
        fuzzTest33.FuzzTest_add(trie36, trie41, "old0", false);
        fuzzTest16.FuzzTest_add(trie23, trie41, "hi!", true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = null;
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(trie55, trie56, "old0", false);
        fuzzTest52.FuzzTest_add(trie53, trie55, "old1", true);
        naturalness.Trie trie63 = null;
        fuzzTest16.FuzzTest_add(trie53, trie63, "old1", true);
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie68 = null;
        fuzzTest16.FuzzTest_add(trie67, trie68, "seed0", true);
        naturalness.Trie trie72 = null;
        fuzzTest0.FuzzTest_add(trie68, trie72, "", true);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_add(trie77, trie78, "old0", false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.Trie trie83 = null;
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        naturalness.Trie trie85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest84.FuzzTest_add(trie85, trie86, "old0", false);
        fuzzTest82.FuzzTest_add(trie83, trie85, "seed2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie77, trie85, "seed1", false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(trie14, trie15, "old0", false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_add(trie20, trie21, "old0", false);
        fuzzTest12.FuzzTest_add(trie15, trie20, "old0", false);
        naturalness.Trie trie28 = null;
        fuzzTest6.FuzzTest_add(trie20, trie28, "old2", true);
        naturalness.Trie trie32 = null;
        fuzzTest0.FuzzTest_add(trie28, trie32, "seed2", false);
        naturalness.Trie trie36 = null;
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie36, trie37, "seed0", false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_add(trie43, trie44, "old0", false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_add(trie49, trie50, "old0", false);
        fuzzTest41.FuzzTest_add(trie44, trie49, "old0", false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(trie58, trie59, "old0", false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_add(trie65, trie66, "old0", false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_add(trie71, trie72, "old0", false);
        fuzzTest63.FuzzTest_add(trie66, trie71, "old0", false);
        naturalness.Trie trie79 = null;
        fuzzTest57.FuzzTest_add(trie71, trie79, "old2", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie49, trie71, "", false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "seed0", true);
        naturalness.Trie trie6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzzTest0.FuzzTest_add(trie6, trie8, "seed2", false);
        naturalness.Trie trie16 = null;
        naturalness.Trie trie17 = null;
        fuzzTest0.FuzzTest_add(trie16, trie17, "seed2", true);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.Trie trie22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzzTest21.FuzzTest_add(trie22, trie24, "old1", true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_add(trie33, trie34, "old0", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie40, trie41, "old0", false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(trie46, trie47, "old0", false);
        fuzzTest38.FuzzTest_add(trie41, trie46, "old0", false);
        naturalness.Trie trie54 = null;
        fuzzTest32.FuzzTest_add(trie46, trie54, "old2", true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_add(trie59, trie60, "old0", false);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.Trie trie65 = null;
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_add(trie67, trie68, "old0", false);
        fuzzTest64.FuzzTest_add(trie65, trie67, "old1", true);
        fuzzTest32.FuzzTest_add(trie60, trie67, "seed0", false);
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie79 = null;
        fuzzTest32.FuzzTest_add(trie78, trie79, "", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie24, trie78, "", true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzzTest0.FuzzTest_add(trie1, trie3, "old1", true);
        naturalness.Trie trie11 = null;
        naturalness.Trie trie12 = null;
        fuzzTest0.FuzzTest_add(trie11, trie12, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_add(trie17, trie18, "seed0", true);
        naturalness.Trie trie22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_add(trie31, trie32, "old0", false);
        fuzzTest23.FuzzTest_add(trie26, trie31, "old0", false);
        fuzzTest16.FuzzTest_add(trie22, trie26, "seed2", true);
        naturalness.Trie trie42 = null;
        fuzzTest0.FuzzTest_add(trie22, trie42, "", false);
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.Trie trie48 = null;
        naturalness.Trie trie49 = null;
        fuzzTest47.FuzzTest_add(trie48, trie49, "", false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_add(trie55, trie56, "old0", false);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_add(trie61, trie62, "old0", false);
        fuzzTest53.FuzzTest_add(trie56, trie61, "old0", false);
        naturalness.Trie trie69 = null;
        fuzzTest47.FuzzTest_add(trie61, trie69, "old2", false);
        naturalness.Trie trie73 = null;
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.Trie trie75 = null;
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.Trie trie77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_add(trie77, trie78, "old0", false);
        fuzzTest74.FuzzTest_add(trie75, trie77, "old1", true);
        fuzzTest47.FuzzTest_add(trie73, trie77, "", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie46, trie77, "hi!", true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.Trie trie21 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_add(trie21, trie22, "old0", false);
        fuzzTest13.FuzzTest_add(trie16, trie21, "old0", false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie30, trie31, "old0", false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_add(trie36, trie37, "old0", false);
        fuzzTest13.FuzzTest_add(trie31, trie36, "old1", false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(trie46, trie47, "old0", false);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_add(trie52, trie53, "old0", false);
        fuzzTest44.FuzzTest_add(trie47, trie52, "old0", false);
        fuzzTest12.FuzzTest_add(trie31, trie47, "old1", false);
        naturalness.Trie trie63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.Trie trie65 = null;
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_add(trie65, trie66, "seed0", true);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_add(trie71, trie72, "old0", false);
        naturalness.Trie trie76 = null;
        fuzzTest64.FuzzTest_add(trie72, trie76, "old0", false);
        fuzzTest12.FuzzTest_add(trie63, trie72, "old1", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie7, trie72, "seed1", false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "old0", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_add(trie7, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzzTest12.FuzzTest_add(trie13, trie15, "old1", true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_add(trie31, trie32, "old0", false);
        fuzzTest23.FuzzTest_add(trie26, trie31, "old0", false);
        fuzzTest6.FuzzTest_add(trie13, trie31, "hi!", true);
        naturalness.Trie trie42 = null;
        fuzzTest0.FuzzTest_add(trie13, trie42, "old2", true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.Trie trie47 = null;
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_add(trie47, trie48, "seed0", true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_add(trie53, trie54, "old0", false);
        naturalness.Trie trie58 = null;
        fuzzTest46.FuzzTest_add(trie54, trie58, "old0", false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_add(trie63, trie64, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie54, trie64, "old0", true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(trie1, trie2, "seed0", true);
        naturalness.Trie trie6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzzTest0.FuzzTest_add(trie6, trie8, "seed2", false);
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        fuzzTest17.FuzzTest_add(trie18, trie19, "", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_add(trie31, trie32, "old0", false);
        fuzzTest23.FuzzTest_add(trie26, trie31, "old0", false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie40, trie41, "old0", false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(trie46, trie47, "old0", false);
        fuzzTest23.FuzzTest_add(trie41, trie46, "old1", false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.Trie trie56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_add(trie56, trie57, "old0", false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.Trie trie62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_add(trie62, trie63, "old0", false);
        fuzzTest54.FuzzTest_add(trie57, trie62, "old0", false);
        fuzzTest17.FuzzTest_add(trie46, trie62, "seed2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie16, trie46, "old1", true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = null;
        naturalness.Trie trie4 = null;
        fuzzTest2.FuzzTest_add(trie3, trie4, "", false);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_add(trie10, trie11, "old0", false);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_add(trie16, trie17, "old0", false);
        fuzzTest8.FuzzTest_add(trie11, trie16, "old0", false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_add(trie31, trie32, "old0", false);
        fuzzTest8.FuzzTest_add(trie26, trie31, "old1", false);
        naturalness.Trie trie39 = null;
        fuzzTest2.FuzzTest_add(trie26, trie39, "", true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_add(trie44, trie45, "old0", false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_add(trie50, trie51, "old0", false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.Trie trie56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(trie58, trie59, "old0", false);
        fuzzTest55.FuzzTest_add(trie56, trie58, "old1", true);
        fuzzTest43.FuzzTest_add(trie51, trie56, "hi!", false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.Trie trie70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_add(trie70, trie71, "old0", false);
        naturalness.Trie trie75 = null;
        fuzzTest43.FuzzTest_add(trie70, trie75, "", false);
        naturalness.Trie trie79 = null;
        fuzzTest2.FuzzTest_add(trie70, trie79, "old0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie1, trie70, "old0", true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(trie3, trie4, "old0", false);
        fuzzTest0.FuzzTest_add(trie1, trie3, "seed2", true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(trie13, trie14, "old0", false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_add(trie19, trie20, "old0", false);
        fuzzTest11.FuzzTest_add(trie14, trie19, "old0", false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = null;
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_add(trie28, trie29, "seed0", true);
        naturalness.Trie trie33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.Trie trie36 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_add(trie36, trie37, "old0", false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.Trie trie42 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_add(trie42, trie43, "old0", false);
        fuzzTest34.FuzzTest_add(trie37, trie42, "old0", false);
        fuzzTest27.FuzzTest_add(trie33, trie37, "seed2", true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_add(trie54, trie55, "seed0", true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_add(trie60, trie61, "old0", false);
        naturalness.Trie trie65 = null;
        fuzzTest53.FuzzTest_add(trie61, trie65, "old0", false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.Trie trie70 = null;
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.Trie trie72 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_add(trie72, trie73, "old0", false);
        fuzzTest69.FuzzTest_add(trie70, trie72, "old1", true);
        fuzzTest27.FuzzTest_add(trie61, trie70, "old1", false);
        fuzzTest0.FuzzTest_add(trie14, trie70, "seed2", true);
        fuzztests.FuzzTest fuzzTest86 = new fuzztests.FuzzTest();
        naturalness.Trie trie87 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest86.FuzzTest_add(trie87, trie88, "old0", false);
        naturalness.Trie trie92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie87, trie92, "old1", true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.Trie trie15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_add(trie15, trie16, "old0", false);
        fuzzTest7.FuzzTest_add(trie10, trie15, "old0", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_add(trie24, trie25, "old0", false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.Trie trie30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(trie30, trie31, "old0", false);
        fuzzTest7.FuzzTest_add(trie25, trie30, "old1", false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(trie40, trie41, "old0", false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(trie46, trie47, "old0", false);
        fuzzTest38.FuzzTest_add(trie41, trie46, "old0", false);
        fuzzTest6.FuzzTest_add(trie25, trie41, "old1", false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_add(trie58, trie59, "old0", false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.Trie trie64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_add(trie64, trie65, "old0", false);
        fuzzTest6.FuzzTest_add(trie58, trie65, "old2", false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.Trie trie73 = null;
        naturalness.Trie trie74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_add(trie73, trie74, "seed0", true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie65, trie74, "seed0", false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        fuzzTest0.FuzzTest_add(trie1, trie2, "", false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(trie9, trie10, "old0", false);
        fuzzTest6.FuzzTest_add(trie7, trie9, "old1", true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_add(trie18, trie19, "old0", false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_add(trie25, trie26, "old0", false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.Trie trie31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_add(trie31, trie32, "old0", false);
        fuzzTest23.FuzzTest_add(trie26, trie31, "old0", false);
        naturalness.Trie trie39 = null;
        fuzzTest17.FuzzTest_add(trie31, trie39, "old2", true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.Trie trie45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_add(trie45, trie46, "old0", false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.Trie trie51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_add(trie51, trie52, "old0", false);
        fuzzTest43.FuzzTest_add(trie46, trie51, "old0", false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_add(trie60, trie61, "old0", false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.Trie trie66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_add(trie66, trie67, "old0", false);
        fuzzTest43.FuzzTest_add(trie61, trie66, "old1", false);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.Trie trie75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_add(trie75, trie76, "old0", false);
        fuzzTest17.FuzzTest_add(trie66, trie75, "seed2", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie9, trie75, "seed0", false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_add(trie2, trie3, "old0", false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_add(trie8, trie9, "old0", false);
        fuzzTest0.FuzzTest_add(trie3, trie8, "old0", false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_add(trie17, trie18, "old0", false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.Trie trie23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_add(trie23, trie24, "old0", false);
        fuzzTest0.FuzzTest_add(trie18, trie23, "old1", false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_add(trie32, trie33, "seed0", true);
        naturalness.Trie trie37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_add(trie39, trie40, "old0", false);
        fuzzTest31.FuzzTest_add(trie37, trie39, "seed2", false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.Trie trie48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_add(trie48, trie49, "old0", false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(trie39, trie48, "", false);
    }
}

