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
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap0 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Class<?> wildcardClass1 = intMap0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap0 and intMap0", intMap0.equals(intMap0) ? intMap0.hashCode() == intMap0.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 10, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 100, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 100, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 1, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 1, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 100, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 1, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) (-1), (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 100, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 10, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) (-1), (java.lang.Integer) 2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 1, (java.lang.Integer) 2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 10, (java.lang.Integer) 2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 10, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) (-1), (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 10, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 0, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 1, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 100, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 100, (java.lang.Integer) 2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_get(intMap1, intMap2, (java.lang.Integer) 2, (java.lang.Integer) 2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }
}

