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
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet7, (java.util.Collection<java.lang.Integer>) intList13);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet9 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet9, (java.util.Collection<java.lang.Integer>) intList14);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet10 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10, 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet10, (java.util.Collection<java.lang.Integer>) intList15);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10, 1, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet10 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 0, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet10, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 0, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 0, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet11, (java.util.Collection<java.lang.Integer>) intList15);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 1, 10, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet12 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet12, (java.util.Collection<java.lang.Integer>) intList16);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 100, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet10 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10, 0 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet10, (java.util.Collection<java.lang.Integer>) intList15);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1), 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet9 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet9, (java.util.Collection<java.lang.Integer>) intList14);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10, 1, 1, (-1), (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 10, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet11, (java.util.Collection<java.lang.Integer>) intList18);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 0, 0, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, 0 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet11, (java.util.Collection<java.lang.Integer>) intList16);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 10, 0, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet10 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet10, (java.util.Collection<java.lang.Integer>) intList15);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, 0, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, 0, 0, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet13 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet13, (java.util.Collection<java.lang.Integer>) intList19);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100, 10, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 0, 0, 100, 0, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet14 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet14, (java.util.Collection<java.lang.Integer>) intList19);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, (-1), (-1), 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), 1, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet12 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, (-1), 1, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet12, (java.util.Collection<java.lang.Integer>) intList20);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 10, 0, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet11, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 100, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet10 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet10, (java.util.Collection<java.lang.Integer>) intList16);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, (-1), 100, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 10, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet11, (java.util.Collection<java.lang.Integer>) intList18);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 1, 0, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet11, (java.util.Collection<java.lang.Integer>) intList16);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10, (-1), 1, 1, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, (-1), 10, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet11, (java.util.Collection<java.lang.Integer>) intList19);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet8 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 100 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet8, (java.util.Collection<java.lang.Integer>) intList13);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet8 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 0, 0 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet8, (java.util.Collection<java.lang.Integer>) intList13);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 1, 0, 0, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, 1, 100, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet14 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 1, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList21 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet14, (java.util.Collection<java.lang.Integer>) intList21);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10, 1, (-1), 10, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 0, 10, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet14 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 0, (-1) };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet14, (java.util.Collection<java.lang.Integer>) intList20);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 100, (-1), (-1), 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, 10, 1, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet14 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 10, 100 };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet14, (java.util.Collection<java.lang.Integer>) intList20);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10, 10, 10, 1, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet11, (java.util.Collection<java.lang.Integer>) intList15);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100, 0, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0, (-1), 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet12 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 0 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet12, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet8 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 0, 0, 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet8, (java.util.Collection<java.lang.Integer>) intList15);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100, 1, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet11, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet10 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet10, (java.util.Collection<java.lang.Integer>) intList15);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet9 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, (-1), (-1), 100 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet9, (java.util.Collection<java.lang.Integer>) intList16);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { (-1), 1, 10, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet10 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet10, (java.util.Collection<java.lang.Integer>) intList14);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet7, (java.util.Collection<java.lang.Integer>) intList13);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet9 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 10, 10, 1, 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet9, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-1), 100, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { (-1), 0, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet11, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, (-1), 0, 1, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 0, 10, (-1), 1, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet15 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList21 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet15, (java.util.Collection<java.lang.Integer>) intList21);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10, (-1), 10, 0, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { (-1), 0, 0 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet11, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet8 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet8, (java.util.Collection<java.lang.Integer>) intList14);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 10, 100, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 100, (-1), 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet13 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet13, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet8 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 0, (-1) };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet8, (java.util.Collection<java.lang.Integer>) intList13);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 1, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet10 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet10, (java.util.Collection<java.lang.Integer>) intList15);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 10, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet9 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 0, 1, 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet9, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, 10, 100, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet12 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 0, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet12, (java.util.Collection<java.lang.Integer>) intList20);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 100, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet10 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet10, (java.util.Collection<java.lang.Integer>) intList15);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 0, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet7, (java.util.Collection<java.lang.Integer>) intList13);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet8 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet8, (java.util.Collection<java.lang.Integer>) intList14);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), 10, 10, 0, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet11, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 1, (-1), 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, 100, 100, 0, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet14 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, 0, 1, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet14, (java.util.Collection<java.lang.Integer>) intList22);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 100, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet9 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { (-1), 10, 0, 10, 100 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet9, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 100, 100, 10, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100, 100, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet13 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet13, (java.util.Collection<java.lang.Integer>) intList18);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 0, 1, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet10 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet10, (java.util.Collection<java.lang.Integer>) intList14);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10, 10, 0, 0, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet12 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10, 0, 10, 10, 10 };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet12, (java.util.Collection<java.lang.Integer>) intList20);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 0, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet9 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet9, (java.util.Collection<java.lang.Integer>) intList13);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), 0, 100, 0, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, (-1), 0, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet14 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, 1, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList21 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet14, (java.util.Collection<java.lang.Integer>) intList21);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 0, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet9 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet9, (java.util.Collection<java.lang.Integer>) intList13);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), 1, 1, (-1), 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 0, 1, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet13 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet13, (java.util.Collection<java.lang.Integer>) intList18);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { (-1), 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet9 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10, (-1), 10, 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet9, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, 0, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, 10 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet11, (java.util.Collection<java.lang.Integer>) intList16);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, (-1), 1, 10, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100, 100, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet13 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet13, (java.util.Collection<java.lang.Integer>) intList18);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 100, (-1), 1, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, 1, 100, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet14 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), (-1), 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList21 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet14, (java.util.Collection<java.lang.Integer>) intList21);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 100, 10, 1, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet12 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet12, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet8 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 0, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet8, (java.util.Collection<java.lang.Integer>) intList15);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10, (-1), 1, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet10 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 1, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet10, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, (-1), (-1), 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet11, (java.util.Collection<java.lang.Integer>) intList16);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 1, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 1, 1, 100, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet14 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 1 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet14, (java.util.Collection<java.lang.Integer>) intList19);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10, (-1), 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet9 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 1, 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet9, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 0, 10, 100, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, 100, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet11, (java.util.Collection<java.lang.Integer>) intList19);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, (-1), 0, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0, 0, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet12 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 10 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet12, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10, (-1), 100, 0, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 0, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet11, (java.util.Collection<java.lang.Integer>) intList18);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 10, 1, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0, 1, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet12 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 10, 10 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet12, (java.util.Collection<java.lang.Integer>) intList18);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 0, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), 100, 1, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet12 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet12, (java.util.Collection<java.lang.Integer>) intList18);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 1, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet9 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 0, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet9, (java.util.Collection<java.lang.Integer>) intList15);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet7, (java.util.Collection<java.lang.Integer>) intList13);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10, 100, 100, 10, 0 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet7, (java.util.Collection<java.lang.Integer>) intList15);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, (-1), 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet9 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet9, (java.util.Collection<java.lang.Integer>) intList14);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet10 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet10, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 1, 0, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, 10, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet13 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, (-1), 0, 0 };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet13, (java.util.Collection<java.lang.Integer>) intList20);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100, 0, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), 100, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet12 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet12, (java.util.Collection<java.lang.Integer>) intList18);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet11, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 1, 1, (-1), 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 100, 100, 1, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet15 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList21 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet15, (java.util.Collection<java.lang.Integer>) intList21);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 1, 10, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 1, 0, 1, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet14 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, (-1), (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList21 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet14, (java.util.Collection<java.lang.Integer>) intList21);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, (-1), 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, 100, (-1), 10, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet13 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 0, 0, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList21 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet13, (java.util.Collection<java.lang.Integer>) intList21);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 10, (-1), 10, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10, 10, 100, (-1), 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet15 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, 0, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet15, (java.util.Collection<java.lang.Integer>) intList22);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, (-1), (-1), 0, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, 10, (-1), 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet14 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, 0, 0, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest0.FuzzTest_HashSet(intSet7, intSet14, (java.util.Collection<java.lang.Integer>) intList22);
        org.junit.Assert.assertEquals("Contract failed: intSet7.toArray().length == intSet7.size()", intSet7.toArray().length, intSet7.size());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet8 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 10, 10 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet8, (java.util.Collection<java.lang.Integer>) intList14);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 10, (-1), 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, (-1), 1, (-1), 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet14 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 100, 100, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet14, (java.util.Collection<java.lang.Integer>) intList22);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 0, (-1), 0, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet12 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 1, 10, 10 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet12, (java.util.Collection<java.lang.Integer>) intList19);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10, 1, 100, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet10 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet10, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { (-1), 1, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet10 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet10, (java.util.Collection<java.lang.Integer>) intList14);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 100, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0, (-1), 0, 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet12 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10, 100 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet12, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, 0, 1, 0, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet13 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 10, (-1), 10, 100 };
        java.util.ArrayList<java.lang.Integer> intList21 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet13, (java.util.Collection<java.lang.Integer>) intList21);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 10, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 1, (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10, 10, 0, 0 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet11, (java.util.Collection<java.lang.Integer>) intList18);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet8 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet8, (java.util.Collection<java.lang.Integer>) intList14);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet8 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, 10, (-1), 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet8, (java.util.Collection<java.lang.Integer>) intList16);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 0, 0, 1, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 1 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet11, (java.util.Collection<java.lang.Integer>) intList16);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 10 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet4 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, 1, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet11 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest0.FuzzTest_HashSet(intSet4, intSet11, (java.util.Collection<java.lang.Integer>) intList16);
        org.junit.Assert.assertEquals("Contract failed: intSet4.toArray().length == intSet4.size()", intSet4.toArray().length, intSet4.size());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100, (-1), 1 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet10 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { (-1), 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet10, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet7 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 0, 0 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet7, (java.util.Collection<java.lang.Integer>) intList13);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, (-1), (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet5 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet10 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 1, 100, 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest0.FuzzTest_HashSet(intSet5, intSet10, (java.util.Collection<java.lang.Integer>) intList17);
        org.junit.Assert.assertEquals("Contract failed: intSet5.toArray().length == intSet5.size()", intSet5.toArray().length, intSet5.size());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet3 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet8 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, 10, 0 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_HashSet(intSet3, intSet8, (java.util.Collection<java.lang.Integer>) intList14);
        org.junit.Assert.assertEquals("Contract failed: intSet3.toArray().length == intSet3.size()", intSet3.toArray().length, intSet3.size());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, (-1), 100, 100 };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet6 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 0, 100, (-1), (-1) };
        c2s_aug_sub.HashSet<java.lang.Integer> intSet13 = new c2s_aug_sub.HashSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10, (-1), (-1), 100 };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest0.FuzzTest_HashSet(intSet6, intSet13, (java.util.Collection<java.lang.Integer>) intList20);
        org.junit.Assert.assertEquals("Contract failed: intSet6.toArray().length == intSet6.size()", intSet6.toArray().length, intSet6.size());
    }
}

