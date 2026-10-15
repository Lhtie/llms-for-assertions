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
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_remove(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest12.FuzzTest_remove(intList18, intList20, (int) (byte) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList18, intList24, (int) (short) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_remove(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList12, intList13, 2, (java.lang.Integer) (-1));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_remove(intList7, intList9, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_remove(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList7, intList21, (int) (short) 1, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList28, intList29, (int) (short) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = null;
        fuzzTest4.FuzzTest_remove(intList10, intList12, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList22 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = null;
        fuzzTest16.FuzzTest_remove(intList22, intList24, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest3.FuzzTest_remove(intList10, intList24, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_remove(intList2, intList24, 0, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intList24, intList34, (int) (byte) 100, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest38.FuzzTest_remove(intList44, intList46, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList60 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList62 = null;
        fuzzTest54.FuzzTest_remove(intList60, intList62, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList74 = null;
        fuzzTest66.FuzzTest_remove(intList72, intList74, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest53.FuzzTest_remove(intList60, intList74, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest51.FuzzTest_remove(intList52, intList74, 0, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_remove(intList74, intList84, (int) (byte) 100, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList44, intList84, (int) (short) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest2.FuzzTest_remove(intList8, intList10, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList22 = null;
        fuzzTest14.FuzzTest_remove(intList20, intList22, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_remove(intList8, intList22, (int) (short) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList31 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList8, intList31, 0, (java.lang.Integer) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_remove(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList17 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = null;
        fuzzTest11.FuzzTest_remove(intList17, intList19, (int) (byte) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList34 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = null;
        fuzzTest28.FuzzTest_remove(intList34, intList36, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList46 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = null;
        fuzzTest40.FuzzTest_remove(intList46, intList48, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest27.FuzzTest_remove(intList34, intList48, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest25.FuzzTest_remove(intList26, intList48, 0, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_remove(intList48, intList58, (int) (byte) 100, (java.lang.Integer) 1);
        fuzzTest11.FuzzTest_remove(intList23, intList48, (int) '4', (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList71 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = null;
        fuzzTest65.FuzzTest_remove(intList71, intList73, (int) (byte) 1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList23, intList71, (int) (byte) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = null;
        fuzzTest3.FuzzTest_remove(intList9, intList11, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = null;
        fuzzTest15.FuzzTest_remove(intList21, intList23, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest2.FuzzTest_remove(intList9, intList23, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_remove(intList1, intList23, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = null;
        fuzzTest33.FuzzTest_remove(intList39, intList41, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList54 = null;
        fuzzTest46.FuzzTest_remove(intList52, intList54, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList64 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList66 = null;
        fuzzTest58.FuzzTest_remove(intList64, intList66, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest45.FuzzTest_remove(intList52, intList66, (int) (short) 1, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_remove(intList66, intList73, (int) (byte) 100, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList73, intList77, 0, (java.lang.Integer) 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_remove(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest12.FuzzTest_remove(intList18, intList20, (int) (byte) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList35 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = null;
        fuzzTest29.FuzzTest_remove(intList35, intList37, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList49 = null;
        fuzzTest41.FuzzTest_remove(intList47, intList49, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest28.FuzzTest_remove(intList35, intList49, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest26.FuzzTest_remove(intList27, intList49, 0, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_remove(intList49, intList59, (int) (byte) 100, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_remove(intList24, intList49, (int) '4', (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList67 = null;
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest66.FuzzTest_remove(intList67, intList72, (int) (short) 10, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList24, intList72, 0, (java.lang.Integer) 10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_remove(intList7, intList9, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_remove(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList7, intList21, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList35 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = null;
        fuzzTest29.FuzzTest_remove(intList35, intList37, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList49 = null;
        fuzzTest41.FuzzTest_remove(intList47, intList49, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest28.FuzzTest_remove(intList35, intList49, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList66 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList68 = null;
        fuzzTest60.FuzzTest_remove(intList66, intList68, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList78 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList80 = null;
        fuzzTest72.FuzzTest_remove(intList78, intList80, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest59.FuzzTest_remove(intList66, intList80, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest57.FuzzTest_remove(intList58, intList80, 0, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList90 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_remove(intList80, intList90, (int) (byte) 100, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList35, intList90, 0, (java.lang.Integer) 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_remove(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList25 = null;
        fuzzTest17.FuzzTest_remove(intList23, intList25, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList35 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = null;
        fuzzTest29.FuzzTest_remove(intList35, intList37, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest16.FuzzTest_remove(intList23, intList37, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest14.FuzzTest_remove(intList15, intList37, 0, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_remove(intList37, intList47, (int) (byte) 100, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList12, intList37, (int) (byte) 1, (java.lang.Integer) 10);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList54 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList55 = null;
        fuzzTest0.FuzzTest_remove(intList54, intList55, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList67 = null;
        fuzzTest59.FuzzTest_remove(intList65, intList67, (int) (byte) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10, 10, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList75 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList65, intList75, (int) (short) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_remove(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_remove(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList31 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest25.FuzzTest_remove(intList31, intList33, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_remove(intList19, intList33, (int) (short) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList11, intList19, (int) (byte) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_remove(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest12.FuzzTest_remove(intList13, intList18, (int) (short) 10, (java.lang.Integer) 10);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = null;
        fuzzTest24.FuzzTest_remove(intList30, intList32, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_remove(intList23, intList30, (int) 'a', (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList11, intList30, (int) (short) 1, (java.lang.Integer) 10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_remove(intList7, intList9, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_remove(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList7, intList21, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = null;
        fuzzTest30.FuzzTest_remove(intList36, intList38, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList50 = null;
        fuzzTest42.FuzzTest_remove(intList48, intList50, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest29.FuzzTest_remove(intList36, intList50, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList63 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest57.FuzzTest_remove(intList63, intList65, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest28.FuzzTest_remove(intList50, intList63, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList74 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList82 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList84 = null;
        fuzzTest76.FuzzTest_remove(intList82, intList84, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest28.FuzzTest_remove(intList74, intList84, (int) (byte) -1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 10, 2 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList94 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList94, intArray93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList74, intList94, (int) (short) 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_remove(intList7, intList9, (int) (byte) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = null;
        fuzzTest18.FuzzTest_remove(intList24, intList26, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = null;
        fuzzTest30.FuzzTest_remove(intList36, intList38, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_remove(intList24, intList38, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest15.FuzzTest_remove(intList16, intList38, 0, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_remove(intList38, intList48, (int) (byte) 100, (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_remove(intList13, intList38, (int) '4', (java.lang.Integer) 2);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, 10, 100, 10, 10, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList62 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = null;
        fuzzTest64.FuzzTest_remove(intList70, intList72, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_remove(intList62, intList72, 10, (java.lang.Integer) 10);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList82 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList62, intList82, 2, (java.lang.Integer) 2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_remove(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest12.FuzzTest_remove(intList18, intList20, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = null;
        fuzzTest24.FuzzTest_remove(intList30, intList32, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest11.FuzzTest_remove(intList18, intList32, (int) (short) 1, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList40 = null;
        fuzzTest11.FuzzTest_remove(intList39, intList40, (int) '4', (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList50 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = null;
        fuzzTest44.FuzzTest_remove(intList50, intList52, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList39, intList52, (int) (short) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 10, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList63 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList63, intList65, 2, (java.lang.Integer) 1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_remove(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest12.FuzzTest_remove(intList18, intList20, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = null;
        fuzzTest24.FuzzTest_remove(intList30, intList32, (int) (byte) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList49 = null;
        fuzzTest41.FuzzTest_remove(intList47, intList49, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList59 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList61 = null;
        fuzzTest53.FuzzTest_remove(intList59, intList61, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest40.FuzzTest_remove(intList47, intList61, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest38.FuzzTest_remove(intList39, intList61, 0, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(intList61, intList71, (int) (byte) 100, (java.lang.Integer) 1);
        fuzzTest24.FuzzTest_remove(intList36, intList61, (int) (byte) 1, (java.lang.Integer) 10);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList78 = null;
        fuzzTest12.FuzzTest_remove(intList36, intList78, (int) (short) 100, (java.lang.Integer) 2);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList36, intList82, 0, (java.lang.Integer) 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_remove(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList25 = null;
        fuzzTest17.FuzzTest_remove(intList23, intList25, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList35 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = null;
        fuzzTest29.FuzzTest_remove(intList35, intList37, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest16.FuzzTest_remove(intList23, intList37, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest14.FuzzTest_remove(intList15, intList37, 0, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_remove(intList37, intList47, (int) (byte) 100, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList12, intList37, (int) '4', (java.lang.Integer) 2);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList56 = null;
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList61 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest55.FuzzTest_remove(intList56, intList61, (int) (short) 10, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_remove(intList54, intList56, (int) (short) -1, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = null;
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList75 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest69.FuzzTest_remove(intList70, intList75, (int) (short) 10, (java.lang.Integer) 10);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList80 = null;
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList87 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList89 = null;
        fuzzTest81.FuzzTest_remove(intList87, intList89, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest69.FuzzTest_remove(intList80, intList87, (int) 'a', (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayList<java.lang.Integer> intList96 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList87, intList96, 0, (java.lang.Integer) 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_remove(intList7, intList9, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_remove(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList7, intList21, (int) (short) 1, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest0.FuzzTest_remove(intList28, intList29, (int) '4', (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayList<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest0.FuzzTest_remove(intList33, intList34, (int) (short) -1, (java.lang.Integer) 2);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest0.FuzzTest_remove(intList38, intList39, 10, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList51 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList53 = null;
        fuzzTest45.FuzzTest_remove(intList51, intList53, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList63 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest57.FuzzTest_remove(intList63, intList65, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest44.FuzzTest_remove(intList51, intList65, (int) (short) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList43, intList51, 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest2.FuzzTest_remove(intList8, intList10, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList22 = null;
        fuzzTest14.FuzzTest_remove(intList20, intList22, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_remove(intList8, intList22, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList35 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = null;
        fuzzTest29.FuzzTest_remove(intList35, intList37, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList22, intList35, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList51 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList53 = null;
        fuzzTest45.FuzzTest_remove(intList51, intList53, (int) (byte) 1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList44, intList51, (int) (short) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_remove(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest12.FuzzTest_remove(intList13, intList18, (int) (short) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList31 = null;
        fuzzTest23.FuzzTest_remove(intList29, intList31, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList42 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = null;
        fuzzTest36.FuzzTest_remove(intList42, intList44, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList54 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList56 = null;
        fuzzTest48.FuzzTest_remove(intList54, intList56, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest35.FuzzTest_remove(intList42, intList56, (int) (short) 1, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayList<java.lang.Integer> intList63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_remove(intList56, intList63, (int) (byte) 100, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_remove(intList13, intList63, 2, (java.lang.Integer) 100);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 2, 0, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList74 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList77 = null;
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList82 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest76.FuzzTest_remove(intList77, intList82, (int) (short) 10, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList74, intList82, (int) (byte) 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_remove(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList25 = null;
        fuzzTest17.FuzzTest_remove(intList23, intList25, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList35 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = null;
        fuzzTest29.FuzzTest_remove(intList35, intList37, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest16.FuzzTest_remove(intList23, intList37, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest14.FuzzTest_remove(intList15, intList37, 0, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_remove(intList37, intList47, (int) (byte) 100, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList12, intList37, (int) '4', (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList61 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList63 = null;
        fuzzTest55.FuzzTest_remove(intList61, intList63, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList75 = null;
        fuzzTest67.FuzzTest_remove(intList73, intList75, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest54.FuzzTest_remove(intList61, intList75, (int) (short) 1, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayList<java.lang.Integer> intList82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intList75, intList82, (int) (byte) 0, (java.lang.Integer) 10);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList86 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList87 = null;
        fuzzTest0.FuzzTest_remove(intList86, intList87, 100, (java.lang.Integer) 2);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList91 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 100, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList95 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList95, intArray94);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList91, intList95, (int) (byte) 1, (java.lang.Integer) 10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_remove(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = null;
        fuzzTest15.FuzzTest_remove(intList21, intList23, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList33 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList35 = null;
        fuzzTest27.FuzzTest_remove(intList33, intList35, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest14.FuzzTest_remove(intList21, intList35, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest12.FuzzTest_remove(intList13, intList35, 0, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(intList35, intList45, (int) (byte) 100, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList55 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList57 = null;
        fuzzTest49.FuzzTest_remove(intList55, intList57, (int) (byte) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList61 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList62 = null;
        fuzzTest49.FuzzTest_remove(intList61, intList62, (int) ' ', (java.lang.Integer) 10);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList68 = null;
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest67.FuzzTest_remove(intList68, intList73, (int) (short) 10, (java.lang.Integer) 10);
        fuzzTest49.FuzzTest_remove(intList66, intList73, (int) (byte) -1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList45, intList73, (int) (short) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_remove(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_remove(intList12, intList13, (int) ' ', (java.lang.Integer) 10);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = null;
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest18.FuzzTest_remove(intList19, intList24, (int) (short) 10, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_remove(intList17, intList24, (int) (byte) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList35 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList35, intList37, (int) (short) 1, (java.lang.Integer) 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_remove(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList17 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = null;
        fuzzTest11.FuzzTest_remove(intList17, intList19, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = null;
        fuzzTest24.FuzzTest_remove(intList30, intList32, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList42 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = null;
        fuzzTest36.FuzzTest_remove(intList42, intList44, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest23.FuzzTest_remove(intList30, intList44, (int) (short) 1, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayList<java.lang.Integer> intList51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(intList44, intList51, (int) (byte) 100, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList55 = null;
        fuzzTest0.FuzzTest_remove(intList51, intList55, 100, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList67 = null;
        fuzzTest59.FuzzTest_remove(intList65, intList67, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList77 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList79 = null;
        fuzzTest71.FuzzTest_remove(intList77, intList79, (int) (byte) 1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList65, intList77, 0, (java.lang.Integer) 2);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_remove(intList7, intList9, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_remove(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList7, intList21, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = null;
        fuzzTest30.FuzzTest_remove(intList36, intList38, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList50 = null;
        fuzzTest42.FuzzTest_remove(intList48, intList50, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest29.FuzzTest_remove(intList36, intList50, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList63 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest57.FuzzTest_remove(intList63, intList65, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest28.FuzzTest_remove(intList50, intList63, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(intList72, intList73, 10, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList77 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(intList77, intList78, (int) (byte) -1, (java.lang.Integer) 0);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList85 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList78, intList85, 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_remove(intList7, intList9, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_remove(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList7, intList21, (int) (short) 1, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest0.FuzzTest_remove(intList28, intList29, (int) ' ', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList43 = null;
        fuzzTest35.FuzzTest_remove(intList41, intList43, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList53 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList55 = null;
        fuzzTest47.FuzzTest_remove(intList53, intList55, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest34.FuzzTest_remove(intList41, intList55, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList68 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = null;
        fuzzTest62.FuzzTest_remove(intList68, intList70, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest33.FuzzTest_remove(intList55, intList68, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList77 = null;
        fuzzTest0.FuzzTest_remove(intList68, intList77, (int) (short) -1, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList87 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList89 = null;
        fuzzTest81.FuzzTest_remove(intList87, intList89, (int) (byte) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList93 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList87, intList93, 2, (java.lang.Integer) 10);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_remove(intList7, intList9, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_remove(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList7, intList21, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList34 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = null;
        fuzzTest28.FuzzTest_remove(intList34, intList36, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList49 = null;
        fuzzTest41.FuzzTest_remove(intList47, intList49, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList59 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList61 = null;
        fuzzTest53.FuzzTest_remove(intList59, intList61, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest40.FuzzTest_remove(intList47, intList61, (int) (short) 1, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayList<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_remove(intList61, intList68, (int) (byte) 100, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = null;
        fuzzTest0.FuzzTest_remove(intList68, intList72, (int) (byte) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList82 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList84 = null;
        fuzzTest76.FuzzTest_remove(intList82, intList84, (int) (byte) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList88 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList82, intList88, 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_remove(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_remove(intList12, intList13, (int) ' ', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList25 = null;
        fuzzTest17.FuzzTest_remove(intList23, intList25, (int) (byte) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList40 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList42 = null;
        fuzzTest34.FuzzTest_remove(intList40, intList42, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList54 = null;
        fuzzTest46.FuzzTest_remove(intList52, intList54, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest33.FuzzTest_remove(intList40, intList54, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest31.FuzzTest_remove(intList32, intList54, 0, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_remove(intList54, intList64, (int) (byte) 100, (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_remove(intList29, intList54, (int) '4', (java.lang.Integer) 2);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 2, (-1), 0, (-1), 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList78 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList29, intList78, (int) (byte) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList4 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = null;
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest6.FuzzTest_remove(intList7, intList12, (int) (short) 10, (java.lang.Integer) 10);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 100, 100, (-1), 0, 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList33 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList35 = null;
        fuzzTest27.FuzzTest_remove(intList33, intList35, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList45 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = null;
        fuzzTest39.FuzzTest_remove(intList45, intList47, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList60 = null;
        fuzzTest52.FuzzTest_remove(intList58, intList60, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = null;
        fuzzTest64.FuzzTest_remove(intList70, intList72, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest51.FuzzTest_remove(intList58, intList72, (int) (short) 1, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayList<java.lang.Integer> intList79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_remove(intList72, intList79, (int) (byte) 100, (java.lang.Integer) 0);
        fuzzTest26.FuzzTest_remove(intList33, intList72, (int) (byte) 100, (java.lang.Integer) 0);
        fuzzTest6.FuzzTest_remove(intList24, intList72, (int) 'a', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList4, intList24, 2, (java.lang.Integer) 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_remove(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest12.FuzzTest_remove(intList13, intList18, (int) (short) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = null;
        fuzzTest24.FuzzTest_remove(intList30, intList32, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList42 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = null;
        fuzzTest36.FuzzTest_remove(intList42, intList44, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest23.FuzzTest_remove(intList30, intList44, (int) (short) 1, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayList<java.lang.Integer> intList51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = null;
        fuzzTest23.FuzzTest_remove(intList51, intList52, (int) '4', (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayList<java.lang.Integer> intList56 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList57 = null;
        fuzzTest23.FuzzTest_remove(intList56, intList57, (int) (short) -1, (java.lang.Integer) 2);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList61 = null;
        fuzzTest12.FuzzTest_remove(intList56, intList61, (int) (byte) 100, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList71 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = null;
        fuzzTest65.FuzzTest_remove(intList71, intList73, (int) (byte) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList77 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList78 = null;
        fuzzTest65.FuzzTest_remove(intList77, intList78, 10, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList82 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList83 = null;
        fuzzTest65.FuzzTest_remove(intList82, intList83, 2, (java.lang.Integer) 0);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList87 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList88 = null;
        fuzzTest65.FuzzTest_remove(intList87, intList88, (int) ' ', (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayList<java.lang.Integer> intList92 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList93 = null;
        fuzzTest65.FuzzTest_remove(intList92, intList93, (int) (byte) 10, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList56, intList92, (int) (short) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_remove(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest12.FuzzTest_remove(intList13, intList18, (int) (short) 10, (java.lang.Integer) 10);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 0, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = null;
        fuzzTest24.FuzzTest_remove(intList30, intList32, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_remove(intList23, intList30, (int) 'a', (java.lang.Integer) (-1));
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList42 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList30, intList42, 0, (java.lang.Integer) 0);
    }
}

