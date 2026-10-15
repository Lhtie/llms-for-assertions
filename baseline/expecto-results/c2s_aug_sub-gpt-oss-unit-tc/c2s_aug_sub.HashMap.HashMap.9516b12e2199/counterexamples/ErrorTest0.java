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
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap3 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_HashMap(intMap1, intMap2, intMap3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap0 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Class<?> wildcardClass1 = intMap0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap0 and intMap0", intMap0.equals(intMap0) ? intMap0.hashCode() == intMap0.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_HashMap(intMap1, intMap2, (java.util.Map<java.lang.Integer, java.lang.Integer>) intMap3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap3 = null;
        fuzzTest0.FuzzTest_HashMap(intMap1, intMap2, intMap3);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap5 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap6 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap7 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_HashMap(intMap5, intMap6, intMap7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap3 = null;
        fuzzTest0.FuzzTest_HashMap(intMap1, intMap2, intMap3);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap5 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap6 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap7 = null;
        fuzzTest0.FuzzTest_HashMap(intMap5, intMap6, intMap7);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap9 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap10 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap11 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_HashMap(intMap9, intMap10, intMap11);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap3 = null;
        fuzzTest0.FuzzTest_HashMap(intMap1, intMap2, intMap3);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap5 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap6 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap7 = null;
        fuzzTest0.FuzzTest_HashMap(intMap5, intMap6, intMap7);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap9 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap10 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap11 = null;
        fuzzTest0.FuzzTest_HashMap(intMap9, intMap10, intMap11);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap13 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap14 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap15 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_HashMap(intMap13, intMap14, intMap15);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap3 = null;
        fuzzTest0.FuzzTest_HashMap(intMap1, intMap2, intMap3);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap5 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap6 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap7 = null;
        fuzzTest0.FuzzTest_HashMap(intMap5, intMap6, intMap7);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap9 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap10 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap11 = null;
        fuzzTest0.FuzzTest_HashMap(intMap9, intMap10, intMap11);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap13 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap14 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap15 = null;
        fuzzTest0.FuzzTest_HashMap(intMap13, intMap14, intMap15);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap18 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap19 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_HashMap(intMap17, intMap18, intMap19);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap3 = null;
        fuzzTest0.FuzzTest_HashMap(intMap1, intMap2, intMap3);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap5 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap6 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap7 = null;
        fuzzTest0.FuzzTest_HashMap(intMap5, intMap6, intMap7);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap9 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap10 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap11 = null;
        fuzzTest0.FuzzTest_HashMap(intMap9, intMap10, intMap11);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap13 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap14 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap15 = null;
        fuzzTest0.FuzzTest_HashMap(intMap13, intMap14, intMap15);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap17 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap18 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap19 = null;
        fuzzTest0.FuzzTest_HashMap(intMap17, intMap18, intMap19);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap21 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap22 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap23 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_HashMap(intMap21, intMap22, intMap23);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap3 = null;
        fuzzTest0.FuzzTest_HashMap(intMap1, intMap2, intMap3);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap5 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap6 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap7 = null;
        fuzzTest0.FuzzTest_HashMap(intMap5, intMap6, intMap7);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap9 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap10 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap11 = null;
        fuzzTest0.FuzzTest_HashMap(intMap9, intMap10, intMap11);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap13 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap14 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap15 = null;
        fuzzTest0.FuzzTest_HashMap(intMap13, intMap14, intMap15);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap17 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap18 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap19 = null;
        fuzzTest0.FuzzTest_HashMap(intMap17, intMap18, intMap19);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap21 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap22 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap23 = null;
        fuzzTest0.FuzzTest_HashMap(intMap21, intMap22, intMap23);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap25 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap26 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap27 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_HashMap(intMap25, intMap26, intMap27);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap3 = null;
        fuzzTest0.FuzzTest_HashMap(intMap1, intMap2, intMap3);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap5 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap6 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap7 = null;
        fuzzTest0.FuzzTest_HashMap(intMap5, intMap6, intMap7);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap9 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap10 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap11 = null;
        fuzzTest0.FuzzTest_HashMap(intMap9, intMap10, intMap11);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap13 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap14 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap15 = null;
        fuzzTest0.FuzzTest_HashMap(intMap13, intMap14, intMap15);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap17 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap18 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap19 = null;
        fuzzTest0.FuzzTest_HashMap(intMap17, intMap18, intMap19);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap21 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap22 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap23 = null;
        fuzzTest0.FuzzTest_HashMap(intMap21, intMap22, intMap23);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap25 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap26 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap27 = null;
        fuzzTest0.FuzzTest_HashMap(intMap25, intMap26, intMap27);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap29 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap30 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap31 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_HashMap(intMap29, intMap30, intMap31);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap3 = null;
        fuzzTest0.FuzzTest_HashMap(intMap1, intMap2, intMap3);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap5 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap6 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap7 = null;
        fuzzTest0.FuzzTest_HashMap(intMap5, intMap6, intMap7);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap9 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap10 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap11 = null;
        fuzzTest0.FuzzTest_HashMap(intMap9, intMap10, intMap11);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap13 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap14 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap15 = null;
        fuzzTest0.FuzzTest_HashMap(intMap13, intMap14, intMap15);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap17 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap18 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap19 = null;
        fuzzTest0.FuzzTest_HashMap(intMap17, intMap18, intMap19);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap21 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap22 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap23 = null;
        fuzzTest0.FuzzTest_HashMap(intMap21, intMap22, intMap23);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap25 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap26 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap27 = null;
        fuzzTest0.FuzzTest_HashMap(intMap25, intMap26, intMap27);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap29 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap30 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap31 = null;
        fuzzTest0.FuzzTest_HashMap(intMap29, intMap30, intMap31);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap33 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap34 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap35 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_HashMap(intMap33, intMap34, intMap35);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap3 = null;
        fuzzTest0.FuzzTest_HashMap(intMap1, intMap2, intMap3);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap5 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap6 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap7 = null;
        fuzzTest0.FuzzTest_HashMap(intMap5, intMap6, intMap7);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap9 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap10 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap11 = null;
        fuzzTest0.FuzzTest_HashMap(intMap9, intMap10, intMap11);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap13 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap14 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap15 = null;
        fuzzTest0.FuzzTest_HashMap(intMap13, intMap14, intMap15);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap17 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap18 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap19 = null;
        fuzzTest0.FuzzTest_HashMap(intMap17, intMap18, intMap19);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap21 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap22 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap23 = null;
        fuzzTest0.FuzzTest_HashMap(intMap21, intMap22, intMap23);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap25 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap26 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap27 = null;
        fuzzTest0.FuzzTest_HashMap(intMap25, intMap26, intMap27);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap29 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap30 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap31 = null;
        fuzzTest0.FuzzTest_HashMap(intMap29, intMap30, intMap31);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap33 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap34 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap35 = null;
        fuzzTest0.FuzzTest_HashMap(intMap33, intMap34, intMap35);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap37 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap38 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap39 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_HashMap(intMap37, intMap38, intMap39);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap3 = null;
        fuzzTest0.FuzzTest_HashMap(intMap1, intMap2, intMap3);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap5 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap6 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap7 = null;
        fuzzTest0.FuzzTest_HashMap(intMap5, intMap6, intMap7);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap9 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap10 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap11 = null;
        fuzzTest0.FuzzTest_HashMap(intMap9, intMap10, intMap11);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap13 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap14 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap15 = null;
        fuzzTest0.FuzzTest_HashMap(intMap13, intMap14, intMap15);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap17 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap18 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap19 = null;
        fuzzTest0.FuzzTest_HashMap(intMap17, intMap18, intMap19);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap21 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap22 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap23 = null;
        fuzzTest0.FuzzTest_HashMap(intMap21, intMap22, intMap23);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap25 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap26 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap27 = null;
        fuzzTest0.FuzzTest_HashMap(intMap25, intMap26, intMap27);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap29 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap30 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap31 = null;
        fuzzTest0.FuzzTest_HashMap(intMap29, intMap30, intMap31);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap33 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap34 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap35 = null;
        fuzzTest0.FuzzTest_HashMap(intMap33, intMap34, intMap35);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap37 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap38 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap39 = null;
        fuzzTest0.FuzzTest_HashMap(intMap37, intMap38, intMap39);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap41 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap42 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap43 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_HashMap(intMap41, intMap42, intMap43);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap3 = null;
        fuzzTest0.FuzzTest_HashMap(intMap1, intMap2, intMap3);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap5 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap6 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap7 = null;
        fuzzTest0.FuzzTest_HashMap(intMap5, intMap6, intMap7);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap9 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap10 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap11 = null;
        fuzzTest0.FuzzTest_HashMap(intMap9, intMap10, intMap11);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap13 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap14 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap15 = null;
        fuzzTest0.FuzzTest_HashMap(intMap13, intMap14, intMap15);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap17 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap18 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap19 = null;
        fuzzTest0.FuzzTest_HashMap(intMap17, intMap18, intMap19);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap21 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap22 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap23 = null;
        fuzzTest0.FuzzTest_HashMap(intMap21, intMap22, intMap23);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap25 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap26 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap27 = null;
        fuzzTest0.FuzzTest_HashMap(intMap25, intMap26, intMap27);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap29 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap30 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap31 = null;
        fuzzTest0.FuzzTest_HashMap(intMap29, intMap30, intMap31);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap33 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap34 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap35 = null;
        fuzzTest0.FuzzTest_HashMap(intMap33, intMap34, intMap35);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap37 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap38 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap39 = null;
        fuzzTest0.FuzzTest_HashMap(intMap37, intMap38, intMap39);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap41 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap42 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap43 = null;
        fuzzTest0.FuzzTest_HashMap(intMap41, intMap42, intMap43);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap45 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap46 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap47 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_HashMap(intMap45, intMap46, intMap47);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap3 = null;
        fuzzTest0.FuzzTest_HashMap(intMap1, intMap2, intMap3);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap5 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap6 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap7 = null;
        fuzzTest0.FuzzTest_HashMap(intMap5, intMap6, intMap7);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap9 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap10 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap11 = null;
        fuzzTest0.FuzzTest_HashMap(intMap9, intMap10, intMap11);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap13 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap14 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap15 = null;
        fuzzTest0.FuzzTest_HashMap(intMap13, intMap14, intMap15);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap17 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap18 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap19 = null;
        fuzzTest0.FuzzTest_HashMap(intMap17, intMap18, intMap19);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap21 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap22 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap23 = null;
        fuzzTest0.FuzzTest_HashMap(intMap21, intMap22, intMap23);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap25 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap26 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap27 = null;
        fuzzTest0.FuzzTest_HashMap(intMap25, intMap26, intMap27);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap29 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap30 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap31 = null;
        fuzzTest0.FuzzTest_HashMap(intMap29, intMap30, intMap31);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap33 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap34 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap35 = null;
        fuzzTest0.FuzzTest_HashMap(intMap33, intMap34, intMap35);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap37 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap38 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap39 = null;
        fuzzTest0.FuzzTest_HashMap(intMap37, intMap38, intMap39);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap41 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap42 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap43 = null;
        fuzzTest0.FuzzTest_HashMap(intMap41, intMap42, intMap43);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap45 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap46 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap47 = null;
        fuzzTest0.FuzzTest_HashMap(intMap45, intMap46, intMap47);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap50 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap51 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_HashMap(intMap49, intMap50, intMap51);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap3 = null;
        fuzzTest0.FuzzTest_HashMap(intMap1, intMap2, intMap3);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap5 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap6 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap7 = null;
        fuzzTest0.FuzzTest_HashMap(intMap5, intMap6, intMap7);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap9 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap10 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap11 = null;
        fuzzTest0.FuzzTest_HashMap(intMap9, intMap10, intMap11);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap13 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap14 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap15 = null;
        fuzzTest0.FuzzTest_HashMap(intMap13, intMap14, intMap15);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap17 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap18 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap19 = null;
        fuzzTest0.FuzzTest_HashMap(intMap17, intMap18, intMap19);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap21 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap22 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap23 = null;
        fuzzTest0.FuzzTest_HashMap(intMap21, intMap22, intMap23);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap25 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap26 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap27 = null;
        fuzzTest0.FuzzTest_HashMap(intMap25, intMap26, intMap27);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap29 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap30 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap31 = null;
        fuzzTest0.FuzzTest_HashMap(intMap29, intMap30, intMap31);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap33 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap34 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap35 = null;
        fuzzTest0.FuzzTest_HashMap(intMap33, intMap34, intMap35);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap37 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap38 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap39 = null;
        fuzzTest0.FuzzTest_HashMap(intMap37, intMap38, intMap39);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap41 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap42 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap43 = null;
        fuzzTest0.FuzzTest_HashMap(intMap41, intMap42, intMap43);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap45 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap46 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap47 = null;
        fuzzTest0.FuzzTest_HashMap(intMap45, intMap46, intMap47);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap49 = null;
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap50 = null;
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap51 = null;
        fuzzTest0.FuzzTest_HashMap(intMap49, intMap50, intMap51);
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap53 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap54 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.Map<java.lang.Integer, java.lang.Integer> intMap55 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_HashMap(intMap53, intMap54, intMap55);
    }
}

