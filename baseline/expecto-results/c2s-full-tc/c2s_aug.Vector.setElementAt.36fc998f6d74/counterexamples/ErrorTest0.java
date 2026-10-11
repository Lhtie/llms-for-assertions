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
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList5 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList9 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_setElementAt(intList5, intList9, (java.lang.Integer) 1, 1);
        fuzzTest0.FuzzTest_setElementAt(intList1, intList5, (java.lang.Integer) 10, (int) ' ');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList20 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList24 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_setElementAt(intList20, intList24, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList34 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList38 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_setElementAt(intList34, intList38, (java.lang.Integer) 1, 1);
        fuzzTest29.FuzzTest_setElementAt(intList30, intList34, (java.lang.Integer) 10, (int) ' ');
        fuzzTest0.FuzzTest_setElementAt(intList20, intList30, (java.lang.Integer) 100, (int) (byte) 100);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 100, 1 };
        c2s_aug.Vector<java.lang.Integer> intList53 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList58 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList62 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest55.FuzzTest_setElementAt(intList58, intList62, (java.lang.Integer) 1, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList53, intList62, (java.lang.Integer) (-1), 1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList3 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_setElementAt(intList3, intList7, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList15 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList19 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_setElementAt(intList15, intList19, (java.lang.Integer) 1, 1);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList27 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_setElementAt(intList19, intList27, (java.lang.Integer) 1, (int) (byte) 100);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, (-1), 1, 0 };
        c2s_aug.Vector<java.lang.Integer> intList37 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList40 = null;
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList44 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList48 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_setElementAt(intList44, intList48, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList56 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList60 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_setElementAt(intList56, intList60, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList68 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList72 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_setElementAt(intList68, intList72, (java.lang.Integer) 1, 1);
        fuzzTest41.FuzzTest_setElementAt(intList60, intList72, (java.lang.Integer) 10, (int) '4');
        fuzzTest39.FuzzTest_setElementAt(intList40, intList72, (java.lang.Integer) 1, 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList37, intList72, (java.lang.Integer) 0, 0);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList4 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList8 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_setElementAt(intList4, intList8, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList16 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList20 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_setElementAt(intList16, intList20, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList28 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList32 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_setElementAt(intList28, intList32, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList40 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList44 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest37.FuzzTest_setElementAt(intList40, intList44, (java.lang.Integer) 1, 1);
        fuzzTest13.FuzzTest_setElementAt(intList32, intList44, (java.lang.Integer) 10, (int) '4');
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList55 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList59 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest52.FuzzTest_setElementAt(intList55, intList59, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList67 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList71 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest64.FuzzTest_setElementAt(intList67, intList71, (java.lang.Integer) 1, 1);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList79 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest52.FuzzTest_setElementAt(intList71, intList79, (java.lang.Integer) 1, (int) (byte) 100);
        fuzzTest1.FuzzTest_setElementAt(intList32, intList71, (java.lang.Integer) 0, (int) 'a');
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 1, 0, 10 };
        c2s_aug.Vector<java.lang.Integer> intList91 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList32, intList91, (java.lang.Integer) (-1), (int) (short) 0);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        c2s_aug.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 100, (int) ' ');
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { (-1), 10, 0 };
        c2s_aug.Vector<java.lang.Integer> intList10 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList15 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList19 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_setElementAt(intList15, intList19, (java.lang.Integer) 1, 1);
        c2s_aug.Vector<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList30 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList34 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_setElementAt(intList30, intList34, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList42 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList46 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest39.FuzzTest_setElementAt(intList42, intList46, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList54 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList58 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest51.FuzzTest_setElementAt(intList54, intList58, (java.lang.Integer) 1, 1);
        fuzzTest27.FuzzTest_setElementAt(intList46, intList58, (java.lang.Integer) 10, (int) '4');
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList69 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest26.FuzzTest_setElementAt(intList46, intList69, (java.lang.Integer) 100, (int) (byte) -1);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 0, (-1), 0, 0 };
        c2s_aug.Vector<java.lang.Integer> intList80 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest25.FuzzTest_setElementAt(intList69, intList80, (java.lang.Integer) 100, (int) (short) -1);
        fuzzTest12.FuzzTest_setElementAt(intList24, intList69, (java.lang.Integer) (-1), (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList10, intList69, (java.lang.Integer) 0, 1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList3 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_setElementAt(intList3, intList7, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList15 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList19 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_setElementAt(intList15, intList19, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList27 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList31 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_setElementAt(intList27, intList31, (java.lang.Integer) 1, 1);
        fuzzTest0.FuzzTest_setElementAt(intList19, intList31, (java.lang.Integer) 10, (int) '4');
        c2s_aug.Vector<java.lang.Integer> intList39 = null;
        c2s_aug.Vector<java.lang.Integer> intList40 = null;
        fuzzTest0.FuzzTest_setElementAt(intList39, intList40, (java.lang.Integer) (-1), (int) (short) 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList47 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList51 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_setElementAt(intList47, intList51, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList57 = null;
        c2s_aug.Vector<java.lang.Integer> intList58 = null;
        fuzzTest56.FuzzTest_setElementAt(intList57, intList58, (java.lang.Integer) 100, (int) ' ');
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 1, 10, 1 };
        c2s_aug.Vector<java.lang.Integer> intList67 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        c2s_aug.Vector<java.lang.Integer> intList69 = null;
        fuzzTest56.FuzzTest_setElementAt(intList67, intList69, (java.lang.Integer) 0, 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList51, intList67, (java.lang.Integer) 1, 0);
    }
}

