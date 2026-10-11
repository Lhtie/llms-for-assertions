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
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList3 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList7 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList3, intList7, (java.util.Collection<java.lang.Integer>) intList13);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, (-1) };
        c2s_aug.ArrayList<java.lang.Integer> intList5 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { (-1) };
        c2s_aug.ArrayList<java.lang.Integer> intList9 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList5, intList9, (java.util.Collection<java.lang.Integer>) intList14);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.ArrayList<java.lang.Integer> intList4 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.ArrayList<java.lang.Integer> intList10 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10, 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList4, intList10, (java.util.Collection<java.lang.Integer>) intList15);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList4 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10, 1, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList10 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 0, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList4, intList10, (java.util.Collection<java.lang.Integer>) intList17);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 0, 0 };
        c2s_aug.ArrayList<java.lang.Integer> intList5 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList11 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList5, intList11, (java.util.Collection<java.lang.Integer>) intList15);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList5 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList16 = null;
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList20 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest15.FuzzTest_ArrayList(intList16, intList20, (java.util.Collection<java.lang.Integer>) intList27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10, 10, 0 };
        c2s_aug.ArrayList<java.lang.Integer> intList34 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList37 = null;
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList41 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest36.FuzzTest_ArrayList(intList37, intList41, (java.util.Collection<java.lang.Integer>) intList48);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList20, intList34, (java.util.Collection<java.lang.Integer>) intList48);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList4 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 100, 0 };
        c2s_aug.ArrayList<java.lang.Integer> intList10 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList17 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest12.FuzzTest_ArrayList(intList13, intList17, (java.util.Collection<java.lang.Integer>) intList24);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList4, intList10, (java.util.Collection<java.lang.Integer>) intList24);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList5 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList17 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1), 0, 1, (-1) };
        c2s_aug.ArrayList<java.lang.Integer> intList25 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList30 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList34 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest29.FuzzTest_ArrayList(intList30, intList34, (java.util.Collection<java.lang.Integer>) intList41);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList49 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest27.FuzzTest_ArrayList(intList28, intList30, (java.util.Collection<java.lang.Integer>) intList49);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList17, intList25, (java.util.Collection<java.lang.Integer>) intList49);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList3 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList7 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest2.FuzzTest_ArrayList(intList3, intList7, (java.util.Collection<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList3, (java.util.Collection<java.lang.Integer>) intList22);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList28 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 0 };
        c2s_aug.ArrayList<java.lang.Integer> intList32 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList35 = null;
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList37 = null;
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList41 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest36.FuzzTest_ArrayList(intList37, intList41, (java.util.Collection<java.lang.Integer>) intList48);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList56 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest34.FuzzTest_ArrayList(intList35, intList37, (java.util.Collection<java.lang.Integer>) intList56);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList28, intList32, (java.util.Collection<java.lang.Integer>) intList35);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList3 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList7 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest2.FuzzTest_ArrayList(intList3, intList7, (java.util.Collection<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList3, (java.util.Collection<java.lang.Integer>) intList22);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList28 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList31 = null;
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList35 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest30.FuzzTest_ArrayList(intList31, intList35, (java.util.Collection<java.lang.Integer>) intList42);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, 0, 1, (-1), 100 };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList28, intList35, (java.util.Collection<java.lang.Integer>) intList51);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList6 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest1.FuzzTest_ArrayList(intList2, intList6, (java.util.Collection<java.lang.Integer>) intList13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList17 = null;
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList21 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest16.FuzzTest_ArrayList(intList17, intList21, (java.util.Collection<java.lang.Integer>) intList28);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList32 = null;
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList36 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest31.FuzzTest_ArrayList(intList32, intList36, (java.util.Collection<java.lang.Integer>) intList43);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList49 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest1.FuzzTest_ArrayList(intList21, intList32, (java.util.Collection<java.lang.Integer>) intList49);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 0, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList55 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList59 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList21, intList55, (java.util.Collection<java.lang.Integer>) intList59);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList5 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList16 = null;
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList20 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest15.FuzzTest_ArrayList(intList16, intList20, (java.util.Collection<java.lang.Integer>) intList27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList31 = null;
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList35 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest30.FuzzTest_ArrayList(intList31, intList35, (java.util.Collection<java.lang.Integer>) intList42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList46 = null;
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList50 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest45.FuzzTest_ArrayList(intList46, intList50, (java.util.Collection<java.lang.Integer>) intList57);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList61 = null;
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList65 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList72 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest60.FuzzTest_ArrayList(intList61, intList65, (java.util.Collection<java.lang.Integer>) intList72);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList76 = null;
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList80 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList87 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest75.FuzzTest_ArrayList(intList76, intList80, (java.util.Collection<java.lang.Integer>) intList87);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList93 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        fuzzTest45.FuzzTest_ArrayList(intList65, intList76, (java.util.Collection<java.lang.Integer>) intList93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList20, intList35, (java.util.Collection<java.lang.Integer>) intList76);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1) };
        c2s_aug.ArrayList<java.lang.Integer> intList3 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 1, (-1), 100, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList11 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList14 = null;
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList18 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest13.FuzzTest_ArrayList(intList14, intList18, (java.util.Collection<java.lang.Integer>) intList25);
        c2s_aug.ArrayList<java.lang.Integer> intList28 = null;
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10, (-1), 100, 10, 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList35 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList38 = null;
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList42 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList49 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest37.FuzzTest_ArrayList(intList38, intList42, (java.util.Collection<java.lang.Integer>) intList49);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList53 = null;
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList57 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest52.FuzzTest_ArrayList(intList53, intList57, (java.util.Collection<java.lang.Integer>) intList64);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList68 = null;
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList72 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList79 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest67.FuzzTest_ArrayList(intList68, intList72, (java.util.Collection<java.lang.Integer>) intList79);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList85 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest37.FuzzTest_ArrayList(intList57, intList68, (java.util.Collection<java.lang.Integer>) intList85);
        fuzzTest13.FuzzTest_ArrayList(intList28, intList35, (java.util.Collection<java.lang.Integer>) intList85);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList3, intList11, (java.util.Collection<java.lang.Integer>) intList35);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList5 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0 };
        c2s_aug.ArrayList<java.lang.Integer> intList17 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList20 = null;
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList24 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest19.FuzzTest_ArrayList(intList20, intList24, (java.util.Collection<java.lang.Integer>) intList31);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList37 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        c2s_aug.ArrayList<java.lang.Integer> intList39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList41 = null;
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList45 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest40.FuzzTest_ArrayList(intList41, intList45, (java.util.Collection<java.lang.Integer>) intList52);
        fuzzTest19.FuzzTest_ArrayList(intList37, intList39, (java.util.Collection<java.lang.Integer>) intList45);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList59 = null;
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList63 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList70 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest58.FuzzTest_ArrayList(intList59, intList63, (java.util.Collection<java.lang.Integer>) intList70);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList78 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest56.FuzzTest_ArrayList(intList57, intList59, (java.util.Collection<java.lang.Integer>) intList78);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList17, intList37, (java.util.Collection<java.lang.Integer>) intList78);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList6 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest1.FuzzTest_ArrayList(intList2, intList6, (java.util.Collection<java.lang.Integer>) intList13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList17 = null;
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList21 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest16.FuzzTest_ArrayList(intList17, intList21, (java.util.Collection<java.lang.Integer>) intList28);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList34 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        c2s_aug.ArrayList<java.lang.Integer> intList36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList38 = null;
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList42 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList49 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest37.FuzzTest_ArrayList(intList38, intList42, (java.util.Collection<java.lang.Integer>) intList49);
        fuzzTest16.FuzzTest_ArrayList(intList34, intList36, (java.util.Collection<java.lang.Integer>) intList42);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList54 = null;
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList58 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList65 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest53.FuzzTest_ArrayList(intList54, intList58, (java.util.Collection<java.lang.Integer>) intList65);
        fuzzTest0.FuzzTest_ArrayList(intList2, intList36, (java.util.Collection<java.lang.Integer>) intList58);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 10, (-1), (-1), 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList75 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0, 10, 0 };
        c2s_aug.ArrayList<java.lang.Integer> intList81 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList88 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList75, intList81, (java.util.Collection<java.lang.Integer>) intList88);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList6 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest1.FuzzTest_ArrayList(intList2, intList6, (java.util.Collection<java.lang.Integer>) intList13);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { (-1), 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList19 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList22 = null;
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList26 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest21.FuzzTest_ArrayList(intList22, intList26, (java.util.Collection<java.lang.Integer>) intList33);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList6, intList19, (java.util.Collection<java.lang.Integer>) intList26);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList3 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList7 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest2.FuzzTest_ArrayList(intList3, intList7, (java.util.Collection<java.lang.Integer>) intList14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList18 = null;
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList22 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest17.FuzzTest_ArrayList(intList18, intList22, (java.util.Collection<java.lang.Integer>) intList29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList33 = null;
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList37 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest32.FuzzTest_ArrayList(intList33, intList37, (java.util.Collection<java.lang.Integer>) intList44);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest2.FuzzTest_ArrayList(intList22, intList33, (java.util.Collection<java.lang.Integer>) intList50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList54 = null;
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList58 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList65 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest53.FuzzTest_ArrayList(intList54, intList58, (java.util.Collection<java.lang.Integer>) intList65);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList22, (java.util.Collection<java.lang.Integer>) intList54);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10, 1, (-1) };
        c2s_aug.ArrayList<java.lang.Integer> intList73 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10, 0 };
        c2s_aug.ArrayList<java.lang.Integer> intList78 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0, (-1) };
        java.util.ArrayList<java.lang.Integer> intList83 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList73, intList78, (java.util.Collection<java.lang.Integer>) intList83);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, (-1), 1, 0, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList7 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList10 = null;
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList14 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList21 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest9.FuzzTest_ArrayList(intList10, intList14, (java.util.Collection<java.lang.Integer>) intList21);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList25 = null;
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList29 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList36 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest24.FuzzTest_ArrayList(intList25, intList29, (java.util.Collection<java.lang.Integer>) intList36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList40 = null;
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList44 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest39.FuzzTest_ArrayList(intList40, intList44, (java.util.Collection<java.lang.Integer>) intList51);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest9.FuzzTest_ArrayList(intList29, intList40, (java.util.Collection<java.lang.Integer>) intList57);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList61 = null;
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList65 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList72 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest60.FuzzTest_ArrayList(intList61, intList65, (java.util.Collection<java.lang.Integer>) intList72);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList7, intList29, (java.util.Collection<java.lang.Integer>) intList72);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList6 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest1.FuzzTest_ArrayList(intList2, intList6, (java.util.Collection<java.lang.Integer>) intList13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList17 = null;
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList21 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest16.FuzzTest_ArrayList(intList17, intList21, (java.util.Collection<java.lang.Integer>) intList28);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList32 = null;
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList36 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest31.FuzzTest_ArrayList(intList32, intList36, (java.util.Collection<java.lang.Integer>) intList43);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList49 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest1.FuzzTest_ArrayList(intList21, intList32, (java.util.Collection<java.lang.Integer>) intList49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 10, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList56 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.util.Collection<java.lang.Integer> intCollection58 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList21, intList56, intCollection58);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList6 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest1.FuzzTest_ArrayList(intList2, intList6, (java.util.Collection<java.lang.Integer>) intList13);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList19 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        c2s_aug.ArrayList<java.lang.Integer> intList21 = null;
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList23 = null;
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList27 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest22.FuzzTest_ArrayList(intList23, intList27, (java.util.Collection<java.lang.Integer>) intList34);
        fuzzTest1.FuzzTest_ArrayList(intList19, intList21, (java.util.Collection<java.lang.Integer>) intList27);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList40 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList43 = null;
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList47 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList54 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest42.FuzzTest_ArrayList(intList43, intList47, (java.util.Collection<java.lang.Integer>) intList54);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList19, intList40, (java.util.Collection<java.lang.Integer>) intList54);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList5 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList18 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        c2s_aug.ArrayList<java.lang.Integer> intList20 = null;
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList22 = null;
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList26 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest21.FuzzTest_ArrayList(intList22, intList26, (java.util.Collection<java.lang.Integer>) intList33);
        fuzzTest0.FuzzTest_ArrayList(intList18, intList20, (java.util.Collection<java.lang.Integer>) intList26);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList38 = null;
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList42 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList49 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest37.FuzzTest_ArrayList(intList38, intList42, (java.util.Collection<java.lang.Integer>) intList49);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList55 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        c2s_aug.ArrayList<java.lang.Integer> intList57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList59 = null;
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList63 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList70 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest58.FuzzTest_ArrayList(intList59, intList63, (java.util.Collection<java.lang.Integer>) intList70);
        fuzzTest37.FuzzTest_ArrayList(intList55, intList57, (java.util.Collection<java.lang.Integer>) intList63);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, (-1), 0, 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList79 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList82 = null;
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList86 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList93 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        fuzzTest81.FuzzTest_ArrayList(intList82, intList86, (java.util.Collection<java.lang.Integer>) intList93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList55, intList79, (java.util.Collection<java.lang.Integer>) intList93);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList3 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList7 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest2.FuzzTest_ArrayList(intList3, intList7, (java.util.Collection<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList3, (java.util.Collection<java.lang.Integer>) intList22);
        c2s_aug.ArrayList<java.lang.Integer> intList25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList27 = null;
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList31 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest26.FuzzTest_ArrayList(intList27, intList31, (java.util.Collection<java.lang.Integer>) intList38);
        java.util.Collection<java.lang.Integer> intCollection41 = null;
        fuzzTest0.FuzzTest_ArrayList(intList25, intList27, intCollection41);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, 0, (-1), 10, 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList49 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList53 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList56 = null;
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList60 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList67 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest55.FuzzTest_ArrayList(intList56, intList60, (java.util.Collection<java.lang.Integer>) intList67);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList49, intList53, (java.util.Collection<java.lang.Integer>) intList56);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList3 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList7 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest2.FuzzTest_ArrayList(intList3, intList7, (java.util.Collection<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList3, (java.util.Collection<java.lang.Integer>) intList22);
        c2s_aug.ArrayList<java.lang.Integer> intList25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList27 = null;
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList31 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest26.FuzzTest_ArrayList(intList27, intList31, (java.util.Collection<java.lang.Integer>) intList38);
        java.util.Collection<java.lang.Integer> intCollection41 = null;
        fuzzTest0.FuzzTest_ArrayList(intList25, intList27, intCollection41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList46 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList49 = null;
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList53 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList60 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest48.FuzzTest_ArrayList(intList49, intList53, (java.util.Collection<java.lang.Integer>) intList60);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList64 = null;
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList68 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList75 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest63.FuzzTest_ArrayList(intList64, intList68, (java.util.Collection<java.lang.Integer>) intList75);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList46, intList53, (java.util.Collection<java.lang.Integer>) intList64);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList3 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList7 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest2.FuzzTest_ArrayList(intList3, intList7, (java.util.Collection<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList3, (java.util.Collection<java.lang.Integer>) intList22);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList26 = null;
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList30 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest25.FuzzTest_ArrayList(intList26, intList30, (java.util.Collection<java.lang.Integer>) intList37);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList43 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        c2s_aug.ArrayList<java.lang.Integer> intList45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList47 = null;
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList51 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList58 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest46.FuzzTest_ArrayList(intList47, intList51, (java.util.Collection<java.lang.Integer>) intList58);
        fuzzTest25.FuzzTest_ArrayList(intList43, intList45, (java.util.Collection<java.lang.Integer>) intList51);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { (-1), 10, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList66 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList69 = null;
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList73 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList80 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest68.FuzzTest_ArrayList(intList69, intList73, (java.util.Collection<java.lang.Integer>) intList80);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList51, intList66, (java.util.Collection<java.lang.Integer>) intList80);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList5 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList16 = null;
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList20 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest15.FuzzTest_ArrayList(intList16, intList20, (java.util.Collection<java.lang.Integer>) intList27);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList33 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        c2s_aug.ArrayList<java.lang.Integer> intList35 = null;
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList37 = null;
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList41 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest36.FuzzTest_ArrayList(intList37, intList41, (java.util.Collection<java.lang.Integer>) intList48);
        fuzzTest15.FuzzTest_ArrayList(intList33, intList35, (java.util.Collection<java.lang.Integer>) intList41);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList53 = null;
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList57 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest52.FuzzTest_ArrayList(intList53, intList57, (java.util.Collection<java.lang.Integer>) intList64);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList70 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        c2s_aug.ArrayList<java.lang.Integer> intList72 = null;
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList74 = null;
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList78 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList85 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest73.FuzzTest_ArrayList(intList74, intList78, (java.util.Collection<java.lang.Integer>) intList85);
        fuzzTest52.FuzzTest_ArrayList(intList70, intList72, (java.util.Collection<java.lang.Integer>) intList78);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 0, 10 };
        java.util.ArrayList<java.lang.Integer> intList92 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList41, intList78, (java.util.Collection<java.lang.Integer>) intList92);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList3 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList7 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest2.FuzzTest_ArrayList(intList3, intList7, (java.util.Collection<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList3, (java.util.Collection<java.lang.Integer>) intList22);
        c2s_aug.ArrayList<java.lang.Integer> intList25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList27 = null;
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList31 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest26.FuzzTest_ArrayList(intList27, intList31, (java.util.Collection<java.lang.Integer>) intList38);
        java.util.Collection<java.lang.Integer> intCollection41 = null;
        fuzzTest0.FuzzTest_ArrayList(intList25, intList27, intCollection41);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList47 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0 };
        c2s_aug.ArrayList<java.lang.Integer> intList51 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList56 = null;
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList60 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList67 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest55.FuzzTest_ArrayList(intList56, intList60, (java.util.Collection<java.lang.Integer>) intList67);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList75 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest53.FuzzTest_ArrayList(intList54, intList56, (java.util.Collection<java.lang.Integer>) intList75);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList47, intList51, (java.util.Collection<java.lang.Integer>) intList56);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList5 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList16 = null;
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList20 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest15.FuzzTest_ArrayList(intList16, intList20, (java.util.Collection<java.lang.Integer>) intList27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList31 = null;
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList35 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest30.FuzzTest_ArrayList(intList31, intList35, (java.util.Collection<java.lang.Integer>) intList42);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest0.FuzzTest_ArrayList(intList20, intList31, (java.util.Collection<java.lang.Integer>) intList48);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList52 = null;
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList56 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList63 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest51.FuzzTest_ArrayList(intList52, intList56, (java.util.Collection<java.lang.Integer>) intList63);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList69 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        c2s_aug.ArrayList<java.lang.Integer> intList71 = null;
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList73 = null;
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList77 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList84 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest72.FuzzTest_ArrayList(intList73, intList77, (java.util.Collection<java.lang.Integer>) intList84);
        fuzzTest51.FuzzTest_ArrayList(intList69, intList71, (java.util.Collection<java.lang.Integer>) intList77);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { (-1), 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList91 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        java.util.Collection<java.lang.Integer> intCollection93 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList69, intList91, intCollection93);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList6 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest1.FuzzTest_ArrayList(intList2, intList6, (java.util.Collection<java.lang.Integer>) intList13);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList19 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        c2s_aug.ArrayList<java.lang.Integer> intList21 = null;
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList23 = null;
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList27 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest22.FuzzTest_ArrayList(intList23, intList27, (java.util.Collection<java.lang.Integer>) intList34);
        fuzzTest1.FuzzTest_ArrayList(intList19, intList21, (java.util.Collection<java.lang.Integer>) intList27);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, 0, 0 };
        c2s_aug.ArrayList<java.lang.Integer> intList42 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList45 = null;
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList49 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList56 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest44.FuzzTest_ArrayList(intList45, intList49, (java.util.Collection<java.lang.Integer>) intList56);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList60 = null;
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList64 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList71 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest59.FuzzTest_ArrayList(intList60, intList64, (java.util.Collection<java.lang.Integer>) intList71);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList75 = null;
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList79 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList86 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest74.FuzzTest_ArrayList(intList75, intList79, (java.util.Collection<java.lang.Integer>) intList86);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList92 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        fuzzTest44.FuzzTest_ArrayList(intList64, intList75, (java.util.Collection<java.lang.Integer>) intList92);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList27, intList42, (java.util.Collection<java.lang.Integer>) intList64);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList6 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest1.FuzzTest_ArrayList(intList2, intList6, (java.util.Collection<java.lang.Integer>) intList13);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList19 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        c2s_aug.ArrayList<java.lang.Integer> intList21 = null;
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList23 = null;
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList27 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest22.FuzzTest_ArrayList(intList23, intList27, (java.util.Collection<java.lang.Integer>) intList34);
        fuzzTest1.FuzzTest_ArrayList(intList19, intList21, (java.util.Collection<java.lang.Integer>) intList27);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList39 = null;
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList43 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest38.FuzzTest_ArrayList(intList39, intList43, (java.util.Collection<java.lang.Integer>) intList50);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList56 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        c2s_aug.ArrayList<java.lang.Integer> intList58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList60 = null;
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList64 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList71 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest59.FuzzTest_ArrayList(intList60, intList64, (java.util.Collection<java.lang.Integer>) intList71);
        fuzzTest38.FuzzTest_ArrayList(intList56, intList58, (java.util.Collection<java.lang.Integer>) intList64);
        java.util.Collection<java.lang.Integer> intCollection75 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList27, intList64, intCollection75);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        c2s_aug.ArrayList<java.lang.Integer> intList2 = null;
        java.util.Collection<java.lang.Integer> intCollection3 = null;
        fuzzTest0.FuzzTest_ArrayList(intList1, intList2, intCollection3);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList6 = null;
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList10 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest5.FuzzTest_ArrayList(intList6, intList10, (java.util.Collection<java.lang.Integer>) intList17);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList23 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        c2s_aug.ArrayList<java.lang.Integer> intList25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList27 = null;
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList31 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest26.FuzzTest_ArrayList(intList27, intList31, (java.util.Collection<java.lang.Integer>) intList38);
        fuzzTest5.FuzzTest_ArrayList(intList23, intList25, (java.util.Collection<java.lang.Integer>) intList31);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList43 = null;
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList47 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList54 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest42.FuzzTest_ArrayList(intList43, intList47, (java.util.Collection<java.lang.Integer>) intList54);
        java.util.Collection<java.lang.Integer> intCollection57 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList23, intList47, intCollection57);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        c2s_aug.ArrayList<java.lang.Integer> intList2 = null;
        java.util.Collection<java.lang.Integer> intCollection3 = null;
        fuzzTest0.FuzzTest_ArrayList(intList1, intList2, intCollection3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 1, 0, (-1) };
        c2s_aug.ArrayList<java.lang.Integer> intList10 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList17 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest12.FuzzTest_ArrayList(intList13, intList17, (java.util.Collection<java.lang.Integer>) intList24);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList30 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList33 = null;
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList37 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest32.FuzzTest_ArrayList(intList33, intList37, (java.util.Collection<java.lang.Integer>) intList44);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList50 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        c2s_aug.ArrayList<java.lang.Integer> intList52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList54 = null;
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList58 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList65 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest53.FuzzTest_ArrayList(intList54, intList58, (java.util.Collection<java.lang.Integer>) intList65);
        fuzzTest32.FuzzTest_ArrayList(intList50, intList52, (java.util.Collection<java.lang.Integer>) intList58);
        java.util.Collection<java.lang.Integer> intCollection69 = null;
        fuzzTest12.FuzzTest_ArrayList(intList30, intList52, intCollection69);
        java.util.Collection<java.lang.Integer> intCollection71 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList10, intList30, intCollection71);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList4 = null;
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList8 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest3.FuzzTest_ArrayList(intList4, intList8, (java.util.Collection<java.lang.Integer>) intList15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList19 = null;
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList23 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList30 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest18.FuzzTest_ArrayList(intList19, intList23, (java.util.Collection<java.lang.Integer>) intList30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList34 = null;
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList38 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList45 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest33.FuzzTest_ArrayList(intList34, intList38, (java.util.Collection<java.lang.Integer>) intList45);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest3.FuzzTest_ArrayList(intList23, intList34, (java.util.Collection<java.lang.Integer>) intList51);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList55 = null;
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList59 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList66 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest54.FuzzTest_ArrayList(intList55, intList59, (java.util.Collection<java.lang.Integer>) intList66);
        fuzzTest1.FuzzTest_ArrayList(intList2, intList23, (java.util.Collection<java.lang.Integer>) intList55);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0, 100, 0, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList75 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        c2s_aug.ArrayList<java.lang.Integer> intList77 = null;
        java.util.Collection<java.lang.Integer> intCollection78 = null;
        fuzzTest1.FuzzTest_ArrayList(intList75, intList77, intCollection78);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList81 = null;
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList85 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList92 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        fuzzTest80.FuzzTest_ArrayList(intList81, intList85, (java.util.Collection<java.lang.Integer>) intList92);
        java.util.Collection<java.lang.Integer> intCollection95 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList75, intList85, intCollection95);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        c2s_aug.ArrayList<java.lang.Integer> intList2 = null;
        java.util.Collection<java.lang.Integer> intCollection3 = null;
        fuzzTest0.FuzzTest_ArrayList(intList1, intList2, intCollection3);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList7 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 100, 0, 1, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList15 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList18 = null;
        c2s_aug.ArrayList<java.lang.Integer> intList19 = null;
        java.util.Collection<java.lang.Integer> intCollection20 = null;
        fuzzTest17.FuzzTest_ArrayList(intList18, intList19, intCollection20);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList23 = null;
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList27 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest22.FuzzTest_ArrayList(intList23, intList27, (java.util.Collection<java.lang.Integer>) intList34);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList40 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        c2s_aug.ArrayList<java.lang.Integer> intList42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList44 = null;
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList48 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest43.FuzzTest_ArrayList(intList44, intList48, (java.util.Collection<java.lang.Integer>) intList55);
        fuzzTest22.FuzzTest_ArrayList(intList40, intList42, (java.util.Collection<java.lang.Integer>) intList48);
        c2s_aug.ArrayList<java.lang.Integer> intList59 = null;
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList61 = null;
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList65 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList72 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest60.FuzzTest_ArrayList(intList61, intList65, (java.util.Collection<java.lang.Integer>) intList72);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList78 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        c2s_aug.ArrayList<java.lang.Integer> intList80 = null;
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList82 = null;
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList86 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList93 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        fuzzTest81.FuzzTest_ArrayList(intList82, intList86, (java.util.Collection<java.lang.Integer>) intList93);
        fuzzTest60.FuzzTest_ArrayList(intList78, intList80, (java.util.Collection<java.lang.Integer>) intList86);
        fuzzTest17.FuzzTest_ArrayList(intList42, intList59, (java.util.Collection<java.lang.Integer>) intList78);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList7, intList15, (java.util.Collection<java.lang.Integer>) intList59);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList5 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList18 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        c2s_aug.ArrayList<java.lang.Integer> intList20 = null;
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList22 = null;
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList26 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest21.FuzzTest_ArrayList(intList22, intList26, (java.util.Collection<java.lang.Integer>) intList33);
        fuzzTest0.FuzzTest_ArrayList(intList18, intList20, (java.util.Collection<java.lang.Integer>) intList26);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList38 = null;
        c2s_aug.ArrayList<java.lang.Integer> intList39 = null;
        java.util.Collection<java.lang.Integer> intCollection40 = null;
        fuzzTest37.FuzzTest_ArrayList(intList38, intList39, intCollection40);
        c2s_aug.ArrayList<java.lang.Integer> intList42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList44 = null;
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList48 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest43.FuzzTest_ArrayList(intList44, intList48, (java.util.Collection<java.lang.Integer>) intList55);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList61 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        c2s_aug.ArrayList<java.lang.Integer> intList63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList65 = null;
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList69 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList76 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest64.FuzzTest_ArrayList(intList65, intList69, (java.util.Collection<java.lang.Integer>) intList76);
        fuzzTest43.FuzzTest_ArrayList(intList61, intList63, (java.util.Collection<java.lang.Integer>) intList69);
        java.util.Collection<java.lang.Integer> intCollection80 = null;
        fuzzTest37.FuzzTest_ArrayList(intList42, intList69, intCollection80);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100, 100, 100, 10, (-1) };
        c2s_aug.ArrayList<java.lang.Integer> intList88 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        java.util.Collection<java.lang.Integer> intCollection90 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList69, intList88, intCollection90);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList5 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList18 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList21 = null;
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList25 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest20.FuzzTest_ArrayList(intList21, intList25, (java.util.Collection<java.lang.Integer>) intList32);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList38 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        c2s_aug.ArrayList<java.lang.Integer> intList40 = null;
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList42 = null;
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList46 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList53 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest41.FuzzTest_ArrayList(intList42, intList46, (java.util.Collection<java.lang.Integer>) intList53);
        fuzzTest20.FuzzTest_ArrayList(intList38, intList40, (java.util.Collection<java.lang.Integer>) intList46);
        java.util.Collection<java.lang.Integer> intCollection57 = null;
        fuzzTest0.FuzzTest_ArrayList(intList18, intList40, intCollection57);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList60 = null;
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList64 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList71 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest59.FuzzTest_ArrayList(intList60, intList64, (java.util.Collection<java.lang.Integer>) intList71);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10, 0, 1, 100, 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList80 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList83 = null;
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList87 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList94 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList94, intArray93);
        fuzzTest82.FuzzTest_ArrayList(intList83, intList87, (java.util.Collection<java.lang.Integer>) intList94);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList64, intList80, (java.util.Collection<java.lang.Integer>) intList83);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList5 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList18 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        c2s_aug.ArrayList<java.lang.Integer> intList20 = null;
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList22 = null;
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList26 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest21.FuzzTest_ArrayList(intList22, intList26, (java.util.Collection<java.lang.Integer>) intList33);
        fuzzTest0.FuzzTest_ArrayList(intList18, intList20, (java.util.Collection<java.lang.Integer>) intList26);
        c2s_aug.ArrayList<java.lang.Integer> intList37 = null;
        c2s_aug.ArrayList<java.lang.Integer> intList38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList40 = null;
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList44 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest39.FuzzTest_ArrayList(intList40, intList44, (java.util.Collection<java.lang.Integer>) intList51);
        fuzzTest0.FuzzTest_ArrayList(intList37, intList38, (java.util.Collection<java.lang.Integer>) intList51);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList56 = null;
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList60 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList67 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest55.FuzzTest_ArrayList(intList56, intList60, (java.util.Collection<java.lang.Integer>) intList67);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-1), 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList73 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.util.Collection<java.lang.Integer> intCollection75 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList60, intList73, intCollection75);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList5 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList16 = null;
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList20 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest15.FuzzTest_ArrayList(intList16, intList20, (java.util.Collection<java.lang.Integer>) intList27);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList33 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        c2s_aug.ArrayList<java.lang.Integer> intList35 = null;
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList37 = null;
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList41 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest36.FuzzTest_ArrayList(intList37, intList41, (java.util.Collection<java.lang.Integer>) intList48);
        fuzzTest15.FuzzTest_ArrayList(intList33, intList35, (java.util.Collection<java.lang.Integer>) intList41);
        c2s_aug.ArrayList<java.lang.Integer> intList52 = null;
        java.util.Collection<java.lang.Integer> intCollection53 = null;
        fuzzTest0.FuzzTest_ArrayList(intList33, intList52, intCollection53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 0 };
        c2s_aug.ArrayList<java.lang.Integer> intList58 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList61 = null;
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList65 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList72 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest60.FuzzTest_ArrayList(intList61, intList65, (java.util.Collection<java.lang.Integer>) intList72);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList78 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        c2s_aug.ArrayList<java.lang.Integer> intList80 = null;
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList82 = null;
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList86 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList93 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        fuzzTest81.FuzzTest_ArrayList(intList82, intList86, (java.util.Collection<java.lang.Integer>) intList93);
        fuzzTest60.FuzzTest_ArrayList(intList78, intList80, (java.util.Collection<java.lang.Integer>) intList86);
        java.util.Collection<java.lang.Integer> intCollection97 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList58, intList78, intCollection97);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList1 = null;
        c2s_aug.ArrayList<java.lang.Integer> intList2 = null;
        java.util.Collection<java.lang.Integer> intCollection3 = null;
        fuzzTest0.FuzzTest_ArrayList(intList1, intList2, intCollection3);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList6 = null;
        c2s_aug.ArrayList<java.lang.Integer> intList7 = null;
        java.util.Collection<java.lang.Integer> intCollection8 = null;
        fuzzTest5.FuzzTest_ArrayList(intList6, intList7, intCollection8);
        c2s_aug.ArrayList<java.lang.Integer> intList10 = null;
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList12 = null;
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList16 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest11.FuzzTest_ArrayList(intList12, intList16, (java.util.Collection<java.lang.Integer>) intList23);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList29 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        c2s_aug.ArrayList<java.lang.Integer> intList31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList33 = null;
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList37 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest32.FuzzTest_ArrayList(intList33, intList37, (java.util.Collection<java.lang.Integer>) intList44);
        fuzzTest11.FuzzTest_ArrayList(intList29, intList31, (java.util.Collection<java.lang.Integer>) intList37);
        java.util.Collection<java.lang.Integer> intCollection48 = null;
        fuzzTest5.FuzzTest_ArrayList(intList10, intList37, intCollection48);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList51 = null;
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList55 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList62 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest50.FuzzTest_ArrayList(intList51, intList55, (java.util.Collection<java.lang.Integer>) intList62);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList68 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        c2s_aug.ArrayList<java.lang.Integer> intList70 = null;
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList72 = null;
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList76 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList83 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest71.FuzzTest_ArrayList(intList72, intList76, (java.util.Collection<java.lang.Integer>) intList83);
        fuzzTest50.FuzzTest_ArrayList(intList68, intList70, (java.util.Collection<java.lang.Integer>) intList76);
        java.util.Collection<java.lang.Integer> intCollection87 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList37, intList68, intCollection87);
    }
}

