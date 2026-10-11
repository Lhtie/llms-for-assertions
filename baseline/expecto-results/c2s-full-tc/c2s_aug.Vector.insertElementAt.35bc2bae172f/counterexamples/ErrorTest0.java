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
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList3 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_insertElementAt(intList3, intList7, (java.lang.Integer) 1, 1);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 0, 0 };
        c2s_aug.Vector<java.lang.Integer> intList16 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList23 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList27 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest20.FuzzTest_insertElementAt(intList23, intList27, (java.lang.Integer) 1, 1);
        fuzzTest18.FuzzTest_insertElementAt(intList19, intList23, (java.lang.Integer) 10, (int) ' ');
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList38 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList42 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_insertElementAt(intList38, intList42, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList52 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList56 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_insertElementAt(intList52, intList56, (java.lang.Integer) 1, 1);
        fuzzTest47.FuzzTest_insertElementAt(intList48, intList52, (java.lang.Integer) 10, (int) ' ');
        fuzzTest18.FuzzTest_insertElementAt(intList38, intList48, (java.lang.Integer) 100, (int) (byte) 100);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 100, 1 };
        c2s_aug.Vector<java.lang.Integer> intList71 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList76 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList80 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest73.FuzzTest_insertElementAt(intList76, intList80, (java.lang.Integer) 1, 1);
        fuzzTest18.FuzzTest_insertElementAt(intList71, intList80, (java.lang.Integer) (-1), 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList16, intList71, (java.lang.Integer) 1, (int) (byte) 0);
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
        fuzzTest0.FuzzTest_insertElementAt(intList3, intList7, (java.lang.Integer) 1, 1);
        c2s_aug.Vector<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList16 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList20 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_insertElementAt(intList16, intList20, (java.lang.Integer) 1, 1);
        fuzzTest0.FuzzTest_insertElementAt(intList12, intList20, (java.lang.Integer) 1, (int) 'a');
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10, 10, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList32 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1 };
        c2s_aug.Vector<java.lang.Integer> intList36 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest0.FuzzTest_insertElementAt(intList32, intList36, (java.lang.Integer) (-1), (int) (short) -1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList44 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList48 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_insertElementAt(intList44, intList48, (java.lang.Integer) 1, 1);
        c2s_aug.Vector<java.lang.Integer> intList53 = null;
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList57 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList61 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest54.FuzzTest_insertElementAt(intList57, intList61, (java.lang.Integer) 1, 1);
        fuzzTest41.FuzzTest_insertElementAt(intList53, intList61, (java.lang.Integer) 1, (int) 'a');
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList72 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList76 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest69.FuzzTest_insertElementAt(intList72, intList76, (java.lang.Integer) 1, 1);
        c2s_aug.Vector<java.lang.Integer> intList81 = null;
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList85 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList89 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        fuzzTest82.FuzzTest_insertElementAt(intList85, intList89, (java.lang.Integer) 1, 1);
        fuzzTest69.FuzzTest_insertElementAt(intList81, intList89, (java.lang.Integer) 1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList61, intList89, (java.lang.Integer) 10, (int) (byte) 0);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList5 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList9 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_insertElementAt(intList5, intList9, (java.lang.Integer) 1, 1);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList5, (java.lang.Integer) 10, (int) ' ');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList20 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList24 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_insertElementAt(intList20, intList24, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList34 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList38 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_insertElementAt(intList34, intList38, (java.lang.Integer) 1, 1);
        fuzzTest29.FuzzTest_insertElementAt(intList30, intList34, (java.lang.Integer) 10, (int) ' ');
        fuzzTest0.FuzzTest_insertElementAt(intList20, intList30, (java.lang.Integer) 100, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList52 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList56 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_insertElementAt(intList52, intList56, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList64 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList68 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_insertElementAt(intList64, intList68, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList76 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList80 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest73.FuzzTest_insertElementAt(intList76, intList80, (java.lang.Integer) 1, 1);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList88 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest61.FuzzTest_insertElementAt(intList80, intList88, (java.lang.Integer) 1, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList52, intList88, (java.lang.Integer) (-1), 1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList3 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_insertElementAt(intList3, intList7, (java.lang.Integer) 1, 1);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, 10, 1 };
        c2s_aug.Vector<java.lang.Integer> intList16 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList24 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList28 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest21.FuzzTest_insertElementAt(intList24, intList28, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList37 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList41 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest34.FuzzTest_insertElementAt(intList37, intList41, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList49 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList53 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest46.FuzzTest_insertElementAt(intList49, intList53, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList61 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList65 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_insertElementAt(intList61, intList65, (java.lang.Integer) 1, 1);
        fuzzTest34.FuzzTest_insertElementAt(intList53, intList65, (java.lang.Integer) 10, (int) '4');
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList76 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest33.FuzzTest_insertElementAt(intList53, intList76, (java.lang.Integer) 100, (int) (byte) -1);
        fuzzTest20.FuzzTest_insertElementAt(intList24, intList53, (java.lang.Integer) 1, 10);
        fuzzTest18.FuzzTest_insertElementAt(intList19, intList24, (java.lang.Integer) 0, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList16, intList24, (java.lang.Integer) 100, (int) (byte) 1);
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
        fuzzTest0.FuzzTest_insertElementAt(intList3, intList7, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList15 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList19 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_insertElementAt(intList15, intList19, (java.lang.Integer) 1, 1);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList27 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_insertElementAt(intList19, intList27, (java.lang.Integer) 1, (int) (byte) 100);
        c2s_aug.Vector<java.lang.Integer> intList32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList36 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList40 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_insertElementAt(intList36, intList40, (java.lang.Integer) 1, 1);
        fuzzTest0.FuzzTest_insertElementAt(intList32, intList36, (java.lang.Integer) 10, (int) (byte) 100);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10, 100, 0 };
        c2s_aug.Vector<java.lang.Integer> intList52 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList57 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList61 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest54.FuzzTest_insertElementAt(intList57, intList61, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList69 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList73 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest66.FuzzTest_insertElementAt(intList69, intList73, (java.lang.Integer) 1, 1);
        c2s_aug.Vector<java.lang.Integer> intList78 = null;
        fuzzTest54.FuzzTest_insertElementAt(intList69, intList78, (java.lang.Integer) 0, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList52, intList69, (java.lang.Integer) 100, (int) (short) 0);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        c2s_aug.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList2, (java.lang.Integer) 0, 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList9 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList13 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest6.FuzzTest_insertElementAt(intList9, intList13, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList22 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList26 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest19.FuzzTest_insertElementAt(intList22, intList26, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList35 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList39 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_insertElementAt(intList35, intList39, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList47 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList51 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_insertElementAt(intList47, intList51, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList59 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList63 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_insertElementAt(intList59, intList63, (java.lang.Integer) 1, 1);
        fuzzTest32.FuzzTest_insertElementAt(intList51, intList63, (java.lang.Integer) 10, (int) '4');
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList74 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest31.FuzzTest_insertElementAt(intList51, intList74, (java.lang.Integer) 100, (int) (byte) -1);
        fuzzTest18.FuzzTest_insertElementAt(intList22, intList51, (java.lang.Integer) 1, 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList9, intList51, (java.lang.Integer) 10, 0);
    }
}

