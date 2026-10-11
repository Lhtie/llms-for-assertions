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
        buggycodes.mut_000.Vector<java.lang.Integer> intList3 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList7 = new buggycodes.mut_000.Vector<java.lang.Integer>();
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
        buggycodes.mut_000.Vector<java.lang.Integer> intList6 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList11 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        buggycodes.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzzTest8.FuzzTest_insertElementAt(intList11, intList13, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggycodes.mut_000.Vector<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_insertElementAt(intList20, intList22, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        buggycodes.mut_000.Vector<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_insertElementAt(intList29, intList31, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList38 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        buggycodes.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest35.FuzzTest_insertElementAt(intList38, intList40, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest17.FuzzTest_insertElementAt(intList29, intList40, (java.lang.Integer) 1, 0);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_000.Vector<java.lang.Integer> intList50 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest8.FuzzTest_insertElementAt(intList40, intList50, (java.lang.Integer) 1, (int) (byte) 100);
        fuzzTest0.FuzzTest_insertElementAt(intList6, intList40, (java.lang.Integer) (-1), 100);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList61 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        buggycodes.mut_000.Vector<java.lang.Integer> intList63 = null;
        fuzzTest58.FuzzTest_insertElementAt(intList61, intList63, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList70 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        buggycodes.mut_000.Vector<java.lang.Integer> intList72 = null;
        fuzzTest67.FuzzTest_insertElementAt(intList70, intList72, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList79 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        buggycodes.mut_000.Vector<java.lang.Integer> intList81 = null;
        fuzzTest76.FuzzTest_insertElementAt(intList79, intList81, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest58.FuzzTest_insertElementAt(intList70, intList81, (java.lang.Integer) 1, 0);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 0, (-1), 0 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList92 = new buggycodes.mut_000.Vector<java.lang.Integer>();
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
        buggycodes.mut_000.Vector<java.lang.Integer> intList3 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_000.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList3, intList5, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList12 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_insertElementAt(intList12, intList14, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList21 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggycodes.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_insertElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest0.FuzzTest_insertElementAt(intList12, intList23, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList33 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = null;
        fuzzTest30.FuzzTest_insertElementAt(intList33, intList35, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList42 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        buggycodes.mut_000.Vector<java.lang.Integer> intList44 = null;
        fuzzTest39.FuzzTest_insertElementAt(intList42, intList44, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList51 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        buggycodes.mut_000.Vector<java.lang.Integer> intList53 = null;
        fuzzTest48.FuzzTest_insertElementAt(intList51, intList53, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest30.FuzzTest_insertElementAt(intList42, intList53, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList63 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        buggycodes.mut_000.Vector<java.lang.Integer> intList65 = null;
        fuzzTest60.FuzzTest_insertElementAt(intList63, intList65, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest0.FuzzTest_insertElementAt(intList53, intList63, (java.lang.Integer) 1, (int) (short) 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList72 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList73 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList72, intList73, (java.lang.Integer) (-1), (int) (short) 100);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList80 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        buggycodes.mut_000.Vector<java.lang.Integer> intList82 = null;
        fuzzTest77.FuzzTest_insertElementAt(intList80, intList82, (java.lang.Integer) (-1), (int) (byte) -1);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 100, 0 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList89 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList80, intList89, (java.lang.Integer) 1, 1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_000.Vector<java.lang.Integer> intList7 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList12 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_insertElementAt(intList12, intList14, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList21 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggycodes.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_insertElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList30 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        buggycodes.mut_000.Vector<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_insertElementAt(intList30, intList32, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest9.FuzzTest_insertElementAt(intList21, intList32, (java.lang.Integer) 1, 0);
        fuzzTest1.FuzzTest_insertElementAt(intList7, intList32, (java.lang.Integer) 100, (int) (short) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList44 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_000.Vector<java.lang.Integer> intList52 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList57 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        buggycodes.mut_000.Vector<java.lang.Integer> intList59 = null;
        fuzzTest54.FuzzTest_insertElementAt(intList57, intList59, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList66 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        buggycodes.mut_000.Vector<java.lang.Integer> intList68 = null;
        fuzzTest63.FuzzTest_insertElementAt(intList66, intList68, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList75 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        buggycodes.mut_000.Vector<java.lang.Integer> intList77 = null;
        fuzzTest72.FuzzTest_insertElementAt(intList75, intList77, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest54.FuzzTest_insertElementAt(intList66, intList77, (java.lang.Integer) 1, 0);
        fuzzTest46.FuzzTest_insertElementAt(intList52, intList77, (java.lang.Integer) 100, (int) (short) 100);
        fuzzTest1.FuzzTest_insertElementAt(intList44, intList52, (java.lang.Integer) 100, (int) (short) 100);
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 1, (-1), 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList94 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList94, intArray93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList44, intList94, (java.lang.Integer) (-1), 1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList2, (java.lang.Integer) 0, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList7 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest6.FuzzTest_insertElementAt(intList7, intList8, (java.lang.Integer) 10, (-1));
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList15 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        buggycodes.mut_000.Vector<java.lang.Integer> intList17 = null;
        fuzzTest12.FuzzTest_insertElementAt(intList15, intList17, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList24 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        buggycodes.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest21.FuzzTest_insertElementAt(intList24, intList26, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest6.FuzzTest_insertElementAt(intList15, intList24, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList34 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = null;
        fuzzTest33.FuzzTest_insertElementAt(intList34, intList35, (java.lang.Integer) 10, (-1));
        buggycodes.mut_000.Vector<java.lang.Integer> intList39 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest33.FuzzTest_insertElementAt(intList39, intList40, (java.lang.Integer) 10, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList47 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggycodes.mut_000.Vector<java.lang.Integer> intList49 = null;
        fuzzTest44.FuzzTest_insertElementAt(intList47, intList49, (java.lang.Integer) (-1), (int) (byte) -1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList53 = null;
        fuzzTest33.FuzzTest_insertElementAt(intList47, intList53, (java.lang.Integer) 100, 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList61 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        buggycodes.mut_000.Vector<java.lang.Integer> intList63 = null;
        fuzzTest58.FuzzTest_insertElementAt(intList61, intList63, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest33.FuzzTest_insertElementAt(intList57, intList61, (java.lang.Integer) 100, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList24, intList61, (java.lang.Integer) 10, 1);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList2, (java.lang.Integer) 10, (-1));
        buggycodes.mut_000.Vector<java.lang.Integer> intList6 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList7 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList6, intList7, (java.lang.Integer) 10, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        buggycodes.mut_000.Vector<java.lang.Integer> intList16 = null;
        fuzzTest11.FuzzTest_insertElementAt(intList14, intList16, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList23 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        buggycodes.mut_000.Vector<java.lang.Integer> intList25 = null;
        fuzzTest20.FuzzTest_insertElementAt(intList23, intList25, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList30 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList31 = null;
        fuzzTest29.FuzzTest_insertElementAt(intList30, intList31, (java.lang.Integer) 10, (-1));
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList38 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        buggycodes.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest35.FuzzTest_insertElementAt(intList38, intList40, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList47 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggycodes.mut_000.Vector<java.lang.Integer> intList49 = null;
        fuzzTest44.FuzzTest_insertElementAt(intList47, intList49, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest29.FuzzTest_insertElementAt(intList38, intList47, (java.lang.Integer) (-1), (int) (byte) -1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList56 = null;
        fuzzTest20.FuzzTest_insertElementAt(intList47, intList56, (java.lang.Integer) 0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList14, intList47, (java.lang.Integer) 1, 1);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList2, (java.lang.Integer) 10, (-1));
        buggycodes.mut_000.Vector<java.lang.Integer> intList6 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList7 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList6, intList7, (java.lang.Integer) 10, (int) (short) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList11 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList12 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList11, intList12, (java.lang.Integer) (-1), (int) (short) 1);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList19 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggycodes.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest16.FuzzTest_insertElementAt(intList19, intList21, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList26 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzzTest25.FuzzTest_insertElementAt(intList26, intList27, (java.lang.Integer) 10, (-1));
        buggycodes.mut_000.Vector<java.lang.Integer> intList31 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList32 = null;
        fuzzTest25.FuzzTest_insertElementAt(intList31, intList32, (java.lang.Integer) 10, (int) (short) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList38 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList39 = null;
        fuzzTest37.FuzzTest_insertElementAt(intList38, intList39, (java.lang.Integer) 10, (-1));
        buggycodes.mut_000.Vector<java.lang.Integer> intList43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList47 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggycodes.mut_000.Vector<java.lang.Integer> intList49 = null;
        fuzzTest44.FuzzTest_insertElementAt(intList47, intList49, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest37.FuzzTest_insertElementAt(intList43, intList49, (java.lang.Integer) 10, 10);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList57 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList58 = null;
        fuzzTest56.FuzzTest_insertElementAt(intList57, intList58, (java.lang.Integer) 10, (-1));
        buggycodes.mut_000.Vector<java.lang.Integer> intList62 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList63 = null;
        fuzzTest56.FuzzTest_insertElementAt(intList62, intList63, (java.lang.Integer) 10, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList70 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        buggycodes.mut_000.Vector<java.lang.Integer> intList72 = null;
        fuzzTest67.FuzzTest_insertElementAt(intList70, intList72, (java.lang.Integer) (-1), (int) (byte) -1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList76 = null;
        fuzzTest56.FuzzTest_insertElementAt(intList70, intList76, (java.lang.Integer) 100, 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList80 = null;
        fuzzTest37.FuzzTest_insertElementAt(intList70, intList80, (java.lang.Integer) 100, (int) (byte) 10);
        fuzzTest25.FuzzTest_insertElementAt(intList36, intList70, (java.lang.Integer) 0, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList19, intList70, (java.lang.Integer) 0, (int) (short) 1);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList2, (java.lang.Integer) 10, (-1));
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        buggycodes.mut_000.Vector<java.lang.Integer> intList11 = null;
        fuzzTest6.FuzzTest_insertElementAt(intList9, intList11, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList16 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList17 = null;
        fuzzTest15.FuzzTest_insertElementAt(intList16, intList17, (java.lang.Integer) 10, (-1));
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList24 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        buggycodes.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest21.FuzzTest_insertElementAt(intList24, intList26, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList33 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = null;
        fuzzTest30.FuzzTest_insertElementAt(intList33, intList35, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest15.FuzzTest_insertElementAt(intList24, intList33, (java.lang.Integer) (-1), (int) (byte) -1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList42 = null;
        fuzzTest6.FuzzTest_insertElementAt(intList33, intList42, (java.lang.Integer) 0, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList49 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        buggycodes.mut_000.Vector<java.lang.Integer> intList51 = null;
        fuzzTest46.FuzzTest_insertElementAt(intList49, intList51, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList58 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        buggycodes.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzzTest55.FuzzTest_insertElementAt(intList58, intList60, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList67 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        buggycodes.mut_000.Vector<java.lang.Integer> intList69 = null;
        fuzzTest64.FuzzTest_insertElementAt(intList67, intList69, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest46.FuzzTest_insertElementAt(intList58, intList69, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList77 = null;
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList81 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        buggycodes.mut_000.Vector<java.lang.Integer> intList83 = null;
        fuzzTest78.FuzzTest_insertElementAt(intList81, intList83, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest76.FuzzTest_insertElementAt(intList77, intList81, (java.lang.Integer) 1, (int) 'a');
        buggycodes.mut_000.Vector<java.lang.Integer> intList90 = null;
        fuzzTest46.FuzzTest_insertElementAt(intList81, intList90, (java.lang.Integer) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList33, intList81, (java.lang.Integer) 100, 1);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList3 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_000.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList3, intList5, (java.lang.Integer) (-1), (int) (byte) -1);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 100, 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList13 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        buggycodes.mut_000.Vector<java.lang.Integer> intList15 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList13, intList15, (java.lang.Integer) 10, 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest19.FuzzTest_insertElementAt(intList20, intList21, (java.lang.Integer) 10, (-1));
        buggycodes.mut_000.Vector<java.lang.Integer> intList25 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest19.FuzzTest_insertElementAt(intList25, intList26, (java.lang.Integer) 10, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList33 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = null;
        fuzzTest30.FuzzTest_insertElementAt(intList33, intList35, (java.lang.Integer) (-1), (int) (byte) -1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList39 = null;
        fuzzTest19.FuzzTest_insertElementAt(intList33, intList39, (java.lang.Integer) 100, 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList43 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList44 = null;
        fuzzTest19.FuzzTest_insertElementAt(intList43, intList44, (java.lang.Integer) 1, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList53 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        buggycodes.mut_000.Vector<java.lang.Integer> intList55 = null;
        fuzzTest50.FuzzTest_insertElementAt(intList53, intList55, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest48.FuzzTest_insertElementAt(intList49, intList53, (java.lang.Integer) 1, (int) 'a');
        buggycodes.mut_000.Vector<java.lang.Integer> intList62 = null;
        fuzzTest19.FuzzTest_insertElementAt(intList53, intList62, (java.lang.Integer) 100, (int) (short) 0);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 0, 1, (-1) };
        buggycodes.mut_000.Vector<java.lang.Integer> intList72 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList53, intList72, (java.lang.Integer) 1, 1);
    }
}

