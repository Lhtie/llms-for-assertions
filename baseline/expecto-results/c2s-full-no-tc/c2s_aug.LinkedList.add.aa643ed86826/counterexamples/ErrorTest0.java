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
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList9 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_add(intList5, intList9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList1, intList5, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList24 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList32 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_add(intList32, intList36, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList44 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList48 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_add(intList44, intList48, (-1), (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_add(intList36, intList48, (int) (short) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList59 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList63 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_add(intList59, intList63, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList36, intList59, 0, (java.lang.Integer) 100);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList31 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_add(intList27, intList31, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest12.FuzzTest_add(intList31, intList39, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList47 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_add(intList47, intList51, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList59 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList63 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_add(intList59, intList63, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList71 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest44.FuzzTest_add(intList63, intList71, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList31, intList71, (int) (byte) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList6 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList10 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzzTest3.FuzzTest_add(intList6, intList10, (-1), (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_add(intList2, intList6, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_add(intList21, intList25, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList35 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_add(intList35, intList39, (-1), (java.lang.Integer) 1);
        fuzzTest30.FuzzTest_add(intList31, intList35, 10, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_add(intList21, intList31, (int) (short) 100, (java.lang.Integer) 10);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, (-1), 100, 10, 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList21, intList56, 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList9 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_add(intList5, intList9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList1, intList5, 10, (java.lang.Integer) (-1));
        c2s_aug.LinkedList<java.lang.Integer> intList17 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList18 = null;
        fuzzTest0.FuzzTest_add(intList17, intList18, (int) (byte) 100, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList29 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest22.FuzzTest_add(intList25, intList29, (-1), (java.lang.Integer) 1);
        c2s_aug.LinkedList<java.lang.Integer> intList34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_add(intList38, intList42, (-1), (java.lang.Integer) 1);
        fuzzTest22.FuzzTest_add(intList34, intList42, (int) 'a', (java.lang.Integer) 0);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 0, 0, (-1), 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList55 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList59 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest22.FuzzTest_add(intList55, intList59, (int) 'a', (java.lang.Integer) (-1));
        c2s_aug.LinkedList<java.lang.Integer> intList64 = null;
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10, 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList68 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest22.FuzzTest_add(intList64, intList68, 100, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList76 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList80 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest73.FuzzTest_add(intList76, intList80, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList68, intList76, 0, (java.lang.Integer) 100);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (-1), (java.lang.Integer) 1);
        c2s_aug.LinkedList<java.lang.Integer> intList12 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList12, intList13, (int) '4', (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList24 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList32 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_add(intList32, intList36, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList44 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList48 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_add(intList44, intList48, (-1), (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_add(intList36, intList48, (int) (short) 0, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList58 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList63 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList67 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest60.FuzzTest_add(intList63, intList67, (-1), (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_add(intList58, intList67, 100, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList78 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList82 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest75.FuzzTest_add(intList78, intList82, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList67, intList78, 0, (java.lang.Integer) 100);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList31 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_add(intList27, intList31, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList43 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest36.FuzzTest_add(intList39, intList43, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest24.FuzzTest_add(intList43, intList51, (int) '4', (java.lang.Integer) 10);
        c2s_aug.LinkedList<java.lang.Integer> intList56 = null;
        fuzzTest12.FuzzTest_add(intList43, intList56, (int) (byte) 0, (java.lang.Integer) 0);
        c2s_aug.LinkedList<java.lang.Integer> intList60 = null;
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList64 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList68 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_add(intList64, intList68, (-1), (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_add(intList60, intList68, 10, (java.lang.Integer) 100);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { (-1), 10, 10, 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList81 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList68, intList81, 1, (java.lang.Integer) 100);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList9 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_add(intList5, intList9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList1, intList5, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList24 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList32 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_add(intList32, intList36, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList44 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest17.FuzzTest_add(intList36, intList44, (int) '4', (java.lang.Integer) 10);
        c2s_aug.LinkedList<java.lang.Integer> intList49 = null;
        fuzzTest0.FuzzTest_add(intList44, intList49, 1, (java.lang.Integer) 10);
        c2s_aug.LinkedList<java.lang.Integer> intList53 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList54 = null;
        fuzzTest0.FuzzTest_add(intList53, intList54, (int) '4', (java.lang.Integer) 1);
        c2s_aug.LinkedList<java.lang.Integer> intList58 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList59 = null;
        fuzzTest0.FuzzTest_add(intList58, intList59, (int) (short) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList66 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList71 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList75 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest68.FuzzTest_add(intList71, intList75, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList66, intList75, (int) (byte) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest5.FuzzTest_add(intList8, intList12, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList24 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList32 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest5.FuzzTest_add(intList24, intList32, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList40 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList44 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest37.FuzzTest_add(intList40, intList44, (-1), (java.lang.Integer) 1);
        c2s_aug.LinkedList<java.lang.Integer> intList49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList53 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList57 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest50.FuzzTest_add(intList53, intList57, (-1), (java.lang.Integer) 1);
        fuzzTest37.FuzzTest_add(intList49, intList57, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList68 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList72 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_add(intList68, intList72, (-1), (java.lang.Integer) 1);
        fuzzTest5.FuzzTest_add(intList57, intList68, (int) (short) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList3, intList68, (int) (byte) 0, (java.lang.Integer) 100);
    }
}

