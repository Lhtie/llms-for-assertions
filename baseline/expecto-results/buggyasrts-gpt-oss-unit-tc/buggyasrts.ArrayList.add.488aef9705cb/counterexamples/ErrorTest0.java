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
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = null;
        fuzzTest4.FuzzTest_add(intList10, intList12, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = null;
        fuzzTest16.FuzzTest_add(intList22, intList24, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest3.FuzzTest_add(intList10, intList24, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_add(intList2, intList24, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList24, intList34, (int) (byte) 100, (java.lang.Integer) 1);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 2, 1, 0, 0, 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, (-1) };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList45, intList50, 10, (java.lang.Integer) 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = null;
        fuzzTest6.FuzzTest_add(intList12, intList14, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = null;
        fuzzTest18.FuzzTest_add(intList24, intList26, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest5.FuzzTest_add(intList12, intList26, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest3.FuzzTest_add(intList4, intList26, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_add(intList26, intList36, (int) (byte) 100, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList49 = null;
        fuzzTest41.FuzzTest_add(intList47, intList49, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest2.FuzzTest_add(intList40, intList49, 2, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList1, intList40, (int) (byte) 10, (java.lang.Integer) 2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_add(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest25.FuzzTest_add(intList31, intList33, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_add(intList19, intList33, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList33, intList40, (int) (byte) 100, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = null;
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 100, (-1) };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest0.FuzzTest_add(intList44, intList50, (int) '4', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList63 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest57.FuzzTest_add(intList63, intList65, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList75 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList77 = null;
        fuzzTest69.FuzzTest_add(intList75, intList77, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest56.FuzzTest_add(intList63, intList77, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList84 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList85 = null;
        fuzzTest56.FuzzTest_add(intList84, intList85, (int) '4', (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList55, intList84, (int) (byte) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = null;
        fuzzTest15.FuzzTest_add(intList21, intList23, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = null;
        fuzzTest27.FuzzTest_add(intList33, intList35, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest14.FuzzTest_add(intList21, intList35, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest12.FuzzTest_add(intList13, intList35, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList53 = null;
        fuzzTest45.FuzzTest_add(intList51, intList53, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList35, intList51, (int) (byte) 1, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList60 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList61 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList60, intList61, (int) (byte) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList25 = null;
        fuzzTest17.FuzzTest_add(intList23, intList25, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList37 = null;
        fuzzTest29.FuzzTest_add(intList35, intList37, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest16.FuzzTest_add(intList23, intList37, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest14.FuzzTest_add(intList15, intList37, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(intList37, intList47, (int) (byte) 100, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList12, intList37, (int) (byte) 1, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = null;
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList61 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest55.FuzzTest_add(intList56, intList61, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList73 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList75 = null;
        fuzzTest67.FuzzTest_add(intList73, intList75, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest55.FuzzTest_add(intList66, intList73, (int) 'a', (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList54, intList73, (int) (short) 10, (java.lang.Integer) 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_add(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = null;
        fuzzTest14.FuzzTest_add(intList20, intList22, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest26.FuzzTest_add(intList32, intList34, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest13.FuzzTest_add(intList20, intList34, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest11.FuzzTest_add(intList12, intList34, 0, (java.lang.Integer) 0);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList12, intList46, 10, (java.lang.Integer) 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = null;
        fuzzTest4.FuzzTest_add(intList10, intList12, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = null;
        fuzzTest16.FuzzTest_add(intList22, intList24, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest3.FuzzTest_add(intList10, intList24, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_add(intList2, intList24, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList24, intList34, (int) (byte) 100, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = null;
        fuzzTest39.FuzzTest_add(intList45, intList47, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList38, intList47, 2, (java.lang.Integer) 0);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList58 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList60 = null;
        fuzzTest0.FuzzTest_add(intList58, intList60, (int) (short) 100, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest0.FuzzTest_add(intList64, intList65, (int) (byte) 0, (java.lang.Integer) 2);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList69 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList70 = null;
        fuzzTest0.FuzzTest_add(intList69, intList70, (int) '4', (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList74 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 2, 2 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList79 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList74, intList79, (int) (byte) 10, (java.lang.Integer) 2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_add(intList7, intList9, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_add(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList7, intList21, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest0.FuzzTest_add(intList28, intList29, (int) '4', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest0.FuzzTest_add(intList33, intList34, (int) (byte) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = null;
        fuzzTest39.FuzzTest_add(intList45, intList47, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = null;
        fuzzTest39.FuzzTest_add(intList51, intList52, 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, 100, 2, 0, 2 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList62 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = null;
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList70 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest64.FuzzTest_add(intList65, intList70, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList75 = null;
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList82 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList84 = null;
        fuzzTest76.FuzzTest_add(intList82, intList84, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest64.FuzzTest_add(intList75, intList82, (int) 'a', (java.lang.Integer) (-1));
        fuzzTest39.FuzzTest_add(intList62, intList75, (int) (short) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList38, intList62, (int) (short) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_add(intList7, intList9, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_add(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList7, intList21, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest0.FuzzTest_add(intList28, intList29, (int) '4', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = null;
        fuzzTest0.FuzzTest_add(intList33, intList34, (int) (short) -1, (java.lang.Integer) 2);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest0.FuzzTest_add(intList38, intList39, (int) '4', (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = null;
        fuzzTest44.FuzzTest_add(intList50, intList52, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = null;
        fuzzTest44.FuzzTest_add(intList56, intList57, 10, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList61 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList62 = null;
        fuzzTest44.FuzzTest_add(intList61, intList62, 2, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList66 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList67 = null;
        fuzzTest44.FuzzTest_add(intList66, intList67, (int) ' ', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList71 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = null;
        fuzzTest44.FuzzTest_add(intList71, intList72, (int) (byte) 10, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList43, intList71, 10, (java.lang.Integer) 1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_add(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest12.FuzzTest_add(intList18, intList20, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList11, intList18, (int) 'a', (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = null;
        fuzzTest28.FuzzTest_add(intList34, intList36, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = null;
        fuzzTest40.FuzzTest_add(intList46, intList48, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest27.FuzzTest_add(intList34, intList48, (int) (short) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = null;
        fuzzTest27.FuzzTest_add(intList55, intList56, (int) '4', (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList60 = null;
        fuzzTest0.FuzzTest_add(intList56, intList60, (int) (byte) 1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0, 10, 10, (-1) };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList69 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = null;
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList77 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest71.FuzzTest_add(intList72, intList77, (int) (short) 10, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList69, intList77, (int) (short) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList1, intList2, 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList17 = null;
        fuzzTest9.FuzzTest_add(intList15, intList17, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest21.FuzzTest_add(intList27, intList29, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest8.FuzzTest_add(intList15, intList29, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList42 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = null;
        fuzzTest36.FuzzTest_add(intList42, intList44, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest7.FuzzTest_add(intList29, intList42, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList53 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList61 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList63 = null;
        fuzzTest55.FuzzTest_add(intList61, intList63, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest7.FuzzTest_add(intList53, intList63, (int) (byte) -1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList71 = null;
        fuzzTest7.FuzzTest_add(intList70, intList71, (int) (byte) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList6, intList70, 10, (java.lang.Integer) 1);
    }
}

