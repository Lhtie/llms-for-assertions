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
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 2, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap0 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Class<?> wildcardClass1 = intMap0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap0 and intMap0", intMap0.equals(intMap0) ? intMap0.hashCode() == intMap0.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 100);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) (-1), (java.lang.Integer) 2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) 2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 2, (java.lang.Integer) 2, (java.lang.Integer) 10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 2, (java.lang.Integer) 100, (java.lang.Integer) 10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 2, (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) (-1), (java.lang.Integer) 2, (java.lang.Integer) 100);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) 10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 10, (java.lang.Integer) 2, (java.lang.Integer) 100);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) 100);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 2, (java.lang.Integer) 2, (java.lang.Integer) 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 2, (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 100);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 2, (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 10, (java.lang.Integer) 2, (java.lang.Integer) 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 100);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 2, (java.lang.Integer) 2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 2, (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Integer) (-1));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        fuzzTest0.FuzzTest_put(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap8 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_put(intMap7, intMap8, (java.lang.Integer) 2, (java.lang.Integer) 100, (java.lang.Integer) 2);
    }
}

