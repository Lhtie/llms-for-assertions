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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap0 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Class<?> wildcardClass1 = intMap0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap0 and intMap0", intMap0.equals(intMap0) ? intMap0.hashCode() == intMap0.hashCode() : true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap2 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.HashMap<java.lang.Integer, java.lang.Integer> intMap3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_putAll(intMap1, intMap2, (java.util.Map<java.lang.Integer, java.lang.Integer>) intMap3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intMap1 and intMap1", intMap1.equals(intMap1) ? intMap1.hashCode() == intMap1.hashCode() : true);
    }
}

