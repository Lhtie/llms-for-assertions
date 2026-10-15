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
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 2, (java.lang.Integer) 100, (java.lang.Integer) 0, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 2, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 1, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = null;
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph16, intDefaultListenableGraph17, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = null;
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph33, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = null;
        fuzzTest39.FuzzTest_addEdge(intDefaultListenableGraph40, intDefaultListenableGraph41, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph48, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph48, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph33, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 2, false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph4 = null;
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph3, intDefaultListenableGraph4, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph23 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = null;
        fuzzTest22.FuzzTest_addEdge(intDefaultListenableGraph23, intDefaultListenableGraph24, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph30 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_addEdge(intDefaultListenableGraph30, intDefaultListenableGraph31, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = null;
        fuzzTest37.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph39, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_addEdge(intDefaultListenableGraph45, intDefaultListenableGraph46, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph30, intDefaultListenableGraph46, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 10, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph4 = null;
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph3, intDefaultListenableGraph4, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph23 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = null;
        fuzzTest22.FuzzTest_addEdge(intDefaultListenableGraph23, intDefaultListenableGraph24, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph30 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_addEdge(intDefaultListenableGraph30, intDefaultListenableGraph31, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = null;
        fuzzTest38.FuzzTest_addEdge(intDefaultListenableGraph39, intDefaultListenableGraph40, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_addEdge(intDefaultListenableGraph46, intDefaultListenableGraph47, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = null;
        fuzzTest53.FuzzTest_addEdge(intDefaultListenableGraph54, intDefaultListenableGraph55, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph61 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_addEdge(intDefaultListenableGraph61, intDefaultListenableGraph62, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest37.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph62, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph30, intDefaultListenableGraph47, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 2, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph4 = null;
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph3, intDefaultListenableGraph4, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph25, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph31, intDefaultListenableGraph32, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_addEdge(intDefaultListenableGraph31, intDefaultListenableGraph38, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = null;
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph46, intDefaultListenableGraph47, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph53, intDefaultListenableGraph54, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph53, intDefaultListenableGraph60, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph53, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 2, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = null;
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph12 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph13 = null;
        fuzzTest11.FuzzTest_addEdge(intDefaultListenableGraph12, intDefaultListenableGraph13, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addEdge(intDefaultListenableGraph19, intDefaultListenableGraph20, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph20, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = null;
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph34, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph40, intDefaultListenableGraph41, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph49 = null;
        fuzzTest47.FuzzTest_addEdge(intDefaultListenableGraph48, intDefaultListenableGraph49, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addEdge(intDefaultListenableGraph55, intDefaultListenableGraph56, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest31.FuzzTest_addEdge(intDefaultListenableGraph41, intDefaultListenableGraph56, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph20, intDefaultListenableGraph41, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph72 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph20, intDefaultListenableGraph72, (java.lang.Integer) 2, (java.lang.Integer) 10, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph4 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph5 = null;
        fuzzTest3.FuzzTest_addEdge(intDefaultListenableGraph4, intDefaultListenableGraph5, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_addEdge(intDefaultListenableGraph11, intDefaultListenableGraph12, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph11, intDefaultListenableGraph18, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph27 = null;
        fuzzTest25.FuzzTest_addEdge(intDefaultListenableGraph26, intDefaultListenableGraph27, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph34, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph40, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph40, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph51 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph40, intDefaultListenableGraph51, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph4 = null;
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph3, intDefaultListenableGraph4, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = null;
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph33, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph39, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = null;
        fuzzTest46.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph48, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addEdge(intDefaultListenableGraph54, intDefaultListenableGraph55, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph54, intDefaultListenableGraph61, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzzTest22.FuzzTest_addEdge(intDefaultListenableGraph39, intDefaultListenableGraph61, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph73 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph74 = null;
        fuzzTest72.FuzzTest_addEdge(intDefaultListenableGraph73, intDefaultListenableGraph74, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph80 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_addEdge(intDefaultListenableGraph80, intDefaultListenableGraph81, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph39, intDefaultListenableGraph80, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 100, false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph12 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph13 = null;
        fuzzTest11.FuzzTest_addEdge(intDefaultListenableGraph12, intDefaultListenableGraph13, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addEdge(intDefaultListenableGraph19, intDefaultListenableGraph20, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addEdge(intDefaultListenableGraph19, intDefaultListenableGraph26, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph35 = null;
        fuzzTest33.FuzzTest_addEdge(intDefaultListenableGraph34, intDefaultListenableGraph35, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_addEdge(intDefaultListenableGraph41, intDefaultListenableGraph42, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph41, intDefaultListenableGraph48, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph26, intDefaultListenableGraph48, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph48, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = null;
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph16, intDefaultListenableGraph17, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph27 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph28 = null;
        fuzzTest26.FuzzTest_addEdge(intDefaultListenableGraph27, intDefaultListenableGraph28, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_addEdge(intDefaultListenableGraph34, intDefaultListenableGraph35, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph35, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph49 = null;
        fuzzTest47.FuzzTest_addEdge(intDefaultListenableGraph48, intDefaultListenableGraph49, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addEdge(intDefaultListenableGraph55, intDefaultListenableGraph56, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph63 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph64 = null;
        fuzzTest62.FuzzTest_addEdge(intDefaultListenableGraph63, intDefaultListenableGraph64, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_addEdge(intDefaultListenableGraph70, intDefaultListenableGraph71, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest46.FuzzTest_addEdge(intDefaultListenableGraph56, intDefaultListenableGraph71, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph35, intDefaultListenableGraph56, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph35, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 1, false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph5 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph6 = null;
        fuzzTest4.FuzzTest_addEdge(intDefaultListenableGraph5, intDefaultListenableGraph6, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest4.FuzzTest_addEdge(intDefaultListenableGraph12, intDefaultListenableGraph13, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph3, intDefaultListenableGraph13, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph27 = null;
        fuzzTest25.FuzzTest_addEdge(intDefaultListenableGraph26, intDefaultListenableGraph27, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph34, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph42 = null;
        fuzzTest40.FuzzTest_addEdge(intDefaultListenableGraph41, intDefaultListenableGraph42, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_addEdge(intDefaultListenableGraph48, intDefaultListenableGraph49, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph34, intDefaultListenableGraph49, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph13, intDefaultListenableGraph34, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph69 = null;
        fuzzTest67.FuzzTest_addEdge(intDefaultListenableGraph68, intDefaultListenableGraph69, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addEdge(intDefaultListenableGraph75, intDefaultListenableGraph76, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest65.FuzzTest_addEdge(intDefaultListenableGraph66, intDefaultListenableGraph76, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph87 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_addEdge(intDefaultListenableGraph87, intDefaultListenableGraph88, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph34, intDefaultListenableGraph88, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 1, false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = null;
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = null;
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph33, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph33, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph45 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = null;
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph45, intDefaultListenableGraph46, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph52 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph52, intDefaultListenableGraph53, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph53, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 2, false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = null;
        fuzzTest17.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph19, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph32, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = null;
        fuzzTest39.FuzzTest_addEdge(intDefaultListenableGraph40, intDefaultListenableGraph41, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph48, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph54, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzzTest15.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph54, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph69 = null;
        fuzzTest67.FuzzTest_addEdge(intDefaultListenableGraph68, intDefaultListenableGraph69, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addEdge(intDefaultListenableGraph75, intDefaultListenableGraph76, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest65.FuzzTest_addEdge(intDefaultListenableGraph66, intDefaultListenableGraph76, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph87 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_addEdge(intDefaultListenableGraph87, intDefaultListenableGraph88, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph54, intDefaultListenableGraph88, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 10, false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = null;
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = null;
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph33, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph33, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph45 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = null;
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph45, intDefaultListenableGraph46, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph52 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph52, intDefaultListenableGraph53, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph52, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 1, false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph2, intDefaultListenableGraph3, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph25, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = null;
        fuzzTest31.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph33, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_addEdge(intDefaultListenableGraph39, intDefaultListenableGraph40, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph49 = null;
        fuzzTest47.FuzzTest_addEdge(intDefaultListenableGraph48, intDefaultListenableGraph49, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addEdge(intDefaultListenableGraph55, intDefaultListenableGraph56, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph63 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph64 = null;
        fuzzTest62.FuzzTest_addEdge(intDefaultListenableGraph63, intDefaultListenableGraph64, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_addEdge(intDefaultListenableGraph70, intDefaultListenableGraph71, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest46.FuzzTest_addEdge(intDefaultListenableGraph56, intDefaultListenableGraph71, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph39, intDefaultListenableGraph56, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph56, (java.lang.Integer) 2, (java.lang.Integer) 10, (java.lang.Integer) 0, false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph4 = null;
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph3, intDefaultListenableGraph4, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph22 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph22, intDefaultListenableGraph23, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = null;
        fuzzTest31.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph33, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_addEdge(intDefaultListenableGraph39, intDefaultListenableGraph40, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest29.FuzzTest_addEdge(intDefaultListenableGraph30, intDefaultListenableGraph40, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addEdge(intDefaultListenableGraph51, intDefaultListenableGraph52, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph60 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph61 = null;
        fuzzTest59.FuzzTest_addEdge(intDefaultListenableGraph60, intDefaultListenableGraph61, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph67 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_addEdge(intDefaultListenableGraph67, intDefaultListenableGraph68, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph75 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph76 = null;
        fuzzTest74.FuzzTest_addEdge(intDefaultListenableGraph75, intDefaultListenableGraph76, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph82 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_addEdge(intDefaultListenableGraph82, intDefaultListenableGraph83, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph68, intDefaultListenableGraph83, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph51, intDefaultListenableGraph68, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 100, false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph12 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph13 = null;
        fuzzTest11.FuzzTest_addEdge(intDefaultListenableGraph12, intDefaultListenableGraph13, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addEdge(intDefaultListenableGraph19, intDefaultListenableGraph20, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addEdge(intDefaultListenableGraph19, intDefaultListenableGraph26, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph35 = null;
        fuzzTest33.FuzzTest_addEdge(intDefaultListenableGraph34, intDefaultListenableGraph35, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_addEdge(intDefaultListenableGraph41, intDefaultListenableGraph42, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph41, intDefaultListenableGraph48, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph26, intDefaultListenableGraph48, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph26, (java.lang.Integer) 2, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph69 = null;
        fuzzTest67.FuzzTest_addEdge(intDefaultListenableGraph68, intDefaultListenableGraph69, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addEdge(intDefaultListenableGraph75, intDefaultListenableGraph76, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest65.FuzzTest_addEdge(intDefaultListenableGraph66, intDefaultListenableGraph76, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph87 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_addEdge(intDefaultListenableGraph87, intDefaultListenableGraph88, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph64, intDefaultListenableGraph88, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 1, false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph2, intDefaultListenableGraph3, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph16, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = null;
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph33, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = null;
        fuzzTest39.FuzzTest_addEdge(intDefaultListenableGraph40, intDefaultListenableGraph41, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph48, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph48, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph22, intDefaultListenableGraph48, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = null;
        fuzzTest15.FuzzTest_addEdge(intDefaultListenableGraph16, intDefaultListenableGraph17, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addEdge(intDefaultListenableGraph23, intDefaultListenableGraph24, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = null;
        fuzzTest30.FuzzTest_addEdge(intDefaultListenableGraph31, intDefaultListenableGraph32, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph42 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph43 = null;
        fuzzTest41.FuzzTest_addEdge(intDefaultListenableGraph42, intDefaultListenableGraph43, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_addEdge(intDefaultListenableGraph49, intDefaultListenableGraph50, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_addEdge(intDefaultListenableGraph49, intDefaultListenableGraph56, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph64 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph65 = null;
        fuzzTest63.FuzzTest_addEdge(intDefaultListenableGraph64, intDefaultListenableGraph65, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph71 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_addEdge(intDefaultListenableGraph71, intDefaultListenableGraph72, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_addEdge(intDefaultListenableGraph71, intDefaultListenableGraph78, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzzTest39.FuzzTest_addEdge(intDefaultListenableGraph56, intDefaultListenableGraph78, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0, true);
        fuzzTest30.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph56, (java.lang.Integer) 2, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph23, intDefaultListenableGraph38, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 100, false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph4 = null;
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph3, intDefaultListenableGraph4, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph23 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = null;
        fuzzTest22.FuzzTest_addEdge(intDefaultListenableGraph23, intDefaultListenableGraph24, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph30 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_addEdge(intDefaultListenableGraph30, intDefaultListenableGraph31, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = null;
        fuzzTest39.FuzzTest_addEdge(intDefaultListenableGraph40, intDefaultListenableGraph41, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph48, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest37.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph48, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph30, intDefaultListenableGraph48, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 10, false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph2, intDefaultListenableGraph3, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = null;
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph12 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph13 = null;
        fuzzTest11.FuzzTest_addEdge(intDefaultListenableGraph12, intDefaultListenableGraph13, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addEdge(intDefaultListenableGraph19, intDefaultListenableGraph20, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph20, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = null;
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph34, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph40, intDefaultListenableGraph41, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph49 = null;
        fuzzTest47.FuzzTest_addEdge(intDefaultListenableGraph48, intDefaultListenableGraph49, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addEdge(intDefaultListenableGraph55, intDefaultListenableGraph56, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest31.FuzzTest_addEdge(intDefaultListenableGraph41, intDefaultListenableGraph56, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph69 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph70 = null;
        fuzzTest68.FuzzTest_addEdge(intDefaultListenableGraph69, intDefaultListenableGraph70, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph76 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_addEdge(intDefaultListenableGraph76, intDefaultListenableGraph77, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addEdge(intDefaultListenableGraph76, intDefaultListenableGraph83, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph41, intDefaultListenableGraph83, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph2, intDefaultListenableGraph41, (java.lang.Integer) 2, (java.lang.Integer) 10, (java.lang.Integer) 1, false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph12 = null;
        fuzzTest10.FuzzTest_addEdge(intDefaultListenableGraph11, intDefaultListenableGraph12, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph19, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph19, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = null;
        fuzzTest30.FuzzTest_addEdge(intDefaultListenableGraph31, intDefaultListenableGraph32, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph39, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph19, intDefaultListenableGraph38, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 2, false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph2, intDefaultListenableGraph3, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph16, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph25, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph31, intDefaultListenableGraph32, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_addEdge(intDefaultListenableGraph31, intDefaultListenableGraph38, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = null;
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph49 = null;
        fuzzTest47.FuzzTest_addEdge(intDefaultListenableGraph48, intDefaultListenableGraph49, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addEdge(intDefaultListenableGraph55, intDefaultListenableGraph56, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph46, intDefaultListenableGraph56, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph67 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph67, intDefaultListenableGraph68, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        fuzzTest22.FuzzTest_addEdge(intDefaultListenableGraph44, intDefaultListenableGraph67, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph80 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph81 = null;
        fuzzTest79.FuzzTest_addEdge(intDefaultListenableGraph80, intDefaultListenableGraph81, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph87 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_addEdge(intDefaultListenableGraph87, intDefaultListenableGraph88, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph67, intDefaultListenableGraph87, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 1, false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = null;
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph33, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph33, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = null;
        fuzzTest46.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph48, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addEdge(intDefaultListenableGraph54, intDefaultListenableGraph55, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph45, intDefaultListenableGraph55, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph66 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph66, intDefaultListenableGraph67, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph66, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 100, false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = null;
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph24, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = null;
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph34, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph40, intDefaultListenableGraph41, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest30.FuzzTest_addEdge(intDefaultListenableGraph31, intDefaultListenableGraph41, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph41, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 1, false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 2, (java.lang.Integer) 100, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = null;
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph16, intDefaultListenableGraph17, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = null;
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph33, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph23, intDefaultListenableGraph33, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = null;
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph46, intDefaultListenableGraph47, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph53, intDefaultListenableGraph54, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph53, intDefaultListenableGraph60, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph53, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 100, false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph25, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph25, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = null;
        fuzzTest38.FuzzTest_addEdge(intDefaultListenableGraph39, intDefaultListenableGraph40, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_addEdge(intDefaultListenableGraph46, intDefaultListenableGraph47, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest36.FuzzTest_addEdge(intDefaultListenableGraph37, intDefaultListenableGraph47, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph59 = null;
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph61 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph62 = null;
        fuzzTest60.FuzzTest_addEdge(intDefaultListenableGraph61, intDefaultListenableGraph62, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_addEdge(intDefaultListenableGraph68, intDefaultListenableGraph69, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph59, intDefaultListenableGraph69, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph80 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph80, intDefaultListenableGraph81, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph81, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1, false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph4 = null;
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph3, intDefaultListenableGraph4, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph17, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = null;
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph33, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph39, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph39, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_addEdge(intDefaultListenableGraph51, intDefaultListenableGraph52, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph59, intDefaultListenableGraph60, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph67 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_addEdge(intDefaultListenableGraph67, intDefaultListenableGraph68, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph75 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph76 = null;
        fuzzTest74.FuzzTest_addEdge(intDefaultListenableGraph75, intDefaultListenableGraph76, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph82 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_addEdge(intDefaultListenableGraph82, intDefaultListenableGraph83, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph67, intDefaultListenableGraph83, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph52, intDefaultListenableGraph67, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) 0, false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = null;
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph16, intDefaultListenableGraph17, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph27 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph28 = null;
        fuzzTest26.FuzzTest_addEdge(intDefaultListenableGraph27, intDefaultListenableGraph28, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_addEdge(intDefaultListenableGraph34, intDefaultListenableGraph35, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph35, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph49 = null;
        fuzzTest47.FuzzTest_addEdge(intDefaultListenableGraph48, intDefaultListenableGraph49, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addEdge(intDefaultListenableGraph55, intDefaultListenableGraph56, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph63 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph64 = null;
        fuzzTest62.FuzzTest_addEdge(intDefaultListenableGraph63, intDefaultListenableGraph64, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_addEdge(intDefaultListenableGraph70, intDefaultListenableGraph71, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest46.FuzzTest_addEdge(intDefaultListenableGraph56, intDefaultListenableGraph71, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph35, intDefaultListenableGraph56, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph35, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 2, (java.lang.Integer) 100, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = null;
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph16, intDefaultListenableGraph17, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph25, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph34, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_addEdge(intDefaultListenableGraph41, intDefaultListenableGraph42, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph49 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph50 = null;
        fuzzTest48.FuzzTest_addEdge(intDefaultListenableGraph49, intDefaultListenableGraph50, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph56 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_addEdge(intDefaultListenableGraph56, intDefaultListenableGraph57, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph41, intDefaultListenableGraph57, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph31, intDefaultListenableGraph57, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph57, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) (-1), false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph4 = null;
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph3, intDefaultListenableGraph4, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph27 = null;
        fuzzTest25.FuzzTest_addEdge(intDefaultListenableGraph26, intDefaultListenableGraph27, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph34, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph34, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph22, intDefaultListenableGraph24, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_addEdge(intDefaultListenableGraph51, intDefaultListenableGraph52, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph59 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph60 = null;
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph59, intDefaultListenableGraph60, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph66 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph66, intDefaultListenableGraph67, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph51, intDefaultListenableGraph67, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 1, false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph12 = null;
        fuzzTest10.FuzzTest_addEdge(intDefaultListenableGraph11, intDefaultListenableGraph12, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph19, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph19, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph30 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph30, intDefaultListenableGraph31, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = null;
        fuzzTest37.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph39, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_addEdge(intDefaultListenableGraph45, intDefaultListenableGraph46, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph30, intDefaultListenableGraph46, (java.lang.Integer) 10, (java.lang.Integer) 2, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addEdge(intDefaultListenableGraph16, intDefaultListenableGraph17, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = null;
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph33, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph39, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph45, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph53 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = null;
        fuzzTest52.FuzzTest_addEdge(intDefaultListenableGraph53, intDefaultListenableGraph54, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph60 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_addEdge(intDefaultListenableGraph60, intDefaultListenableGraph61, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_addEdge(intDefaultListenableGraph60, intDefaultListenableGraph67, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph73 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_addEdge(intDefaultListenableGraph73, intDefaultListenableGraph74, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph74, (java.lang.Integer) 10, (java.lang.Integer) 2, (java.lang.Integer) 1, false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph12 = null;
        fuzzTest10.FuzzTest_addEdge(intDefaultListenableGraph11, intDefaultListenableGraph12, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph19, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph25, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = null;
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph34, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph40, intDefaultListenableGraph41, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_addEdge(intDefaultListenableGraph40, intDefaultListenableGraph47, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph47, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph59, intDefaultListenableGraph60, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph59, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 2, false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph4 = null;
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph3, intDefaultListenableGraph4, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = null;
        fuzzTest17.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph19, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph11, intDefaultListenableGraph26, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = null;
        fuzzTest37.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph39, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_addEdge(intDefaultListenableGraph45, intDefaultListenableGraph46, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph26, intDefaultListenableGraph45, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 100, false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addEdge(intDefaultListenableGraph16, intDefaultListenableGraph17, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph34, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph42 = null;
        fuzzTest40.FuzzTest_addEdge(intDefaultListenableGraph41, intDefaultListenableGraph42, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_addEdge(intDefaultListenableGraph48, intDefaultListenableGraph49, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph49, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        fuzzTest15.FuzzTest_addEdge(intDefaultListenableGraph23, intDefaultListenableGraph49, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph66 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_addEdge(intDefaultListenableGraph66, intDefaultListenableGraph67, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph49, intDefaultListenableGraph66, (java.lang.Integer) 2, (java.lang.Integer) 10, (java.lang.Integer) 0, false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph2, intDefaultListenableGraph3, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph25, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph25, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = null;
        fuzzTest37.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph39, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_addEdge(intDefaultListenableGraph45, intDefaultListenableGraph46, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_addEdge(intDefaultListenableGraph45, intDefaultListenableGraph52, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph60 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph61 = null;
        fuzzTest59.FuzzTest_addEdge(intDefaultListenableGraph60, intDefaultListenableGraph61, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph67 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_addEdge(intDefaultListenableGraph67, intDefaultListenableGraph68, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph67, intDefaultListenableGraph74, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph80 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph80, intDefaultListenableGraph81, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph52, intDefaultListenableGraph81, (java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 2, false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph15 = null;
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph25, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph15, intDefaultListenableGraph25, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1), false);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph36 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph37 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph36, intDefaultListenableGraph37, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 2, false);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = null;
        fuzzTest46.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph48, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addEdge(intDefaultListenableGraph54, intDefaultListenableGraph55, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph45, intDefaultListenableGraph55, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph66 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph66, intDefaultListenableGraph67, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph43, intDefaultListenableGraph67, (java.lang.Integer) 2, (java.lang.Integer) 2, (java.lang.Integer) 2, false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 2, (java.lang.Integer) 100, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = null;
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = null;
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph33, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph33, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = null;
        fuzzTest46.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph48, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addEdge(intDefaultListenableGraph54, intDefaultListenableGraph55, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph45, intDefaultListenableGraph55, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph55, (java.lang.Integer) 2, (java.lang.Integer) (-1), (java.lang.Integer) 1, false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 2, (java.lang.Integer) 100, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph16, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph25, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph31, intDefaultListenableGraph32, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = null;
        fuzzTest38.FuzzTest_addEdge(intDefaultListenableGraph39, intDefaultListenableGraph40, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_addEdge(intDefaultListenableGraph46, intDefaultListenableGraph47, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest22.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph47, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph59 = null;
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph61 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph62 = null;
        fuzzTest60.FuzzTest_addEdge(intDefaultListenableGraph61, intDefaultListenableGraph62, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_addEdge(intDefaultListenableGraph68, intDefaultListenableGraph69, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph59, intDefaultListenableGraph69, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph80 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph80, intDefaultListenableGraph81, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph81, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 100, false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph4 = null;
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph3, intDefaultListenableGraph4, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph22 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph22, intDefaultListenableGraph23, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = null;
        fuzzTest30.FuzzTest_addEdge(intDefaultListenableGraph31, intDefaultListenableGraph32, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph39, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph45, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph51 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addEdge(intDefaultListenableGraph51, intDefaultListenableGraph52, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph59, intDefaultListenableGraph60, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph67 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_addEdge(intDefaultListenableGraph67, intDefaultListenableGraph68, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph75 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph76 = null;
        fuzzTest74.FuzzTest_addEdge(intDefaultListenableGraph75, intDefaultListenableGraph76, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph82 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_addEdge(intDefaultListenableGraph82, intDefaultListenableGraph83, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph67, intDefaultListenableGraph83, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph52, intDefaultListenableGraph67, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph15 = null;
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph25, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph15, intDefaultListenableGraph25, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1), false);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph36 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph37 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph36, intDefaultListenableGraph37, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph44 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph45 = null;
        fuzzTest43.FuzzTest_addEdge(intDefaultListenableGraph44, intDefaultListenableGraph45, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_addEdge(intDefaultListenableGraph51, intDefaultListenableGraph52, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph59, intDefaultListenableGraph60, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph69 = null;
        fuzzTest67.FuzzTest_addEdge(intDefaultListenableGraph68, intDefaultListenableGraph69, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addEdge(intDefaultListenableGraph75, intDefaultListenableGraph76, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_addEdge(intDefaultListenableGraph75, intDefaultListenableGraph82, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph75, intDefaultListenableGraph88, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph51, intDefaultListenableGraph75, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 2, false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addEdge(intDefaultListenableGraph16, intDefaultListenableGraph17, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph34, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph42 = null;
        fuzzTest40.FuzzTest_addEdge(intDefaultListenableGraph41, intDefaultListenableGraph42, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_addEdge(intDefaultListenableGraph48, intDefaultListenableGraph49, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph49, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        fuzzTest15.FuzzTest_addEdge(intDefaultListenableGraph23, intDefaultListenableGraph49, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph67 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = null;
        fuzzTest66.FuzzTest_addEdge(intDefaultListenableGraph67, intDefaultListenableGraph68, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph74 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_addEdge(intDefaultListenableGraph74, intDefaultListenableGraph75, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_addEdge(intDefaultListenableGraph74, intDefaultListenableGraph81, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph87 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_addEdge(intDefaultListenableGraph87, intDefaultListenableGraph88, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph49, intDefaultListenableGraph88, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 100, false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph15 = null;
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph25, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph15, intDefaultListenableGraph25, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1), false);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = null;
        fuzzTest39.FuzzTest_addEdge(intDefaultListenableGraph40, intDefaultListenableGraph41, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph48, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest37.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph48, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph36, intDefaultListenableGraph48, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph65 = null;
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph67 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = null;
        fuzzTest66.FuzzTest_addEdge(intDefaultListenableGraph67, intDefaultListenableGraph68, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph74 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_addEdge(intDefaultListenableGraph74, intDefaultListenableGraph75, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest64.FuzzTest_addEdge(intDefaultListenableGraph65, intDefaultListenableGraph75, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph86 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph87 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_addEdge(intDefaultListenableGraph86, intDefaultListenableGraph87, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph93 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph86, intDefaultListenableGraph93, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = null;
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph24, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph30 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph30, intDefaultListenableGraph31, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph39, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph30, intDefaultListenableGraph38, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_addEdge(intDefaultListenableGraph51, intDefaultListenableGraph52, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph59, intDefaultListenableGraph60, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph69 = null;
        fuzzTest67.FuzzTest_addEdge(intDefaultListenableGraph68, intDefaultListenableGraph69, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addEdge(intDefaultListenableGraph75, intDefaultListenableGraph76, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_addEdge(intDefaultListenableGraph75, intDefaultListenableGraph82, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addEdge(intDefaultListenableGraph75, intDefaultListenableGraph88, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph51, intDefaultListenableGraph75, (java.lang.Integer) 10, (java.lang.Integer) 2, (java.lang.Integer) 1, false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 2, (java.lang.Integer) 100, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph16, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = null;
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph33, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph39, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = null;
        fuzzTest46.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph48, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addEdge(intDefaultListenableGraph54, intDefaultListenableGraph55, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph54, intDefaultListenableGraph61, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzzTest22.FuzzTest_addEdge(intDefaultListenableGraph39, intDefaultListenableGraph61, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph73 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_addEdge(intDefaultListenableGraph73, intDefaultListenableGraph74, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph39, intDefaultListenableGraph73, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) 10, false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph2, intDefaultListenableGraph3, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph16, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph22 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph22, intDefaultListenableGraph23, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = null;
        fuzzTest30.FuzzTest_addEdge(intDefaultListenableGraph31, intDefaultListenableGraph32, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph39, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = null;
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph46, intDefaultListenableGraph47, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph53 = null;
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_addEdge(intDefaultListenableGraph55, intDefaultListenableGraph56, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph53, intDefaultListenableGraph55, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1), false);
        fuzzTest29.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph55, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph74 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph75 = null;
        fuzzTest73.FuzzTest_addEdge(intDefaultListenableGraph74, intDefaultListenableGraph75, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph81 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_addEdge(intDefaultListenableGraph81, intDefaultListenableGraph82, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_addEdge(intDefaultListenableGraph81, intDefaultListenableGraph88, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph88, (java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 1, false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph4 = null;
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph3, intDefaultListenableGraph4, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = null;
        fuzzTest17.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph19, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_addEdge(intDefaultListenableGraph27, intDefaultListenableGraph28, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzzTest17.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph27, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1), false);
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph27, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = null;
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph46, intDefaultListenableGraph47, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph53, intDefaultListenableGraph54, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph61 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph62 = null;
        fuzzTest60.FuzzTest_addEdge(intDefaultListenableGraph61, intDefaultListenableGraph62, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = null;
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_addEdge(intDefaultListenableGraph70, intDefaultListenableGraph71, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzzTest60.FuzzTest_addEdge(intDefaultListenableGraph68, intDefaultListenableGraph70, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1), false);
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph53, intDefaultListenableGraph70, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph27, intDefaultListenableGraph53, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 2, false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = null;
        fuzzTest17.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph19, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph32, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph38, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph45, intDefaultListenableGraph46, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_addEdge(intDefaultListenableGraph53, intDefaultListenableGraph54, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph61 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph62 = null;
        fuzzTest60.FuzzTest_addEdge(intDefaultListenableGraph61, intDefaultListenableGraph62, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_addEdge(intDefaultListenableGraph68, intDefaultListenableGraph69, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph53, intDefaultListenableGraph69, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph80 = null;
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph82 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_addEdge(intDefaultListenableGraph82, intDefaultListenableGraph83, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph80, intDefaultListenableGraph82, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph82, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 2, false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 2, (java.lang.Integer) 100, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph25, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph31, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = null;
        fuzzTest39.FuzzTest_addEdge(intDefaultListenableGraph40, intDefaultListenableGraph41, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph48, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph54, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzzTest15.FuzzTest_addEdge(intDefaultListenableGraph37, intDefaultListenableGraph47, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph69 = null;
        fuzzTest67.FuzzTest_addEdge(intDefaultListenableGraph68, intDefaultListenableGraph69, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addEdge(intDefaultListenableGraph75, intDefaultListenableGraph76, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest65.FuzzTest_addEdge(intDefaultListenableGraph66, intDefaultListenableGraph76, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph47, intDefaultListenableGraph76, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 2, false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 2, (java.lang.Integer) 100, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = null;
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph27 = null;
        fuzzTest25.FuzzTest_addEdge(intDefaultListenableGraph26, intDefaultListenableGraph27, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph34, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph34, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = null;
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph46, intDefaultListenableGraph47, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph53, intDefaultListenableGraph54, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph53, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 2, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph65 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph53, intDefaultListenableGraph65, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph72 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph73 = null;
        fuzzTest71.FuzzTest_addEdge(intDefaultListenableGraph72, intDefaultListenableGraph73, (java.lang.Integer) 2, (java.lang.Integer) 100, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph80 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_addEdge(intDefaultListenableGraph80, intDefaultListenableGraph81, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph87 = null;
        fuzzTest71.FuzzTest_addEdge(intDefaultListenableGraph81, intDefaultListenableGraph87, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0, false);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph93 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph81, intDefaultListenableGraph93, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph15 = null;
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph25, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph15, intDefaultListenableGraph25, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1), false);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph36 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph37 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph36, intDefaultListenableGraph37, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 2, false);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph43 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph44 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph43, intDefaultListenableGraph44, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph51 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph52 = null;
        fuzzTest50.FuzzTest_addEdge(intDefaultListenableGraph51, intDefaultListenableGraph52, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph58 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_addEdge(intDefaultListenableGraph58, intDefaultListenableGraph59, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph66 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph67 = null;
        fuzzTest65.FuzzTest_addEdge(intDefaultListenableGraph66, intDefaultListenableGraph67, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph73 = null;
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_addEdge(intDefaultListenableGraph75, intDefaultListenableGraph76, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzzTest65.FuzzTest_addEdge(intDefaultListenableGraph73, intDefaultListenableGraph75, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph59, intDefaultListenableGraph75, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 10, false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph15 = null;
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph25, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph15, intDefaultListenableGraph25, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1), false);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph36 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph37 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph36, intDefaultListenableGraph37, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 2, false);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph43 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph44 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph43, intDefaultListenableGraph44, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph52 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph53 = null;
        fuzzTest51.FuzzTest_addEdge(intDefaultListenableGraph52, intDefaultListenableGraph53, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_addEdge(intDefaultListenableGraph59, intDefaultListenableGraph60, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_addEdge(intDefaultListenableGraph59, intDefaultListenableGraph66, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph72 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_addEdge(intDefaultListenableGraph72, intDefaultListenableGraph73, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 100, false);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph79 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph73, intDefaultListenableGraph79, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 1, false);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph4 = null;
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph3, intDefaultListenableGraph4, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph11, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph22 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph22, intDefaultListenableGraph23, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph30 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = null;
        fuzzTest29.FuzzTest_addEdge(intDefaultListenableGraph30, intDefaultListenableGraph31, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph37 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addEdge(intDefaultListenableGraph37, intDefaultListenableGraph38, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = null;
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph46, intDefaultListenableGraph47, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph53, intDefaultListenableGraph54, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest29.FuzzTest_addEdge(intDefaultListenableGraph44, intDefaultListenableGraph54, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1), false);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph54, intDefaultListenableGraph65, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph72 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_addEdge(intDefaultListenableGraph72, intDefaultListenableGraph73, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph80 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_addEdge(intDefaultListenableGraph80, intDefaultListenableGraph81, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph72, intDefaultListenableGraph81, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 0, false);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph15 = null;
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = null;
        fuzzTest17.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph19, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph32, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph15, intDefaultListenableGraph25, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph44 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph45 = null;
        fuzzTest43.FuzzTest_addEdge(intDefaultListenableGraph44, intDefaultListenableGraph45, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph51 = null;
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_addEdge(intDefaultListenableGraph53, intDefaultListenableGraph54, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzzTest43.FuzzTest_addEdge(intDefaultListenableGraph51, intDefaultListenableGraph53, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph67 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = null;
        fuzzTest66.FuzzTest_addEdge(intDefaultListenableGraph67, intDefaultListenableGraph68, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph74 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_addEdge(intDefaultListenableGraph74, intDefaultListenableGraph75, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_addEdge(intDefaultListenableGraph74, intDefaultListenableGraph81, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph53, intDefaultListenableGraph74, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 2, false);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = null;
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 2, (java.lang.Integer) 100, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = null;
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph20 = null;
        fuzzTest18.FuzzTest_addEdge(intDefaultListenableGraph19, intDefaultListenableGraph20, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_addEdge(intDefaultListenableGraph26, intDefaultListenableGraph27, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph35 = null;
        fuzzTest33.FuzzTest_addEdge(intDefaultListenableGraph34, intDefaultListenableGraph35, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_addEdge(intDefaultListenableGraph41, intDefaultListenableGraph42, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest17.FuzzTest_addEdge(intDefaultListenableGraph27, intDefaultListenableGraph42, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph16, intDefaultListenableGraph27, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) (-1), false);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph58 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph16, intDefaultListenableGraph58, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph65 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph66 = null;
        fuzzTest64.FuzzTest_addEdge(intDefaultListenableGraph65, intDefaultListenableGraph66, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph72 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_addEdge(intDefaultListenableGraph72, intDefaultListenableGraph73, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph80 = null;
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph82 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_addEdge(intDefaultListenableGraph82, intDefaultListenableGraph83, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzzTest79.FuzzTest_addEdge(intDefaultListenableGraph80, intDefaultListenableGraph82, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph72, intDefaultListenableGraph82, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 2, (java.lang.Integer) 0, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addEdge(intDefaultListenableGraph16, intDefaultListenableGraph17, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph27 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph28 = null;
        fuzzTest26.FuzzTest_addEdge(intDefaultListenableGraph27, intDefaultListenableGraph28, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_addEdge(intDefaultListenableGraph34, intDefaultListenableGraph35, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph35, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph49 = null;
        fuzzTest47.FuzzTest_addEdge(intDefaultListenableGraph48, intDefaultListenableGraph49, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addEdge(intDefaultListenableGraph55, intDefaultListenableGraph56, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph63 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph64 = null;
        fuzzTest62.FuzzTest_addEdge(intDefaultListenableGraph63, intDefaultListenableGraph64, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_addEdge(intDefaultListenableGraph70, intDefaultListenableGraph71, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest46.FuzzTest_addEdge(intDefaultListenableGraph56, intDefaultListenableGraph71, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        fuzzTest23.FuzzTest_addEdge(intDefaultListenableGraph35, intDefaultListenableGraph56, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph16, intDefaultListenableGraph56, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph2, intDefaultListenableGraph3, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph11 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph12 = null;
        fuzzTest10.FuzzTest_addEdge(intDefaultListenableGraph11, intDefaultListenableGraph12, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph19, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph25, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph31, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = null;
        fuzzTest37.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph39, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = null;
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph49 = null;
        fuzzTest47.FuzzTest_addEdge(intDefaultListenableGraph48, intDefaultListenableGraph49, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addEdge(intDefaultListenableGraph55, intDefaultListenableGraph56, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph46, intDefaultListenableGraph56, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph67 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_addEdge(intDefaultListenableGraph67, intDefaultListenableGraph68, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_addEdge(intDefaultListenableGraph75, intDefaultListenableGraph76, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzzTest37.FuzzTest_addEdge(intDefaultListenableGraph67, intDefaultListenableGraph76, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph67, (java.lang.Integer) 2, (java.lang.Integer) 10, (java.lang.Integer) 10, false);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = null;
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph2, intDefaultListenableGraph3, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph16, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph23 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = null;
        fuzzTest22.FuzzTest_addEdge(intDefaultListenableGraph23, intDefaultListenableGraph24, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph30 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_addEdge(intDefaultListenableGraph30, intDefaultListenableGraph31, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = null;
        fuzzTest38.FuzzTest_addEdge(intDefaultListenableGraph39, intDefaultListenableGraph40, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_addEdge(intDefaultListenableGraph46, intDefaultListenableGraph47, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = null;
        fuzzTest53.FuzzTest_addEdge(intDefaultListenableGraph54, intDefaultListenableGraph55, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph61 = null;
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph63 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_addEdge(intDefaultListenableGraph63, intDefaultListenableGraph64, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzzTest53.FuzzTest_addEdge(intDefaultListenableGraph61, intDefaultListenableGraph63, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1), false);
        fuzzTest37.FuzzTest_addEdge(intDefaultListenableGraph46, intDefaultListenableGraph63, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph31, intDefaultListenableGraph46, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 0, false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = null;
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph33, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph33, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph44 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph44, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph51 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph52 = null;
        fuzzTest50.FuzzTest_addEdge(intDefaultListenableGraph51, intDefaultListenableGraph52, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph58 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_addEdge(intDefaultListenableGraph58, intDefaultListenableGraph59, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph65 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph58, intDefaultListenableGraph65, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 100, false);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = null;
        fuzzTest15.FuzzTest_addEdge(intDefaultListenableGraph16, intDefaultListenableGraph17, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addEdge(intDefaultListenableGraph23, intDefaultListenableGraph24, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = null;
        fuzzTest31.FuzzTest_addEdge(intDefaultListenableGraph32, intDefaultListenableGraph33, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph39 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_addEdge(intDefaultListenableGraph39, intDefaultListenableGraph40, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_addEdge(intDefaultListenableGraph39, intDefaultListenableGraph46, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph56 = null;
        fuzzTest54.FuzzTest_addEdge(intDefaultListenableGraph55, intDefaultListenableGraph56, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph62 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_addEdge(intDefaultListenableGraph62, intDefaultListenableGraph63, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_addEdge(intDefaultListenableGraph62, intDefaultListenableGraph69, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzzTest30.FuzzTest_addEdge(intDefaultListenableGraph52, intDefaultListenableGraph62, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 2, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph23, intDefaultListenableGraph62, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 2, false);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph17, intDefaultListenableGraph18, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph25, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph33 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = null;
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph33, intDefaultListenableGraph34, (java.lang.Integer) 2, (java.lang.Integer) 100, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = null;
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph43 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph44 = null;
        fuzzTest42.FuzzTest_addEdge(intDefaultListenableGraph43, intDefaultListenableGraph44, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph50 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addEdge(intDefaultListenableGraph50, intDefaultListenableGraph51, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest40.FuzzTest_addEdge(intDefaultListenableGraph41, intDefaultListenableGraph51, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph62 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_addEdge(intDefaultListenableGraph62, intDefaultListenableGraph63, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph69 = null;
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph63, intDefaultListenableGraph69, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 1, true);
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph31, intDefaultListenableGraph63, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph10, intDefaultListenableGraph63, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) 1, false);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = null;
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = null;
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph19, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph16, intDefaultListenableGraph18, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = null;
        fuzzTest30.FuzzTest_addEdge(intDefaultListenableGraph31, intDefaultListenableGraph32, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addEdge(intDefaultListenableGraph40, intDefaultListenableGraph41, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzzTest30.FuzzTest_addEdge(intDefaultListenableGraph38, intDefaultListenableGraph40, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1), false);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph56 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph57 = null;
        fuzzTest55.FuzzTest_addEdge(intDefaultListenableGraph56, intDefaultListenableGraph57, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph63 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_addEdge(intDefaultListenableGraph63, intDefaultListenableGraph64, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest53.FuzzTest_addEdge(intDefaultListenableGraph54, intDefaultListenableGraph64, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_addEdge(intDefaultListenableGraph75, intDefaultListenableGraph76, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, true);
        fuzzTest30.FuzzTest_addEdge(intDefaultListenableGraph52, intDefaultListenableGraph75, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph75, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 0, false);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph9, intDefaultListenableGraph10, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = null;
        fuzzTest17.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph19, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph32, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph38, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph45 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph46 = null;
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph45, intDefaultListenableGraph46, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph54 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph55 = null;
        fuzzTest53.FuzzTest_addEdge(intDefaultListenableGraph54, intDefaultListenableGraph55, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph61 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_addEdge(intDefaultListenableGraph61, intDefaultListenableGraph62, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph69 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph70 = null;
        fuzzTest68.FuzzTest_addEdge(intDefaultListenableGraph69, intDefaultListenableGraph70, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph76 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_addEdge(intDefaultListenableGraph76, intDefaultListenableGraph77, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest52.FuzzTest_addEdge(intDefaultListenableGraph62, intDefaultListenableGraph77, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 2, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph88 = null;
        fuzzTest44.FuzzTest_addEdge(intDefaultListenableGraph77, intDefaultListenableGraph88, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph77, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, false);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addEdge(intDefaultListenableGraph2, intDefaultListenableGraph3, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph12 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph13 = null;
        fuzzTest11.FuzzTest_addEdge(intDefaultListenableGraph12, intDefaultListenableGraph13, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addEdge(intDefaultListenableGraph19, intDefaultListenableGraph20, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addEdge(intDefaultListenableGraph19, intDefaultListenableGraph26, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph34 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph35 = null;
        fuzzTest33.FuzzTest_addEdge(intDefaultListenableGraph34, intDefaultListenableGraph35, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph41 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_addEdge(intDefaultListenableGraph41, intDefaultListenableGraph42, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_addEdge(intDefaultListenableGraph41, intDefaultListenableGraph48, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph26, intDefaultListenableGraph48, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph59 = null;
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph61 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph62 = null;
        fuzzTest60.FuzzTest_addEdge(intDefaultListenableGraph61, intDefaultListenableGraph62, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_addEdge(intDefaultListenableGraph68, intDefaultListenableGraph69, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzzTest9.FuzzTest_addEdge(intDefaultListenableGraph59, intDefaultListenableGraph69, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph3, intDefaultListenableGraph69, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 2, false);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 2, (java.lang.Integer) 0, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph16 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph17 = null;
        fuzzTest15.FuzzTest_addEdge(intDefaultListenableGraph16, intDefaultListenableGraph17, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addEdge(intDefaultListenableGraph23, intDefaultListenableGraph24, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph31 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_addEdge(intDefaultListenableGraph31, intDefaultListenableGraph32, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph24, intDefaultListenableGraph31, (java.lang.Integer) 2, (java.lang.Integer) (-1), (java.lang.Integer) 2, false);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph1 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph2 = null;
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph1, intDefaultListenableGraph2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph8, intDefaultListenableGraph9, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph15 = null;
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph18 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph19 = null;
        fuzzTest17.FuzzTest_addEdge(intDefaultListenableGraph18, intDefaultListenableGraph19, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph25 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph26, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addEdge(intDefaultListenableGraph25, intDefaultListenableGraph32, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph15, intDefaultListenableGraph25, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_addEdge(intDefaultListenableGraph44, intDefaultListenableGraph45, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph52 = null;
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph53 = null;
        fuzzTest51.FuzzTest_addEdge(intDefaultListenableGraph52, intDefaultListenableGraph53, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1), true);
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.DefaultListenableGraph<java.lang.Integer, java.lang.Integer> intDefaultListenableGraph60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_addEdge(intDefaultListenableGraph59, intDefaultListenableGraph60, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addEdge(intDefaultListenableGraph44, intDefaultListenableGraph59, (java.lang.Integer) 2, (java.lang.Integer) 0, (java.lang.Integer) 0, false);
    }
}

