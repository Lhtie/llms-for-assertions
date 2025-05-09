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
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList2, (int) (byte) 1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList2, (-1));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 100);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) -1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) 10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList2, (int) (short) 10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) 100);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList6, 100);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList2, (int) 'a');
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 100);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) 'a');
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) 'a');
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (-1));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) ' ');
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList2, 100);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 100);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 100);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (-1));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) 'a');
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) -1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 100);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) -1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) 100);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) '4');
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) '4');
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) -1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (-1));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (short) 100);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) ' ');
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 100);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) 100);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) '#');
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) ' ');
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) 10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) '4');
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 100);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) 'a');
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 100);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) '#');
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (short) -1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) '4');
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) -1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) 100);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (short) 100);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 100);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, 100);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 100);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) '4');
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) ' ');
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 100);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 10, 0, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList6, (-1));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) '4');
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, 100);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 100);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (short) 10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) ' ');
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) -1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (short) 10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) -1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (short) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) '4');
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (-1));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 100);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) '4');
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) -1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 100);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) -1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, 10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) '#');
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) '#');
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 100);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 100, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) 'a');
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) 10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (short) 100);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) -1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) -1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) '#');
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) ' ');
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) -1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) ' ');
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) '#');
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (-1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) -1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 0, 100, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) '#');
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (short) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList3, (int) (byte) 100);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (int) (byte) 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList5, (-1));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) 'a');
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, 1);
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.IndexOutOfBoundsException in error
        fuzztests.FuzzTest_fuzzchecker.ADD_FuzzTest(intList4, (int) (short) -1);
    }
}

