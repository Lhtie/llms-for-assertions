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
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList3, intList7, (java.lang.Integer) 1, 1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        c2s_aug.Vector<java.lang.Integer> intList6 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList11 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        c2s_aug.Vector<java.lang.Integer> intList13 = null;
        fuzzTest8.FuzzTest_insertElementAt(intList11, intList13, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList20 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        c2s_aug.Vector<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_insertElementAt(intList20, intList22, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList29 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        c2s_aug.Vector<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_insertElementAt(intList29, intList31, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList38 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        c2s_aug.Vector<java.lang.Integer> intList40 = null;
        fuzzTest35.FuzzTest_insertElementAt(intList38, intList40, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest17.FuzzTest_insertElementAt(intList29, intList40, (java.lang.Integer) 1, 0);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList50 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest8.FuzzTest_insertElementAt(intList40, intList50, (java.lang.Integer) 1, (int) (byte) 100);
        fuzzTest0.FuzzTest_insertElementAt(intList6, intList40, (java.lang.Integer) (-1), 100);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList61 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        c2s_aug.Vector<java.lang.Integer> intList63 = null;
        fuzzTest58.FuzzTest_insertElementAt(intList61, intList63, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList70 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        c2s_aug.Vector<java.lang.Integer> intList72 = null;
        fuzzTest67.FuzzTest_insertElementAt(intList70, intList72, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList79 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        c2s_aug.Vector<java.lang.Integer> intList81 = null;
        fuzzTest76.FuzzTest_insertElementAt(intList79, intList81, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest58.FuzzTest_insertElementAt(intList70, intList81, (java.lang.Integer) 1, 0);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 0, (-1), 0 };
        c2s_aug.Vector<java.lang.Integer> intList92 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList70, intList92, (java.lang.Integer) (-1), (int) (short) 1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList3 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList3, intList5, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList10 = null;
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList14 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        c2s_aug.Vector<java.lang.Integer> intList16 = null;
        fuzzTest11.FuzzTest_insertElementAt(intList14, intList16, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest9.FuzzTest_insertElementAt(intList10, intList14, (java.lang.Integer) 1, (int) 'a');
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList26 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        c2s_aug.Vector<java.lang.Integer> intList28 = null;
        fuzzTest23.FuzzTest_insertElementAt(intList26, intList28, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList35 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        c2s_aug.Vector<java.lang.Integer> intList37 = null;
        fuzzTest32.FuzzTest_insertElementAt(intList35, intList37, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList44 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        c2s_aug.Vector<java.lang.Integer> intList46 = null;
        fuzzTest41.FuzzTest_insertElementAt(intList44, intList46, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList53 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        c2s_aug.Vector<java.lang.Integer> intList55 = null;
        fuzzTest50.FuzzTest_insertElementAt(intList53, intList55, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest32.FuzzTest_insertElementAt(intList44, intList55, (java.lang.Integer) 1, 0);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList65 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest23.FuzzTest_insertElementAt(intList55, intList65, (java.lang.Integer) 1, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList14, intList65, (java.lang.Integer) (-1), 0);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList3 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList3, intList5, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList10 = null;
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList14 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        c2s_aug.Vector<java.lang.Integer> intList16 = null;
        fuzzTest11.FuzzTest_insertElementAt(intList14, intList16, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest9.FuzzTest_insertElementAt(intList10, intList14, (java.lang.Integer) 1, (int) 'a');
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10, 10, 1, 100, 10 };
        c2s_aug.Vector<java.lang.Integer> intList30 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList33 = null;
        c2s_aug.Vector<java.lang.Integer> intList34 = null;
        fuzzTest32.FuzzTest_insertElementAt(intList33, intList34, (java.lang.Integer) 10, (-1));
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList41 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        c2s_aug.Vector<java.lang.Integer> intList43 = null;
        fuzzTest38.FuzzTest_insertElementAt(intList41, intList43, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList50 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        c2s_aug.Vector<java.lang.Integer> intList52 = null;
        fuzzTest47.FuzzTest_insertElementAt(intList50, intList52, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList59 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        c2s_aug.Vector<java.lang.Integer> intList61 = null;
        fuzzTest56.FuzzTest_insertElementAt(intList59, intList61, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList68 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        c2s_aug.Vector<java.lang.Integer> intList70 = null;
        fuzzTest65.FuzzTest_insertElementAt(intList68, intList70, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest47.FuzzTest_insertElementAt(intList59, intList70, (java.lang.Integer) 1, 0);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList80 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest38.FuzzTest_insertElementAt(intList70, intList80, (java.lang.Integer) 1, (int) (byte) 100);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { (-1), 10, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList89 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        fuzzTest32.FuzzTest_insertElementAt(intList80, intList89, (java.lang.Integer) 0, 10);
        fuzzTest23.FuzzTest_insertElementAt(intList30, intList89, (java.lang.Integer) (-1), (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList14, intList30, (java.lang.Integer) 0, (int) (short) 1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList3 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList3, intList5, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList10 = null;
        c2s_aug.Vector<java.lang.Integer> intList11 = null;
        fuzzTest9.FuzzTest_insertElementAt(intList10, intList11, (java.lang.Integer) 10, (-1));
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList16 = null;
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList20 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        c2s_aug.Vector<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_insertElementAt(intList20, intList22, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest15.FuzzTest_insertElementAt(intList16, intList20, (java.lang.Integer) 1, (int) 'a');
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList34 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        c2s_aug.Vector<java.lang.Integer> intList36 = null;
        fuzzTest31.FuzzTest_insertElementAt(intList34, intList36, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest29.FuzzTest_insertElementAt(intList30, intList34, (java.lang.Integer) 1, (int) 'a');
        c2s_aug.Vector<java.lang.Integer> intList43 = null;
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, 1, 10, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList49 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest29.FuzzTest_insertElementAt(intList43, intList49, (java.lang.Integer) 10, (int) (byte) 100);
        fuzzTest9.FuzzTest_insertElementAt(intList20, intList43, (java.lang.Integer) (-1), (int) 'a');
        c2s_aug.Vector<java.lang.Integer> intList57 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList20, intList57, (java.lang.Integer) 0, (int) (short) 1);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList63 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList66 = null;
        c2s_aug.Vector<java.lang.Integer> intList67 = null;
        fuzzTest65.FuzzTest_insertElementAt(intList66, intList67, (java.lang.Integer) 10, (-1));
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList72 = null;
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList76 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        c2s_aug.Vector<java.lang.Integer> intList78 = null;
        fuzzTest73.FuzzTest_insertElementAt(intList76, intList78, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest71.FuzzTest_insertElementAt(intList72, intList76, (java.lang.Integer) 1, (int) 'a');
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList87 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest65.FuzzTest_insertElementAt(intList76, intList87, (java.lang.Integer) 0, 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList63, intList76, (java.lang.Integer) 100, 1);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList2 = null;
        c2s_aug.Vector<java.lang.Integer> intList3 = null;
        fuzzTest1.FuzzTest_insertElementAt(intList2, intList3, (java.lang.Integer) 10, (-1));
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList10 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        c2s_aug.Vector<java.lang.Integer> intList12 = null;
        fuzzTest7.FuzzTest_insertElementAt(intList10, intList12, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList19 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        c2s_aug.Vector<java.lang.Integer> intList21 = null;
        fuzzTest16.FuzzTest_insertElementAt(intList19, intList21, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList28 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        c2s_aug.Vector<java.lang.Integer> intList30 = null;
        fuzzTest25.FuzzTest_insertElementAt(intList28, intList30, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList37 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        c2s_aug.Vector<java.lang.Integer> intList39 = null;
        fuzzTest34.FuzzTest_insertElementAt(intList37, intList39, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest16.FuzzTest_insertElementAt(intList28, intList39, (java.lang.Integer) 1, 0);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList49 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest7.FuzzTest_insertElementAt(intList39, intList49, (java.lang.Integer) 1, (int) (byte) 100);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 10, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList58 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest1.FuzzTest_insertElementAt(intList49, intList58, (java.lang.Integer) 0, 10);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList64 = null;
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList68 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        c2s_aug.Vector<java.lang.Integer> intList70 = null;
        fuzzTest65.FuzzTest_insertElementAt(intList68, intList70, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest63.FuzzTest_insertElementAt(intList64, intList68, (java.lang.Integer) 1, (int) 'a');
        c2s_aug.Vector<java.lang.Integer> intList77 = null;
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 1, 1, 10, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList83 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest63.FuzzTest_insertElementAt(intList77, intList83, (java.lang.Integer) 10, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList58, intList83, (java.lang.Integer) (-1), 0);
    }
}

