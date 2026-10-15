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
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList14 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_add(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList22 = null;
        fuzzTest14.FuzzTest_add(intList20, intList22, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest26.FuzzTest_add(intList32, intList34, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest13.FuzzTest_add(intList20, intList34, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest11.FuzzTest_add(intList12, intList34, 0, (java.lang.Integer) 0);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList46 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList12, intList46, 10, (java.lang.Integer) 1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = null;
        fuzzTest4.FuzzTest_add(intList10, intList12, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList22 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = null;
        fuzzTest16.FuzzTest_add(intList22, intList24, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest3.FuzzTest_add(intList10, intList24, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_add(intList2, intList24, 0, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList24, intList34, (int) (byte) 100, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList45 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = null;
        fuzzTest39.FuzzTest_add(intList45, intList47, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList38, intList47, 2, (java.lang.Integer) 0);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList60 = null;
        fuzzTest0.FuzzTest_add(intList58, intList60, (int) (short) 100, (java.lang.Integer) 100);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList64 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest0.FuzzTest_add(intList64, intList65, (int) (byte) 0, (java.lang.Integer) 2);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList69 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = null;
        fuzzTest0.FuzzTest_add(intList69, intList70, (int) '4', (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList74 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 2, 2 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList79 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList74, intList79, (int) (byte) 10, (java.lang.Integer) 2);
    }
}

