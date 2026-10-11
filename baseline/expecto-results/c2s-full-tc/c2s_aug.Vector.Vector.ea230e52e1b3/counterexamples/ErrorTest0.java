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
        c2s_aug.Vector<java.lang.Integer> intList3 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_Vector(intList3, intList7, (java.util.Collection<java.lang.Integer>) intList13);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList5 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { (-1) };
        c2s_aug.Vector<java.lang.Integer> intList9 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_Vector(intList5, intList9, (java.util.Collection<java.lang.Integer>) intList14);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.Vector<java.lang.Integer> intList4 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList10 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10, 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_Vector(intList4, intList10, (java.util.Collection<java.lang.Integer>) intList15);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 1 };
        c2s_aug.Vector<java.lang.Integer> intList4 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10, 1, 100 };
        c2s_aug.Vector<java.lang.Integer> intList10 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 0, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_Vector(intList4, intList10, (java.util.Collection<java.lang.Integer>) intList17);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 0, 0 };
        c2s_aug.Vector<java.lang.Integer> intList5 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 0, 1 };
        c2s_aug.Vector<java.lang.Integer> intList11 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_Vector(intList5, intList11, (java.util.Collection<java.lang.Integer>) intList15);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList5 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_Vector(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList16 = null;
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList20 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest15.FuzzTest_Vector(intList16, intList20, (java.util.Collection<java.lang.Integer>) intList27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10, 10, 0 };
        c2s_aug.Vector<java.lang.Integer> intList34 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList37 = null;
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList41 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest36.FuzzTest_Vector(intList37, intList41, (java.util.Collection<java.lang.Integer>) intList48);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_Vector(intList20, intList34, (java.util.Collection<java.lang.Integer>) intList48);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.Vector<java.lang.Integer> intList4 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 100, 0 };
        c2s_aug.Vector<java.lang.Integer> intList10 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList17 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest12.FuzzTest_Vector(intList13, intList17, (java.util.Collection<java.lang.Integer>) intList24);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_Vector(intList4, intList10, (java.util.Collection<java.lang.Integer>) intList24);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList5 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_Vector(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1 };
        c2s_aug.Vector<java.lang.Integer> intList17 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1), 0, 1, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList25 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList30 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList34 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest29.FuzzTest_Vector(intList30, intList34, (java.util.Collection<java.lang.Integer>) intList41);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList49 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest27.FuzzTest_Vector(intList28, intList30, (java.util.Collection<java.lang.Integer>) intList49);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_Vector(intList17, intList25, (java.util.Collection<java.lang.Integer>) intList49);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList5 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_Vector(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, 1, 1 };
        c2s_aug.Vector<java.lang.Integer> intList19 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList24 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        c2s_aug.Vector<java.lang.Integer> intList26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList30 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList34 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest29.FuzzTest_Vector(intList30, intList34, (java.util.Collection<java.lang.Integer>) intList41);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList49 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest27.FuzzTest_Vector(intList28, intList30, (java.util.Collection<java.lang.Integer>) intList49);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 10 };
        c2s_aug.Vector<java.lang.Integer> intList55 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0 };
        c2s_aug.Vector<java.lang.Integer> intList59 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList62 = null;
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList64 = null;
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList68 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList75 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest63.FuzzTest_Vector(intList64, intList68, (java.util.Collection<java.lang.Integer>) intList75);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList83 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest61.FuzzTest_Vector(intList62, intList64, (java.util.Collection<java.lang.Integer>) intList83);
        fuzzTest27.FuzzTest_Vector(intList55, intList59, (java.util.Collection<java.lang.Integer>) intList62);
        fuzzTest21.FuzzTest_Vector(intList24, intList26, (java.util.Collection<java.lang.Integer>) intList59);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList90 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_Vector(intList19, intList59, (java.util.Collection<java.lang.Integer>) intList90);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 1, 10 };
        c2s_aug.Vector<java.lang.Integer> intList6 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-1), (-1) };
        c2s_aug.Vector<java.lang.Integer> intList11 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList16 = null;
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList20 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest15.FuzzTest_Vector(intList16, intList20, (java.util.Collection<java.lang.Integer>) intList27);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest13.FuzzTest_Vector(intList14, intList16, (java.util.Collection<java.lang.Integer>) intList35);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList39 = null;
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList43 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest38.FuzzTest_Vector(intList39, intList43, (java.util.Collection<java.lang.Integer>) intList50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList54 = null;
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList58 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList65 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest53.FuzzTest_Vector(intList54, intList58, (java.util.Collection<java.lang.Integer>) intList65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, 10, 10 };
        java.util.ArrayList<java.lang.Integer> intList72 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest13.FuzzTest_Vector(intList43, intList54, (java.util.Collection<java.lang.Integer>) intList72);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_Vector(intList6, intList11, (java.util.Collection<java.lang.Integer>) intList43);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList3 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest2.FuzzTest_Vector(intList3, intList7, (java.util.Collection<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest0.FuzzTest_Vector(intList1, intList3, (java.util.Collection<java.lang.Integer>) intList22);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList26 = null;
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList30 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest25.FuzzTest_Vector(intList26, intList30, (java.util.Collection<java.lang.Integer>) intList37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList41 = null;
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList45 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest40.FuzzTest_Vector(intList41, intList45, (java.util.Collection<java.lang.Integer>) intList52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 10, 10 };
        java.util.ArrayList<java.lang.Integer> intList59 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest0.FuzzTest_Vector(intList30, intList41, (java.util.Collection<java.lang.Integer>) intList59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList64 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList69 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1, 0, 1, 0 };
        c2s_aug.Vector<java.lang.Integer> intList77 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        c2s_aug.Vector<java.lang.Integer> intList79 = null;
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList81 = null;
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList85 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList92 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        fuzzTest80.FuzzTest_Vector(intList81, intList85, (java.util.Collection<java.lang.Integer>) intList92);
        fuzzTest71.FuzzTest_Vector(intList77, intList79, (java.util.Collection<java.lang.Integer>) intList85);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_Vector(intList64, intList69, (java.util.Collection<java.lang.Integer>) intList77);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList5 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_Vector(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 1 };
        c2s_aug.Vector<java.lang.Integer> intList19 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        c2s_aug.Vector<java.lang.Integer> intList21 = null;
        java.util.Collection<java.lang.Integer> intCollection22 = null;
        fuzzTest0.FuzzTest_Vector(intList19, intList21, intCollection22);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 0, 10, 100, 10, 100 };
        c2s_aug.Vector<java.lang.Integer> intList32 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        c2s_aug.Vector<java.lang.Integer> intList34 = null;
        java.util.Collection<java.lang.Integer> intCollection35 = null;
        fuzzTest25.FuzzTest_Vector(intList32, intList34, intCollection35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10, 10, 10, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList42 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.util.Collection<java.lang.Integer> intCollection44 = null;
        fuzzTest24.FuzzTest_Vector(intList32, intList42, intCollection44);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 1, 0 };
        c2s_aug.Vector<java.lang.Integer> intList52 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        c2s_aug.Vector<java.lang.Integer> intList54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList56 = null;
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList60 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList67 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest55.FuzzTest_Vector(intList56, intList60, (java.util.Collection<java.lang.Integer>) intList67);
        fuzzTest46.FuzzTest_Vector(intList52, intList54, (java.util.Collection<java.lang.Integer>) intList60);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1, 0, 1, 0 };
        c2s_aug.Vector<java.lang.Integer> intList77 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        c2s_aug.Vector<java.lang.Integer> intList79 = null;
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList81 = null;
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList85 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList92 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        fuzzTest80.FuzzTest_Vector(intList81, intList85, (java.util.Collection<java.lang.Integer>) intList92);
        fuzzTest71.FuzzTest_Vector(intList77, intList79, (java.util.Collection<java.lang.Integer>) intList85);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_Vector(intList42, intList60, (java.util.Collection<java.lang.Integer>) intList77);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList3 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest2.FuzzTest_Vector(intList3, intList7, (java.util.Collection<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest0.FuzzTest_Vector(intList1, intList3, (java.util.Collection<java.lang.Integer>) intList22);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 10, 100, 10, 100 };
        c2s_aug.Vector<java.lang.Integer> intList33 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        c2s_aug.Vector<java.lang.Integer> intList35 = null;
        java.util.Collection<java.lang.Integer> intCollection36 = null;
        fuzzTest26.FuzzTest_Vector(intList33, intList35, intCollection36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10, 10, 10, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList43 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.util.Collection<java.lang.Integer> intCollection45 = null;
        fuzzTest25.FuzzTest_Vector(intList33, intList43, intCollection45);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 0, 10, 100, 10, 100 };
        c2s_aug.Vector<java.lang.Integer> intList55 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        c2s_aug.Vector<java.lang.Integer> intList57 = null;
        java.util.Collection<java.lang.Integer> intCollection58 = null;
        fuzzTest48.FuzzTest_Vector(intList55, intList57, intCollection58);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10, 10, 10, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList65 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.util.Collection<java.lang.Integer> intCollection67 = null;
        fuzzTest47.FuzzTest_Vector(intList55, intList65, intCollection67);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1, 0, 1, 0 };
        c2s_aug.Vector<java.lang.Integer> intList75 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        c2s_aug.Vector<java.lang.Integer> intList77 = null;
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList79 = null;
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList83 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList90 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        fuzzTest78.FuzzTest_Vector(intList79, intList83, (java.util.Collection<java.lang.Integer>) intList90);
        fuzzTest69.FuzzTest_Vector(intList75, intList77, (java.util.Collection<java.lang.Integer>) intList83);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_Vector(intList43, intList55, (java.util.Collection<java.lang.Integer>) intList83);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList5 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_Vector(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 0, 10, 100, 10, 100 };
        c2s_aug.Vector<java.lang.Integer> intList22 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        c2s_aug.Vector<java.lang.Integer> intList24 = null;
        java.util.Collection<java.lang.Integer> intCollection25 = null;
        fuzzTest15.FuzzTest_Vector(intList22, intList24, intCollection25);
        c2s_aug.Vector<java.lang.Integer> intList27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 10, 100, 10, 100 };
        c2s_aug.Vector<java.lang.Integer> intList35 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        c2s_aug.Vector<java.lang.Integer> intList37 = null;
        java.util.Collection<java.lang.Integer> intCollection38 = null;
        fuzzTest28.FuzzTest_Vector(intList35, intList37, intCollection38);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 0, 1, 0 };
        c2s_aug.Vector<java.lang.Integer> intList46 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        c2s_aug.Vector<java.lang.Integer> intList48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList50 = null;
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList54 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList61 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest49.FuzzTest_Vector(intList50, intList54, (java.util.Collection<java.lang.Integer>) intList61);
        fuzzTest40.FuzzTest_Vector(intList46, intList48, (java.util.Collection<java.lang.Integer>) intList54);
        fuzzTest15.FuzzTest_Vector(intList27, intList35, (java.util.Collection<java.lang.Integer>) intList46);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1 };
        c2s_aug.Vector<java.lang.Integer> intList68 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1, 0, 1, 0 };
        c2s_aug.Vector<java.lang.Integer> intList76 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        c2s_aug.Vector<java.lang.Integer> intList78 = null;
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList80 = null;
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList84 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList91 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        fuzzTest79.FuzzTest_Vector(intList80, intList84, (java.util.Collection<java.lang.Integer>) intList91);
        fuzzTest70.FuzzTest_Vector(intList76, intList78, (java.util.Collection<java.lang.Integer>) intList84);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_Vector(intList35, intList68, (java.util.Collection<java.lang.Integer>) intList84);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList5 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest0.FuzzTest_Vector(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList12);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, (-1), 10, (-1), 1 };
        c2s_aug.Vector<java.lang.Integer> intList21 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 0, 1, 0 };
        c2s_aug.Vector<java.lang.Integer> intList29 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        c2s_aug.Vector<java.lang.Integer> intList31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList33 = null;
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList37 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest32.FuzzTest_Vector(intList33, intList37, (java.util.Collection<java.lang.Integer>) intList44);
        fuzzTest23.FuzzTest_Vector(intList29, intList31, (java.util.Collection<java.lang.Integer>) intList37);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 0, 10, 100, 10, 100 };
        c2s_aug.Vector<java.lang.Integer> intList55 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        c2s_aug.Vector<java.lang.Integer> intList57 = null;
        java.util.Collection<java.lang.Integer> intCollection58 = null;
        fuzzTest48.FuzzTest_Vector(intList55, intList57, intCollection58);
        c2s_aug.Vector<java.lang.Integer> intList60 = null;
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, 10, 100, 10, 100 };
        c2s_aug.Vector<java.lang.Integer> intList68 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        c2s_aug.Vector<java.lang.Integer> intList70 = null;
        java.util.Collection<java.lang.Integer> intCollection71 = null;
        fuzzTest61.FuzzTest_Vector(intList68, intList70, intCollection71);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 0, 1, 0 };
        c2s_aug.Vector<java.lang.Integer> intList79 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        c2s_aug.Vector<java.lang.Integer> intList81 = null;
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList83 = null;
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.Vector<java.lang.Integer> intList87 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 10, 100, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList94 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList94, intArray93);
        fuzzTest82.FuzzTest_Vector(intList83, intList87, (java.util.Collection<java.lang.Integer>) intList94);
        fuzzTest73.FuzzTest_Vector(intList79, intList81, (java.util.Collection<java.lang.Integer>) intList87);
        fuzzTest48.FuzzTest_Vector(intList60, intList68, (java.util.Collection<java.lang.Integer>) intList79);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_Vector(intList21, intList37, (java.util.Collection<java.lang.Integer>) intList68);
    }
}

