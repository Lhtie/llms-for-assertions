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
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_insertElementAt(intList4, intList8, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_insertElementAt(intList16, intList20, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_insertElementAt(intList28, intList32, (java.lang.Integer) 1, 1);
        fuzzTest1.FuzzTest_insertElementAt(intList20, intList32, (java.lang.Integer) 10, (int) '4');
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList20, intList43, (java.lang.Integer) 100, (int) (byte) -1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_insertElementAt(intList4, intList8, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_insertElementAt(intList16, intList20, (java.lang.Integer) 1, 1);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest1.FuzzTest_insertElementAt(intList20, intList28, (java.lang.Integer) 1, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_insertElementAt(intList38, intList42, (java.lang.Integer) 1, 1);
        fuzzTest33.FuzzTest_insertElementAt(intList34, intList38, (java.lang.Integer) 10, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList28, intList38, (java.lang.Integer) 0, (int) (short) -1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzzTest3.FuzzTest_insertElementAt(intList6, intList10, (java.lang.Integer) 1, 1);
        fuzzTest1.FuzzTest_insertElementAt(intList2, intList6, (java.lang.Integer) 10, (int) ' ');
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_insertElementAt(intList21, intList25, (java.lang.Integer) 1, 1);
        fuzzTest0.FuzzTest_insertElementAt(intList2, intList25, (java.lang.Integer) 0, (int) 'a');
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_insertElementAt(intList36, intList40, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = null;
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest47.FuzzTest_insertElementAt(intList50, intList54, (java.lang.Integer) 1, 1);
        fuzzTest45.FuzzTest_insertElementAt(intList46, intList50, (java.lang.Integer) 10, (int) ' ');
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest62.FuzzTest_insertElementAt(intList65, intList69, (java.lang.Integer) 1, 1);
        fuzzTest33.FuzzTest_insertElementAt(intList50, intList65, (java.lang.Integer) 0, 0);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList50, intList79, (java.lang.Integer) 1, (int) (short) -1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_insertElementAt(intList5, intList9, (java.lang.Integer) 1, 1);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList5, (java.lang.Integer) 10, (int) ' ');
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_insertElementAt(intList20, intList24, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_insertElementAt(intList34, intList38, (java.lang.Integer) 1, 1);
        fuzzTest29.FuzzTest_insertElementAt(intList30, intList34, (java.lang.Integer) 10, (int) ' ');
        fuzzTest0.FuzzTest_insertElementAt(intList20, intList30, (java.lang.Integer) 100, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_insertElementAt(intList52, intList56, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_insertElementAt(intList64, intList68, (java.lang.Integer) 1, 1);
        fuzzTest0.FuzzTest_insertElementAt(intList56, intList68, (java.lang.Integer) 100, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest76.FuzzTest_insertElementAt(intList79, intList83, (java.lang.Integer) 1, 1);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 1, 0, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList92 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList83, intList92, (java.lang.Integer) 0, (int) (byte) -1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_insertElementAt(intList5, intList9, (java.lang.Integer) 1, 1);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList5, (java.lang.Integer) 10, (int) ' ');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList17, intList18, (java.lang.Integer) 0, 0);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest22.FuzzTest_insertElementAt(intList25, intList29, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest34.FuzzTest_insertElementAt(intList37, intList41, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest46.FuzzTest_insertElementAt(intList49, intList53, (java.lang.Integer) 1, 1);
        fuzzTest22.FuzzTest_insertElementAt(intList41, intList53, (java.lang.Integer) 10, (int) '4');
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0, 1, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList53, intList65, (java.lang.Integer) 0, (int) (short) -1);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_insertElementAt(intList3, intList7, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_insertElementAt(intList15, intList19, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_insertElementAt(intList27, intList31, (java.lang.Integer) 1, 1);
        fuzzTest0.FuzzTest_insertElementAt(intList19, intList31, (java.lang.Integer) 10, (int) '4');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList39, intList40, (java.lang.Integer) 10, 1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_insertElementAt(intList47, intList51, (java.lang.Integer) 1, 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList51, intList56, (java.lang.Integer) 0, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest60.FuzzTest_insertElementAt(intList63, intList67, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest72.FuzzTest_insertElementAt(intList75, intList79, (java.lang.Integer) 1, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList63, intList79, (java.lang.Integer) 0, (int) (byte) -1);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest10.FuzzTest_insertElementAt(intList13, intList17, (java.lang.Integer) 1, 1);
        fuzzTest8.FuzzTest_insertElementAt(intList9, intList13, (java.lang.Integer) 10, (int) ' ');
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_insertElementAt(intList28, intList32, (java.lang.Integer) 1, 1);
        fuzzTest7.FuzzTest_insertElementAt(intList9, intList32, (java.lang.Integer) 0, (int) 'a');
        fuzzTest0.FuzzTest_insertElementAt(intList5, intList9, (java.lang.Integer) 0, 100);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest43.FuzzTest_insertElementAt(intList46, intList50, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest55.FuzzTest_insertElementAt(intList58, intList62, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest67.FuzzTest_insertElementAt(intList70, intList74, (java.lang.Integer) 1, 1);
        fuzzTest43.FuzzTest_insertElementAt(intList62, intList74, (java.lang.Integer) 10, (int) '4');
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList74, intList85, (java.lang.Integer) 10, (int) (short) -1);
    }
}

